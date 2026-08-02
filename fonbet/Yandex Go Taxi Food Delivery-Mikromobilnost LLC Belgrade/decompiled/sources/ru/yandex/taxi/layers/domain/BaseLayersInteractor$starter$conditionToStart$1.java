package ru.yandex.taxi.layers.domain;

import defpackage.e2t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o35;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.BaseLayersInteractor$starter$conditionToStart$1", f = "BaseLayersInteractor.kt", l = {HProv.ALG_SID_KECCAK_224, HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BaseLayersInteractor$starter$conditionToStart$1 extends SuspendLambda implements tls {
    Object L$0;
    int label;
    final /* synthetic */ o35 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLayersInteractor$starter$conditionToStart$1(o35 o35Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = o35Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BaseLayersInteractor$starter$conditionToStart$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((BaseLayersInteractor$starter$conditionToStart$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (defpackage.bvf0.n(r1, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (((defpackage.f2t) r6).d.u0(r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e2t e2tVar = this.this$0.c;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        BaseLayersInteractor$starter$conditionToStart$1$invokeSuspend$$inlined$race$default$1 baseLayersInteractor$starter$conditionToStart$1$invokeSuspend$$inlined$race$default$1 = new BaseLayersInteractor$starter$conditionToStart$1$invokeSuspend$$inlined$race$default$1(EmptyCoroutineContext.a, null, this.this$0);
        this.L$0 = null;
        this.label = 2;
    }
}
