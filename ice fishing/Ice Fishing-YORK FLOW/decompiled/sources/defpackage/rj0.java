package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class rj0 {
    public int JhCgjQRTAOCT;
    public int WDYagTQQm9ns;
    public final int ZpBGe2uQfcn8;
    public final defpackage.hu fWTAfUmVKrZq;
    public final defpackage.y70 giKS3J6vZuNy;
    public int oh71FJcDz6S2;

    public rj0(int i) {
        this.ZpBGe2uQfcn8 = i;
        if (i <= 0) {
            defpackage.h7.w7APNrr0aGRc("maxSize <= 0");
            throw null;
        }
        this.giKS3J6vZuNy = new defpackage.y70(1);
        this.fWTAfUmVKrZq = new defpackage.hu(16);
    }

    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object put;
        obj.getClass();
        synchronized (this.fWTAfUmVKrZq) {
            this.JhCgjQRTAOCT++;
            defpackage.y70 y70Var = this.giKS3J6vZuNy;
            y70Var.getClass();
            put = y70Var.ZpBGe2uQfcn8.put(obj, obj2);
            if (put != null) {
                this.JhCgjQRTAOCT--;
            }
        }
        if (put != null) {
            giKS3J6vZuNy(obj, put, obj2);
        }
        oh71FJcDz6S2(this.ZpBGe2uQfcn8);
        return put;
    }

    public final java.lang.Object WDYagTQQm9ns(java.lang.Object obj) {
        java.lang.Object remove;
        synchronized (this.fWTAfUmVKrZq) {
            defpackage.y70 y70Var = this.giKS3J6vZuNy;
            y70Var.getClass();
            remove = y70Var.ZpBGe2uQfcn8.remove(obj);
            if (remove != null) {
                this.JhCgjQRTAOCT--;
            }
        }
        if (remove != null) {
            giKS3J6vZuNy(obj, remove, null);
        }
        return remove;
    }

    public java.lang.Object ZpBGe2uQfcn8(java.lang.Object obj) {
        obj.getClass();
        return null;
    }

    public final java.lang.Object fWTAfUmVKrZq(java.lang.Object obj) {
        java.lang.Object put;
        obj.getClass();
        synchronized (this.fWTAfUmVKrZq) {
            defpackage.y70 y70Var = this.giKS3J6vZuNy;
            y70Var.getClass();
            java.lang.Object obj2 = y70Var.ZpBGe2uQfcn8.get(obj);
            if (obj2 != null) {
                this.WDYagTQQm9ns++;
                return obj2;
            }
            this.oh71FJcDz6S2++;
            java.lang.Object ZpBGe2uQfcn8 = ZpBGe2uQfcn8(obj);
            if (ZpBGe2uQfcn8 == null) {
                return null;
            }
            synchronized (this.fWTAfUmVKrZq) {
                try {
                    defpackage.y70 y70Var2 = this.giKS3J6vZuNy;
                    y70Var2.getClass();
                    put = y70Var2.ZpBGe2uQfcn8.put(obj, ZpBGe2uQfcn8);
                    if (put != null) {
                        defpackage.y70 y70Var3 = this.giKS3J6vZuNy;
                        y70Var3.getClass();
                        y70Var3.ZpBGe2uQfcn8.put(obj, put);
                    } else {
                        this.JhCgjQRTAOCT++;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                giKS3J6vZuNy(obj, ZpBGe2uQfcn8, put);
                return put;
            }
            oh71FJcDz6S2(this.ZpBGe2uQfcn8);
            return ZpBGe2uQfcn8;
        }
    }

    public void giKS3J6vZuNy(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        obj.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:16:0x0019, B:18:0x001d, B:20:0x0028, B:22:0x003a, B:25:0x0059, B:27:0x005f, B:33:0x0044, B:34:0x004a, B:37:0x0055, B:12:0x0085, B:13:0x008c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void oh71FJcDz6S2(int i) {
        java.lang.Object next;
        java.util.Map.Entry entry;
        java.lang.Object key;
        java.lang.Object value;
        while (true) {
            synchronized (this.fWTAfUmVKrZq) {
                try {
                    if (this.JhCgjQRTAOCT < 0 || (this.giKS3J6vZuNy.ZpBGe2uQfcn8.isEmpty() && this.JhCgjQRTAOCT != 0)) {
                        break;
                    }
                    if (this.JhCgjQRTAOCT <= i || this.giKS3J6vZuNy.ZpBGe2uQfcn8.isEmpty()) {
                        break;
                    }
                    java.util.Set entrySet = this.giKS3J6vZuNy.ZpBGe2uQfcn8.entrySet();
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
                            defpackage.y70 y70Var = this.giKS3J6vZuNy;
                            y70Var.getClass();
                            key.getClass();
                            y70Var.ZpBGe2uQfcn8.remove(key);
                            int i2 = this.JhCgjQRTAOCT;
                            value.getClass();
                            this.JhCgjQRTAOCT = i2 - 1;
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
            giKS3J6vZuNy(key, value, null);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        synchronized (this.fWTAfUmVKrZq) {
            try {
                int i = this.WDYagTQQm9ns;
                int i2 = this.oh71FJcDz6S2 + i;
                str = "LruCache[maxSize=" + this.ZpBGe2uQfcn8 + ",hits=" + this.WDYagTQQm9ns + ",misses=" + this.oh71FJcDz6S2 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
