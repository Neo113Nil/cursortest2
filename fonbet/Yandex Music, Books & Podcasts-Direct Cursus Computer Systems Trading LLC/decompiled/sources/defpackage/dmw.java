package defpackage;

/* loaded from: classes4.dex */
public final class dmw extends p6g {
    public final boolean a;

    public dmw(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmw) && this.a == ((dmw) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("StartAndPlay(continuation=", ")", this.a);
    }

    @Override // defpackage.p6g
    public final boolean v() {
        return this.a;
    }
}
