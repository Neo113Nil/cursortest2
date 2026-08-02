package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class kw5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kw5(a8a a8aVar, c cVar) {
        this.a = 17;
        this.c = a8aVar;
        this.b = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        int i2 = 0;
        int i3 = 3;
        int i4 = 2;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                u2x.c((nw5) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                ksw.m((h31) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                zsd.i((gy5) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 3:
                dz5 dz5Var = (dz5) obj4;
                tz5 tz5Var = (tz5) obj3;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                jf0.a(new qzm[0], dz5Var.j, false, ild.C(-139586692, new cz5(tz5Var, i2), hq5Var), hq5Var, 0, 4);
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                ((d16) obj4).A((qnq) obj3, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                up6.g((y26) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                ((i56) obj4).A((wn5) obj3, (hq5) obj, rvf.R(7));
                return Unit.a;
            case 7:
                wn5 wn5Var = (wn5) obj4;
                o14 o14Var = (o14) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(o14Var.b, hq5Var2, 0);
                return Unit.a;
            case 8:
                wn5 wn5Var2 = (wn5) obj4;
                p14 p14Var = (p14) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    wn5Var2.invoke(p14Var.b, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                i4w.h((zg6) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                gh6.g((cdj) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 11:
                wn5 wn5Var3 = (wn5) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                wn5Var3.invoke(arrayList, hq5Var4, 0);
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                xee.h((o78) obj4, (g88) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                saf.j((z88) obj4, (tmb) obj3, (hq5) obj, rvf.R(65));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                irf.x((fp7) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 15:
                i8a i8aVar = (i8a) obj4;
                oa1 oa1Var = (oa1) obj3;
                hq5 hq5Var5 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean f = oq5Var5.f(i8aVar) | oq5Var5.f(oa1Var);
                    Object K = oq5Var5.K();
                    if (f || K == kjnVar) {
                        K = new a8a(i8aVar, i8aVar.f, oa1Var);
                        oq5Var5.k0(K);
                    }
                    ltg.k((a8a) K, null, oq5Var5, 0);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                ltg.k((a8a) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 17:
                a8a a8aVar = (a8a) obj4;
                c cVar = (c) obj3;
                hq5 hq5Var6 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    f8a f8aVar = (f8a) gld.O(a8aVar.c, oq5Var6).getValue();
                    if (f8aVar instanceof d8a) {
                        oq5Var6.Z(956773067);
                        ArrayList arrayList2 = ((d8a) f8aVar).a;
                        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((x7a) it.next()).a);
                        }
                        ghh.e(cVar, arrayList3, vci.a, ild.C(708540910, new n31(i4, a8aVar), oq5Var6), oq5Var6, 3072, 0);
                        oq5Var6.p(false);
                    } else {
                        if (!(f8aVar instanceof e8a)) {
                            throw vz1.i(oq5Var6, -246234481, false);
                        }
                        oq5Var6.Z(957982780);
                        ghh.e(cVar, u75.h(1, 2, 3), null, ild.C(-1345479150, new n31(i3, (e8a) f8aVar), oq5Var6), oq5Var6, 3120, 2);
                        oq5Var6.p(false);
                    }
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                quj.k((laa) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                weo.d((rba) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 20:
                o oVar = (o) obj4;
                fja fjaVar = (fja) obj3;
                hq5 hq5Var7 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean f2 = oq5Var7.f(oVar) | oq5Var7.f(fjaVar);
                    Object K2 = oq5Var7.K();
                    if (f2 || K2 == kjnVar) {
                        K2 = new xia(oVar, fjaVar.b, fjaVar);
                        oq5Var7.k0(K2);
                    }
                    y2x.e((xia) K2, oq5Var7, 0);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                bcx.f((xia) obj4, (n8g) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 22:
                tta ttaVar = (tta) obj4;
                je1 je1Var = (je1) obj3;
                hq5 hq5Var8 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (oq5Var8.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean f3 = oq5Var8.f(ttaVar) | oq5Var8.f(je1Var);
                    Object K3 = oq5Var8.K();
                    if (f3 || K3 == kjnVar) {
                        K3 = new lta(ttaVar, je1Var);
                        oq5Var8.k0(K3);
                    }
                    j66.n((lta) K3, null, oq5Var8, 0);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 23:
                lta ltaVar = (lta) obj4;
                eua euaVar = (eua) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                ltaVar.getClass();
                tta ttaVar2 = ltaVar.a;
                q43 q43Var = ttaVar2.e;
                fta ftaVar = ttaVar2.f;
                String str2 = ftaVar.a.a;
                c70 c70Var = c70.c;
                String str3 = ftaVar.d;
                if (str3 == null) {
                    str3 = "";
                }
                q43Var.h(new d70(str2, c70Var, str3, 0, str), booleanValue);
                if (booleanValue) {
                    kta ktaVar = (kta) ttaVar2.i.getValue();
                    String str4 = euaVar.a;
                    ktaVar.getClass();
                    str4.getClass();
                    jyr jyrVar = k3j.e;
                    if (ixf.x()) {
                        ((oi5) ktaVar.b.getValue()).i(ktaVar.a, str4);
                    } else {
                        ((pi5) ktaVar.c.getValue()).e(str4);
                    }
                }
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                x97.h((zwa) obj4, (yci) obj3, (hq5) obj, rvf.R(9));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                vwb.m((e2o) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 26:
                iwa iwaVar = (iwa) obj4;
                e2o e2oVar = (e2o) obj3;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var9;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                String str5 = iwaVar.f;
                String str6 = iwaVar.g;
                boolean z = iwaVar.b;
                boolean z2 = iwaVar.a;
                e2oVar.getClass();
                gld.m(0, hq5Var9, a.a(vciVar, new sva(z2, e2oVar, i4)), str5, str6, z);
                return Unit.a;
            case 27:
                iwa iwaVar2 = (iwa) obj4;
                Function1 function1 = (Function1) obj3;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var10;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                wua wuaVar = iwaVar2.h;
                oq5 oq5Var11 = (oq5) hq5Var10;
                Object K4 = oq5Var11.K();
                if (K4 == kjnVar) {
                    K4 = new owa(function1, iwaVar2, 1);
                    oq5Var11.k0(K4);
                }
                uua.a(wuaVar, (Function0) K4, d.d(vciVar, 1.0f), oq5Var11, 432);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                vya vyaVar = (vya) ((yfx) obj4).b;
                ih4 ih4Var = (ih4) obj3;
                hq5 hq5Var11 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var11;
                if (oq5Var12.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Object K5 = oq5Var12.K();
                    if (K5 == kjnVar) {
                        K5 = new wya(ih4Var, vyaVar);
                        oq5Var12.k0(K5);
                    }
                    v3g.b((wya) K5, oq5Var12, 0);
                    boolean h = oq5Var12.h(vyaVar);
                    Object K6 = oq5Var12.K();
                    if (h || K6 == kjnVar) {
                        dda ddaVar = new dda(0, vyaVar, w0b.class, "onClose", "onClose()V", 0, 19);
                        oq5Var12.k0(ddaVar);
                        K6 = ddaVar;
                    }
                    wyf.c(null, null, null, null, (Function0) ((h9f) K6), oq5Var12, 0, 31);
                } else {
                    oq5Var12.S();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                irf.n((wya) obj4, (yci) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
        }
    }

    public /* synthetic */ kw5(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ kw5(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
    }
}
