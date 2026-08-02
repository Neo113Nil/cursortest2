package com.yandex.passport.sloth.ui;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.a0g;
import defpackage.a4g;
import defpackage.agv;
import defpackage.aqi;
import defpackage.b2c;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.bq5;
import defpackage.d43;
import defpackage.dzf;
import defpackage.eev;
import defpackage.ern;
import defpackage.fjb;
import defpackage.ftr;
import defpackage.g0g;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.gs6;
import defpackage.gut;
import defpackage.hd6;
import defpackage.hq5;
import defpackage.i95;
import defpackage.ild;
import defpackage.irf;
import defpackage.j95;
import defpackage.kb5;
import defpackage.kfu;
import defpackage.kjn;
import defpackage.l1p;
import defpackage.ngg;
import defpackage.npu;
import defpackage.o2g;
import defpackage.o9s;
import defpackage.olu;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.ovn;
import defpackage.pd;
import defpackage.pjt;
import defpackage.pr;
import defpackage.qld;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.rpg;
import defpackage.rvf;
import defpackage.s7h;
import defpackage.sa5;
import defpackage.ssd;
import defpackage.szf;
import defpackage.ta5;
import defpackage.v24;
import defpackage.vci;
import defpackage.vdt;
import defpackage.vh;
import defpackage.vnj;
import defpackage.vq1;
import defpackage.w4k;
import defpackage.w85;
import defpackage.wcs;
import defpackage.wp5;
import defpackage.x0q;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c1 {
    public static final d1 a = new d1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    public static final void a(com.yandex.passport.sloth.ui.error.e eVar, com.yandex.passport.sloth.ui.string.b bVar, com.yandex.passport.common.ui.progress.g gVar, Function0 function0, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        Integer num;
        w4k w85Var;
        ?? r6;
        boolean z;
        com.yandex.passport.sloth.ui.string.a aVar;
        Integer num2;
        vci vciVar;
        oq5 oq5Var;
        vci vciVar2;
        oq5 oq5Var2;
        yci yciVar2;
        oq5 oq5Var3;
        eVar.getClass();
        function0.getClass();
        function1.getClass();
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(-36015687);
        int i2 = i | (oq5Var4.f(eVar) ? 4 : 2) | (oq5Var4.f(bVar) ? 32 : 16) | (oq5Var4.f(gVar) ? 256 : 128) | (oq5Var4.h(function0) ? 2048 : 1024) | (oq5Var4.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if ((74899 & i2) == 74898 && oq5Var4.z()) {
            oq5Var4.S();
            yciVar2 = yciVar;
            oq5Var3 = oq5Var4;
        } else {
            com.yandex.passport.sloth.ui.error.d dVar = eVar.c;
            com.yandex.passport.sloth.ui.string.a aVar2 = eVar.b;
            int i3 = dVar == null ? -1 : h.a[dVar.ordinal()];
            if (i3 == -1 || i3 == 1) {
                num = null;
            } else if (i3 == 2) {
                num = Integer.valueOf(R.string.cancel);
            } else {
                if (i3 != 3) {
                    b6e.s();
                    return;
                }
                num = Integer.valueOf(((com.yandex.passport.internal.ui.sloth.g) bVar).a(com.yandex.passport.sloth.ui.string.a.h));
            }
            com.yandex.passport.common.ui.progress.f fVar = gVar.c;
            Integer num3 = num;
            vci vciVar3 = vci.a;
            yci c = androidx.compose.foundation.layout.d.c(vciVar3, 1.0f);
            if (fVar instanceof com.yandex.passport.common.ui.progress.d) {
                oq5Var4.Z(799200470);
                w85Var = a0g.E(((com.yandex.passport.common.ui.progress.d) fVar).a, 0, oq5Var4);
                oq5Var4.p(false);
            } else {
                oq5Var4.Z(799288975);
                w85Var = new w85(((i95) oq5Var4.j(j95.a)).n);
                oq5Var4.p(false);
            }
            yci d = androidx.compose.ui.draw.a.d(c, w85Var, null, hd6.g, 0.0f, null, 54);
            ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var4, 54);
            int i4 = oq5Var4.P;
            androidx.compose.runtime.internal.a l = oq5Var4.l();
            yci H = vnj.H(oq5Var4, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var4.d0();
            if (oq5Var4.O) {
                oq5Var4.k(grbVar);
            } else {
                oq5Var4.n0();
            }
            g0g.U(oq5Var4, a2, wp5.f);
            g0g.U(oq5Var4, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var4, i4, kb5Var);
            }
            g0g.U(oq5Var4, H, wp5.d);
            if (eVar.a) {
                oq5Var4.Z(865350288);
                com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
                com.yandex.passport.internal.ui.a.h(gVar, null, oq5Var4, (i2 >> 6) & 14, 2);
                r6 = 0;
            } else {
                r6 = 0;
                oq5Var4.Z(862652947);
            }
            oq5Var4.p(r6);
            if (eVar.e) {
                oq5Var4.Z(865460245);
                num2 = num3;
                aVar = aVar2;
                vciVar = vciVar3;
                z = false;
                irf.r(a0g.E(ru.yandex.music.R.drawable.passport_sloth_unexpected_error, r6, oq5Var4), null, null, null, null, 0.0f, new d43(((i95) oq5Var4.j(j95.a)).a, 5), oq5Var4, 48, 60);
            } else {
                z = r6;
                aVar = aVar2;
                num2 = num3;
                vciVar = vciVar3;
                oq5Var4.Z(862652947);
            }
            oq5Var4.p(z);
            if (aVar != null) {
                oq5Var4.Z(865785714);
                wcs.b(rvf.M(((com.yandex.passport.internal.ui.sloth.g) bVar).a(aVar), oq5Var4), androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), 0.0f, 12, 0.0f, 0.0f, 13), ((i95) oq5Var4.j(j95.a)).a, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, ((rdt) oq5Var4.j(vdt.a)).k, oq5Var4, 48, 0, 65016);
                oq5Var = oq5Var4;
            } else {
                oq5Var4.Z(862652947);
                oq5Var = oq5Var4;
            }
            oq5Var.p(z);
            if (num2 != null) {
                oq5Var.Z(866241569);
                boolean z2 = ((i2 & 7168) == 2048 ? true : z) | ((i2 & 14) != 4 ? z : true) | ((i2 & 57344) == 16384 ? true : z);
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new ftr(27, eVar, function0, function1);
                    oq5Var.k0(K);
                }
                vci vciVar4 = vciVar;
                vciVar2 = vciVar4;
                oq5 oq5Var5 = oq5Var;
                qld.d((Function0) K, androidx.compose.foundation.layout.a.q(vciVar4, 0.0f, 14, 0.0f, 0.0f, 13), false, null, null, null, null, ild.C(1815316467, new olu(9, num2), oq5Var), oq5Var5, 805306416, 508);
                oq5Var2 = oq5Var5;
            } else {
                vciVar2 = vciVar;
                oq5Var.Z(862652947);
                oq5Var2 = oq5Var;
            }
            oq5Var2.p(z);
            oq5Var2.p(true);
            yciVar2 = vciVar2;
            oq5Var3 = oq5Var2;
        }
        xmn r = oq5Var3.r();
        if (r != null) {
            r.d = new pr(eVar, bVar, gVar, function0, function1, yciVar2, i, 28);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if ((r31 & 2) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(com.yandex.passport.sloth.ui.dependencies.c cVar, String str, hq5 hq5Var, int i, int i2) {
        String str2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        kfu a2;
        xpi xpiVar;
        k kVar;
        Object obj;
        Function0 function0;
        Object obj2;
        com.yandex.passport.common.common.a aVar;
        Object obj3;
        boolean z3;
        Object obj4;
        oq5 oq5Var;
        oq5 oq5Var2;
        cVar.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1161295754);
        int i5 = 4;
        int i6 = i | (oq5Var3.f(cVar) ? 4 : 2);
        if ((i2 & 2) == 0) {
            str2 = str;
            if (oq5Var3.f(str2)) {
                i3 = 32;
                i4 = i6 | i3;
                if ((i4 & 19) == 18 || !oq5Var3.z()) {
                    oq5Var3.U();
                    if ((i & 1) != 0 || oq5Var3.y()) {
                        if ((i2 & 2) != 0) {
                            str2 = ern.a(y1.class).f();
                            if (str2 == null) {
                                str2 = "";
                            }
                            i4 &= -113;
                        }
                        String str3 = str2;
                        oq5Var3.q();
                        int i7 = 14;
                        int i8 = i4 & 14;
                        z = i8 != 4;
                        Object K = oq5Var3.K();
                        kjn kjnVar = gq5.a;
                        Object obj5 = K;
                        if (!z || K == kjnVar) {
                            a aVar2 = new a(new l0(), cVar);
                            oq5Var3.k0(aVar2);
                            obj5 = aVar2;
                        }
                        a aVar3 = (a) obj5;
                        z2 = i8 != 4;
                        Object K2 = oq5Var3.K();
                        Object obj6 = K2;
                        if (!z2 || K2 == kjnVar) {
                            a1 slothUiInteractor = cVar.getSlothUiInteractor();
                            slothUiInteractor.getClass();
                            com.yandex.passport.sloth.dependencies.i slothUrlProvider = cVar.getSlothUrlProvider();
                            slothUrlProvider.getClass();
                            g slothComposeUIReporter = cVar.getSlothComposeUIReporter();
                            slothComposeUIReporter.getClass();
                            o1 o1Var = new o1(new com.yandex.passport.internal.core.accounts.h(new ovn(), slothUiInteractor, slothComposeUIReporter, slothUrlProvider, 3));
                            oq5Var3.k0(o1Var);
                            obj6 = o1Var;
                        }
                        o1 o1Var2 = (o1) obj6;
                        oq5Var3.a0(1729797275);
                        a2 = rpg.a(oq5Var3);
                        if (a2 != null) {
                            xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                        bfu R = ngg.R(ern.a(y1.class), a2, str3, o1Var2, a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var3);
                        oq5Var3.p(false);
                        final y1 y1Var = (y1) R;
                        Context context = (Context) oq5Var3.j(AndroidCompositionLocals_androidKt.b);
                        com.yandex.passport.sloth.ui.dependencies.c cVar2 = aVar3.a;
                        com.yandex.passport.sloth.ui.dependencies.c cVar3 = aVar3.a;
                        g slothComposeUIReporter2 = cVar2.getSlothComposeUIReporter();
                        a4g.s(slothComposeUIReporter2);
                        boolean f = oq5Var3.f(slothComposeUIReporter2) | oq5Var3.f(context);
                        Object K3 = oq5Var3.K();
                        Object obj7 = K3;
                        if (f || K3 == kjnVar) {
                            g slothComposeUIReporter3 = cVar3.getSlothComposeUIReporter();
                            a4g.s(slothComposeUIReporter3);
                            com.yandex.passport.sloth.ui.string.b stringRepository = cVar3.getStringRepository();
                            a4g.s(stringRepository);
                            com.yandex.passport.sloth.ui.dependencies.d slothDebugInformationDelegate = cVar3.getSlothDebugInformationDelegate();
                            a4g.s(slothDebugInformationDelegate);
                            d dVar = new d(context, slothComposeUIReporter3, stringRepository, slothDebugInformationDelegate);
                            oq5Var3.k0(dVar);
                            obj7 = dVar;
                        }
                        d dVar2 = (d) obj7;
                        aqi Q = szf.Q(y1Var.l, oq5Var3);
                        com.yandex.passport.sloth.ui.dependencies.q slothWishConsumer = cVar3.getSlothWishConsumer();
                        a4g.s(slothWishConsumer);
                        g slothComposeUIReporter4 = cVar3.getSlothComposeUIReporter();
                        a4g.s(slothComposeUIReporter4);
                        k kVar2 = new k(slothWishConsumer, slothComposeUIReporter4);
                        vh vhVar = new vh(5);
                        boolean h = oq5Var3.h(dVar2) | oq5Var3.h(y1Var);
                        Object K4 = oq5Var3.K();
                        Object obj8 = K4;
                        if (h || K4 == kjnVar) {
                            com.yandex.passport.internal.ui.bouncer.o oVar = new com.yandex.passport.internal.ui.bouncer.o(i7, dVar2, y1Var);
                            oq5Var3.k0(oVar);
                            obj8 = oVar;
                        }
                        s7h d0 = vq1.d0(vhVar, (Function1) obj8, oq5Var3);
                        Object K5 = oq5Var3.K();
                        Continuation continuation = null;
                        Object obj9 = K5;
                        if (K5 == kjnVar) {
                            x0q b = y0q.b(0, 0, null, 7);
                            oq5Var3.k0(b);
                            obj9 = b;
                        }
                        xpi xpiVar2 = (xpi) obj9;
                        Unit unit = Unit.a;
                        boolean h2 = oq5Var3.h(y1Var) | oq5Var3.h(xpiVar2) | oq5Var3.h(dVar2) | oq5Var3.h(d0) | oq5Var3.h(kVar2);
                        Object K6 = oq5Var3.K();
                        if (h2 || K6 == kjnVar) {
                            xpiVar = xpiVar2;
                            K6 = new fjb(y1Var, xpiVar, dVar2, d0, kVar2, (Continuation) null);
                            kVar = kVar2;
                            oq5Var3.k0(K6);
                        } else {
                            xpiVar = xpiVar2;
                            kVar = kVar2;
                        }
                        gld.w(oq5Var3, unit, (Function2) K6);
                        boolean h3 = oq5Var3.h(dVar2);
                        Object K7 = oq5Var3.K();
                        Object obj10 = K7;
                        if (h3 || K7 == kjnVar) {
                            pjt pjtVar = new pjt(dVar2, continuation, 23);
                            oq5Var3.k0(pjtVar);
                            obj10 = pjtVar;
                        }
                        gld.w(oq5Var3, unit, (Function2) obj10);
                        l slothNetworkStatus = cVar3.getSlothNetworkStatus();
                        a4g.s(slothNetworkStatus);
                        boolean h4 = oq5Var3.h(aVar3) | oq5Var3.h(y1Var);
                        Object K8 = oq5Var3.K();
                        Object obj11 = K8;
                        if (h4 || K8 == kjnVar) {
                            l1p l1pVar = new l1p(aVar3, y1Var, continuation, 22);
                            oq5Var3.k0(l1pVar);
                            obj11 = l1pVar;
                        }
                        gld.w(oq5Var3, slothNetworkStatus, (Function2) obj11);
                        com.yandex.passport.common.common.a applicationDetailsProvider = cVar3.getApplicationDetailsProvider();
                        a4g.s(applicationDetailsProvider);
                        boolean h5 = oq5Var3.h(dVar2);
                        Object K9 = oq5Var3.K();
                        Object obj12 = K9;
                        if (h5 || K9 == kjnVar) {
                            com.yandex.passport.common.util.e eVar = new com.yandex.passport.common.util.e(i5, dVar2);
                            oq5Var3.k0(eVar);
                            obj12 = eVar;
                        }
                        Function1 function1 = (Function1) obj12;
                        boolean h6 = oq5Var3.h(kVar);
                        Object K10 = oq5Var3.K();
                        Object obj13 = K10;
                        if (h6 || K10 == kjnVar) {
                            n nVar = new n(kVar, 2);
                            oq5Var3.k0(nVar);
                            obj13 = nVar;
                        }
                        Function0 function02 = (Function0) obj13;
                        boolean h7 = oq5Var3.h(dVar2) | oq5Var3.h(kVar);
                        Object K11 = oq5Var3.K();
                        Object obj14 = K11;
                        if (h7 || K11 == kjnVar) {
                            com.yandex.passport.internal.ui.bouncer.o oVar2 = new com.yandex.passport.internal.ui.bouncer.o(15, dVar2, kVar);
                            oq5Var3.k0(oVar2);
                            obj14 = oVar2;
                        }
                        Function1 function12 = (Function1) obj14;
                        boolean h8 = oq5Var3.h(y1Var);
                        Object K12 = oq5Var3.K();
                        Object obj15 = K12;
                        if (h8 || K12 == kjnVar) {
                            final int i9 = 0;
                            Function0 function03 = new Function0() { // from class: com.yandex.passport.sloth.ui.o
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i9) {
                                        case 0:
                                            y1Var.a(u1.a);
                                            break;
                                        case 1:
                                            y1Var.a(new w1(u0.a));
                                            break;
                                        default:
                                            y1Var.a(v1.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var3.k0(function03);
                            obj15 = function03;
                        }
                        Function0 function04 = (Function0) obj15;
                        boolean h9 = oq5Var3.h(kVar);
                        Object K13 = oq5Var3.K();
                        Object obj16 = K13;
                        if (h9 || K13 == kjnVar) {
                            n nVar2 = new n(kVar, 3);
                            oq5Var3.k0(nVar2);
                            obj16 = nVar2;
                        }
                        Function0 function05 = (Function0) obj16;
                        boolean h10 = oq5Var3.h(y1Var);
                        k kVar3 = kVar;
                        Object K14 = oq5Var3.K();
                        if (h10 || K14 == kjnVar) {
                            final int i10 = 1;
                            Function0 function06 = new Function0() { // from class: com.yandex.passport.sloth.ui.o
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            y1Var.a(u1.a);
                                            break;
                                        case 1:
                                            y1Var.a(new w1(u0.a));
                                            break;
                                        default:
                                            y1Var.a(v1.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var3.k0(function06);
                            obj = function06;
                        } else {
                            obj = K14;
                        }
                        Function0 function07 = (Function0) obj;
                        boolean h11 = oq5Var3.h(y1Var);
                        Object K15 = oq5Var3.K();
                        if (h11 || K15 == kjnVar) {
                            function0 = function07;
                            final int i11 = 2;
                            Function0 function08 = new Function0() { // from class: com.yandex.passport.sloth.ui.o
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            y1Var.a(u1.a);
                                            break;
                                        case 1:
                                            y1Var.a(new w1(u0.a));
                                            break;
                                        default:
                                            y1Var.a(v1.a);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var3.k0(function08);
                            obj2 = function08;
                        } else {
                            function0 = function07;
                            obj2 = K15;
                        }
                        Function0 function09 = (Function0) obj2;
                        boolean h12 = oq5Var3.h(y1Var);
                        Object K16 = oq5Var3.K();
                        if (h12 || K16 == kjnVar) {
                            aVar = applicationDetailsProvider;
                            m mVar = new m(y1Var, 2);
                            oq5Var3.k0(mVar);
                            obj3 = mVar;
                        } else {
                            aVar = applicationDetailsProvider;
                            obj3 = K16;
                        }
                        Function1 function13 = (Function1) obj3;
                        boolean h13 = oq5Var3.h(y1Var);
                        Object K17 = oq5Var3.K();
                        if (h13 || K17 == kjnVar) {
                            z3 = false;
                            m mVar2 = new m(y1Var, 0);
                            oq5Var3.k0(mVar2);
                            obj4 = mVar2;
                        } else {
                            z3 = false;
                            obj4 = K17;
                        }
                        boolean z4 = z3;
                        c(aVar3, xpiVar, aVar, function1, function02, function12, function04, function05, function0, function09, function13, (Function1) obj4, false, oq5Var3, 0);
                        oq5 oq5Var4 = oq5Var3;
                        com.yandex.passport.sloth.ui.error.e eVar2 = ((p1) Q.getValue()).b;
                        if (eVar2 == null) {
                            oq5Var4.Z(-194921819);
                            oq5Var = oq5Var4;
                        } else {
                            oq5Var4.Z(-194921818);
                            com.yandex.passport.sloth.ui.string.b stringRepository2 = cVar3.getStringRepository();
                            a4g.s(stringRepository2);
                            com.yandex.passport.common.ui.progress.g progressProperties = cVar3.getProgressProperties();
                            a4g.s(progressProperties);
                            boolean h14 = oq5Var4.h(kVar3);
                            Object K18 = oq5Var4.K();
                            Object obj17 = K18;
                            if (h14 || K18 == kjnVar) {
                                n nVar3 = new n(kVar3, z4 ? 1 : 0);
                                oq5Var4.k0(nVar3);
                                obj17 = nVar3;
                            }
                            Function0 function010 = (Function0) obj17;
                            boolean h15 = oq5Var4.h(y1Var);
                            Object K19 = oq5Var4.K();
                            Object obj18 = K19;
                            if (h15 || K19 == kjnVar) {
                                m mVar3 = new m(y1Var, 1);
                                oq5Var4.k0(mVar3);
                                obj18 = mVar3;
                            }
                            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                            a(eVar2, stringRepository2, progressProperties, function010, (Function1) obj18, null, oq5Var4, 0);
                            oq5Var = oq5Var4;
                        }
                        oq5Var.p(z4);
                        str2 = str3;
                        oq5Var2 = oq5Var;
                    } else {
                        oq5Var3.S();
                    }
                } else {
                    oq5Var3.S();
                    oq5Var2 = oq5Var3;
                }
                xmn r = oq5Var2.r();
                if (r != null) {
                    r.d = new npu(cVar, str2, i, i2);
                    return;
                }
                return;
            }
        } else {
            str2 = str;
        }
        i3 = 16;
        i4 = i6 | i3;
        if ((i4 & 19) == 18) {
        }
        oq5Var3.U();
        if ((i & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        String str32 = str2;
        oq5Var3.q();
        int i72 = 14;
        int i82 = i4 & 14;
        if (i82 != 4) {
        }
        Object K20 = oq5Var3.K();
        kjn kjnVar2 = gq5.a;
        Object obj52 = K20;
        if (!z) {
        }
        a aVar22 = new a(new l0(), cVar);
        oq5Var3.k0(aVar22);
        obj52 = aVar22;
        a aVar32 = (a) obj52;
        if (i82 != 4) {
        }
        Object K22 = oq5Var3.K();
        Object obj62 = K22;
        if (!z2) {
        }
        a1 slothUiInteractor2 = cVar.getSlothUiInteractor();
        slothUiInteractor2.getClass();
        com.yandex.passport.sloth.dependencies.i slothUrlProvider2 = cVar.getSlothUrlProvider();
        slothUrlProvider2.getClass();
        g slothComposeUIReporter5 = cVar.getSlothComposeUIReporter();
        slothComposeUIReporter5.getClass();
        o1 o1Var3 = new o1(new com.yandex.passport.internal.core.accounts.h(new ovn(), slothUiInteractor2, slothComposeUIReporter5, slothUrlProvider2, 3));
        oq5Var3.k0(o1Var3);
        obj62 = o1Var3;
        o1 o1Var22 = (o1) obj62;
        oq5Var3.a0(1729797275);
        a2 = rpg.a(oq5Var3);
        if (a2 != null) {
        }
    }

    public static final void c(final a aVar, xpi xpiVar, final com.yandex.passport.common.common.a aVar2, final Function1 function1, final Function0 function0, final Function1 function12, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function1 function13, final Function1 function14, boolean z, hq5 hq5Var, final int i) {
        int i2;
        boolean z2;
        Object obj;
        Object v24Var;
        kjn kjnVar;
        WebView webView;
        final boolean z3;
        oq5 oq5Var;
        final xpi xpiVar2 = xpiVar;
        com.yandex.passport.sloth.ui.dependencies.c cVar = aVar.a;
        xpiVar2.getClass();
        function1.getClass();
        function0.getClass();
        function12.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function13.getClass();
        function14.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1472994075);
        int i3 = i | (oq5Var2.f(aVar) ? 4 : 2) | (oq5Var2.h(xpiVar2) ? 32 : 16) | (oq5Var2.h(aVar2) ? 256 : 128) | (oq5Var2.h(function1) ? 2048 : 1024) | (oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(function12) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.h(function02) ? 1048576 : 524288) | (oq5Var2.h(function03) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.h(function04) ? 67108864 : 33554432) | (oq5Var2.h(function05) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i4 = (oq5Var2.h(function13) ? (char) 4 : (char) 2) | (oq5Var2.h(function14) ? ' ' : (char) 16) | 384;
        if ((i3 & 306783379) == 306783378 && (i4 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            z3 = z;
            oq5Var = oq5Var2;
        } else {
            Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = new Object[0];
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = new com.yandex.passport.sloth.command.data.k0(2);
                oq5Var2.k0(K);
            }
            Object g0 = o2g.g0(objArr, null, (Function0) K, oq5Var2, 0, 6);
            oq5 oq5Var3 = oq5Var2;
            Bundle bundle = (Bundle) g0;
            Object K2 = oq5Var3.K();
            if (K2 == kjnVar2) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var3.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            boolean f = oq5Var3.f(context);
            Object K3 = oq5Var3.K();
            if (f || K3 == kjnVar2) {
                WebView webView2 = new WebView(context);
                com.yandex.passport.sloth.data.o0 slothVariant = cVar.getSlothVariant();
                a4g.s(slothVariant);
                g slothComposeUIReporter = cVar.getSlothComposeUIReporter();
                a4g.s(slothComposeUIReporter);
                agv webViewSslErrorHandler = cVar.getWebViewSslErrorHandler();
                a4g.s(webViewSslErrorHandler);
                a1 slothUiInteractor = cVar.getSlothUiInteractor();
                a4g.s(slothUiInteractor);
                f fVar = new f(slothUiInteractor);
                i2 = i3;
                a1 slothUiInteractor2 = cVar.getSlothUiInteractor();
                a4g.s(slothUiInteractor2);
                c2 c2Var = new c2(slothVariant, slothComposeUIReporter, webViewSslErrorHandler, fVar, new f(slothUiInteractor2), function1, function0, function12, function02, function03, function04, function05, function13, new z1(aqiVar, 0));
                String A = com.yandex.plus.core.network.api.utils.a.A("PassportSDK/7.54.1.754014992");
                StringBuilder sb = new StringBuilder();
                com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) aVar2;
                sb.append(dVar.a());
                sb.append('/');
                sb.append(dVar.b());
                String A2 = com.yandex.plus.core.network.api.utils.a.A(sb.toString());
                WebSettings settings = webView2.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setAllowContentAccess(false);
                settings.setDomStorageEnabled(true);
                settings.setUserAgentString(settings.getUserAgentString() + ' ' + A + ' ' + A2);
                webView2.setClipToOutline(true);
                webView2.setWebViewClient(c2Var);
                webView2.setWebChromeClient(new b2());
                webView2.addJavascriptInterface(new e(function14), "nativeAMAndroid");
                if (!bundle.isEmpty()) {
                    webView2.restoreState(bundle);
                }
                aqiVar.setValue(Boolean.valueOf(webView2.canGoBack()));
                z2 = true;
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView2, true);
                oq5Var3.k0(webView2);
                obj = webView2;
            } else {
                i2 = i3;
                z2 = true;
                obj = K3;
            }
            WebView webView3 = (WebView) obj;
            boolean booleanValue = ((Boolean) aqiVar.getValue()).booleanValue();
            boolean h = oq5Var3.h(webView3);
            Object K4 = oq5Var3.K();
            if (h || K4 == kjnVar2) {
                K4 = new bq5(webView3, 3);
                oq5Var3.k0(K4);
            }
            pd.c(0, 0, oq5Var3, (Function0) K4, booleanValue);
            boolean h2 = oq5Var3.h(xpiVar2) | oq5Var3.h(webView3) | ((i2 & 14) == 4 ? z2 : false);
            Object K5 = oq5Var3.K();
            if (h2 || K5 == kjnVar2) {
                kjnVar = kjnVar2;
                v24Var = new v24(xpiVar2, webView3, aVar, (Continuation) null, 20);
                xpiVar2 = xpiVar2;
                webView = webView3;
                oq5Var3.k0(v24Var);
            } else {
                v24Var = K5;
                kjnVar = kjnVar2;
                webView = webView3;
            }
            gld.w(oq5Var3, xpiVar2, (Function2) v24Var);
            boolean h3 = oq5Var3.h(webView);
            Object K6 = oq5Var3.K();
            if (h3 || K6 == kjnVar) {
                K6 = new eev(webView, 6);
                oq5Var3.k0(K6);
            }
            androidx.compose.ui.viewinterop.a.a(0, 4, oq5Var3, gut.r1(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.c(vci.a, 1.0f), ((i95) oq5Var3.j(j95.a)).n, vnj.i)), (Function1) K6, null);
            dzf dzfVar = (dzf) oq5Var3.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean h4 = oq5Var3.h(webView) | oq5Var3.h(bundle) | oq5Var3.h(dzfVar);
            Object K7 = oq5Var3.K();
            if (h4 || K7 == kjnVar) {
                K7 = new com.yandex.passport.internal.ui.sloth.ebs.i(2, dzfVar, webView, bundle);
                oq5Var3.k0(K7);
            }
            gld.j(dzfVar, webView, (Function1) K7, oq5Var3);
            boolean h5 = oq5Var3.h(webView);
            Object K8 = oq5Var3.K();
            if (h5 || K8 == kjnVar) {
                K8 = new eev(webView, 7);
                oq5Var3.k0(K8);
            }
            gld.k(context, (Function1) K8, oq5Var3);
            z3 = z2;
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(xpiVar2, aVar2, function1, function0, function12, function02, function03, function04, function05, function13, function14, z3, i) { // from class: com.yandex.passport.sloth.ui.a2
                public final /* synthetic */ xpi b;
                public final /* synthetic */ com.yandex.passport.common.common.a c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 j;
                public final /* synthetic */ Function1 k;
                public final /* synthetic */ Function1 l;
                public final /* synthetic */ boolean m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int R = rvf.R(1);
                    c1.c(a.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (hq5) obj2, R);
                    return Unit.a;
                }
            };
        }
    }
}
