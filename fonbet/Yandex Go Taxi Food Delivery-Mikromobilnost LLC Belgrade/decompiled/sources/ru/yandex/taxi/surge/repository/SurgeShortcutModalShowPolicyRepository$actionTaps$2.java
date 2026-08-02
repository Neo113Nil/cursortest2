package ru.yandex.taxi.surge.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)I"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.repository.SurgeShortcutModalShowPolicyRepository$actionTaps$2", f = "SurgeShortcutModalShowPolicyRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeShortcutModalShowPolicyRepository$actionTaps$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeShortcutModalShowPolicyRepository$actionTaps$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeShortcutModalShowPolicyRepository$actionTaps$2(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeShortcutModalShowPolicyRepository$actionTaps$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new Integer(qv10.d("action_tap_", this.$id, this.this$0.b, 0));
    }
}
