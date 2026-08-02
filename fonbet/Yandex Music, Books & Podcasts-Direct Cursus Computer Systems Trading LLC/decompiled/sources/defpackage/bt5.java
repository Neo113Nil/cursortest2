package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class bt5 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bt5(qw qwVar, float f, bc5 bc5Var, ynn ynnVar, iwm iwmVar, aqi aqiVar) {
        this.c = qwVar;
        this.b = f;
        this.d = bc5Var;
        this.e = ynnVar;
        this.f = iwmVar;
        this.g = aqiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r8.K(), java.lang.Integer.valueOf(r5)) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0353, code lost:
    
        if (r4 == r1) goto L82;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        long j;
        aqi aqiVar;
        oq5 oq5Var;
        b bVar;
        boolean z;
        boolean z2;
        kjn kjnVar;
        Integer d;
        int i = this.a;
        vci vciVar = vci.a;
        d85 d85Var = null;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qwp.k((String) obj7, (String) obj6, (String) obj5, (String) obj4, (yci) obj3, this.b, (hq5) obj, rvf.R(1));
                break;
            case 1:
                iwa iwaVar = (iwa) obj7;
                sdr sdrVar = (sdr) obj6;
                e2o e2oVar = (e2o) obj5;
                zwa zwaVar = (zwa) obj4;
                aqi aqiVar2 = (aqi) obj3;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                d85 T = pd.T(iwaVar.p);
                if (T == null) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(1352753964);
                    j = ((dq0) oq5Var3.j(eq0.a)).c.a;
                    oq5Var3.p(false);
                } else {
                    oq5 oq5Var4 = (oq5) hq5Var;
                    oq5Var4.Z(1352751670);
                    oq5Var4.p(false);
                    j = T.a;
                }
                yci c = d.c(vciVar, 1.0f);
                oq5 oq5Var5 = (oq5) hq5Var;
                boolean f = oq5Var5.f(sdrVar);
                Object K = oq5Var5.K();
                kjn kjnVar2 = gq5.a;
                if (f || K == kjnVar2) {
                    K = new xp(sdrVar, 5);
                    oq5Var5.k0(K);
                }
                yci a = a.a(androidx.compose.ui.graphics.a.a(c, (Function1) K), y9w.U(new Pair[]{new Pair(Float.valueOf(0.0f), new d85(d85.m)), new Pair(Float.valueOf(0.18f), new d85(((dq0) oq5Var5.j(eq0.a)).c.a))}, 14));
                iz2 iz2Var = b2c.b;
                kfh d2 = ug3.d(iz2Var, false);
                int i2 = oq5Var5.P;
                androidx.compose.runtime.internal.a l = oq5Var5.l();
                yci H = vnj.H(oq5Var5, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar);
                } else {
                    oq5Var5.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var5, d2, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var5, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var5.O) {
                    aqiVar = aqiVar2;
                    break;
                } else {
                    aqiVar = aqiVar2;
                }
                ouj.x(i2, oq5Var5, i2, kb5Var3);
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var5, H, kb5Var4);
                float f2 = hva.b;
                q0k q0kVar = new q0k(f2, hva.c, f2, hva.d);
                b bVar2 = b.a;
                yci l2 = androidx.compose.foundation.layout.a.l(bVar2.b(vciVar), q0kVar);
                pzm pzmVar = sqv.a;
                yci q = vnj.q(l2, new wk0(15, q0kVar));
                float f3 = this.b;
                yci b = a.b(xp3.u(androidx.compose.foundation.layout.a.q(q, 0.0f, 0.0f, 0.0f, f3, 7), ugo.a(hva.a)), j, vnj.i);
                kfh d3 = ug3.d(iz2Var, false);
                int i3 = oq5Var5.P;
                androidx.compose.runtime.internal.a l3 = oq5Var5.l();
                yci H2 = vnj.H(oq5Var5, b);
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar);
                } else {
                    oq5Var5.n0();
                }
                g0g.U(oq5Var5, d3, kb5Var);
                g0g.U(oq5Var5, l3, kb5Var2);
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var5, i3, kb5Var3);
                }
                g0g.U(oq5Var5, H2, kb5Var4);
                if (iwaVar.q != null) {
                    oq5Var5.Z(-2094796429);
                    bVar = bVar2;
                    p1g.a(iwaVar.q, null, bVar.a(bVar.b(vciVar), b2c.f), null, null, null, hd6.c, 0.0f, null, 0, oq5Var5, 1572912, 952);
                    oq5Var = oq5Var5;
                    z = false;
                } else {
                    oq5Var = oq5Var5;
                    bVar = bVar2;
                    z = false;
                    oq5Var.Z(-2101759215);
                }
                oq5Var.p(z);
                oq5Var.p(true);
                yci v = xp3.v(androidx.compose.foundation.layout.a.o(d.c(vciVar, 1.0f), f2, 0.0f, 2));
                kfh d4 = ug3.d(iz2Var, false);
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l4 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, v);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d4, kb5Var);
                g0g.U(oq5Var, l4, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                String str = iwaVar.o;
                boolean z3 = iwaVar.a;
                iz2 iz2Var2 = b2c.c;
                tva.a(str, z3, e2oVar, bVar.a(vciVar, iz2Var2), oq5Var, 0);
                if (iwaVar.a) {
                    oq5Var.Z(-1542079356);
                    z2 = false;
                    vwb.m(e2oVar, androidx.compose.foundation.layout.a.q(bVar.a(vciVar, iz2Var2), 0.0f, tva.e - 16, 0.0f, 0.0f, 13), oq5Var, 0);
                } else {
                    z2 = false;
                    oq5Var.Z(-1549983302);
                }
                oq5Var.p(z2);
                oq5Var.p(true);
                boolean f4 = oq5Var.f(e2oVar);
                Object K2 = oq5Var.K();
                if (!f4) {
                    kjnVar = kjnVar2;
                    break;
                } else {
                    kjnVar = kjnVar2;
                }
                K2 = new nha(3, e2oVar);
                oq5Var.k0(K2);
                Function2 function2 = (Function2) K2;
                boolean h = oq5Var.h(zwaVar);
                Object K3 = oq5Var.K();
                if (h || K3 == kjnVar) {
                    K3 = new qua(zwaVar, 3);
                    oq5Var.k0(K3);
                }
                boolean z4 = z2;
                rwa.a(iwaVar, e2oVar, function2, (Function1) K3, androidx.compose.foundation.layout.a.o(vciVar, f2, 0.0f, 2), oq5Var, 24576);
                if (iwaVar.l != null) {
                    oq5Var.Z(2117584756);
                    up6.h(iwaVar, androidx.compose.foundation.layout.a.q(vnj.q(androidx.compose.foundation.layout.a.l(bVar.b(vciVar), q0kVar), new wk0(15, q0kVar)), 0.0f, 0.0f, 0.0f, f3, 7), oq5Var, z4 ? 1 : 0);
                } else {
                    oq5Var.Z(2108710231);
                }
                oq5Var.p(z4);
                Object K4 = oq5Var.K();
                if (K4 == kjnVar) {
                    K4 = new jc(aqiVar, 9);
                    oq5Var.k0(K4);
                }
                xua.a(iwaVar, (Function0) K4, androidx.compose.foundation.layout.a.q(bVar.a(vciVar, b2c.d), 0.0f, hva.f, f2 + hva.e, 0.0f, 9), oq5Var, 48);
                oq5Var.p(true);
                break;
            case 2:
                qw qwVar = (qw) obj7;
                bc5 bc5Var = (bc5) obj6;
                ynn ynnVar = (ynn) obj5;
                iwm iwmVar = (iwm) obj4;
                sdr sdrVar2 = (sdr) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                u9b u9bVar = qwVar.b;
                if (u9bVar != null && (d = u9bVar.d()) != null) {
                    d85Var = new d85(c3x.f(d.intValue()));
                }
                lg3.i(xp3.u(d.r(androidx.compose.foundation.layout.a.o(androidx.compose.ui.platform.a.a(vciVar, "simple_album_promo_block"), 16, 0.0f, 2), this.b), o5g.C(hq5Var2)), d85Var, null, null, null, ild.C(-1054714440, new k71(bc5Var, ynnVar, iwmVar, qwVar, sdrVar2, 6), hq5Var2), hq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 60);
                break;
            default:
                mm6 mm6Var = (mm6) obj7;
                x8a x8aVar = (x8a) obj6;
                fvf fvfVar = (fvf) obj4;
                uqn uqnVar = (uqn) obj3;
                lfm lfmVar = (lfm) obj;
                float floatValue = ((Float) obj2).floatValue();
                lfmVar.getClass();
                float f5 = w8u.a;
                if (((i2u) obj5).a() == null) {
                    x97.y(mm6Var, null, null, new t8u(fvfVar, floatValue, uqnVar, this.b, null), 3);
                }
                x8aVar.a(lfmVar.b, lfmVar.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bt5(mm6 mm6Var, x8a x8aVar, i2u i2uVar, fvf fvfVar, uqn uqnVar, float f) {
        this.c = mm6Var;
        this.d = x8aVar;
        this.e = i2uVar;
        this.f = fvfVar;
        this.g = uqnVar;
        this.b = f;
    }

    public /* synthetic */ bt5(iwa iwaVar, sdr sdrVar, float f, e2o e2oVar, zwa zwaVar, aqi aqiVar) {
        this.c = iwaVar;
        this.d = sdrVar;
        this.b = f;
        this.e = e2oVar;
        this.f = zwaVar;
        this.g = aqiVar;
    }

    public /* synthetic */ bt5(String str, String str2, String str3, String str4, yci yciVar, float f, int i) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = yciVar;
        this.b = f;
    }
}
