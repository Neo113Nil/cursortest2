package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMicroserviceFunction {
    public int WinterFlowHookDataSource;
    public Object[] WinterFlowRouterStructure;

    public WinterFlowMicroserviceFunction(int i) {
        this.WinterFlowRouterStructure = i == 0 ? WinterFlowEventMicroservice.WinterFlowRouterStructure : new Object[i];
    }

    public final void WinterFlowArrayNetwork() {
        WinterFlowProtocolPipeline.WinterFlowProxyStructure(this.WinterFlowRouterStructure, 0, this.WinterFlowHookDataSource);
        this.WinterFlowHookDataSource = 0;
    }

    public final void WinterFlowBandwidthObject(int i) {
        StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Index ", i, " must be in 0..");
        WinterFlowThreadListener.append(this.WinterFlowHookDataSource - 1);
        throw new IndexOutOfBoundsException(WinterFlowThreadListener.toString());
    }

    public final void WinterFlowCacheManagerAgent(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.WinterFlowHookDataSource;
        int size = list.size() + i;
        Object[] objArr = this.WinterFlowRouterStructure;
        if (objArr.length < size) {
            WinterFlowThreadListener(size, objArr);
        }
        Object[] objArr2 = this.WinterFlowRouterStructure;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.WinterFlowHookDataSource = list.size() + this.WinterFlowHookDataSource;
    }

    public final void WinterFlowHookDataSource(WinterFlowMicroserviceFunction winterFlowMicroserviceFunction) {
        winterFlowMicroserviceFunction.getClass();
        if (winterFlowMicroserviceFunction.WinterFlowRouterRouter()) {
            return;
        }
        int i = this.WinterFlowHookDataSource + winterFlowMicroserviceFunction.WinterFlowHookDataSource;
        Object[] objArr = this.WinterFlowRouterStructure;
        if (objArr.length < i) {
            WinterFlowThreadListener(i, objArr);
        }
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(winterFlowMicroserviceFunction.WinterFlowRouterStructure, this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, 0, winterFlowMicroserviceFunction.WinterFlowHookDataSource);
        this.WinterFlowHookDataSource += winterFlowMicroserviceFunction.WinterFlowHookDataSource;
    }

    public final boolean WinterFlowResponseEngine(Object obj) {
        int WinterFlowUnitTestResponse = WinterFlowUnitTestResponse(obj);
        if (WinterFlowUnitTestResponse < 0) {
            return false;
        }
        WinterFlowTransactionAgent(WinterFlowUnitTestResponse);
        return true;
    }

    public final boolean WinterFlowRouterRouter() {
        return this.WinterFlowHookDataSource == 0;
    }

    public final void WinterFlowRouterStructure(Object obj) {
        int i = this.WinterFlowHookDataSource + 1;
        Object[] objArr = this.WinterFlowRouterStructure;
        if (objArr.length < i) {
            WinterFlowThreadListener(i, objArr);
        }
        Object[] objArr2 = this.WinterFlowRouterStructure;
        int i2 = this.WinterFlowHookDataSource;
        objArr2[i2] = obj;
        this.WinterFlowHookDataSource = i2 + 1;
    }

    public final void WinterFlowServerProtocol(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.WinterFlowHookDataSource) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.WinterFlowHookDataSource);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.WinterFlowRouterStructure;
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i, i2, i3);
            }
            int i4 = this.WinterFlowHookDataSource;
            int i5 = i4 - (i2 - i);
            WinterFlowProtocolPipeline.WinterFlowProxyStructure(this.WinterFlowRouterStructure, i5, i4);
            this.WinterFlowHookDataSource = i5;
        }
    }

    public final Object WinterFlowServiceUtility(int i, Object obj) {
        if (i < 0 || i >= this.WinterFlowHookDataSource) {
            WinterFlowBandwidthObject(i);
            throw null;
        }
        Object[] objArr = this.WinterFlowRouterStructure;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final boolean WinterFlowSyntax() {
        return this.WinterFlowHookDataSource != 0;
    }

    public final void WinterFlowThreadListener(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr2, 0, 0, length);
        this.WinterFlowRouterStructure = objArr2;
    }

    public final Object WinterFlowTransactionAgent(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.WinterFlowHookDataSource)) {
            WinterFlowBandwidthObject(i);
            throw null;
        }
        Object[] objArr = this.WinterFlowRouterStructure;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.WinterFlowHookDataSource - 1;
        this.WinterFlowHookDataSource = i3;
        objArr[i3] = null;
        return obj;
    }

    public final Object WinterFlowTransactionManagerStrategy(int i) {
        if (i >= 0 && i < this.WinterFlowHookDataSource) {
            return this.WinterFlowRouterStructure[i];
        }
        WinterFlowBandwidthObject(i);
        throw null;
    }

    public final int WinterFlowUnitTestResponse(Object obj) {
        Object[] objArr = this.WinterFlowRouterStructure;
        int i = 0;
        if (obj == null) {
            int i2 = this.WinterFlowHookDataSource;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.WinterFlowHookDataSource;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final Object WinterFlowVariableVersionControl() {
        if (!WinterFlowRouterRouter()) {
            return this.WinterFlowRouterStructure[0];
        }
        WinterFlowCompilerMechanism.WinterFlowSyntax("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowMicroserviceFunction) {
            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = (WinterFlowMicroserviceFunction) obj;
            int i = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
            int i2 = this.WinterFlowHookDataSource;
            if (i == i2) {
                Object[] objArr = this.WinterFlowRouterStructure;
                Object[] objArr2 = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                WinterFlowCacheManagerListener WinterFlowArrayHelper = WinterFlowDecoratorUI.WinterFlowArrayHelper(0, i2);
                int i3 = WinterFlowArrayHelper.WinterFlowVariableVersionControl;
                int i4 = WinterFlowArrayHelper.WinterFlowTransactionManagerStrategy;
                if (i3 > i4) {
                    return true;
                }
                while (WinterFlowManagerRequest.WinterFlowThreadListener(objArr[i3], objArr2[i3])) {
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
        Object[] objArr = this.WinterFlowRouterStructure;
        int i = this.WinterFlowHookDataSource;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.WinterFlowRouterStructure;
        int i = this.WinterFlowHookDataSource;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ WinterFlowMicroserviceFunction() {
        this(16);
    }
}
