package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kgw extends mgw {
    public final long c;
    public final List d;
    public final long e;

    public kgw(long j, long j2, List list) {
        this.c = j;
        this.d = list;
        this.e = j2;
    }

    @Override // defpackage.o5g
    public final List B() {
        return this.d;
    }

    @Override // defpackage.mgw
    public final long T() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgw)) {
            return false;
        }
        kgw kgwVar = (kgw) obj;
        return this.c == kgwVar.c && Intrinsics.d(this.d, kgwVar.d) && this.e == kgwVar.e;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        List list = this.d;
        return Long.hashCode(this.e) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "GoAway(errorCode=" + this.c + ", backoffTimeouts=" + this.d + ", timeoutSeconds=" + this.e + ")";
    }
}
