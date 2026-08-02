package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d5d {
    public final String a;
    public final String b;

    public d5d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return ouj.o(this.a, StringUtils.PROCESS_POSTFIX_DELIMITER, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5d)) {
            return false;
        }
        d5d d5dVar = (d5d) obj;
        return Intrinsics.d(this.a, d5dVar.a) && Intrinsics.d(this.b, d5dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("GenerativeStationId(id=", this.a, ", tag=", this.b, ")");
    }
}
