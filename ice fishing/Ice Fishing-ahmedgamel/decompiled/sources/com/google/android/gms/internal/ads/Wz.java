package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class Wz implements Rz {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28454a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f28455b;

    /* renamed from: c, reason: collision with root package name */
    public final C3755py f28456c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28457d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28458e;

    /* renamed from: f, reason: collision with root package name */
    public final C3983uA f28459f;

    /* renamed from: g, reason: collision with root package name */
    public final Xz f28460g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28461h;

    public Wz(Context context, ExecutorService executorService, C2949ay c2949ay, C3755py c3755py, C3983uA c3983uA, Xz xz) {
        this.f28454a = context;
        this.f28455b = executorService;
        this.f28456c = c3755py;
        this.f28459f = c3983uA;
        this.f28460g = xz;
        this.f28457d = c2949ay.R();
        int L6 = c2949ay.L();
        if (L6 == 1) {
            AbstractC3080dL.a();
            throw null;
        }
        int i = L6 - 2;
        this.f28461h = i != 0 ? i != 1 ? i != 2 ? 5 : 4 : 3 : 2;
        this.f28458e = c2949ay.X().C();
    }

    public static Iy a(int i) {
        Hy D8 = Iy.D();
        D8.h();
        ((Iy) D8.f27721u).I(i);
        return (Iy) D8.j();
    }

    @Override // com.google.android.gms.internal.ads.Rz
    public final ID c() {
        int i;
        T7 A9 = V7.A();
        byte[] m4 = AbstractC2639Kg.m();
        HK hk = JK.f25675u;
        HK s9 = JK.s(m4, 0, m4.length);
        A9.h();
        ((V7) A9.f27721u).B(s9);
        long j6 = Build.VERSION.SDK_INT;
        A9.h();
        ((V7) A9.f27721u).C(j6);
        String str = Build.MODEL;
        A9.h();
        ((V7) A9.f27721u).D(str);
        Context context = this.f28454a;
        String packageName = context.getPackageName();
        A9.h();
        ((V7) A9.f27721u).E(packageName);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        A9.h();
        ((V7) A9.f27721u).F(i);
        A9.h();
        ((V7) A9.f27721u).G(this.f28457d);
        A9.h();
        ((V7) A9.f27721u).H(3);
        A9.h();
        ((V7) A9.f27721u).I(this.f28461h);
        byte[] b9 = ((V7) A9.j()).b();
        CC cc = EC.f24556e;
        if (cc.f24559b != null) {
            cc = new CC(cc.f24558a, (Character) null);
        }
        String g4 = cc.g(b9.length, b9);
        C3755py c3755py = this.f28456c;
        c3755py.getClass();
        final int i6 = 2;
        C3932tD u3 = QC.u(ID.s(com.bumptech.glide.g.f(new Xw(c3755py, Uri.parse(this.f28458e).buildUpon().appendQueryParameter("aspq", g4).build().toString(), false, (String) null, new byte[0]))), new UA(this) { // from class: com.google.android.gms.internal.ads.Vz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wz f28289b;

            {
                this.f28289b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                Iy a9;
                switch (i6) {
                    case 0:
                        this.f28289b.f28459f.b(20007);
                        return Wz.a(13);
                    case 1:
                        this.f28289b.f28459f.b(20008);
                        return Wz.a(13);
                    default:
                        C3701oy c3701oy = (C3701oy) obj;
                        Wz wz = this.f28289b;
                        wz.getClass();
                        int i9 = c3701oy.f32980a;
                        C3983uA c3983uA = wz.f28459f;
                        if (i9 != 200) {
                            c3983uA.c(20003, new String(AbstractC2639Kg.m(), StandardCharsets.UTF_8));
                            return Wz.a(7);
                        }
                        try {
                            String str2 = new String(c3701oy.f32981b);
                            if (TextUtils.isEmpty(str2)) {
                                c3983uA.b(20004);
                                a9 = Wz.a(8);
                            } else {
                                W7 C8 = W7.C(AbstractC2772Sd.r(str2, true), PK.a());
                                if (C8.A().C() && C8.A().A()) {
                                    if (wz.f28460g.a(C8)) {
                                        Hy D8 = Iy.D();
                                        Jy F8 = Ky.F();
                                        C3120e8 B9 = C8.A().B();
                                        F8.h();
                                        ((Ky) F8.f27721u).I(B9);
                                        List B10 = C8.B();
                                        F8.h();
                                        ((Ky) F8.f27721u).K((ZK) B10);
                                        Ky ky = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f27721u).E(ky);
                                        JK D9 = C8.A().D();
                                        D8.h();
                                        ((Iy) D8.f27721u).F(D9);
                                        D8.h();
                                        ((Iy) D8.f27721u).I(2);
                                        a9 = (Iy) D8.j();
                                    } else {
                                        c3983uA.b(20006);
                                        a9 = Wz.a(12);
                                    }
                                }
                                c3983uA.b(20004);
                                a9 = Wz.a(8);
                            }
                            return a9;
                        } catch (Throwable th) {
                            c3983uA.d(20005, th);
                            return Wz.a(6);
                        }
                }
            }
        }, this.f28455b);
        final int i9 = 0;
        UA ua = new UA(this) { // from class: com.google.android.gms.internal.ads.Vz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wz f28289b;

            {
                this.f28289b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                Iy a9;
                switch (i9) {
                    case 0:
                        this.f28289b.f28459f.b(20007);
                        return Wz.a(13);
                    case 1:
                        this.f28289b.f28459f.b(20008);
                        return Wz.a(13);
                    default:
                        C3701oy c3701oy = (C3701oy) obj;
                        Wz wz = this.f28289b;
                        wz.getClass();
                        int i92 = c3701oy.f32980a;
                        C3983uA c3983uA = wz.f28459f;
                        if (i92 != 200) {
                            c3983uA.c(20003, new String(AbstractC2639Kg.m(), StandardCharsets.UTF_8));
                            return Wz.a(7);
                        }
                        try {
                            String str2 = new String(c3701oy.f32981b);
                            if (TextUtils.isEmpty(str2)) {
                                c3983uA.b(20004);
                                a9 = Wz.a(8);
                            } else {
                                W7 C8 = W7.C(AbstractC2772Sd.r(str2, true), PK.a());
                                if (C8.A().C() && C8.A().A()) {
                                    if (wz.f28460g.a(C8)) {
                                        Hy D8 = Iy.D();
                                        Jy F8 = Ky.F();
                                        C3120e8 B9 = C8.A().B();
                                        F8.h();
                                        ((Ky) F8.f27721u).I(B9);
                                        List B10 = C8.B();
                                        F8.h();
                                        ((Ky) F8.f27721u).K((ZK) B10);
                                        Ky ky = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f27721u).E(ky);
                                        JK D9 = C8.A().D();
                                        D8.h();
                                        ((Iy) D8.f27721u).F(D9);
                                        D8.h();
                                        ((Iy) D8.f27721u).I(2);
                                        a9 = (Iy) D8.j();
                                    } else {
                                        c3983uA.b(20006);
                                        a9 = Wz.a(12);
                                    }
                                }
                                c3983uA.b(20004);
                                a9 = Wz.a(8);
                            }
                            return a9;
                        } catch (Throwable th) {
                            c3983uA.d(20005, th);
                            return Wz.a(6);
                        }
                }
            }
        };
        GD gd = GD.f24952n;
        final int i10 = 1;
        YC q8 = QC.q(QC.q(u3, UnknownHostException.class, ua, gd), SocketException.class, new UA(this) { // from class: com.google.android.gms.internal.ads.Vz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wz f28289b;

            {
                this.f28289b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                Iy a9;
                switch (i10) {
                    case 0:
                        this.f28289b.f28459f.b(20007);
                        return Wz.a(13);
                    case 1:
                        this.f28289b.f28459f.b(20008);
                        return Wz.a(13);
                    default:
                        C3701oy c3701oy = (C3701oy) obj;
                        Wz wz = this.f28289b;
                        wz.getClass();
                        int i92 = c3701oy.f32980a;
                        C3983uA c3983uA = wz.f28459f;
                        if (i92 != 200) {
                            c3983uA.c(20003, new String(AbstractC2639Kg.m(), StandardCharsets.UTF_8));
                            return Wz.a(7);
                        }
                        try {
                            String str2 = new String(c3701oy.f32981b);
                            if (TextUtils.isEmpty(str2)) {
                                c3983uA.b(20004);
                                a9 = Wz.a(8);
                            } else {
                                W7 C8 = W7.C(AbstractC2772Sd.r(str2, true), PK.a());
                                if (C8.A().C() && C8.A().A()) {
                                    if (wz.f28460g.a(C8)) {
                                        Hy D8 = Iy.D();
                                        Jy F8 = Ky.F();
                                        C3120e8 B9 = C8.A().B();
                                        F8.h();
                                        ((Ky) F8.f27721u).I(B9);
                                        List B10 = C8.B();
                                        F8.h();
                                        ((Ky) F8.f27721u).K((ZK) B10);
                                        Ky ky = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f27721u).E(ky);
                                        JK D9 = C8.A().D();
                                        D8.h();
                                        ((Iy) D8.f27721u).F(D9);
                                        D8.h();
                                        ((Iy) D8.f27721u).I(2);
                                        a9 = (Iy) D8.j();
                                    } else {
                                        c3983uA.b(20006);
                                        a9 = Wz.a(12);
                                    }
                                }
                                c3983uA.b(20004);
                                a9 = Wz.a(8);
                            }
                            return a9;
                        } catch (Throwable th) {
                            c3983uA.d(20005, th);
                            return Wz.a(6);
                        }
                }
            }
        }, gd);
        this.f28459f.e(20002, q8);
        return q8;
    }
}
