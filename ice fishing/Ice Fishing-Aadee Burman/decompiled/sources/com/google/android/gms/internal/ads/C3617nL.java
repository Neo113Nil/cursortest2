package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.nL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3617nL extends LinkedHashMap {

    /* renamed from: u, reason: collision with root package name */
    public static final C3617nL f32721u;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32722n = true;

    static {
        C3617nL c3617nL = new C3617nL();
        f32721u = c3617nL;
        c3617nL.f32722n = false;
    }

    public static int i(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof XK) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC3080dL.f29746a;
        int length = bArr.length;
        int b9 = AbstractC3080dL.b(length, 0, length, bArr);
        if (b9 == 0) {
            return 1;
        }
        return b9;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
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

    public final C3617nL h() {
        if (isEmpty()) {
            return new C3617nL();
        }
        C3617nL c3617nL = new C3617nL(this);
        c3617nL.f32722n = true;
        return c3617nL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += i(entry.getValue()) ^ i(entry.getKey());
        }
        return i;
    }

    public final void j() {
        if (!this.f32722n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        j();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        j();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        j();
        return super.remove(obj);
    }
}
