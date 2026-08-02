package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import s2.InterfaceC4919a;

/* renamed from: com.google.android.gms.internal.ads.ak, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2958ak implements InterfaceC3765pl {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29891n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29885u = new C2958ak(2);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29886v = new C2958ak(3);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29887w = new C2958ak(4);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29888x = new C2958ak(5);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29889y = new C2958ak(6);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29890z = new C2958ak(7);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29864A = new C2958ak(8);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29865B = new C2958ak(9);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29866C = new C2958ak(10);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29867D = new C2958ak(11);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29868E = new C2958ak(12);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29869F = new C2958ak(13);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29870G = new C2958ak(14);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29871H = new C2958ak(15);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29872I = new C2958ak(16);
    public static final /* synthetic */ C2958ak J = new C2958ak(17);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29873K = new C2958ak(18);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29874L = new C2958ak(19);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29875M = new C2958ak(20);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29876N = new C2958ak(21);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29877O = new C2958ak(22);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29878P = new C2958ak(23);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29879Q = new C2958ak(24);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29880R = new C2958ak(25);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29881S = new C2958ak(26);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29882T = new C2958ak(27);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29883U = new C2958ak(28);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ C2958ak f29884V = new C2958ak(29);

    public /* synthetic */ C2958ak(int i) {
        this.f29891n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public void mo5a(Object obj) {
        int i;
        int i4;
        switch (this.f29891n) {
            case 2:
                ((InterfaceC4919a) obj).onAdClicked();
                return;
            case 3:
                ((InterfaceC4249yk) obj).d();
                return;
            case 4:
                ((InterfaceC2510Bk) obj).c(SK.F(11, null, null));
                return;
            case 5:
                ((InterfaceC2544Dk) obj).v();
                return;
            case 6:
                ((InterfaceC4033uk) obj).y();
                return;
            case 7:
                ((InterfaceC4033uk) obj).B();
                return;
            case 8:
                ((InterfaceC4033uk) obj).d();
                return;
            case 9:
                ((InterfaceC4033uk) obj).e();
                return;
            case 10:
                ((InterfaceC4033uk) obj).z();
                return;
            case 11:
                ((InterfaceC2663Kk) obj).h();
                return;
            case 12:
                ((I2.a) obj).a();
                return;
            case 13:
                ((InterfaceC2748Pk) obj).l();
                return;
            case 14:
                ((v2.l) obj).h1();
                return;
            case 15:
                ((v2.l) obj).G1();
                return;
            case 16:
                ((v2.l) obj).t0();
                return;
            case 17:
                ((v2.l) obj).Q1();
                return;
            case 18:
                ((v2.l) obj).N2();
                return;
            case 19:
                ((v2.l) obj).r1();
                return;
            case 20:
                ((v2.l) obj).S1();
                return;
            case 21:
                ((v2.l) obj).K0();
                return;
            case 22:
                ((v2.l) obj).d1();
                return;
            case 23:
                ((v2.l) obj).g();
                return;
            case 24:
                ((InterfaceC2850Vk) obj).k();
                return;
            case 25:
                Br br = (Br) ((InterfaceC2866Wk) obj);
                synchronized (br) {
                    C3719ot c3719ot = br.f24738u;
                    if (c3719ot.d()) {
                        c3719ot.c();
                        return;
                    }
                    C3441jl c3441jl = c3719ot.f33756j;
                    C2898Yk c2898Yk = c3719ot.f33755h;
                    synchronized (c3441jl) {
                        i = c3441jl.f32098u;
                    }
                    c2898Yk.T1(i);
                    return;
                }
            case 26:
                Br br2 = (Br) ((InterfaceC2866Wk) obj);
                synchronized (br2) {
                    try {
                        if (!br2.f24738u.d()) {
                            C3719ot c3719ot2 = br2.f24738u;
                            C2898Yk c2898Yk2 = c3719ot2.f33755h;
                            C3441jl c3441jl2 = c3719ot2.f33756j;
                            synchronized (c3441jl2) {
                                i4 = c3441jl2.f32097n;
                            }
                            c2898Yk2.R1(i4);
                            return;
                        }
                        C3022bu c3022bu = br2.f24742y;
                        s2.f1 f1Var = c3022bu.f30132b;
                        C3547lj c3547lj = br2.f24736B;
                        if (c3547lj != null && c3022bu.f30146q) {
                            f1Var = AbstractC3066cl.k(br2.f24737n, Collections.singletonList(c3547lj.f32607o));
                        }
                        synchronized (br2) {
                            C3022bu c3022bu2 = br2.f24742y;
                            c3022bu2.f30132b = f1Var;
                            c3022bu2.f30146q = br2.f24741x.f40438G;
                            c3022bu.f30145p = true;
                            try {
                                br2.U3(c3022bu.f30131a);
                            } catch (RemoteException unused) {
                                int i6 = w2.z.f41712b;
                                x2.i.f("Failed to refresh the banner ad.");
                            }
                            br2.f24742y.f30145p = false;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
            case 27:
                ((InterfaceC3227fl) obj).t();
                return;
            case 28:
                ((InterfaceC3335hl) obj).w();
                return;
            default:
                ((InterfaceC3335hl) obj).s();
                return;
        }
    }
}
