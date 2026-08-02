package defpackage;

/* loaded from: classes3.dex */
public final class dti implements eti {
    public final kbj a;
    public final oq b;

    public dti(oq oqVar, kbj kbjVar) {
        this.a = kbjVar;
        this.b = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dti)) {
            return false;
        }
        dti dtiVar = (dti) obj;
        return this.a.equals(dtiVar.a) && this.b.equals(dtiVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleBook(uiData=" + this.a + ", album=" + this.b + ")";
    }
}
