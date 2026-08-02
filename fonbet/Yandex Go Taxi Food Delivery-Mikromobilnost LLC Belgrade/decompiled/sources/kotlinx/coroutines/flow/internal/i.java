package kotlinx.coroutines.flow.internal;

import defpackage.ci9;
import defpackage.hrv;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class i implements vpr {
    public final /* synthetic */ ci9 a;
    public final /* synthetic */ int b;

    public i(ci9 ci9Var, int i) {
        this.a = ci9Var;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (defpackage.bb1.l0(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r6.a.o(r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
        int i;
        if (continuation instanceof CombineKt$combineInternal$2$1$1$emit$1) {
            combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) continuation;
            int i2 = combineKt$combineInternal$2$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                combineKt$combineInternal$2$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = combineKt$combineInternal$2$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = combineKt$combineInternal$2$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hrv hrvVar = new hrv(this.b, obj);
                    combineKt$combineInternal$2$1$1$emit$1.L$0 = null;
                    combineKt$combineInternal$2$1$1$emit$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                combineKt$combineInternal$2$1$1$emit$1.L$0 = null;
                combineKt$combineInternal$2$1$1$emit$1.label = 2;
            }
        }
        combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
        Object obj22 = combineKt$combineInternal$2$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = combineKt$combineInternal$2$1$1$emit$1.label;
        if (i != 0) {
        }
        combineKt$combineInternal$2$1$1$emit$1.L$0 = null;
        combineKt$combineInternal$2$1$1$emit$1.label = 2;
    }
}
