package ru.yandex.taxi.router;

import defpackage.b670;
import defpackage.gcn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.router.InAppCallsEatsKitDelegate$openInAppCalls$1", f = "InAppCallsEatsKitDelegate.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class InAppCallsEatsKitDelegate$openInAppCalls$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $closeCallback;
    final /* synthetic */ b670 $params;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsEatsKitDelegate$openInAppCalls$1(d dVar, b670 b670Var, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$params = b670Var;
        this.$closeCallback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppCallsEatsKitDelegate$openInAppCalls$1(this.this$0, this.$params, this.$closeCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallsEatsKitDelegate$openInAppCalls$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            b670 b670Var = this.$params;
            gcn gcnVar = this.$closeCallback;
            this.label = 1;
            if (d.a(dVar, b670Var, gcnVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
