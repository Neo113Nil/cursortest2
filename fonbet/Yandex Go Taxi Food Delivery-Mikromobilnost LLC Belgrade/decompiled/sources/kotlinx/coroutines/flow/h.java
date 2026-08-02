package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class h implements tpr {
    public final /* synthetic */ Object[] a;

    public h(Object[] objArr) {
        this.a = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:10:0x0067). Please report as a decompilation issue!!! */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1;
        int i;
        int i2;
        vpr vprVar2;
        int length;
        int i3;
        if (continuation instanceof FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1) {
            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 = (FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1) continuation;
            int i4 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label = i4 - Integer.MIN_VALUE;
                Object obj = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label;
                Object[] objArr = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = 0;
                    vprVar2 = vprVar;
                    length = objArr.length;
                    i3 = 0;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$2;
                    i2 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$1;
                    i3 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$0;
                    vpr vprVar3 = (vpr) flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.L$2;
                    kotlin.b.b(obj);
                    vprVar2 = vprVar3;
                    i2++;
                    if (i2 < length) {
                        Object obj2 = objArr[i2];
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.L$0 = null;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.L$1 = null;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.L$2 = vprVar2;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.L$3 = null;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$0 = i3;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$1 = i2;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.I$2 = length;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label = 1;
                        if (vprVar2.emit(obj2, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i2++;
                        if (i2 < length) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1(this, continuation);
        Object obj3 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1.label;
        Object[] objArr2 = this.a;
        if (i != 0) {
        }
    }
}
