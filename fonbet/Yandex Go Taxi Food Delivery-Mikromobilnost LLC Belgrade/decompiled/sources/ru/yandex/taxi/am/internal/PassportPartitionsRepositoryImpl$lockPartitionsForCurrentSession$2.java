package ru.yandex.taxi.am.internal;

import defpackage.g050;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.to90;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.internal.PassportPartitionsRepositoryImpl$lockPartitionsForCurrentSession$2", f = "PassportPartitionsRepositoryImpl.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PassportPartitionsRepositoryImpl$lockPartitionsForCurrentSession$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ to90 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportPartitionsRepositoryImpl$lockPartitionsForCurrentSession$2(to90 to90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = to90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportPartitionsRepositoryImpl$lockPartitionsForCurrentSession$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportPartitionsRepositoryImpl$lockPartitionsForCurrentSession$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        to90 to90Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            to90 to90Var2 = this.this$0;
            g050Var = to90Var2.f;
            this.L$0 = g050Var;
            this.L$1 = to90Var2;
            this.label = 1;
            if (g050Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            to90Var = to90Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            to90Var = (to90) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            List a = to90Var.a();
            g050Var.d(null);
            AtomicReference atomicReference = this.this$0.e;
            while (true) {
                if (atomicReference.compareAndSet(null, a)) {
                    hst hstVar = jst.e;
                    break;
                }
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
