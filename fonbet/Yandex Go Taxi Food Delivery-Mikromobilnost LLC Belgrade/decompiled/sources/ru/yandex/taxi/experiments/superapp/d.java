package ru.yandex.taxi.experiments.superapp;

import defpackage.e3n;
import defpackage.j3s0;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public d(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (((android.os.SystemClock.uptimeMillis() - r11.c) / 1000) <= r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1 shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1) {
            shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1 = (ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    int intValue = ((Number) obj).intValue();
                    i iVar = this.b;
                    if (intValue != 0) {
                        j3s0 j3s0Var = iVar.h;
                        o430 o430Var = e3n.b;
                        long o = e3n.o(kp50.U(5, DurationUnit.MINUTES), DurationUnit.SECONDS);
                        j3s0Var.getClass();
                    } else {
                        iVar.getClass();
                    }
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                    if (vprVar.emit(obj, shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1 = new ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
