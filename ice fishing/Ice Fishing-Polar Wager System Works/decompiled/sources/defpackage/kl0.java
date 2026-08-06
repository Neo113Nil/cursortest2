package defpackage;

/* loaded from: classes.dex */
public final class kl0 {
    public final java.util.LinkedHashMap IHQe1A4L2xu;
    public final defpackage.c1NqjJifC7 oh6vYeIP;

    public kl0(java.util.LinkedHashMap linkedHashMap, boolean z) {
        this.IHQe1A4L2xu = linkedHashMap;
        this.oh6vYeIP = new defpackage.c1NqjJifC7(z);
    }

    public final void F7NU4MC0GW(defpackage.ww0 ww0Var, java.lang.Object obj) {
        ww0Var.getClass();
        oh6vYeIP();
        java.util.LinkedHashMap linkedHashMap = this.IHQe1A4L2xu;
        if (obj == null) {
            oh6vYeIP();
            linkedHashMap.remove(ww0Var);
        } else if (obj instanceof java.util.Set) {
            java.util.Set unmodifiableSet = java.util.Collections.unmodifiableSet(defpackage.td.FisHbM7NmV((java.util.Set) obj));
            unmodifiableSet.getClass();
            linkedHashMap.put(ww0Var, unmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(ww0Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(ww0Var, java.util.Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final java.util.Map IHQe1A4L2xu() {
        defpackage.et0 et0Var;
        java.util.Set<java.util.Map.Entry> entrySet = this.IHQe1A4L2xu.entrySet();
        int yIx6ChFVk = defpackage.yh0.yIx6ChFVk(defpackage.ud.EoOhNTTfIN7K(entrySet, 10));
        if (yIx6ChFVk < 16) {
            yIx6ChFVk = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(yIx6ChFVk);
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                et0Var = new defpackage.et0(entry.getKey(), java.util.Arrays.copyOf(bArr, bArr.length));
            } else {
                et0Var = new defpackage.et0(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(et0Var.adDC3e2L, et0Var.xiZrDbcSW0);
        }
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002a->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        boolean z;
        if (obj instanceof defpackage.kl0) {
            java.util.LinkedHashMap linkedHashMap = ((defpackage.kl0) obj).IHQe1A4L2xu;
            java.util.LinkedHashMap linkedHashMap2 = this.IHQe1A4L2xu;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                            java.lang.Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                java.lang.Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    z = defpackage.x70.QoRHpC4k(value, obj2);
                                } else if ((obj2 instanceof byte[]) && java.util.Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    z = true;
                                }
                                if (z) {
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        java.util.Iterator it = this.IHQe1A4L2xu.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            i += value instanceof byte[] ? java.util.Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final void oh6vYeIP() {
        if (((java.util.concurrent.atomic.AtomicBoolean) this.oh6vYeIP.xiZrDbcSW0).get()) {
            defpackage.db.AARZUJiTa("Do mutate preferences once returned to DataStore.");
        }
    }

    public final java.lang.Object r1MBDhnF(defpackage.ww0 ww0Var) {
        ww0Var.getClass();
        java.lang.Object obj = this.IHQe1A4L2xu.get(ww0Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    public final java.lang.String toString() {
        return defpackage.td.cSNyPqwud(this.IHQe1A4L2xu.entrySet(), ",\n", "{\n", "\n}", defpackage.q0.C0U8sNJm, 24);
    }

    public /* synthetic */ kl0(boolean z) {
        this(new java.util.LinkedHashMap(), z);
    }
}
