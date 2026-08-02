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
    public final Context f29234a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f29235b;

    /* renamed from: c, reason: collision with root package name */
    public final C3778py f29236c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29237d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29238e;

    /* renamed from: f, reason: collision with root package name */
    public final C4006uA f29239f;

    /* renamed from: g, reason: collision with root package name */
    public final Xz f29240g;

    /* renamed from: h, reason: collision with root package name */
    public final int f29241h;

    public Wz(Context context, ExecutorService executorService, C2972ay c2972ay, C3778py c3778py, C4006uA c4006uA, Xz xz) {
        this.f29234a = context;
        this.f29235b = executorService;
        this.f29236c = c3778py;
        this.f29239f = c4006uA;
        this.f29240g = xz;
        this.f29237d = c2972ay.R();
        int L2 = c2972ay.L();
        if (L2 == 1) {
            AbstractC3103dL.a();
            throw null;
        }
        int i = L2 - 2;
        this.f29241h = i != 0 ? i != 1 ? i != 2 ? 5 : 4 : 3 : 2;
        this.f29238e = c2972ay.X().C();
    }

    public static Iy a(int i) {
        Hy D8 = Iy.D();
        D8.h();
        ((Iy) D8.f28504u).I(i);
        return (Iy) D8.j();
    }

    @Override // com.google.android.gms.internal.ads.Rz
    public final ID c() {
        int i;
        T7 A9 = V7.A();
        byte[] m9 = AbstractC2659Kg.m();
        HK hk = JK.f26428u;
        HK s9 = JK.s(m9, 0, m9.length);
        A9.h();
        ((V7) A9.f28504u).B(s9);
        long j6 = Build.VERSION.SDK_INT;
        A9.h();
        ((V7) A9.f28504u).C(j6);
        String str = Build.MODEL;
        A9.h();
        ((V7) A9.f28504u).D(str);
        Context context = this.f29234a;
        String packageName = context.getPackageName();
        A9.h();
        ((V7) A9.f28504u).E(packageName);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        A9.h();
        ((V7) A9.f28504u).F(i);
        A9.h();
        ((V7) A9.f28504u).G(this.f29237d);
        A9.h();
        ((V7) A9.f28504u).H(3);
        A9.h();
        ((V7) A9.f28504u).I(this.f29241h);
        byte[] b9 = ((V7) A9.j()).b();
        CC cc = EC.f25317e;
        if (cc.f25320b != null) {
            cc = new CC(cc.f25319a, (Character) null);
        }
        String g9 = cc.g(b9.length, b9);
        C3778py c3778py = this.f29236c;
        c3778py.getClass();
        final int i4 = 2;
        C3955tD u6 = QC.u(ID.s(com.bumptech.glide.g.j(new Xw(c3778py, Uri.parse(this.f29238e).buildUpon().appendQueryParameter("aspq", g9).build().toString(), false, (String) null, new byte[0]))), new UA(this) { // from class: com.google.android.gms.internal.ads.Vz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wz f29087b;

            {
                this.f29087b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                Iy a9;
                switch (i4) {
                    case 0:
                        this.f29087b.f29239f.b(20007);
                        return Wz.a(13);
                    case 1:
                        this.f29087b.f29239f.b(20008);
                        return Wz.a(13);
                    default:
                        C3724oy c3724oy = (C3724oy) obj;
                        Wz wz = this.f29087b;
                        wz.getClass();
                        int i6 = c3724oy.f33770a;
                        C4006uA c4006uA = wz.f29239f;
                        if (i6 != 200) {
                            c4006uA.c(20003, new String(AbstractC2659Kg.m(), StandardCharsets.UTF_8));
                            return Wz.a(7);
                        }
                        try {
                            String str2 = new String(c3724oy.f33771b);
                            if (TextUtils.isEmpty(str2)) {
                                c4006uA.b(20004);
                                a9 = Wz.a(8);
                            } else {
                                W7 C8 = W7.C(AbstractC2792Sd.r(str2, true), PK.a());
                                if (C8.A().C() && C8.A().A()) {
                                    if (wz.f29240g.a(C8)) {
                                        Hy D8 = Iy.D();
                                        Jy F8 = Ky.F();
                                        C3143e8 B3 = C8.A().B();
                                        F8.h();
                                        ((Ky) F8.f28504u).I(B3);
                                        List B9 = C8.B();
                                        F8.h();
                                        ((Ky) F8.f28504u).K((ZK) B9);
                                        Ky ky = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f28504u).E(ky);
                                        JK D9 = C8.A().D();
                                        D8.h();
                                        ((Iy) D8.f28504u).F(D9);
                                        D8.h();
                                        ((Iy) D8.f28504u).I(2);
                                        a9 = (Iy) D8.j();
                                    } else {
                                        c4006uA.b(20006);
                                        a9 = Wz.a(12);
                                    }
                                }
                                c4006uA.b(20004);
                                a9 = Wz.a(8);
                            }
                            return a9;
                        } catch (Throwable th) {
                            c4006uA.d(20005, th);
                            return Wz.a(6);
                        }
                }
            }
        }, this.f29235b);
        final int i6 = 0;
        UA ua = new UA(this) { // from class: com.google.android.gms.internal.ads.Vz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wz f29087b;

            {
                this.f29087b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                Iy a9;
                switch (i6) {
                    case 0:
                        this.f29087b.f29239f.b(20007);
                        return Wz.a(13);
                    case 1:
                        this.f29087b.f29239f.b(20008);
                        return Wz.a(13);
                    default:
                        C3724oy c3724oy = (C3724oy) obj;
                        Wz wz = this.f29087b;
                        wz.getClass();
                        int i62 = c3724oy.f33770a;
                        C4006uA c4006uA = wz.f29239f;
                        if (i62 != 200) {
                            c4006uA.c(20003, new String(AbstractC2659Kg.m(), StandardCharsets.UTF_8));
                            return Wz.a(7);
                        }
                        try {
                            String str2 = new String(c3724oy.f33771b);
                            if (TextUtils.isEmpty(str2)) {
                                c4006uA.b(20004);
                                a9 = Wz.a(8);
                            } else {
                                W7 C8 = W7.C(AbstractC2792Sd.r(str2, true), PK.a());
                                if (C8.A().C() && C8.A().A()) {
                                    if (wz.f29240g.a(C8)) {
                                        Hy D8 = Iy.D();
                                        Jy F8 = Ky.F();
                                        C3143e8 B3 = C8.A().B();
                                        F8.h();
                                        ((Ky) F8.f28504u).I(B3);
                                        List B9 = C8.B();
                                        F8.h();
                                        ((Ky) F8.f28504u).K((ZK) B9);
                                        Ky ky = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f28504u).E(ky);
                                        JK D9 = C8.A().D();
                                        D8.h();
                                        ((Iy) D8.f28504u).F(D9);
                                        D8.h();
                                        ((Iy) D8.f28504u).I(2);
                                        a9 = (Iy) D8.j();
                                    } else {
                                        c4006uA.b(20006);
                                        a9 = Wz.a(12);
                                    }
                                }
                                c4006uA.b(20004);
                                a9 = Wz.a(8);
                            }
                            return a9;
                        } catch (Throwable th) {
                            c4006uA.d(20005, th);
                            return Wz.a(6);
                        }
                }
            }
        };
        GD gd = GD.f25742n;
        final int i9 = 1;
        YC q8 = QC.q(QC.q(u6, UnknownHostException.class, ua, gd), SocketException.class, new UA(this) { // from class: com.google.android.gms.internal.ads.Vz

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wz f29087b;

            {
                this.f29087b = this;
            }

            @Override // com.google.android.gms.internal.ads.UA
            public final Object apply(Object obj) {
                Iy a9;
                switch (i9) {
                    case 0:
                        this.f29087b.f29239f.b(20007);
                        return Wz.a(13);
                    case 1:
                        this.f29087b.f29239f.b(20008);
                        return Wz.a(13);
                    default:
                        C3724oy c3724oy = (C3724oy) obj;
                        Wz wz = this.f29087b;
                        wz.getClass();
                        int i62 = c3724oy.f33770a;
                        C4006uA c4006uA = wz.f29239f;
                        if (i62 != 200) {
                            c4006uA.c(20003, new String(AbstractC2659Kg.m(), StandardCharsets.UTF_8));
                            return Wz.a(7);
                        }
                        try {
                            String str2 = new String(c3724oy.f33771b);
                            if (TextUtils.isEmpty(str2)) {
                                c4006uA.b(20004);
                                a9 = Wz.a(8);
                            } else {
                                W7 C8 = W7.C(AbstractC2792Sd.r(str2, true), PK.a());
                                if (C8.A().C() && C8.A().A()) {
                                    if (wz.f29240g.a(C8)) {
                                        Hy D8 = Iy.D();
                                        Jy F8 = Ky.F();
                                        C3143e8 B3 = C8.A().B();
                                        F8.h();
                                        ((Ky) F8.f28504u).I(B3);
                                        List B9 = C8.B();
                                        F8.h();
                                        ((Ky) F8.f28504u).K((ZK) B9);
                                        Ky ky = (Ky) F8.j();
                                        D8.h();
                                        ((Iy) D8.f28504u).E(ky);
                                        JK D9 = C8.A().D();
                                        D8.h();
                                        ((Iy) D8.f28504u).F(D9);
                                        D8.h();
                                        ((Iy) D8.f28504u).I(2);
                                        a9 = (Iy) D8.j();
                                    } else {
                                        c4006uA.b(20006);
                                        a9 = Wz.a(12);
                                    }
                                }
                                c4006uA.b(20004);
                                a9 = Wz.a(8);
                            }
                            return a9;
                        } catch (Throwable th) {
                            c4006uA.d(20005, th);
                            return Wz.a(6);
                        }
                }
            }
        }, gd);
        this.f29239f.e(20002, q8);
        return q8;
    }
}
