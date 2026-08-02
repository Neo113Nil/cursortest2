package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class h67 extends ConcurrentHashMap {
    private static final long serialVersionUID = 3024739453186759259L;

    public final Collection a(String str) {
        return (Collection) get(str != null ? str.toLowerCase() : null);
    }

    public final void b(w67 w67Var) {
        if (w67Var != null) {
            List list = (List) get(w67Var.b());
            if (list == null) {
                putIfAbsent(w67Var.b(), new ArrayList());
                list = (List) get(w67Var.b());
            }
            synchronized (list) {
                list.add(w67Var);
            }
        }
    }

    public final j67 c(w67 w67Var) {
        Collection a;
        j67 j67Var = null;
        if (w67Var == null || (a = a(w67Var.b())) == null) {
            return null;
        }
        synchronized (a) {
            try {
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    j67 j67Var2 = (j67) it.next();
                    if (j67Var2.i(w67Var)) {
                        j67Var = j67Var2;
                        break;
                    }
                }
            } finally {
            }
        }
        return j67Var;
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        h67 h67Var = new h67(size());
        h67Var.putAll(this);
        return h67Var;
    }

    public final j67 d(String str, y67 y67Var, x67 x67Var) {
        Collection a = a(str);
        j67 j67Var = null;
        if (a == null) {
            return null;
        }
        synchronized (a) {
            try {
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    j67 j67Var2 = (j67) it.next();
                    if (j67Var2.e().equals(y67Var) && j67Var2.l(x67Var)) {
                        j67Var = j67Var2;
                        break;
                    }
                }
            } finally {
            }
        }
        return j67Var;
    }

    public final List e(String str) {
        ArrayList arrayList;
        Collection a = a(str);
        if (a == null) {
            return Collections.EMPTY_LIST;
        }
        synchronized (a) {
            arrayList = new ArrayList(a);
        }
        return arrayList;
    }

    public final List f(String str, y67 y67Var, x67 x67Var) {
        ArrayList arrayList;
        Collection a = a(str);
        if (a == null) {
            return Collections.EMPTY_LIST;
        }
        synchronized (a) {
            try {
                arrayList = new ArrayList(a);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j67 j67Var = (j67) it.next();
                    if (j67Var.e().equals(y67Var) && j67Var.l(x67Var)) {
                    }
                    it.remove();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public final synchronized String toString() {
        StringBuffer stringBuffer;
        try {
            stringBuffer = new StringBuffer(2000);
            stringBuffer.append("\t---- cache ----");
            for (String str : keySet()) {
                stringBuffer.append("\n\t\t");
                stringBuffer.append("\n\t\tname '");
                stringBuffer.append(str);
                stringBuffer.append("' ");
                List<j67> list = (List) get(str);
                if (list == null || list.isEmpty()) {
                    stringBuffer.append(" no entries");
                } else {
                    synchronized (list) {
                        try {
                            for (j67 j67Var : list) {
                                stringBuffer.append("\n\t\t\t");
                                stringBuffer.append(j67Var.toString());
                            }
                        } finally {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return stringBuffer.toString();
    }
}
