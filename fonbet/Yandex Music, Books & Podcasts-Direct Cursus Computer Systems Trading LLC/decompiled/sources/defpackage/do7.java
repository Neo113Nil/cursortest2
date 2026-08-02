package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class do7 implements heg {
    public final zi7 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final HashMap h;
    public long i;

    public do7(zi7 zi7Var, int i) {
        a(i, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(2000, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
        a(50000, i, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", CommonUrlParts.Values.FALSE_INTEGER);
        this.a = zi7Var;
        long j = 50000;
        this.b = dvt.Y(j);
        this.c = dvt.Y(j);
        this.d = dvt.Y(i);
        this.e = dvt.Y(2000);
        this.f = -1;
        this.g = dvt.Y(0);
        this.h = new HashMap();
        this.i = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        vq1.u(str + " cannot be less than " + str2, i >= i2);
    }

    @Override // defpackage.heg
    public final boolean b(ndl ndlVar) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.heg
    public final void c(geg gegVar, yvs yvsVar, zsb[] zsbVarArr) {
        co7 co7Var = (co7) this.h.get(gegVar.a);
        co7Var.getClass();
        int i = this.f;
        if (i == -1) {
            int length = zsbVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < length) {
                    zsb zsbVar = zsbVarArr[i2];
                    if (zsbVar != null) {
                        switch (zsbVar.n().c) {
                            case -2:
                                i4 = 0;
                                i3 += i4;
                                break;
                            case -1:
                            case 1:
                                i3 += i4;
                                break;
                            case 0:
                                i4 = 144310272;
                                i3 += i4;
                                break;
                            case 2:
                                i4 = 131072000;
                                i3 += i4;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                i3 += i4;
                                break;
                            default:
                                e7o.e();
                                return;
                        }
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        co7Var.b = i;
        boolean isEmpty = this.h.isEmpty();
        zi7 zi7Var = this.a;
        if (!isEmpty) {
            zi7Var.b(e());
            return;
        }
        synchronized (zi7Var) {
            if (zi7Var.a) {
                zi7Var.b(0);
            }
        }
    }

    @Override // defpackage.heg
    public final zi7 d() {
        return this.a;
    }

    public final int e() {
        Iterator it = this.h.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((co7) it.next()).b;
        }
        return i;
    }

    @Override // defpackage.heg
    public final boolean f(sis sisVar, uvh uvhVar, long j) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            if (((co7) it.next()).a) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.heg
    public final long g(ndl ndlVar) {
        return this.g;
    }

    @Override // defpackage.heg
    public final void h(ndl ndlVar) {
        if (this.h.remove(ndlVar) != null) {
            boolean isEmpty = this.h.isEmpty();
            zi7 zi7Var = this.a;
            if (isEmpty) {
                synchronized (zi7Var) {
                    if (zi7Var.a) {
                        zi7Var.b(0);
                    }
                }
            } else {
                zi7Var.b(e());
            }
        }
        if (this.h.isEmpty()) {
            this.i = -1L;
        }
    }

    @Override // defpackage.heg
    public final void i(ndl ndlVar) {
        if (this.h.remove(ndlVar) != null) {
            boolean isEmpty = this.h.isEmpty();
            zi7 zi7Var = this.a;
            if (!isEmpty) {
                zi7Var.b(e());
                return;
            }
            synchronized (zi7Var) {
                if (zi7Var.a) {
                    zi7Var.b(0);
                }
            }
        }
    }

    @Override // defpackage.heg
    public final void j(ndl ndlVar) {
        long id = Thread.currentThread().getId();
        long j = this.i;
        vq1.z("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.i = id;
        HashMap hashMap = this.h;
        if (!hashMap.containsKey(ndlVar)) {
            hashMap.put(ndlVar, new co7());
        }
        co7 co7Var = (co7) hashMap.get(ndlVar);
        co7Var.getClass();
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        co7Var.b = i;
        co7Var.a = false;
    }

    @Override // defpackage.heg
    public final boolean k(geg gegVar) {
        co7 co7Var = (co7) this.h.get(gegVar.a);
        co7Var.getClass();
        boolean z = this.a.a() >= e();
        float f = gegVar.d;
        long j = this.c;
        long j2 = this.b;
        if (f > 1.0f) {
            j2 = Math.min(dvt.G(f, j2), j);
        }
        long max = Math.max(j2, 500000L);
        long j3 = gegVar.c;
        if (j3 < max) {
            co7Var.a = !z;
            if (z && j3 < 500000) {
                vq1.n0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= j || z) {
            co7Var.a = false;
        }
        return co7Var.a;
    }

    @Override // defpackage.heg
    public final boolean l(geg gegVar) {
        long K = dvt.K(gegVar.d, gegVar.c);
        long j = gegVar.e ? this.e : this.d;
        long j2 = gegVar.f;
        if (j2 != -9223372036854775807L) {
            j = Math.min(j2 / 2, j);
        }
        return j <= 0 || K >= j || this.a.a() >= e();
    }
}
