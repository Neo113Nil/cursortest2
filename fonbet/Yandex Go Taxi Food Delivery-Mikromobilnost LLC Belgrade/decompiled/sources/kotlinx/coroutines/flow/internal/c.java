package kotlinx.coroutines.flow.internal;

import defpackage.l8x;
import defpackage.mqq0;
import defpackage.ny61;
import defpackage.pnq0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class c implements vpr {
    public final /* synthetic */ l8x a;
    public final /* synthetic */ pnq0 b;
    public final /* synthetic */ y6f0 c;
    public final /* synthetic */ mqq0 w;

    public c(l8x l8xVar, pnq0 pnq0Var, y6f0 y6f0Var, mqq0 mqq0Var) {
        this.a = l8xVar;
        this.b = pnq0Var;
        this.c = y6f0Var;
        this.w = mqq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(tpr tprVar, Continuation continuation) {
        ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
        int i;
        if (continuation instanceof ChannelFlowMerge$collectTo$2$emit$1) {
            channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) continuation;
            int i2 = channelFlowMerge$collectTo$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                channelFlowMerge$collectTo$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = channelFlowMerge$collectTo$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelFlowMerge$collectTo$2$emit$1.label;
                pnq0 pnq0Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l8x l8xVar = this.a;
                    if (l8xVar != null) {
                        kotlinx.coroutines.a.l(l8xVar);
                    }
                    channelFlowMerge$collectTo$2$emit$1.L$0 = tprVar;
                    channelFlowMerge$collectTo$2$emit$1.label = 1;
                    if (pnq0Var.b(channelFlowMerge$collectTo$2$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tprVar = (tpr) channelFlowMerge$collectTo$2$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                tje.N(this.c, null, null, new ChannelFlowMerge$collectTo$2$1(tprVar, this.w, pnq0Var, null), 3);
                return zy11.a;
            }
        }
        channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
        Object obj2 = channelFlowMerge$collectTo$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = channelFlowMerge$collectTo$2$emit$1.label;
        pnq0 pnq0Var2 = this.b;
        if (i != 0) {
        }
        tje.N(this.c, null, null, new ChannelFlowMerge$collectTo$2$1(tprVar, this.w, pnq0Var2, null), 3);
        return zy11.a;
    }
}
