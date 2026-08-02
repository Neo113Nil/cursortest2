package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.r18;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes9.dex */
public abstract class a implements tpr, r18 {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        int i;
        SafeCollector safeCollector;
        if (continuation instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) continuation;
            int i2 = abstractFlow$collect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                abstractFlow$collect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = abstractFlow$collect$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = abstractFlow$collect$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SafeCollector safeCollector2 = new SafeCollector(vprVar, abstractFlow$collect$1.get_context());
                    try {
                        abstractFlow$collect$1.L$0 = null;
                        abstractFlow$collect$1.L$1 = safeCollector2;
                        abstractFlow$collect$1.label = 1;
                        if (d(safeCollector2, abstractFlow$collect$1) == obj2) {
                            return obj2;
                        }
                        safeCollector = safeCollector2;
                    } catch (Throwable th) {
                        th = th;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    safeCollector = (SafeCollector) abstractFlow$collect$1.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                safeCollector.releaseIntercepted();
                return zy11.a;
            }
        }
        abstractFlow$collect$1 = new AbstractFlow$collect$1(this, continuation);
        Object obj3 = abstractFlow$collect$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abstractFlow$collect$1.label;
        if (i != 0) {
        }
        safeCollector.releaseIntercepted();
        return zy11.a;
    }

    public abstract Object d(SafeCollector safeCollector, Continuation continuation);
}
