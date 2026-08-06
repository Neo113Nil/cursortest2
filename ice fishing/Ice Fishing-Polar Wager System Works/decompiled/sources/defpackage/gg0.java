package defpackage;

/* loaded from: classes.dex */
public class gg0 {
    public int F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public int adDC3e2L;
    public final defpackage.u50 oh6vYeIP;
    public final defpackage.ky r1MBDhnF;
    public int xiZrDbcSW0;

    public gg0(int i) {
        this.IHQe1A4L2xu = i;
        if (i <= 0) {
            defpackage.db.fnWB2E7cs("maxSize <= 0");
            throw null;
        }
        this.oh6vYeIP = new defpackage.u50(1);
        this.r1MBDhnF = new defpackage.ky(7);
    }

    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object put;
        obj.getClass();
        synchronized (this.r1MBDhnF) {
            this.F7NU4MC0GW++;
            defpackage.u50 u50Var = this.oh6vYeIP;
            u50Var.getClass();
            put = u50Var.IHQe1A4L2xu.put(obj, obj2);
            if (put != null) {
                this.F7NU4MC0GW--;
            }
        }
        if (put != null) {
            oh6vYeIP(obj, put, obj2);
        }
        adDC3e2L(this.IHQe1A4L2xu);
        return put;
    }

    public java.lang.Object IHQe1A4L2xu(java.lang.Object obj) {
        obj.getClass();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:16:0x0019, B:18:0x001d, B:20:0x0028, B:22:0x003a, B:25:0x0059, B:27:0x005f, B:33:0x0044, B:34:0x004a, B:37:0x0055, B:12:0x0085, B:13:0x008c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void adDC3e2L(int i) {
        java.lang.Object next;
        java.util.Map.Entry entry;
        java.lang.Object key;
        java.lang.Object value;
        while (true) {
            synchronized (this.r1MBDhnF) {
                try {
                    if (this.F7NU4MC0GW < 0 || (this.oh6vYeIP.IHQe1A4L2xu.isEmpty() && this.F7NU4MC0GW != 0)) {
                        break;
                    }
                    if (this.F7NU4MC0GW <= i || this.oh6vYeIP.IHQe1A4L2xu.isEmpty()) {
                        break;
                    }
                    java.util.Set entrySet = this.oh6vYeIP.IHQe1A4L2xu.entrySet();
                    entrySet.getClass();
                    java.util.Set set = entrySet;
                    if (set instanceof java.util.List) {
                        java.util.List list = (java.util.List) set;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                            entry = (java.util.Map.Entry) next;
                            if (entry != null) {
                                return;
                            }
                            key = entry.getKey();
                            value = entry.getValue();
                            defpackage.u50 u50Var = this.oh6vYeIP;
                            u50Var.getClass();
                            key.getClass();
                            u50Var.IHQe1A4L2xu.remove(key);
                            int i2 = this.F7NU4MC0GW;
                            value.getClass();
                            this.F7NU4MC0GW = i2 - 1;
                        }
                        next = null;
                        entry = (java.util.Map.Entry) next;
                        if (entry != null) {
                        }
                    } else {
                        java.util.Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            entry = (java.util.Map.Entry) next;
                            if (entry != null) {
                            }
                        } else {
                            next = null;
                            entry = (java.util.Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            oh6vYeIP(key, value, null);
        }
    }

    public void oh6vYeIP(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        obj.getClass();
    }

    public final java.lang.Object r1MBDhnF(java.lang.Object obj) {
        java.lang.Object put;
        obj.getClass();
        synchronized (this.r1MBDhnF) {
            defpackage.u50 u50Var = this.oh6vYeIP;
            u50Var.getClass();
            java.lang.Object obj2 = u50Var.IHQe1A4L2xu.get(obj);
            if (obj2 != null) {
                this.adDC3e2L++;
                return obj2;
            }
            this.xiZrDbcSW0++;
            java.lang.Object IHQe1A4L2xu = IHQe1A4L2xu(obj);
            if (IHQe1A4L2xu == null) {
                return null;
            }
            synchronized (this.r1MBDhnF) {
                try {
                    defpackage.u50 u50Var2 = this.oh6vYeIP;
                    u50Var2.getClass();
                    put = u50Var2.IHQe1A4L2xu.put(obj, IHQe1A4L2xu);
                    if (put != null) {
                        defpackage.u50 u50Var3 = this.oh6vYeIP;
                        u50Var3.getClass();
                        u50Var3.IHQe1A4L2xu.put(obj, put);
                    } else {
                        this.F7NU4MC0GW++;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                oh6vYeIP(obj, IHQe1A4L2xu, put);
                return put;
            }
            adDC3e2L(this.IHQe1A4L2xu);
            return IHQe1A4L2xu;
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        synchronized (this.r1MBDhnF) {
            try {
                int i = this.adDC3e2L;
                int i2 = this.xiZrDbcSW0 + i;
                str = "LruCache[maxSize=" + this.IHQe1A4L2xu + ",hits=" + this.adDC3e2L + ",misses=" + this.xiZrDbcSW0 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
