package ru.yandex.taxi.superapp;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.jst;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.v6z;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppLocationProviderDelegate$requestCurrentLocation$1", f = "SuperAppLocationProviderDelegate.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppLocationProviderDelegate$requestCurrentLocation$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppLocationProviderDelegate$requestCurrentLocation$1(h hVar, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppLocationProviderDelegate$requestCurrentLocation$1(this.this$0, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppLocationProviderDelegate$requestCurrentLocation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gcn gcnVar;
        gcn gcnVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = this.this$0;
                gcn gcnVar3 = this.$callback;
                try {
                    po21 po21Var = hVar.a;
                    this.L$0 = gcnVar3;
                    this.L$1 = gcnVar3;
                    this.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gcnVar2 = gcnVar3;
                    gcnVar = gcnVar2;
                } catch (Throwable th) {
                    th = th;
                    gcnVar = gcnVar3;
                    jst.e.k(th, "Unable to provide current location for EatsKit");
                    gcnVar.a(new ck7(th));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gcnVar = (gcn) this.L$1;
                gcnVar2 = (gcn) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, "Unable to provide current location for EatsKit");
                    gcnVar.a(new ck7(th));
                    return zy11.a;
                }
            }
            mo21 mo21Var = (mo21) obj;
            gcnVar2.a(new ck7(new v6z(mo21Var.a, mo21Var.b), null));
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
