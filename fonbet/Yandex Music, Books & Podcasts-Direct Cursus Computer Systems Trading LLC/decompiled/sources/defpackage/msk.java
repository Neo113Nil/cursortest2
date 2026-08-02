package defpackage;

/* loaded from: classes.dex */
public final class msk implements vzj {
    public final lfh a;
    public final twg b;

    public msk(lfh lfhVar, twg twgVar) {
        this.a = lfhVar;
        this.b = twgVar;
    }

    @Override // defpackage.vzj
    public final boolean U() {
        return this.b.H0().d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msk)) {
            return false;
        }
        msk mskVar = (msk) obj;
        return this.a.equals(mskVar.a) && this.b.equals(mskVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.a + ", placeable=" + this.b + ')';
    }
}
