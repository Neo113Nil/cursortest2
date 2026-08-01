package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderEntity {
    public int WinterFlowHookDataSource;
    public long[] WinterFlowRouterStructure;

    public WinterFlowLoaderEntity(int i) {
        this.WinterFlowRouterStructure = i == 0 ? WinterFlowLoaderInheritance.WinterFlowRouterStructure : new long[i];
    }

    public final void WinterFlowRouterStructure(long j) {
        int i = this.WinterFlowHookDataSource + 1;
        long[] jArr = this.WinterFlowRouterStructure;
        if (jArr.length < i) {
            jArr = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            this.WinterFlowRouterStructure = jArr;
        }
        int i2 = this.WinterFlowHookDataSource;
        jArr[i2] = j;
        this.WinterFlowHookDataSource = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowLoaderEntity) {
            WinterFlowLoaderEntity winterFlowLoaderEntity = (WinterFlowLoaderEntity) obj;
            int i = winterFlowLoaderEntity.WinterFlowHookDataSource;
            int i2 = this.WinterFlowHookDataSource;
            if (i == i2) {
                long[] jArr = this.WinterFlowRouterStructure;
                long[] jArr2 = winterFlowLoaderEntity.WinterFlowRouterStructure;
                WinterFlowCacheManagerListener WinterFlowArrayHelper = WinterFlowDecoratorUI.WinterFlowArrayHelper(0, i2);
                int i3 = WinterFlowArrayHelper.WinterFlowVariableVersionControl;
                int i4 = WinterFlowArrayHelper.WinterFlowTransactionManagerStrategy;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.WinterFlowRouterStructure;
        int i = this.WinterFlowHookDataSource;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.WinterFlowRouterStructure;
        int i = this.WinterFlowHookDataSource;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ WinterFlowLoaderEntity() {
        this(16);
    }
}
