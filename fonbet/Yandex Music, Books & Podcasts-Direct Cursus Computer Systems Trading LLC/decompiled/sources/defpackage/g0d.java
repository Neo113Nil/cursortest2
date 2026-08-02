package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class g0d implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ g0d(x80 x80Var, mm6 mm6Var, jx7 jx7Var, jab jabVar, eoe eoeVar, fvf fvfVar, rbm rbmVar, u0s u0sVar) {
        this.a = 2;
        float f = edo.a;
        this.b = rbmVar;
        this.c = jabVar;
        this.d = u0sVar;
        this.e = x80Var;
        this.f = mm6Var;
        this.g = jx7Var;
        this.h = eoeVar;
        this.i = fvfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v43, types: [hq5, oq5] */
    /* JADX WARN: Type inference failed for: r5v42, types: [yci] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jd6 jd6Var;
        long j;
        aqi aqiVar;
        boolean z;
        final jd6 jd6Var2;
        final jd6 jd6Var3;
        boolean z2;
        ?? f;
        int i = this.a;
        int i2 = 1;
        vci vciVar = vci.a;
        Object obj4 = gq5.a;
        int i3 = 18;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.i;
        Object obj9 = this.h;
        Object obj10 = this.d;
        Object obj11 = this.c;
        Object obj12 = this.b;
        switch (i) {
            case 0:
                yci yciVar = (yci) obj12;
                fuw fuwVar = (fuw) obj11;
                ai3 ai3Var = (ai3) obj10;
                rce rceVar = (rce) obj7;
                jd6 jd6Var4 = (jd6) obj5;
                rce rceVar2 = (rce) obj6;
                aqi aqiVar2 = (aqi) obj9;
                final aqi aqiVar3 = (aqi) obj8;
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                float d = cVar.d();
                float c = cVar.c();
                oq5 oq5Var2 = (oq5) hq5Var;
                jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                final long i4 = a4g.i(jx7Var.n0(d), jx7Var.n0(c));
                if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                    jd6Var = jd6Var4;
                    j = i4;
                    aqiVar = aqiVar3;
                    z = false;
                    oq5Var2.Z(-1476396354);
                } else {
                    oq5Var2.Z(-1470361181);
                    yci c0 = i4w.c0(yciVar, fuwVar, ai3Var);
                    boolean f2 = oq5Var2.f(jd6Var4) | oq5Var2.e(i4);
                    Object K = oq5Var2.K();
                    if (f2 || K == obj4) {
                        final int i5 = 0;
                        jd6Var3 = jd6Var4;
                        K = new Function1() { // from class: h0d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj13) {
                                bs1 bs1Var = (bs1) obj13;
                                switch (i5) {
                                    case 0:
                                        bs1Var.getClass();
                                        if (bs1Var instanceof as1) {
                                            nmq nmqVar = new nmq(i4w.H(((as1) bs1Var).a, jd6Var3, i4));
                                            aqi aqiVar4 = aqiVar3;
                                            aqiVar4.setValue(nmqVar);
                                            ssg.a(3, null, "ZoomSize image: ".concat(nmq.g(((nmq) aqiVar4.getValue()).a)), null);
                                        }
                                        break;
                                    default:
                                        bs1Var.getClass();
                                        if (bs1Var instanceof as1) {
                                            nmq nmqVar2 = new nmq(i4w.H(((as1) bs1Var).a, jd6Var3, i4));
                                            aqi aqiVar5 = aqiVar3;
                                            aqiVar5.setValue(nmqVar2);
                                            ssg.a(3, null, "ZoomSize image: ".concat(nmq.g(((nmq) aqiVar5.getValue()).a)), null);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        j = i4;
                        aqiVar = aqiVar3;
                        oq5Var2.k0(K);
                    } else {
                        jd6Var3 = jd6Var4;
                        j = i4;
                        aqiVar = aqiVar3;
                    }
                    jd6 jd6Var5 = jd6Var3;
                    p1g.a(rceVar, null, c0, null, (Function1) K, null, jd6Var5, 0.0f, null, 0, oq5Var2, 48, 936);
                    jd6Var = jd6Var5;
                    z = false;
                }
                oq5Var2.p(z);
                yci c02 = i4w.c0(f8g.g0(yciVar, 1.0f), fuwVar, ai3Var);
                boolean f3 = oq5Var2.f(jd6Var) | oq5Var2.e(j);
                Object K2 = oq5Var2.K();
                if (f3 || K2 == obj4) {
                    final int i6 = 1;
                    jd6Var2 = jd6Var;
                    final long j2 = j;
                    final aqi aqiVar4 = aqiVar;
                    K2 = new Function1() { // from class: h0d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj13) {
                            bs1 bs1Var = (bs1) obj13;
                            switch (i6) {
                                case 0:
                                    bs1Var.getClass();
                                    if (bs1Var instanceof as1) {
                                        nmq nmqVar = new nmq(i4w.H(((as1) bs1Var).a, jd6Var2, j2));
                                        aqi aqiVar42 = aqiVar4;
                                        aqiVar42.setValue(nmqVar);
                                        ssg.a(3, null, "ZoomSize image: ".concat(nmq.g(((nmq) aqiVar42.getValue()).a)), null);
                                    }
                                    break;
                                default:
                                    bs1Var.getClass();
                                    if (bs1Var instanceof as1) {
                                        nmq nmqVar2 = new nmq(i4w.H(((as1) bs1Var).a, jd6Var2, j2));
                                        aqi aqiVar5 = aqiVar4;
                                        aqiVar5.setValue(nmqVar2);
                                        ssg.a(3, null, "ZoomSize image: ".concat(nmq.g(((nmq) aqiVar5.getValue()).a)), null);
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var2.k0(K2);
                } else {
                    jd6Var2 = jd6Var;
                }
                p1g.a(rceVar2, null, c02, null, (Function1) K2, null, jd6Var2, 0.0f, null, 0, oq5Var2, 48, 936);
                return Unit.a;
            case 1:
                boolean z3 = true;
                f4h f4hVar = (f4h) obj12;
                sdr sdrVar = (sdr) obj11;
                c6h c6hVar = (c6h) obj10;
                hvb hvbVar = (hvb) obj7;
                sdr sdrVar2 = (sdr) obj6;
                iil iilVar = (iil) obj5;
                mcu mcuVar = (mcu) obj9;
                ab0 ab0Var = (ab0) obj8;
                gvb gvbVar = (gvb) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                gvbVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(gvbVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                boolean z4 = f4hVar instanceof e4h;
                vci vciVar2 = vci.a;
                if (z4) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    oq5Var4.Z(-1177670529);
                    e4h e4hVar = (e4h) f4hVar;
                    int i7 = intValue2 & 14;
                    b2h a = d2h.a(gvbVar, oq5Var4, i7);
                    yci m = d.m(a.q(vciVar2, 0.0f, ivb.a(hvbVar), 0.0f, 0.0f, 13), gvbVar.b());
                    if (i7 != 4) {
                        z3 = false;
                    }
                    boolean f4 = z3 | oq5Var4.f(sdrVar2);
                    Object K3 = oq5Var4.K();
                    if (f4 || K3 == obj4) {
                        K3 = new dae(i3, gvbVar, sdrVar2);
                        oq5Var4.k0(K3);
                    }
                    yci b = androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(m, (Function1) K3), ((dq0) oq5Var4.j(eq0.a)).c.c, o5g.C(oq5Var4));
                    Object K4 = oq5Var4.K();
                    if (K4 == obj4) {
                        K4 = new s2h(10);
                        oq5Var4.k0(K4);
                    }
                    y2h.d(sdrVar, e4hVar, c6hVar, a, nfp.b(b, false, (Function1) K4), oq5Var4, 0);
                    oq5Var4.p(false);
                } else {
                    if (!Intrinsics.d(f4hVar, a4h.a)) {
                        throw vz1.i((oq5) hq5Var2, -1146367817, false);
                    }
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    oq5Var5.Z(-1176639965);
                    String M = rvf.M(R.string.cover_carousel_description, oq5Var5);
                    float f5 = ivb.a;
                    if (gvbVar instanceof fvb) {
                        oq5Var5.Z(-1176523126);
                        un6 b2 = ((wxk) iilVar.a.b.a).b();
                        yci u = xp3.u(d.m(a.q(vciVar2, 0.0f, ivb.a(hvbVar), 0.0f, 0.0f, 13), gvbVar.b()), o5g.C(oq5Var5));
                        boolean f6 = oq5Var5.f(M);
                        Object K5 = oq5Var5.K();
                        if (f6 || K5 == obj4) {
                            K5 = new q1h(M, 3);
                            oq5Var5.k0(K5);
                        }
                        h4a.g(b2, nfp.a(u, (Function1) K5), ild.C(1032103268, new hn6(b2, 2), oq5Var5), null, oq5Var5, 384, 8);
                        z2 = false;
                        oq5Var5.p(false);
                    } else {
                        oq5Var5.Z(-1175397671);
                        boolean z5 = ((u7l) sdrVar.getValue()).a;
                        float b3 = gvbVar.b();
                        yci q = a.q(vciVar2, 0.0f, ivb.a(hvbVar), 0.0f, 0.0f, 13);
                        boolean f7 = oq5Var5.f(M);
                        Object K6 = oq5Var5.K();
                        if (f7 || K6 == obj4) {
                            K6 = new q1h(M, 4);
                            oq5Var5.k0(K6);
                        }
                        qld.f(z5, mcuVar, iilVar, ab0Var, b3, c6hVar, nfp.a(q, (Function1) K6), oq5Var5, 0);
                        z2 = false;
                        oq5Var5.p(false);
                    }
                    oq5Var5.p(z2);
                }
                return Unit.a;
            case 2:
                final rbm rbmVar = (rbm) obj12;
                final jab jabVar = (jab) obj11;
                final u0s u0sVar = (u0s) obj10;
                final x80 x80Var = (x80) obj7;
                final mm6 mm6Var = (mm6) obj6;
                final jx7 jx7Var2 = (jx7) obj5;
                float f8 = edo.b;
                final eoe eoeVar = (eoe) obj9;
                final fvf fvfVar = (fvf) obj8;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                oq5 oq5Var6 = (oq5) hq5Var3;
                if (oq5Var6.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean c2 = oq5Var6.c(f8) | oq5Var6.h(rbmVar) | oq5Var6.h(jabVar) | oq5Var6.h(u0sVar) | oq5Var6.f(x80Var) | oq5Var6.h(mm6Var) | oq5Var6.f(jx7Var2) | oq5Var6.f(eoeVar) | oq5Var6.f(fvfVar);
                    Object K7 = oq5Var6.K();
                    if (c2 || K7 == obj4) {
                        Function0 function0 = new Function0() { // from class: iam
                            {
                                float f9 = edo.a;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float f9 = edo.a;
                                rbm rbmVar2 = rbmVar;
                                rbmVar2.getClass();
                                rmb.j(rbmVar2.e.a(jabVar, u0sVar), wjb.PodcastScreen, null, null, 14);
                                x80Var.invoke(j0s.b);
                                x97.y(mm6Var, null, null, new c5l(jx7Var2, fvfVar, eoeVar, (Continuation) null), 3);
                                return Unit.a;
                            }
                        };
                        oq5Var6.k0(function0);
                        K7 = function0;
                    }
                    swf.l((Function0) K7, androidx.compose.ui.platform.a.a(vciVar, "podcast_popular_tracks_show_more"), null, null, oq5Var6, 48, 12);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 3:
                xsq xsqVar = (xsq) obj12;
                nb6 nb6Var = (nb6) obj11;
                wn5 wn5Var = (wn5) obj10;
                zsq zsqVar = (zsq) obj7;
                ys4 ys4Var = (ys4) obj6;
                ws4 ws4Var = (ws4) obj5;
                hvq hvqVar = (hvq) obj9;
                o3k o3kVar = (o3k) obj8;
                ua5 ua5Var = (ua5) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ua5Var.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(ua5Var) ? 4 : 2;
                }
                int i8 = intValue4;
                if ((i8 & 19) == 18) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                String str = ((jsq) xsqVar).l;
                pcg.k(ua5Var, str, nb6Var, a.c(0.0f, str == null ? gwq.e : 0, 0.0f, 12, 5), ild.C(-1979820441, new kt4(xsqVar, ys4Var, ws4Var, hvqVar, zsqVar, o3kVar, 7), hq5Var4), hq5Var4, (i8 & 14) | 24576, 0);
                wn5Var.invoke(zsqVar, hq5Var4, 48);
                return Unit.a;
            case 4:
                s2v s2vVar = (s2v) obj12;
                List list = (List) obj11;
                onu onuVar = (onu) obj10;
                b4v b4vVar = (b4v) obj7;
                dh3 dh3Var = (dh3) obj6;
                sdr sdrVar3 = (sdr) obj5;
                ab0 ab0Var2 = (ab0) obj8;
                aqi aqiVar5 = (aqi) obj9;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var5).g(booleanValue) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var8 = (oq5) hq5Var5;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                if (booleanValue) {
                    ?? r4 = (oq5) hq5Var5;
                    r4.Z(-532585015);
                    String M2 = rvf.M(R.string.rup_block_title, r4);
                    boolean h = r4.h(s2vVar);
                    Object K8 = r4.K();
                    if (h || K8 == obj4) {
                        K8 = new j6u(0, s2vVar, s2v.class, "onPlayClick", "onPlayClick()V", 0, 25);
                        r4.k0(K8);
                    }
                    h9f h9fVar = (h9f) K8;
                    yci c3 = d.c(vciVar, 1.0f);
                    boolean f9 = r4.f(M2) | r4.h(list);
                    Object K9 = r4.K();
                    if (f9 || K9 == obj4) {
                        K9 = new i20(M2, list, 13);
                        r4.k0(K9);
                    }
                    yci a2 = nfp.a(c3, (Function1) K9);
                    Function0 function02 = (Function0) h9fVar;
                    boolean h2 = r4.h(s2vVar);
                    Object K10 = r4.K();
                    if (h2 || K10 == obj4) {
                        K10 = new qtu(s2vVar, 2);
                        r4.k0(K10);
                    }
                    u1g.p(function02, false, onuVar, a2, (Function1) K10, null, r4, 48, 32);
                    r4.p(false);
                } else {
                    oq5 oq5Var9 = (oq5) hq5Var5;
                    oq5Var9.Z(-531511454);
                    l3v l3vVar = b4vVar.a;
                    boolean h3 = oq5Var9.h(s2vVar);
                    Object K11 = oq5Var9.K();
                    if (h3 || K11 == obj4) {
                        K11 = new j6u(0, s2vVar, s2v.class, "openExpandedPlayer", "openExpandedPlayer()V", 0, 26);
                        oq5Var9.k0(K11);
                    }
                    h9f h9fVar2 = (h9f) K11;
                    boolean h4 = oq5Var9.h(s2vVar);
                    Object K12 = oq5Var9.K();
                    if (h4 || K12 == obj4) {
                        K12 = new j6u(0, s2vVar, s2v.class, "onPlayClick", "onPlayClick()V", 0, 27);
                        oq5Var9.k0(K12);
                    }
                    h9f h9fVar3 = (h9f) K12;
                    boolean h5 = oq5Var9.h(s2vVar);
                    Object K13 = oq5Var9.K();
                    if (h5 || K13 == obj4) {
                        K13 = new j6u(0, s2vVar, s2v.class, "onWaveScreenPrimaryEntityClick", "onWaveScreenPrimaryEntityClick()V", 0, 28);
                        oq5Var9.k0(K13);
                    }
                    h9f h9fVar4 = (h9f) K13;
                    yci a3 = dh3Var.a(vciVar, b2c.f);
                    boolean h6 = oq5Var9.h(b4vVar) | oq5Var9.h(list);
                    Object K14 = oq5Var9.K();
                    if (h6 || K14 == obj4) {
                        K14 = new rtu(b4vVar, list, 0);
                        oq5Var9.k0(K14);
                    }
                    yci a4 = nfp.a(a3, (Function1) K14);
                    Function0 function03 = (Function0) h9fVar2;
                    Function0 function04 = (Function0) h9fVar4;
                    Function0 function05 = (Function0) h9fVar3;
                    boolean h7 = oq5Var9.h(s2vVar);
                    Object K15 = oq5Var9.K();
                    if (h7 || K15 == obj4) {
                        K15 = new qtu(s2vVar, 3);
                        oq5Var9.k0(K15);
                    }
                    Function1 function1 = (Function1) K15;
                    Object K16 = oq5Var9.K();
                    if (K16 == obj4) {
                        K16 = new x80(aqiVar5, 25);
                        oq5Var9.k0(K16);
                    }
                    szf.w(l3vVar, sdrVar3, ab0Var2, function03, function04, function05, function1, a4, null, onuVar, (Function1) K16, null, false, null, null, oq5Var9, 48, 6, 30976);
                    oq5Var9.p(false);
                }
                return Unit.a;
            case 5:
                Function1 function12 = (Function1) obj12;
                sdr sdrVar4 = (sdr) obj11;
                sdr sdrVar5 = (sdr) obj10;
                sdr sdrVar6 = (sdr) obj7;
                Function1 function13 = (Function1) obj6;
                Function0 function06 = (Function0) obj5;
                Function0 function07 = (Function0) obj9;
                Function1 function14 = (Function1) obj8;
                c4v c4vVar = (c4v) obj;
                hq5 hq5Var6 = (hq5) obj2;
                ((Integer) obj3).getClass();
                c4vVar.getClass();
                if (c4vVar instanceof z3v) {
                    oq5 oq5Var10 = (oq5) hq5Var6;
                    oq5Var10.Z(-999494489);
                    eta.p(vciVar, ((gtu) oq5Var10.j(htu.a)).j, oq5Var10, false);
                } else {
                    Continuation continuation = null;
                    if (c4vVar.equals(a4v.a)) {
                        oq5 oq5Var11 = (oq5) hq5Var6;
                        oq5Var11.Z(-999372225);
                        r2v.g(null, oq5Var11, 0);
                        oq5Var11.p(false);
                    } else {
                        if (!(c4vVar instanceof b4v)) {
                            throw vz1.i((oq5) hq5Var6, 799041328, false);
                        }
                        oq5 oq5Var12 = (oq5) hq5Var6;
                        oq5Var12.Z(-999244226);
                        l2v l2vVar = ((b4v) c4vVar).a.b;
                        vci vciVar3 = vciVar;
                        if (function12 != null) {
                            vciVar3 = vciVar;
                            if (!((Boolean) sdrVar4.getValue()).booleanValue()) {
                                float f10 = gvr.a;
                                f = vciVar.f(new SuspendPointerInputElement(function12, null, null, new dur(new veo(function12, continuation, i2)), 6));
                                vciVar3 = f;
                            }
                        }
                        r2v.i(l2vVar, l2vVar, sdrVar5, sdrVar4, sdrVar6, function13, function06, function07, function14, vciVar3, oq5Var12, 0, 0);
                        oq5Var12.p(false);
                    }
                }
                return Unit.a;
            default:
                l2v l2vVar2 = (l2v) obj;
                int intValue6 = ((Integer) obj3).intValue();
                l2vVar2.getClass();
                r2v.i(l2vVar2, (l2v) ((aqi) obj9).getValue(), (sdr) obj12, (sdr) obj11, (sdr) obj10, (Function1) ((aqi) obj8).getValue(), (Function0) ((aqi) obj7).getValue(), (Function0) ((aqi) obj6).getValue(), (Function1) ((aqi) obj5).getValue(), null, (hq5) obj2, intValue6 & 14, RemoteCameraConfig.Mic.BUFFER_SIZE);
                return Unit.a;
        }
    }

    public /* synthetic */ g0d(yci yciVar, fuw fuwVar, ai3 ai3Var, rce rceVar, jd6 jd6Var, rce rceVar2, aqi aqiVar, aqi aqiVar2) {
        this.a = 0;
        this.b = yciVar;
        this.c = fuwVar;
        this.d = ai3Var;
        this.e = rceVar;
        this.g = jd6Var;
        this.f = rceVar2;
        this.h = aqiVar;
        this.i = aqiVar2;
    }

    public /* synthetic */ g0d(sdr sdrVar, sdr sdrVar2, sdr sdrVar3, aqi aqiVar, aqi aqiVar2, aqi aqiVar3, aqi aqiVar4, aqi aqiVar5) {
        this.a = 6;
        this.b = sdrVar;
        this.c = sdrVar2;
        this.d = sdrVar3;
        this.h = aqiVar;
        this.i = aqiVar2;
        this.e = aqiVar3;
        this.f = aqiVar4;
        this.g = aqiVar5;
    }

    public /* synthetic */ g0d(s2v s2vVar, List list, onu onuVar, b4v b4vVar, dh3 dh3Var, sdr sdrVar, ab0 ab0Var, aqi aqiVar) {
        this.a = 4;
        this.b = s2vVar;
        this.c = list;
        this.d = onuVar;
        this.e = b4vVar;
        this.f = dh3Var;
        this.g = sdrVar;
        this.i = ab0Var;
        this.h = aqiVar;
    }

    public /* synthetic */ g0d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    public /* synthetic */ g0d(Function1 function1, sdr sdrVar, sdr sdrVar2, sdr sdrVar3, Function1 function12, Function0 function0, Function0 function02, Function1 function13) {
        this.a = 5;
        this.b = function1;
        this.c = sdrVar;
        this.d = sdrVar2;
        this.e = sdrVar3;
        this.f = function12;
        this.g = function0;
        this.h = function02;
        this.i = function13;
    }
}
