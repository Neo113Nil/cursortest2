package defpackage;

/* loaded from: classes3.dex */
public final class pzo {
    public final po6 a;
    public final boolean b;

    public pzo(po6 po6Var, boolean z) {
        this.a = po6Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzo)) {
            return false;
        }
        pzo pzoVar = (pzo) obj;
        return this.a.equals(pzoVar.a) && this.b == pzoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchCellTrackUiData(uiData=" + this.a + ", hasTrailer=" + this.b + ")";
    }
}
