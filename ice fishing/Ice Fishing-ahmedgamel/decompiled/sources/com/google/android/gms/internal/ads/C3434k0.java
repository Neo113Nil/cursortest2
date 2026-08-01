package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3434k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Z f31359a;

    /* renamed from: b, reason: collision with root package name */
    public final C3704p0 f31360b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31361c;

    /* renamed from: f, reason: collision with root package name */
    public long f31364f;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31367j;

    /* renamed from: d, reason: collision with root package name */
    public int f31362d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f31363e = com.anythink.basead.exoplayer.b.f6382b;

    /* renamed from: g, reason: collision with root package name */
    public float f31365g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public V2 f31366h = V2.f28076y;

    public C3434k0(Context context, Z z3) {
        this.f31359a = z3;
        this.f31360b = new C3704p0(context);
    }

    public final void a(int i) {
        if (i == 0) {
            this.f31362d = 1;
        } else if (i != 1) {
            this.f31362d = Math.min(this.f31362d, 2);
        } else {
            this.f31362d = 0;
        }
        this.f31360b.a();
    }

    public final void b() {
        this.f31361c = true;
        this.f31366h.getClass();
        this.f31364f = AbstractC3159eu.u(SystemClock.elapsedRealtime());
        C3704p0 c3704p0 = this.f31360b;
        c3704p0.f32989c = true;
        c3704p0.a();
        DisplayManager displayManager = (DisplayManager) c3704p0.f32987a.getSystemService("display");
        AbstractC3542m0 abstractC3542m0 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                abstractC3542m0 = Build.VERSION.SDK_INT >= 33 ? new ChoreographerVsyncCallbackC3650o0(choreographer, displayManager) : new ChoreographerFrameCallbackC3596n0(choreographer, displayManager);
            } catch (RuntimeException e9) {
                AbstractC2968bG.C("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e9);
            }
        }
        c3704p0.f32988b = abstractC3542m0;
        if (abstractC3542m0 != null) {
            abstractC3542m0.a();
        }
        c3704p0.b(false);
    }

    public final void c(Surface surface) {
        this.i = surface != null;
        this.f31367j = false;
        C3704p0 c3704p0 = this.f31360b;
        if (c3704p0.f32990d != surface) {
            c3704p0.c();
            c3704p0.f32990d = surface;
            c3704p0.b(true);
        }
        this.f31362d = Math.min(this.f31362d, 1);
    }

    public final boolean d(boolean z3) {
        if (!z3) {
            return false;
        }
        if (this.f31362d != 3) {
            return this.f31367j && !this.i;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(long j6, long j9, long j10, long j11, boolean z3, boolean z6, long j12, long j13, C3380j0 c3380j0) {
        long j14;
        long j15;
        long j16;
        float f3;
        long j17;
        c3380j0.f31153a = com.anythink.basead.exoplayer.b.f6382b;
        c3380j0.f31154b = com.anythink.basead.exoplayer.b.f6382b;
        boolean z9 = this.f31361c;
        if (z9 && this.f31363e == com.anythink.basead.exoplayer.b.f6382b) {
            this.f31363e = j9;
        }
        long j18 = (long) ((j6 - j9) / this.f31365g);
        if (z9) {
            this.f31366h.getClass();
            j18 -= AbstractC3159eu.u(SystemClock.elapsedRealtime()) - j10;
        }
        c3380j0.f31153a = j18;
        if (!z3 || z6) {
            if (this.i) {
                int i = this.f31362d;
                if (i != 0) {
                    if (i == 1) {
                        return 0;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        this.f31366h.getClass();
                        long u3 = AbstractC3159eu.u(SystemClock.elapsedRealtime()) - this.f31364f;
                        if (this.f31361c) {
                            long j19 = this.f31363e;
                            if (j19 != com.anythink.basead.exoplayer.b.f6382b && j19 != j9 && j18 < -30000 && u3 > 100000) {
                                return 0;
                            }
                        }
                    } else if (j9 >= j11) {
                        return 0;
                    }
                } else if (this.f31361c) {
                    return 0;
                }
                if (!this.f31361c || j9 == this.f31363e) {
                    return 5;
                }
                this.f31366h.getClass();
                long nanoTime = System.nanoTime();
                C3704p0 c3704p0 = this.f31360b;
                long j20 = (c3380j0.f31153a * 1000) + nanoTime;
                long j21 = c3704p0.f32998m;
                if (j6 != j21) {
                    c3704p0.f32999n = c3704p0.f32996k;
                    c3704p0.f33000o = c3704p0.f32997l;
                    c3704p0.f33001p = j21;
                    c3704p0.i = c3704p0.f32995j;
                }
                long j22 = c3704p0.f32999n;
                if (j22 != -1) {
                    if (j12 != com.anythink.basead.exoplayer.b.f6382b) {
                        f3 = c3704p0.f32993g;
                        j17 = (j13 - j22) * j12;
                    } else {
                        long j23 = j6 - c3704p0.f33001p;
                        f3 = c3704p0.f32993g;
                        j17 = j23 * 1000;
                    }
                    long j24 = c3704p0.f33000o + ((long) (j17 / f3));
                    if (Math.abs(j20 - j24) > 20000000) {
                        c3704p0.a();
                    } else {
                        j20 = j24;
                    }
                }
                c3704p0.f32996k = j13;
                c3704p0.f32997l = j20;
                c3704p0.f32998m = j6;
                AbstractC3542m0 abstractC3542m0 = c3704p0.f32988b;
                if (abstractC3542m0 != null) {
                    long j25 = abstractC3542m0.f31876v;
                    long j26 = c3704p0.f32988b.f31877w;
                    if (j25 != com.anythink.basead.exoplayer.b.f6382b && j26 != com.anythink.basead.exoplayer.b.f6382b) {
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
                                j16 = c3704p0.i;
                                if (j16 == 0) {
                                    if (j29 < j30) {
                                        j31 = -j31;
                                    }
                                    c3704p0.f32995j = j31;
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
                            j16 = c3704p0.i;
                        }
                        c3704p0.f32995j = j16;
                        if (j29 + j16 >= j30) {
                        }
                        j20 = j27 - ((j26 * 80) / 100);
                    }
                }
                c3380j0.f31154b = j20;
                long j32 = (j20 - nanoTime) / 1000;
                c3380j0.f31153a = j32;
                if (this.f31359a.z0(j32, j9, z6, false)) {
                    return 4;
                }
                long j33 = c3380j0.f31153a;
                if (j33 >= -30000 || z6) {
                    return j33 > 50000 ? 5 : 1;
                }
                return 2;
            }
            if (this.f31359a.z0(j18, j9, z6, true)) {
                return 4;
            }
            if (!this.f31361c || c3380j0.f31153a >= 30000) {
                this.f31367j = true;
                return 5;
            }
        }
        return 3;
    }

    public final void f(float f3) {
        AbstractC2772Sd.i(f3 > 0.0f);
        if (f3 == this.f31365g) {
            return;
        }
        this.f31365g = f3;
        C3704p0 c3704p0 = this.f31360b;
        c3704p0.f32993g = f3;
        c3704p0.b(false);
    }
}
