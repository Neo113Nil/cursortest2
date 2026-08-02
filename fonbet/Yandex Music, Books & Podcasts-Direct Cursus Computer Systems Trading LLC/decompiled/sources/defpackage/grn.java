package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class grn implements uug {
    public static final Logger b = Logger.getLogger(grn.class.getName());
    public static final Constructor c;
    public static final Method d;
    public static final RuntimeException e;
    public static final Object[] f;
    public final Object a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
                if (th == null) {
                }
                c = null;
                d = null;
                e = new RuntimeException(th);
                f = new Object[]{1L};
            }
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        if (th == null || constructor == null) {
            c = null;
            d = null;
            e = new RuntimeException(th);
        } else {
            c = constructor;
            d = method;
            e = null;
        }
        f = new Object[]{1L};
    }

    public grn() {
        RuntimeException runtimeException = e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.a = c.newInstance(null);
        } catch (IllegalAccessException e2) {
            b6e.q(e2);
            throw null;
        } catch (InstantiationException e3) {
            b6e.q(e3);
            throw null;
        } catch (InvocationTargetException e4) {
            b6e.q(e4);
            throw null;
        }
    }

    @Override // defpackage.uug
    public final void i() {
        try {
            d.invoke(this.a, f);
        } catch (IllegalAccessException e2) {
            b6e.q(e2);
        } catch (InvocationTargetException e3) {
            b6e.q(e3);
        }
    }
}
