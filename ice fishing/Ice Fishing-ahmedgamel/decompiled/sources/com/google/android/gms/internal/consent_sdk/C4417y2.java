package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.consent_sdk.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4417y2 extends LinkedHashMap {

    /* renamed from: u, reason: collision with root package name */
    public static final C4417y2 f36565u;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36566n = true;

    static {
        C4417y2 c4417y2 = new C4417y2();
        f36565u = c4417y2;
        c4417y2.f36566n = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
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

    public final void h() {
        if (!this.f36566n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC4393s2.f36513a;
                hashCode = bArr.length;
                for (byte b9 : bArr) {
                    hashCode = (hashCode * 31) + b9;
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
                Charset charset2 = AbstractC4393s2.f36513a;
                hashCode2 = bArr2.length;
                for (byte b10 : bArr2) {
                    hashCode2 = (hashCode2 * 31) + b10;
                }
                if (hashCode2 == 0) {
                    hashCode2 = 1;
                }
            } else {
                hashCode2 = value.hashCode();
            }
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        h();
        Charset charset = AbstractC4393s2.f36513a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        h();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC4393s2.f36513a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        return super.remove(obj);
    }
}
