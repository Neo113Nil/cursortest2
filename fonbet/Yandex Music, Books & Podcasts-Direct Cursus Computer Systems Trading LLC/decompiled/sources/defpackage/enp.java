package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class enp {
    public final mch a;

    public enp(mch mchVar) {
        mchVar.getClass();
        this.a = mchVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enp) && Intrinsics.d(this.a, ((enp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionVolumeController(volumeProvider=" + this.a + ")";
    }
}
