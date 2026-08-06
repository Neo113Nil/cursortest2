package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bc0 {
    public int EljAMC1QTz;
    public final int GWasM1elztuh;
    public int OOA6hdeuvCS;
    public final vt X1lG3V04pd;
    public final q10 Yi7zF1RB1;
    public int xqGvceK5x;

    public bc0(int i) {
        this.GWasM1elztuh = i;
        if (i <= 0) {
            o4.mE4lRynR("maxSize <= 0");
            throw null;
        }
        this.Yi7zF1RB1 = new q10(1);
        this.X1lG3V04pd = new vt(6);
    }

    public final Object GWasM1elztuh(Object obj) {
        synchronized (this.X1lG3V04pd) {
            q10 q10Var = this.Yi7zF1RB1;
            q10Var.getClass();
            Object obj2 = q10Var.GWasM1elztuh.get(obj);
            if (obj2 != null) {
                this.OOA6hdeuvCS++;
                return obj2;
            }
            this.EljAMC1QTz++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Yi7zF1RB1(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (this.X1lG3V04pd) {
            this.xqGvceK5x++;
            q10 q10Var = this.Yi7zF1RB1;
            q10Var.getClass();
            put = q10Var.GWasM1elztuh.put(obj, obj2);
            if (put != null) {
                this.xqGvceK5x--;
            }
        }
        int i = this.GWasM1elztuh;
        while (true) {
            synchronized (this.X1lG3V04pd) {
                try {
                    if (this.xqGvceK5x < 0 || (this.Yi7zF1RB1.GWasM1elztuh.isEmpty() && this.xqGvceK5x != 0)) {
                        break;
                    }
                    if (this.xqGvceK5x <= i || this.Yi7zF1RB1.GWasM1elztuh.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.Yi7zF1RB1.GWasM1elztuh.entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    Object obj3 = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            obj3 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    q10 q10Var2 = this.Yi7zF1RB1;
                    q10Var2.getClass();
                    key.getClass();
                    q10Var2.GWasM1elztuh.remove(key);
                    int i2 = this.xqGvceK5x;
                    value.getClass();
                    this.xqGvceK5x = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.X1lG3V04pd) {
            try {
                int i = this.OOA6hdeuvCS;
                int i2 = this.EljAMC1QTz + i;
                str = "LruCache[maxSize=" + this.GWasM1elztuh + ",hits=" + this.OOA6hdeuvCS + ",misses=" + this.EljAMC1QTz + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
