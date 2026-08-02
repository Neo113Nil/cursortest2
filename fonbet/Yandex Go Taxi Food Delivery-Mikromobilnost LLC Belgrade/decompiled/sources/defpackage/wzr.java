package defpackage;

import android.app.Activity;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.messaging.ui.settings.inviteLinkInfo.c;
import java.util.List;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.logistics.sdk.screen_paid_insurance.PaidInsuranceScreen$Companion$ButtonStyle;
import ru.yandex.taxi.masstransit.ui.routeinfo.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class wzr implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ wzr(lww lwwVar, sls slsVar, tls tlsVar, f530 f530Var, int i) {
        this.a = 8;
        this.c = lwwVar;
        this.w = slsVar;
        this.b = tlsVar;
        this.x = f530Var;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [T, java.lang.Long] */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Long l;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.x;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cta1.a((zxu) obj6, (tls) obj5, (tls) obj3, (f530) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                CharSequence charSequence = (CharSequence) obj6;
                bcu bcuVar = (bcu) obj3;
                tls tlsVar = (tls) obj5;
                d9u d9uVar = (d9u) obj4;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    boolean k = btsVar.k(tlsVar) | btsVar.e(d9uVar);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new bdp(26, tlsVar, d9uVar);
                        btsVar.o0(Q);
                    }
                    l0b1.d(charSequence, bcuVar, (sls) Q, btsVar, 0);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                k2b1.a((f530) obj4, (wzu) obj6, (sls) obj5, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                n2b1.d((f530) obj4, (yzu) obj6, (sls) obj5, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                o2b1.b((f530) obj4, (a0v) obj6, (sls) obj5, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                f530 f530Var = (f530) obj4;
                IconSpotSize iconSpotSize = (IconSpotSize) obj6;
                wp2 wp2Var = (wp2) obj5;
                zls zlsVar = (zls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    f530 b = m4m0.b(ljs0.a(f530Var, iconSpotSize.getSize(), iconSpotSize.getSize()), ((ldc) btsVar2.m(k2z.b)).a, cyk0.a);
                    if (wp2Var != null) {
                        b = b.a(b, m.a(), new ctq(12, wp2Var));
                    }
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, b);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d2);
                    ly3.x(6, zlsVar, cj6.a, btsVar2, true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 6:
                tzt tztVar = (tzt) obj6;
                hgd hgdVar = (hgd) obj5;
                m1m0 m1m0Var = (m1m0) obj3;
                zfd zfdVar = (zfd) obj4;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    sb2.c(new vvf0[]{c3z.a.a(tztVar), g3z.a.a(hgdVar), n1m0.a.a(m1m0Var)}, wwg.S(-1368402291, true, new ogd(zfdVar, i2), btsVar3), btsVar3, 48);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 7:
                ((Integer) obj2).getClass();
                kww.c((Activity) obj6, (f530) obj4, (sls) obj5, (c) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                kww.d((lww) obj6, (sls) obj3, (tls) obj5, (f530) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                r9x.a((String) obj6, (String) obj5, (String) obj3, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                kdb1.a((sls) obj6, (f530) obj4, (c6y) obj5, (s5y) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                com.yandex.go.taxi.summary.verticalsummary.utils.c.a((androidx.compose.foundation.lazy.b) obj6, (wls) obj5, this.w, (wls) obj4, (fid) obj, vng.O(49));
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b.c((androidx.compose.foundation.pager.d) obj6, (List) obj5, (sls) obj3, (sls) obj4, (fid) obj, vng.O(3073));
                return zy11Var;
            case 13:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b.f((f530) obj4, (nx00) obj6, (byk0) obj5, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                xk91.a((f530) obj4, (f930) obj6, (sls) obj3, (tls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                cl91.r((nl30) obj6, (tls) obj5, (f530) obj4, (ll30) obj3, (fid) obj, vng.O(385));
                return zy11Var;
            case 16:
                ((Integer) obj2).getClass();
                a.d((vv30) obj6, (ety0) obj5, (wp2) obj3, (f530) obj4, (fid) obj, vng.O(3457));
                return zy11Var;
            case 17:
                ((Integer) obj2).getClass();
                a.b((wv30) obj6, (tls) obj5, (wls) obj3, (f530) obj4, (fid) obj, vng.O(9));
                return zy11Var;
            case 18:
                ((Integer) obj2).getClass();
                nl91.b((f530) obj4, (String) obj6, (ovi0) obj5, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                hm91.a(vng.O(1), (fid) obj, (tls) obj5, (tls) obj3, (j940) obj6, (ru.yandex.taxi.masstransit.tickets.c) obj4);
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                mpb1.a((lja0) obj6, (f530) obj4, (ru.yandex.taxi.masstransit.tickets.c) obj3, (tls) obj5, (fid) obj, vng.O(49));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.d.c((List) obj6, (ugh) obj3, (f530) obj4, (tls) obj5, (fid) obj, vng.O(385));
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                ed40.w((CharSequence) obj6, (CharSequence) obj5, (CharSequence) obj3, (CharSequence) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                rqb1.a((f530) obj4, (frv0) obj6, (w49) obj3, (tls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                xrb1.a((e47) obj6, (e47) obj5, (sls) obj3, (sls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.screen_paid_insurance.ui.a.a((CharSequence) obj6, (CharSequence) obj5, (PaidInsuranceScreen$Companion$ButtonStyle) obj3, (String) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.screen_paid_insurance.ui.a.b((String) obj6, (String) obj3, (String) obj4, (tls) obj5, (fid) obj, vng.O(1));
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                cn91.b((qb90) obj6, (sls) obj5, (String) obj3, (f530) obj4, (fid) obj, vng.O(3073));
                return zy11Var;
            case 28:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.a.c((nt90) obj6, (tls) obj5, (tls) obj3, (tls) obj4, (fid) obj, vng.O(3505));
                return zy11Var;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj6;
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj5;
                Ref$LongRef ref$LongRef2 = (Ref$LongRef) obj3;
                Ref$LongRef ref$LongRef3 = (Ref$LongRef) obj4;
                sva0 sva0Var = (sva0) obj2;
                if (sva0Var.h || sva0Var.i || (l = sva0Var.e) == null) {
                    return sva0Var;
                }
                ref$ObjectRef.element = Long.valueOf((System.nanoTime() - l.longValue()) / 1000000);
                Long l2 = sva0Var.j;
                ref$LongRef.element = l2 != null ? l2.longValue() : 0L;
                Long l3 = sva0Var.l;
                ref$LongRef2.element = l3 != null ? l3.longValue() : 0L;
                Long l4 = sva0Var.m;
                ref$LongRef3.element = l4 != null ? l4.longValue() : 0L;
                sva0Var.h = true;
                return null;
        }
    }

    public /* synthetic */ wzr(int i, int i2, tls tlsVar, f530 f530Var, Object obj, Object obj2) {
        this.a = i2;
        this.x = f530Var;
        this.c = obj;
        this.w = obj2;
        this.b = tlsVar;
    }

    public /* synthetic */ wzr(f530 f530Var, IconSpotSize iconSpotSize, wp2 wp2Var, zls zlsVar) {
        this.a = 5;
        this.x = f530Var;
        this.c = iconSpotSize;
        this.b = wp2Var;
        this.w = zlsVar;
    }

    public /* synthetic */ wzr(f530 f530Var, Object obj, Object obj2, sls slsVar, int i, int i2) {
        this.a = i2;
        this.x = f530Var;
        this.c = obj;
        this.b = obj2;
        this.w = slsVar;
    }

    public /* synthetic */ wzr(lja0 lja0Var, f530 f530Var, ru.yandex.taxi.masstransit.tickets.c cVar, tls tlsVar, int i) {
        this.a = 20;
        this.c = lja0Var;
        this.x = f530Var;
        this.w = cVar;
        this.b = tlsVar;
    }

    public /* synthetic */ wzr(CharSequence charSequence, bcu bcuVar, tls tlsVar, d9u d9uVar) {
        this.a = 1;
        this.c = charSequence;
        this.w = bcuVar;
        this.b = tlsVar;
        this.x = d9uVar;
    }

    public /* synthetic */ wzr(Object obj, tls tlsVar, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = tlsVar;
        this.x = obj2;
        this.w = obj3;
    }

    public /* synthetic */ wzr(Object obj, f530 f530Var, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.x = f530Var;
        this.b = obj2;
        this.w = obj3;
    }

    public /* synthetic */ wzr(Object obj, Object obj2, Object obj3, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = tlsVar;
    }

    public /* synthetic */ wzr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    public /* synthetic */ wzr(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = obj2;
        this.w = obj3;
        this.x = obj4;
    }
}
