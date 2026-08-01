package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkRenderer {
    public static final WinterFlowFrameworkRenderer WinterFlowTransactionManagerStrategy = new WinterFlowFrameworkRenderer(0, new int[0], new Object[0], false);
    public int WinterFlowArrayNetwork = -1;
    public Object[] WinterFlowCacheManagerAgent;
    public int[] WinterFlowHookDataSource;
    public int WinterFlowRouterStructure;
    public boolean WinterFlowVariableVersionControl;

    public WinterFlowFrameworkRenderer(int i, int[] iArr, Object[] objArr, boolean z) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = iArr;
        this.WinterFlowCacheManagerAgent = objArr;
        this.WinterFlowVariableVersionControl = z;
    }

    public final void WinterFlowArrayNetwork(WinterFlowJSONDecorator winterFlowJSONDecorator) {
        if (this.WinterFlowRouterStructure == 0) {
            return;
        }
        winterFlowJSONDecorator.getClass();
        WinterFlowSessionManagerSingleton winterFlowSessionManagerSingleton = (WinterFlowSessionManagerSingleton) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
        for (int i = 0; i < this.WinterFlowRouterStructure; i++) {
            int i2 = this.WinterFlowHookDataSource[i];
            Object obj = this.WinterFlowCacheManagerAgent[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                winterFlowSessionManagerSingleton.WinterFlowStrategyTool(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                winterFlowSessionManagerSingleton.WinterFlowBatchUI(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                winterFlowSessionManagerSingleton.WinterFlowOrchestrationSubsystem(i3, (WinterFlowMicroserviceCloud) obj);
            } else if (i4 == 3) {
                winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i3, 3);
                ((WinterFlowFrameworkRenderer) obj).WinterFlowArrayNetwork(winterFlowJSONDecorator);
                winterFlowSessionManagerSingleton.WinterFlowArrayHelper(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(WinterFlowRouterAgent.WinterFlowHookDataSource());
                }
                winterFlowSessionManagerSingleton.WinterFlowSingletonPlatform(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final void WinterFlowCacheManagerAgent(int i, Object obj) {
        if (!this.WinterFlowVariableVersionControl) {
            throw new UnsupportedOperationException();
        }
        WinterFlowRouterStructure(this.WinterFlowRouterStructure + 1);
        int[] iArr = this.WinterFlowHookDataSource;
        int i2 = this.WinterFlowRouterStructure;
        iArr[i2] = i;
        this.WinterFlowCacheManagerAgent[i2] = obj;
        this.WinterFlowRouterStructure = i2 + 1;
    }

    public final int WinterFlowHookDataSource() {
        int WinterFlowRouterRouter;
        int WinterFlowResponseEngine;
        int WinterFlowRouterRouter2;
        int i = this.WinterFlowArrayNetwork;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.WinterFlowRouterStructure; i3++) {
            int i4 = this.WinterFlowHookDataSource[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.WinterFlowCacheManagerAgent[i3]).getClass();
                    WinterFlowRouterRouter2 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i5) + 8;
                } else if (i6 == 2) {
                    WinterFlowRouterRouter2 = WinterFlowSessionManagerSingleton.WinterFlowTransactionManagerStrategy(i5, (WinterFlowMicroserviceCloud) this.WinterFlowCacheManagerAgent[i3]);
                } else if (i6 == 3) {
                    WinterFlowRouterRouter = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i5) * 2;
                    WinterFlowResponseEngine = ((WinterFlowFrameworkRenderer) this.WinterFlowCacheManagerAgent[i3]).WinterFlowHookDataSource();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(WinterFlowRouterAgent.WinterFlowHookDataSource());
                    }
                    ((Integer) this.WinterFlowCacheManagerAgent[i3]).getClass();
                    WinterFlowRouterRouter2 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i5) + 4;
                }
                i2 = WinterFlowRouterRouter2 + i2;
            } else {
                long longValue = ((Long) this.WinterFlowCacheManagerAgent[i3]).longValue();
                WinterFlowRouterRouter = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(i5);
                WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(longValue);
            }
            i2 = WinterFlowResponseEngine + WinterFlowRouterRouter + i2;
        }
        this.WinterFlowArrayNetwork = i2;
        return i2;
    }

    public final void WinterFlowRouterStructure(int i) {
        int[] iArr = this.WinterFlowHookDataSource;
        if (i > iArr.length) {
            int i2 = this.WinterFlowRouterStructure;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.WinterFlowHookDataSource = Arrays.copyOf(iArr, i);
            this.WinterFlowCacheManagerAgent = Arrays.copyOf(this.WinterFlowCacheManagerAgent, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WinterFlowFrameworkRenderer)) {
            return false;
        }
        WinterFlowFrameworkRenderer winterFlowFrameworkRenderer = (WinterFlowFrameworkRenderer) obj;
        int i = this.WinterFlowRouterStructure;
        if (i == winterFlowFrameworkRenderer.WinterFlowRouterStructure) {
            int[] iArr = this.WinterFlowHookDataSource;
            int[] iArr2 = winterFlowFrameworkRenderer.WinterFlowHookDataSource;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.WinterFlowCacheManagerAgent;
                    Object[] objArr2 = winterFlowFrameworkRenderer.WinterFlowCacheManagerAgent;
                    int i3 = this.WinterFlowRouterStructure;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.WinterFlowRouterStructure;
        int i2 = (527 + i) * 31;
        int[] iArr = this.WinterFlowHookDataSource;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.WinterFlowCacheManagerAgent;
        int i7 = this.WinterFlowRouterStructure;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
