package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.music.core.ui.compose.b;
import com.yandex.passport.data.network.l;
import com.yandex.plus.bdui.flex.ui.n;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.plus.scenario.e;
import com.yandex.plus.bdui.plus.scenario.g;
import com.yandex.plus.bdui.plus.scenario.h;
import com.yandex.plus.bdui.query.f;
import com.yandex.plus.bdui.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class kt4 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kt4(xsq xsqVar, nb6 nb6Var, wn5 wn5Var, zsq zsqVar, hvq hvqVar, Function0 function0) {
        this.a = 8;
        this.b = xsqVar;
        this.c = nb6Var;
        this.d = wn5Var;
        this.e = zsqVar;
        this.g = hvqVar;
        this.f = function0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x04ce, code lost:
    
        if (r8 == r7) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b5 A[LOOP:1: B:29:0x00f1->B:43:0x01b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c6 A[EDGE_INSN: B:44:0x01c6->B:45:0x01c6 BREAK  A[LOOP:1: B:29:0x00f1->B:43:0x01b5], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        pgr pgrVar;
        kjn kjnVar;
        hq5 hq5Var;
        int i;
        um0 um0Var;
        boolean z4;
        int i2;
        char c;
        long j;
        int i3;
        long j2;
        List list;
        kjn kjnVar2;
        d85 d85Var;
        vm0 vm0Var;
        aqi aqiVar;
        oq5 oq5Var;
        String str;
        int i4;
        vci vciVar;
        ogr ogrVar;
        boolean z5;
        vci vciVar2;
        int i5;
        kjn kjnVar3;
        ogr ogrVar2;
        d85 d85Var2;
        long j3;
        int i6;
        ArrayList arrayList;
        char c2;
        float f;
        long j4;
        float f2;
        Object cmaVar;
        int i7;
        float f3;
        String str2;
        int i8;
        float f4;
        pgr pgrVar2 = (pgr) this.b;
        ges gesVar = (ges) this.c;
        um0 um0Var2 = (um0) this.d;
        d85 d85Var3 = (d85) this.e;
        aqi aqiVar2 = (aqi) this.f;
        hvq hvqVar = (hvq) this.g;
        c cVar = (c) obj;
        hq5 hq5Var2 = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        cVar.getClass();
        long j5 = cVar.b;
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            oq5 oq5Var2 = (oq5) hq5Var2;
            if (oq5Var2.z()) {
                oq5Var2.S();
                return Unit.a;
            }
        }
        vci vciVar3 = vci.a;
        yci b = d.b(vciVar3, 1.0f);
        gz2 gz2Var = b2c.o;
        dtq dtqVar = pgrVar2.d;
        List list2 = pgrVar2.c;
        ta5 a = sa5.a(dtqVar.a, gz2Var, hq5Var2, 48);
        oq5 oq5Var3 = (oq5) hq5Var2;
        int i9 = oq5Var3.P;
        a l = oq5Var3.l();
        yci H = vnj.H(hq5Var2, b);
        xp5.T.getClass();
        grb grbVar = wp5.b;
        oq5Var3.d0();
        if (oq5Var3.O) {
            oq5Var3.k(grbVar);
        } else {
            oq5Var3.n0();
        }
        g0g.U(hq5Var2, a, wp5.f);
        g0g.U(hq5Var2, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i9))) {
            ouj.x(i9, oq5Var3, i9, kb5Var);
        }
        g0g.U(hq5Var2, H, wp5.d);
        float c0 = ((jx7) oq5Var3.j(es5.h)).c0(ga6.h(j5));
        int i10 = ga6.i(j5);
        int size = list2.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(1);
        }
        oq5Var3.Z(-591591419);
        int size2 = list2.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= size2) {
                z = false;
                break;
            }
            ogr ogrVar3 = (ogr) list2.get(i12);
            Long l2 = ogrVar3.a;
            float f5 = c0;
            String str3 = ogrVar3.c;
            if (l2 != null) {
                oq5Var3.Z(-1159349545);
                i7 = size2;
                f3 = f5 - w1g.p(gesVar, 0, hq5Var2, 0, 2);
                oq5Var3.p(false);
            } else {
                i7 = size2;
                oq5Var3.Z(-1163446753);
                oq5Var3.p(false);
                f3 = f5;
            }
            if (str3 != null) {
                oq5Var3.Z(-1159139830);
                str2 = str3;
                arrayList2.set(i12, Integer.valueOf(Math.min(2, ndr.b(str3, ndr.c(ogrVar3, ((Boolean) aqiVar2.getValue()).booleanValue(), hq5Var2), i10, hq5Var2))));
                i8 = i10;
                f3 -= w1g.p(ndr.c(ogrVar3, ((Boolean) aqiVar2.getValue()).booleanValue(), hq5Var2), 0, hq5Var2, 0, 2) * ((Number) arrayList2.get(i12)).intValue();
                oq5Var3.p(false);
            } else {
                str2 = str3;
                i8 = i10;
                oq5Var3.Z(-1163446753);
                oq5Var3.p(false);
            }
            boolean booleanValue = ((Boolean) aqiVar2.getValue()).booleanValue();
            if (str2 != null && ogrVar3.a != null) {
                f4 = 24;
            } else if (!booleanValue) {
                f4 = 40;
                c0 = f3 - f4;
                z = false;
                if (Float.compare(c0, 0) > 0) {
                    break;
                }
                i13++;
                i12++;
                size2 = i7;
                i10 = i8;
            } else {
                f4 = 32;
            }
            c0 = f3 - f4;
            z = false;
            if (Float.compare(c0, 0) > 0) {
            }
        }
        oq5Var3.p(z);
        if (!((Boolean) aqiVar2.getValue()).booleanValue() && i13 < list2.size()) {
            aqiVar2.setValue(Boolean.TRUE);
        }
        float f6 = 0;
        ArrayList arrayList3 = arrayList2;
        if (Float.compare(c0, f6) > 0) {
            oq5Var3.Z(-1158256795);
            c0 -= (w1g.p(nu0.j(), 0, hq5Var2, 0, 2) * 3) + 16;
            boolean z6 = Float.compare(c0, f6) > 0;
            oq5Var3.p(false);
            z2 = z6;
        } else {
            oq5Var3.Z(-1158100462);
            oq5Var3.p(false);
            aqiVar2.setValue(Boolean.TRUE);
            z2 = false;
        }
        if (Float.compare(c0, f6) > 0) {
            oq5Var3.Z(-1157962171);
            boolean z7 = Float.compare(c0 - ((w1g.p(nu0.j(), 0, hq5Var2, 0, 2) * ((float) 2)) + ((float) 16)), f6) > 0;
            oq5Var3.p(false);
            z3 = z7;
        } else {
            oq5Var3.Z(-1157805838);
            oq5Var3.p(false);
            aqiVar2.setValue(Boolean.TRUE);
            z3 = false;
        }
        String str4 = pgrVar2.a;
        kjn kjnVar4 = gq5.a;
        if (!z3 || str4 == null) {
            pgrVar = pgrVar2;
            kjnVar = kjnVar4;
            hq5Var = hq5Var2;
            i = i13;
            um0Var = um0Var2;
            z4 = false;
            i2 = 2;
            c = '(';
            oq5Var3.Z(-1163446753);
        } else {
            oq5Var3.Z(-1157618381);
            kjnVar = kjnVar4;
            i = i13;
            um0Var = um0Var2;
            pgrVar = pgrVar2;
            vm0 b2 = fn0.b(i13 + 1, 0.0f, um0Var, hq5Var2, 0, 2);
            i2 = 2;
            yci z8 = xv.z(androidx.compose.foundation.layout.a.o(vciVar3, 16, 0.0f, 2), ((Number) b2.b.getValue()).floatValue());
            ges j6 = nu0.j();
            if (d85Var3 == null) {
                oq5Var3.Z(-591517974);
                j4 = ((dq0) ((oq5) hq5Var2).j(eq0.a)).b.a;
                oq5Var3.p(false);
            } else {
                oq5Var3.Z(-591519090);
                oq5Var3.p(false);
                j4 = d85Var3.a;
            }
            xv7.j(str4, z8, j4, 0L, 0L, 3, 0L, 2, false, 2, 0, null, j6, hq5Var2, 0, 3120, 55032);
            hq5Var = hq5Var2;
            boolean g = oq5Var3.g(((Boolean) aqiVar2.getValue()).booleanValue());
            Object K = oq5Var3.K();
            if (g || K == kjnVar) {
                if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                    f2 = 32;
                    c = '(';
                } else {
                    c = '(';
                    f2 = 40;
                }
                cmaVar = new cma(f2);
                oq5Var3.k0(cmaVar);
            } else {
                cmaVar = K;
                c = '(';
            }
            u1g.l(hq5Var, d.e(vciVar3, ((cma) cmaVar).a));
            z4 = false;
        }
        oq5Var3.p(z4);
        oq5Var3.Z(-591503273);
        hq5 hq5Var3 = hq5Var;
        int i14 = 0;
        while (i14 < i) {
            ogr ogrVar4 = (ogr) list2.get(i14);
            hq5 hq5Var4 = hq5Var3;
            vm0 b3 = fn0.b(i14, ((Number) ndr.a.get(i14)).floatValue(), um0Var, hq5Var4, 0, 0);
            Long l3 = ogrVar4.a;
            String str5 = ogrVar4.c;
            if (l3 == null) {
                oq5Var3.Z(-1156446303);
                oq5Var3.p(false);
                i3 = i;
                d85Var = d85Var3;
                i4 = i14;
                vm0Var = b3;
                z5 = false;
                str = str5;
                aqiVar = aqiVar2;
                vciVar = vciVar3;
                ogrVar = ogrVar4;
                oq5Var = oq5Var3;
                list = list2;
                kjnVar2 = kjnVar;
            } else {
                oq5Var3.Z(-1156446302);
                long longValue = l3.longValue();
                i3 = i;
                yci g2 = d.g(d.u(vciVar3, b2c.k, true), 0.0f, ff7.P(gesVar.b.c, hq5Var4), 1);
                kfh d = ug3.d(b2c.b, false);
                int i15 = oq5Var3.P;
                a l4 = oq5Var3.l();
                yci H2 = vnj.H(hq5Var4, g2);
                xp5.T.getClass();
                int i16 = i14;
                grb grbVar2 = wp5.b;
                oq5Var3.d0();
                um0 um0Var3 = um0Var;
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar2);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var4, d, wp5.f);
                g0g.U(hq5Var4, l4, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i15))) {
                    ouj.x(i15, oq5Var3, i15, kb5Var2);
                }
                g0g.U(hq5Var4, H2, wp5.d);
                Locale a2 = hvqVar.a();
                String str6 = ogrVar4.b;
                if (d85Var3 == null) {
                    oq5Var3.Z(-1102401622);
                    j2 = ((dq0) ((oq5) hq5Var4).j(eq0.a)).b.a;
                    oq5Var3.p(false);
                } else {
                    oq5Var3.Z(-1102402738);
                    oq5Var3.p(false);
                    j2 = d85Var3.a;
                }
                boolean f7 = oq5Var3.f(b3);
                Object K2 = oq5Var3.K();
                if (f7 || K2 == kjnVar) {
                    K2 = new a9q(b3, 11);
                    oq5Var3.k0(K2);
                }
                yci s = wyf.s(vciVar3, (Function0) K2);
                aqi aqiVar3 = aqiVar2;
                d85 d85Var4 = new d85(j2);
                list = list2;
                kjnVar2 = kjnVar;
                d85Var = d85Var3;
                vm0Var = b3;
                aqiVar = aqiVar3;
                oq5Var = oq5Var3;
                str = str5;
                i4 = i16;
                vciVar = vciVar3;
                ogrVar = ogrVar4;
                z5 = false;
                ldr.a(longValue, a2, s, str6, um0Var3, d85Var4, 0, 0, gesVar, hq5Var4, 0, 192);
                um0Var = um0Var3;
                hq5Var4 = hq5Var4;
                oq5Var.p(true);
                oq5Var.p(false);
            }
            if (str == null) {
                oq5Var.Z(-1155474360);
                oq5Var.p(z5);
                arrayList = arrayList3;
                d85Var2 = d85Var;
                i6 = i4;
                ogrVar2 = ogrVar;
                kjnVar3 = kjnVar2;
                vciVar2 = vciVar;
                i5 = 2;
            } else {
                oq5Var.Z(-1155474359);
                vciVar2 = vciVar;
                i5 = 2;
                yci o = androidx.compose.foundation.layout.a.o(vciVar2, 16, 0.0f, 2);
                vm0 vm0Var2 = vm0Var;
                boolean f8 = oq5Var.f(vm0Var2);
                Object K3 = oq5Var.K();
                if (f8) {
                    kjnVar3 = kjnVar2;
                } else {
                    kjnVar3 = kjnVar2;
                }
                K3 = new a9q(vm0Var2, 12);
                oq5Var.k0(K3);
                yci s2 = wyf.s(o, (Function0) K3);
                ogrVar2 = ogrVar;
                ges c3 = ndr.c(ogrVar2, ((Boolean) aqiVar.getValue()).booleanValue(), hq5Var4);
                if (d85Var == null) {
                    oq5Var.Z(-1974355560);
                    j3 = ((dq0) ((oq5) hq5Var4).j(eq0.a)).b.a;
                    oq5Var.p(z5);
                    d85Var2 = d85Var;
                } else {
                    oq5Var.Z(-1974356676);
                    oq5Var.p(z5);
                    d85Var2 = d85Var;
                    j3 = d85Var2.a;
                }
                long j7 = j3;
                i6 = i4;
                arrayList = arrayList3;
                xv7.j(str, s2, j7, 0L, 0L, 3, 0L, 2, false, ((Number) arrayList.get(i6)).intValue(), 0, null, c3, hq5Var4, 0, 48, 55032);
                oq5Var.p(z5);
            }
            boolean booleanValue2 = ((Boolean) aqiVar.getValue()).booleanValue();
            if (str != null && ogrVar2.a != null) {
                f = 24;
            } else if (booleanValue2) {
                f = 32;
            } else {
                c2 = '(';
                f = 40;
                u1g.l(hq5Var4, d.e(vciVar2, f));
                list2 = list;
                arrayList3 = arrayList;
                i14 = i6 + 1;
                hq5Var3 = hq5Var4;
                d85Var3 = d85Var2;
                i2 = i5;
                kjnVar = kjnVar3;
                vciVar3 = vciVar2;
                c = c2;
                aqiVar2 = aqiVar;
                oq5Var3 = oq5Var;
                i = i3;
            }
            c2 = '(';
            u1g.l(hq5Var4, d.e(vciVar2, f));
            list2 = list;
            arrayList3 = arrayList;
            i14 = i6 + 1;
            hq5Var3 = hq5Var4;
            d85Var3 = d85Var2;
            i2 = i5;
            kjnVar = kjnVar3;
            vciVar3 = vciVar2;
            c = c2;
            aqiVar2 = aqiVar;
            oq5Var3 = oq5Var;
            i = i3;
        }
        int i17 = i2;
        vci vciVar4 = vciVar3;
        oq5 oq5Var4 = oq5Var3;
        hq5 hq5Var5 = hq5Var3;
        d85 d85Var5 = d85Var3;
        oq5Var4.p(false);
        String str7 = pgrVar.b;
        if (!z2 || str7 == null) {
            oq5Var4.Z(-1163446753);
        } else {
            oq5Var4.Z(-1154697902);
            float f9 = 16;
            u1g.l(hq5Var5, d.e(vciVar4, f9));
            yci z9 = xv.z(androidx.compose.foundation.layout.a.o(vciVar4, f9, 0.0f, i17), ((Number) fn0.b(0, 0.0f, um0Var, hq5Var5, 6, 2).b.getValue()).floatValue());
            ges j8 = nu0.j();
            if (d85Var5 == null) {
                oq5Var4.Z(-591422102);
                j = ((dq0) ((oq5) hq5Var5).j(eq0.a)).b.a;
                oq5Var4.p(false);
            } else {
                oq5Var4.Z(-591423218);
                oq5Var4.p(false);
                j = d85Var5.a;
            }
            xv7.j(str7, z9, j, 0L, 0L, 3, 0L, 2, false, 3, 0, null, j8, hq5Var5, 0, 3120, 55032);
        }
        oq5Var4.p(false);
        oq5Var4.p(true);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x08d2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r2.K(), java.lang.Integer.valueOf(r12)) == false) goto L284;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f1  */
    @Override // defpackage.pyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d85 d85Var;
        long j;
        boolean z;
        yci yciVar;
        kb5 kb5Var;
        agr agrVar;
        oq5 oq5Var;
        v7l v7lVar;
        boolean z2;
        xxk xxkVar;
        boolean z3;
        cjc u;
        long j2;
        boolean z4;
        boolean z5;
        Object obj4;
        int ordinal;
        Object obj5;
        int ordinal2;
        int i;
        int i2;
        int ordinal3;
        Object obj6;
        boolean h;
        Object K;
        int i3 = this.a;
        apq apqVar = apq.a;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        int i4 = 0;
        int i5 = 1;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.d;
        Object obj11 = this.c;
        Object obj12 = this.b;
        switch (i3) {
            case 0:
                qan qanVar = (qan) obj12;
                rnl rnlVar = (rnl) obj11;
                v7l v7lVar2 = (v7l) obj10;
                cjc cjcVar = (cjc) obj9;
                Function0 function0 = (Function0) obj8;
                Function0 function02 = (Function0) obj7;
                xxk xxkVar2 = (xxk) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                xxkVar2.getClass();
                d85 d85Var2 = xxkVar2.f;
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(xxkVar2) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                if (!oq5Var2.P(intValue & 1, (intValue & 19) != 18)) {
                    oq5Var2.S();
                } else if (xxkVar2 == xxk.q) {
                    oq5Var2.Z(-881151434);
                    pm0.b(6, oq5Var2);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(-880906968);
                    dma dmaVar = new dma(12);
                    tgo tgoVar = ugo.a;
                    yci u2 = xp3.u(vciVar, new tgo(dmaVar, dmaVar, dmaVar, dmaVar));
                    if (d85Var2 != null) {
                        d85Var = new d85(d85.b(jf0.g0(d85Var2.a, Float.valueOf(0.72f), 0.0f, 6), pd.M() ? 0.16f : 0.24f, 0.0f, 0.0f, 0.0f, 14));
                    } else {
                        d85Var = null;
                    }
                    if (d85Var == null) {
                        oq5Var2.Z(-166954010);
                        j = ((dq0) oq5Var2.j(eq0.a)).c.c;
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(-166961016);
                        oq5Var2.p(false);
                        j = d85Var.a;
                    }
                    agr agrVar2 = eq0.a;
                    int i6 = intValue;
                    yci b = androidx.compose.foundation.a.b(u2, c3x.D(j, ((dq0) oq5Var2.j(agrVar2)).c.a), vnj.i);
                    if (xxkVar2.equals(qanVar.b)) {
                        z = false;
                        oq5Var2.Z(-166947869);
                        oq5Var2.p(false);
                        yciVar = vciVar;
                    } else {
                        oq5Var2.Z(-166948813);
                        Object K2 = oq5Var2.K();
                        if (K2 == kjnVar) {
                            K2 = new sm4(12);
                            oq5Var2.k0(K2);
                        }
                        yciVar = nfp.a(vciVar, (Function1) K2);
                        z = false;
                        oq5Var2.p(false);
                    }
                    yci f = b.f(yciVar);
                    iz2 iz2Var = b2c.b;
                    kfh d = ug3.d(iz2Var, z);
                    int i7 = oq5Var2.P;
                    a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, f);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    kb5 kb5Var2 = wp5.f;
                    g0g.U(oq5Var2, d, kb5Var2);
                    kb5 kb5Var3 = wp5.e;
                    g0g.U(oq5Var2, l, kb5Var3);
                    kb5 kb5Var4 = wp5.g;
                    if (!oq5Var2.O) {
                        kb5Var = kb5Var3;
                        break;
                    } else {
                        kb5Var = kb5Var3;
                    }
                    ouj.x(i7, oq5Var2, i7, kb5Var4);
                    kb5 kb5Var5 = wp5.d;
                    g0g.U(oq5Var2, H, kb5Var5);
                    qan qanVar2 = rnlVar.b;
                    n1g n1gVar = rnlVar.c;
                    if (qanVar2.b.d) {
                        oq5Var2.Z(1827939249);
                        if (((Boolean) oq5Var2.j((agr) npg.d.c)).booleanValue()) {
                            oq5Var2.Z(-2055930973);
                            int i8 = i6 & 14;
                            if (vwb.V(xxkVar2, qanVar)) {
                                oq5Var2.Z(-1467980873);
                                u = gut.T0(v7lVar2.c, v7lVar2.d, v7lVar2.f, v7lVar2.a, xxkVar2, oq5Var2, (i8 << 12) & 57344, 224);
                                xxkVar = xxkVar2;
                                oq5Var = oq5Var2;
                                z4 = false;
                                oq5Var.p(false);
                            } else {
                                oq5Var = oq5Var2;
                                z4 = false;
                                xxkVar = xxkVar2;
                                oq5Var.Z(-1467690589);
                                Object K3 = oq5Var.K();
                                if (K3 == kjnVar) {
                                    K3 = tlm.h(0.0f, oq5Var);
                                }
                                u = (poi) K3;
                                oq5Var.p(false);
                            }
                            oq5Var.p(z4);
                        } else {
                            oq5Var = oq5Var2;
                            xxkVar = xxkVar2;
                            oq5Var.Z(-2055851675);
                            u = rzf.u(szf.o0(Float.valueOf(vwb.V(xxkVar, qanVar) ? v7lVar2.c : 0.0f), oq5Var));
                            oq5Var.p(false);
                        }
                        String str = eeh.b(u.e() * 100) + "%";
                        yci d2 = d.d(vciVar, 1.0f);
                        boolean f2 = oq5Var.f(cjcVar);
                        Object K4 = oq5Var.K();
                        if (f2 || K4 == kjnVar) {
                            K4 = new wf3(cjcVar, 10);
                            oq5Var.k0(K4);
                        }
                        yci D = ksw.D(b.c(androidx.compose.ui.platform.a.a(d.b(wyf.s(d2, (Function0) K4), 1.0f), "collapsed_player_progress"), "progress", u), rvf.N(R.string.player_progress_description, new Object[]{str}, oq5Var), null);
                        if (d85Var2 == null) {
                            oq5Var.Z(-1187925119);
                            j2 = d85.b(((dq0) oq5Var.j(agrVar2)).c.c, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(-1187927754);
                            oq5Var.p(false);
                            j2 = d85Var2.a;
                        }
                        agrVar = agrVar2;
                        v7lVar = v7lVar2;
                        long b2 = d85.b(jf0.g0(j2, Float.valueOf(0.6f), 0.0f, 6), 0.16f, 0.0f, 0.0f, 0.0f, 14);
                        boolean f3 = oq5Var.f(u);
                        Object K5 = oq5Var.K();
                        if (f3 || K5 == kjnVar) {
                            K5 = new wf3(u, 11);
                            oq5Var.k0(K5);
                        }
                        cxb.d(0, b2, oq5Var, D, (Function0) K5);
                        z2 = false;
                    } else {
                        agrVar = agrVar2;
                        oq5Var = oq5Var2;
                        v7lVar = v7lVar2;
                        z2 = false;
                        xxkVar = xxkVar2;
                        oq5Var.Z(1817331793);
                    }
                    oq5Var.p(z2);
                    iz2 iz2Var2 = b2c.f;
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
                    yci a = bVar.a(vciVar, iz2Var2);
                    nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                    int i9 = oq5Var.P;
                    a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, a);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a2, kb5Var2);
                    kb5 kb5Var6 = kb5Var;
                    g0g.U(oq5Var, l2, kb5Var6);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var, i9, kb5Var4);
                    }
                    g0g.U(oq5Var, H2, kb5Var5);
                    String str2 = xxkVar.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    yci m = androidx.compose.foundation.layout.a.m(vciVar, 8);
                    boolean f4 = oq5Var.f(cjcVar);
                    Object K6 = oq5Var.K();
                    if (f4 || K6 == kjnVar) {
                        K6 = new wf3(cjcVar, 6);
                        oq5Var.k0(K6);
                    }
                    vwb.g(0, oq5Var, wyf.s(m, (Function0) K6), str2);
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                    boolean f5 = oq5Var.f(cjcVar);
                    Object K7 = oq5Var.K();
                    if (f5 || K7 == kjnVar) {
                        K7 = new wf3(cjcVar, 7);
                        oq5Var.k0(K7);
                    }
                    vwb.x(wyf.s(layoutWeightElement, (Function0) K7), xxkVar, oq5Var, (i6 << 3) & 112);
                    yci r = d.r(vciVar, 92);
                    kfh d3 = ug3.d(iz2Var, false);
                    int i10 = oq5Var.P;
                    a l3 = oq5Var.l();
                    yci H3 = vnj.H(oq5Var, r);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d3, kb5Var2);
                    g0g.U(oq5Var, l3, kb5Var6);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                        ouj.x(i10, oq5Var, i10, kb5Var4);
                    }
                    g0g.U(oq5Var, H3, kb5Var5);
                    if (n1gVar.b) {
                        oq5Var.Z(33713604);
                        szf.b(n1gVar.a == j1g.a, function0, bVar.a(d.m(vciVar, 48), b2c.e), null, ((dq0) oq5Var.j(agrVar)).a.g, 0L, oq5Var, 0, 40);
                        z3 = false;
                    } else {
                        z3 = false;
                        oq5Var.Z(20934939);
                    }
                    oq5Var.p(z3);
                    v7l v7lVar3 = v7lVar;
                    lxe.i(v7lVar3.a ? cwk.b : cwk.a, function02, b.c(androidx.compose.ui.platform.a.a(bVar.a(d.m(vciVar, 48), b2c.g), "play_pause_button"), "is_playing", Boolean.valueOf(v7lVar3.a)), 0L, oq5Var, 0);
                    oq5Var.p(true);
                    u1g.l(oq5Var, d.r(vciVar, 4));
                    oq5Var.p(true);
                    oq5Var.p(true);
                    oq5Var.p(false);
                }
                return Unit.a;
            case 1:
                cpq cpqVar = (cpq) obj12;
                j2e j2eVar = (j2e) obj11;
                tmb tmbVar = (tmb) obj10;
                qnq qnqVar = (qnq) obj9;
                nnq nnqVar = (nnq) obj8;
                fvf fvfVar = (fvf) obj7;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                iz2 iz2Var3 = b2c.f;
                o0kVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (!oq5Var3.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    oq5Var3.S();
                } else if (Intrinsics.d(cpqVar, apqVar)) {
                    oq5Var3.Z(1639627755);
                    c3x.m(0, 2, 0L, oq5Var3, d.x(d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(ghh.C(o0kVar, zs4.g(oq5Var3)), ogp.A(oq5Var3))), 1.0f), iz2Var3, 2));
                    oq5Var3.p(false);
                } else if (cpqVar instanceof zoq) {
                    oq5Var3.Z(1640018324);
                    yci x = d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(ghh.C(o0kVar, zs4.g(oq5Var3)), ogp.A(oq5Var3))), 1.0f), bfg.C(oq5Var3), false, 14), iz2Var3, 2);
                    boolean h2 = oq5Var3.h(j2eVar);
                    Object K8 = oq5Var3.K();
                    if (h2 || K8 == kjnVar) {
                        K8 = new lhd(3, j2eVar);
                        oq5Var3.k0(K8);
                    }
                    rvf.j((Function1) K8, tmbVar, x, 0, true, null, oq5Var3, 24640, 40);
                    oq5Var3.p(false);
                } else {
                    if (!(cpqVar instanceof bpq)) {
                        throw vz1.i(oq5Var3, 1299816583, false);
                    }
                    oq5Var3.Z(1640558530);
                    Unit unit = Unit.a;
                    boolean h3 = oq5Var3.h(j2eVar);
                    Object K9 = oq5Var3.K();
                    if (h3 || K9 == kjnVar) {
                        K9 = new ox1(j2eVar, null, 21);
                        oq5Var3.k0(K9);
                    }
                    gld.w(oq5Var3, unit, (Function2) K9);
                    bpq bpqVar = (bpq) cpqVar;
                    ox6.o(j2eVar, qnqVar, etn.d0(bpqVar.a, nnqVar, qnqVar, oq5Var3), fvfVar, ghh.C(ghh.C(o0kVar, zs4.g(oq5Var3)), ogp.A(oq5Var3)), androidx.compose.foundation.layout.a.c(0.0f, bpqVar.b ? 0 : 16, 0.0f, 0.0f, 13), oq5Var3, 64);
                    oq5Var3.p(false);
                }
                return Unit.a;
            case 2:
                cpq cpqVar2 = (cpq) obj12;
                jef jefVar = (jef) obj11;
                tmb tmbVar2 = (tmb) obj10;
                nnq nnqVar2 = (nnq) obj9;
                qnq qnqVar2 = (qnq) obj8;
                fvf fvfVar2 = (fvf) obj7;
                o0k o0kVar2 = (o0k) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                iz2 iz2Var4 = b2c.f;
                o0kVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(o0kVar2) ? 4 : 2;
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (!oq5Var4.P(intValue3 & 1, (intValue3 & 19) != 18)) {
                    oq5Var4.S();
                } else if (Intrinsics.d(cpqVar2, apqVar)) {
                    oq5Var4.Z(-730014430);
                    c3x.m(0, 2, 0L, oq5Var4, d.x(d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(ghh.C(o0kVar2, zs4.g(oq5Var4)), ogp.A(oq5Var4))), 1.0f), iz2Var4, 2));
                    oq5Var4.p(false);
                } else if (cpqVar2 instanceof zoq) {
                    oq5Var4.Z(-729623892);
                    yci x2 = d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(ghh.C(o0kVar2, zs4.g(oq5Var4)), ogp.A(oq5Var4))), 1.0f), bfg.C(oq5Var4), false, 14), iz2Var4, 2);
                    boolean h4 = oq5Var4.h(jefVar);
                    Object K10 = oq5Var4.K();
                    if (h4 || K10 == kjnVar) {
                        K10 = new lhd(15, jefVar);
                        oq5Var4.k0(K10);
                    }
                    rvf.j((Function1) K10, tmbVar2, x2, 0, true, null, oq5Var4, 24640, 40);
                    oq5Var4.p(false);
                } else {
                    if (!(cpqVar2 instanceof bpq)) {
                        throw vz1.i(oq5Var4, 669187079, false);
                    }
                    oq5Var4.Z(-729087871);
                    Unit unit2 = Unit.a;
                    boolean h5 = oq5Var4.h(jefVar);
                    Object K11 = oq5Var4.K();
                    if (h5 || K11 == kjnVar) {
                        K11 = new ox1(jefVar, null, 23);
                        oq5Var4.k0(K11);
                    }
                    gld.w(oq5Var4, unit2, (Function2) K11);
                    bpq bpqVar2 = (bpq) cpqVar2;
                    ot0.p(jefVar, etn.d0(bpqVar2.a, nnqVar2, qnqVar2, oq5Var4), fvfVar2, ghh.C(ghh.C(o0kVar2, zs4.g(oq5Var4)), ogp.A(oq5Var4)), androidx.compose.foundation.layout.a.c(0.0f, bpqVar2.b ? 0 : 16, 0.0f, 0.0f, 13), oq5Var4, 0);
                    oq5Var4.p(false);
                }
                return Unit.a;
            case 3:
                cpq cpqVar3 = (cpq) obj12;
                ebj ebjVar = (ebj) obj11;
                tmb tmbVar3 = (tmb) obj10;
                nnq nnqVar3 = (nnq) obj9;
                qnq qnqVar3 = (qnq) obj8;
                fvf fvfVar3 = (fvf) obj7;
                o0k o0kVar3 = (o0k) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                iz2 iz2Var5 = b2c.f;
                o0kVar3.getClass();
                if ((intValue4 & 6) == 0) {
                    z5 = true;
                    intValue4 |= ((oq5) hq5Var4).f(o0kVar3) ? 4 : 2;
                } else {
                    z5 = true;
                }
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (!oq5Var5.P(intValue4 & 1, (intValue4 & 19) != 18 ? z5 : false)) {
                    oq5Var5.S();
                } else if (Intrinsics.d(cpqVar3, apqVar)) {
                    oq5Var5.Z(352253038);
                    c3x.m(0, 2, 0L, oq5Var5, d.x(d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(ghh.C(o0kVar3, zs4.g(oq5Var5)), ogp.A(oq5Var5))), 1.0f), iz2Var5, 2));
                    oq5Var5.p(false);
                } else if (cpqVar3 instanceof zoq) {
                    oq5Var5.Z(352643576);
                    yci x3 = d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(ghh.C(o0kVar3, zs4.g(oq5Var5)), ogp.A(oq5Var5))), 1.0f), bfg.C(oq5Var5), false, 14), iz2Var5, 2);
                    boolean h6 = oq5Var5.h(ebjVar);
                    Object K12 = oq5Var5.K();
                    if (h6 || K12 == kjnVar) {
                        K12 = new s8i(6, ebjVar);
                        oq5Var5.k0(K12);
                    }
                    rvf.j((Function1) K12, tmbVar3, x3, 0, true, null, oq5Var5, 24640, 40);
                    oq5Var5.p(false);
                } else {
                    if (!(cpqVar3 instanceof bpq)) {
                        throw vz1.i(oq5Var5, -1235563660, false);
                    }
                    oq5Var5.Z(353181364);
                    Unit unit3 = Unit.a;
                    boolean h7 = oq5Var5.h(ebjVar);
                    Object K13 = oq5Var5.K();
                    if (h7 || K13 == kjnVar) {
                        K13 = new d7i(ebjVar, null, 5);
                        oq5Var5.k0(K13);
                    }
                    gld.w(oq5Var5, unit3, (Function2) K13);
                    bpq bpqVar3 = (bpq) cpqVar3;
                    y5g.d(ebjVar, etn.d0(bpqVar3.a, nnqVar3, qnqVar3, oq5Var5), fvfVar3, ghh.C(ghh.C(o0kVar3, zs4.g(oq5Var5)), ogp.A(oq5Var5)), androidx.compose.foundation.layout.a.c(0.0f, bpqVar3.b ? 0 : 16, 0.0f, 0.0f, 13), oq5Var5, 0);
                    oq5Var5.p(false);
                }
                return Unit.a;
            case 4:
                Function0 function03 = (Function0) obj8;
                q5t q5tVar = (q5t) obj11;
                Function0 function04 = (Function0) obj7;
                c0g c0gVar = (c0g) obj10;
                Function0 function05 = (Function0) obj9;
                yci yciVar2 = (yci) obj;
                ((Integer) obj3).getClass();
                yciVar2.getClass();
                oq5 oq5Var6 = (oq5) ((hq5) obj2);
                oq5Var6.Z(1387544246);
                String M = rvf.M(R.string.overflow_menu_content_description, oq5Var6);
                int ordinal4 = ((zyj) obj12).ordinal();
                if (ordinal4 != 0 && ordinal4 != 1) {
                    if (ordinal4 == 2) {
                        oq5Var6.Z(1990168226);
                        boolean f6 = oq5Var6.f(function03);
                        Object K14 = oq5Var6.K();
                        if (f6 || K14 == kjnVar) {
                            K14 = new g1j(23, function03);
                            oq5Var6.k0(K14);
                        }
                        obj4 = t75.c(new nw6(M, (Function0) K14));
                        oq5Var6.p(false);
                        String M2 = rvf.M(R.string.trailer_btn, oq5Var6);
                        ordinal = q5tVar.ordinal();
                        if (ordinal != 0) {
                            oq5Var6.Z(1990175585);
                            oq5Var6.p(false);
                            obj5 = c5b.a;
                        } else {
                            if (ordinal != 1) {
                                throw vz1.i(oq5Var6, 1990174066, false);
                            }
                            oq5Var6.Z(1565952701);
                            if (function04 != null) {
                                oq5Var6.Z(1565991234);
                                boolean f7 = oq5Var6.f(function04);
                                Object K15 = oq5Var6.K();
                                if (f7 || K15 == kjnVar) {
                                    K15 = new g1j(24, function04);
                                    oq5Var6.k0(K15);
                                }
                                obj5 = t75.c(new nw6(M2, (Function0) K15));
                                oq5Var6.p(false);
                            } else {
                                oq5Var6.Z(1566100385);
                                oq5Var6.p(false);
                                obj5 = c5b.a;
                            }
                            oq5Var6.p(false);
                        }
                        ordinal2 = c0gVar.ordinal();
                        if (ordinal2 != 0 || ordinal2 == 1) {
                            i = 1990187335;
                            i2 = R.string.actions_menu_like;
                        } else {
                            if (ordinal2 != 2) {
                                throw vz1.i(oq5Var6, 1990184793, false);
                            }
                            i = 1990190057;
                            i2 = R.string.actions_menu_unlike;
                        }
                        String n = vz1.n(oq5Var6, i, i2, oq5Var6, false);
                        ordinal3 = c0gVar.ordinal();
                        if (ordinal3 != 0) {
                            oq5Var6.Z(1990194241);
                            oq5Var6.p(false);
                            obj6 = c5b.a;
                        } else {
                            if (ordinal3 != 1 && ordinal3 != 2) {
                                throw vz1.i(oq5Var6, 1990192933, false);
                            }
                            oq5Var6.Z(1566564486);
                            if (function05 != null) {
                                oq5Var6.Z(1566600136);
                                boolean f8 = oq5Var6.f(function05);
                                Object K16 = oq5Var6.K();
                                if (f8 || K16 == kjnVar) {
                                    K16 = new g1j(25, function05);
                                    oq5Var6.k0(K16);
                                }
                                obj6 = t75.c(new nw6(n, (Function0) K16));
                                oq5Var6.p(false);
                            } else {
                                oq5Var6.Z(1566703521);
                                oq5Var6.p(false);
                                obj6 = c5b.a;
                            }
                            oq5Var6.p(false);
                        }
                        h = oq5Var6.h(obj4) | oq5Var6.h(obj5) | oq5Var6.h(obj6);
                        K = oq5Var6.K();
                        if (!h || K == kjnVar) {
                            K = new p3e(29, obj4, obj5, obj6);
                            oq5Var6.k0(K);
                        }
                        yci b3 = nfp.b(yciVar2, false, (Function1) K);
                        oq5Var6.p(false);
                        return b3;
                    }
                    if (ordinal4 != 3) {
                        throw vz1.i(oq5Var6, 1990162683, false);
                    }
                }
                oq5Var6.Z(1990166593);
                oq5Var6.p(false);
                obj4 = c5b.a;
                String M22 = rvf.M(R.string.trailer_btn, oq5Var6);
                ordinal = q5tVar.ordinal();
                if (ordinal != 0) {
                }
                ordinal2 = c0gVar.ordinal();
                if (ordinal2 != 0) {
                }
                i = 1990187335;
                i2 = R.string.actions_menu_like;
                String n2 = vz1.n(oq5Var6, i, i2, oq5Var6, false);
                ordinal3 = c0gVar.ordinal();
                if (ordinal3 != 0) {
                }
                h = oq5Var6.h(obj4) | oq5Var6.h(obj5) | oq5Var6.h(obj6);
                K = oq5Var6.K();
                if (!h) {
                }
                K = new p3e(29, obj4, obj5, obj6);
                oq5Var6.k0(K);
                yci b32 = nfp.b(yciVar2, false, (Function1) K);
                oq5Var6.p(false);
                return b32;
            case 5:
                return a(obj, obj2, obj3);
            case 6:
                xsq xsqVar = (xsq) obj12;
                o54 o54Var = (o54) obj11;
                j54 j54Var = (j54) obj10;
                hvq hvqVar = (hvq) obj9;
                zsq zsqVar = (zsq) obj8;
                o3k o3kVar = (o3k) obj7;
                um0 um0Var = (um0) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                um0Var.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var5).d(um0Var.ordinal()) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                ff7.e(o54Var, j54Var, hvqVar, um0Var, ((fsq) xsqVar).j, false, null, zsqVar, o3kVar, hq5Var5, 196608 | ((intValue5 << 9) & 7168), 64);
                return Unit.a;
            case 7:
                xsq xsqVar2 = (xsq) obj12;
                ys4 ys4Var = (ys4) obj11;
                ws4 ws4Var = (ws4) obj10;
                hvq hvqVar2 = (hvq) obj9;
                zsq zsqVar2 = (zsq) obj8;
                o3k o3kVar2 = (o3k) obj7;
                um0 um0Var2 = (um0) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                um0Var2.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).d(um0Var2.ordinal()) ? 4 : 2;
                }
                if ((intValue6 & 19) == 18) {
                    oq5 oq5Var8 = (oq5) hq5Var6;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        return Unit.a;
                    }
                }
                ff7.g(ys4Var, ws4Var, hvqVar2, um0Var2, ((jsq) xsqVar2).j, false, null, zsqVar2, o3kVar2, hq5Var6, 196608 | ((intValue6 << 9) & 7168), 64);
                return Unit.a;
            case 8:
                xsq xsqVar3 = (xsq) obj12;
                nb6 nb6Var = (nb6) obj11;
                wn5 wn5Var = (wn5) obj10;
                zsq zsqVar3 = (zsq) obj9;
                hvq hvqVar3 = (hvq) obj7;
                Function0 function06 = (Function0) obj8;
                ua5 ua5Var = (ua5) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ua5Var.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(ua5Var) ? 4 : 2;
                }
                if ((intValue7 & 19) == 18) {
                    oq5 oq5Var9 = (oq5) hq5Var7;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                pcg.k(ua5Var, ((psq) xsqVar3).l, nb6Var, null, ild.C(-1985301002, new mdn(xsqVar3, hvqVar3, zsqVar3, function06), hq5Var7), hq5Var7, (intValue7 & 14) | 24576, 4);
                wn5Var.invoke(zsqVar3, hq5Var7, 48);
                return Unit.a;
            case 9:
                v3a v3aVar = (v3a) obj;
                m mVar = (m) obj2;
                mm6 mm6Var = (mm6) obj3;
                mVar.getClass();
                mm6Var.getClass();
                return new n(v3aVar, mVar, (ps) obj12, (o91) obj11, (o) obj10, (kotlinx.coroutines.a) obj9, (kotlinx.coroutines.a) obj8, mm6Var, (com.yandex.plus.log.api.b) obj7);
            default:
                com.yandex.plus.bdui.plus.query.a aVar = (com.yandex.plus.bdui.plus.query.a) obj12;
                com.yandex.plus.bdui.plus.scenario.m mVar2 = (com.yandex.plus.bdui.plus.scenario.m) obj10;
                com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) obj9;
                Function0 function07 = (Function0) obj2;
                ((s) obj).getClass();
                function07.getClass();
                ((com.yandex.plus.bdui.flex.action.b) obj3).getClass();
                g gVar = new g(mVar2, (Context) obj8, i5);
                h hVar = new h(mVar2, (e) obj7, i4);
                f fVar = (f) ((t0a) obj11).invoke();
                return new com.yandex.plus.bdui.plus.action.m(gVar, aVar, hVar, function07, fVar != null ? new l(fVar) : null, mVar2.B, bVar2);
        }
    }

    public /* synthetic */ kt4(zyj zyjVar, Function0 function0, q5t q5tVar, Function0 function02, c0g c0gVar, Function0 function03) {
        this.a = 4;
        this.b = zyjVar;
        this.f = function0;
        this.c = q5tVar;
        this.g = function02;
        this.d = c0gVar;
        this.e = function03;
    }

    public /* synthetic */ kt4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
