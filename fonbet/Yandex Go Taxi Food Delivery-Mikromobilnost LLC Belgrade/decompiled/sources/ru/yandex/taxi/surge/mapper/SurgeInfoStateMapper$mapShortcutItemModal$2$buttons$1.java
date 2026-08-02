package ru.yandex.taxi.surge.mapper;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r47;
import defpackage.tse;
import defpackage.tvw0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lq47;", "Lovw0;", "<anonymous>", "(Ltse;)Lq47;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.mapper.SurgeInfoStateMapper$mapShortcutItemModal$2$buttons$1", f = "SurgeInfoStateMapper.kt", l = {504}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateMapper$mapShortcutItemModal$2$buttons$1 extends SuspendLambda implements wls {
    final /* synthetic */ tvw0 $modal;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateMapper$mapShortcutItemModal$2$buttons$1(a aVar, tvw0 tvw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$modal = tvw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeInfoStateMapper$mapShortcutItemModal$2$buttons$1(this.this$0, this.$modal, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateMapper$mapShortcutItemModal$2$buttons$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        r47 r47Var = this.$modal.e;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new SurgeInfoStateMapper$mapButtons$2(r47Var, aVar, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
