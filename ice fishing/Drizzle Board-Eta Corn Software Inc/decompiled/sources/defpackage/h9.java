package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class h9 implements g9, v9, Serializable {
    public final l9 MdtA4re8;
    public final g9 NCTxEWno;
    public transient g9 wxUZMvaN;

    public h9(g9 g9Var) {
        this(g9Var, g9Var != null ? g9Var.wxUZMvaN() : null);
    }

    @Override // defpackage.v9
    public v9 MdtA4re8() {
        g9 g9Var = this.NCTxEWno;
        if (g9Var instanceof v9) {
            return (v9) g9Var;
        }
        return null;
    }

    public abstract Object OxcuoDLp(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g9
    public final void P7K7Inc8(Object obj) {
        while (true) {
            h9 h9Var = this;
            g9 g9Var = h9Var.NCTxEWno;
            g9Var.getClass();
            try {
                obj = h9Var.OxcuoDLp(obj);
                if (obj == u9.NCTxEWno) {
                    return;
                }
            } catch (Throwable th) {
                obj = new k30(th);
            }
            h9Var.amk52bBQ();
            if (!(g9Var instanceof h9)) {
                g9Var.P7K7Inc8(obj);
                return;
            }
            this = g9Var;
        }
    }

    public void amk52bBQ() {
        Unsafe unsafe;
        long j;
        g9 g9Var = this.wxUZMvaN;
        if (g9Var != null && g9Var != this) {
            j9 OnDfzHZD = wxUZMvaN().OnDfzHZD(re.MdtA4re8);
            OnDfzHZD.getClass();
            ad adVar = (ad) g9Var;
            do {
                unsafe = b1.qoPGr6Ce;
                j = ad.jb9XjC4I;
            } while (unsafe.getObjectVolatile(adVar, j) == fn.jb9XjC4I);
            Object objectVolatile = unsafe.getObjectVolatile(adVar, j);
            m3 m3Var = objectVolatile instanceof m3 ? (m3) objectVolatile : null;
            if (m3Var != null) {
                m3Var.amk52bBQ();
            }
        }
        this.wxUZMvaN = b7.MdtA4re8;
    }

    public g9 lDXGDhIF(g9 g9Var, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement sjUBp5pO() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        qa qaVar = (qa) getClass().getAnnotation(qa.class);
        String str2 = null;
        if (qaVar == null || qaVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? qaVar.l()[i] : -1;
        f0 f0Var = ej0.Qr9iLBAD;
        f0 f0Var2 = ej0.jb9XjC4I;
        if (f0Var2 == null) {
            try {
                f0 f0Var3 = new f0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 10);
                ej0.jb9XjC4I = f0Var3;
                f0Var2 = f0Var3;
            } catch (Exception unused2) {
                ej0.jb9XjC4I = f0Var;
                f0Var2 = f0Var;
            }
        }
        if (f0Var2 != f0Var && (method = (Method) f0Var2.MdtA4re8) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) f0Var2.wxUZMvaN) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) f0Var2.VgvYg0wo;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = qaVar.c();
        } else {
            str = str2 + '/' + qaVar.c();
        }
        return new StackTraceElement(str, qaVar.m(), qaVar.f(), i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object sjUBp5pO = sjUBp5pO();
        if (sjUBp5pO == null) {
            sjUBp5pO = getClass().getName();
        }
        sb.append(sjUBp5pO);
        return sb.toString();
    }

    @Override // defpackage.g9
    public l9 wxUZMvaN() {
        l9 l9Var = this.MdtA4re8;
        l9Var.getClass();
        return l9Var;
    }

    public h9(g9 g9Var, l9 l9Var) {
        this.NCTxEWno = g9Var;
        this.MdtA4re8 = l9Var;
    }
}
