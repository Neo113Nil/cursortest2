package defpackage;

/* loaded from: classes.dex */
public final class hh0 extends java.util.LinkedHashMap {
    public static final defpackage.hh0 xiZrDbcSW0;
    public boolean adDC3e2L = true;

    static {
        defpackage.hh0 hh0Var = new defpackage.hh0();
        xiZrDbcSW0 = hh0Var;
        hh0Var.adDC3e2L = false;
    }

    public final void IHQe1A4L2xu() {
        if (!this.adDC3e2L) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        IHQe1A4L2xu();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (java.util.Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            java.lang.Object value = entry.getValue();
            java.lang.Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (java.util.Map.Entry entry : entrySet()) {
            java.lang.Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                int length = bArr.length;
                java.nio.charset.Charset charset = defpackage.q70.IHQe1A4L2xu;
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
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length2 = bArr2.length;
                java.nio.charset.Charset charset2 = defpackage.q70.IHQe1A4L2xu;
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

    public final defpackage.hh0 oh6vYeIP() {
        if (isEmpty()) {
            return new defpackage.hh0();
        }
        defpackage.hh0 hh0Var = new defpackage.hh0(this);
        hh0Var.adDC3e2L = true;
        return hh0Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        IHQe1A4L2xu();
        java.nio.charset.Charset charset = defpackage.q70.IHQe1A4L2xu;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        IHQe1A4L2xu();
        for (java.lang.Object obj : map.keySet()) {
            java.nio.charset.Charset charset = defpackage.q70.IHQe1A4L2xu;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        IHQe1A4L2xu();
        return super.remove(obj);
    }
}
