package defpackage;

import android.content.Context;
import androidx.compose.animation.b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.fragment.app.y;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class ntb implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ntb(xxk xxkVar, v2h v2hVar, kub kubVar, poi poiVar, xo6 xo6Var, ek1 ek1Var, Function0 function0) {
        this.a = 2;
        this.c = xxkVar;
        this.b = v2hVar;
        this.d = kubVar;
        this.e = poiVar;
        this.f = xo6Var;
        this.g = ek1Var;
        this.h = function0;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        pu0 pu0Var = (pu0) this.b;
        mvp mvpVar = (mvp) this.c;
        zwp zwpVar = (zwp) this.d;
        sai saiVar = (sai) this.e;
        Context context = (Context) this.f;
        y yVar = (y) this.g;
        fnb fnbVar = (fnb) this.h;
        bci bciVar = (bci) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        bciVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        jf0.a(new qzm[0], pu0Var, false, ild.C(563689536, new vl1(mvpVar, zwpVar, saiVar, context, yVar, fnbVar, bciVar, 9), hq5Var), hq5Var, 0, 4);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x08a7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.K(), java.lang.Integer.valueOf(r14)) == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0ae3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.K(), java.lang.Integer.valueOf(r12)) == false) goto L320;
     */
    @Override // defpackage.pyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wn5 wn5Var;
        wn5 wn5Var2;
        boolean z;
        float f;
        kb5 kb5Var;
        float f2;
        wn5 wn5Var3;
        boolean z2;
        boolean z3;
        h9f h9fVar;
        h9f h9fVar2;
        h9f h9fVar3;
        h9f h9fVar4;
        h9f h9fVar5;
        h9f h9fVar6;
        ld1 ld1Var;
        int i = this.a;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        boolean z4 = false;
        boolean z5 = false;
        Object obj4 = this.h;
        Object obj5 = this.g;
        int i2 = 14;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (i) {
            case 0:
                v2h v2hVar = (v2h) obj10;
                boolean z6 = v2hVar.b;
                boolean z7 = v2hVar.a;
                wn5 wn5Var4 = (wn5) obj9;
                wn5 wn5Var5 = (wn5) obj8;
                wn5 wn5Var6 = (wn5) obj7;
                wn5 wn5Var7 = (wn5) obj6;
                wn5 wn5Var8 = (wn5) obj5;
                wn5 wn5Var9 = (wn5) obj4;
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                iz2 iz2Var = b2c.f;
                iz2 iz2Var2 = b2c.b;
                gz2 gz2Var = b2c.n;
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    float J = fxf.J(cVar.c() / cVar.d(), 2.0f, 1.0f, 0.1f, 0.2f);
                    float f3 = J >= 0.1f ? J : 0.1f;
                    float f4 = f3 <= 0.2f ? f3 : 0.2f;
                    float J2 = fxf.J(((jx7) oq5Var.j(es5.h)).i0(), 1.0f, 2.0f, 240.0f, 360.0f);
                    int compare = Float.compare(cVar.c(), J2);
                    vci vciVar2 = vci.a;
                    if (compare <= 0 || Float.compare(cVar.d(), 240) <= 0) {
                        oq5Var.Z(-1373871442);
                        otb otbVar = new otb(false, tbl.a, 0, cVar.d(), false);
                        yci c = d.c(vciVar2, 1.0f);
                        ta5 a = sa5.a(qx0.e, gz2Var, oq5Var, 6);
                        int i3 = oq5Var.P;
                        a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, c);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.k(grbVar);
                        } else {
                            oq5Var.n0();
                        }
                        g0g.U(oq5Var, a, wp5.f);
                        g0g.U(oq5Var, l, wp5.e);
                        kb5 kb5Var2 = wp5.g;
                        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                            ouj.x(i3, oq5Var, i3, kb5Var2);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        wn5Var4.invoke(otbVar, oq5Var, 0);
                        wn5Var5.invoke(otbVar, oq5Var, 0);
                        oq5Var.p(true);
                        oq5Var.p(false);
                    } else {
                        if (Float.compare(cVar.c(), cVar.d()) >= 0) {
                            float f5 = 2;
                            if (Float.compare(cVar.c() - ((1 - (f4 * f5)) * cVar.d()), J2) >= 0) {
                                oq5Var.Z(-1372928546);
                                float d = cVar.d() * f4;
                                float f6 = d - 20;
                                tbl tblVar = tbl.a;
                                float d2 = cVar.d();
                                otb otbVar2 = new otb(false, tblVar, d, d2, true);
                                float d3 = cVar.d() - (f5 * d);
                                float f7 = 16;
                                float c2 = (cVar.c() - d3) - f7;
                                float f8 = z7 ? f7 : z6 ? c2 - f7 : c2;
                                yci c3 = d.c(vciVar2, 1.0f);
                                kfh d4 = ug3.d(iz2Var2, false);
                                int i4 = oq5Var.P;
                                a l2 = oq5Var.l();
                                yci H2 = vnj.H(oq5Var, c3);
                                xp5.T.getClass();
                                grb grbVar2 = wp5.b;
                                oq5Var.d0();
                                if (oq5Var.O) {
                                    oq5Var.k(grbVar2);
                                } else {
                                    oq5Var.n0();
                                }
                                kb5 kb5Var3 = wp5.f;
                                g0g.U(oq5Var, d4, kb5Var3);
                                kb5 kb5Var4 = wp5.e;
                                g0g.U(oq5Var, l2, kb5Var4);
                                kb5 kb5Var5 = wp5.g;
                                if (!oq5Var.O) {
                                    wn5Var2 = wn5Var4;
                                    break;
                                } else {
                                    wn5Var2 = wn5Var4;
                                }
                                ouj.x(i4, oq5Var, i4, kb5Var5);
                                kb5 kb5Var6 = wp5.d;
                                g0g.U(oq5Var, H2, kb5Var6);
                                yci c4 = d.c(vciVar2, 1.0f);
                                ta5 a2 = sa5.a(qx0.c, gz2Var, oq5Var, 0);
                                int i5 = oq5Var.P;
                                a l3 = oq5Var.l();
                                yci H3 = vnj.H(oq5Var, c4);
                                oq5Var.d0();
                                if (oq5Var.O) {
                                    oq5Var.k(grbVar2);
                                } else {
                                    oq5Var.n0();
                                }
                                g0g.U(oq5Var, a2, kb5Var3);
                                g0g.U(oq5Var, l3, kb5Var4);
                                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                                    ouj.x(i5, oq5Var, i5, kb5Var5);
                                }
                                g0g.U(oq5Var, H3, kb5Var6);
                                float f9 = z6 ? f6 : 0;
                                if (1.0f <= 0.0d) {
                                    qme.a("invalid weight; must be greater than zero");
                                }
                                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                                if (z6) {
                                    z = false;
                                    f = 0;
                                } else {
                                    z = false;
                                    f = f7;
                                }
                                yci a3 = b.a(androidx.compose.foundation.layout.a.q(layoutWeightElement, 0.0f, f, 0.0f, f8, 5), null, 3);
                                kfh d5 = ug3.d(iz2Var2, z);
                                int i6 = oq5Var.P;
                                a l4 = oq5Var.l();
                                yci H4 = vnj.H(oq5Var, a3);
                                oq5Var.d0();
                                if (oq5Var.O) {
                                    oq5Var.k(grbVar2);
                                } else {
                                    oq5Var.n0();
                                }
                                g0g.U(oq5Var, d5, kb5Var3);
                                g0g.U(oq5Var, l4, kb5Var4);
                                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                                    kb5Var = kb5Var5;
                                    ouj.x(i6, oq5Var, i6, kb5Var);
                                } else {
                                    kb5Var = kb5Var5;
                                }
                                g0g.U(oq5Var, H4, kb5Var6);
                                wn5Var6.invoke(otbVar2, androidx.compose.foundation.layout.a.o(vciVar2, f9, 0.0f, 2), oq5Var, 0);
                                oq5Var.p(true);
                                if (z7) {
                                    oq5Var.Z(-966008406);
                                    f2 = f6;
                                    yci o = androidx.compose.foundation.layout.a.o(vciVar2, f2, 0.0f, 2);
                                    kfh d6 = ug3.d(iz2Var2, false);
                                    int i7 = oq5Var.P;
                                    a l5 = oq5Var.l();
                                    yci H5 = vnj.H(oq5Var, o);
                                    oq5Var.d0();
                                    if (oq5Var.O) {
                                        oq5Var.k(grbVar2);
                                    } else {
                                        oq5Var.n0();
                                    }
                                    g0g.U(oq5Var, d6, kb5Var3);
                                    g0g.U(oq5Var, l5, kb5Var4);
                                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                                        ouj.x(i7, oq5Var, i7, kb5Var);
                                    }
                                    g0g.U(oq5Var, H5, kb5Var6);
                                    wn5Var3 = wn5Var2;
                                    wn5Var3.invoke(new otb(true, tblVar, d, d2, true), oq5Var, 0);
                                    z2 = true;
                                    oq5Var.p(true);
                                    z3 = false;
                                } else {
                                    f2 = f6;
                                    wn5Var3 = wn5Var2;
                                    z2 = true;
                                    z3 = false;
                                    oq5Var.Z(-971558119);
                                }
                                oq5Var.p(z3);
                                oq5Var.p(z2);
                                etn.f(!z7, androidx.compose.foundation.layout.b.a.a(d.e(vciVar2, c2), b2c.i), androidx.compose.animation.c.e(null, 3), androidx.compose.animation.c.f(null, 3), null, ild.C(259026567, new lz4(f2, wn5Var3, otbVar2, wn5Var7, wn5Var8, wn5Var5), oq5Var), oq5Var, 200064, 16);
                                oq5Var.p(true);
                                oq5Var.p(false);
                            }
                        }
                        if (Float.compare(cVar.d(), 800) <= 0 || Float.compare(cVar.c(), 450) <= 0) {
                            oq5Var.Z(-1367434168);
                            float d7 = cVar.d() * 0.05f;
                            float d8 = (cVar.d() - (2 * d7)) * 0.5f;
                            if (d8 >= J2) {
                                J2 = d8;
                            }
                            otb otbVar3 = new otb(true, tbl.a, 0, cVar.d(), false);
                            yci o2 = androidx.compose.foundation.layout.a.o(d.e(d.d(vciVar2, 1.0f), J2), d7, 0.0f, 2);
                            ta5 a4 = sa5.a(qx0.c, gz2Var, oq5Var, 0);
                            int i8 = oq5Var.P;
                            a l6 = oq5Var.l();
                            yci H6 = vnj.H(oq5Var, o2);
                            xp5.T.getClass();
                            grb grbVar3 = wp5.b;
                            oq5Var.d0();
                            if (oq5Var.O) {
                                oq5Var.k(grbVar3);
                            } else {
                                oq5Var.n0();
                            }
                            kb5 kb5Var7 = wp5.f;
                            g0g.U(oq5Var, a4, kb5Var7);
                            kb5 kb5Var8 = wp5.e;
                            g0g.U(oq5Var, l6, kb5Var8);
                            kb5 kb5Var9 = wp5.g;
                            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                                ouj.x(i8, oq5Var, i8, kb5Var9);
                            }
                            kb5 kb5Var10 = wp5.d;
                            g0g.U(oq5Var, H6, kb5Var10);
                            wn5Var4.invoke(otbVar3, oq5Var, 0);
                            wn5Var7.invoke(oq5Var, 0);
                            if (1.0f <= 0.0d) {
                                qme.a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, 1.0f);
                            kfh d9 = ug3.d(iz2Var, false);
                            int i9 = oq5Var.P;
                            a l7 = oq5Var.l();
                            yci H7 = vnj.H(oq5Var, layoutWeightElement2);
                            oq5Var.d0();
                            if (oq5Var.O) {
                                oq5Var.k(grbVar3);
                            } else {
                                oq5Var.n0();
                            }
                            g0g.U(oq5Var, d9, kb5Var7);
                            g0g.U(oq5Var, l7, kb5Var8);
                            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                                ouj.x(i9, oq5Var, i9, kb5Var9);
                            }
                            g0g.U(oq5Var, H7, kb5Var10);
                            wn5Var5.invoke(otbVar3, oq5Var, 0);
                            oq5Var.p(true);
                            wn5Var8.invoke(otbVar3, oq5Var, 0);
                            oq5Var.p(true);
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(-1369194565);
                            float d10 = cVar.d() * 0.06f;
                            float d11 = (cVar.d() - (2 * d10)) * 0.4f;
                            otb otbVar4 = new otb(false, tbl.b, 0, cVar.d(), false);
                            yci o3 = androidx.compose.foundation.layout.a.o(cVar.a(d.e(d.d(vciVar2, 1.0f), d11), iz2Var), d10, 0.0f, 2);
                            nho a5 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                            int i10 = oq5Var.P;
                            a l8 = oq5Var.l();
                            yci H8 = vnj.H(oq5Var, o3);
                            xp5.T.getClass();
                            grb grbVar4 = wp5.b;
                            oq5Var.d0();
                            if (oq5Var.O) {
                                oq5Var.k(grbVar4);
                            } else {
                                oq5Var.n0();
                            }
                            kb5 kb5Var11 = wp5.f;
                            g0g.U(oq5Var, a5, kb5Var11);
                            kb5 kb5Var12 = wp5.e;
                            g0g.U(oq5Var, l8, kb5Var12);
                            kb5 kb5Var13 = wp5.g;
                            if (!oq5Var.O) {
                                wn5Var = wn5Var8;
                                break;
                            } else {
                                wn5Var = wn5Var8;
                            }
                            ouj.x(i10, oq5Var, i10, kb5Var13);
                            kb5 kb5Var14 = wp5.d;
                            g0g.U(oq5Var, H8, kb5Var14);
                            double d12 = 1.0f;
                            if (d12 <= 0.0d) {
                                qme.a("invalid weight; must be greater than zero");
                            }
                            yci b = d.b(new LayoutWeightElement(true, 1.0f), 1.0f);
                            ta5 a6 = sa5.a(qx0.c, gz2Var, oq5Var, 0);
                            int i11 = oq5Var.P;
                            a l9 = oq5Var.l();
                            yci H9 = vnj.H(oq5Var, b);
                            oq5Var.d0();
                            if (oq5Var.O) {
                                oq5Var.k(grbVar4);
                            } else {
                                oq5Var.n0();
                            }
                            g0g.U(oq5Var, a6, kb5Var11);
                            g0g.U(oq5Var, l9, kb5Var12);
                            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i11))) {
                                ouj.x(i11, oq5Var, i11, kb5Var13);
                            }
                            g0g.U(oq5Var, H9, kb5Var14);
                            wn5Var4.invoke(otbVar4, oq5Var, 0);
                            wn5Var7.invoke(oq5Var, 0);
                            if (d12 <= 0.0d) {
                                qme.a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(true, 1.0f);
                            kfh d13 = ug3.d(iz2Var, false);
                            int i12 = oq5Var.P;
                            a l10 = oq5Var.l();
                            yci H10 = vnj.H(oq5Var, layoutWeightElement3);
                            oq5Var.d0();
                            if (oq5Var.O) {
                                oq5Var.k(grbVar4);
                            } else {
                                oq5Var.n0();
                            }
                            g0g.U(oq5Var, d13, kb5Var11);
                            g0g.U(oq5Var, l10, kb5Var12);
                            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i12))) {
                                ouj.x(i12, oq5Var, i12, kb5Var13);
                            }
                            g0g.U(oq5Var, H10, kb5Var14);
                            wn5Var5.invoke(otbVar4, oq5Var, 0);
                            oq5Var.p(true);
                            wn5Var.invoke(otbVar4, oq5Var, 0);
                            oq5Var.p(true);
                            yci q = androidx.compose.foundation.layout.a.q(vciVar2, 40, 0.0f, 0.0f, 0.0f, 14);
                            kfh d14 = ug3.d(iz2Var2, false);
                            int i13 = oq5Var.P;
                            a l11 = oq5Var.l();
                            yci H11 = vnj.H(oq5Var, q);
                            oq5Var.d0();
                            if (oq5Var.O) {
                                oq5Var.k(grbVar4);
                            } else {
                                oq5Var.n0();
                            }
                            g0g.U(oq5Var, d14, kb5Var11);
                            g0g.U(oq5Var, l11, kb5Var12);
                            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i13))) {
                                ouj.x(i13, oq5Var, i13, kb5Var13);
                            }
                            g0g.U(oq5Var, H11, kb5Var14);
                            wn5Var9.invoke(oq5Var, 0);
                            oq5Var.p(true);
                            oq5Var.p(true);
                            oq5Var.p(false);
                        }
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                cjc cjcVar = (cjc) obj10;
                rnl rnlVar = (rnl) obj9;
                kub kubVar = (kub) obj8;
                otb otbVar5 = (otb) obj7;
                xo6 xo6Var = (xo6) obj6;
                sdr sdrVar = (sdr) obj5;
                aqi aqiVar = (aqi) obj4;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                yci c5 = d.c(vciVar, 1.0f);
                oq5 oq5Var2 = (oq5) ((hq5) obj2);
                boolean f10 = oq5Var2.f(cjcVar);
                Object K = oq5Var2.K();
                if (f10 || K == kjnVar) {
                    K = new at5(22, cjcVar);
                    oq5Var2.k0(K);
                }
                yci a7 = androidx.compose.ui.graphics.a.a(c5, (Function1) K);
                boolean z8 = ((v7l) sdrVar.getValue()).a;
                qan qanVar = rnlVar.b;
                boolean h = oq5Var2.h(kubVar);
                Object K2 = oq5Var2.K();
                if (h || K2 == kjnVar) {
                    K2 = new o57(1, kubVar, kub.class, "onSwipe", "onSwipe(Lcom/yandex/music/screen/player/ui/components/SwipeDirection;)V", 0, 21);
                    oq5Var2.k0(K2);
                }
                xee.f(qanVar, xo6Var, z8, (pbu) aqiVar.getValue(), (Function1) ((h9f) K2), otbVar5.c, a7, oq5Var2, 48);
                return Unit.a;
            case 2:
                xxk xxkVar = (xxk) obj9;
                v2h v2hVar2 = (v2h) obj10;
                kub kubVar2 = (kub) obj8;
                cjc cjcVar2 = (cjc) obj7;
                xo6 xo6Var2 = (xo6) obj6;
                ek1 ek1Var = (ek1) obj5;
                Function0 function0 = (Function0) obj4;
                otb otbVar6 = (otb) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                otbVar6.getClass();
                boolean z9 = otbVar6.a;
                if ((intValue2 & 6) == 0) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    intValue2 |= (intValue2 & 8) == 0 ? oq5Var3.f(otbVar6) : oq5Var3.h(otbVar6) ? 4 : 2;
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                if (oq5Var4.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (xxkVar.i) {
                        oq5Var4.Z(-981661195);
                        boolean z10 = v2hVar2.a;
                        yci yciVar = vci.a;
                        if (z10) {
                            oq5Var4.Z(-981535924);
                            boolean h2 = oq5Var4.h(kubVar2);
                            Object K3 = oq5Var4.K();
                            if (h2 || K3 == kjnVar) {
                                K3 = new ita(i2, kubVar2);
                                oq5Var4.k0(K3);
                            }
                            yci e = androidx.compose.foundation.a.e(yciVar, false, null, null, (Function0) K3, 7);
                            boolean h3 = oq5Var4.h(kubVar2);
                            Object K4 = oq5Var4.K();
                            if (h3 || K4 == kjnVar) {
                                K4 = new o57(1, kubVar2, kub.class, "onSwipe", "onSwipe(Lcom/yandex/music/screen/player/ui/components/SwipeDirection;)V", 0, 16);
                                oq5Var4.k0(K4);
                            }
                            yciVar = gut.q1(0, oq5Var4, e, (Function1) ((h9f) K4));
                            oq5Var4.p(false);
                        } else {
                            oq5Var4.Z(-981204565);
                            oq5Var4.p(false);
                        }
                        yci yciVar2 = yciVar;
                        boolean f11 = oq5Var4.f(cjcVar2);
                        Object K5 = oq5Var4.K();
                        if (f11 || K5 == kjnVar) {
                            K5 = new wf3(cjcVar2, 13);
                            oq5Var4.k0(K5);
                        }
                        float f12 = 8;
                        yci q2 = androidx.compose.foundation.layout.a.q(wyf.s(yciVar2, (Function0) K5), 12, f12, 0.0f, f12, 4);
                        if (z10) {
                            oq5Var4.Z(-980640490);
                            oq5Var4.p(false);
                            h9fVar = null;
                        } else {
                            oq5Var4.Z(-980629794);
                            boolean h4 = oq5Var4.h(kubVar2);
                            Object K6 = oq5Var4.K();
                            if (h4 || K6 == kjnVar) {
                                K6 = new ceb(0, kubVar2, kub.class, "onShareClick", "onShareClick()V", 0, 4);
                                oq5Var4.k0(K6);
                            }
                            h9fVar = (h9f) K6;
                            oq5Var4.p(false);
                        }
                        boolean h5 = oq5Var4.h(kubVar2);
                        Object K7 = oq5Var4.K();
                        if (h5 || K7 == kjnVar) {
                            K7 = new ceb(0, kubVar2, kub.class, "onMenuClick", "onMenuClick()V", 0, 5);
                            oq5Var4.k0(K7);
                        }
                        h9f h9fVar7 = (h9f) K7;
                        if (z10) {
                            oq5Var4.Z(-980429194);
                            oq5Var4.p(false);
                            h9fVar2 = null;
                        } else {
                            oq5Var4.Z(-980418498);
                            boolean h6 = oq5Var4.h(kubVar2);
                            Object K8 = oq5Var4.K();
                            if (h6 || K8 == kjnVar) {
                                K8 = new ceb(0, kubVar2, kub.class, "onTitleClick", "onTitleClick()V", 0, 6);
                                oq5Var4.k0(K8);
                            }
                            h9fVar2 = (h9f) K8;
                            oq5Var4.p(false);
                        }
                        if (z10) {
                            oq5Var4.Z(-980297258);
                            oq5Var4.p(false);
                            h9fVar3 = null;
                        } else {
                            oq5Var4.Z(-980286438);
                            boolean h7 = oq5Var4.h(kubVar2);
                            Object K9 = oq5Var4.K();
                            if (h7 || K9 == kjnVar) {
                                K9 = new ceb(0, kubVar2, kub.class, "onTitleLongClick", "onTitleLongClick()V", 0, 7);
                                oq5Var4.k0(K9);
                            }
                            h9fVar3 = (h9f) K9;
                            z5 = false;
                            oq5Var4.p(false);
                        }
                        if (z10) {
                            oq5Var4.Z(-980162346);
                            oq5Var4.p(z5);
                            h9fVar4 = null;
                        } else {
                            oq5Var4.Z(-980151557);
                            boolean h8 = oq5Var4.h(kubVar2);
                            Object K10 = oq5Var4.K();
                            if (h8 || K10 == kjnVar) {
                                K10 = new ceb(0, kubVar2, kub.class, "onSubtitleClick", "onSubtitleClick()V", 0, 8);
                                oq5Var4.k0(K10);
                            }
                            h9fVar4 = (h9f) K10;
                            z5 = false;
                            oq5Var4.p(false);
                        }
                        h9f h9fVar8 = h9fVar4;
                        if (z10) {
                            oq5Var4.Z(-980024458);
                            oq5Var4.p(z5);
                            h9fVar5 = null;
                        } else {
                            oq5Var4.Z(-980013545);
                            boolean h9 = oq5Var4.h(kubVar2);
                            Object K11 = oq5Var4.K();
                            if (h9 || K11 == kjnVar) {
                                K11 = new ceb(0, kubVar2, kub.class, "onSubtitleLongClick", "onSubtitleLongClick()V", 0, 9);
                                oq5Var4.k0(K11);
                            }
                            h9fVar5 = (h9f) K11;
                            z5 = false;
                            oq5Var4.p(false);
                        }
                        if (z10) {
                            oq5Var4.Z(-979883594);
                            oq5Var4.p(z5);
                            h9fVar6 = null;
                        } else {
                            oq5Var4.Z(-979872805);
                            boolean h10 = oq5Var4.h(kubVar2);
                            Object K12 = oq5Var4.K();
                            if (h10 || K12 == kjnVar) {
                                K12 = new ceb(0, kubVar2, kub.class, "onSubtitleClick", "onSubtitleClick()V", 0, 3);
                                oq5Var4.k0(K12);
                            }
                            h9fVar6 = (h9f) K12;
                            oq5Var4.p(false);
                        }
                        bo6 a8 = z9 ? xo6Var2.a(xxkVar) : null;
                        if (z9) {
                            ld1Var = null;
                        } else {
                            Map map = (Map) ek1Var.c.getValue();
                            ld1Var = map != null ? (ld1) map.get(xxkVar.p) : null;
                        }
                        zdg.k(q2, xxkVar, a8, ld1Var, function0, (Function0) h9fVar2, (Function0) h9fVar3, (Function0) h9fVar8, (Function0) h9fVar5, (Function0) h9fVar, (Function0) h9fVar7, (Function0) h9fVar6, oq5Var4, 0, 0, 0);
                        z4 = false;
                    } else {
                        oq5Var4.Z(-991839301);
                    }
                    oq5Var4.p(z4);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 3:
                f4h f4hVar = (f4h) obj10;
                sdr sdrVar2 = (sdr) obj9;
                c6h c6hVar = (c6h) obj8;
                mcu mcuVar = (mcu) obj7;
                iil iilVar = (iil) obj6;
                ab0 ab0Var = (ab0) obj5;
                sdr sdrVar3 = (sdr) obj4;
                gvb gvbVar = (gvb) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                gvbVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(gvbVar) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                boolean z11 = f4hVar instanceof e4h;
                vci vciVar3 = vci.a;
                if (z11) {
                    oq5 oq5Var6 = (oq5) hq5Var3;
                    oq5Var6.Z(325533579);
                    e4h e4hVar = (e4h) f4hVar;
                    b2h a9 = d2h.a(gvbVar, oq5Var6, intValue3 & 14);
                    yci m = d.m(androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, ivb.a(gvbVar), 0.0f, 0.0f, 13), gvbVar.b());
                    float floatValue = ((Number) sdrVar3.getValue()).floatValue();
                    yci b2 = androidx.compose.foundation.a.b(gdg.L(m, floatValue, floatValue), ((dq0) oq5Var6.j(eq0.a)).c.c, o5g.C(oq5Var6));
                    Object K13 = oq5Var6.K();
                    if (K13 == kjnVar) {
                        K13 = new s2h(11);
                        oq5Var6.k0(K13);
                    }
                    y2h.d(sdrVar2, e4hVar, c6hVar, a9, nfp.b(b2, false, (Function1) K13), oq5Var6, 0);
                    oq5Var6.p(false);
                } else {
                    if (!Intrinsics.d(f4hVar, a4h.a)) {
                        throw vz1.i((oq5) hq5Var3, -128047290, false);
                    }
                    oq5 oq5Var7 = (oq5) hq5Var3;
                    oq5Var7.Z(326287933);
                    String M = rvf.M(R.string.cover_carousel_description, oq5Var7);
                    boolean z12 = ((u7l) sdrVar2.getValue()).a;
                    float b3 = gvbVar.b();
                    yci q3 = androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, ivb.a(gvbVar), 0.0f, 0.0f, 13);
                    boolean f13 = oq5Var7.f(M);
                    Object K14 = oq5Var7.K();
                    Object obj11 = K14;
                    if (f13 || K14 == kjnVar) {
                        q1h q1hVar = new q1h(M, 5);
                        oq5Var7.k0(q1hVar);
                        obj11 = q1hVar;
                    }
                    qld.f(z12, mcuVar, iilVar, ab0Var, b3, c6hVar, nfp.a(q3, (Function1) obj11), oq5Var7, 0);
                    oq5Var7.p(false);
                }
                return Unit.a;
            case 4:
                return a(obj, obj2, obj3);
            default:
                tqn tqnVar = (tqn) obj10;
                aqi aqiVar2 = (aqi) obj9;
                h9v h9vVar = (h9v) obj8;
                Function0 function02 = (Function0) obj7;
                b7v b7vVar = (b7v) obj6;
                boolean z13 = b7vVar.e;
                Function0 function03 = (Function0) obj5;
                r4v r4vVar = (r4v) obj4;
                sdr sdrVar4 = (sdr) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                sdrVar4.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(sdrVar4) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var8 = (oq5) hq5Var4;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                boolean z14 = tqnVar.a;
                tqnVar.a = false;
                fav favVar = (fav) aqiVar2.getValue();
                if (Intrinsics.d(favVar, bav.b)) {
                    oq5 oq5Var9 = (oq5) hq5Var4;
                    oq5Var9.Z(-898448890);
                    aqi aqiVar3 = h9vVar.a;
                    oq5Var9.Z(-107731913);
                    wje s = fgq.s(fgq.D("wave-words-loading-transition", oq5Var9, 0), 0.0f, 1.0f, weo.C(weo.S(2400, 0, nya.d, 2), jyn.a, 0L, 4), "wave-words-infinite-cycle-progress", oq5Var9, 29112, 0);
                    boolean f14 = oq5Var9.f(s);
                    Object K15 = oq5Var9.K();
                    Object obj12 = K15;
                    if (f14 || K15 == kjnVar) {
                        zx7 U = szf.U(new f6u(s, 26));
                        oq5Var9.k0(U);
                        obj12 = U;
                    }
                    sdr sdrVar5 = (sdr) obj12;
                    Object K16 = oq5Var9.K();
                    Object obj13 = K16;
                    if (K16 == kjnVar) {
                        f9v f9vVar = new f9v(s, sdrVar5);
                        oq5Var9.k0(f9vVar);
                        obj13 = f9vVar;
                    }
                    f9v f9vVar2 = (f9v) obj13;
                    g9v g9vVar = h9vVar.e;
                    g9v g9vVar2 = g9v.a;
                    if (g9vVar == g9vVar2) {
                        oq5Var9.p(false);
                    } else {
                        h9vVar.e = g9vVar2;
                        ssg.a(3, "WaveWordsAnimations", "switch to loading mode", null);
                        if (!Intrinsics.d(aqiVar3.getValue(), f9vVar2)) {
                            aqiVar3.setValue(f9vVar2);
                        }
                        h9vVar.b.setValue(Boolean.TRUE);
                        t9v t9vVar = h9vVar.d;
                        t9vVar.c.setValue(t9vVar, t9v.d[0], x97.y(t9vVar.a, null, null, new s9v(t9vVar, 1.0f, null, false ? 1 : 0), 3));
                        h9vVar.c.b();
                        oq5Var9.p(false);
                    }
                    hag.j(f9vVar2, function02, sdrVar4, oq5Var9, (intValue4 << 6) & 896);
                    oq5Var9.p(false);
                } else if (favVar instanceof eav) {
                    oq5 oq5Var10 = (oq5) hq5Var4;
                    oq5Var10.Z(-898003606);
                    eav eavVar = (eav) favVar;
                    q6v q6vVar = eavVar.b;
                    int ordinal = q6vVar.b.ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        oq5Var10.Z(-897866183);
                        h9vVar.b(q6vVar.a, z13);
                        gdg.o(eavVar, function03, function02, sdrVar4, r4vVar, oq5Var10, (intValue4 << 9) & 7168);
                        oq5Var10.p(false);
                    } else {
                        if (ordinal != 2) {
                            throw vz1.i(oq5Var10, -1830083176, false);
                        }
                        oq5Var10.Z(-897171101);
                        h9vVar.a(false);
                        ocg.i(b7vVar, null, -2, -4, oq5Var10, 3456, 2);
                        oq5Var10.p(false);
                    }
                    oq5Var10.p(false);
                } else if (favVar instanceof aav) {
                    oq5 oq5Var11 = (oq5) hq5Var4;
                    oq5Var11.Z(-896729320);
                    aav aavVar = (aav) favVar;
                    h9vVar.b(aavVar.b.a, z13);
                    dag.o(aavVar, function02, r4vVar, null, oq5Var11, 0);
                    oq5Var11.p(false);
                } else if (favVar instanceof dav) {
                    oq5 oq5Var12 = (oq5) hq5Var4;
                    oq5Var12.Z(-896254338);
                    h9vVar.a(z14);
                    float f15 = -2;
                    float f16 = -4;
                    dav davVar = (dav) favVar;
                    String str = davVar.b;
                    boolean h11 = oq5Var12.h(favVar) | oq5Var12.h(r4vVar);
                    Object K17 = oq5Var12.K();
                    if (h11 || K17 == kjnVar) {
                        K17 = new f6p(19, r4vVar, davVar);
                        oq5Var12.k0(K17);
                    }
                    ocg.i(b7vVar, com.yandex.music.core.ui.compose.a.c(vciVar, null, str, (pyc) K17, 15), f15, f16, oq5Var12, 3456, 0);
                    oq5Var12.p(false);
                } else {
                    if (!Intrinsics.d(favVar, cav.b)) {
                        throw vz1.i((oq5) hq5Var4, -1830097630, false);
                    }
                    oq5 oq5Var13 = (oq5) hq5Var4;
                    oq5Var13.Z(-895670980);
                    g9v g9vVar3 = h9vVar.e;
                    g9v g9vVar4 = g9v.d;
                    if (g9vVar3 != g9vVar4) {
                        h9vVar.e = g9vVar4;
                        ssg.a(3, "WaveWordsAnimations", "switch to none mode", null);
                        h9vVar.a.setValue(null);
                        h9vVar.b.setValue(Boolean.FALSE);
                        h9vVar.d.a(0.0f);
                        h9vVar.c.b();
                    }
                    ocg.i(b7vVar, null, -2, -4, oq5Var13, 3456, 2);
                    oq5Var13.p(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ntb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }
}
