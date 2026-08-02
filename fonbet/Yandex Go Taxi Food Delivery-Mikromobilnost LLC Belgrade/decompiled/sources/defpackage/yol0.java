package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class yol0 implements Iterable {
    public vol0 a;
    public vol0 b;
    public final WeakHashMap c = new WeakHashMap();
    public int w = 0;

    public static abstract class a {
        public abstract void a(vol0 vol0Var);
    }

    public vol0 a(Object obj) {
        vol0 vol0Var = this.a;
        while (vol0Var != null && !vol0Var.a.equals(obj)) {
            vol0Var = vol0Var.c;
        }
        return vol0Var;
    }

    public Object b(Object obj) {
        vol0 a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.w--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(a2);
            }
        }
        vol0 vol0Var = a2.w;
        vol0 vol0Var2 = a2.c;
        if (vol0Var != null) {
            vol0Var.c = vol0Var2;
        } else {
            this.a = vol0Var2;
        }
        vol0 vol0Var3 = a2.c;
        if (vol0Var3 != null) {
            vol0Var3.w = vol0Var;
        } else {
            this.b = vol0Var;
        }
        a2.c = null;
        a2.w = null;
        return a2.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.xol0) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yol0)) {
            return false;
        }
        yol0 yol0Var = (yol0) obj;
        if (this.w != yol0Var.w) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = yol0Var.iterator();
        while (true) {
            xol0 xol0Var = (xol0) it;
            if (!xol0Var.hasNext()) {
                break;
            }
            xol0 xol0Var2 = (xol0) it2;
            if (!xol0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) xol0Var.next();
            Object next = xol0Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            xol0 xol0Var = (xol0) it;
            if (!xol0Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) xol0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        tol0 tol0Var = new tol0(this.a, this.b);
        this.c.put(tol0Var, Boolean.FALSE);
        return tol0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            xol0 xol0Var = (xol0) it;
            if (!xol0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) xol0Var.next()).toString());
            if (xol0Var.hasNext()) {
                sb.append(Extension.FIX_SPACE);
            }
        }
    }
}
