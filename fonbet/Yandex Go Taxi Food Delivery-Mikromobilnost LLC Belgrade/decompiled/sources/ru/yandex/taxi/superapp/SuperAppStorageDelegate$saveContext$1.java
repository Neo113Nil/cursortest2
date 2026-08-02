package ru.yandex.taxi.superapp;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ryq0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppStorageDelegate$saveContext$1", f = "SuperAppStorageDelegate.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppStorageDelegate$saveContext$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ ryq0 $data;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppStorageDelegate$saveContext$1(q qVar, gcn gcnVar, ryq0 ryq0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$callback = gcnVar;
        this.$data = ryq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppStorageDelegate$saveContext$1(this.this$0, this.$callback, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppStorageDelegate$saveContext$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gcn gcnVar;
        ryq0 ryq0Var;
        gcn gcnVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                q qVar = this.this$0;
                gcn gcnVar3 = this.$callback;
                ryq0 ryq0Var2 = this.$data;
                try {
                    qVar.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    SuperAppStorageDelegate$saveContext$1$1$1 superAppStorageDelegate$saveContext$1$1$1 = new SuperAppStorageDelegate$saveContext$1$1$1(qVar, ryq0Var2, null);
                    this.L$0 = gcnVar3;
                    this.L$1 = ryq0Var2;
                    this.L$2 = gcnVar3;
                    this.label = 1;
                    if (tje.k0(mdhVar, superAppStorageDelegate$saveContext$1$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gcnVar2 = gcnVar3;
                    gcnVar = gcnVar2;
                    ryq0Var = ryq0Var2;
                } catch (Throwable th) {
                    th = th;
                    gcnVar = gcnVar3;
                    ryq0Var = ryq0Var2;
                    jst.e.k(th, String.format("Unable to write '%s' to superapp storage", Arrays.copyOf(new Object[]{ryq0Var.a}, 1)));
                    gcnVar.a(new ck7(th));
                    return zy11Var;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gcnVar = (gcn) this.L$2;
                ryq0Var = (ryq0) this.L$1;
                gcnVar2 = (gcn) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, String.format("Unable to write '%s' to superapp storage", Arrays.copyOf(new Object[]{ryq0Var.a}, 1)));
                    gcnVar.a(new ck7(th));
                    return zy11Var;
                }
            }
            gcnVar2.a(new ck7(zy11Var, null));
            return zy11Var;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
