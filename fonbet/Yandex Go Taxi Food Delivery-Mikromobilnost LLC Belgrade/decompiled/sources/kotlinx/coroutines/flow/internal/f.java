package kotlinx.coroutines.flow.internal;

import defpackage.l8x;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes9.dex */
public final class f implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ g c;
    public final /* synthetic */ vpr w;

    public f(Ref$ObjectRef ref$ObjectRef, tse tseVar, g gVar, vpr vprVar) {
        this.a = ref$ObjectRef;
        this.b = tseVar;
        this.c = gVar;
        this.w = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, pzt0] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
        int i;
        if (continuation instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
            channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) continuation;
            int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                Ref$ObjectRef ref$ObjectRef = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    l8x l8xVar = (l8x) ref$ObjectRef.element;
                    if (l8xVar != null) {
                        l8xVar.a(new ChildCancelledException());
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = obj;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = l8xVar;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = null;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.I$0 = 0;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                        if (l8xVar.u0(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                    kotlin.b.b(obj2);
                }
                ref$ObjectRef.element = tje.N(this.b, null, CoroutineStart.UNDISPATCHED, new ChannelFlowTransformLatest$flowCollect$3$1$2(this.c, this.w, obj, null), 1);
                return zy11.a;
            }
        }
        channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
        Object obj22 = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
        Ref$ObjectRef ref$ObjectRef2 = this.a;
        if (i != 0) {
        }
        ref$ObjectRef2.element = tje.N(this.b, null, CoroutineStart.UNDISPATCHED, new ChannelFlowTransformLatest$flowCollect$3$1$2(this.c, this.w, obj, null), 1);
        return zy11.a;
    }
}
