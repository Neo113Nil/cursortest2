package ru.yandex.taxi.utils.storage;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tb3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.utils.storage.AtomicStorageCachedWrapperSuspend$getData$2", f = "AtomicStorageCachedWrapperSuspend.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class AtomicStorageCachedWrapperSuspend$getData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomicStorageCachedWrapperSuspend$getData$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AtomicStorageCachedWrapperSuspend$getData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AtomicStorageCachedWrapperSuspend$getData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Object a = ((tb3) this.this$0.a.getValue()).a().a();
        AtomicReference atomicReference = this.this$0.c;
        while (!atomicReference.compareAndSet(null, a) && atomicReference.get() == null) {
        }
        return a;
    }
}
