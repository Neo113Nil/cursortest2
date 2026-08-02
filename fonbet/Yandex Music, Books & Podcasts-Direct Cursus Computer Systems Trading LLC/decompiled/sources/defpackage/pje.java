package defpackage;

/* loaded from: classes3.dex */
public final class pje {
    public final int a;
    public final wdp b;
    public final wdp c;
    public final wdp d;
    public final kje e;

    public pje(int i, wdp wdpVar, wdp wdpVar2, wdp wdpVar3, kje kjeVar) {
        this.a = i;
        this.b = wdpVar;
        this.c = wdpVar2;
        this.d = wdpVar3;
        this.e = kjeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pje)) {
            return false;
        }
        pje pjeVar = (pje) obj;
        return this.a == pjeVar.a && this.b.equals(pjeVar.b) && this.c.equals(pjeVar.c) && this.d.equals(pjeVar.d) && this.e.equals(pjeVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (ouj.D(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Style(animation=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "SLIDER" : "WORM" : "SCALE");
        sb.append(", activeShape=");
        sb.append(this.b);
        sb.append(", inactiveShape=");
        sb.append(this.c);
        sb.append(", minimumShape=");
        sb.append(this.d);
        sb.append(", itemsPlacement=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
