package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll;

import defpackage.gri;
import defpackage.ny61;
import defpackage.pqi;
import defpackage.t701;
import defpackage.vpr;
import defpackage.x701;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1 pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1;
        int i;
        gri griVar;
        if (continuation instanceof PollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1) {
            pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1 = (PollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x701 x701Var = (x701) obj;
                    t701 t701Var = x701Var instanceof t701 ? (t701) x701Var : null;
                    pqi pqiVar = (t701Var == null || (griVar = t701Var.a) == null) ? null : griVar.t;
                    if (pqiVar != null) {
                        pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.L$0 = null;
                        pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.L$1 = null;
                        pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.L$2 = null;
                        pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.L$3 = null;
                        pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.L$4 = null;
                        pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(pqiVar, pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1 = new PollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollStateHolder$startPollRepositoryUpdating$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
