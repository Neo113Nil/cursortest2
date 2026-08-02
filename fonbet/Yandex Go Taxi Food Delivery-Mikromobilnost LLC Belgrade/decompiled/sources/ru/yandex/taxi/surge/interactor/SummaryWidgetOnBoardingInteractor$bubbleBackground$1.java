package ru.yandex.taxi.surge.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.surge.interactor.SummaryWidgetOnBoardingInteractor$bubbleBackground$1", f = "SummaryWidgetOnBoardingInteractor.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetOnBoardingInteractor$bubbleBackground$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetOnBoardingInteractor$bubbleBackground$1(Continuation continuation, e eVar) {
        super(1, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SummaryWidgetOnBoardingInteractor$bubbleBackground$1(continuation, this.this$0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SummaryWidgetOnBoardingInteractor$bubbleBackground$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        ru.yandex.taxi.design.utils.b bVar = eVar.a;
        int u = tje.u(12, eVar.e);
        this.label = 1;
        Object a = bVar.a(u, true, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
