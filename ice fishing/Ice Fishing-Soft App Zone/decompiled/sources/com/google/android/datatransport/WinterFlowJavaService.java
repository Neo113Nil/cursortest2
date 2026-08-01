package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaService implements WinterFlowFunctionCacheManager {
    @Override // com.google.android.datatransport.WinterFlowFunctionCacheManager
    public final void WinterFlowTransactionManagerStrategy(WinterFlowNodeException winterFlowNodeException, int i, int[] iArr, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, int[] iArr2) {
        int i2 = 0;
        if (winterFlowCacheManagerConfiguration == WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            i6 += iArr[i2];
            i2++;
        }
        int i7 = i - i6;
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = i7;
            i7 += i8;
        }
    }

    public final String toString() {
        return "Arrangement#Start";
    }
}
