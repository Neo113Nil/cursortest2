package ru.yandex.taxi.logistics.sdk.management;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public h(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (r1.emit(r8, r7) != r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NetworkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1 networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        int i2;
        if (continuation instanceof NetworkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1) {
            networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1 = (NetworkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1) continuation;
            int i3 = networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$4 = vprVar;
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$5 = null;
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$6 = null;
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.I$1 = 0;
                    networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                    Object c = i.c(this.b, networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1);
                    if (c != coroutineSingletons) {
                        obj2 = c;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                i2 = networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.I$0;
                vprVar = (vpr) networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$0 = null;
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$1 = null;
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$2 = null;
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$3 = null;
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$4 = null;
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$5 = null;
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$6 = null;
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.I$0 = i2;
                networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.label = 2;
            }
        }
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1 = new NetworkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$0 = null;
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$1 = null;
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$2 = null;
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$3 = null;
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$4 = null;
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$5 = null;
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.L$6 = null;
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.I$0 = i2;
        networkDeliveriesSourceImpl$updateResultFlow_delegate$lambda$0$$inlined$map$1$2$1.label = 2;
    }
}
