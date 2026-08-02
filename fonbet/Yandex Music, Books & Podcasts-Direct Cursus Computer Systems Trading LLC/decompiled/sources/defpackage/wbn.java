package defpackage;

/* loaded from: classes4.dex */
public final class wbn {
    public final mwk a;
    public final mqs b;
    public final Object c = btf.a(bwf.c, new b6n(9, this));

    public wbn(mwk mwkVar, mqs mqsVar) {
        this.a = mwkVar;
        this.b = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbn)) {
            return false;
        }
        wbn wbnVar = (wbn) obj;
        return this.a.equals(wbnVar.a) && this.b.equals(wbnVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QueueSlidingWindowTrackEntry(playable=" + this.a + ", track=" + this.b + ")";
    }
}
