package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class se {
    public static final defpackage.se fWTAfUmVKrZq = new defpackage.se();
    public final java.util.HashMap ZpBGe2uQfcn8 = new java.util.HashMap();
    public final java.util.HashMap giKS3J6vZuNy = new java.util.HashMap();

    public static void giKS3J6vZuNy(java.util.HashMap hashMap, defpackage.re reVar, defpackage.og0 og0Var, java.lang.Class cls) {
        defpackage.og0 og0Var2 = (defpackage.og0) hashMap.get(reVar);
        if (og0Var2 == null || og0Var == og0Var2) {
            if (og0Var2 == null) {
                hashMap.put(reVar, og0Var);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Method " + reVar.giKS3J6vZuNy.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + java.lang.String.valueOf(og0Var2) + ", new value " + java.lang.String.valueOf(og0Var));
    }

    public final defpackage.qe ZpBGe2uQfcn8(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = this.ZpBGe2uQfcn8;
        if (superclass != null) {
            defpackage.qe qeVar = (defpackage.qe) hashMap2.get(superclass);
            if (qeVar == null) {
                qeVar = ZpBGe2uQfcn8(superclass, null);
            }
            hashMap.putAll(qeVar.giKS3J6vZuNy);
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            defpackage.qe qeVar2 = (defpackage.qe) hashMap2.get(cls2);
            if (qeVar2 == null) {
                qeVar2 = ZpBGe2uQfcn8(cls2, null);
            }
            for (java.util.Map.Entry entry : qeVar2.giKS3J6vZuNy.entrySet()) {
                giKS3J6vZuNy(hashMap, (defpackage.re) entry.getKey(), (defpackage.og0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (java.lang.NoClassDefFoundError e) {
                throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (java.lang.reflect.Method method : methodArr) {
            defpackage.pt0 pt0Var = (defpackage.pt0) method.getAnnotation(defpackage.pt0.class);
            if (pt0Var != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!defpackage.wg0.class.isAssignableFrom(parameterTypes[0])) {
                        defpackage.h7.w7APNrr0aGRc("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                defpackage.og0 value = pt0Var.value();
                if (parameterTypes.length > 1) {
                    if (!defpackage.og0.class.isAssignableFrom(parameterTypes[1])) {
                        defpackage.h7.w7APNrr0aGRc("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != defpackage.og0.ON_ANY) {
                        defpackage.h7.w7APNrr0aGRc("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    defpackage.h7.w7APNrr0aGRc("cannot have more than 2 params");
                    return null;
                }
                giKS3J6vZuNy(hashMap, new defpackage.re(i, method), value, cls);
                z = true;
            }
        }
        defpackage.qe qeVar3 = new defpackage.qe(hashMap);
        hashMap2.put(cls, qeVar3);
        this.giKS3J6vZuNy.put(cls, java.lang.Boolean.valueOf(z));
        return qeVar3;
    }
}
