package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class we6 {
    public static final Logger d = Logger.getLogger(we6.class.getName());
    public static final we6 e = new we6();
    public final qe6 a;
    public final ulk b;
    public final int c;

    public we6(we6 we6Var, ulk ulkVar) {
        this.a = we6Var instanceof qe6 ? (qe6) we6Var : we6Var.a;
        this.b = ulkVar;
        int i = we6Var.c + 1;
        this.c = i;
        if (i == 1000) {
            d.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(str);
    }

    public static we6 z() {
        ((pfs) ue6.a).getClass();
        we6 we6Var = (we6) pfs.b.get();
        we6 we6Var2 = e;
        if (we6Var == null) {
            we6Var = we6Var2;
        }
        return we6Var == null ? we6Var2 : we6Var;
    }

    public void D(we6 we6Var) {
        o(we6Var, "toAttach");
        pfs pfsVar = (pfs) ue6.a;
        ThreadLocal threadLocal = pfs.b;
        pfsVar.getClass();
        we6 we6Var2 = (we6) threadLocal.get();
        we6 we6Var3 = e;
        if (we6Var2 == null) {
            we6Var2 = we6Var3;
        }
        if (we6Var2 != this) {
            pfs.a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (we6Var != we6Var3) {
            threadLocal.set(we6Var);
        } else {
            threadLocal.set(null);
        }
    }

    public ce7 H() {
        qe6 qe6Var = this.a;
        if (qe6Var == null) {
            return null;
        }
        return qe6Var.f;
    }

    public boolean I() {
        qe6 qe6Var = this.a;
        if (qe6Var == null) {
            return false;
        }
        return qe6Var.I();
    }

    public void N(re6 re6Var) {
        qe6 qe6Var = this.a;
        if (qe6Var == null) {
            return;
        }
        qe6Var.R(re6Var, this);
    }

    public void a(re6 re6Var) {
        qe6 qe6Var = this.a;
        if (qe6Var == null) {
            return;
        }
        qe6Var.P(new te6(e48.a, re6Var, this));
    }

    public we6 b() {
        ((pfs) ue6.a).getClass();
        ThreadLocal threadLocal = pfs.b;
        we6 we6Var = (we6) threadLocal.get();
        we6 we6Var2 = e;
        if (we6Var == null) {
            we6Var = we6Var2;
        }
        threadLocal.set(this);
        return we6Var == null ? we6Var2 : we6Var;
    }

    public Throwable g() {
        qe6 qe6Var = this.a;
        if (qe6Var == null) {
            return null;
        }
        return qe6Var.g();
    }

    public we6(ulk ulkVar, int i) {
        this.a = null;
        this.b = ulkVar;
        this.c = i;
        if (i == 1000) {
            d.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public we6() {
        this.a = null;
        this.b = null;
        this.c = 0;
    }
}
