package ru.yandex.taxi.preorder.summary.altchoice.ui.selector;

import defpackage.haj0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qaj0;
import defpackage.saj0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionsSelectPresenter$attachView$1", f = "RequiredAltChoiceOptionsSelectPresenter.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequiredAltChoiceOptionsSelectPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ qaj0 $mvpView;
    int label;
    final /* synthetic */ haj0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionsSelectPresenter$attachView$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((qaj0) this.receiver).Kd((saj0) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredAltChoiceOptionsSelectPresenter$attachView$1(haj0 haj0Var, qaj0 qaj0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = haj0Var;
        this.$mvpView = qaj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequiredAltChoiceOptionsSelectPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequiredAltChoiceOptionsSelectPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(new b(new mth(this.this$0.z, 6)));
            this.this$0.x.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(t, uyj.a);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, this.$mvpView, qaj0.class, "render", "render(Lru/yandex/taxi/preorder/summary/altchoice/domain/RequiredAltChoiceUiState;)V", 4);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(F, anonymousClass2, this) == coroutineSingletons) {
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
