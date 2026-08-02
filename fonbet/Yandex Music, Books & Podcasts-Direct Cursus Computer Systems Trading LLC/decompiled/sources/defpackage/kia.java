package defpackage;

/* loaded from: classes3.dex */
public final class kia {
    public final iia a;
    public final iia b;
    public final iia c;
    public final iia d;
    public final iia e;
    public final iia f;

    public kia(iia iiaVar, iia iiaVar2, iia iiaVar3, iia iiaVar4, iia iiaVar5, iia iiaVar6) {
        this.a = iiaVar;
        this.b = iiaVar2;
        this.c = iiaVar3;
        this.d = iiaVar4;
        this.e = iiaVar5;
        this.f = iiaVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kia)) {
            return false;
        }
        kia kiaVar = (kia) obj;
        return this.a.equals(kiaVar.a) && this.b.equals(kiaVar.b) && this.c.equals(kiaVar.c) && this.d.equals(kiaVar.d) && this.e.equals(kiaVar.e) && this.f.equals(kiaVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DownloadedSectionsBlockDataTotalMetrics(music=" + this.a + ", playlist=" + this.b + ", album=" + this.c + ", book=" + this.d + ", podcast=" + this.e + ", kids=" + this.f + ")";
    }
}
