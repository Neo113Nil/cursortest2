package defpackage;

import android.net.Uri;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.l;
import androidx.compose.foundation.gestures.m;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.w;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import androidx.compose.ui.semantics.f;
import androidx.emoji2.emojipicker.EmojiPickerView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.go.due.data.api.dto.TimetableInfo;
import com.yandex.go.due_timetable.domain.model.CalculationsStatus;
import com.yandex.go.due_timetable.domain.model.LoadingState;
import com.yandex.go.due_timetable.presentation.g;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.DirectionSelectorButtonAction;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodeModalView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.b;
import com.yandex.messaging.experiments.ExperimentName;
import com.yandex.mobile.drive.sdk.DriveSdkView;
import com.ybsdk.core.analytics.generated.delegates.DivkitCommonEvents$DivkitCommonScreenLoadedResult;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import com.ybsdk.widgets.common.rangedatepicker.DayState;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dk91;
import defpackage.f530;
import defpackage.fid;
import defpackage.gf7;
import defpackage.hf7;
import defpackage.i9j;
import defpackage.if7;
import defpackage.j9j;
import defpackage.jl40;
import defpackage.lr20;
import defpackage.n70;
import defpackage.nl;
import defpackage.o1q0;
import defpackage.o9j;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rje;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.te91;
import defpackage.tfx;
import defpackage.tls;
import defpackage.ung0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.y161;
import defpackage.y891;
import defpackage.ze7;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Result;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationListener;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class t8j implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t8j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x029a, code lost:
    
        if (r0.b.c(r3) != false) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:5:0x002d, B:7:0x0036, B:8:0x0040, B:10:0x0058, B:14:0x006a, B:16:0x0071, B:21:0x0082, B:25:0x0090, B:26:0x00a8, B:29:0x008a, B:18:0x007e, B:32:0x0064, B:36:0x003d), top: B:4:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:5:0x002d, B:7:0x0036, B:8:0x0040, B:10:0x0058, B:14:0x006a, B:16:0x0071, B:21:0x0082, B:25:0x0090, B:26:0x00a8, B:29:0x008a, B:18:0x007e, B:32:0x0064, B:36:0x003d), top: B:4:0x002d }] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v62 */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        b bVar;
        String str;
        zy11 start$lambda$1;
        rym pymVar;
        Double d;
        unm0 unm0Var;
        int i;
        mp60 mp60Var;
        unm0 unm0Var2;
        int i2;
        mp60 mp60Var2;
        e8z0 b8z0Var;
        Object obj2;
        xy40 xy40Var;
        e8z0 e8z0Var;
        Calendar calendar;
        boolean z;
        int i3;
        Calendar calendar2;
        TimeZone d2;
        gne0 gne0Var;
        int i4;
        zy11 showEmojiPickerView$lambda$10;
        ExperimentName experimentName;
        String Y1;
        int i5 = this.a;
        int i6 = 0;
        r9 = false;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        r9 = 0;
        r9 = 0;
        r9 = 0;
        int i9 = 0;
        boolean z3 = false;
        c cVar = null;
        nqo nqoVar = null;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i5) {
            case 0:
                final o9j o9jVar = (o9j) obj3;
                c2q0 c2q0Var = (c2q0) obj;
                for (final j9j j9jVar : (List) obj4) {
                    c2q0.a(c2q0Var, null, null, false, null, new a(-141170293, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.details.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj5, Object obj6) {
                            c530 c530Var;
                            fid fidVar = (fid) obj5;
                            int intValue = ((Integer) obj6).intValue();
                            bts btsVar = (bts) fidVar;
                            if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                                sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                                int hashCode = Long.hashCode(btsVar.T);
                                r1b0 o = btsVar.o();
                                c530 c530Var2 = c530.a;
                                f530 d3 = androidx.compose.ui.b.d(btsVar, c530Var2);
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                if (btsVar.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar.i0();
                                if (btsVar.S) {
                                    btsVar.n(slsVar);
                                } else {
                                    btsVar.r0();
                                }
                                qje.W(btsVar, d.f, a);
                                qje.W(btsVar, d.e, o);
                                wls wlsVar = d.g;
                                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                                }
                                qje.W(btsVar, d.d, d3);
                                j9j j9jVar2 = j9j.this;
                                i9j i9jVar = j9jVar2.a;
                                ArrayList arrayList = j9jVar2.b;
                                if (i9jVar == null) {
                                    btsVar.e0(-1161673637);
                                    btsVar.t(false);
                                } else {
                                    btsVar.e0(-1161673636);
                                    te91.a(i9jVar.a, i9jVar.b, btsVar, 0);
                                    btsVar.t(false);
                                }
                                btsVar.e0(1209461142);
                                int i10 = 0;
                                for (Object obj7 : arrayList) {
                                    int i11 = i10 + 1;
                                    if (i10 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    o1q0 o1q0Var = (o1q0) obj7;
                                    o9j o9jVar2 = o9jVar;
                                    boolean e = btsVar.e(o9jVar2);
                                    Object Q = btsVar.Q();
                                    if (e || Q == did.a) {
                                        Q = new DetailsScreenKt$DetailsScreen$1$1$1$1$1$1$2$1$1(1, o9jVar2, o9j.class, "onItemClick", "onItemClick(Lcom/yandex/delivery/mapper/model/state/Payload;)V", 0);
                                        btsVar.o0(Q);
                                    }
                                    y891.b(o1q0Var, (tls) ((tfx) Q), btsVar, 0);
                                    if (i10 != scc.f(arrayList)) {
                                        btsVar.e0(-1594497093);
                                        c530Var = c530Var2;
                                        dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 0.0f, 10));
                                        btsVar.t(false);
                                    } else {
                                        c530Var = c530Var2;
                                        btsVar.e0(-1594188612);
                                        btsVar.t(false);
                                    }
                                    c530Var2 = c530Var;
                                    i10 = i11;
                                }
                                btsVar.t(false);
                                btsVar.t(true);
                            } else {
                                btsVar.Y();
                            }
                            return zy11.a;
                        }
                    }, true), 31);
                }
                return zy11Var;
            case 1:
                final sls slsVar = (sls) obj4;
                final tbb tbbVar = (tbb) obj3;
                final n70 n70Var = (n70) obj;
                n70Var.W(new tls() { // from class: com.ybsdk.feature.savings.internal.views.diffrate.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        ze7 ze7Var;
                        n70 n70Var2 = n70.this;
                        CalendarDayView calendarDayView = ((y161) n70Var2.N).a;
                        if7 if7Var = (if7) n70Var2.Z();
                        if (if7Var instanceof gf7) {
                            calendarDayView.render(null);
                            calendarDayView.setOnClickListener(null);
                        } else {
                            if (!(if7Var instanceof hf7)) {
                                w511.b();
                                return null;
                            }
                            hf7 hf7Var = (hf7) if7Var;
                            ze7 ze7Var2 = hf7Var.a;
                            DiffRateCalendarView$calendarAdapter$3 diffRateCalendarView$calendarAdapter$3 = (DiffRateCalendarView$calendarAdapter$3) slsVar;
                            if (((Boolean) diffRateCalendarView$calendarAdapter$3.invoke()).booleanValue()) {
                                int a = rje.a(calendarDayView.getContext(), ung0.ybColor_fill_default_100);
                                ze7Var = ze7.a(ze7Var2, DayState.DEFAULT, Integer.valueOf(a), Integer.valueOf(a), 29);
                            } else {
                                ze7Var = ze7Var2;
                            }
                            calendarDayView.render(ze7Var);
                            if (ze7Var2.d || ((Boolean) diffRateCalendarView$calendarAdapter$3.invoke()).booleanValue()) {
                                calendarDayView.setOnClickListener(null);
                            } else {
                                calendarDayView.setOnClickListener(new nl(5, tbbVar, hf7Var, calendarDayView));
                            }
                        }
                        return zy11.a;
                    }
                });
                return zy11Var;
            case 2:
                ss9 ss9Var = (ss9) obj4;
                ss9 ss9Var2 = (ss9) ((yzh) obj3).a;
                olj oljVar = (olj) obj;
                w310 w310Var = (w310) ss9Var.K;
                clq0 clq0Var = (clq0) ss9Var.L;
                mlj mljVar = mlj.a;
                if (clq0Var != null) {
                    String str2 = clq0Var.d;
                    String str3 = clq0Var.c;
                    String str4 = clq0Var.a;
                    if (jl40.l(oljVar, mljVar)) {
                        w310Var.b(str4, DirectionSelectorButtonAction.Back, str3, str2);
                    } else {
                        if (!(oljVar instanceof nlj)) {
                            w511.b();
                            return null;
                        }
                        w310Var.b(str4, DirectionSelectorButtonAction.Direction, str3, str2);
                    }
                }
                ((plj) ss9Var.J).getClass();
                if (jl40.l(oljVar, mljVar)) {
                    ss9Var2.r(new qu(9));
                } else {
                    if (!(oljVar instanceof nlj)) {
                        w511.b();
                        return null;
                    }
                    ss9Var2.r(new zvi(7, ((nlj) oljVar).a));
                }
                return zy11Var;
            case 3:
                DiscountsAddPromoCodeModalView discountsAddPromoCodeModalView = (DiscountsAddPromoCodeModalView) obj4;
                lpj lpjVar = (lpj) obj3;
                if (((Integer) obj).intValue() == 6) {
                    bVar = discountsAddPromoCodeModalView.presenter;
                    bVar.Lg(lpjVar.c.c);
                }
                return zy11Var;
            case 4:
                com.ybsdk.feature.status.screen.internal.ui.a aVar = (com.ybsdk.feature.status.screen.internal.ui.a) obj4;
                rt1 rt1Var = aVar.F.v;
                DivkitCommonScreenParams divkitCommonScreenParams = aVar.B;
                rt1.m(rt1Var, divkitCommonScreenParams.getPath(), divkitCommonScreenParams.getScreen(), DivkitCommonEvents$DivkitCommonScreenLoadedResult.OK, null, 24);
                return msl.a((msl) aVar.X(), new r8j0((bsl) obj3, null, 14), false, 55);
            case 5:
                z9m z9mVar = (z9m) obj4;
                z9mVar.b.setIntValue(((Number) ((oz40) obj3).getValue()).intValue());
                z9mVar.c.setFloatValue(0.0f);
                return zy11Var;
            case 6:
                mah mahVar = (mah) obj4;
                m mVar = (m) obj3;
                long g = wu60.g(mVar.T ? -1.0f : 1.0f, ((k9m) obj).a);
                Orientation orientation = mVar.P;
                zls zlsVar = l.a;
                mahVar.a.a.invoke(Float.valueOf(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : g >> 32))));
                return zy11Var;
            case 7:
                ((gj7) obj4).invoke((Set) obj);
                ((DriveHostView) obj3).requestFocus();
                return zy11Var;
            case 8:
                fnt fntVar = (fnt) obj3;
                Long l = (Long) obj;
                l.getClass();
                wmh wmhVar = ((kem) obj4).d;
                List list = (List) wmhVar.a.getValue();
                if (!list.isEmpty()) {
                    List<jem> list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    for (jem jemVar : list2) {
                        if (jl40.l(jemVar.a, fntVar.a)) {
                            String str5 = fntVar.e;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (l.longValue() > 0) {
                                str = t7s.j(l.longValue());
                            } else {
                                str = fntVar.g;
                                if (str == null) {
                                    str = "";
                                }
                            }
                            if (str.length() != 0) {
                                str5 = g8e.p(str5, " ", str);
                            }
                            jemVar = jem.c(jemVar, null, str5, 495);
                        }
                        arrayList.add(jemVar);
                    }
                    wmhVar.a.l(arrayList);
                }
                return zy11Var;
            case 9:
                start$lambda$1 = DriveSdkView.start$lambda$1((shf) obj4, (Uri) obj3, (efm) obj);
                return start$lambda$1;
            case 10:
                ((sls) obj4).invoke();
                ((pjm) obj3).a.c();
                return zy11Var;
            case 11:
                ArrayList arrayList2 = ((f31) obj4).e;
                ((m6y) ((u6y) obj)).f(arrayList2.size(), null, new oob(1, onm.a, arrayList2), new a(802480018, new pob(1, (tls) obj3, arrayList2), true));
                return zy11Var;
            case 12:
                String str6 = (String) obj4;
                lom lomVar = (lom) obj3;
                mnq0 mnq0Var = (mnq0) obj;
                if (str6 == null) {
                    str6 = String.valueOf(((jom) lomVar).a);
                }
                f.l(mnq0Var, str6);
                return zy11Var;
            case 13:
                fwi fwiVar = (fwi) obj3;
                return new qrm(new w(true, new j62(fwiVar, 1), new j62(fwiVar, 2), (SheetValue) obj, (tls) obj4));
            case 14:
                d0n d0nVar = (d0n) obj3;
                g0n g0nVar = (g0n) obj;
                j0n j0nVar = ((g) obj4).L;
                j0nVar.getClass();
                if (d0nVar instanceof uzm) {
                    return new g0n(LoadingState.NON_BLOCKING_LOADING, 16381);
                }
                if (d0nVar instanceof szm) {
                    return new g0n(LoadingState.ERROR, 16381);
                }
                if (d0nVar instanceof rzm) {
                    return new g0n(LoadingState.EMPTY, 16381);
                }
                if (d0nVar instanceof tzm) {
                    tzm tzmVar = (tzm) d0nVar;
                    qnm0 qnm0Var = tzmVar.a;
                    mp60 mp60Var3 = qnm0Var.b;
                    Calendar calendar3 = qnm0Var.f;
                    Calendar calendar4 = qnm0Var.g;
                    long a = s5w.a(0, 0);
                    if (calendar3 == null) {
                        calendar3 = calendar4;
                    }
                    if (mp60Var3.e()) {
                        xy40 xy40Var2 = ((rsg) mp60Var3.a()).c;
                        Object[] objArr = xy40Var2.a;
                        int i10 = xy40Var2.b;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            if (((e8z0) objArr[i12]) instanceof b8z0) {
                                i11++;
                            }
                        }
                        if (i11 == 0) {
                            if (((rsg) mp60Var3.a()).c.a() instanceof c8z0) {
                                if (calendar3 != null) {
                                    break;
                                }
                                cus0 a2 = j0n.a(g0nVar.c, a, g0nVar.e);
                                xy40 d3 = j0n.d(qnm0Var.h);
                                aof0 aof0Var = new aof0(d3, d3, false);
                                LoadingState loadingState = LoadingState.LOADED;
                                d2 = j0nVar.a.d();
                                if (d2 == null) {
                                    d2 = TimeZone.getDefault();
                                }
                                g0n a3 = g0n.a(g0nVar, null, loadingState, mp60Var3, new cus0(a), a2, null, null, Calendar.getInstance(d2), Integer.valueOf(qnm0Var.c), Integer.valueOf(qnm0Var.d), qnm0Var.e, aof0Var, qnm0Var.a, tzmVar.c, 1);
                                aof0 aof0Var2 = a3.l;
                                gne0Var = tzmVar.b;
                                if (gne0Var instanceof fne0) {
                                    return a3;
                                }
                                Calendar calendar5 = ((fne0) gne0Var).a;
                                cus0 cus0Var = a3.e;
                                mp60 mp60Var4 = a3.c;
                                mp60 mp60Var5 = aof0Var2.a;
                                Object[] objArr2 = mp60Var5.a;
                                int i13 = mp60Var5.b;
                                while (true) {
                                    if (i7 >= i13) {
                                        i4 = -1;
                                    } else {
                                        tnf0 tnf0Var = ((ynf0) objArr2[i7]).d;
                                        unf0 unf0Var = tnf0Var != null ? tnf0Var.a : null;
                                        if (unf0Var == null) {
                                            unf0Var = null;
                                        }
                                        if (unf0Var == null || unf0Var.a.getTimeInMillis() != calendar5.getTimeInMillis()) {
                                            i7++;
                                        } else {
                                            i4 = i7;
                                        }
                                    }
                                }
                                if (i4 < 0) {
                                    long c = j0n.c(mp60Var4, calendar5);
                                    return g0n.a(a3, null, null, null, new cus0(c), j0n.a(mp60Var4, c, cus0Var), null, null, null, null, null, null, null, null, null, 16359);
                                }
                                mp60 mp60Var6 = aof0Var2.a;
                                ynf0 ynf0Var = (ynf0) mp60Var6.b(i4);
                                tnf0 tnf0Var2 = ynf0Var.d;
                                if (tnf0Var2 != null) {
                                    long c2 = j0n.c(mp60Var4, tnf0Var2.a.a);
                                    cus0 a4 = j0n.a(mp60Var4, c2, cus0Var);
                                    xy40 xy40Var3 = new xy40((Object) null);
                                    xy40Var3.k(mp60Var6);
                                    xy40Var3.p(i4, ynf0.a(ynf0Var, new tnf0(ynf0Var.d.a, true)));
                                    return g0n.a(a3, null, null, null, new cus0(c2), a4, null, null, null, null, null, null, aof0.a(aof0Var2, xy40Var3), null, null, 14311);
                                }
                                ny61.g("Required value was null.");
                            }
                        }
                    }
                    if (calendar3 != null) {
                        a = j0n.c(mp60Var3, calendar3);
                    } else {
                        Object[] objArr3 = mp60Var3.a;
                        int i14 = mp60Var3.b;
                        int i15 = 0;
                        while (true) {
                            if (i15 < i14) {
                                xy40 xy40Var4 = ((rsg) objArr3[i15]).c;
                                Object[] objArr4 = xy40Var4.a;
                                int i16 = xy40Var4.b;
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if (((e8z0) objArr4[i17]) instanceof b8z0) {
                                        a = s5w.a(i15, i17);
                                    }
                                }
                                i15++;
                            }
                        }
                    }
                    cus0 a22 = j0n.a(g0nVar.c, a, g0nVar.e);
                    xy40 d32 = j0n.d(qnm0Var.h);
                    aof0 aof0Var3 = new aof0(d32, d32, false);
                    LoadingState loadingState2 = LoadingState.LOADED;
                    d2 = j0nVar.a.d();
                    if (d2 == null) {
                    }
                    g0n a32 = g0n.a(g0nVar, null, loadingState2, mp60Var3, new cus0(a), a22, null, null, Calendar.getInstance(d2), Integer.valueOf(qnm0Var.c), Integer.valueOf(qnm0Var.d), qnm0Var.e, aof0Var3, qnm0Var.a, tzmVar.c, 1);
                    aof0 aof0Var22 = a32.l;
                    gne0Var = tzmVar.b;
                    if (gne0Var instanceof fne0) {
                    }
                } else {
                    if (d0nVar instanceof yzm) {
                        int i18 = ((yzm) d0nVar).a;
                        Calendar calendar6 = g0nVar.h;
                        mp60 mp60Var7 = g0nVar.c;
                        if (calendar6 != null) {
                            cus0 cus0Var2 = g0nVar.e;
                            if (cus0Var2 == null) {
                                e8z0Var = null;
                            } else {
                                long j = cus0Var2.a;
                                e8z0Var = (e8z0) ((rsg) mp60Var7.b((int) (j >> 32))).c.b((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j));
                            }
                            if (e8z0Var != null) {
                                boolean z4 = e8z0Var instanceof c8z0;
                                if (z4) {
                                    calendar = calendar6;
                                } else if (e8z0Var instanceof b8z0) {
                                    calendar = ((b8z0) e8z0Var).b;
                                } else if (e8z0Var instanceof d8z0) {
                                    calendar = ((d8z0) e8z0Var).a;
                                } else {
                                    w511.b();
                                }
                                if (i18 <= mp60Var7.b - 1) {
                                    rsg rsgVar = (rsg) mp60Var7.b(i18);
                                    Calendar a5 = wf7.a(calendar);
                                    Calendar calendar7 = rsgVar.a;
                                    xy40 xy40Var5 = rsgVar.c;
                                    a5.set(5, calendar7.get(5));
                                    a5.set(2, rsgVar.a.get(2));
                                    Object[] objArr5 = xy40Var5.a;
                                    long j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                                    if (z4) {
                                        int i19 = xy40Var5.b;
                                        ?? r4 = false;
                                        while (i8 < i19) {
                                            e8z0 e8z0Var2 = (e8z0) objArr5[i8];
                                            if (e8z0Var2 instanceof b8z0) {
                                                long abs = Math.abs(a5.getTimeInMillis() - ((b8z0) e8z0Var2).b.getTimeInMillis());
                                                if (abs < j2) {
                                                    j2 = abs;
                                                    r4 = i8;
                                                }
                                            }
                                            i8++;
                                            r4 = r4;
                                        }
                                        i9 = r4 == true ? 1 : 0;
                                    } else {
                                        int i20 = xy40Var5.b;
                                        for (int i21 = 0; i21 < i20; i21++) {
                                            e8z0 e8z0Var3 = (e8z0) objArr5[i21];
                                            if ((e8z0Var3 instanceof b8z0) || (e8z0Var3 instanceof c8z0)) {
                                                z = true;
                                                Object[] objArr6 = xy40Var5.a;
                                                for (i3 = xy40Var5.b - 1; -1 < i3; i3--) {
                                                    e8z0 e8z0Var4 = (e8z0) objArr6[i3];
                                                    if (e8z0Var4 instanceof b8z0) {
                                                        calendar2 = ((b8z0) e8z0Var4).b;
                                                    } else if (e8z0Var4 instanceof c8z0) {
                                                        calendar2 = calendar6;
                                                    } else if (!(e8z0Var4 instanceof d8z0)) {
                                                        w511.b();
                                                    } else if (!z) {
                                                        calendar2 = ((d8z0) e8z0Var4).a;
                                                    }
                                                    long abs2 = Math.abs(a5.getTimeInMillis() - calendar2.getTimeInMillis());
                                                    if (abs2 <= j2) {
                                                        i9 = i3;
                                                        j2 = abs2;
                                                    }
                                                }
                                            }
                                        }
                                        z = false;
                                        Object[] objArr62 = xy40Var5.a;
                                        while (-1 < i3) {
                                        }
                                    }
                                }
                            }
                        }
                        return g0n.a(g0nVar, null, null, null, new cus0(s5w.a(i18, i9)), null, null, null, null, null, null, null, null, null, null, 16375);
                    }
                    if (d0nVar instanceof b0n) {
                        b0n b0nVar = (b0n) d0nVar;
                        cus0 cus0Var3 = g0nVar.d;
                        mp60 mp60Var8 = g0nVar.c;
                        if (cus0Var3 != null) {
                            long a6 = s5w.a((int) (cus0Var3.a >> 32), y6i0.d(b0nVar.a, 0, ((rsg) mp60Var8.b(r0)).c.b - 1));
                            e8z0 e8z0Var5 = (e8z0) ((rsg) mp60Var8.b((int) (a6 >> 32))).c.b((int) (a6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                            aof0 aof0Var4 = g0nVar.l;
                            mp60 mp60Var9 = aof0Var4.a;
                            mp60 mp60Var10 = aof0Var4.b;
                            boolean z5 = aof0Var4.c;
                            if (e8z0Var5 instanceof u190) {
                                e2n c3 = ((u190) e8z0Var5).c();
                                mp60 mp60Var11 = c3 != null ? c3.b.a : null;
                                if (mp60Var11 != null) {
                                    xy40Var = j0n.d(mp60Var11);
                                    if (xy40Var == null) {
                                        mp60Var9 = xy40Var;
                                        z3 = true;
                                    } else if (z5) {
                                        mp60Var9 = mp60Var10;
                                    } else {
                                        z3 = z5;
                                        mp60Var10 = mp60Var9;
                                    }
                                    return g0n.a(g0nVar, null, null, null, new cus0(a6), new cus0(a6), null, null, null, null, null, null, new aof0(mp60Var9, mp60Var10, z3), null, null, 14311);
                                }
                            }
                            xy40Var = null;
                            if (xy40Var == null) {
                            }
                            return g0n.a(g0nVar, null, null, null, new cus0(a6), new cus0(a6), null, null, null, null, null, null, new aof0(mp60Var9, mp60Var10, z3), null, null, 14311);
                        }
                        ny61.g("Required value was null.");
                    } else {
                        if (d0nVar instanceof vzm) {
                            vzm vzmVar = (vzm) d0nVar;
                            unm0 unm0Var3 = vzmVar.a;
                            Double d4 = g0nVar.f;
                            mp60 mp60Var12 = unm0Var3.c;
                            TimetableInfo timetableInfo = g0nVar.k;
                            boolean l2 = timetableInfo != null ? jl40.l(timetableInfo.f, Boolean.TRUE) : false;
                            int i22 = i0n.a[vzmVar.b.ordinal()];
                            if (i22 == 1) {
                                pymVar = new pym();
                            } else if (i22 == 2) {
                                pymVar = new h1n();
                            } else {
                                w511.b();
                            }
                            Double a7 = pymVar.a(d4, mp60Var12, l2);
                            Double d5 = g0nVar.g;
                            if (d5 == null) {
                                Object[] objArr7 = mp60Var12.a;
                                int i23 = mp60Var12.b;
                                int i24 = 0;
                                while (true) {
                                    if (i24 < i23) {
                                        obj2 = objArr7[i24];
                                        if (!(((te7) obj2).b instanceof we7)) {
                                            i24++;
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                te7 te7Var = (te7) obj2;
                                d = te7Var != null ? te7Var.c : null;
                            } else {
                                d = d5;
                            }
                            mp60 mp60Var13 = g0nVar.c;
                            xy40 xy40Var6 = new xy40(mp60Var13.b);
                            Object[] objArr8 = mp60Var13.a;
                            int i25 = mp60Var13.b;
                            int i26 = 0;
                            while (i26 < i25) {
                                rsg rsgVar2 = (rsg) objArr8[i26];
                                if (rsgVar2.a.getTimeInMillis() == unm0Var3.a.getTimeInMillis()) {
                                    xy40 xy40Var7 = rsgVar2.c;
                                    CalculationsStatus calculationsStatus = unm0Var3.b;
                                    hz40 hz40Var = new hz40(mp60Var12.b);
                                    Object[] objArr9 = mp60Var12.a;
                                    int i27 = mp60Var12.b;
                                    for (int i28 = i6; i28 < i27; i28++) {
                                        te7 te7Var2 = (te7) objArr9[i28];
                                        hz40Var.l(vpb1.l(te7Var2.b), te7Var2);
                                    }
                                    xy40 xy40Var8 = new xy40(xy40Var7.b);
                                    Object[] objArr10 = xy40Var7.a;
                                    int i29 = xy40Var7.b;
                                    int i30 = 0;
                                    while (i30 < i29) {
                                        e8z0 e8z0Var6 = (e8z0) objArr10[i30];
                                        if (e8z0Var6 instanceof c8z0) {
                                            c8z0 c8z0Var = (c8z0) e8z0Var6;
                                            bus0 b = j0n.b(hz40Var, c8z0Var.b, calculationsStatus);
                                            b8z0Var = c8z0Var;
                                            if (b != null) {
                                                b8z0Var = new c8z0(b);
                                            }
                                        } else {
                                            boolean z6 = e8z0Var6 instanceof b8z0;
                                            b8z0Var = e8z0Var6;
                                            if (z6) {
                                                b8z0 b8z0Var2 = (b8z0) e8z0Var6;
                                                bus0 b2 = j0n.b(hz40Var, b8z0Var2.f, calculationsStatus);
                                                b8z0Var = b8z0Var2;
                                                if (b2 != null) {
                                                    unm0Var2 = unm0Var3;
                                                    i2 = i25;
                                                    mp60Var2 = mp60Var12;
                                                    b8z0Var = new b8z0(b2, b8z0Var2.b, b8z0Var2.c, b8z0Var2.d);
                                                    xy40Var8.g(b8z0Var);
                                                    i30++;
                                                    unm0Var3 = unm0Var2;
                                                    i25 = i2;
                                                    mp60Var12 = mp60Var2;
                                                }
                                            }
                                        }
                                        unm0Var2 = unm0Var3;
                                        i2 = i25;
                                        mp60Var2 = mp60Var12;
                                        xy40Var8.g(b8z0Var);
                                        i30++;
                                        unm0Var3 = unm0Var2;
                                        i25 = i2;
                                        mp60Var12 = mp60Var2;
                                    }
                                    unm0Var = unm0Var3;
                                    i = i25;
                                    mp60Var = mp60Var12;
                                    rsgVar2 = rsg.a(rsgVar2, xy40Var8);
                                } else {
                                    unm0Var = unm0Var3;
                                    i = i25;
                                    mp60Var = mp60Var12;
                                }
                                xy40Var6.g(rsgVar2);
                                i26++;
                                unm0Var3 = unm0Var;
                                i25 = i;
                                mp60Var12 = mp60Var;
                                i6 = 0;
                            }
                            return g0n.a(g0nVar, null, null, xy40Var6, null, null, a7, d, null, null, null, null, null, null, null, 16283);
                        }
                        if (!(d0nVar instanceof a0n)) {
                            return d0nVar instanceof wzm ? g0n.a(g0nVar, null, LoadingState.BLOCKING_LOADING, null, null, null, null, null, null, null, null, null, null, null, null, 16381) : g0nVar;
                        }
                        int i31 = ((a0n) d0nVar).a;
                        aof0 aof0Var5 = g0nVar.l;
                        mp60 mp60Var14 = g0nVar.c;
                        mp60 mp60Var15 = aof0Var5.a;
                        ynf0 ynf0Var2 = (ynf0) mp60Var15.b(i31);
                        tnf0 tnf0Var3 = ynf0Var2.d;
                        if (tnf0Var3 != null) {
                            long c4 = j0n.c(mp60Var14, tnf0Var3.a.a);
                            cus0 a8 = j0n.a(mp60Var14, c4, g0nVar.e);
                            xy40 xy40Var9 = new xy40((Object) null);
                            xy40Var9.k(mp60Var15);
                            xy40Var9.p(i31, ynf0.a(ynf0Var2, new tnf0(ynf0Var2.d.a, true)));
                            return g0n.a(g0nVar, null, null, null, new cus0(c4), a8, null, null, null, null, null, null, aof0.a(g0nVar.l, xy40Var9), null, null, 14311);
                        }
                        ny61.g("Required value was null.");
                    }
                }
                return null;
            case 15:
                String str7 = (String) obj4;
                mnq0 mnq0Var2 = (mnq0) obj;
                String str8 = ((o5n) obj3).e;
                f.l(mnq0Var2, str7 + " " + (str8 != null ? str8 : ""));
                f.p(mnq0Var2, 5);
                return zy11Var;
            case 16:
                f.f((mnq0) obj, null, new y5n((tls) obj4, (b6n) obj3, i6));
                return zy11Var;
            case 17:
                ((ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.d) obj4).c.J((gv90) obj, ((b6n) ((n351) obj3)).l);
                return zy11Var;
            case 18:
                ((e) obj4).b.b(((qgb0) obj).a, ((d6n) ((n351) obj3)).f);
                return zy11Var;
            case 19:
                gv90 gv90Var = (gv90) obj;
                e1q0 e1q0Var = (e1q0) ((vyc) obj4).c;
                i6n i6nVar = ((j6n) ((n351) obj3)).d;
                e1q0Var.b(gv90Var, i6nVar != null ? i6nVar.c : null);
                return zy11Var;
            case 20:
                ((ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.g) obj4).b.b((gv90) obj, ((b7n) ((n351) obj3)).n);
                return zy11Var;
            case 21:
                g7n g7nVar = ((com.yandex.go.dynamic.impl.b) obj4).c;
                String id = ((DynamicFeature) obj3).getId();
                pj pjVar = g7nVar.a;
                pjVar.getClass();
                HashMap hashMap = new HashMap();
                if (id != null) {
                    hashMap.put("id", id);
                }
                pjVar.a.a("DynamicFeature.Prefetch.Success", hashMap, 1, new HashMap());
                return zy11Var;
            case 22:
                ajn.a((ajn) obj4, (IVerificationListener) obj3);
                return zy11Var;
            case 23:
                ((ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data.c) obj4).f.d.c((String) obj, (erv) obj3);
                return zy11Var;
            case 24:
                oep0 oep0Var = (oep0) obj4;
                qnn qnnVar = (qnn) obj3;
                Object value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    oep0.b(oep0Var, (m950) qnnVar.c.get());
                }
                return zy11Var;
            case 25:
                f8l0 f8l0Var = (f8l0) obj3;
                ((Integer) obj).getClass();
                if (!((con) ((n351) obj4)).d && f8l0Var.e) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 26:
                ((com.yandex.go.settings.email.a) obj4).z.b((csn) obj3);
                return zy11Var;
            case 27:
                showEmojiPickerView$lambda$10 = EmojiPickerView.showEmojiPickerView$lambda$10((EmojiPickerView) obj4, (GridLayoutManager) obj3, ((Integer) obj).intValue());
                return showEmojiPickerView$lambda$10;
            case 28:
                unr0.C(new Object[]{(String) obj4}, 1, "start expedited job for order %s", jst.e);
                return ((hqo) obj3).a.e(new w4j0("pull_order_status", 0L, null, null, null, false, false, 0L, null, 1534)).a;
            default:
                ExperimentName experimentName2 = (ExperimentName) obj3;
                mqo mqoVar = ((bro) obj4).c;
                ull0 T0 = ((oll0) obj).T0("SELECT * FROM experiments WHERE name = ?;");
                try {
                    mqoVar.getClass();
                    String uaasId = experimentName2.getUaasId();
                    if (uaasId == null) {
                        T0.p(1);
                    } else {
                        T0.g1(1, uaasId);
                    }
                    int r = eja1.r(T0, "experiment_id");
                    int r2 = eja1.r(T0, "name");
                    int r3 = eja1.r(T0, Constants.KEY_DATA);
                    if (T0.q()) {
                        long j3 = T0.getLong(r);
                        String Y12 = T0.isNull(r2) ? null : T0.Y1(r2);
                        if (Y12 != null) {
                            ExperimentName[] values = ExperimentName.values();
                            int length = values.length;
                            for (int i32 = 0; i32 < length; i32++) {
                                experimentName = values[i32];
                                if (jl40.l(experimentName.getUaasId(), Y12)) {
                                    Y1 = !T0.isNull(r3) ? null : T0.Y1(r3);
                                    if (Y1 != null) {
                                        rbx rbxVar = sbx.d;
                                        rbxVar.getClass();
                                        cVar = (c) rbxVar.b(qke.n(c.Companion.serializer()), Y1);
                                    }
                                    nqoVar = new nqo(j3, experimentName, cVar);
                                }
                            }
                        }
                        experimentName = null;
                        if (!T0.isNull(r3)) {
                        }
                        if (Y1 != null) {
                        }
                        nqoVar = new nqo(j3, experimentName, cVar);
                    }
                    T0.close();
                    return nqoVar;
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
        }
    }
}
