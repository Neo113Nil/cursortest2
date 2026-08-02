package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes4.dex */
public final class xc3 {
    public final Hashtable a;

    public xc3(c2 c2Var) {
        this.a = new Hashtable();
        for (int i = 0; i != c2Var.b; i++) {
            vc3 m = vc3.m(c2Var.c(i));
            a(m.a, m);
        }
    }

    public static Hashtable b(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    public final void a(u2 u2Var, vc3 vc3Var) {
        Vector vector;
        Hashtable hashtable = this.a;
        Object obj = hashtable.get(u2Var);
        if (obj == null) {
            hashtable.put(u2Var, vc3Var);
            return;
        }
        if (obj instanceof vc3) {
            vector = new Vector();
            vector.addElement(obj);
        } else {
            vector = (Vector) obj;
        }
        vector.addElement(vc3Var);
        hashtable.put(u2Var, vector);
    }

    public final vc3 c(u2 u2Var) {
        Object obj = this.a.get(u2Var);
        return obj instanceof Vector ? (vc3) ((Vector) obj).elementAt(0) : (vc3) obj;
    }

    public final c2 d(u2 u2Var) {
        c2 c2Var = new c2();
        Object obj = this.a.get(u2Var);
        if (obj instanceof Vector) {
            Enumeration elements = ((Vector) obj).elements();
            while (elements.hasMoreElements()) {
                c2Var.a((vc3) elements.nextElement());
            }
        } else if (obj != null) {
            c2Var.a((vc3) obj);
        }
        return c2Var;
    }

    public final xc3 e(u2 u2Var) {
        xc3 xc3Var = new xc3(this.a);
        xc3Var.a.remove(u2Var);
        return xc3Var;
    }

    public final int f() {
        Enumeration elements = this.a.elements();
        int i = 0;
        while (elements.hasMoreElements()) {
            Object nextElement = elements.nextElement();
            i = nextElement instanceof Vector ? ((Vector) nextElement).size() + i : i + 1;
        }
        return i;
    }

    public final c2 g() {
        c2 c2Var = new c2();
        Enumeration elements = this.a.elements();
        while (elements.hasMoreElements()) {
            Object nextElement = elements.nextElement();
            if (nextElement instanceof Vector) {
                Enumeration elements2 = ((Vector) nextElement).elements();
                while (elements2.hasMoreElements()) {
                    c2Var.a(vc3.m(elements2.nextElement()));
                }
            } else {
                c2Var.a(vc3.m(nextElement));
            }
        }
        return c2Var;
    }

    public xc3(m3 m3Var) {
        this.a = new Hashtable();
        int i = 0;
        while (true) {
            a2[] a2VarArr = m3Var.a;
            if (i == a2VarArr.length) {
                return;
            }
            vc3 m = vc3.m(a2VarArr[i]);
            a(m.a, m);
            i++;
        }
    }

    public xc3(vc3 vc3Var) {
        this.a = new Hashtable();
        a(vc3Var.a, vc3Var);
    }

    public xc3(Hashtable hashtable) {
        this.a = new Hashtable();
        this.a = b(hashtable);
    }
}
