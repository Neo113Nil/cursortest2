package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class rm4 {
    public static final rm4 c = new rm4();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, qm4 qm4Var, kyf kyfVar, Class cls) {
        kyf kyfVar2 = (kyf) hashMap.get(qm4Var);
        if (kyfVar2 == null || kyfVar == kyfVar2) {
            if (kyfVar2 == null) {
                hashMap.put(qm4Var, kyfVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + qm4Var.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + kyfVar2 + ", new value " + kyfVar);
    }

    public final pm4 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            pm4 pm4Var = (pm4) hashMap2.get(superclass);
            if (pm4Var == null) {
                pm4Var = a(superclass, null);
            }
            hashMap.putAll(pm4Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            pm4 pm4Var2 = (pm4) hashMap2.get(cls2);
            if (pm4Var2 == null) {
                pm4Var2 = a(cls2, null);
            }
            for (Map.Entry entry : pm4Var2.b.entrySet()) {
                b(hashMap, (qm4) entry.getKey(), (kyf) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            eqj eqjVar = (eqj) method.getAnnotation(eqj.class);
            if (eqjVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!dzf.class.isAssignableFrom(parameterTypes[0])) {
                        xq0.x("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                kyf value = eqjVar.value();
                if (parameterTypes.length > 1) {
                    if (!kyf.class.isAssignableFrom(parameterTypes[1])) {
                        xq0.x("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != kyf.ON_ANY) {
                        xq0.x("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    xq0.x("cannot have more than 2 params");
                    return null;
                }
                b(hashMap, new qm4(i, method), value, cls);
                z = true;
            }
        }
        pm4 pm4Var3 = new pm4(hashMap);
        hashMap2.put(cls, pm4Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return pm4Var3;
    }
}
