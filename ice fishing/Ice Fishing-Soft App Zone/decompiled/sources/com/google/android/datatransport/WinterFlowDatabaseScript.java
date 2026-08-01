package com.google.android.datatransport;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseScript implements Map, Serializable, WinterFlowNetworkMiddleware {
    public static final WinterFlowDatabaseScript WinterFlowSingletonPlatform;
    public WinterFlowDatabaseSessionManager WinterFlowBandwidthObject;
    public boolean WinterFlowConcurrencyThread;
    public WinterFlowSingletonOrchestration WinterFlowOrchestrationSubsystem;
    public int WinterFlowResponseEngine;
    public int[] WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public WinterFlowSingletonOrchestration WinterFlowServiceUtility;
    public int WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;
    public Object[] WinterFlowTransactionManagerStrategy;
    public int[] WinterFlowUnitTestResponse;
    public Object[] WinterFlowVariableVersionControl;

    static {
        WinterFlowDatabaseScript winterFlowDatabaseScript = new WinterFlowDatabaseScript(0);
        winterFlowDatabaseScript.WinterFlowConcurrencyThread = true;
        WinterFlowSingletonPlatform = winterFlowDatabaseScript;
    }

    public WinterFlowDatabaseScript(int i) {
        if (i < 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.WinterFlowVariableVersionControl = objArr;
        this.WinterFlowTransactionManagerStrategy = null;
        this.WinterFlowUnitTestResponse = iArr;
        this.WinterFlowRouterRouter = new int[highestOneBit];
        this.WinterFlowSyntax = 2;
        this.WinterFlowResponseEngine = 0;
        this.WinterFlowTransactionAgent = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final void WinterFlowArrayNetwork(boolean z) {
        int i;
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.WinterFlowResponseEngine;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.WinterFlowUnitTestResponse;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.WinterFlowVariableVersionControl;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.WinterFlowRouterRouter[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        WinterFlowHandlerWebsocket.WinterFlowSoftwareEngine(this.WinterFlowVariableVersionControl, i3, i);
        if (objArr != null) {
            WinterFlowHandlerWebsocket.WinterFlowSoftwareEngine(objArr, i3, this.WinterFlowResponseEngine);
        }
        this.WinterFlowResponseEngine = i3;
    }

    public final void WinterFlowCacheManagerAgent() {
        if (this.WinterFlowConcurrencyThread) {
            throw new UnsupportedOperationException();
        }
    }

    public final WinterFlowDatabaseScript WinterFlowHookDataSource() {
        WinterFlowCacheManagerAgent();
        this.WinterFlowConcurrencyThread = true;
        if (this.WinterFlowThreadListener > 0) {
            return this;
        }
        WinterFlowDatabaseScript winterFlowDatabaseScript = WinterFlowSingletonPlatform;
        winterFlowDatabaseScript.getClass();
        return winterFlowDatabaseScript;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.WinterFlowUnitTestResponse[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowResponseEngine(int i) {
        this.WinterFlowServerProtocol++;
        int i2 = 0;
        if (this.WinterFlowResponseEngine > this.WinterFlowThreadListener) {
            WinterFlowArrayNetwork(false);
        }
        this.WinterFlowRouterRouter = new int[i];
        this.WinterFlowTransactionAgent = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.WinterFlowResponseEngine) {
            int i3 = i2 + 1;
            int WinterFlowSyntax = WinterFlowSyntax(this.WinterFlowVariableVersionControl[i2]);
            int i4 = this.WinterFlowSyntax;
            while (true) {
                int[] iArr = this.WinterFlowRouterRouter;
                if (iArr[WinterFlowSyntax] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                WinterFlowSyntax = WinterFlowSyntax == 0 ? iArr.length - 1 : WinterFlowSyntax - 1;
            }
        }
    }

    public final int WinterFlowRouterRouter(Object obj) {
        int i = this.WinterFlowResponseEngine;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.WinterFlowUnitTestResponse[i] >= 0) {
                Object[] objArr = this.WinterFlowTransactionManagerStrategy;
                objArr.getClass();
                if (WinterFlowManagerRequest.WinterFlowThreadListener(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int WinterFlowRouterStructure(Object obj) {
        WinterFlowCacheManagerAgent();
        while (true) {
            int WinterFlowSyntax = WinterFlowSyntax(obj);
            int i = this.WinterFlowSyntax * 2;
            int length = this.WinterFlowRouterRouter.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.WinterFlowRouterRouter;
                int i3 = iArr[WinterFlowSyntax];
                if (i3 == 0) {
                    int i4 = this.WinterFlowResponseEngine;
                    Object[] objArr = this.WinterFlowVariableVersionControl;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.WinterFlowResponseEngine = i5;
                        objArr[i4] = obj;
                        this.WinterFlowUnitTestResponse[i4] = WinterFlowSyntax;
                        iArr[WinterFlowSyntax] = i5;
                        this.WinterFlowThreadListener++;
                        this.WinterFlowServerProtocol++;
                        if (i2 > this.WinterFlowSyntax) {
                            this.WinterFlowSyntax = i2;
                        }
                        return i4;
                    }
                    WinterFlowTransactionManagerStrategy(1);
                } else {
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        WinterFlowResponseEngine(this.WinterFlowRouterRouter.length * 2);
                        break;
                    }
                    WinterFlowSyntax = WinterFlowSyntax == 0 ? this.WinterFlowRouterRouter.length - 1 : WinterFlowSyntax - 1;
                }
            }
        }
    }

    public final int WinterFlowSyntax(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.WinterFlowTransactionAgent;
    }

    public final void WinterFlowTransactionAgent(int i) {
        int i2;
        int i3;
        int WinterFlowSyntax;
        int[] iArr;
        Object[] objArr = this.WinterFlowVariableVersionControl;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.WinterFlowUnitTestResponse[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? this.WinterFlowRouterRouter.length - 1 : i4 - 1;
                int[] iArr2 = this.WinterFlowRouterRouter;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.WinterFlowSyntax) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    WinterFlowSyntax = WinterFlowSyntax(this.WinterFlowVariableVersionControl[i3]) - i4;
                    iArr = this.WinterFlowRouterRouter;
                }
            } while ((WinterFlowSyntax & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.WinterFlowUnitTestResponse[i3] = i5;
        }
        this.WinterFlowUnitTestResponse[i] = -1;
        this.WinterFlowThreadListener--;
        this.WinterFlowServerProtocol++;
    }

    public final void WinterFlowTransactionManagerStrategy(int i) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int length = objArr.length;
        int i2 = this.WinterFlowResponseEngine;
        int i3 = length - i2;
        int i4 = i2 - this.WinterFlowThreadListener;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            WinterFlowArrayNetwork(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.WinterFlowVariableVersionControl = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
            this.WinterFlowTransactionManagerStrategy = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.WinterFlowUnitTestResponse = Arrays.copyOf(this.WinterFlowUnitTestResponse, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.WinterFlowRouterRouter.length) {
                WinterFlowResponseEngine(highestOneBit);
            }
        }
    }

    public final int WinterFlowUnitTestResponse(Object obj) {
        int WinterFlowSyntax = WinterFlowSyntax(obj);
        int i = this.WinterFlowSyntax;
        while (true) {
            int i2 = this.WinterFlowRouterRouter[WinterFlowSyntax];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            WinterFlowSyntax = WinterFlowSyntax == 0 ? this.WinterFlowRouterRouter.length - 1 : WinterFlowSyntax - 1;
        }
    }

    public final boolean WinterFlowVariableVersionControl(Collection collection) {
        boolean WinterFlowThreadListener;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int WinterFlowUnitTestResponse = WinterFlowUnitTestResponse(entry.getKey());
                    if (WinterFlowUnitTestResponse < 0) {
                        WinterFlowThreadListener = false;
                    } else {
                        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
                        objArr.getClass();
                        WinterFlowThreadListener = WinterFlowManagerRequest.WinterFlowThreadListener(objArr[WinterFlowUnitTestResponse], entry.getValue());
                    }
                    if (!WinterFlowThreadListener) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final void clear() {
        WinterFlowCacheManagerAgent();
        int i = this.WinterFlowResponseEngine - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.WinterFlowUnitTestResponse;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.WinterFlowRouterRouter[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        WinterFlowHandlerWebsocket.WinterFlowSoftwareEngine(this.WinterFlowVariableVersionControl, 0, this.WinterFlowResponseEngine);
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        if (objArr != null) {
            WinterFlowHandlerWebsocket.WinterFlowSoftwareEngine(objArr, 0, this.WinterFlowResponseEngine);
        }
        this.WinterFlowThreadListener = 0;
        this.WinterFlowResponseEngine = 0;
        this.WinterFlowServerProtocol++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return WinterFlowUnitTestResponse(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return WinterFlowRouterRouter(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        WinterFlowSingletonOrchestration winterFlowSingletonOrchestration = this.WinterFlowOrchestrationSubsystem;
        if (winterFlowSingletonOrchestration != null) {
            return winterFlowSingletonOrchestration;
        }
        WinterFlowSingletonOrchestration winterFlowSingletonOrchestration2 = new WinterFlowSingletonOrchestration(this, 0);
        this.WinterFlowOrchestrationSubsystem = winterFlowSingletonOrchestration2;
        return winterFlowSingletonOrchestration2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.WinterFlowThreadListener == map.size() && WinterFlowVariableVersionControl(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int WinterFlowUnitTestResponse = WinterFlowUnitTestResponse(obj);
        if (WinterFlowUnitTestResponse < 0) {
            return null;
        }
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        objArr.getClass();
        return objArr[WinterFlowUnitTestResponse];
    }

    @Override // java.util.Map
    public final int hashCode() {
        WinterFlowFrameworkNode winterFlowFrameworkNode = new WinterFlowFrameworkNode(this, 0);
        int i = 0;
        while (winterFlowFrameworkNode.hasNext()) {
            int i2 = winterFlowFrameworkNode.WinterFlowVariableVersionControl;
            WinterFlowDatabaseScript winterFlowDatabaseScript = (WinterFlowDatabaseScript) winterFlowFrameworkNode.WinterFlowRouterRouter;
            if (i2 >= winterFlowDatabaseScript.WinterFlowResponseEngine) {
                WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                return 0;
            }
            winterFlowFrameworkNode.WinterFlowVariableVersionControl = i2 + 1;
            winterFlowFrameworkNode.WinterFlowTransactionManagerStrategy = i2;
            Object obj = winterFlowDatabaseScript.WinterFlowVariableVersionControl[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = winterFlowDatabaseScript.WinterFlowTransactionManagerStrategy;
            objArr.getClass();
            Object obj2 = objArr[winterFlowFrameworkNode.WinterFlowTransactionManagerStrategy];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            winterFlowFrameworkNode.WinterFlowCacheManagerAgent();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.WinterFlowThreadListener == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        WinterFlowSingletonOrchestration winterFlowSingletonOrchestration = this.WinterFlowServiceUtility;
        if (winterFlowSingletonOrchestration != null) {
            return winterFlowSingletonOrchestration;
        }
        WinterFlowSingletonOrchestration winterFlowSingletonOrchestration2 = new WinterFlowSingletonOrchestration(this, 1);
        this.WinterFlowServiceUtility = winterFlowSingletonOrchestration2;
        return winterFlowSingletonOrchestration2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        WinterFlowCacheManagerAgent();
        int WinterFlowRouterStructure = WinterFlowRouterStructure(obj);
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        if (objArr == null) {
            int length = this.WinterFlowVariableVersionControl.length;
            if (length < 0) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.WinterFlowTransactionManagerStrategy = objArr;
        }
        if (WinterFlowRouterStructure >= 0) {
            objArr[WinterFlowRouterStructure] = obj2;
            return null;
        }
        int i = (-WinterFlowRouterStructure) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        WinterFlowCacheManagerAgent();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        WinterFlowTransactionManagerStrategy(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int WinterFlowRouterStructure = WinterFlowRouterStructure(entry.getKey());
            Object[] objArr = this.WinterFlowTransactionManagerStrategy;
            if (objArr == null) {
                int length = this.WinterFlowVariableVersionControl.length;
                if (length < 0) {
                    WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.WinterFlowTransactionManagerStrategy = objArr;
                }
            }
            if (WinterFlowRouterStructure >= 0) {
                objArr[WinterFlowRouterStructure] = entry.getValue();
            } else {
                int i = (-WinterFlowRouterStructure) - 1;
                if (!WinterFlowManagerRequest.WinterFlowThreadListener(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        WinterFlowCacheManagerAgent();
        int WinterFlowUnitTestResponse = WinterFlowUnitTestResponse(obj);
        if (WinterFlowUnitTestResponse < 0) {
            return null;
        }
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        objArr.getClass();
        Object obj2 = objArr[WinterFlowUnitTestResponse];
        WinterFlowTransactionAgent(WinterFlowUnitTestResponse);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.WinterFlowThreadListener;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.WinterFlowThreadListener * 3) + 2);
        sb.append("{");
        int i = 0;
        WinterFlowFrameworkNode winterFlowFrameworkNode = new WinterFlowFrameworkNode(this, 0);
        while (winterFlowFrameworkNode.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = winterFlowFrameworkNode.WinterFlowVariableVersionControl;
            WinterFlowDatabaseScript winterFlowDatabaseScript = (WinterFlowDatabaseScript) winterFlowFrameworkNode.WinterFlowRouterRouter;
            if (i2 >= winterFlowDatabaseScript.WinterFlowResponseEngine) {
                WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                return null;
            }
            winterFlowFrameworkNode.WinterFlowVariableVersionControl = i2 + 1;
            winterFlowFrameworkNode.WinterFlowTransactionManagerStrategy = i2;
            Object obj = winterFlowDatabaseScript.WinterFlowVariableVersionControl[i2];
            if (obj == winterFlowDatabaseScript) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = winterFlowDatabaseScript.WinterFlowTransactionManagerStrategy;
            objArr.getClass();
            Object obj2 = objArr[winterFlowFrameworkNode.WinterFlowTransactionManagerStrategy];
            if (obj2 == winterFlowDatabaseScript) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            winterFlowFrameworkNode.WinterFlowCacheManagerAgent();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        WinterFlowDatabaseSessionManager winterFlowDatabaseSessionManager = this.WinterFlowBandwidthObject;
        if (winterFlowDatabaseSessionManager != null) {
            return winterFlowDatabaseSessionManager;
        }
        WinterFlowDatabaseSessionManager winterFlowDatabaseSessionManager2 = new WinterFlowDatabaseSessionManager(0, this);
        this.WinterFlowBandwidthObject = winterFlowDatabaseSessionManager2;
        return winterFlowDatabaseSessionManager2;
    }

    public WinterFlowDatabaseScript() {
        this(8);
    }
}
