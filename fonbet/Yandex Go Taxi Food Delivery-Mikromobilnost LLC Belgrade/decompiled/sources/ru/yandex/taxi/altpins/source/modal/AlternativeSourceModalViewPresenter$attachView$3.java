package ru.yandex.taxi.altpins.source.modal;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sx1;
import defpackage.wls;
import defpackage.zx1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsx1;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lsx1;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.source.modal.AlternativeSourceModalViewPresenter$attachView$3", f = "AlternativeSourceModalViewPresenter.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AlternativeSourceModalViewPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ zx1 $mvpView;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlternativeSourceModalViewPresenter$attachView$3(zx1 zx1Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = zx1Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AlternativeSourceModalViewPresenter$attachView$3 alternativeSourceModalViewPresenter$attachView$3 = new AlternativeSourceModalViewPresenter$attachView$3(this.$mvpView, this.this$0, continuation);
        alternativeSourceModalViewPresenter$attachView$3.L$0 = obj;
        return alternativeSourceModalViewPresenter$attachView$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AlternativeSourceModalViewPresenter$attachView$3) create((sx1) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sx1 sx1Var = (sx1) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (sx1Var != null) {
                this.$mvpView.render(sx1Var);
            } else {
                d dVar = this.this$0;
                this.L$0 = null;
                this.label = 1;
                if (d.Kg(dVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
