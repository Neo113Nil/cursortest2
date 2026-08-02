package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.g8e;
import defpackage.hfi;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.deliveries.DeliveriesManagerActor$acquireDeliveryCancelling$2", f = "DeliveriesManagerActor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveriesManagerActor$acquireDeliveryCancelling$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $deliveryId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesManagerActor$acquireDeliveryCancelling$2(d dVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$deliveryId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DeliveriesManagerActor$acquireDeliveryCancelling$2(this.this$0, this.$deliveryId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DeliveriesManagerActor$acquireDeliveryCancelling$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        String o = g8e.o("Acquire delivery cancelling: deliveryId = ", this.$deliveryId);
        dVar.getClass();
        d.i(o);
        ArrayList arrayList = this.this$0.A;
        if (arrayList != null) {
            String str = this.$deliveryId;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((hfi) next).a, str)) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (hfi) obj2;
        }
        boolean z = false;
        boolean z2 = obj2 != null;
        if (!z2) {
            d dVar2 = this.this$0;
            String str2 = "Delivery not found: deliveryId = " + this.$deliveryId;
            dVar2.getClass();
            d.i(str2);
        }
        boolean contains = this.this$0.B.contains(this.$deliveryId);
        if (contains) {
            d dVar3 = this.this$0;
            String str3 = "Delivery is already cancelling: deliveryId = " + this.$deliveryId;
            dVar3.getClass();
            d.i(str3);
        }
        if (z2 && !contains) {
            this.this$0.B.add(this.$deliveryId);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
