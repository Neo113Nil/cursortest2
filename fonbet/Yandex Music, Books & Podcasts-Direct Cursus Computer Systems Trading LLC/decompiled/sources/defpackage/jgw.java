package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jgw extends mgw {
    public final long c;
    public final List d;

    public jgw(List list, long j) {
        this.c = j;
        this.d = list;
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
        if (!(obj instanceof jgw)) {
            return false;
        }
        jgw jgwVar = (jgw) obj;
        return this.c == jgwVar.c && Intrinsics.d(this.d, jgwVar.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        List list = this.d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Basic(errorCode=" + this.c + ", backoffTimeouts=" + this.d + ")";
    }
}
