package ru.yandex.taxi.banners.presentation.fullscreen;

import defpackage.cay0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.shs;
import defpackage.tse;
import defpackage.wls;
import defpackage.zpf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPresenter$attachView$1", f = "FullScreenBannerPresenter.kt", l = {109}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FullScreenBannerPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenBannerPresenter$attachView$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullScreenBannerPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullScreenBannerPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long a = this.this$0.i.a();
            this.label = 1;
            if (kotlinx.coroutines.a.j(a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        a aVar = this.this$0;
        zpf0 zpf0Var = aVar.i;
        shs shsVar = aVar.f;
        shs.a aVar2 = (shs.a) kotlin.collections.a.S(0, shsVar.l);
        zpf0Var.e(shsVar, 1, aVar2 != null ? aVar2.h : null, ((cay0) this.this$0.u).b());
        return zy11.a;
    }
}
