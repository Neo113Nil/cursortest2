package ru.yandex.taxi.search.address.view;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qjs;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.address.view.FullscreenDestinationSearchPresenter$attachView$1", f = "FullscreenDestinationSearchPresenter.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class FullscreenDestinationSearchPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ qjs this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenDestinationSearchPresenter$attachView$1(qjs qjsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qjsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullscreenDestinationSearchPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullscreenDestinationSearchPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m0 a = this.this$0.x.a();
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.A(a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ru.yandex.taxi.address.experiment.e eVar = (ru.yandex.taxi.address.experiment.e) obj;
        return Boolean.valueOf(eVar != null ? eVar.t : false);
    }
}
