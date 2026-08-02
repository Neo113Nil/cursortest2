package ru.yandex.taxi.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Lifecycle.Event b;

    public a(vpr vprVar, Lifecycle.Event event) {
        this.a = vprVar;
        this.b = event;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LifecycleUtils$waitForEvent$$inlined$filter$1$2$1 lifecycleUtils$waitForEvent$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof LifecycleUtils$waitForEvent$$inlined$filter$1$2$1) {
            lifecycleUtils$waitForEvent$$inlined$filter$1$2$1 = (LifecycleUtils$waitForEvent$$inlined$filter$1$2$1) continuation;
            int i2 = lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Lifecycle.Event) obj) == this.b) {
                        lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.L$0 = null;
                        lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.L$1 = null;
                        lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.L$2 = null;
                        lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.L$3 = null;
                        lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, lifecycleUtils$waitForEvent$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        lifecycleUtils$waitForEvent$$inlined$filter$1$2$1 = new LifecycleUtils$waitForEvent$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lifecycleUtils$waitForEvent$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
