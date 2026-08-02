package ru.yandex.taxi.utils.storage;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Ljju0;", "<anonymous>", "(Ltse;)Ljju0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.utils.storage.AtomicStorageCachedWrapperMixed$getResponse$3", f = "AtomicStorageCachedWrapperMixed.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class AtomicStorageCachedWrapperMixed$getResponse$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtomicStorageCachedWrapperMixed$getResponse$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AtomicStorageCachedWrapperMixed$getResponse$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AtomicStorageCachedWrapperMixed$getResponse$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.f();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
