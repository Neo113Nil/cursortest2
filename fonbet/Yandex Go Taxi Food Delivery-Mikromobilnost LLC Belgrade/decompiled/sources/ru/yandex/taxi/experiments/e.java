package ru.yandex.taxi.experiments;

import defpackage.h1s;
import defpackage.n20;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ h1s b;

    public e(vpr vprVar, h1s h1sVar) {
        this.a = vprVar;
        this.b = h1sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1 forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1;
        Object obj2;
        int i;
        vpr vprVar;
        if (continuation instanceof ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1) {
            forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1 = (ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1) continuation;
            int i2 = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    n20 n20Var = this.b.a;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$0 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$1 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$2 = obj;
                    vprVar = this.a;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$3 = vprVar;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$4 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$5 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.label = 1;
                    obj2 = ((com.yandex.go.taxi.order.provider.a) n20Var).k(forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$3;
                    obj = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$2;
                    kotlin.b.b(obj2);
                }
                if (((List) obj2).size() == 1) {
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$0 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$1 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$2 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$3 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$4 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.L$5 = null;
                    forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1 = new ForceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1(this, continuation);
        obj2 = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forceLiveLocationExperimentProviderImpl$isFeatureEnabledFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        if (((List) obj2).size() == 1) {
        }
        return zy11.a;
    }
}
