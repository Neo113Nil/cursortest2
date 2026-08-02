package ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network;

import defpackage.jl40;
import defpackage.lth;
import defpackage.ny61;
import defpackage.rsh;
import defpackage.ssh;
import defpackage.t360;
import defpackage.u360;
import defpackage.v360;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public b(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NeuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1;
        int i;
        v360 v360Var;
        if (continuation instanceof NeuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) {
            neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = (NeuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lth lthVar = (lth) obj;
                    boolean z = lthVar instanceof ssh;
                    String str = this.b;
                    if (z && jl40.l(((ssh) lthVar).c, str)) {
                        v360Var = u360.a;
                    } else {
                        if (lthVar instanceof rsh) {
                            rsh rshVar = (rsh) lthVar;
                            if (jl40.l(rshVar.c, str)) {
                                v360Var = new t360(rshVar.e);
                            }
                        }
                        v360Var = null;
                    }
                    if (v360Var != null) {
                        neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(v360Var, neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1 = new NeuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardSendPromptTask$getDeliveriesEventFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
