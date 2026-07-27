package kotlin.text;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishMockkAppCompat extends LinkedHashMap {
    public static final CatchingFishMockkAppCompat CatchingFishDaggerWebsocket;
    public boolean CatchingFishReduxKtor = true;

    static {
        CatchingFishMockkAppCompat catchingFishMockkAppCompat = new CatchingFishMockkAppCompat();
        CatchingFishDaggerWebsocket = catchingFishMockkAppCompat;
        catchingFishMockkAppCompat.CatchingFishReduxKtor = false;
    }

    public final void CatchingFishParcelableFAB() {
        if (!this.CatchingFishReduxKtor) {
            throw new UnsupportedOperationException();
        }
    }

    public final CatchingFishMockkAppCompat CatchingFishSnackbar() {
        if (isEmpty()) {
            return new CatchingFishMockkAppCompat();
        }
        CatchingFishMockkAppCompat catchingFishMockkAppCompat = new CatchingFishMockkAppCompat(this);
        catchingFishMockkAppCompat.CatchingFishReduxKtor = true;
        return catchingFishMockkAppCompat;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        CatchingFishParcelableFAB();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return false;
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
                Charset charset = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
                hashCode = bArr.length;
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
                Charset charset2 = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
                int length = bArr2.length;
                for (byte b2 : bArr2) {
                    length = (length * 31) + b2;
                }
                if (length != 0) {
                    i2 = length;
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
        CatchingFishParcelableFAB();
        Charset charset = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        CatchingFishParcelableFAB();
        for (Object obj : map.keySet()) {
            Charset charset = CatchingFishFirebaseBundle.CatchingFishParcelableFAB;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        CatchingFishParcelableFAB();
        return super.remove(obj);
    }
}
