package ru.yandex.taxi.styling;

import defpackage.e430;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le430;", "modeStyle", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lu0c0;", "<anonymous>", "(Le430;Lru/yandex/taxi/theme/ThemeType;)Lu0c0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.styling.PinStyleProviderImpl$styleScreenFlow$1", f = "PinStyleProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PinStyleProviderImpl$styleScreenFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinStyleProviderImpl$styleScreenFlow$1(f fVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PinStyleProviderImpl$styleScreenFlow$1 pinStyleProviderImpl$styleScreenFlow$1 = new PinStyleProviderImpl$styleScreenFlow$1(this.this$0, (Continuation) obj3);
        pinStyleProviderImpl$styleScreenFlow$1.L$0 = (e430) obj;
        return pinStyleProviderImpl$styleScreenFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e430 e430Var = (e430) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.c(e430Var.c);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
