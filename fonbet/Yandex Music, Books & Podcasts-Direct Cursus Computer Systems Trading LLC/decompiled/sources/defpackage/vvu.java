package defpackage;

/* loaded from: classes4.dex */
public final class vvu {
    public final xsu a;
    public final boolean b;
    public final nyn c;
    public final e5q d;

    public vvu(xsu xsuVar, boolean z, nyn nynVar, e5q e5qVar) {
        nynVar.getClass();
        this.a = xsuVar;
        this.b = z;
        this.c = nynVar;
        this.d = e5qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvu)) {
            return false;
        }
        vvu vvuVar = (vvu) obj;
        return this.a.equals(vvuVar.a) && this.b == vvuVar.b && this.c == vvuVar.c && this.d.equals(vvuVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "WaveQueueStartRequest(initialPlayablesInfo=" + this.a + ", interactive=" + this.b + ", repeatModeType=" + this.c + ", entity=" + this.d + ")";
    }
}
