package defpackage;

/* loaded from: classes.dex */
public final class ad {
    public static final defpackage.ad r1MBDhnF = new defpackage.ad();
    public final java.util.HashMap IHQe1A4L2xu = new java.util.HashMap();
    public final java.util.HashMap oh6vYeIP = new java.util.HashMap();

    public static void oh6vYeIP(java.util.HashMap hashMap, defpackage.zc zcVar, defpackage.md0 md0Var, java.lang.Class cls) {
        defpackage.md0 md0Var2 = (defpackage.md0) hashMap.get(zcVar);
        if (md0Var2 == null || md0Var == md0Var2) {
            if (md0Var2 == null) {
                hashMap.put(zcVar, md0Var);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Method " + zcVar.oh6vYeIP.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + java.lang.String.valueOf(md0Var2) + ", new value " + java.lang.String.valueOf(md0Var));
    }

    public final defpackage.yc IHQe1A4L2xu(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = this.IHQe1A4L2xu;
        if (superclass != null) {
            defpackage.yc ycVar = (defpackage.yc) hashMap2.get(superclass);
            if (ycVar == null) {
                ycVar = IHQe1A4L2xu(superclass, null);
            }
            hashMap.putAll(ycVar.oh6vYeIP);
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            defpackage.yc ycVar2 = (defpackage.yc) hashMap2.get(cls2);
            if (ycVar2 == null) {
                ycVar2 = IHQe1A4L2xu(cls2, null);
            }
            for (java.util.Map.Entry entry : ycVar2.oh6vYeIP.entrySet()) {
                oh6vYeIP(hashMap, (defpackage.zc) entry.getKey(), (defpackage.md0) entry.getValue(), cls);
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
            defpackage.wq0 wq0Var = (defpackage.wq0) method.getAnnotation(defpackage.wq0.class);
            if (wq0Var != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!defpackage.ud0.class.isAssignableFrom(parameterTypes[0])) {
                        defpackage.db.fnWB2E7cs("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                defpackage.md0 value = wq0Var.value();
                if (parameterTypes.length > 1) {
                    if (!defpackage.md0.class.isAssignableFrom(parameterTypes[1])) {
                        defpackage.db.fnWB2E7cs("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != defpackage.md0.ON_ANY) {
                        defpackage.db.fnWB2E7cs("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    defpackage.db.fnWB2E7cs("cannot have more than 2 params");
                    return null;
                }
                oh6vYeIP(hashMap, new defpackage.zc(i, method), value, cls);
                z = true;
            }
        }
        defpackage.yc ycVar3 = new defpackage.yc(hashMap);
        hashMap2.put(cls, ycVar3);
        this.oh6vYeIP.put(cls, java.lang.Boolean.valueOf(z));
        return ycVar3;
    }
}
