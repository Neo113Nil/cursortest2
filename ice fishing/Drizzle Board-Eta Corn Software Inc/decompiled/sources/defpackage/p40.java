package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class p40 implements Iterable {
    public m40 MdtA4re8;
    public m40 NCTxEWno;
    public final WeakHashMap wxUZMvaN = new WeakHashMap();
    public int VgvYg0wo = 0;

    public Object NCTxEWno(Object obj) {
        m40 qoPGr6Ce = qoPGr6Ce(obj);
        if (qoPGr6Ce == null) {
            return null;
        }
        this.VgvYg0wo--;
        WeakHashMap weakHashMap = this.wxUZMvaN;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((o40) it.next()).qoPGr6Ce(qoPGr6Ce);
            }
        }
        m40 m40Var = qoPGr6Ce.VgvYg0wo;
        m40 m40Var2 = qoPGr6Ce.wxUZMvaN;
        if (m40Var != null) {
            m40Var.wxUZMvaN = m40Var2;
        } else {
            this.NCTxEWno = m40Var2;
        }
        m40 m40Var3 = qoPGr6Ce.wxUZMvaN;
        if (m40Var3 != null) {
            m40Var3.VgvYg0wo = m40Var;
        } else {
            this.MdtA4re8 = m40Var;
        }
        qoPGr6Ce.wxUZMvaN = null;
        qoPGr6Ce.VgvYg0wo = null;
        return qoPGr6Ce.MdtA4re8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.l40) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof p40)) {
            return false;
        }
        p40 p40Var = (p40) obj;
        if (this.VgvYg0wo != p40Var.VgvYg0wo) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = p40Var.iterator();
        while (true) {
            l40 l40Var = (l40) it;
            if (!l40Var.hasNext()) {
                break;
            }
            l40 l40Var2 = (l40) it2;
            if (!l40Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) l40Var.next();
            Object next = l40Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            l40 l40Var = (l40) it;
            if (!l40Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) l40Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        l40 l40Var = new l40(this.NCTxEWno, this.MdtA4re8, 0);
        this.wxUZMvaN.put(l40Var, Boolean.FALSE);
        return l40Var;
    }

    public m40 qoPGr6Ce(Object obj) {
        m40 m40Var = this.NCTxEWno;
        while (m40Var != null && !m40Var.NCTxEWno.equals(obj)) {
            m40Var = m40Var.wxUZMvaN;
        }
        return m40Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            l40 l40Var = (l40) it;
            if (!l40Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) l40Var.next()).toString());
            if (l40Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
