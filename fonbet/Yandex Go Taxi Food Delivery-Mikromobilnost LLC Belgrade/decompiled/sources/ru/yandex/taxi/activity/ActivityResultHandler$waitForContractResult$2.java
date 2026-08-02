package ru.yandex.taxi.activity;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.z30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz30;", "it", "", "<anonymous>", "(Lz30;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.activity.ActivityResultHandler$waitForContractResult$2", f = "ActivityResultHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ActivityResultHandler$waitForContractResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $requestCode;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultHandler$waitForContractResult$2(int i, Continuation continuation) {
        super(2, continuation);
        this.$requestCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActivityResultHandler$waitForContractResult$2 activityResultHandler$waitForContractResult$2 = new ActivityResultHandler$waitForContractResult$2(this.$requestCode, continuation);
        activityResultHandler$waitForContractResult$2.L$0 = obj;
        return activityResultHandler$waitForContractResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActivityResultHandler$waitForContractResult$2) create((z30) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z30 z30Var = (z30) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(z30Var.a == this.$requestCode);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
