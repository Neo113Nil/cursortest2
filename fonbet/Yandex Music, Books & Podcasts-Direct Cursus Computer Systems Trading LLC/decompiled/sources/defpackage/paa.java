package defpackage;

/* loaded from: classes3.dex */
public final class paa {
    public final oaa a;
    public final boolean b;

    public paa(oaa oaaVar, boolean z) {
        this.a = oaaVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paa)) {
            return false;
        }
        paa paaVar = (paa) obj;
        return this.a == paaVar.a && this.b == paaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DownloadEvent(type=" + this.a + ", kids=" + this.b + ")";
    }
}
