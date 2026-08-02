package ru.yandex.taxi.utils.storage;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tb3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.utils.storage.AtomicStorageCachedWrapperMixed$setData$2", f = "AtomicStorageCachedWrapperMixed.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class AtomicStorageCachedWrapperMixed$setData$2 extends SuspendLambda implements wls {
    final /* synthetic */ Object $data;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomicStorageCachedWrapperMixed$setData$2(a aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AtomicStorageCachedWrapperMixed$setData$2(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AtomicStorageCachedWrapperMixed$setData$2 atomicStorageCachedWrapperMixed$setData$2 = (AtomicStorageCachedWrapperMixed$setData$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        atomicStorageCachedWrapperMixed$setData$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        Object obj2 = this.$data;
        synchronized (aVar) {
            ((tb3) aVar.a.getValue()).b(obj2);
        }
        return zy11.a;
    }
}
