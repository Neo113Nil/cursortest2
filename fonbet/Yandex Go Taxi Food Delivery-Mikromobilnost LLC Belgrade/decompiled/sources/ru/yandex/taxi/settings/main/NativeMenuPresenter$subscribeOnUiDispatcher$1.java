package ru.yandex.taxi.settings.main;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0001H\n"}, d2 = {"<anonymous>", "T", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;", "item"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.settings.main.NativeMenuPresenter$subscribeOnUiDispatcher$1", f = "NativeMenuPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NativeMenuPresenter$subscribeOnUiDispatcher$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NativeMenuPresenter$subscribeOnUiDispatcher$1 nativeMenuPresenter$subscribeOnUiDispatcher$1 = new NativeMenuPresenter$subscribeOnUiDispatcher$1(3, (Continuation) obj3);
        nativeMenuPresenter$subscribeOnUiDispatcher$1.L$0 = obj2;
        return nativeMenuPresenter$subscribeOnUiDispatcher$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return obj2;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
