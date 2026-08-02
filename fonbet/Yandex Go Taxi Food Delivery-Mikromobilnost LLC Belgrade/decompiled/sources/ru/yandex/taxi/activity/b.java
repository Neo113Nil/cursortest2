package ru.yandex.taxi.activity;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ int b;

    public b(n0 n0Var, int i) {
        this.a = n0Var;
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ActivityResultHandler$activityContractResultFlow$$inlined$filter$1$1 activityResultHandler$activityContractResultFlow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ActivityResultHandler$activityContractResultFlow$$inlined$filter$1$1) {
            activityResultHandler$activityContractResultFlow$$inlined$filter$1$1 = (ActivityResultHandler$activityContractResultFlow$$inlined$filter$1$1) continuation;
            int i2 = activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.L$0 = null;
                    activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.L$1 = null;
                    activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.L$2 = null;
                    activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, activityResultHandler$activityContractResultFlow$$inlined$filter$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        activityResultHandler$activityContractResultFlow$$inlined$filter$1$1 = new ActivityResultHandler$activityContractResultFlow$$inlined$filter$1$1(this, continuation);
        Object obj2 = activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activityResultHandler$activityContractResultFlow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
