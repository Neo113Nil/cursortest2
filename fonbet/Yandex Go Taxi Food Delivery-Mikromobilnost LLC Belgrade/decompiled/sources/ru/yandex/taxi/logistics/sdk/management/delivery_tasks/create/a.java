package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create;

import defpackage.ath;
import defpackage.lth;
import defpackage.ny61;
import defpackage.q4f;
import defpackage.vpr;
import defpackage.ysh;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Integer c;

    public a(vpr vprVar, List list, Integer num) {
        this.a = vprVar;
        this.b = list;
        this.c = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CommitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1 commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1;
        int i;
        q4f q4fVar;
        if (continuation instanceof CommitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1) {
            commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1 = (CommitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lth lthVar = (lth) obj;
                    boolean z = lthVar instanceof ath;
                    Integer num = this.c;
                    List list = this.b;
                    if (z) {
                        ath athVar = (ath) lthVar;
                        if (list.contains(athVar.b)) {
                            Integer num2 = athVar.c;
                            if (num2 != null ? num2.equals(num) : true) {
                                q4fVar = new q4f(athVar.d);
                                if (q4fVar != null) {
                                    commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.L$0 = null;
                                    commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.L$1 = null;
                                    commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.L$2 = null;
                                    commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.L$3 = null;
                                    commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.L$4 = null;
                                    commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.I$0 = 0;
                                    commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (this.a.emit(q4fVar, commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            }
                        }
                    }
                    if (lthVar instanceof ysh) {
                        ysh yshVar = (ysh) lthVar;
                        if (list.contains(yshVar.b)) {
                            Integer num3 = yshVar.d;
                            if (num3 != null ? num3.equals(num) : true) {
                                throw new ServerRejectedDeliveryException(null, yshVar.c, 1);
                            }
                        }
                    }
                    q4fVar = null;
                    if (q4fVar != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1 = new CommitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commitTask$awaitServerConfirmsDeliveryCreated$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
