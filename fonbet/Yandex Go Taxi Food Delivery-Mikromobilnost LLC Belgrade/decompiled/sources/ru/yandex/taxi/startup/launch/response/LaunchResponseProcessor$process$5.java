package ru.yandex.taxi.startup.launch.response;

import defpackage.hwx;
import defpackage.j35;
import defpackage.lxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.startup.launch.response.LaunchResponseProcessor$process$5", f = "LaunchResponseProcessor.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LaunchResponseProcessor$process$5 extends SuspendLambda implements tls {
    final /* synthetic */ j35 $delegate;
    final /* synthetic */ owx $response;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchResponseProcessor$process$5(j35 j35Var, owx owxVar, Continuation continuation) {
        super(1, continuation);
        this.$delegate = j35Var;
        this.$response = owxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LaunchResponseProcessor$process$5(this.$delegate, this.$response, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((LaunchResponseProcessor$process$5) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j35 j35Var = this.$delegate;
            if (j35Var instanceof hwx) {
                ((hwx) j35Var).k(this.$response);
            } else {
                if (!(j35Var instanceof lxx)) {
                    w511.b();
                    return null;
                }
                owx owxVar = this.$response;
                this.label = 1;
                if (((lxx) j35Var).e(owxVar, this) == coroutineSingletons) {
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
