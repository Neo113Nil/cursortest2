package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class c2s {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public c2s(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = StringsKt.M(upperCase, "INT", false) ? 3 : (StringsKt.M(upperCase, "CHAR", false) || StringsKt.M(upperCase, "CLOB", false) || StringsKt.M(upperCase, "TEXT", false)) ? 2 : StringsKt.M(upperCase, "BLOB", false) ? 5 : (StringsKt.M(upperCase, "REAL", false) || StringsKt.M(upperCase, "FLOA", false) || StringsKt.M(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c2s) {
                boolean z = this.d > 0;
                c2s c2sVar = (c2s) obj;
                int i = c2sVar.f;
                if (z == (c2sVar.d > 0) && Intrinsics.d(this.a, c2sVar.a) && this.c == c2sVar.c) {
                    String str = c2sVar.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || gdg.t(str2, str)) && ((i2 != 2 || i != 1 || str == null || gdg.t(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : gdg.t(str2, str))) && this.g == c2sVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = StringUtils.UNDEFINED;
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return hlr.c(hlr.e(sb.toString()), "    ");
    }
}
