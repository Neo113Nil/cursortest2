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
    public final Context f28053a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3135eN f28054b;

    /* renamed from: c, reason: collision with root package name */
    public final Yz f28055c;

    /* renamed from: d, reason: collision with root package name */
    public final C3983uA f28056d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f28057e;

    /* renamed from: f, reason: collision with root package name */
    public final Iz f28058f;

    /* renamed from: g, reason: collision with root package name */
    public final Cw f28059g;

    public Uz(Context context, InterfaceC3135eN interfaceC3135eN, Yz yz, C3983uA c3983uA, ExecutorService executorService, Iz iz, Cw cw) {
        this.f28053a = context;
        this.f28054b = interfaceC3135eN;
        this.f28055c = yz;
        this.f28056d = c3983uA;
        this.f28057e = executorService;
        this.f28058f = iz;
        this.f28059g = cw;
    }

    public static Iy a(int i) {
        Hy D8 = Iy.D();
        D8.h();
        ((Iy) D8.f27721u).I(i);
        return (Iy) D8.j();
    }

    @Override // com.google.android.gms.internal.ads.Rz
    public final ID c() {
        InterfaceC3135eN interfaceC3135eN = this.f28054b;
        Objects.requireNonNull(interfaceC3135eN);
        Ts ts = new Ts(7, interfaceC3135eN);
        ExecutorService executorService = this.f28057e;
        ID s9 = ID.s(QC.o(ts, executorService));
        final int i = 1;
        UA ua = new UA(this) { // from class: com.google.android.gms.internal.ads.Tz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uz f27835b;

            {
                this.f27835b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                boolean z3;
                switch (i) {
                    case 0:
                        Ky ky = (Ky) obj;
                        Uz uz = this.f27835b;
                        InterfaceC3135eN interfaceC3135eN2 = uz.f28054b;
                        String A9 = ky.A().A();
                        String B9 = ky.A().B();
                        C3983uA c3983uA = uz.f28056d;
                        C3929tA a9 = c3983uA.a(15203);
                        try {
                            a9.a();
                            Ww e9 = AbstractC2639Kg.e(uz.f28053a, (EnumC2960b8) interfaceC3135eN2.f(), A9, B9, uz.f28059g);
                            a9.c();
                            int i6 = 2;
                            int i9 = e9.f28447v;
                            if (i9 == 2) {
                                c3983uA.b(15208);
                                return Uz.a(4);
                            }
                            byte[] bArr = e9.f28446u;
                            if (bArr == null || bArr.length == 0) {
                                c3983uA.b(5010);
                                return Uz.a(8);
                            }
                            try {
                                C3013c8 E8 = C3013c8.E(bArr, PK.a());
                                if (E8.A().A().isEmpty() || E8.A().B().isEmpty() || E8.C().a().length == 0) {
                                    c3983uA.b(15207);
                                } else {
                                    if (ky.equals(Ky.G()) || !TextUtils.equals(ky.A().A(), E8.A().A()) || !TextUtils.equals(ky.A().B(), E8.A().B())) {
                                        if (i9 == 4) {
                                            byte[] a10 = E8.B().a();
                                            Iz iz = uz.f28058f;
                                            File file = iz.f25627a;
                                            try {
                                                AbstractC3043cl.u(file);
                                                AbstractC3043cl.m(file, a10);
                                                iz.f25628b.getClass();
                                                z3 = Bw.a(file);
                                            } catch (IOException | GeneralSecurityException e10) {
                                                iz.f25629c.d(2027, e10);
                                                z3 = false;
                                            }
                                            try {
                                                file.delete();
                                            } catch (SecurityException unused) {
                                            }
                                            if (!z3) {
                                                c3983uA.b(15206);
                                                return Uz.a(12);
                                            }
                                            i9 = 4;
                                        }
                                        Hy D8 = Iy.D();
                                        if (i9 == 2) {
                                            i6 = 4;
                                        } else if (i9 != 3) {
                                            i6 = i9 != 4 ? i9 != 6 ? 1 : 5 : 3;
                                        }
                                        D8.h();
                                        ((Iy) D8.f27721u).I(i6);
                                        Jy F8 = Ky.F();
                                        C3228g8 A10 = E8.A();
                                        F8.h();
                                        ((Ky) F8.f27721u).H(A10);
                                        EnumC2960b8 enumC2960b8 = (EnumC2960b8) interfaceC3135eN2.f();
                                        F8.h();
                                        ((Ky) F8.f27721u).J(enumC2960b8);
                                        Ky ky2 = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f27721u).E(ky2);
                                        JK B10 = E8.B();
                                        D8.h();
                                        ((Iy) D8.f27721u).G(B10);
                                        JK C8 = E8.C();
                                        D8.h();
                                        ((Iy) D8.f27721u).F(C8);
                                        return (Iy) D8.j();
                                    }
                                    c3983uA.b(15209);
                                }
                                return Uz.a(11);
                            } catch (C3295hL e11) {
                                c3983uA.d(15205, e11);
                                return Uz.a(9);
                            } catch (NullPointerException unused2) {
                                c3983uA.b(15210);
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
                        EnumC2960b8 enumC2960b82 = (EnumC2960b8) obj;
                        Uz uz2 = this.f27835b;
                        uz2.getClass();
                        if (AbstractC3043cl.q(enumC2960b82)) {
                            return new Integer(0);
                        }
                        uz2.f28056d.c(15204, enumC2960b82.name());
                        throw new Sz();
                }
            }
        };
        GD gd = GD.f24952n;
        final int i6 = 0;
        YC q8 = QC.q(QC.u(QC.t(QC.u(s9, ua, gd), new C4164xc(16, this), gd), new UA(this) { // from class: com.google.android.gms.internal.ads.Tz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uz f27835b;

            {
                this.f27835b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                boolean z3;
                switch (i6) {
                    case 0:
                        Ky ky = (Ky) obj;
                        Uz uz = this.f27835b;
                        InterfaceC3135eN interfaceC3135eN2 = uz.f28054b;
                        String A9 = ky.A().A();
                        String B9 = ky.A().B();
                        C3983uA c3983uA = uz.f28056d;
                        C3929tA a9 = c3983uA.a(15203);
                        try {
                            a9.a();
                            Ww e9 = AbstractC2639Kg.e(uz.f28053a, (EnumC2960b8) interfaceC3135eN2.f(), A9, B9, uz.f28059g);
                            a9.c();
                            int i62 = 2;
                            int i9 = e9.f28447v;
                            if (i9 == 2) {
                                c3983uA.b(15208);
                                return Uz.a(4);
                            }
                            byte[] bArr = e9.f28446u;
                            if (bArr == null || bArr.length == 0) {
                                c3983uA.b(5010);
                                return Uz.a(8);
                            }
                            try {
                                C3013c8 E8 = C3013c8.E(bArr, PK.a());
                                if (E8.A().A().isEmpty() || E8.A().B().isEmpty() || E8.C().a().length == 0) {
                                    c3983uA.b(15207);
                                } else {
                                    if (ky.equals(Ky.G()) || !TextUtils.equals(ky.A().A(), E8.A().A()) || !TextUtils.equals(ky.A().B(), E8.A().B())) {
                                        if (i9 == 4) {
                                            byte[] a10 = E8.B().a();
                                            Iz iz = uz.f28058f;
                                            File file = iz.f25627a;
                                            try {
                                                AbstractC3043cl.u(file);
                                                AbstractC3043cl.m(file, a10);
                                                iz.f25628b.getClass();
                                                z3 = Bw.a(file);
                                            } catch (IOException | GeneralSecurityException e10) {
                                                iz.f25629c.d(2027, e10);
                                                z3 = false;
                                            }
                                            try {
                                                file.delete();
                                            } catch (SecurityException unused) {
                                            }
                                            if (!z3) {
                                                c3983uA.b(15206);
                                                return Uz.a(12);
                                            }
                                            i9 = 4;
                                        }
                                        Hy D8 = Iy.D();
                                        if (i9 == 2) {
                                            i62 = 4;
                                        } else if (i9 != 3) {
                                            i62 = i9 != 4 ? i9 != 6 ? 1 : 5 : 3;
                                        }
                                        D8.h();
                                        ((Iy) D8.f27721u).I(i62);
                                        Jy F8 = Ky.F();
                                        C3228g8 A10 = E8.A();
                                        F8.h();
                                        ((Ky) F8.f27721u).H(A10);
                                        EnumC2960b8 enumC2960b8 = (EnumC2960b8) interfaceC3135eN2.f();
                                        F8.h();
                                        ((Ky) F8.f27721u).J(enumC2960b8);
                                        Ky ky2 = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f27721u).E(ky2);
                                        JK B10 = E8.B();
                                        D8.h();
                                        ((Iy) D8.f27721u).G(B10);
                                        JK C8 = E8.C();
                                        D8.h();
                                        ((Iy) D8.f27721u).F(C8);
                                        return (Iy) D8.j();
                                    }
                                    c3983uA.b(15209);
                                }
                                return Uz.a(11);
                            } catch (C3295hL e11) {
                                c3983uA.d(15205, e11);
                                return Uz.a(9);
                            } catch (NullPointerException unused2) {
                                c3983uA.b(15210);
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
                        EnumC2960b8 enumC2960b82 = (EnumC2960b8) obj;
                        Uz uz2 = this.f27835b;
                        uz2.getClass();
                        if (AbstractC3043cl.q(enumC2960b82)) {
                            return new Integer(0);
                        }
                        uz2.f28056d.c(15204, enumC2960b82.name());
                        throw new Sz();
                }
            }
        }, executorService), Sz.class, Oz.f26698c, gd);
        this.f28056d.e(15202, q8);
        return q8;
    }
}
