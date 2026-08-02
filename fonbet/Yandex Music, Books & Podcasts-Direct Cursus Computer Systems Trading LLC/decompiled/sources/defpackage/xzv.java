package defpackage;

/* loaded from: classes4.dex */
public final class xzv implements zzv {
    public final boolean a;

    public xzv(boolean z) {
        this.a = z;
    }

    @Override // defpackage.zzv
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzv) && this.a == ((xzv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Idle(isMuted=", ")", this.a);
    }
}
