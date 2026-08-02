package ru.yandex.taxi.experiments.superapp;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ i b;

    public g(tpr tprVar, i iVar) {
        this.a = tprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1 shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1;
        int i;
        if (continuation instanceof ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1) {
            shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1 = (ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1) continuation;
            int i2 = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.L$0 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.L$1 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.L$2 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.label = 1;
                    if (this.a.collect(fVar, shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1) == coroutineSingletons) {
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
        shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1 = new ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1(this, continuation);
        Object obj2 = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
