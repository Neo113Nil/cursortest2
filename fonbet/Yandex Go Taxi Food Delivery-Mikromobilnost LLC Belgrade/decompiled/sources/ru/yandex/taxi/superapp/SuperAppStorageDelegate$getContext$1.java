package ru.yandex.taxi.superapp;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
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
@mvg(c = "ru.yandex.taxi.superapp.SuperAppStorageDelegate$getContext$1", f = "SuperAppStorageDelegate.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppStorageDelegate$getContext$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ String $key;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppStorageDelegate$getContext$1(q qVar, gcn gcnVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$callback = gcnVar;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppStorageDelegate$getContext$1(this.this$0, this.$callback, this.$key, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppStorageDelegate$getContext$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gcn gcnVar;
        String str;
        gcn gcnVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                q qVar = this.this$0;
                gcn gcnVar3 = this.$callback;
                String str2 = this.$key;
                try {
                    qVar.b.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    SuperAppStorageDelegate$getContext$1$1$result$1 superAppStorageDelegate$getContext$1$1$result$1 = new SuperAppStorageDelegate$getContext$1$1$result$1(qVar, str2, null);
                    this.L$0 = gcnVar3;
                    this.L$1 = str2;
                    this.L$2 = gcnVar3;
                    this.label = 1;
                    obj = tje.k0(mdhVar, superAppStorageDelegate$getContext$1$1$result$1, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gcnVar2 = gcnVar3;
                    gcnVar = gcnVar2;
                    str = str2;
                } catch (Throwable th) {
                    th = th;
                    gcnVar = gcnVar3;
                    str = str2;
                    jst.e.k(th, String.format("Unable to read '%s' from superapp storage", Arrays.copyOf(new Object[]{str}, 1)));
                    gcnVar.a(new ck7(th));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gcnVar = (gcn) this.L$2;
                str = (String) this.L$1;
                gcnVar2 = (gcn) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, String.format("Unable to read '%s' from superapp storage", Arrays.copyOf(new Object[]{str}, 1)));
                    gcnVar.a(new ck7(th));
                    return zy11.a;
                }
            }
            gcnVar2.a((ck7) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
