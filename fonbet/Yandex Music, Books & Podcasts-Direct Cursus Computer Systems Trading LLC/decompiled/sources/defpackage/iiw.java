package defpackage;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class iiw implements kiw {
    public final String a;
    public final String b;
    public final String c;

    public iiw(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str;
    }

    public final String a() {
        String str = this.b;
        String str2 = this.a;
        return str == null ? str2 : !TextUtils.isDigitsOnly(str2) ? str2 : ouj.o(str2, StringUtils.PROCESS_POSTFIX_DELIMITER, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!iiw.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.d(a(), ((iiw) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return hrg.q("Id(", a(), ")");
    }
}
