package defpackage;

/* loaded from: classes4.dex */
public final class emw extends p6g {
    public final boolean a;

    public emw(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emw) && this.a == ((emw) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("StartOnPause(continuation=", ")", this.a);
    }

    @Override // defpackage.p6g
    public final boolean v() {
        return this.a;
    }
}
