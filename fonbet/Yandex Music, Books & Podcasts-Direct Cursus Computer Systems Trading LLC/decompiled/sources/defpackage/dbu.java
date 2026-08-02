package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes.dex */
public final class dbu {
    public final at2 a;
    public final gbu b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public dzr l = dzr.a;

    /* JADX WARN: Multi-variable type inference failed */
    public dbu(Context context, cbu cbuVar, long j) {
        this.a = (at2) cbuVar;
        this.c = j;
        this.b = new gbu(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x014a, code lost:
    
        if (r26.a.b(r2, r4) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0155, code lost:
    
        if (r29 >= r33) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x007c, code lost:
    
        if ((r9 == 0 ? false : r7.g[(int) ((r9 - 1) % 15)]) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Type inference failed for: r1v15, types: [at2, cbu] */
    /* JADX WARN: Type inference failed for: r1v26, types: [at2, cbu] */
    /* JADX WARN: Type inference failed for: r1v28, types: [at2, cbu] */
    /* JADX WARN: Type inference failed for: r1v37, types: [at2, cbu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, mgr mgrVar) {
        long j5;
        long j6;
        long j7;
        boolean z3;
        int i;
        int i2;
        int i3;
        long j8;
        long j9;
        mgrVar.a = -9223372036854775807L;
        mgrVar.b = -9223372036854775807L;
        if (this.f == -9223372036854775807L) {
            this.f = j2;
        }
        if (this.h != j) {
            gbu gbuVar = this.b;
            j5 = -9223372036854775807L;
            long j10 = gbuVar.n;
            if (j10 != -1) {
                gbuVar.p = j10;
                gbuVar.q = gbuVar.o;
            }
            gbuVar.m++;
            mj3 mj3Var = gbuVar.a;
            j6 = -1;
            long j11 = j * 1000;
            ((vfc) mj3Var.d).b(j11);
            if (((vfc) mj3Var.d).a()) {
                mj3Var.a = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (mj3Var.b != -9223372036854775807L) {
                    if (mj3Var.a) {
                        vfc vfcVar = (vfc) mj3Var.e;
                        long j12 = vfcVar.d;
                    }
                    ((vfc) mj3Var.e).c();
                    ((vfc) mj3Var.e).b(mj3Var.b);
                    mj3Var.a = true;
                    ((vfc) mj3Var.e).b(j11);
                }
            }
            if (mj3Var.a && ((vfc) mj3Var.e).a()) {
                vfc vfcVar2 = (vfc) mj3Var.d;
                mj3Var.d = (vfc) mj3Var.e;
                mj3Var.e = vfcVar2;
                mj3Var.a = false;
            }
            mj3Var.b = j11;
            mj3Var.c = ((vfc) mj3Var.d).a() ? 0 : mj3Var.c + 1;
            gbuVar.c();
            this.h = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = -1;
            j7 = 0;
        }
        long j13 = (long) ((j - j2) / this.k);
        if (this.d) {
            this.l.getClass();
            j13 -= dvt.Y(SystemClock.elapsedRealtime()) - j3;
        }
        long j14 = j13;
        mgrVar.a = j14;
        if (!z || z2) {
            if (this.m) {
                if (this.i == j5 || this.j) {
                    int i4 = this.e;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    e7o.n();
                                    return 0;
                                }
                                this.l.getClass();
                                long Y = dvt.Y(SystemClock.elapsedRealtime()) - this.g;
                                if (this.d) {
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        z3 = this.d;
                    }
                    if (!z3) {
                        return 0;
                    }
                    if (!this.d || j2 == this.f) {
                        return 5;
                    }
                    this.l.getClass();
                    long nanoTime = System.nanoTime();
                    gbu gbuVar2 = this.b;
                    long j15 = (mgrVar.a * 1000) + nanoTime;
                    if (gbuVar2.p == j6 || !((vfc) gbuVar2.a.d).a()) {
                        i = 3;
                        i2 = 2;
                        i3 = 1;
                    } else {
                        mj3 mj3Var2 = gbuVar2.a;
                        if (((vfc) mj3Var2.d).a()) {
                            vfc vfcVar3 = (vfc) mj3Var2.d;
                            long j16 = vfcVar3.e;
                            j9 = j16 == j7 ? j7 : vfcVar3.f / j16;
                        } else {
                            j9 = j5;
                        }
                        i = 3;
                        i2 = 2;
                        i3 = 1;
                        long j17 = gbuVar2.q + ((long) (((gbuVar2.m - gbuVar2.p) * j9) / gbuVar2.i));
                        if (Math.abs(j15 - j17) <= 20000000) {
                            j15 = j17;
                        } else {
                            gbuVar2.m = j7;
                            long j18 = j6;
                            gbuVar2.p = j18;
                            gbuVar2.n = j18;
                        }
                    }
                    gbuVar2.n = gbuVar2.m;
                    gbuVar2.o = j15;
                    fbu fbuVar = gbuVar2.c;
                    if (fbuVar != null && gbuVar2.k != j5) {
                        long j19 = fbuVar.a;
                        if (j19 != j5) {
                            long j20 = gbuVar2.k;
                            long j21 = (((j15 - j19) / j20) * j20) + j19;
                            if (j15 <= j21) {
                                j8 = j21 - j20;
                            } else {
                                j8 = j21;
                                j21 = j20 + j21;
                            }
                            if (j21 - j15 >= j15 - j8) {
                                j21 = j8;
                            }
                            j15 = j21 - gbuVar2.l;
                        }
                    }
                    mgrVar.b = j15;
                    long j22 = (j15 - nanoTime) / 1000;
                    mgrVar.a = j22;
                    boolean z4 = (this.i == j5 || this.j) ? 0 : i3;
                    if (this.a.c(j22, j2, z2, z4)) {
                        return 4;
                    }
                    if (this.a.d(mgrVar.a, z2)) {
                        return z4 != 0 ? i : i2;
                    }
                    if (mgrVar.a > 50000) {
                        return 5;
                    }
                    return i3;
                }
                z3 = false;
                if (!z3) {
                }
            } else {
                this.n = true;
                if (this.a.c(j14, j2, z2, true)) {
                    return 4;
                }
                if (!this.d || mgrVar.a >= 30000) {
                    return 5;
                }
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long j;
        this.j = z;
        long j2 = this.c;
        if (j2 > 0) {
            this.l.getClass();
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.i = j;
    }

    public final void d(int i) {
        this.e = Math.min(this.e, i);
    }

    public final boolean e() {
        boolean z = this.e != 3;
        this.e = 3;
        this.l.getClass();
        this.g = dvt.Y(SystemClock.elapsedRealtime());
        return z;
    }

    public final void f() {
        this.d = true;
        this.l.getClass();
        this.g = dvt.Y(SystemClock.elapsedRealtime());
        gbu gbuVar = this.b;
        gbuVar.d = true;
        gbuVar.m = 0L;
        gbuVar.p = -1L;
        gbuVar.n = -1L;
        ebu ebuVar = gbuVar.b;
        if (ebuVar != null) {
            DisplayManager displayManager = ebuVar.a;
            fbu fbuVar = gbuVar.c;
            fbuVar.getClass();
            fbuVar.b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(ebuVar, dvt.p(null));
            gbu.a(ebuVar.b, displayManager.getDisplay(0));
        }
        gbuVar.d(false);
    }

    public final void g() {
        this.d = false;
        this.i = -9223372036854775807L;
        gbu gbuVar = this.b;
        gbuVar.d = false;
        ebu ebuVar = gbuVar.b;
        if (ebuVar != null) {
            ebuVar.a.unregisterDisplayListener(ebuVar);
            fbu fbuVar = gbuVar.c;
            fbuVar.getClass();
            fbuVar.b.sendEmptyMessage(3);
        }
        gbuVar.b();
    }

    public final void h() {
        gbu gbuVar = this.b;
        gbuVar.m = 0L;
        gbuVar.p = -1L;
        gbuVar.n = -1L;
        this.h = -9223372036854775807L;
        this.f = -9223372036854775807L;
        d(1);
        this.i = -9223372036854775807L;
    }

    public final void i(float f) {
        gbu gbuVar = this.b;
        gbuVar.f = f;
        mj3 mj3Var = gbuVar.a;
        ((vfc) mj3Var.d).c();
        ((vfc) mj3Var.e).c();
        mj3Var.a = false;
        mj3Var.b = -9223372036854775807L;
        mj3Var.c = 0;
        gbuVar.c();
    }

    public final void j(Surface surface) {
        this.m = surface != null;
        this.n = false;
        gbu gbuVar = this.b;
        if (gbuVar.e != surface) {
            gbuVar.b();
            gbuVar.e = surface;
            gbuVar.d(true);
        }
        d(1);
    }

    public final void k(float f) {
        vq1.v(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        gbu gbuVar = this.b;
        gbuVar.i = f;
        gbuVar.m = 0L;
        gbuVar.p = -1L;
        gbuVar.n = -1L;
        gbuVar.d(false);
    }
}
