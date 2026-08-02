package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.cdz0;
import defpackage.cjw0;
import defpackage.d301;
import defpackage.ds31;
import defpackage.ey4;
import defpackage.fzw;
import defpackage.g2q0;
import defpackage.g801;
import defpackage.gci0;
import defpackage.guq;
import defpackage.j801;
import defpackage.jiz0;
import defpackage.jqr;
import defpackage.k5c;
import defpackage.kcz0;
import defpackage.mth;
import defpackage.nr;
import defpackage.ny61;
import defpackage.osq;
import defpackage.owv;
import defpackage.qkg;
import defpackage.tje;
import defpackage.uls0;
import defpackage.v6s;
import defpackage.vn;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.x201;
import defpackage.xsr0;
import defpackage.yr31;
import defpackage.yvz0;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.m;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.n;

/* loaded from: classes5.dex */
public final class k extends yr31 {
    public final ru.yandex.taxi.logistics.sdk.management.localstate.e A;
    public final cjw0 B;
    public final ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e C;
    public final ru.yandex.taxi.logistics.payment.a D;
    public final yvz0 E;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a F;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.domain.a G;
    public final v6s H;
    public final ru.yandex.taxi.logistics.sdk.management.storage.f I;
    public final m J;
    public final com.yandex.delivery.utils.dialogmanager.a K;
    public final n L;
    public final String[] M = {"header-key", "cost-details-key", "timeline-key", "dynamic-timeline-key", "rover-key", "accent-button-key", "primary-action-buttons-key", "live-location-key", "ads-banner-key", "neuro-postcard", "feedback-key", "separator-key", "poll-key", "separator-key", "pay-now-key", "separator-key", "dynamic-content-key", "separator-key", "secondary-action-buttons-key"};
    public final gci0 N;
    public final gci0 O;
    public final gci0 P;
    public final String b;
    public final x201 c;
    public final kcz0 w;
    public final j801 x;
    public final guq y;
    public final osq z;

