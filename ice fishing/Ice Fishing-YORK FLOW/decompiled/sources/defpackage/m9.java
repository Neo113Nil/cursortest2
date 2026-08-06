package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class m9 implements defpackage.kl, defpackage.um, java.io.Serializable {
    public final defpackage.kl WDYagTQQm9ns;

    public m9(defpackage.kl klVar) {
        this.WDYagTQQm9ns = klVar;
    }

    public defpackage.um WDYagTQQm9ns() {
        defpackage.kl klVar = this.WDYagTQQm9ns;
        if (klVar instanceof defpackage.um) {
            return (defpackage.um) klVar;
        }
        return null;
    }

    public java.lang.StackTraceElement WmetiUbpKU9I() {
        int i;
        java.lang.String str;
        java.lang.reflect.Method method;
        java.lang.Object invoke;
        java.lang.reflect.Method method2;
        java.lang.Object invoke2;
        defpackage.mn mnVar = (defpackage.mn) getClass().getAnnotation(defpackage.mn.class);
        java.lang.String str2 = null;
        if (mnVar == null || mnVar.v() < 1) {
            return null;
        }
        try {
            java.lang.reflect.Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? mnVar.l()[i] : -1;
        defpackage.a7 a7Var = defpackage.la0.oCu53ZX2v4Ju;
        defpackage.a7 a7Var2 = defpackage.la0.dG7RjM6DqYVL;
        if (a7Var2 == null) {
            try {
                defpackage.a7 a7Var3 = new defpackage.a7(java.lang.Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 11);
                defpackage.la0.dG7RjM6DqYVL = a7Var3;
                a7Var2 = a7Var3;
            } catch (java.lang.Exception unused2) {
                defpackage.la0.dG7RjM6DqYVL = a7Var;
                a7Var2 = a7Var;
            }
        }
        if (a7Var2 != a7Var && (method = (java.lang.reflect.Method) a7Var2.giKS3J6vZuNy) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (java.lang.reflect.Method) a7Var2.fWTAfUmVKrZq) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            java.lang.reflect.Method method3 = (java.lang.reflect.Method) a7Var2.JhCgjQRTAOCT;
            java.lang.Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof java.lang.String) {
                str2 = (java.lang.String) invoke3;
            }
        }
        if (str2 == null) {
            str = mnVar.c();
        } else {
            str = str2 + '/' + mnVar.c();
        }
        return new java.lang.StackTraceElement(str, mnVar.m(), mnVar.f(), i2);
    }

    public defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kl
    public final void e6mdH7fiFuta(java.lang.Object obj) {
        while (true) {
            defpackage.m9 m9Var = this;
            defpackage.kl klVar = m9Var.WDYagTQQm9ns;
            klVar.getClass();
            try {
                obj = m9Var.s0TASMVLSWD5(obj);
                if (obj == defpackage.tm.WDYagTQQm9ns) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                obj = new defpackage.g51(th);
            }
            m9Var.BHfvd2J71qpO();
            if (!(klVar instanceof defpackage.m9)) {
                klVar.e6mdH7fiFuta(obj);
                return;
            }
            this = klVar;
        }
    }

    public abstract java.lang.Object s0TASMVLSWD5(java.lang.Object obj);

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object WmetiUbpKU9I = WmetiUbpKU9I();
        if (WmetiUbpKU9I == null) {
            WmetiUbpKU9I = getClass().getName();
        }
        sb.append(WmetiUbpKU9I);
        return sb.toString();
    }

    public void BHfvd2J71qpO() {
    }
}
