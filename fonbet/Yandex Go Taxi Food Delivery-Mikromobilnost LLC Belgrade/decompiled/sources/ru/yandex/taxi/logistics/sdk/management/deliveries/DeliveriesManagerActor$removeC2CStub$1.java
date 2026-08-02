package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.bhh;
import defpackage.lsi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.deliveries.DeliveriesManagerActor$removeC2CStub$1", f = "DeliveriesManagerActor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveriesManagerActor$removeC2CStub$1 extends SuspendLambda implements tls {
    final /* synthetic */ UUID $localUuid;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesManagerActor$removeC2CStub$1(d dVar, UUID uuid, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$localUuid = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DeliveriesManagerActor$removeC2CStub$1(this.this$0, this.$localUuid, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        DeliveriesManagerActor$removeC2CStub$1 deliveriesManagerActor$removeC2CStub$1 = (DeliveriesManagerActor$removeC2CStub$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        deliveriesManagerActor$removeC2CStub$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        String str = "Remove C2C stub " + this.$localUuid;
        dVar.getClass();
        d.i(str);
        lsi lsiVar = this.this$0.c;
        bhh bhhVar = new bhh(2, this.$localUuid);
        ycc.w(lsiVar.b, bhhVar, true);
        if (ycc.w(lsiVar.c(), bhhVar, true)) {
            lsiVar.a.set(lsiVar.c());
        }
        return zy11.a;
    }
}
