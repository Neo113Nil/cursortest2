package com.google.android.datatransport;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowParserRequest {
    public Object[] WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public int[] WinterFlowVariableVersionControl;

    public WinterFlowParserRequest(int i) {
        this.WinterFlowVariableVersionControl = i == 0 ? WinterFlowHandlerWebsocket.WinterFlowVariableVersionControl : new int[i];
        this.WinterFlowTransactionManagerStrategy = i == 0 ? WinterFlowHandlerWebsocket.WinterFlowUnitTestResponse : new Object[i << 1];
    }

    public final int WinterFlowArrayNetwork() {
        int i = this.WinterFlowUnitTestResponse;
        if (i == 0) {
            return -1;
        }
        int WinterFlowSyntax = WinterFlowHandlerWebsocket.WinterFlowSyntax(this.WinterFlowVariableVersionControl, i, 0);
        if (WinterFlowSyntax < 0 || this.WinterFlowTransactionManagerStrategy[WinterFlowSyntax << 1] == null) {
            return WinterFlowSyntax;
        }
        int i2 = WinterFlowSyntax + 1;
        while (i2 < i && this.WinterFlowVariableVersionControl[i2] == 0) {
            if (this.WinterFlowTransactionManagerStrategy[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = WinterFlowSyntax - 1; i3 >= 0 && this.WinterFlowVariableVersionControl[i3] == 0; i3--) {
            if (this.WinterFlowTransactionManagerStrategy[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int WinterFlowCacheManagerAgent(Object obj) {
        return obj == null ? WinterFlowArrayNetwork() : WinterFlowHookDataSource(obj.hashCode(), obj);
    }

    public final int WinterFlowHookDataSource(int i, Object obj) {
        int i2 = this.WinterFlowUnitTestResponse;
        if (i2 == 0) {
            return -1;
        }
        int WinterFlowSyntax = WinterFlowHandlerWebsocket.WinterFlowSyntax(this.WinterFlowVariableVersionControl, i2, i);
        if (WinterFlowSyntax < 0 || WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowTransactionManagerStrategy[WinterFlowSyntax << 1])) {
            return WinterFlowSyntax;
        }
        int i3 = WinterFlowSyntax + 1;
        while (i3 < i2 && this.WinterFlowVariableVersionControl[i3] == i) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowTransactionManagerStrategy[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = WinterFlowSyntax - 1; i4 >= 0 && this.WinterFlowVariableVersionControl[i4] == i; i4--) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowTransactionManagerStrategy[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object WinterFlowRouterRouter(int i) {
        boolean z = false;
        if (i >= 0 && i < this.WinterFlowUnitTestResponse) {
            z = true;
        }
        if (z) {
            return this.WinterFlowTransactionManagerStrategy[(i << 1) + 1];
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final int WinterFlowRouterStructure(Object obj) {
        int i = this.WinterFlowUnitTestResponse * 2;
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object WinterFlowTransactionManagerStrategy(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.WinterFlowUnitTestResponse)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.WinterFlowVariableVersionControl;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.WinterFlowVariableVersionControl = Arrays.copyOf(iArr, i7);
            this.WinterFlowTransactionManagerStrategy = Arrays.copyOf(this.WinterFlowTransactionManagerStrategy, i7 << 1);
            if (i2 != this.WinterFlowUnitTestResponse) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, this.WinterFlowVariableVersionControl, 0, 0, i);
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, this.WinterFlowTransactionManagerStrategy, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, this.WinterFlowVariableVersionControl, i, i8, i2);
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, this.WinterFlowTransactionManagerStrategy, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.WinterFlowUnitTestResponse) {
            throw new ConcurrentModificationException();
        }
        this.WinterFlowUnitTestResponse = i4;
        return obj;
    }

    public final Object WinterFlowUnitTestResponse(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.WinterFlowUnitTestResponse) {
            z = true;
        }
        if (!z) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final Object WinterFlowVariableVersionControl(int i) {
        boolean z = false;
        if (i >= 0 && i < this.WinterFlowUnitTestResponse) {
            z = true;
        }
        if (z) {
            return this.WinterFlowTransactionManagerStrategy[i << 1];
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final void clear() {
        int i = this.WinterFlowUnitTestResponse;
        if (i > 0) {
            this.WinterFlowVariableVersionControl = WinterFlowHandlerWebsocket.WinterFlowVariableVersionControl;
            this.WinterFlowTransactionManagerStrategy = WinterFlowHandlerWebsocket.WinterFlowUnitTestResponse;
            i = 0;
            this.WinterFlowUnitTestResponse = 0;
        }
        if (i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return WinterFlowCacheManagerAgent(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return WinterFlowRouterStructure(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof WinterFlowParserRequest) {
                int i = this.WinterFlowUnitTestResponse;
                if (i != ((WinterFlowParserRequest) obj).WinterFlowUnitTestResponse) {
                    return false;
                }
                WinterFlowParserRequest winterFlowParserRequest = (WinterFlowParserRequest) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(i2);
                    Object WinterFlowRouterRouter = WinterFlowRouterRouter(i2);
                    Object obj2 = winterFlowParserRequest.get(WinterFlowVariableVersionControl);
                    if (WinterFlowRouterRouter == null) {
                        if (obj2 != null || !winterFlowParserRequest.containsKey(WinterFlowVariableVersionControl)) {
                            return false;
                        }
                    } else if (!WinterFlowRouterRouter.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.WinterFlowUnitTestResponse != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.WinterFlowUnitTestResponse;
            for (int i4 = 0; i4 < i3; i4++) {
                Object WinterFlowVariableVersionControl2 = WinterFlowVariableVersionControl(i4);
                Object WinterFlowRouterRouter2 = WinterFlowRouterRouter(i4);
                Object obj3 = ((Map) obj).get(WinterFlowVariableVersionControl2);
                if (WinterFlowRouterRouter2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(WinterFlowVariableVersionControl2)) {
                        return false;
                    }
                } else if (!WinterFlowRouterRouter2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(obj);
        if (WinterFlowCacheManagerAgent >= 0) {
            return this.WinterFlowTransactionManagerStrategy[(WinterFlowCacheManagerAgent << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(obj);
        return WinterFlowCacheManagerAgent >= 0 ? this.WinterFlowTransactionManagerStrategy[(WinterFlowCacheManagerAgent << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.WinterFlowVariableVersionControl;
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        int i = this.WinterFlowUnitTestResponse;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.WinterFlowUnitTestResponse <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.WinterFlowUnitTestResponse;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int WinterFlowHookDataSource = obj != null ? WinterFlowHookDataSource(hashCode, obj) : WinterFlowArrayNetwork();
        if (WinterFlowHookDataSource >= 0) {
            int i2 = (WinterFlowHookDataSource << 1) + 1;
            Object[] objArr = this.WinterFlowTransactionManagerStrategy;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~WinterFlowHookDataSource;
        int[] iArr = this.WinterFlowVariableVersionControl;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.WinterFlowVariableVersionControl = Arrays.copyOf(iArr, i4);
            this.WinterFlowTransactionManagerStrategy = Arrays.copyOf(this.WinterFlowTransactionManagerStrategy, i4 << 1);
            if (i != this.WinterFlowUnitTestResponse) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.WinterFlowVariableVersionControl;
            int i5 = i3 + 1;
            WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr2, i5 << 1, i3 << 1, this.WinterFlowUnitTestResponse << 1);
        }
        int i6 = this.WinterFlowUnitTestResponse;
        if (i == i6) {
            int[] iArr3 = this.WinterFlowVariableVersionControl;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.WinterFlowUnitTestResponse = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(obj);
        if (WinterFlowCacheManagerAgent < 0 || !WinterFlowManagerRequest.WinterFlowThreadListener(obj2, WinterFlowRouterRouter(WinterFlowCacheManagerAgent))) {
            return false;
        }
        WinterFlowTransactionManagerStrategy(WinterFlowCacheManagerAgent);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(obj);
        if (WinterFlowCacheManagerAgent < 0 || !WinterFlowManagerRequest.WinterFlowThreadListener(obj2, WinterFlowRouterRouter(WinterFlowCacheManagerAgent))) {
            return false;
        }
        WinterFlowUnitTestResponse(WinterFlowCacheManagerAgent, obj3);
        return true;
    }

    public final int size() {
        return this.WinterFlowUnitTestResponse;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.WinterFlowUnitTestResponse * 28);
        sb.append('{');
        int i = this.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(i2);
            if (WinterFlowVariableVersionControl != sb) {
                sb.append(WinterFlowVariableVersionControl);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object WinterFlowRouterRouter = WinterFlowRouterRouter(i2);
            if (WinterFlowRouterRouter != sb) {
                sb.append(WinterFlowRouterRouter);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(obj);
        if (WinterFlowCacheManagerAgent >= 0) {
            return WinterFlowTransactionManagerStrategy(WinterFlowCacheManagerAgent);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(obj);
        if (WinterFlowCacheManagerAgent >= 0) {
            return WinterFlowUnitTestResponse(WinterFlowCacheManagerAgent, obj2);
        }
        return null;
    }
}
