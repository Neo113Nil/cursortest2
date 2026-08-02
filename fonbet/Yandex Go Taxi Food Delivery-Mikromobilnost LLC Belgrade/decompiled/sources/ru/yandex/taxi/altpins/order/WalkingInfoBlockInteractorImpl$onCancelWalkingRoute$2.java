package ru.yandex.taxi.altpins.order;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.order.WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$2", f = "WalkingInfoBlockInteractorImpl.kt", l = {110, 113}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onSuccess;
    final /* synthetic */ o2y0 $orderHolder;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$2(p pVar, o2y0 o2y0Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
        this.$orderHolder = o2y0Var;
        this.$onSuccess = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$2(this.this$0, this.$orderHolder, this.$onSuccess, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        Throwable a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0.c;
            String str = this.$orderHolder.b().a;
            this.label = 1;
            a = fVar.a(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                kotlin.b.b(obj);
                a = obj2;
                a2 = Result.a(a);
                if (a2 != null) {
                    jst.e.k(a2, "Fail cancellation of walking route");
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        p pVar = this.this$0;
        o2y0 o2y0Var = this.$orderHolder;
        tls tlsVar = this.$onSuccess;
        if (!(a instanceof Result.Failure)) {
            pVar.e.k(o2y0Var.b(), false);
            this.L$0 = a;
            this.L$1 = null;
            this.label = 2;
            if (tlsVar.invoke(this) != coroutineSingletons) {
                obj2 = a;
                a = obj2;
            }
            return coroutineSingletons;
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }
}
