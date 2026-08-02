package ru.yandex.taxi.surge.widget;

import defpackage.drv0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jrv0;
import defpackage.krv0;
import defpackage.lrv0;
import defpackage.mvg;
import defpackage.nrv0;
import defpackage.ny61;
import defpackage.orv0;
import defpackage.prv0;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tse0;
import defpackage.uyj;
import defpackage.vpw0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xcv0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.widget.SummaryWidgetHolderPresenter$attachView$1", f = "SummaryWidgetHolderPresenter.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetHolderPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ jrv0 $mvpView;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lrv0 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lprv0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lprv0;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.surge.widget.SummaryWidgetHolderPresenter$attachView$1$1", f = "SummaryWidgetHolderPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.surge.widget.SummaryWidgetHolderPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ lrv0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lrv0 lrv0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = lrv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((prv0) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            prv0 prv0Var = (prv0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            drv0 drv0Var = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            boolean z = prv0Var instanceof orv0;
            qv10.B(z, this.this$0.F, null);
            vpw0 vpw0Var = this.this$0.C;
            vpw0Var.getClass();
            if (!jl40.l(prv0Var, nrv0.a)) {
                if (!z) {
                    w511.b();
                    return null;
                }
                drv0Var = ((orv0) prv0Var).d;
            }
            boolean z2 = (jl40.l(drv0Var, vpw0Var.d) || drv0Var == null) ? false : true;
            vpw0Var.d = drv0Var;
            if (z2) {
                xcv0 xcv0Var = vpw0Var.b;
                String str = drv0Var.a;
                String X = kotlin.collections.a.X(drv0Var.c, ",", null, null, null, 62);
                Integer valueOf = Integer.valueOf(drv0Var.b);
                HashMap q = tse0.q(xcv0Var);
                if (str != null) {
                    q.put("button_color", str);
                }
                q.put("icons_list", X);
                q.put("surge_level", valueOf);
                xcv0Var.a.a("Summary.SurgeWidget.Shown", q, 1, new HashMap());
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetHolderPresenter$attachView$1(lrv0 lrv0Var, jrv0 jrv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lrv0Var;
        this.$mvpView = jrv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SummaryWidgetHolderPresenter$attachView$1 summaryWidgetHolderPresenter$attachView$1 = new SummaryWidgetHolderPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
        summaryWidgetHolderPresenter$attachView$1.L$0 = obj;
        return summaryWidgetHolderPresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryWidgetHolderPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            jqr jqrVar = new jqr(this.this$0.x.b(tseVar), new AnonymousClass1(this.this$0, null), 3);
            this.this$0.B.getClass();
            tpr F = e.F(jqrVar, uyj.a);
            krv0 krv0Var = new krv0(this.$mvpView, 0);
            this.L$0 = null;
            this.label = 1;
            if (F.collect(krv0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
