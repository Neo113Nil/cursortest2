package ru.yandex.taxi.scooters.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sqm0;
import defpackage.uh6;
import defpackage.zls;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectedSessionId", "Lsqm0;", "activeOrderState", "Lzuo0;", "<anonymous>", "(Ljava/lang/String;Lsqm0;)Lzuo0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.ScootersOrderSelectorRepository$listenToSelectedSessionState$1", f = "ScootersOrderSelectorRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOrderSelectorRepository$listenToSelectedSessionState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOrderSelectorRepository$listenToSelectedSessionState$1(u uVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = uVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersOrderSelectorRepository$listenToSelectedSessionState$1 scootersOrderSelectorRepository$listenToSelectedSessionState$1 = new ScootersOrderSelectorRepository$listenToSelectedSessionState$1(this.this$0, (Continuation) obj3);
        scootersOrderSelectorRepository$listenToSelectedSessionState$1.L$0 = (String) obj;
        scootersOrderSelectorRepository$listenToSelectedSessionState$1.L$1 = (sqm0) obj2;
        return scootersOrderSelectorRepository$listenToSelectedSessionState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        sqm0 sqm0Var = (sqm0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (uh6.y(sqm0Var)) {
            return null;
        }
        if (str == null) {
            return (zuo0) kotlin.collections.a.Z(uh6.C(sqm0Var));
        }
        zuo0 N = uh6.N(sqm0Var, str);
        if (N == null && (N = (zuo0) kotlin.collections.a.b0(uh6.C(sqm0Var))) != null) {
            this.this$0.b.l(N.getSessionId());
        }
        return N;
    }
}
