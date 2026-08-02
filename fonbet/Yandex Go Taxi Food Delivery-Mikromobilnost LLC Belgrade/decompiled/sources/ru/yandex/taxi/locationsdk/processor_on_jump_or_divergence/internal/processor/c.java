package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.xrr;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ xrr b;

    public c(vpr vprVar, xrr xrrVar) {
        this.a = vprVar;
        this.b = xrrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        InputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1 inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof InputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1) {
            inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1 = (InputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1) continuation;
            int i2 = inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    xrr xrrVar = this.b;
                    LinkedHashMap linkedHashMap = booleanValue ? (LinkedHashMap) xrrVar.z : (LinkedHashMap) xrrVar.y;
                    inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.L$0 = null;
                    inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.L$1 = null;
                    inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.L$2 = null;
                    inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.L$3 = null;
                    inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.I$0 = 0;
                    inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(linkedHashMap, inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1) == coroutineSingletons) {
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
        inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1 = new InputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1(this, continuation);
        Object obj22 = inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inputSourcePriorityProvider$observeSourcePriorities$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
