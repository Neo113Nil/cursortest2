package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class h6 implements vg, rh, Serializable {
    public final vg OOA6hdeuvCS;

    public h6(vg vgVar) {
        this.OOA6hdeuvCS = vgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vg
    public final void AvO7iQsrTN(Object obj) {
        while (true) {
            h6 h6Var = this;
            vg vgVar = h6Var.OOA6hdeuvCS;
            vgVar.getClass();
            try {
                obj = h6Var.WIEu4Ya2g8(obj);
                if (obj == qh.OOA6hdeuvCS) {
                    return;
                }
            } catch (Throwable th) {
                obj = new su0(th);
            }
            h6Var.YmKjaVtbfp5Z();
            if (!(vgVar instanceof h6)) {
                vgVar.AvO7iQsrTN(obj);
                return;
            }
            this = vgVar;
        }
    }

    public abstract Object WIEu4Ya2g8(Object obj);

    public StackTraceElement iwATDS1i01k() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        pj pjVar = (pj) getClass().getAnnotation(pj.class);
        String str2 = null;
        if (pjVar == null || pjVar.v() < 1) {
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
        int i2 = i >= 0 ? pjVar.l()[i] : -1;
        f4 f4Var = p.E7jCp8Ls;
        f4 f4Var2 = p.XnEVoBF0td1l;
        if (f4Var2 == null) {
            try {
                f4 f4Var3 = new f4(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 10);
                p.XnEVoBF0td1l = f4Var3;
                f4Var2 = f4Var3;
            } catch (Exception unused2) {
                p.XnEVoBF0td1l = f4Var;
                f4Var2 = f4Var;
            }
        }
        if (f4Var2 != f4Var && (method = (Method) f4Var2.Yi7zF1RB1) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) f4Var2.X1lG3V04pd) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) f4Var2.xqGvceK5x;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = pjVar.c();
        } else {
            str = str2 + '/' + pjVar.c();
        }
        return new StackTraceElement(str, pjVar.m(), pjVar.f(), i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object iwATDS1i01k = iwATDS1i01k();
        if (iwATDS1i01k == null) {
            iwATDS1i01k = getClass().getName();
        }
        sb.append(iwATDS1i01k);
        return sb.toString();
    }

    public vg uFEq9NpZ(vg vgVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public rh xqGvceK5x() {
        vg vgVar = this.OOA6hdeuvCS;
        if (vgVar instanceof rh) {
            return (rh) vgVar;
        }
        return null;
    }

    public void YmKjaVtbfp5Z() {
    }
}
