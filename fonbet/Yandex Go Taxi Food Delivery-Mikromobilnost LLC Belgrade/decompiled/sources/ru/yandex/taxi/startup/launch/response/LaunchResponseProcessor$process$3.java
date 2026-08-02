package ru.yandex.taxi.startup.launch.response;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lowx;", "<anonymous>", "(Ltse;)Lowx;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.startup.launch.response.LaunchResponseProcessor$process$3", f = "LaunchResponseProcessor.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LaunchResponseProcessor$process$3 extends SuspendLambda implements wls {
    final /* synthetic */ owx $response;
    int I$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchResponseProcessor$process$3(e eVar, owx owxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$response = owxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LaunchResponseProcessor$process$3(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchResponseProcessor$process$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int andIncrement = this.this$0.g.getAndIncrement();
        e eVar = this.this$0;
        owx owxVar = this.$response;
        this.I$0 = andIncrement;
        this.label = 1;
        Object a = e.a(eVar, andIncrement, owxVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
