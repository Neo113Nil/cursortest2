package ru.yandex.taxi.am;

import defpackage.jo90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rms;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.am.PassportInitializer$init$1$2$1", f = "PassportInitializer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PassportInitializer$init$1$2$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ jo90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitializer$init$1$2$1(jo90 jo90Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = jo90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PassportInitializer$init$1$2$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((PassportInitializer$init$1$2$1) create((Continuation) obj)).invokeSuspend(zy11.a);
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rms rmsVar = this.this$0.h;
        return null;
    }
}
