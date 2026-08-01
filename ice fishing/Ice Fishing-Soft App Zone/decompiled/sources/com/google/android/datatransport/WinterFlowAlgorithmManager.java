package com.google.android.datatransport;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAlgorithmManager extends LinkedHashMap {
    public static final WinterFlowAlgorithmManager WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowVariableVersionControl = true;

    static {
        WinterFlowAlgorithmManager winterFlowAlgorithmManager = new WinterFlowAlgorithmManager();
        WinterFlowTransactionManagerStrategy = winterFlowAlgorithmManager;
        winterFlowAlgorithmManager.WinterFlowVariableVersionControl = false;
    }

    public final WinterFlowAlgorithmManager WinterFlowHookDataSource() {
        if (isEmpty()) {
            return new WinterFlowAlgorithmManager();
        }
        WinterFlowAlgorithmManager winterFlowAlgorithmManager = new WinterFlowAlgorithmManager(this);
        winterFlowAlgorithmManager.WinterFlowVariableVersionControl = true;
        return winterFlowAlgorithmManager;
    }

    public final void WinterFlowRouterStructure() {
        if (!this.WinterFlowVariableVersionControl) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        WinterFlowRouterStructure();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                int length = bArr.length;
                Charset charset = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
                hashCode = length;
                for (byte b : bArr) {
                    hashCode = (hashCode * 31) + b;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length2 = bArr2.length;
                Charset charset2 = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
                int i3 = length2;
                for (byte b2 : bArr2) {
                    i3 = (i3 * 31) + b2;
                }
                if (i3 != 0) {
                    i2 = i3;
                }
            } else {
                i2 = value.hashCode();
            }
            i += hashCode ^ i2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        WinterFlowRouterStructure();
        Charset charset = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        WinterFlowRouterStructure();
        for (Object obj : map.keySet()) {
            Charset charset = WinterFlowMapperConcurrency.WinterFlowRouterStructure;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        WinterFlowRouterStructure();
        return super.remove(obj);
    }
}