    public k(String str, com.yandex.go.delivery.tracking.l lVar, x201 x201Var, kcz0 kcz0Var, j801 j801Var, guq guqVar, ru.yandex.taxi.logistics.sdk.tracking.impl.data.c cVar, osq osqVar, ru.yandex.taxi.logistics.sdk.management.localstate.e eVar, cjw0 cjw0Var, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar2, ru.yandex.taxi.logistics.payment.a aVar, yvz0 yvz0Var, ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.bottom_dashboard.a aVar2, ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.top_accent_bar.e eVar3, ru.yandex.taxi.logistics.sdk.tracking.impl.ui.order_state.a aVar3, ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.a aVar4, ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.domain.a aVar5, d301 d301Var, v6s v6sVar, ru.yandex.taxi.logistics.sdk.management.storage.f fVar, m mVar, com.yandex.delivery.utils.dialogmanager.a aVar6, n nVar) {
        this.b = str;
        this.c = x201Var;
        this.w = kcz0Var;
        this.x = j801Var;
        this.y = guqVar;
        this.z = osqVar;
        this.A = eVar;
        this.B = cjw0Var;
        this.C = eVar2;
        this.D = aVar;
        this.E = yvz0Var;
        this.F = aVar4;
        this.G = aVar5;
        this.H = v6sVar;
        this.I = fVar;
        this.J = mVar;
        this.K = aVar6;
        this.L = nVar;
        gci0 gci0Var = eVar2.e;
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(gci0Var, new jiz0(2)), new TrackingViewModel$special$$inlined$flatMapLatest$1(null, this));
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        int i = 3;
        this.N = kotlinx.coroutines.flow.e.R(X, a, wsr0.a(wsr0Var, 3), Y());
        this.O = kotlinx.coroutines.flow.e.R(aVar2.b, ds31.a(this), wsr0.a(wsr0Var, 3), null);
        this.P = kotlinx.coroutines.flow.e.R(eVar3.c, ds31.a(this), wsr0.a(wsr0Var, 3), null);
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(x201Var.getActions(), new TrackingViewModel$launchActionHandling$1(2, lVar, com.yandex.go.delivery.tracking.l.class, "handleAction", "handleAction(Lru/yandex/taxi/logistics/sdk/tracking/domain/api/models/Action;)V", 4), i));
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(cVar.i, new TrackingViewModel$launchFeedbackSending$1(null, this), i));
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(new g801(0, aVar3.a, this), new TrackingViewModel$launchOrderStateEmitting$2(2, x201Var, x201.class, "emit", "emit(Lru/yandex/taxi/logistics/sdk/tracking/domain/api/models/Action;)V", 4), i));
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(new owv(new jqr(kotlinx.coroutines.flow.e.t((fzw) cjw0Var.c), new TrackingViewModel$launchAnalyticsUpdating$1(null, this), i), i), new TrackingViewModel$launchAnalyticsUpdating$3(2, x201Var, x201.class, "emit", "emit(Lru/yandex/taxi/logistics/sdk/tracking/domain/api/models/Action;)V", 4), i));
        eVar2.b();
        tje.N(ds31.a(this), null, null, new TrackingViewModel$subscribeOnFirstAnalyticsUpdate$1(null, this), 3);
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(new ey4(new cdz0(gci0Var, 4), 24), new TrackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2(null, this), i));
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(kotlinx.coroutines.flow.e.X(d301Var.b, new TrackingViewModel$launchTrackingTaskUpdating$$inlined$flatMapLatest$1(null, this)), new TrackingViewModel$launchTrackingTaskUpdating$2(null, this), i));
        tje.N(ds31.a(this), null, null, new TrackingViewModel$launchOnFirstLoadActionsHandling$1(null, this), 3);
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(kotlinx.coroutines.flow.e.t(new mth(new ey4(new cdz0(gci0Var, i), 22), 6)), new TrackingViewModel$launchTrackingPopupHandling$2(null, this), i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006c, code lost:
    
        if (r13 == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(k kVar, List list, ContinuationImpl continuationImpl) {
        TrackingViewModel$processOnFirstLoadActions$1 trackingViewModel$processOnFirstLoadActions$1;
        int i;
        boolean booleanValue;
        List list2;
        boolean z;
        boolean z2;
        Iterator it;
        int i2;
        String str = kVar.b;
        ru.yandex.taxi.logistics.sdk.management.storage.f fVar = kVar.I;
        if (continuationImpl instanceof TrackingViewModel$processOnFirstLoadActions$1) {
            trackingViewModel$processOnFirstLoadActions$1 = (TrackingViewModel$processOnFirstLoadActions$1) continuationImpl;
            int i3 = trackingViewModel$processOnFirstLoadActions$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                trackingViewModel$processOnFirstLoadActions$1.label = i3 - Integer.MIN_VALUE;
                Object obj = trackingViewModel$processOnFirstLoadActions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingViewModel$processOnFirstLoadActions$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    trackingViewModel$processOnFirstLoadActions$1.L$0 = list;
                    trackingViewModel$processOnFirstLoadActions$1.label = 1;
                    obj = fVar.a(str, trackingViewModel$processOnFirstLoadActions$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            z = trackingViewModel$processOnFirstLoadActions$1.Z$0;
                            list2 = (List) trackingViewModel$processOnFirstLoadActions$1.L$0;
                            kotlin.b.b(obj);
                            Iterator it2 = list2.iterator();
                            z2 = z;
                            it = it2;
                            i2 = 0;
                            while (it.hasNext()) {
                            }
                            return zy11Var;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = trackingViewModel$processOnFirstLoadActions$1.I$0;
                        z2 = trackingViewModel$processOnFirstLoadActions$1.Z$0;
                        it = (Iterator) trackingViewModel$processOnFirstLoadActions$1.L$2;
                        kotlin.b.b(obj);
                        while (it.hasNext()) {
                            vn vnVar = (vn) it.next();
                            m mVar = kVar.J;
                            trackingViewModel$processOnFirstLoadActions$1.L$0 = null;
                            trackingViewModel$processOnFirstLoadActions$1.L$1 = null;
                            trackingViewModel$processOnFirstLoadActions$1.L$2 = it;
                            trackingViewModel$processOnFirstLoadActions$1.L$3 = null;
                            trackingViewModel$processOnFirstLoadActions$1.L$4 = null;
                            trackingViewModel$processOnFirstLoadActions$1.Z$0 = z2;
                            trackingViewModel$processOnFirstLoadActions$1.I$0 = i2;
                            trackingViewModel$processOnFirstLoadActions$1.I$1 = 0;
                            trackingViewModel$processOnFirstLoadActions$1.label = 3;
                            if (vnVar == null) {
                                mVar.getClass();
                                w511.b();
                                return null;
                            }
                            Object a = mVar.a(vnVar, trackingViewModel$processOnFirstLoadActions$1);
                            if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                a = zy11Var;
                            }
                            if (a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    list = (List) trackingViewModel$processOnFirstLoadActions$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    trackingViewModel$processOnFirstLoadActions$1.L$0 = list;
                    trackingViewModel$processOnFirstLoadActions$1.Z$0 = booleanValue;
                    trackingViewModel$processOnFirstLoadActions$1.label = 2;
                    if (fVar.c(str, trackingViewModel$processOnFirstLoadActions$1) != coroutineSingletons) {
                        list2 = list;
                        z = booleanValue;
                        Iterator it22 = list2.iterator();
                        z2 = z;
                        it = it22;
                        i2 = 0;
                        while (it.hasNext()) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        trackingViewModel$processOnFirstLoadActions$1 = new TrackingViewModel$processOnFirstLoadActions$1(kVar, continuationImpl);
        Object obj2 = trackingViewModel$processOnFirstLoadActions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingViewModel$processOnFirstLoadActions$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
        return zy11Var2;
    }

    public static qkg Y() {
        return new qkg(Collections.singletonList(new g2q0(Collections.singletonList(new uls0()), null, null, null, false, null, null, null, null, 1022)), null, null, null, 30);
    }

    public final void X(nr nrVar) {
        tje.N(ds31.a(this), null, null, new TrackingViewModel$onTopAccentBarClicked$1(this, nrVar, null), 3);
    }
}
