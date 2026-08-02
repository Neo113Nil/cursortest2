package ru.yandex.taxi.logistics.sdk.delivery.edit;

import defpackage.b7i;
import defpackage.cc7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.s6i;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery.edit.DeliveryEditInteractorImpl$edit$1", f = "DeliveryEditInteractorImpl.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryEditInteractorImpl$edit$1 extends SuspendLambda implements wls {
    final /* synthetic */ s6i $editInfo;
    final /* synthetic */ Object $editOptions;
    final /* synthetic */ String $requestId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryEditInteractorImpl$edit$1(b bVar, s6i s6iVar, String str, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$editInfo = s6iVar;
        this.$requestId = str;
        this.$editOptions = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryEditInteractorImpl$edit$1 deliveryEditInteractorImpl$edit$1 = new DeliveryEditInteractorImpl$edit$1(this.this$0, this.$editInfo, this.$requestId, this.$editOptions, continuation);
        deliveryEditInteractorImpl$edit$1.L$0 = obj;
        return deliveryEditInteractorImpl$edit$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryEditInteractorImpl$edit$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b7i b7iVar = this.this$0.b;
            s6i s6iVar = this.$editInfo;
            String str = this.$requestId;
            Object obj2 = this.$editOptions;
            b7iVar.getClass();
            tpr F = e.F(e.K(new rol0(new DeliveryEditTask$getEditPollingFlow$1(b7iVar, s6iVar, str, obj2, null)), new cc7(b7iVar.c.a(), str, 3)), b7iVar.e.b);
            a aVar = new a(this.this$0, tseVar);
            this.L$0 = null;
            this.label = 1;
            if (F.collect(aVar, this) == coroutineSingletons) {
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
