package ru.yandex.taxi.logistics.sdk.management;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.rk3;
import defpackage.tpr;
import defpackage.zk3;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", BackendConfig.Restrictions.ENABLED, "Lzk3;", "authState", "Ltpr;", "", "<anonymous>", "(ZLzk3;)Ltpr;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.NetworkDeliveriesSourceImpl$updateFlow$1", f = "NetworkDeliveriesSourceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class NetworkDeliveriesSourceImpl$updateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkDeliveriesSourceImpl$updateFlow$1(i iVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        NetworkDeliveriesSourceImpl$updateFlow$1 networkDeliveriesSourceImpl$updateFlow$1 = new NetworkDeliveriesSourceImpl$updateFlow$1(this.this$0, (Continuation) obj3);
        networkDeliveriesSourceImpl$updateFlow$1.Z$0 = booleanValue;
        networkDeliveriesSourceImpl$updateFlow$1.L$0 = (zk3) obj2;
        return networkDeliveriesSourceImpl$updateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        zk3 zk3Var = (zk3) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return (z && (zk3Var instanceof rk3)) ? (tpr) this.this$0.g.getValue() : pvn.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
