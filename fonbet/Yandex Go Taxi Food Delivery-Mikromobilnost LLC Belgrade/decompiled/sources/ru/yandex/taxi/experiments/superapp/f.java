package ru.yandex.taxi.experiments.superapp;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment;
import defpackage.eaf0;
import defpackage.j3s0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public f(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (((android.os.SystemClock.uptimeMillis() - r2.c) / 1000) <= r5) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1 shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1;
        int i;
        Screen screen;
        if (continuation instanceof ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1) {
            shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1 = (ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1) continuation;
            int i2 = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    j3s0 j3s0Var = (j3s0) obj;
                    i iVar = this.b;
                    iVar.getClass();
                    eaf0 eaf0Var = j3s0Var.d;
                    if (eaf0Var == null || !eaf0Var.d) {
                        j3s0 j3s0Var2 = iVar.h;
                        Screen screen2 = j3s0Var2.a;
                        int i3 = j3s0Var2.b;
                        int i4 = j3s0Var.b;
                        Screen screen3 = j3s0Var.a;
                        if (i3 == i4 && Objects.equals(j3s0Var2.d, j3s0Var.d) && (((screen2 == (screen = Screen.ORDERS_LIST) || screen2 == Screen.ORDER) && (screen3 == screen || screen3 == Screen.ORDER)) || screen2 == screen3)) {
                            j3s0 j3s0Var3 = iVar.h;
                            OrderShortcutsParamsExperiment.ShortcutsParams shortcutsParams = iVar.f.a().b;
                            long j = shortcutsParams != null ? shortcutsParams.a : 0L;
                            j3s0Var3.getClass();
                        }
                    }
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.L$0 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.L$1 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.L$2 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.L$3 = null;
                    shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.label = 1;
                    if (vprVar.emit(obj, shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1) == coroutineSingletons) {
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
        shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1 = new ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1(this, continuation);
        Object obj22 = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$filter$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
