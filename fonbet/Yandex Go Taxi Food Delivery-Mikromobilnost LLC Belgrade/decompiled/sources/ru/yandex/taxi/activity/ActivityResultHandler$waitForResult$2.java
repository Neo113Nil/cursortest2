package ru.yandex.taxi.activity;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr40;", "it", "", "<anonymous>", "(Lr40;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.activity.ActivityResultHandler$waitForResult$2", f = "ActivityResultHandler.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ActivityResultHandler$waitForResult$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $requestCode;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultHandler$waitForResult$2(int i, Continuation continuation) {
        super(2, continuation);
        this.$requestCode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActivityResultHandler$waitForResult$2 activityResultHandler$waitForResult$2 = new ActivityResultHandler$waitForResult$2(this.$requestCode, continuation);
        activityResultHandler$waitForResult$2.L$0 = obj;
        return activityResultHandler$waitForResult$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActivityResultHandler$waitForResult$2) create((r40) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r40 r40Var = (r40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(r40Var.b == this.$requestCode);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
