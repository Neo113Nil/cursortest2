package com.gamericefishpro.space.y5;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public f(String name, String type, boolean z, int i, String str, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = name;
        this.b = type;
        this.c = z;
        this.d = i;
        this.e = str;
        this.f = i2;
        int i3 = 5;
        if (type != null) {
            String upperCase = type.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (StringsKt.r(upperCase, "INT")) {
                i3 = 3;
            } else if (StringsKt.r(upperCase, "CHAR") || StringsKt.r(upperCase, "CLOB") || StringsKt.r(upperCase, "TEXT")) {
                i3 = 2;
            } else if (!StringsKt.r(upperCase, "BLOB")) {
                i3 = (StringsKt.r(upperCase, "REAL") || StringsKt.r(upperCase, "FLOA") || StringsKt.r(upperCase, "DOUB")) ? 4 : 1;
            }
        }
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (this != obj) {
            if (obj instanceof f) {
                boolean z = this.d > 0;
                f fVar = (f) obj;
                int i = fVar.f;
                if (z == (fVar.d > 0) && Intrinsics.a(this.a, fVar.a) && this.c == fVar.c) {
                    String str = fVar.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || com.gamericefishpro.space.u6.f.p(str2, str)) && ((i2 != 2 || i != 1 || str == null || com.gamericefishpro.space.u6.f.p(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : com.gamericefishpro.space.u6.f.p(str2, str))) && this.g == fVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
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
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return com.gamericefishpro.space.mi.h.b(com.gamericefishpro.space.mi.h.d(sb.toString()));
    }
}
