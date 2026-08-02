package ru.yandex.taxi.preorder.summary.altchoice.ui.selector;

import defpackage.fef;
import defpackage.iaj0;
import defpackage.kci;
import defpackage.laj0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.saj0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceRadioOptionPresenter$attachView$2", f = "RequiredAltChoiceRadioOptionPresenter.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequiredAltChoiceRadioOptionPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ iaj0 $mvpView;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00040\u00002\u001c\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Triple;", "Lsaj0;", "", "<destruct>", "Lru/yandex/taxi/summary/ui/SummaryStateTracker$SolidSummaryState;", "summaryState", "", "Lwaj0;", "<anonymous>", "(Lkotlin/Triple;Lru/yandex/taxi/summary/ui/SummaryStateTracker$SolidSummaryState;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceRadioOptionPresenter$attachView$2$2", f = "RequiredAltChoiceRadioOptionPresenter.kt", l = {101}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceRadioOptionPresenter$attachView$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Continuation continuation, e eVar) {
            super(3, continuation);
            this.this$0 = eVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2((Continuation) obj3, this.this$0);
            anonymousClass2.L$0 = (Triple) obj;
            anonymousClass2.L$1 = (SummaryStateTracker.SolidSummaryState) obj2;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            saj0 saj0Var;
            Triple triple = (Triple) this.L$0;
            SummaryStateTracker.SolidSummaryState solidSummaryState = (SummaryStateTracker.SolidSummaryState) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                saj0 saj0Var2 = (saj0) triple.getFirst();
                String str = (String) triple.getSecond();
                String str2 = (String) triple.getThird();
                e eVar = this.this$0;
                List list = saj0Var2.b;
                fef fefVar = saj0Var2.c;
                kci kciVar = saj0Var2.f;
                this.L$0 = null;
                this.L$1 = solidSummaryState;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = saj0Var2;
                this.label = 1;
                Object Kg = e.Kg(eVar, list, fefVar, str, kciVar, str2, this);
                if (Kg == coroutineSingletons) {
                    return coroutineSingletons;
                }
                saj0Var = saj0Var2;
                obj = Kg;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                saj0Var = (saj0) this.L$5;
                kotlin.b.b(obj);
            }
            return new Triple(saj0Var, obj, solidSummaryState);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredAltChoiceRadioOptionPresenter$attachView$2(e eVar, iaj0 iaj0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$mvpView = iaj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequiredAltChoiceRadioOptionPresenter$attachView$2(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequiredAltChoiceRadioOptionPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            g X = kotlinx.coroutines.flow.e.X(new mth(eVar.N, 6), new RequiredAltChoiceRadioOptionPresenter$attachView$2$invokeSuspend$$inlined$flatMapLatest$1(null, eVar));
            e eVar2 = this.this$0;
            tpr t = kotlinx.coroutines.flow.e.t(new m0(X, eVar2.B.a, new AnonymousClass2(null, eVar2)));
            this.this$0.x.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(t, uyj.a);
            laj0 laj0Var = new laj0(this.this$0, this.$mvpView);
            this.label = 1;
            if (F.collect(laj0Var, this) == coroutineSingletons) {
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
