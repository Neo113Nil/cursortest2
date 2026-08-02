package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class g implements tpr {
    public final /* synthetic */ Iterable a;

    public g(Iterable iterable) {
        this.a = iterable;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1;
        int i;
        Iterator it;
        int i2;
        int i3;
        if (continuation instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) {
            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 = (FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) continuation;
            int i4 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label = i4 - Integer.MIN_VALUE;
                Object obj = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = this.a.iterator();
                    i2 = 0;
                    i3 = 0;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$1;
                    int i5 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$0;
                    it = (Iterator) flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$4;
                    vpr vprVar2 = (vpr) flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$2;
                    kotlin.b.b(obj);
                    i3 = i5;
                    vprVar = vprVar2;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$0 = null;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$1 = null;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$2 = vprVar;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$3 = null;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$4 = it;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$5 = null;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.L$6 = null;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$0 = i3;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$1 = i2;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.I$2 = 0;
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label = 1;
                    if (vprVar.emit(next, flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1(this, continuation);
        Object obj2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
