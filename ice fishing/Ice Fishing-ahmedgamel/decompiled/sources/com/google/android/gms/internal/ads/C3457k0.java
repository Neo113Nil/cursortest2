package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3457k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Z f32138a;

    /* renamed from: b, reason: collision with root package name */
    public final C3727p0 f32139b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32140c;

    /* renamed from: f, reason: collision with root package name */
    public long f32143f;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32146j;

    /* renamed from: d, reason: collision with root package name */
    public int f32141d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f32142e = com.anythink.basead.exoplayer.b.f7168b;

    /* renamed from: g, reason: collision with root package name */
    public float f32144g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public V2 f32145h = V2.f28873y;

    public C3457k0(Context context, Z z6) {
        this.f32138a = z6;
        this.f32139b = new C3727p0(context);
    }

    public final void a(int i) {
        if (i == 0) {
            this.f32141d = 1;
        } else if (i != 1) {
            this.f32141d = Math.min(this.f32141d, 2);
        } else {
            this.f32141d = 0;
        }
        this.f32139b.a();
    }

    public final void b() {
        this.f32140c = true;
        this.f32145h.getClass();
        this.f32143f = AbstractC3182eu.u(SystemClock.elapsedRealtime());
        C3727p0 c3727p0 = this.f32139b;
        c3727p0.f33779c = true;
        c3727p0.a();
        DisplayManager displayManager = (DisplayManager) c3727p0.f33777a.getSystemService("display");
        AbstractC3565m0 abstractC3565m0 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                abstractC3565m0 = Build.VERSION.SDK_INT >= 33 ? new ChoreographerVsyncCallbackC3673o0(choreographer, displayManager) : new ChoreographerFrameCallbackC3619n0(choreographer, displayManager);
            } catch (RuntimeException e9) {
                AbstractC2991bG.C("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e9);
            }
        }
        c3727p0.f33778b = abstractC3565m0;
        if (abstractC3565m0 != null) {
            abstractC3565m0.a();
        }
        c3727p0.b(false);
    }

    public final void c(Surface surface) {
        this.i = surface != null;
        this.f32146j = false;
        C3727p0 c3727p0 = this.f32139b;
        if (c3727p0.f33780d != surface) {
            c3727p0.c();
            c3727p0.f33780d = surface;
            c3727p0.b(true);
        }
        this.f32141d = Math.min(this.f32141d, 1);
    }

    public final boolean d(boolean z6) {
        if (!z6) {
            return false;
        }
        if (this.f32141d != 3) {
            return this.f32146j && !this.i;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(long j6, long j9, long j10, long j11, boolean z6, boolean z9, long j12, long j13, C3403j0 c3403j0) {
        long j14;
        long j15;
        long j16;
        float f2;
        long j17;
        c3403j0.f31940a = com.anythink.basead.exoplayer.b.f7168b;
        c3403j0.f31941b = com.anythink.basead.exoplayer.b.f7168b;
        boolean z10 = this.f32140c;
        if (z10 && this.f32142e == com.anythink.basead.exoplayer.b.f7168b) {
            this.f32142e = j9;
        }
        long j18 = (long) ((j6 - j9) / this.f32144g);
        if (z10) {
            this.f32145h.getClass();
            j18 -= AbstractC3182eu.u(SystemClock.elapsedRealtime()) - j10;
        }
        c3403j0.f31940a = j18;
        if (!z6 || z9) {
            if (this.i) {
                int i = this.f32141d;
                if (i != 0) {
                    if (i == 1) {
                        return 0;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        this.f32145h.getClass();
                        long u6 = AbstractC3182eu.u(SystemClock.elapsedRealtime()) - this.f32143f;
                        if (this.f32140c) {
                            long j19 = this.f32142e;
                            if (j19 != com.anythink.basead.exoplayer.b.f7168b && j19 != j9 && j18 < -30000 && u6 > 100000) {
                                return 0;
                            }
                        }
                    } else if (j9 >= j11) {
                        return 0;
                    }
                } else if (this.f32140c) {
                    return 0;
                }
                if (!this.f32140c || j9 == this.f32142e) {
                    return 5;
                }
                this.f32145h.getClass();
                long nanoTime = System.nanoTime();
                C3727p0 c3727p0 = this.f32139b;
                long j20 = (c3403j0.f31940a * 1000) + nanoTime;
                long j21 = c3727p0.f33788m;
                if (j6 != j21) {
                    c3727p0.f33789n = c3727p0.f33786k;
                    c3727p0.f33790o = c3727p0.f33787l;
                    c3727p0.f33791p = j21;
                    c3727p0.i = c3727p0.f33785j;
                }
                long j22 = c3727p0.f33789n;
                if (j22 != -1) {
                    if (j12 != com.anythink.basead.exoplayer.b.f7168b) {
                        f2 = c3727p0.f33783g;
                        j17 = (j13 - j22) * j12;
                    } else {
                        long j23 = j6 - c3727p0.f33791p;
                        f2 = c3727p0.f33783g;
                        j17 = j23 * 1000;
                    }
                    long j24 = c3727p0.f33790o + ((long) (j17 / f2));
                    if (Math.abs(j20 - j24) > 20000000) {
                        c3727p0.a();
                    } else {
                        j20 = j24;
                    }
                }
                c3727p0.f33786k = j13;
                c3727p0.f33787l = j20;
                c3727p0.f33788m = j6;
                AbstractC3565m0 abstractC3565m0 = c3727p0.f33778b;
                if (abstractC3565m0 != null) {
                    long j25 = abstractC3565m0.f32656v;
                    long j26 = c3727p0.f33778b.f32657w;
                    if (j25 != com.anythink.basead.exoplayer.b.f7168b && j26 != com.anythink.basead.exoplayer.b.f7168b) {
                        long j27 = (((j20 - j25) / j26) * j26) + j25;
                        if (j20 <= j27) {
                            j14 = j27 - j26;
                        } else {
                            j27 += j26;
                            j14 = j27;
                        }
                        long j28 = j26 / 2;
                        long j29 = j27 - j20;
                        long j30 = j20 - j14;
                        long abs = Math.abs(j29 - j30);
                        if (abs < j28) {
                            long j31 = j26 / 4;
                            j15 = j14;
                            if (abs < j31) {
                                j16 = c3727p0.i;
                                if (j16 == 0) {
                                    if (j29 < j30) {
                                        j31 = -j31;
                                    }
                                    c3727p0.f33785j = j31;
                                    j16 = j31;
                                    if (j29 + j16 >= j30) {
                                        j27 = j15;
                                    }
                                    j20 = j27 - ((j26 * 80) / 100);
                                }
                            } else {
                                j16 = 0;
                            }
                        } else {
                            j15 = j14;
                            j16 = c3727p0.i;
                        }
                        c3727p0.f33785j = j16;
                        if (j29 + j16 >= j30) {
                        }
                        j20 = j27 - ((j26 * 80) / 100);
                    }
                }
                c3403j0.f31941b = j20;
                long j32 = (j20 - nanoTime) / 1000;
                c3403j0.f31940a = j32;
                if (this.f32138a.z0(j32, j9, z9, false)) {
                    return 4;
                }
                long j33 = c3403j0.f31940a;
                if (j33 >= -30000 || z9) {
                    return j33 > 50000 ? 5 : 1;
                }
                return 2;
            }
            if (this.f32138a.z0(j18, j9, z9, true)) {
                return 4;
            }
            if (!this.f32140c || c3403j0.f31940a >= 30000) {
                this.f32146j = true;
                return 5;
            }
        }
        return 3;
    }

    public final void f(float f2) {
        AbstractC2792Sd.i(f2 > 0.0f);
        if (f2 == this.f32144g) {
            return;
        }
        this.f32144g = f2;
        C3727p0 c3727p0 = this.f32139b;
        c3727p0.f33783g = f2;
        c3727p0.b(false);
    }
}
