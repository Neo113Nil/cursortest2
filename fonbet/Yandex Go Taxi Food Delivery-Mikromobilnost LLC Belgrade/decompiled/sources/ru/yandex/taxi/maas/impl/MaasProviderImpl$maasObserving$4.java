package ru.yandex.taxi.maas.impl;

import defpackage.i000;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li000;", "it", "Lzy11;", "<anonymous>", "(Li000;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.MaasProviderImpl$maasObserving$4", f = "MaasProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MaasProviderImpl$maasObserving$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasProviderImpl$maasObserving$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MaasProviderImpl$maasObserving$4 maasProviderImpl$maasObserving$4 = new MaasProviderImpl$maasObserving$4(this.this$0, continuation);
        maasProviderImpl$maasObserving$4.L$0 = obj;
        return maasProviderImpl$maasObserving$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MaasProviderImpl$maasObserving$4 maasProviderImpl$maasObserving$4 = (MaasProviderImpl$maasObserving$4) create((i000) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        maasProviderImpl$maasObserving$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i000 i000Var = (i000) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.i.l(i000Var);
        r0 r0Var = this.this$0.j;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
