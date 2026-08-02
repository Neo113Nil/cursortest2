package ru.yandex.taxi.superapp;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.i3w;
import defpackage.l3w;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppSystemInfoDelegate$installedApplications$1", f = "SuperAppSystemInfoDelegate.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppSystemInfoDelegate$installedApplications$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ i3w $request;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppSystemInfoDelegate$installedApplications$1(i3w i3wVar, u uVar, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.$request = i3wVar;
        this.this$0 = uVar;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppSystemInfoDelegate$installedApplications$1(this.$request, this.this$0, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppSystemInfoDelegate$installedApplications$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.g gVar = new kotlinx.coroutines.flow.g(this.$request.a);
            u uVar = this.this$0;
            t tVar = new t(gVar, uVar);
            uVar.b.getClass();
            sjh sjhVar = uyj.a;
            tpr F = kotlinx.coroutines.flow.e.F(tVar, mdh.b);
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.W(F, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$callback.a(new ck7(new l3w((List) obj), null));
        return zy11.a;
    }
}
