package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vpu implements bqu {
    public final dou a;

    public vpu(dou douVar) {
        douVar.getClass();
        this.a = douVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpu) && Intrinsics.d(this.a, ((vpu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AlreadyExist(waveDomainItem=" + this.a + ")";
    }
}
