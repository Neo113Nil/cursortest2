package defpackage;

/* loaded from: classes4.dex */
public final class u5j {
    public final f2v a;
    public final boolean b;

    public u5j(f2v f2vVar, boolean z) {
        this.a = f2vVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5j)) {
            return false;
        }
        u5j u5jVar = (u5j) obj;
        return this.a.equals(u5jVar.a) && this.b == u5jVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NewWheelPlayableSourceState(playableSource=" + this.a + ", canLoadWheelOnThisPlayable=" + this.b + ")";
    }
}
