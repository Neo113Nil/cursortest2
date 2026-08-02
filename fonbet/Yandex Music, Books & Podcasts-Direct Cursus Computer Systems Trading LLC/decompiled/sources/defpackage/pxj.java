package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class pxj {
    public final int b;
    public int c;
    public int d;
    public final koj e;
    public final /* synthetic */ anx g;
    public final hi3 a = new hi3();
    public boolean f = false;

    public pxj(anx anxVar, int i, int i2, koj kojVar) {
        this.g = anxVar;
        this.b = i;
        this.c = i2;
        this.e = kojVar;
    }

    public final int a(int i) {
        if (i > 0 && Integer.MAX_VALUE - i < this.c) {
            kac.c(this.b, "Window size overflow for stream: ");
            return 0;
        }
        int i2 = this.c + i;
        this.c = i2;
        return i2;
    }

    public final void b(int i, hi3 hi3Var, boolean z) {
        boolean i2;
        do {
            int min = Math.min(i, ((ynb) this.g.c).b.a.d);
            int i3 = -min;
            ((pxj) this.g.d).a(i3);
            a(i3);
            try {
                boolean z2 = false;
                ((ynb) this.g.c).a(hi3Var.b == ((long) min) && z, this.b, hi3Var, min);
                koj kojVar = this.e;
                synchronized (kojVar.b) {
                    o2g.U("onStreamAllocated was not called, but it seems the stream is active", kojVar.f);
                    int i4 = kojVar.e;
                    boolean z3 = i4 < 32768;
                    int i5 = i4 - min;
                    kojVar.e = i5;
                    boolean z4 = i5 < 32768;
                    if (!z3 && z4) {
                        z2 = true;
                    }
                }
                if (z2) {
                    synchronized (kojVar.b) {
                        i2 = kojVar.i();
                    }
                    if (i2) {
                        kojVar.j.onReady();
                    }
                }
                i -= min;
            } catch (IOException e) {
                b6e.q(e);
                return;
            }
        } while (i > 0);
    }

    public final void c(int i, jsg jsgVar) {
        int i2 = this.c;
        anx anxVar = this.g;
        int min = Math.min(i, Math.min(i2, ((pxj) anxVar.d).c));
        int i3 = 0;
        while (true) {
            hi3 hi3Var = this.a;
            long j = hi3Var.b;
            if (j <= 0 || min <= 0) {
                return;
            }
            if (min >= j) {
                int i4 = (int) j;
                i3 += i4;
                b(i4, hi3Var, this.f);
            } else {
                i3 += min;
                b(min, hi3Var, false);
            }
            jsgVar.b++;
            min = Math.min(i - i3, Math.min(this.c, ((pxj) anxVar.d).c));
        }
    }
}
