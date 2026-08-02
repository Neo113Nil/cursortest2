package ru.yandex.taxi.search.presenter;

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
@mvg(c = "ru.yandex.taxi.search.presenter.BaseAddressSearchPresenter$inputBg$1", f = "BaseAddressSearchPresenter.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BaseAddressSearchPresenter$inputBg$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAddressSearchPresenter$inputBg$1(f fVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BaseAddressSearchPresenter$inputBg$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((BaseAddressSearchPresenter$inputBg$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.design.utils.b bVar = this.this$0.B;
        this.label = 1;
        Object a = bVar.a(tje.u(12, bVar.a), true, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
