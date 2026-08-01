package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudModule {
    public Object[] WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int[] WinterFlowHookDataSource;
    public final WinterFlowQueryPackage WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public final WinterFlowMapperInterface WinterFlowRouterStructure;
    public int WinterFlowServerProtocol;
    public boolean WinterFlowServiceUtility;
    public int WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;
    public boolean WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowCloudModule(WinterFlowMapperInterface winterFlowMapperInterface) {
        this.WinterFlowRouterStructure = winterFlowMapperInterface;
        this.WinterFlowHookDataSource = winterFlowMapperInterface.WinterFlowVariableVersionControl;
        int i = winterFlowMapperInterface.WinterFlowTransactionManagerStrategy;
        this.WinterFlowCacheManagerAgent = i;
        this.WinterFlowArrayNetwork = winterFlowMapperInterface.WinterFlowUnitTestResponse;
        this.WinterFlowVariableVersionControl = winterFlowMapperInterface.WinterFlowRouterRouter;
        this.WinterFlowRouterRouter = i;
        this.WinterFlowSyntax = -1;
        this.WinterFlowResponseEngine = new WinterFlowQueryPackage();
    }

    public final boolean WinterFlowArrayNetwork(int i) {
        return (this.WinterFlowHookDataSource[(i * 5) + 1] & 67108864) != 0;
    }

    public final int WinterFlowBandwidthObject(int i) {
        return this.WinterFlowHookDataSource[(i * 5) + 1] & 67108863;
    }

    public final void WinterFlowBatchUI() {
        if (!(this.WinterFlowTransactionAgent == 0)) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot skip the enclosing group while in an empty region");
        }
        this.WinterFlowUnitTestResponse = this.WinterFlowRouterRouter;
        this.WinterFlowServerProtocol = 0;
        this.WinterFlowThreadListener = 0;
    }

    public final void WinterFlowCacheManagerAgent() {
        this.WinterFlowTransactionManagerStrategy = true;
        if (this.WinterFlowRouterStructure.WinterFlowSyntax <= 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Unexpected reader close()");
        }
        r0.WinterFlowSyntax--;
        this.WinterFlowArrayNetwork = new Object[0];
    }

    public final int WinterFlowConcurrencyThread(int i) {
        return this.WinterFlowHookDataSource[(i * 5) + 2];
    }

    public final Object WinterFlowHookDataSource(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.WinterFlowArrayNetwork[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return WinterFlowModuleModule.WinterFlowRouterStructure;
    }

    public final Object WinterFlowOrchestrationSubsystem(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.WinterFlowArrayNetwork[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final boolean WinterFlowResponseEngine(int i) {
        return (this.WinterFlowHookDataSource[(i * 5) + 1] & 134217728) != 0;
    }

    public final void WinterFlowRouterAdapter() {
        if (this.WinterFlowTransactionAgent <= 0) {
            int i = this.WinterFlowSyntax;
            int i2 = this.WinterFlowUnitTestResponse;
            int i3 = i2 * 5;
            int[] iArr = this.WinterFlowHookDataSource;
            if (iArr[i3 + 2] != i) {
                WinterFlowResponseCloud.WinterFlowRouterStructure("Invalid slot table detected");
            }
            int i4 = this.WinterFlowServerProtocol;
            int i5 = this.WinterFlowThreadListener;
            WinterFlowQueryPackage winterFlowQueryPackage = this.WinterFlowResponseEngine;
            if (i4 == 0 && i5 == 0) {
                winterFlowQueryPackage.WinterFlowCacheManagerAgent(-1);
            } else {
                winterFlowQueryPackage.WinterFlowCacheManagerAgent(i4);
            }
            this.WinterFlowSyntax = i2;
            this.WinterFlowRouterRouter = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.WinterFlowUnitTestResponse = i6;
            this.WinterFlowServerProtocol = WinterFlowQueryTool.WinterFlowArrayNetwork(iArr, i2);
            this.WinterFlowThreadListener = i2 >= this.WinterFlowCacheManagerAgent + (-1) ? this.WinterFlowVariableVersionControl : iArr[(i6 * 5) + 4];
        }
    }

    public final Object WinterFlowRouterRouter(int i, int i2) {
        int[] iArr = this.WinterFlowHookDataSource;
        int WinterFlowArrayNetwork = WinterFlowQueryTool.WinterFlowArrayNetwork(iArr, i);
        int i3 = i + 1;
        int i4 = WinterFlowArrayNetwork + i2;
        return i4 < (i3 < this.WinterFlowCacheManagerAgent ? iArr[(i3 * 5) + 4] : this.WinterFlowVariableVersionControl) ? this.WinterFlowArrayNetwork[i4] : WinterFlowModuleModule.WinterFlowRouterStructure;
    }

    public final WinterFlowDatabaseSchemaHandler WinterFlowRouterStructure(int i) {
        ArrayList arrayList = this.WinterFlowRouterStructure.WinterFlowThreadListener;
        int WinterFlowCacheManagerAgent = WinterFlowQueryTool.WinterFlowCacheManagerAgent(arrayList, i, this.WinterFlowCacheManagerAgent);
        if (WinterFlowCacheManagerAgent >= 0) {
            return (WinterFlowDatabaseSchemaHandler) arrayList.get(WinterFlowCacheManagerAgent);
        }
        WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = new WinterFlowDatabaseSchemaHandler(i);
        arrayList.add(-(WinterFlowCacheManagerAgent + 1), winterFlowDatabaseSchemaHandler);
        return winterFlowDatabaseSchemaHandler;
    }

    public final boolean WinterFlowServerProtocol(int i) {
        return (this.WinterFlowHookDataSource[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object WinterFlowServiceUtility(int i) {
        int i2 = i * 5;
        int[] iArr = this.WinterFlowHookDataSource;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.WinterFlowArrayNetwork[iArr[i2 + 4]] : WinterFlowModuleModule.WinterFlowRouterStructure;
        }
        return null;
    }

    public final void WinterFlowSingletonPlatform(int i) {
        if (this.WinterFlowTransactionAgent != 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot reposition while in an empty region");
        }
        this.WinterFlowUnitTestResponse = i;
        int[] iArr = this.WinterFlowHookDataSource;
        int i2 = this.WinterFlowCacheManagerAgent;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.WinterFlowSyntax) {
            this.WinterFlowSyntax = i3;
            if (i3 < 0) {
                this.WinterFlowRouterRouter = i2;
            } else {
                this.WinterFlowRouterRouter = iArr[(i3 * 5) + 3] + i3;
            }
            this.WinterFlowServerProtocol = 0;
            this.WinterFlowThreadListener = 0;
        }
    }

    public final int WinterFlowSyntax(int i) {
        return this.WinterFlowHookDataSource[i * 5];
    }

    public final Object WinterFlowThreadListener() {
        int i;
        if (this.WinterFlowTransactionAgent > 0 || (i = this.WinterFlowServerProtocol) >= this.WinterFlowThreadListener) {
            this.WinterFlowServiceUtility = false;
            return WinterFlowModuleModule.WinterFlowRouterStructure;
        }
        this.WinterFlowServiceUtility = true;
        Object[] objArr = this.WinterFlowArrayNetwork;
        this.WinterFlowServerProtocol = i + 1;
        return objArr[i];
    }

    public final boolean WinterFlowTransactionAgent(int i) {
        return (this.WinterFlowHookDataSource[(i * 5) + 1] & 536870912) != 0;
    }

    public final Object WinterFlowTransactionManagerStrategy() {
        int i = this.WinterFlowUnitTestResponse;
        if (i < this.WinterFlowRouterRouter) {
            return WinterFlowHookDataSource(this.WinterFlowHookDataSource, i);
        }
        return 0;
    }

    public final int WinterFlowUnitTestResponse() {
        int i = this.WinterFlowUnitTestResponse;
        if (i >= this.WinterFlowRouterRouter) {
            return 0;
        }
        return this.WinterFlowHookDataSource[i * 5];
    }

    public final int WinterFlowVariableBandwidth() {
        if (this.WinterFlowTransactionAgent != 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot skip while in an empty region");
        }
        int i = this.WinterFlowUnitTestResponse;
        int i2 = i * 5;
        int[] iArr = this.WinterFlowHookDataSource;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.WinterFlowUnitTestResponse = iArr[i2 + 3] + i;
        return i4;
    }

    public final void WinterFlowVariableVersionControl() {
        if (this.WinterFlowTransactionAgent == 0) {
            if (this.WinterFlowUnitTestResponse != this.WinterFlowRouterRouter) {
                WinterFlowSessionManagerEntity.WinterFlowRouterStructure("endGroup() not called at the end of a group");
            }
            int i = (this.WinterFlowSyntax * 5) + 2;
            int[] iArr = this.WinterFlowHookDataSource;
            int i2 = iArr[i];
            this.WinterFlowSyntax = i2;
            int i3 = this.WinterFlowCacheManagerAgent;
            this.WinterFlowRouterRouter = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int WinterFlowHookDataSource = this.WinterFlowResponseEngine.WinterFlowHookDataSource();
            if (WinterFlowHookDataSource < 0) {
                this.WinterFlowServerProtocol = 0;
                this.WinterFlowThreadListener = 0;
            } else {
                this.WinterFlowServerProtocol = WinterFlowHookDataSource;
                this.WinterFlowThreadListener = i2 >= i3 + (-1) ? this.WinterFlowVariableVersionControl : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.WinterFlowUnitTestResponse);
        sb.append(", key=");
        sb.append(WinterFlowUnitTestResponse());
        sb.append(", parent=");
        sb.append(this.WinterFlowSyntax);
        sb.append(", end=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowRouterRouter, ')');
    }
}
