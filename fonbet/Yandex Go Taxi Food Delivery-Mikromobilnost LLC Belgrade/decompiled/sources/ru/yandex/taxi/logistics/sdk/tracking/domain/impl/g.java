package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.p2g0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public g(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1 updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof UpdateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1) {
            updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1 = (UpdateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (jl40.l(((p2g0) obj).a, this.b)) {
                        updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.I$0 = 0;
                        updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1 = new UpdateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateEmitter$updateFlow$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
