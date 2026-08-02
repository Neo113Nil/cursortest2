package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class r1r implements Closeable {
    public static final hfx a;
    public static final oq90 b;

    static {
        hfx hfxVar;
        try {
            Class.forName("java.nio.file.Files");
            hfxVar = new ya60();
        } catch (ClassNotFoundException unused) {
            hfxVar = new hfx();
        }
        a = hfxVar;
        String str = oq90.b;
        b = sms.f(System.getProperty("java.io.tmpdir"));
        new auj0(auj0.class.getClassLoader());
    }

    public abstract gfx B(oq90 oq90Var);

    public abstract uis0 D(oq90 oq90Var, boolean z);

    public abstract y9t0 G(oq90 oq90Var);

    public abstract uis0 a(oq90 oq90Var);

    public abstract void c(oq90 oq90Var, oq90 oq90Var2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void d(oq90 oq90Var) {
        x43 x43Var = new x43();
        while (oq90Var != null && !n(oq90Var)) {
            x43Var.addFirst(oq90Var);
            oq90Var = oq90Var.c();
        }
        Iterator<E> it = x43Var.iterator();
        while (it.hasNext()) {
            e((oq90) it.next());
        }
    }

    public abstract void e(oq90 oq90Var);

    public abstract void k(oq90 oq90Var);

    public final boolean n(oq90 oq90Var) {
        return w(oq90Var) != null;
    }

    public abstract List o(oq90 oq90Var);

    public final m0r v(oq90 oq90Var) {
        m0r w = w(oq90Var);
        if (w != null) {
            return w;
        }
        yhl.h(oq90Var, "no such file: ");
        return null;
    }

    public abstract m0r w(oq90 oq90Var);
}
