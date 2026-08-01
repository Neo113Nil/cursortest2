package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPoolCompiler implements WinterFlowFunctionCacheManager, WinterFlowTransactionDecorator {
    public final WinterFlowCompilerMechanism WinterFlowTransactionManagerStrategy;
    public final float WinterFlowUnitTestResponse;
    public final float WinterFlowVariableVersionControl;

    public WinterFlowThreadPoolCompiler(float f, WinterFlowCompilerMechanism winterFlowCompilerMechanism) {
        this.WinterFlowVariableVersionControl = f;
        this.WinterFlowTransactionManagerStrategy = winterFlowCompilerMechanism;
        this.WinterFlowUnitTestResponse = f;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionDecorator
    public final void WinterFlowRouterRouter(int i, WinterFlowNodeException winterFlowNodeException, int[] iArr, int[] iArr2) {
        WinterFlowTransactionManagerStrategy(winterFlowNodeException, i, iArr, WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl, iArr2);
    }

    @Override // com.google.android.datatransport.WinterFlowFunctionCacheManager, com.google.android.datatransport.WinterFlowTransactionDecorator
    public final float WinterFlowRouterStructure() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowFunctionCacheManager
    public final void WinterFlowTransactionManagerStrategy(WinterFlowNodeException winterFlowNodeException, int i, int[] iArr, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int WinterFlowUserManagerUserManager = winterFlowNodeException.WinterFlowUserManagerUserManager(this.WinterFlowVariableVersionControl);
        boolean z = winterFlowCacheManagerConfiguration == WinterFlowCacheManagerConfiguration.WinterFlowTransactionManagerStrategy;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = Math.min(WinterFlowUserManagerUserManager, max);
                i = iArr2[i5] - i4;
                i3++;
                i5++;
            }
            i2 = i + i4;
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                int min = Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = Math.min(WinterFlowUserManagerUserManager, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        if (i2 > 0) {
            int round = Math.round((1.0f + (winterFlowCacheManagerConfiguration == WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl ? -1.0f : 1.0f)) * (i2 / 2.0f));
            if (z) {
                round -= i2;
            }
            if (round != 0) {
                int length3 = iArr2.length;
                for (int i12 = 0; i12 < length3; i12++) {
                    iArr2[i12] = iArr2[i12] + round;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowThreadPoolCompiler) {
            WinterFlowThreadPoolCompiler winterFlowThreadPoolCompiler = (WinterFlowThreadPoolCompiler) obj;
            return WinterFlowRequestScheduler.WinterFlowHookDataSource(this.WinterFlowVariableVersionControl, winterFlowThreadPoolCompiler.WinterFlowVariableVersionControl) && this.WinterFlowTransactionManagerStrategy == winterFlowThreadPoolCompiler.WinterFlowTransactionManagerStrategy;
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowTransactionManagerStrategy.hashCode() + WinterFlowSingletonMapper.WinterFlowRouterStructure(Float.hashCode(this.WinterFlowVariableVersionControl) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) WinterFlowRequestScheduler.WinterFlowCacheManagerAgent(this.WinterFlowVariableVersionControl)) + ", " + this.WinterFlowTransactionManagerStrategy + ')';
    }
}
