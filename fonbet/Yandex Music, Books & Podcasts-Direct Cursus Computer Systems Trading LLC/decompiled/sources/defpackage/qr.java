package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.k;
import com.yandex.plus.divkit.impl.b;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class qr implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qr(az2 az2Var, w3g w3gVar, Function0 function0, Function0 function02, boolean z) {
        this.a = 12;
        this.d = az2Var;
        this.e = w3gVar;
        this.b = function0;
        this.f = function02;
        this.c = z;
    }

    private final Object a(Object obj, Object obj2) {
        fk0 fk0Var = (fk0) this.d;
        final d24 d24Var = (d24) this.e;
        aqi aqiVar = (aqi) this.f;
        jx7 jx7Var = (jx7) this.b;
        utf utfVar = (utf) obj;
        ga6 ga6Var = (ga6) obj2;
        utfVar.getClass();
        final float floatValue = ((Number) fk0Var.e()).floatValue();
        int b = eeh.b(floatValue / d24Var.e);
        aqiVar.setValue(Integer.valueOf(b));
        int i = d24Var.i;
        int i2 = b - i;
        IntRange intRange = new IntRange(i2, b + i, 1);
        long j = d24Var.b;
        int b2 = eeh.b(jx7Var.n0(fma.c(j)));
        int b3 = eeh.b(jx7Var.n0(fma.b(j)));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = intRange.b;
        if (i3 > 99999) {
            i3 = 99999;
        }
        IntRange intRange2 = new IntRange(i2, i3, 1);
        final ArrayList arrayList = new ArrayList(v75.o(intRange2, 10));
        ype it = intRange2.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            Integer valueOf = Integer.valueOf(nextInt);
            if (!((b2 >= 0) & (b3 >= 0))) {
                ume.a("width and height must be >= 0");
            }
            arrayList.add(new Pair(valueOf, CollectionsKt.Q(utfVar.a(nextInt, ia6.h(b2, b2, b3, b3)))));
        }
        int i4 = ga6.i(ga6Var.a);
        int h = ga6.h(ga6Var.a);
        final boolean z = this.c;
        return mfh.m0(utfVar, i4, h, new Function1() { // from class: miv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                float f;
                int b4;
                int i5;
                jsk jskVar = (jsk) obj3;
                jskVar.getClass();
                for (Pair pair : arrayList) {
                    int intValue = ((Number) pair.a).intValue();
                    ksk kskVar = (ksk) pair.b;
                    d24 d24Var2 = d24Var;
                    float f2 = d24Var2.g;
                    float f3 = d24Var2.e;
                    float f4 = ((intValue * f3) + f2) - floatValue;
                    float f5 = d24Var2.j / 2.0f;
                    if (f4 >= (-f5) && f4 <= d24Var2.f + f5) {
                        float sin = (1.2f - (0.35000002f * ((float) Math.sin(yhn.c(((f4 - f2) / d24Var2.k) + 0.5f, 0.0f, 1.0f) * 3.141592653589793d)))) * d24Var2.h;
                        float f6 = d24Var2.l * 0.8f;
                        float f7 = kskVar.a / 2.0f;
                        float f8 = kskVar.b / 2.0f;
                        boolean z2 = z;
                        if (z2) {
                            i5 = eeh.b(sin - f7);
                            b4 = eeh.b((f4 - f6) - f8);
                            f = f4;
                        } else {
                            int b5 = eeh.b((f4 - f6) - f7);
                            f = -f4;
                            b4 = eeh.b(sin - f8);
                            i5 = b5;
                        }
                        float f9 = (f4 - d24Var2.g) / f3;
                        float abs = 1.0f - (Math.abs(f9) * 0.1f);
                        float f10 = abs >= 0.8f ? abs : 0.8f;
                        float abs2 = Math.abs(f9);
                        float f11 = abs2 <= 2.0f ? 0.05f * abs2 * abs2 * f3 : ((abs2 * 0.2f) - 0.2f) * 1.0f * f3;
                        if (f9 >= 0.0f) {
                            f11 = -f11;
                        }
                        int b6 = eeh.b(f11);
                        int i6 = i5 + (!z2 ? b6 : 0);
                        if (!z2) {
                            b6 = 0;
                        }
                        jskVar.i(kskVar, i6, b4 + b6, f, new vp(5, f10));
                    }
                }
                return Unit.a;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0359, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7.K(), java.lang.Integer.valueOf(r10)) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0673  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        oq5 oq5Var;
        boolean z2;
        Function0 function0;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj3;
        boolean z6;
        Integer num;
        int ordinal;
        vci vciVar;
        yci yciVar;
        boolean z7;
        yci f;
        int i = this.a;
        int i2 = 15;
        kjn kjnVar = gq5.a;
        yci yciVar2 = vci.a;
        boolean z8 = this.c;
        int i3 = 2;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                j00 j00Var = (j00) obj7;
                jab jabVar = (jab) obj6;
                thj thjVar = (thj) obj5;
                Function0 function02 = (Function0) obj4;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    laa laaVar = (laa) gld.M(j00Var.n, oq5Var2).getValue();
                    boolean h = oq5Var2.h(j00Var) | oq5Var2.h(jabVar) | oq5Var2.h(thjVar);
                    Object K = oq5Var2.K();
                    if (h || K == kjnVar) {
                        K = new rr(j00Var, jabVar, thjVar, 0);
                        oq5Var2.k0(K);
                    }
                    etn.r(laaVar, (Function0) K, function02, false, null, 0, oq5Var2, 0, 56);
                    boolean booleanValue = ((Boolean) gld.M(j00Var.l, oq5Var2).getValue()).booleanValue();
                    int intValue2 = ((Number) gld.M(j00Var.m, oq5Var2).getValue()).intValue();
                    boolean h2 = oq5Var2.h(j00Var) | oq5Var2.h(jabVar) | oq5Var2.h(thjVar);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == kjnVar) {
                        K2 = new rr(j00Var, jabVar, thjVar, 1);
                        oq5Var2.k0(K2);
                    }
                    cb0.a(booleanValue, intValue2, function02, (Function0) K2, false, false, false, null, null, 0, oq5Var2, 0, 1008);
                    if (z8) {
                        oq5Var2.Z(1158415263);
                        ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                        int i4 = oq5Var2.P;
                        a l = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, yciVar2);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, a, wp5.f);
                        g0g.U(oq5Var2, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                            ouj.x(i4, oq5Var2, i4, kb5Var);
                        }
                        g0g.U(oq5Var2, H, wp5.d);
                        boolean h3 = oq5Var2.h(j00Var) | oq5Var2.h(jabVar) | oq5Var2.h(thjVar);
                        Object K3 = oq5Var2.K();
                        if (h3 || K3 == kjnVar) {
                            K3 = new rr(j00Var, jabVar, thjVar, i3);
                            oq5Var2.k0(K3);
                        }
                        y1g.q((Function0) K3, function02, null, oq5Var2, 0, 4);
                        oq5Var2.p(true);
                        z = false;
                    } else {
                        z = false;
                        oq5Var2.Z(1155803203);
                    }
                    oq5Var2.p(z);
                    boolean booleanValue2 = ((Boolean) gld.M(j00Var.k, oq5Var2).getValue()).booleanValue();
                    boolean h4 = oq5Var2.h(j00Var) | oq5Var2.h(jabVar) | oq5Var2.h(thjVar);
                    Object K4 = oq5Var2.K();
                    if (h4 || K4 == kjnVar) {
                        K4 = new rr(j00Var, jabVar, thjVar, 3);
                        oq5Var2.k0(K4);
                    }
                    y5g.h(booleanValue2, function02, (Function0) K4, false, false, oq5Var2, 0, 24);
                } else {
                    oq5Var2.S();
                }
                break;
            case 1:
                ka1 ka1Var = (ka1) obj7;
                yi1 yi1Var = (yi1) obj6;
                Function0 function03 = (Function0) obj4;
                tvd tvdVar = (tvd) obj5;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                if (ka1Var.h == null) {
                    oq5Var = (oq5) hq5Var2;
                    oq5Var.Z(1609699091);
                    z2 = false;
                } else {
                    oq5Var = (oq5) hq5Var2;
                    oq5Var.Z(1609699092);
                    kfh d = ug3.d(b2c.b, false);
                    int i5 = oq5Var.P;
                    a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, yciVar2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar2);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d, wp5.f);
                    g0g.U(oq5Var, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var2);
                    }
                    g0g.U(oq5Var, H2, wp5.d);
                    boolean h5 = oq5Var.h(yi1Var);
                    Object K5 = oq5Var.K();
                    if (h5 || K5 == kjnVar) {
                        K5 = new zb0(yi1Var);
                        oq5Var.k0(K5);
                    }
                    com.yandex.music.core.ui.compose.a.a((Function0) K5, oq5Var, 0);
                    boolean h6 = oq5Var.h(yi1Var);
                    Object K6 = oq5Var.K();
                    if (h6 || K6 == kjnVar) {
                        K6 = new z3(20, yi1Var);
                        oq5Var.k0(K6);
                    }
                    z2 = false;
                    irf.m((Function0) K6, function03, oq5Var, 0);
                    oq5Var.p(true);
                }
                oq5Var.p(z2);
                aqi M = gld.M(yi1Var.l, hq5Var2);
                boolean z9 = ((tzf) M.getValue()).a;
                int i6 = ((tzf) M.getValue()).b;
                oq5 oq5Var4 = (oq5) hq5Var2;
                boolean h7 = oq5Var4.h(yi1Var);
                Object K7 = oq5Var4.K();
                if (h7 || K7 == kjnVar) {
                    K7 = new m71(0, yi1Var, yi1.class, "onLikeClick", "onLikeClick()V", 0, 1);
                    oq5Var4.k0(K7);
                }
                cb0.a(z9, i6, function03, (Function0) ((h9f) K7), false, false, false, null, null, 0, oq5Var4, 0, 1008);
                if (z8) {
                    oq5Var4.Z(1610354897);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                    int i7 = oq5Var4.P;
                    a l3 = oq5Var4.l();
                    yci H3 = vnj.H(oq5Var4, yciVar2);
                    xp5.T.getClass();
                    grb grbVar3 = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar3);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, a2, wp5.f);
                    g0g.U(oq5Var4, l3, wp5.e);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var4, i7, kb5Var3);
                    }
                    g0g.U(oq5Var4, H3, wp5.d);
                    boolean h8 = oq5Var4.h(yi1Var);
                    Object K8 = oq5Var4.K();
                    if (h8 || K8 == kjnVar) {
                        K8 = new m71(0, yi1Var, yi1.class, "onTrailerClick", "onTrailerClick()V", 0, 2);
                        oq5Var4.k0(K8);
                    }
                    y1g.q((Function0) ((h9f) K8), function03, null, oq5Var4, 0, 4);
                    function0 = function03;
                    oq5Var4.p(true);
                    z3 = false;
                } else {
                    function0 = function03;
                    z3 = false;
                    oq5Var4.Z(1607378618);
                }
                oq5Var4.p(z3);
                oq5Var4.Z(1021788845);
                Object K9 = oq5Var4.K();
                if (K9 == kjnVar) {
                    K9 = szf.U(new or(3, function0));
                    oq5Var4.k0(K9);
                }
                boolean booleanValue3 = ((Boolean) ((sdr) K9).getValue()).booleanValue();
                oq5Var4.p(false);
                if (booleanValue3) {
                    oq5Var4.Z(1610776776);
                    boolean booleanValue4 = ((Boolean) gld.M(yi1Var.m, oq5Var4).getValue()).booleanValue();
                    oq5Var4.p(false);
                    z4 = booleanValue4;
                } else {
                    oq5Var4.Z(1610862925);
                    oq5Var4.p(false);
                    z4 = false;
                }
                Object K10 = oq5Var4.K();
                if (K10 == kjnVar) {
                    K10 = szf.U(new nr(tvdVar, i3));
                    oq5Var4.k0(K10);
                }
                boolean booleanValue5 = ((Boolean) ((sdr) K10).getValue()).booleanValue();
                boolean h9 = oq5Var4.h(yi1Var);
                Object K11 = oq5Var4.K();
                if (h9 || K11 == kjnVar) {
                    K11 = new m71(0, yi1Var, yi1.class, "onPlayClick", "onPlayClick()V", 0, 3);
                    oq5Var4.k0(K11);
                }
                y5g.h(z4, function0, (Function0) ((h9f) K11), booleanValue5, booleanValue3, oq5Var4, 0, 0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                n7w.l((ew5) obj7, (Function0) obj4, this.c, (yci) obj6, (fvf) obj5, (hq5) obj, rvf.R(9));
                break;
            case 3:
                t16 t16Var = (t16) obj7;
                Function0 function04 = (Function0) obj4;
                String str = (String) obj6;
                Function0 function05 = (Function0) obj5;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                bg3.a(d.e(d.d(gut.p1(androidx.compose.foundation.a.b(yciVar2, svd.a(hq5Var3), vnj.i)), 1.0f), 56), null, false, ild.C(-341031746, new zv5(this.c, t16Var, function04, str, function05), hq5Var3), hq5Var3, 3072, 6);
            case 4:
                ((Integer) obj2).getClass();
                lxe.c((z9u) obj7, (hp4) obj6, (yci) obj5, (e9g) obj4, this.c, (hq5) obj, rvf.R(1));
                break;
            case 5:
                d8t d8tVar = (d8t) obj7;
                wdc wdcVar = (wdc) obj6;
                wn5 wn5Var = (wn5) obj4;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                oct octVar = azt.a;
                Object c = d8tVar.c();
                oq5 oq5Var7 = (oq5) hq5Var4;
                oq5Var7.Z(1621562740);
                float f2 = Intrinsics.d(c, obj5) ? 1.0f : 0.0f;
                oq5Var7.p(false);
                Float valueOf = Float.valueOf(f2);
                Object value = d8tVar.d.getValue();
                oq5Var7.Z(1621562740);
                float f3 = Intrinsics.d(value, obj5) ? 1.0f : 0.0f;
                oq5Var7.p(false);
                Float valueOf2 = Float.valueOf(f3);
                d8tVar.f().getClass();
                oq5Var7.Z(-865719675);
                oq5Var7.p(false);
                z7t c2 = i8t.c(d8tVar, valueOf, valueOf2, wdcVar, octVar, oq5Var7, 0);
                boolean f4 = oq5Var7.f(c2) | oq5Var7.g(z8);
                Object K12 = oq5Var7.K();
                if (f4 || K12 == kjnVar) {
                    z5 = false;
                    nu6 nu6Var = new nu6(z8, c2, 0);
                    oq5Var7.k0(nu6Var);
                    obj3 = nu6Var;
                } else {
                    z5 = false;
                    obj3 = K12;
                }
                yci a3 = androidx.compose.ui.graphics.a.a(yciVar2, (Function1) obj3);
                kfh d2 = ug3.d(b2c.b, z5);
                int i8 = oq5Var7.P;
                a l4 = oq5Var7.l();
                yci H4 = vnj.H(oq5Var7, a3);
                xp5.T.getClass();
                grb grbVar4 = wp5.b;
                oq5Var7.d0();
                if (oq5Var7.O) {
                    oq5Var7.k(grbVar4);
                } else {
                    oq5Var7.n0();
                }
                g0g.U(oq5Var7, d2, wp5.f);
                g0g.U(oq5Var7, l4, wp5.e);
                kb5 kb5Var4 = wp5.g;
                if (oq5Var7.O || !Intrinsics.d(oq5Var7.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var7, i8, kb5Var4);
                }
                g0g.U(oq5Var7, H4, wp5.d);
                wn5Var.invoke(obj5, oq5Var7, 0);
                oq5Var7.p(true);
                break;
            case 6:
                zrj zrjVar = (zrj) obj7;
                Function1 function1 = (Function1) obj6;
                p0p p0pVar = (p0p) obj5;
                c0p c0pVar = (c0p) obj4;
                hq5 hq5Var5 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                Integer valueOf3 = Integer.valueOf(R.string.context_search_empty_my_collection);
                oq5 oq5Var8 = (oq5) hq5Var5;
                if (oq5Var8.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    vci vciVar2 = vci.a;
                    if (zrjVar != null) {
                        oq5Var8.Z(1097126358);
                        yci q = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 16, 0.0f, 0.0f, 13);
                        boolean f5 = oq5Var8.f(function1) | oq5Var8.f(zrjVar);
                        Object K13 = oq5Var8.K();
                        if (f5 || K13 == kjnVar) {
                            z6 = false;
                            K13 = new l5b(function1, zrjVar, 0);
                            oq5Var8.k0(K13);
                        } else {
                            z6 = false;
                        }
                        ocg.a(zrjVar, (Function0) K13, q, oq5Var8, 384);
                    } else {
                        z6 = false;
                        oq5Var8.Z(1094650388);
                    }
                    oq5Var8.p(z6);
                    float f6 = 40;
                    float f7 = 16;
                    yci d3 = d.d(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, f6, 0.0f, f7, 5), 1.0f);
                    ta5 a4 = sa5.a(qx0.c, b2c.o, oq5Var8, 48);
                    int i9 = oq5Var8.P;
                    a l5 = oq5Var8.l();
                    yci H5 = vnj.H(oq5Var8, d3);
                    xp5.T.getClass();
                    grb grbVar5 = wp5.b;
                    oq5Var8.d0();
                    if (oq5Var8.O) {
                        oq5Var8.k(grbVar5);
                    } else {
                        oq5Var8.n0();
                    }
                    g0g.U(oq5Var8, a4, wp5.f);
                    g0g.U(oq5Var8, l5, wp5.e);
                    kb5 kb5Var5 = wp5.g;
                    if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var8, i9, kb5Var5);
                    }
                    g0g.U(oq5Var8, H5, wp5.d);
                    w4k E = a0g.E(R.drawable.ic_search_24, 0, oq5Var8);
                    yci m = d.m(vciVar2, 64);
                    agr agrVar = eq0.a;
                    gae.b(E, null, m, ((dq0) oq5Var8.j(agrVar)).a.a, oq5Var8, 432, 0);
                    u1g.l(oq5Var8, d.e(vciVar2, f6));
                    switch (p0pVar.ordinal()) {
                        case 0:
                        case 26:
                            num = null;
                            ordinal = c0pVar.ordinal();
                            if (ordinal != 0) {
                                valueOf3 = Integer.valueOf(R.string.context_search_empty_kids);
                            } else if (ordinal == 1) {
                                valueOf3 = Integer.valueOf(R.string.context_search_empty_podcast);
                            } else if (ordinal != 2) {
                                if (ordinal == 3) {
                                    valueOf3 = null;
                                } else if (ordinal != 4) {
                                    b6e.s();
                                    break;
                                } else {
                                    valueOf3 = Integer.valueOf(R.string.context_search_empty_concert);
                                }
                            }
                            Integer valueOf4 = !z8 ? Integer.valueOf(R.string.search_empty_result_with_filter) : null;
                            int intValue4 = valueOf4 == null ? valueOf4.intValue() : num != null ? num.intValue() : valueOf3 != null ? valueOf3.intValue() : R.string.search_empty_result_online;
                            xcs.b(rvf.M(intValue4, oq5Var8), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar2, f7, 0.0f, 2), "nothing_found_text"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65020);
                            xcs.b(rvf.M((valueOf4 != null && intValue4 == valueOf4.intValue()) ? R.string.search_empty_result_description_with_filter : R.string.search_empty_result_description, oq5Var8), d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 8, 0.0f, 0.0f, 13), f7, 0.0f, 2), 1.0f), ((dq0) oq5Var8.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65016);
                            oq5Var8.p(true);
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            num = Integer.valueOf(R.string.context_search_empty_playlist);
                            ordinal = c0pVar.ordinal();
                            if (ordinal != 0) {
                            }
                            if (!z8) {
                            }
                            if (valueOf4 == null) {
                            }
                            xcs.b(rvf.M(intValue4, oq5Var8), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar2, f7, 0.0f, 2), "nothing_found_text"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65020);
                            if (valueOf4 != null) {
                                xcs.b(rvf.M((valueOf4 != null && intValue4 == valueOf4.intValue()) ? R.string.search_empty_result_description_with_filter : R.string.search_empty_result_description, oq5Var8), d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 8, 0.0f, 0.0f, 13), f7, 0.0f, 2), 1.0f), ((dq0) oq5Var8.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65016);
                                oq5Var8.p(true);
                                break;
                            }
                            xcs.b(rvf.M((valueOf4 != null && intValue4 == valueOf4.intValue()) ? R.string.search_empty_result_description_with_filter : R.string.search_empty_result_description, oq5Var8), d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 8, 0.0f, 0.0f, 13), f7, 0.0f, 2), 1.0f), ((dq0) oq5Var8.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65016);
                            oq5Var8.p(true);
                            break;
                        case 5:
                            num = Integer.valueOf(R.string.context_search_empty_chart);
                            ordinal = c0pVar.ordinal();
                            if (ordinal != 0) {
                            }
                            if (!z8) {
                            }
                            if (valueOf4 == null) {
                            }
                            xcs.b(rvf.M(intValue4, oq5Var8), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar2, f7, 0.0f, 2), "nothing_found_text"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65020);
                            xcs.b(rvf.M((valueOf4 != null && intValue4 == valueOf4.intValue()) ? R.string.search_empty_result_description_with_filter : R.string.search_empty_result_description, oq5Var8), d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 8, 0.0f, 0.0f, 13), f7, 0.0f, 2), 1.0f), ((dq0) oq5Var8.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65016);
                            oq5Var8.p(true);
                            break;
                        case 6:
                            num = Integer.valueOf(R.string.context_search_empty_entity_album);
                            ordinal = c0pVar.ordinal();
                            if (ordinal != 0) {
                            }
                            if (!z8) {
                            }
                            if (valueOf4 == null) {
                            }
                            xcs.b(rvf.M(intValue4, oq5Var8), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar2, f7, 0.0f, 2), "nothing_found_text"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65020);
                            xcs.b(rvf.M((valueOf4 != null && intValue4 == valueOf4.intValue()) ? R.string.search_empty_result_description_with_filter : R.string.search_empty_result_description, oq5Var8), d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 8, 0.0f, 0.0f, 13), f7, 0.0f, 2), 1.0f), ((dq0) oq5Var8.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65016);
                            oq5Var8.p(true);
                            break;
                        case 7:
                            num = Integer.valueOf(R.string.context_search_empty_entity_podcast);
                            ordinal = c0pVar.ordinal();
                            if (ordinal != 0) {
                            }
                            if (!z8) {
                            }
                            if (valueOf4 == null) {
                            }
                            xcs.b(rvf.M(intValue4, oq5Var8), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar2, f7, 0.0f, 2), "nothing_found_text"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65020);
                            xcs.b(rvf.M((valueOf4 != null && intValue4 == valueOf4.intValue()) ? R.string.search_empty_result_description_with_filter : R.string.search_empty_result_description, oq5Var8), d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 8, 0.0f, 0.0f, 13), f7, 0.0f, 2), 1.0f), ((dq0) oq5Var8.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65016);
                            oq5Var8.p(true);
                            break;
                        case 8:
                            num = Integer.valueOf(R.string.context_search_empty_entity_audiobook);
                            ordinal = c0pVar.ordinal();
                            if (ordinal != 0) {
                            }
                            if (!z8) {
                            }
                            if (valueOf4 == null) {
                            }
                            xcs.b(rvf.M(intValue4, oq5Var8), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar2, f7, 0.0f, 2), "nothing_found_text"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65020);
                            xcs.b(rvf.M((valueOf4 != null && intValue4 == valueOf4.intValue()) ? R.string.search_empty_result_description_with_filter : R.string.search_empty_result_description, oq5Var8), d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 8, 0.0f, 0.0f, 13), f7, 0.0f, 2), 1.0f), ((dq0) oq5Var8.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65016);
                            oq5Var8.p(true);
                            break;
                        case 9:
                            num = Integer.valueOf(R.string.context_search_empty_artist);
                            ordinal = c0pVar.ordinal();
                            if (ordinal != 0) {
                            }
                            if (!z8) {
                            }
                            if (valueOf4 == null) {
                            }
                            xcs.b(rvf.M(intValue4, oq5Var8), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar2, f7, 0.0f, 2), "nothing_found_text"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65020);
                            xcs.b(rvf.M((valueOf4 != null && intValue4 == valueOf4.intValue()) ? R.string.search_empty_result_description_with_filter : R.string.search_empty_result_description, oq5Var8), d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 8, 0.0f, 0.0f, 13), f7, 0.0f, 2), 1.0f), ((dq0) oq5Var8.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65016);
                            oq5Var8.p(true);
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            num = valueOf3;
                            ordinal = c0pVar.ordinal();
                            if (ordinal != 0) {
                            }
                            if (!z8) {
                            }
                            if (valueOf4 == null) {
                            }
                            xcs.b(rvf.M(intValue4, oq5Var8), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(vciVar2, f7, 0.0f, 2), "nothing_found_text"), 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65020);
                            xcs.b(rvf.M((valueOf4 != null && intValue4 == valueOf4.intValue()) ? R.string.search_empty_result_description_with_filter : R.string.search_empty_result_description, oq5Var8), d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 8, 0.0f, 0.0f, 13), f7, 0.0f, 2), 1.0f), ((dq0) oq5Var8.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var8, 48, 0, 65016);
                            oq5Var8.p(true);
                            break;
                        default:
                            b6e.s();
                            break;
                    }
                } else {
                    oq5Var8.S();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                n7w.r((k0d) obj7, (Function1) obj6, (jd6) obj5, this.c, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ksw.v((q0d) obj7, (d1d) obj6, this.c, (Function0) obj4, (yci) obj5, (hq5) obj, rvf.R(1));
                break;
            case 9:
                q6k q6kVar = (q6k) obj7;
                d85 d85Var = (d85) obj6;
                Function1 function12 = (Function1) obj5;
                Function0 function06 = (Function0) obj4;
                hq5 hq5Var6 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var6;
                if (oq5Var9.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    quj.v(q6kVar, d85Var, this.c, function12, function06, oq5Var9, 0);
                } else {
                    oq5Var9.S();
                }
                break;
            case 10:
                aqi aqiVar = (aqi) obj7;
                bg5 bg5Var = (bg5) obj6;
                po6 po6Var = (po6) obj5;
                aqi aqiVar2 = (aqi) obj4;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var7;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                nho a5 = lho.a(qx0.a, b2c.l, hq5Var7, 48);
                oq5 oq5Var11 = (oq5) hq5Var7;
                int i10 = oq5Var11.P;
                a l6 = oq5Var11.l();
                vci vciVar3 = vci.a;
                yci H6 = vnj.H(hq5Var7, vciVar3);
                xp5.T.getClass();
                grb grbVar6 = wp5.b;
                oq5Var11.d0();
                if (oq5Var11.O) {
                    oq5Var11.k(grbVar6);
                } else {
                    oq5Var11.n0();
                }
                kb5 kb5Var6 = wp5.f;
                g0g.U(hq5Var7, a5, kb5Var6);
                kb5 kb5Var7 = wp5.e;
                g0g.U(hq5Var7, l6, kb5Var7);
                kb5 kb5Var8 = wp5.g;
                if (!oq5Var11.O) {
                    vciVar = vciVar3;
                    break;
                } else {
                    vciVar = vciVar3;
                }
                ouj.x(i10, oq5Var11, i10, kb5Var8);
                kb5 kb5Var9 = wp5.d;
                g0g.U(hq5Var7, H6, kb5Var9);
                boolean booleanValue6 = ((Boolean) aqiVar.getValue()).booleanValue();
                oq5Var11.Z(-500034513);
                vci vciVar4 = vciVar;
                yci m2 = d.m(androidx.compose.foundation.layout.a.q(vciVar, 16, 0.0f, 0.0f, 0.0f, 14), 24);
                if (z8) {
                    Object K14 = oq5Var11.K();
                    if (K14 == kjnVar) {
                        K14 = new osl(1);
                        oq5Var11.k0(K14);
                    }
                    yciVar = nfp.a(vciVar4, (Function1) K14);
                } else {
                    yciVar = vciVar4;
                }
                yci f8 = m2.f(yciVar);
                oq5Var11.p(false);
                boolean f9 = oq5Var11.f(aqiVar) | oq5Var11.h(bg5Var);
                Object K15 = oq5Var11.K();
                if (f9 || K15 == kjnVar) {
                    K15 = new iik(15, bg5Var, aqiVar);
                    oq5Var11.k0(K15);
                }
                aae.a((Function0) K15, f8, booleanValue6, vwb.e, hq5Var7, 24576, 8);
                Unit unit = Unit.a;
                boolean h10 = oq5Var11.h(bg5Var);
                Object K16 = oq5Var11.K();
                if (h10 || K16 == kjnVar) {
                    z7 = false;
                    K16 = new tul(bg5Var, null, false ? 1 : 0);
                    oq5Var11.k0(K16);
                } else {
                    z7 = false;
                }
                f = vciVar4.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K16), 6));
                kfh d4 = ug3.d(b2c.b, z7);
                int i11 = oq5Var11.P;
                a l7 = oq5Var11.l();
                yci H7 = vnj.H(hq5Var7, f);
                oq5Var11.d0();
                if (oq5Var11.O) {
                    oq5Var11.k(grbVar6);
                } else {
                    oq5Var11.n0();
                }
                g0g.U(hq5Var7, d4, kb5Var6);
                g0g.U(hq5Var7, l7, kb5Var7);
                if (oq5Var11.O || !Intrinsics.d(oq5Var11.K(), Integer.valueOf(i11))) {
                    ouj.x(i11, oq5Var11, i11, kb5Var8);
                }
                g0g.U(hq5Var7, H7, kb5Var9);
                vut.r(po6Var.a, lzs.a, null, null, 0.0f, ((frs) aqiVar2.getValue()) == frs.c, hq5Var7, 48, 28);
                oq5Var11.p(true);
                oq5Var11.p(true);
                break;
            case 11:
                ((Integer) obj2).getClass();
                azl.b((fvf) obj7, (odc) obj6, (Function1) obj5, (yci) obj4, this.c, (hq5) obj, rvf.R(1));
                break;
            case 12:
                az2 az2Var = (az2) obj7;
                w3g w3gVar = (w3g) obj6;
                Function0 function07 = (Function0) obj4;
                Function0 function08 = (Function0) obj5;
                hq5 hq5Var8 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var8;
                if (oq5Var12.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (az2Var.b) {
                        oq5Var12.Z(-997728621);
                        nho a6 = lho.a(qx0.a, b2c.l, oq5Var12, 48);
                        int i12 = oq5Var12.P;
                        a l8 = oq5Var12.l();
                        yci H8 = vnj.H(oq5Var12, yciVar2);
                        xp5.T.getClass();
                        grb grbVar7 = wp5.b;
                        oq5Var12.d0();
                        if (oq5Var12.O) {
                            oq5Var12.k(grbVar7);
                        } else {
                            oq5Var12.n0();
                        }
                        g0g.U(oq5Var12, a6, wp5.f);
                        g0g.U(oq5Var12, l8, wp5.e);
                        kb5 kb5Var10 = wp5.g;
                        if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i12))) {
                            ouj.x(i12, oq5Var12, i12, kb5Var10);
                        }
                        g0g.U(oq5Var12, H8, wp5.d);
                        szf.b(w3gVar.c, function07, null, null, ((dq0) oq5Var12.j(eq0.a)).a.g, 0L, oq5Var12, 0, 44);
                        xp3.h(0, oq5Var12, null, function08, z8);
                        oq5Var12.p(true);
                    } else {
                        oq5Var12.Z(-999102231);
                    }
                    oq5Var12.p(false);
                } else {
                    oq5Var12.S();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                g0g.n((g06) obj7, (Function0) obj4, (Function0) obj6, this.c, (yci) obj5, (hq5) obj, rvf.R(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                t7g.d((g6p) obj7, (tmb) obj6, (lvf) obj5, this.c, (yci) obj4, (hq5) obj, rvf.R(577));
                break;
            case 15:
                ((Integer) obj2).getClass();
                fkq.e((ckq) obj7, this.c, (um0) obj6, (oxo) obj5, (Function0) obj4, (hq5) obj, rvf.R(1));
                break;
            case 16:
                ckq ckqVar = (ckq) obj7;
                um0 um0Var = (um0) obj6;
                Function0 function09 = (Function0) obj4;
                vqn vqnVar = (vqn) obj5;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var13 = (oq5) hq5Var9;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        break;
                    }
                }
                fkq.e(ckqVar, this.c, um0Var, new oxo(23, vqnVar), function09, hq5Var9, 0);
            case 17:
                String str2 = (String) obj7;
                jzb jzbVar = (jzb) obj6;
                Function0 function010 = (Function0) obj4;
                Function0 function011 = (Function0) obj5;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        break;
                    }
                }
                oq5 oq5Var15 = (oq5) hq5Var10;
                oq5Var15.Z(-475150343);
                if (z8) {
                    yciVar2 = androidx.compose.foundation.a.i(xp3.u(yciVar2, o5g.E(oq5Var15)), rvf.M(R.string.copy, oq5Var15), irf.S(function010, oq5Var15, 0), function011, 39);
                }
                oq5Var15.p(false);
                Object K17 = oq5Var15.K();
                if (K17 == kjnVar) {
                    K17 = new phs(4);
                    oq5Var15.k0(K17);
                }
                szf.v(str2, jzbVar, nfp.b(yciVar2, false, (Function1) K17), oq5Var15, 0);
            case 18:
                bci bciVar = (bci) obj7;
                gy7 gy7Var = (gy7) obj6;
                vus vusVar = (vus) obj5;
                sai saiVar = (sai) obj4;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var16 = (oq5) hq5Var11;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        break;
                    }
                }
                yd5.f(androidx.compose.ui.platform.a.a(yciVar2, "track_description_bottom_sheet"), null, bciVar, null, null, false, false, false, 0L, 0L, 0.0f, ild.C(29791853, new pu(gy7Var, vusVar, saiVar, this.c, 9), hq5Var11), hq5Var11, 4102, 4086);
            case 19:
                ((Integer) obj2).getClass();
                ywf.k((ab0) obj7, (wn5) obj6, (wn5) obj5, (ltu) obj4, this.c, (hq5) obj, rvf.R(385));
                break;
            case 20:
                break;
            case 21:
                ((Integer) obj2).getClass();
                com.yandex.plus.core.network.api.utils.a.e(this.c, (String) obj7, (String) obj6, (Function0) obj4, (yci) obj5, (hq5) obj, rvf.R(1));
                break;
            default:
                k kVar = (k) obj;
                kVar.getClass();
                ((com.yandex.plus.divkit.api.a) obj2).getClass();
                u.K((xzb) obj7, ((b) obj6).c, "Div2LoggerImpl");
                String logId = ((gc8) obj4).getLogId();
                ((View) obj5).getClass();
                logId.getClass();
                kVar.a.invoke(new i32(i2, z8), logId);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qr(ka1 ka1Var, yi1 yi1Var, Function0 function0, boolean z, tvd tvdVar) {
        this.a = 1;
        this.d = ka1Var;
        this.e = yi1Var;
        this.b = function0;
        this.c = z;
        this.f = tvdVar;
    }

    public /* synthetic */ qr(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.c = z;
    }

    public /* synthetic */ qr(ew5 ew5Var, Function0 function0, boolean z, yci yciVar, fvf fvfVar, int i) {
        this.a = 2;
        this.d = ew5Var;
        this.b = function0;
        this.c = z;
        this.e = yciVar;
        this.f = fvfVar;
    }

    public /* synthetic */ qr(g06 g06Var, Function0 function0, Function0 function02, boolean z, yci yciVar, int i) {
        this.a = 13;
        this.d = g06Var;
        this.b = function0;
        this.e = function02;
        this.c = z;
        this.f = yciVar;
    }

    public /* synthetic */ qr(q0d q0dVar, d1d d1dVar, boolean z, Function0 function0, yci yciVar, int i) {
        this.a = 8;
        this.d = q0dVar;
        this.e = d1dVar;
        this.c = z;
        this.b = function0;
        this.f = yciVar;
    }

    public /* synthetic */ qr(q6k q6kVar, d85 d85Var, boolean z, Function1 function1, Function0 function0) {
        this.a = 9;
        this.d = q6kVar;
        this.e = d85Var;
        this.c = z;
        this.f = function1;
        this.b = function0;
    }

    public /* synthetic */ qr(ckq ckqVar, boolean z, um0 um0Var, oxo oxoVar, Function0 function0, int i) {
        this.a = 15;
        this.d = ckqVar;
        this.c = z;
        this.e = um0Var;
        this.f = oxoVar;
        this.b = function0;
    }

    public /* synthetic */ qr(ckq ckqVar, boolean z, um0 um0Var, Function0 function0, vqn vqnVar) {
        this.a = 16;
        this.d = ckqVar;
        this.c = z;
        this.e = um0Var;
        this.b = function0;
        this.f = vqnVar;
    }

    public /* synthetic */ qr(d8t d8tVar, boolean z, wdc wdcVar, Object obj, wn5 wn5Var) {
        this.a = 5;
        this.d = d8tVar;
        this.c = z;
        this.e = wdcVar;
        this.f = obj;
        this.b = wn5Var;
    }

    public /* synthetic */ qr(Object obj, Object obj2, Object obj3, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = z;
        this.b = yciVar;
    }

    public /* synthetic */ qr(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.c = z;
    }

    public /* synthetic */ qr(String str, jzb jzbVar, boolean z, Function0 function0, Function0 function02) {
        this.a = 17;
        this.d = str;
        this.e = jzbVar;
        this.c = z;
        this.b = function0;
        this.f = function02;
    }

    public /* synthetic */ qr(boolean z, t16 t16Var, Function0 function0, String str, Function0 function02) {
        this.a = 3;
        this.c = z;
        this.d = t16Var;
        this.b = function0;
        this.e = str;
        this.f = function02;
    }

    public /* synthetic */ qr(boolean z, aqi aqiVar, bg5 bg5Var, po6 po6Var, aqi aqiVar2) {
        this.a = 10;
        this.c = z;
        this.d = aqiVar;
        this.e = bg5Var;
        this.f = po6Var;
        this.b = aqiVar2;
    }

    public /* synthetic */ qr(boolean z, String str, String str2, Function0 function0, yci yciVar, int i) {
        this.a = 21;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.b = function0;
        this.f = yciVar;
    }
}
