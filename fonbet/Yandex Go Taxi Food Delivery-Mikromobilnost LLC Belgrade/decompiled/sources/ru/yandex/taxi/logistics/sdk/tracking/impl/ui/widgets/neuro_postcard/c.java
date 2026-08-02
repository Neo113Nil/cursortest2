package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.ny61;
import defpackage.t701;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NeuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1 neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1;
        int i;
        if (continuation instanceof NeuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1) {
            neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1 = (NeuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1) continuation;
            int i2 = neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (obj instanceof t701) {
                        neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.L$0 = null;
                        neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.L$1 = null;
                        neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.L$2 = null;
                        neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.L$3 = null;
                        neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.I$0 = 0;
                        neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.label = 1;
                        if (this.a.emit(obj, neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1) == coroutineSingletons) {
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
        neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1 = new NeuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1(this, continuation);
        Object obj22 = neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neuroPostcardStateHolder$special$$inlined$filterIsInstance$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
