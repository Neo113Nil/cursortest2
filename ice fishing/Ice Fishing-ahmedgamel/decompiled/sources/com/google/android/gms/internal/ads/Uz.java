package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Uz implements Rz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28850a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3158eN f28851b;

    /* renamed from: c, reason: collision with root package name */
    public final Yz f28852c;

    /* renamed from: d, reason: collision with root package name */
    public final C4006uA f28853d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f28854e;

    /* renamed from: f, reason: collision with root package name */
    public final Iz f28855f;

    /* renamed from: g, reason: collision with root package name */
    public final Cw f28856g;

    public Uz(Context context, InterfaceC3158eN interfaceC3158eN, Yz yz, C4006uA c4006uA, ExecutorService executorService, Iz iz, Cw cw) {
        this.f28850a = context;
        this.f28851b = interfaceC3158eN;
        this.f28852c = yz;
        this.f28853d = c4006uA;
        this.f28854e = executorService;
        this.f28855f = iz;
        this.f28856g = cw;
    }

    public static Iy a(int i) {
        Hy D8 = Iy.D();
        D8.h();
        ((Iy) D8.f28504u).I(i);
        return (Iy) D8.j();
    }

    @Override // com.google.android.gms.internal.ads.Rz
    public final ID c() {
        InterfaceC3158eN interfaceC3158eN = this.f28851b;
        Objects.requireNonNull(interfaceC3158eN);
        Ts ts = new Ts(7, interfaceC3158eN);
        ExecutorService executorService = this.f28854e;
        ID s9 = ID.s(QC.o(ts, executorService));
        final int i = 1;
        UA ua = new UA(this) { // from class: com.google.android.gms.internal.ads.Tz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uz f28632b;

            {
                this.f28632b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                boolean z6;
                switch (i) {
                    case 0:
                        Ky ky = (Ky) obj;
                        Uz uz = this.f28632b;
                        InterfaceC3158eN interfaceC3158eN2 = uz.f28851b;
                        String A9 = ky.A().A();
                        String B3 = ky.A().B();
                        C4006uA c4006uA = uz.f28853d;
                        C3952tA a9 = c4006uA.a(15203);
                        try {
                            a9.a();
                            Ww e9 = AbstractC2659Kg.e(uz.f28850a, (EnumC2983b8) interfaceC3158eN2.f(), A9, B3, uz.f28856g);
                            a9.c();
                            int i4 = 2;
                            int i6 = e9.f29227v;
                            if (i6 == 2) {
                                c4006uA.b(15208);
                                return Uz.a(4);
                            }
                            byte[] bArr = e9.f29226u;
                            if (bArr == null || bArr.length == 0) {
                                c4006uA.b(5010);
                                return Uz.a(8);
                            }
                            try {
                                C3036c8 E8 = C3036c8.E(bArr, PK.a());
                                if (E8.A().A().isEmpty() || E8.A().B().isEmpty() || E8.C().a().length == 0) {
                                    c4006uA.b(15207);
                                } else {
                                    if (ky.equals(Ky.G()) || !TextUtils.equals(ky.A().A(), E8.A().A()) || !TextUtils.equals(ky.A().B(), E8.A().B())) {
                                        if (i6 == 4) {
                                            byte[] a10 = E8.B().a();
                                            Iz iz = uz.f28855f;
                                            File file = iz.f26380a;
                                            try {
                                                AbstractC3066cl.u(file);
                                                AbstractC3066cl.m(file, a10);
                                                iz.f26381b.getClass();
                                                z6 = Bw.a(file);
                                            } catch (IOException | GeneralSecurityException e10) {
                                                iz.f26382c.d(2027, e10);
                                                z6 = false;
                                            }
                                            try {
                                                file.delete();
                                            } catch (SecurityException unused) {
                                            }
                                            if (!z6) {
                                                c4006uA.b(15206);
                                                return Uz.a(12);
                                            }
                                            i6 = 4;
                                        }
                                        Hy D8 = Iy.D();
                                        if (i6 == 2) {
                                            i4 = 4;
                                        } else if (i6 != 3) {
                                            i4 = i6 != 4 ? i6 != 6 ? 1 : 5 : 3;
                                        }
                                        D8.h();
                                        ((Iy) D8.f28504u).I(i4);
                                        Jy F8 = Ky.F();
                                        C3251g8 A10 = E8.A();
                                        F8.h();
                                        ((Ky) F8.f28504u).H(A10);
                                        EnumC2983b8 enumC2983b8 = (EnumC2983b8) interfaceC3158eN2.f();
                                        F8.h();
                                        ((Ky) F8.f28504u).J(enumC2983b8);
                                        Ky ky2 = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f28504u).E(ky2);
                                        JK B9 = E8.B();
                                        D8.h();
                                        ((Iy) D8.f28504u).G(B9);
                                        JK C8 = E8.C();
                                        D8.h();
                                        ((Iy) D8.f28504u).F(C8);
                                        return (Iy) D8.j();
                                    }
                                    c4006uA.b(15209);
                                }
                                return Uz.a(11);
                            } catch (C3318hL e11) {
                                c4006uA.d(15205, e11);
                                return Uz.a(9);
                            } catch (NullPointerException unused2) {
                                c4006uA.b(15210);
                                return Uz.a(10);
                            }
                        } catch (Throwable th) {
                            try {
                                a9.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                a9.c();
                                throw th2;
                            }
                        }
                    default:
                        EnumC2983b8 enumC2983b82 = (EnumC2983b8) obj;
                        Uz uz2 = this.f28632b;
                        uz2.getClass();
                        if (AbstractC3066cl.q(enumC2983b82)) {
                            return new Integer(0);
                        }
                        uz2.f28853d.c(15204, enumC2983b82.name());
                        throw new Sz();
                }
            }
        };
        GD gd = GD.f25742n;
        final int i4 = 0;
        YC q8 = QC.q(QC.u(QC.t(QC.u(s9, ua, gd), new C4187xc(16, this), gd), new UA(this) { // from class: com.google.android.gms.internal.ads.Tz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uz f28632b;

            {
                this.f28632b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                boolean z6;
                switch (i4) {
                    case 0:
                        Ky ky = (Ky) obj;
                        Uz uz = this.f28632b;
                        InterfaceC3158eN interfaceC3158eN2 = uz.f28851b;
                        String A9 = ky.A().A();
                        String B3 = ky.A().B();
                        C4006uA c4006uA = uz.f28853d;
                        C3952tA a9 = c4006uA.a(15203);
                        try {
                            a9.a();
                            Ww e9 = AbstractC2659Kg.e(uz.f28850a, (EnumC2983b8) interfaceC3158eN2.f(), A9, B3, uz.f28856g);
                            a9.c();
                            int i42 = 2;
                            int i6 = e9.f29227v;
                            if (i6 == 2) {
                                c4006uA.b(15208);
                                return Uz.a(4);
                            }
                            byte[] bArr = e9.f29226u;
                            if (bArr == null || bArr.length == 0) {
                                c4006uA.b(5010);
                                return Uz.a(8);
                            }
                            try {
                                C3036c8 E8 = C3036c8.E(bArr, PK.a());
                                if (E8.A().A().isEmpty() || E8.A().B().isEmpty() || E8.C().a().length == 0) {
                                    c4006uA.b(15207);
                                } else {
                                    if (ky.equals(Ky.G()) || !TextUtils.equals(ky.A().A(), E8.A().A()) || !TextUtils.equals(ky.A().B(), E8.A().B())) {
                                        if (i6 == 4) {
                                            byte[] a10 = E8.B().a();
                                            Iz iz = uz.f28855f;
                                            File file = iz.f26380a;
                                            try {
                                                AbstractC3066cl.u(file);
                                                AbstractC3066cl.m(file, a10);
                                                iz.f26381b.getClass();
                                                z6 = Bw.a(file);
                                            } catch (IOException | GeneralSecurityException e10) {
                                                iz.f26382c.d(2027, e10);
                                                z6 = false;
                                            }
                                            try {
                                                file.delete();
                                            } catch (SecurityException unused) {
                                            }
                                            if (!z6) {
                                                c4006uA.b(15206);
                                                return Uz.a(12);
                                            }
                                            i6 = 4;
                                        }
                                        Hy D8 = Iy.D();
                                        if (i6 == 2) {
                                            i42 = 4;
                                        } else if (i6 != 3) {
                                            i42 = i6 != 4 ? i6 != 6 ? 1 : 5 : 3;
                                        }
                                        D8.h();
                                        ((Iy) D8.f28504u).I(i42);
                                        Jy F8 = Ky.F();
                                        C3251g8 A10 = E8.A();
                                        F8.h();
                                        ((Ky) F8.f28504u).H(A10);
                                        EnumC2983b8 enumC2983b8 = (EnumC2983b8) interfaceC3158eN2.f();
                                        F8.h();
                                        ((Ky) F8.f28504u).J(enumC2983b8);
                                        Ky ky2 = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f28504u).E(ky2);
                                        JK B9 = E8.B();
                                        D8.h();
                                        ((Iy) D8.f28504u).G(B9);
                                        JK C8 = E8.C();
                                        D8.h();
                                        ((Iy) D8.f28504u).F(C8);
                                        return (Iy) D8.j();
                                    }
                                    c4006uA.b(15209);
                                }
                                return Uz.a(11);
                            } catch (C3318hL e11) {
                                c4006uA.d(15205, e11);
                                return Uz.a(9);
                            } catch (NullPointerException unused2) {
                                c4006uA.b(15210);
                                return Uz.a(10);
                            }
                        } catch (Throwable th) {
                            try {
                                a9.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                a9.c();
                                throw th2;
                            }
                        }
                    default:
                        EnumC2983b8 enumC2983b82 = (EnumC2983b8) obj;
                        Uz uz2 = this.f28632b;
                        uz2.getClass();
                        if (AbstractC3066cl.q(enumC2983b82)) {
                            return new Integer(0);
                        }
                        uz2.f28853d.c(15204, enumC2983b82.name());
                        throw new Sz();
                }
            }
        }, executorService), Sz.class, Oz.f27481c, gd);
        this.f28853d.e(15202, q8);
        return q8;
    }
}
