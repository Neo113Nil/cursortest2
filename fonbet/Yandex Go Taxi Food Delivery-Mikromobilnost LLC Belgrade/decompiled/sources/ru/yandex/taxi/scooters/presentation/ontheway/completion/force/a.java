package ru.yandex.taxi.scooters.presentation.ontheway.completion.force;

import android.content.Context;
import android.view.View;
import defpackage.a650;
import defpackage.fva0;
import defpackage.jon0;
import defpackage.lx4;
import defpackage.non0;
import defpackage.ny61;
import defpackage.oon0;
import defpackage.pon0;
import defpackage.ron0;
import defpackage.sls;
import defpackage.t9h0;
import defpackage.ukn0;
import defpackage.w030;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.force.a;

/* loaded from: classes6.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final fva0 G;
    public final ukn0 H;
    public final ron0 I;
    public final pon0 J;

    public a(w030 w030Var, fva0 fva0Var, ukn0 ukn0Var, ron0 ron0Var, pon0 pon0Var) {
        super(null);
        this.F = w030Var;
        this.G = fva0Var;
        this.H = ukn0Var;
        this.I = ron0Var;
        this.J = pon0Var;
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
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.ontheway.completion.force.ScootersForceCompletionRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(jon0 jon0Var, ContinuationImpl continuationImpl) {
        ScootersForceCompletionRouter$provideModalView$1 scootersForceCompletionRouter$provideModalView$1;
        int i;
        ScootersErrorCode scootersErrorCode;
        String str;
        Boolean bool;
        jon0 jon0Var2 = jon0Var;
        if (continuationImpl instanceof ScootersForceCompletionRouter$provideModalView$1) {
            scootersForceCompletionRouter$provideModalView$1 = (ScootersForceCompletionRouter$provideModalView$1) continuationImpl;
            int i2 = scootersForceCompletionRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersForceCompletionRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersForceCompletionRouter$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersForceCompletionRouter$provideModalView$1.label;
                final int i3 = 1;
                if (i != 0) {
                    b.b(obj);
                    ScootersErrorCode scootersErrorCode2 = jon0Var2.c;
                    scootersForceCompletionRouter$provideModalView$1.L$0 = jon0Var2;
                    scootersForceCompletionRouter$provideModalView$1.L$1 = scootersErrorCode2;
                    scootersForceCompletionRouter$provideModalView$1.label = 1;
                    Object b = this.H.a.b(scootersForceCompletionRouter$provideModalView$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    scootersErrorCode = scootersErrorCode2;
                    obj = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ScootersErrorCode scootersErrorCode3 = (ScootersErrorCode) scootersForceCompletionRouter$provideModalView$1.L$1;
                    jon0 jon0Var3 = (jon0) scootersForceCompletionRouter$provideModalView$1.L$0;
                    b.b(obj);
                    scootersErrorCode = scootersErrorCode3;
                    jon0Var2 = jon0Var3;
                }
                a650 a650Var = ((g0) obj).g;
                final int i4 = 0;
                boolean booleanValue = (a650Var != null || (bool = a650Var.c) == null) ? false : bool.booleanValue();
                final String str2 = "ScootersForceCompletionView";
                fva0.f(this.G, "ScootersForceCompletionView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                str = "ScootersForceCompletionCard";
                if (scootersErrorCode != null && oon0.a[scootersErrorCode.ordinal()] == 1) {
                    str = "ScootersFixForceCompletionCard";
                }
                final int i5 = 2;
                final ScootersForceCompletionView scootersForceCompletionView = new ScootersForceCompletionView((Context) this.I.a.a.get(), jon0Var2.a, jon0Var2.b, scootersErrorCode, booleanValue, new non0((lx4) this.J.a.a.get(), str), new sls(this) { // from class: kon0
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i4;
                        zy11 zy11Var = zy11.a;
                        a aVar = this.b;
                        switch (i6) {
                            case 0:
                                aVar.r(new qu(9));
                                break;
                            case 1:
                                aVar.r(new vkn0(8));
                                break;
                            default:
                                aVar.r(new vkn0(7));
                                break;
                        }
                        return zy11Var;
                    }
                }, new sls(this) { // from class: kon0
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i3;
                        zy11 zy11Var = zy11.a;
                        a aVar = this.b;
                        switch (i6) {
                            case 0:
                                aVar.r(new qu(9));
                                break;
                            case 1:
                                aVar.r(new vkn0(8));
                                break;
                            default:
                                aVar.r(new vkn0(7));
                                break;
                        }
                        return zy11Var;
                    }
                }, new sls(this) { // from class: kon0
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i5;
                        zy11 zy11Var = zy11.a;
                        a aVar = this.b;
                        switch (i6) {
                            case 0:
                                aVar.r(new qu(9));
                                break;
                            case 1:
                                aVar.r(new vkn0(8));
                                break;
                            default:
                                aVar.r(new vkn0(7));
                                break;
                        }
                        return zy11Var;
                    }
                });
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.force.ScootersForceCompletionRouter$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersForceCompletionView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str2);
                        }
                        View view = scootersForceCompletionView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r1;
                scootersForceCompletionView.addOnAttachStateChangeListener(r1);
                return scootersForceCompletionView;
            }
        }
        scootersForceCompletionRouter$provideModalView$1 = new ScootersForceCompletionRouter$provideModalView$1(this, continuationImpl);
        Object obj2 = scootersForceCompletionRouter$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersForceCompletionRouter$provideModalView$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
        a650 a650Var2 = ((g0) obj2).g;
        final int i42 = 0;
        if (a650Var2 != null) {
        }
        final String str22 = "ScootersForceCompletionView";
        fva0.f(this.G, "ScootersForceCompletionView", PerformanceAnalytics$Type.Inflate, 0L, 4);
        str = "ScootersForceCompletionCard";
        if (scootersErrorCode != null) {
            str = "ScootersFixForceCompletionCard";
        }
        final int i52 = 2;
        final View scootersForceCompletionView2 = new ScootersForceCompletionView((Context) this.I.a.a.get(), jon0Var2.a, jon0Var2.b, scootersErrorCode, booleanValue, new non0((lx4) this.J.a.a.get(), str), new sls(this) { // from class: kon0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i6 = i42;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i6) {
                    case 0:
                        aVar.r(new qu(9));
                        break;
                    case 1:
                        aVar.r(new vkn0(8));
                        break;
                    default:
                        aVar.r(new vkn0(7));
                        break;
                }
                return zy11Var;
            }
        }, new sls(this) { // from class: kon0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i6 = i32;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i6) {
                    case 0:
                        aVar.r(new qu(9));
                        break;
                    case 1:
                        aVar.r(new vkn0(8));
                        break;
                    default:
                        aVar.r(new vkn0(7));
                        break;
                }
                return zy11Var;
            }
        }, new sls(this) { // from class: kon0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i6 = i52;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                switch (i6) {
                    case 0:
                        aVar.r(new qu(9));
                        break;
                    case 1:
                        aVar.r(new vkn0(8));
                        break;
                    default:
                        aVar.r(new vkn0(7));
                        break;
                }
                return zy11Var;
            }
        });
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? r12 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.force.ScootersForceCompletionRouter$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersForceCompletionView2.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str22);
                }
                View view = scootersForceCompletionView2;
                T t = ref$ObjectRef2.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef2.element = r12;
        scootersForceCompletionView2.addOnAttachStateChangeListener(r12);
        return scootersForceCompletionView2;
    }
}
