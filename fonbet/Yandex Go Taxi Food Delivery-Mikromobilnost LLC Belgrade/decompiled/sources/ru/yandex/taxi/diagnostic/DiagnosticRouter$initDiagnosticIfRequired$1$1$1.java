package ru.yandex.taxi.diagnostic;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qcj;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.diagnostic.DiagnosticRouter$initDiagnosticIfRequired$1$1$1", f = "DiagnosticRouter.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DiagnosticRouter$initDiagnosticIfRequired$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $userId;
    Object L$0;
    int label;
    final /* synthetic */ qcj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticRouter$initDiagnosticIfRequired$1$1$1(qcj qcjVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qcjVar;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiagnosticRouter$initDiagnosticIfRequired$1$1$1(this.this$0, this.$userId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiagnosticRouter$initDiagnosticIfRequired$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String b = this.this$0.c.b();
            a aVar = this.this$0.d;
            String str = this.$userId;
            this.L$0 = null;
            this.label = 1;
            if (aVar.a(str, b, this) == coroutineSingletons) {
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
