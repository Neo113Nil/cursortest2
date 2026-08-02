package ru.yandex.taxi.settings.main;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.s0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.main.NativeMenuPresenter$onPhonishUpgradeSelected$1", f = "NativeMenuPresenter.kt", l = {309}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NativeMenuPresenter$onPhonishUpgradeSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ ru.yandex.taxi.am.j $router;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMenuPresenter$onPhonishUpgradeSelected$1(ru.yandex.taxi.am.j jVar, Continuation continuation) {
        super(2, continuation);
        this.$router = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NativeMenuPresenter$onPhonishUpgradeSelected$1(this.$router, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NativeMenuPresenter$onPhonishUpgradeSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.am.j jVar = this.$router;
            this.label = 1;
            if (((s0) jVar).h(false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Result) obj).getClass();
        }
        return zy11.a;
    }
}
