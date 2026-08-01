package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyArray {
    private volatile AtomicReferenceArray<Object> array;

    public WinterFlowProxyArray(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final void WinterFlowCacheManagerAgent(int i, WinterFlowValidatorRuntime winterFlowValidatorRuntime) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, winterFlowValidatorRuntime);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, winterFlowValidatorRuntime);
        this.array = atomicReferenceArray2;
    }

    public final Object WinterFlowHookDataSource(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final int WinterFlowRouterStructure() {
        return this.array.length();
    }
}
