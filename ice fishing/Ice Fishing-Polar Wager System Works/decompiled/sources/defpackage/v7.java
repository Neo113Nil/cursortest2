package defpackage;

/* loaded from: classes.dex */
public abstract class v7 implements defpackage.ej, defpackage.wj, java.io.Serializable {
    public final defpackage.ej adDC3e2L;

    public v7(defpackage.ej ejVar) {
        this.adDC3e2L = ejVar;
    }

    public java.lang.StackTraceElement JlrlGoKF() {
        int i;
        java.lang.String str;
        java.lang.reflect.Method method;
        java.lang.Object invoke;
        java.lang.reflect.Method method2;
        java.lang.Object invoke2;
        defpackage.em emVar = (defpackage.em) getClass().getAnnotation(defpackage.em.class);
        java.lang.String str2 = null;
        if (emVar == null || emVar.v() < 1) {
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
        int i2 = i >= 0 ? emVar.l()[i] : -1;
        defpackage.v5 v5Var = defpackage.fm.cnag84Bm;
        defpackage.v5 v5Var2 = defpackage.fm.QoRHpC4k;
        if (v5Var2 == null) {
            try {
                defpackage.v5 v5Var3 = new defpackage.v5(java.lang.Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 9);
                defpackage.fm.QoRHpC4k = v5Var3;
                v5Var2 = v5Var3;
            } catch (java.lang.Exception unused2) {
                defpackage.fm.QoRHpC4k = v5Var;
                v5Var2 = v5Var;
            }
        }
        if (v5Var2 != v5Var && (method = (java.lang.reflect.Method) v5Var2.oh6vYeIP) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (java.lang.reflect.Method) v5Var2.r1MBDhnF) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            java.lang.reflect.Method method3 = (java.lang.reflect.Method) v5Var2.F7NU4MC0GW;
            java.lang.Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof java.lang.String) {
                str2 = (java.lang.String) invoke3;
            }
        }
        if (str2 == null) {
            str = emVar.c();
        } else {
            str = str2 + '/' + emVar.c();
        }
        return new java.lang.StackTraceElement(str, emVar.m(), emVar.f(), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ej
    public final void SH1y5HwkJhh(java.lang.Object obj) {
        while (true) {
            defpackage.v7 v7Var = this;
            defpackage.ej ejVar = v7Var.adDC3e2L;
            ejVar.getClass();
            try {
                obj = v7Var.SyNS6RMn(obj);
                if (obj == defpackage.vj.adDC3e2L) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                obj = new defpackage.p11(th);
            }
            v7Var.cnag84Bm();
            if (!(ejVar instanceof defpackage.v7)) {
                ejVar.SH1y5HwkJhh(obj);
                return;
            }
            this = ejVar;
        }
    }

    public abstract java.lang.Object SyNS6RMn(java.lang.Object obj);

    public defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public defpackage.wj r1MBDhnF() {
        defpackage.ej ejVar = this.adDC3e2L;
        if (ejVar instanceof defpackage.wj) {
            return (defpackage.wj) ejVar;
        }
        return null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object JlrlGoKF = JlrlGoKF();
        if (JlrlGoKF == null) {
            JlrlGoKF = getClass().getName();
        }
        sb.append(JlrlGoKF);
        return sb.toString();
    }

    public void cnag84Bm() {
    }
}
