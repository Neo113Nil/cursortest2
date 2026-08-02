package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.TypedValue;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class h54 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h54(dy7 dy7Var, mqs mqsVar, kxi kxiVar, pu0 pu0Var, sai saiVar, boolean z) {
        this.a = 4;
        this.c = dy7Var;
        this.d = mqsVar;
        this.e = kxiVar;
        this.f = pu0Var;
        this.g = saiVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05a5  */
    @Override // defpackage.pyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float d0;
        q6k q6kVar;
        boolean z;
        z2h z2hVar;
        xit xitVar;
        int i = this.a;
        b bVar = b.a;
        kjn kjnVar = gq5.a;
        yci yciVar = vci.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                sdr sdrVar = (sdr) obj8;
                o3k o3kVar = (o3k) obj7;
                o54 o54Var = (o54) obj6;
                zsq zsqVar = (zsq) obj5;
                hvq hvqVar = (hvq) obj4;
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
                oq5 oq5Var2 = (oq5) hq5Var;
                float c0 = ((jx7) oq5Var2.j(es5.h)).c0(ga6.i(cVar.b));
                float f = c0 / 5;
                float f2 = 2;
                float f3 = c0 - (f * f2);
                float sin = c0 * ((float) Math.sin(Math.toRadians(5.0f)));
                boolean z2 = this.b;
                boolean z3 = !z2;
                q0k a = a.a(f, 0.0f, 2);
                float f4 = 0;
                hz2 hz2Var = b2c.k;
                yci e = d.e(yciVar, (sin / f2) + f3);
                boolean f5 = oq5Var2.f(sdrVar);
                Object K = oq5Var2.K();
                if (f5 || K == kjnVar) {
                    K = new la1(sdrVar, 10);
                    oq5Var2.k0(K);
                }
                rvf.b(o3kVar, wyf.s(e, (Function0) K), a, null, 0, f4, hz2Var, null, z3, null, null, null, ild.C(1264016367, new f54(o54Var, o3kVar, sin, zsqVar, hvqVar, z2), oq5Var2), oq5Var2, 1769472, 3072, 7832);
                return Unit.a;
            case 1:
                cvd cvdVar = (cvd) obj8;
                d85 d85Var = (d85) obj7;
                Function1 function1 = (Function1) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function02 = (Function0) obj4;
                c cVar2 = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(cVar2) ? 4 : 2;
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (((Boolean) oq5Var3.j(koe.a)).booleanValue()) {
                        oq5Var3.Z(-1499955315);
                        oq5Var3.p(false);
                        d0 = 56;
                    } else {
                        oq5Var3.Z(-1499913062);
                        agr agrVar = AndroidCompositionLocals_androidKt.b;
                        d0 = ((jx7) oq5Var3.j(es5.h)).d0(TypedValue.complexToDimension(weo.M((Context) oq5Var3.j(agrVar), R.attr.actionBarSize), ((Context) oq5Var3.j(agrVar)).getResources().getDisplayMetrics()));
                        oq5Var3.p(false);
                    }
                    float f6 = d0;
                    boolean z4 = Float.compare(cVar2.d(), (float) 600) < 0;
                    q6k q6kVar2 = cvdVar.a;
                    if (!Intrinsics.d(q6kVar2, zud.k) && !(q6kVar2 instanceof avd)) {
                        if (!(q6kVar2 instanceof yud)) {
                            b6e.s();
                            return null;
                        }
                        if (!z4) {
                            q6kVar = new avd(((yud) q6kVar2).k);
                            wud wudVar = cvdVar.d;
                            int i2 = intValue2 & 14;
                            boolean z5 = this.b;
                            quj.t(cVar2, f6, q6kVar, wudVar, d85Var, z5, function1, function0, oq5Var3, i2);
                            if (z4) {
                                z = false;
                                oq5Var3.Z(-1503915286);
                            } else {
                                oq5Var3.Z(-1498952868);
                                z = false;
                                etn.f(!z5, bVar.a(yciVar, b2c.c), androidx.compose.animation.c.e(weo.S(600, 0, null, 6), 2), androidx.compose.animation.c.f(weo.S(600, 0, null, 6), 2), null, ild.C(2002684875, new u04(cVar2, f6, cvdVar, function1, function02), oq5Var3), oq5Var3, 200064, 16);
                            }
                            oq5Var3.p(z);
                        }
                    }
                    q6kVar = q6kVar2;
                    wud wudVar2 = cvdVar.d;
                    int i22 = intValue2 & 14;
                    boolean z52 = this.b;
                    quj.t(cVar2, f6, q6kVar, wudVar2, d85Var, z52, function1, function0, oq5Var3, i22);
                    if (z4) {
                    }
                    oq5Var3.p(z);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 2:
                b2h b2hVar = (b2h) obj7;
                q0k q0kVar = (q0k) obj6;
                c6h c6hVar = (c6h) obj5;
                sdr sdrVar2 = (sdr) obj8;
                String str = (String) obj4;
                e4h e4hVar = (e4h) obj;
                hq5 hq5Var3 = (hq5) obj2;
                ((Integer) obj3).getClass();
                e4hVar.getClass();
                boolean z6 = e4hVar instanceof d4h;
                boolean z7 = this.b;
                if (z6) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    oq5Var4.Z(-1533293860);
                    xit xitVar2 = new xit(a.a(0.0f, b2hVar.a.a, 1), q0kVar);
                    d4h d4hVar = (d4h) e4hVar;
                    z2h z2hVar2 = d4hVar.b;
                    x3h x3hVar = d4hVar.a;
                    boolean h = oq5Var4.h(c6hVar);
                    Object K2 = oq5Var4.K();
                    if (h || K2 == kjnVar) {
                        K2 = new pef(0, c6hVar, c6h.class, "onLyricsViewed", "onLyricsViewed()V", 0, 27);
                        oq5Var4.k0(K2);
                    }
                    h9f h9fVar = (h9f) K2;
                    boolean h2 = oq5Var4.h(c6hVar);
                    Object K3 = oq5Var4.K();
                    if (h2 || K3 == kjnVar) {
                        K3 = new kef(1, c6hVar, c6h.class, "onSyncLyricClick", "onSyncLyricClick(Lcom/yandex/music/shared/player/screen/api/ui/expanded/model/lyrics/LyricsUiData$Sync$Lyric;)V", 0, 8);
                        oq5Var4.k0(K3);
                    }
                    h9f h9fVar2 = (h9f) K3;
                    boolean h3 = oq5Var4.h(c6hVar);
                    Object K4 = oq5Var4.K();
                    if (h3 || K4 == kjnVar) {
                        K4 = new kef(1, c6hVar, c6h.class, "onLyricsScroll", "onLyricsScroll(Landroidx/compose/foundation/interaction/DragInteraction;)V", 0, 9);
                        oq5Var4.k0(K4);
                    }
                    h9f h9fVar3 = (h9f) K4;
                    oq5Var4.Z(-1850548533);
                    yci c = d.c(yciVar, 1.0f);
                    if (z7) {
                        z2hVar = z2hVar2;
                        xitVar = xitVar2;
                    } else {
                        boolean f7 = oq5Var4.f(str);
                        z2hVar = z2hVar2;
                        Object K5 = oq5Var4.K();
                        if (f7 || K5 == kjnVar) {
                            xitVar = xitVar2;
                            K5 = new q1h(str, 1);
                            oq5Var4.k0(K5);
                        } else {
                            xitVar = xitVar2;
                        }
                        yciVar = nfp.a(yciVar, (Function1) K5);
                    }
                    yci f8 = c.f(yciVar);
                    oq5Var4.p(false);
                    Function1 function12 = (Function1) h9fVar3;
                    Function1 function13 = (Function1) h9fVar2;
                    Function0 function03 = (Function0) h9fVar;
                    boolean h4 = oq5Var4.h(c6hVar);
                    Object K6 = oq5Var4.K();
                    if (h4 || K6 == kjnVar) {
                        K6 = new qvb(c6hVar, 2);
                        oq5Var4.k0(K6);
                    }
                    u7g.o(sdrVar2, xitVar, z2hVar, x3hVar, b2hVar, function12, function13, function03, (Function0) K6, f8, z7, oq5Var4, 0);
                    oq5Var4.p(false);
                } else if (e4hVar instanceof b4h) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    oq5Var5.Z(-1532100174);
                    yci c2 = d.c(yciVar, 1.0f);
                    kfh d = ug3.d(b2c.b, false);
                    int i3 = oq5Var5.P;
                    androidx.compose.runtime.internal.a l = oq5Var5.l();
                    yci H = vnj.H(oq5Var5, c2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    g0g.U(oq5Var5, d, wp5.f);
                    g0g.U(oq5Var5, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var5, i3, kb5Var);
                    }
                    g0g.U(oq5Var5, H, wp5.d);
                    k8a.a(a.q(bVar.a(yciVar, b2hVar.a.e), 0.0f, b2hVar.a.d, 0.0f, 0.0f, 13), oq5Var5, 0);
                    oq5Var5.p(true);
                    oq5Var5.p(false);
                } else {
                    if (!(e4hVar instanceof c4h)) {
                        throw vz1.i((oq5) hq5Var3, -1850577777, false);
                    }
                    oq5 oq5Var6 = (oq5) hq5Var3;
                    oq5Var6.Z(-1531474811);
                    v3h v3hVar = ((c4h) e4hVar).a;
                    boolean h5 = oq5Var6.h(c6hVar);
                    Object K7 = oq5Var6.K();
                    if (h5 || K7 == kjnVar) {
                        K7 = new pef(0, c6hVar, c6h.class, "onStaticLyricsClick", "onStaticLyricsClick()V", 0, 28);
                        oq5Var6.k0(K7);
                    }
                    h9f h9fVar4 = (h9f) K7;
                    boolean h6 = oq5Var6.h(c6hVar);
                    Object K8 = oq5Var6.K();
                    if (h6 || K8 == kjnVar) {
                        K8 = new pef(0, c6hVar, c6h.class, "onLyricsViewed", "onLyricsViewed()V", 0, 29);
                        oq5Var6.k0(K8);
                    }
                    h9f h9fVar5 = (h9f) K8;
                    yci c3 = d.c(yciVar, 1.0f);
                    boolean f9 = oq5Var6.f(str);
                    Object K9 = oq5Var6.K();
                    if (f9 || K9 == kjnVar) {
                        K9 = new q1h(str, 2);
                        oq5Var6.k0(K9);
                    }
                    yci a2 = nfp.a(c3, (Function1) K9);
                    Object K10 = oq5Var6.K();
                    if (K10 == kjnVar) {
                        K10 = new s2h(4);
                        oq5Var6.k0(K10);
                    }
                    f8g.d(v3hVar, (Function1) K10, (Function0) h9fVar4, z7, (Function0) h9fVar5, a2, q0kVar, oq5Var6, 48);
                    oq5Var6.p(false);
                }
                return Unit.a;
            case 3:
                zwp zwpVar = (zwp) obj8;
                vvp vvpVar = (vvp) obj7;
                Function2 function2 = (Function2) obj6;
                wwp wwpVar = (wwp) obj5;
                Function1 function14 = (Function1) obj4;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue3 & 17) == 16) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                v5g.f(zwpVar, (tvp) vvpVar, function2, this.b, wwpVar, function14, androidx.compose.ui.platform.a.a(yciVar, "share_bottom_sheet"), hq5Var4, ScreenMirroringConfig.Video.BITRATE_1_5MB);
                return Unit.a;
            case 4:
                dy7 dy7Var = (dy7) obj8;
                mqs mqsVar = (mqs) obj7;
                kxi kxiVar = (kxi) obj6;
                pu0 pu0Var = (pu0) obj5;
                sai saiVar = (sai) obj4;
                bci bciVar = (bci) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= (intValue4 & 8) == 0 ? ((oq5) hq5Var5).f(bciVar) : ((oq5) hq5Var5).h(bciVar) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var8 = (oq5) hq5Var5;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                dy7Var.getClass();
                mqsVar.getClass();
                kxiVar.getClass();
                uus uusVar = (uus) dy7Var.a.b.getValue();
                uusVar.getClass();
                oq5 oq5Var9 = (oq5) hq5Var5;
                boolean h7 = oq5Var9.h(mqsVar) | oq5Var9.h(kxiVar) | oq5Var9.h(uusVar);
                Object K11 = oq5Var9.K();
                if (h7 || K11 == kjnVar) {
                    K11 = new zzq(7, mqsVar, kxiVar, uusVar);
                    oq5Var9.k0(K11);
                }
                Function1 function15 = (Function1) K11;
                oq5Var9.a0(419377738);
                kfu a3 = rpg.a(oq5Var9);
                if (a3 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                bfu R = ngg.R(ern.a(wus.class), a3, null, k5r.g(wus.class, new p97(1), function15), a3 instanceof ssd ? ((ssd) a3).getDefaultViewModelCreationExtras() : gs6.b, oq5Var9);
                oq5Var9.p(false);
                wus wusVar = (wus) R;
                Object K12 = oq5Var9.K();
                if (K12 == kjnVar) {
                    K12 = new vus(wusVar);
                    oq5Var9.k0(K12);
                }
                vus vusVar = (vus) K12;
                jf0.a(new qzm[0], pu0Var, false, ild.C(1489940396, new qr(18, bciVar, (gy7) gld.M(vusVar.b, hq5Var5).getValue(), vusVar, saiVar, this.b), hq5Var5), hq5Var5, 0, 4);
                return Unit.a;
            default:
                wn5 wn5Var = (wn5) obj8;
                pyc pycVar = (pyc) obj7;
                wn5 wn5Var2 = (wn5) obj6;
                wn5 wn5Var3 = (wn5) obj5;
                ya0 ya0Var = (ya0) obj4;
                c cVar3 = (c) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                cVar3.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var6).f(cVar3) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var10 = (oq5) hq5Var6;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var11 = (oq5) hq5Var6;
                boolean I = asq.I((Configuration) oq5Var11.j(AndroidCompositionLocals_androidKt.a));
                gtu gtuVar = (gtu) oq5Var11.j(htu.a);
                boolean z8 = this.b;
                onu v = rzf.v(cVar3, z8, ((Boolean) oq5Var11.j(upg.a)).booleanValue(), oq5Var11, intValue5 & 14);
                if (I) {
                    oq5Var11.Z(2040682746);
                    gtu gtuVar2 = gtu.p;
                    ivf.b(wn5Var, pycVar, wn5Var2, wn5Var3, z8, v, gtuVar, ya0Var, oq5Var11, 0);
                    oq5Var11.p(false);
                } else {
                    oq5Var11.Z(2041129115);
                    gtu gtuVar3 = gtu.p;
                    ivf.n(wn5Var, pycVar, wn5Var2, wn5Var3, z8, v, gtuVar, ya0Var, oq5Var11, 0);
                    oq5Var11.p(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ h54(cvd cvdVar, d85 d85Var, boolean z, Function1 function1, Function0 function0, Function0 function02) {
        this.a = 1;
        this.c = cvdVar;
        this.d = d85Var;
        this.b = z;
        this.e = function1;
        this.f = function0;
        this.g = function02;
    }

    public /* synthetic */ h54(b2h b2hVar, q0k q0kVar, c6h c6hVar, boolean z, aqi aqiVar, String str) {
        this.a = 2;
        this.d = b2hVar;
        this.e = q0kVar;
        this.f = c6hVar;
        this.b = z;
        this.c = aqiVar;
        this.g = str;
    }

    public /* synthetic */ h54(zwp zwpVar, vvp vvpVar, Function2 function2, boolean z, wwp wwpVar, Function1 function1) {
        this.a = 3;
        this.c = zwpVar;
        this.d = vvpVar;
        this.e = function2;
        this.b = z;
        this.f = wwpVar;
        this.g = function1;
    }

    public /* synthetic */ h54(boolean z, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
