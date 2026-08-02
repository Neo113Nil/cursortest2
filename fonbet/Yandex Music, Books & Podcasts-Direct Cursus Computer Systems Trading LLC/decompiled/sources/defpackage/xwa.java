package defpackage;

/* loaded from: classes3.dex */
public final class xwa {
    public final swa a;
    public final rva b;
    public final lwa c;
    public final ift d;

    public xwa(swa swaVar, rva rvaVar, lwa lwaVar, ift iftVar) {
        this.a = swaVar;
        this.b = rvaVar;
        this.c = lwaVar;
        this.d = iftVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwa)) {
            return false;
        }
        xwa xwaVar = (xwa) obj;
        return this.a.equals(xwaVar.a) && this.b.equals(xwaVar.b) && this.c.equals(xwaVar.c) && this.d.equals(xwaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DynamicOverlayUiConfig(typography=" + this.a + ", icons=" + this.b + ", strings=" + this.c + ", advBanner=" + this.d + ")";
    }
}
