package ru.yandex.taxi.scooters.presentation.finish_info;

import android.view.View;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsFromScreen;
import defpackage.bnn0;
import defpackage.bvf0;
import defpackage.czn0;
import defpackage.dpb;
import defpackage.fva0;
import defpackage.gnn0;
import defpackage.imn0;
import defpackage.ny61;
import defpackage.pso0;
import defpackage.t9h0;
import defpackage.tje;
import defpackage.tln0;
import defpackage.ukn0;
import defpackage.umn0;
import defpackage.vln0;
import defpackage.w030;
import defpackage.xva0;
import defpackage.ymn0;
import defpackage.yuf0;
import defpackage.yvf0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.domain.p;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final class e extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final fva0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final p J;
    public final ukn0 K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final MapNotificationsMuteRepository O;
    public final czn0 P;
    public final umn0 Q;
    public final yvf0 R;
    public final bnn0 S;
    public final yvf0 T;
    public final yvf0 U;
    public final yvf0 V;
    public final yvf0 W;
    public final yvf0 Z;
    public final vln0 a0;
    public final tln0 b0;
    public final yvf0 c0;
    public final ru.yandex.taxi.scooters.presentation.feedback.newbie.a d0;
    public final yvf0 e0;
    public final gnn0 f0;
    public final yvf0 g0;
    public final pso0 h0;

    public e(w030 w030Var, fva0 fva0Var, yvf0 yvf0Var, yvf0 yvf0Var2, p pVar, ukn0 ukn0Var, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, MapNotificationsMuteRepository mapNotificationsMuteRepository, czn0 czn0Var, umn0 umn0Var, yvf0 yvf0Var6, bnn0 bnn0Var, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, yvf0 yvf0Var11, vln0 vln0Var, tln0 tln0Var, yvf0 yvf0Var12, ru.yandex.taxi.scooters.presentation.feedback.newbie.a aVar, yvf0 yvf0Var13, gnn0 gnn0Var, yvf0 yvf0Var14, pso0 pso0Var) {
        super(null);
        this.F = w030Var;
        this.G = fva0Var;
        this.H = yvf0Var;
        this.I = yvf0Var2;
        this.J = pVar;
        this.K = ukn0Var;
        this.L = yvf0Var3;
        this.M = yvf0Var4;
        this.N = yvf0Var5;
        this.O = mapNotificationsMuteRepository;
        this.P = czn0Var;
        this.Q = umn0Var;
        this.R = yvf0Var6;
        this.S = bnn0Var;
        this.T = yvf0Var7;
        this.U = yvf0Var8;
        this.V = yvf0Var9;
        this.W = yvf0Var10;
        this.Z = yvf0Var11;
        this.a0 = vln0Var;
        this.b0 = tln0Var;
        this.c0 = yvf0Var12;
        this.d0 = aVar;
        this.e0 = yvf0Var13;
        this.f0 = gnn0Var;
        this.g0 = yvf0Var14;
        this.h0 = pso0Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        ymn0 ymn0Var = (ymn0) obj;
        this.O.a();
        this.P.b.add(ScootersMosRuAnalyticsFromScreen.FINISH);
        tje.N(o(), null, null, new ScootersFinishInfoRouter$onAttach$1(this, null), 3);
        super.G(ymn0Var);
        this.f0.a.a(gnn0.a(ymn0Var.a.f));
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((ymn0) obj);
        j(dpb.a);
        this.P.a();
        this.O.b();
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(ymn0 ymn0Var, ContinuationImpl continuationImpl) {
        ScootersFinishInfoRouter$provideModalView$1 scootersFinishInfoRouter$provideModalView$1;
        int i;
        final String str;
        if (continuationImpl instanceof ScootersFinishInfoRouter$provideModalView$1) {
            scootersFinishInfoRouter$provideModalView$1 = (ScootersFinishInfoRouter$provideModalView$1) continuationImpl;
            int i2 = scootersFinishInfoRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersFinishInfoRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                ScootersFinishInfoRouter$provideModalView$1 scootersFinishInfoRouter$provideModalView$12 = scootersFinishInfoRouter$provideModalView$1;
                Object obj = scootersFinishInfoRouter$provideModalView$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersFinishInfoRouter$provideModalView$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    imn0 imn0Var = ymn0Var.a;
                    ?? r2 = imn0Var.f == FeedbackSettingsParams$Screen.FINISH_CARD ? 1 : 0;
                    String str2 = r2 != 0 ? "ScootersFeedbackFinishCard" : "ScootersFeedbackCancelCard";
                    fva0.f(this.G, str2, PerformanceAnalytics$Type.Inflate, 0L, 4);
                    ScootersFinishInfoRouter$provideModalView$2$1 scootersFinishInfoRouter$provideModalView$2$1 = new ScootersFinishInfoRouter$provideModalView$2$1(this, r2, ymn0Var, imn0Var, null);
                    scootersFinishInfoRouter$provideModalView$12.L$0 = null;
                    scootersFinishInfoRouter$provideModalView$12.L$1 = null;
                    scootersFinishInfoRouter$provideModalView$12.L$2 = null;
                    scootersFinishInfoRouter$provideModalView$12.L$3 = str2;
                    scootersFinishInfoRouter$provideModalView$12.I$0 = r2;
                    scootersFinishInfoRouter$provideModalView$12.label = 1;
                    obj = bvf0.n(scootersFinishInfoRouter$provideModalView$2$1, scootersFinishInfoRouter$provideModalView$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersFinishInfoRouter$provideModalView$12.L$3;
                    kotlin.b.b(obj);
                }
                final ScootersFinishInfoModalView scootersFinishInfoModalView = (ScootersFinishInfoModalView) obj;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r3 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoRouter$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersFinishInfoModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str);
                        }
                        View view = scootersFinishInfoModalView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r3;
                scootersFinishInfoModalView.addOnAttachStateChangeListener(r3);
                return scootersFinishInfoModalView;
            }
        }
        scootersFinishInfoRouter$provideModalView$1 = new ScootersFinishInfoRouter$provideModalView$1(this, continuationImpl);
        ScootersFinishInfoRouter$provideModalView$1 scootersFinishInfoRouter$provideModalView$122 = scootersFinishInfoRouter$provideModalView$1;
        Object obj2 = scootersFinishInfoRouter$provideModalView$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersFinishInfoRouter$provideModalView$122.label;
        if (i != 0) {
        }
        final View scootersFinishInfoModalView2 = (ScootersFinishInfoModalView) obj2;
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? r32 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoRouter$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersFinishInfoModalView2.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = scootersFinishInfoModalView2;
                T t = ref$ObjectRef2.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef2.element = r32;
        scootersFinishInfoModalView2.addOnAttachStateChangeListener(r32);
        return scootersFinishInfoModalView2;
    }
}
