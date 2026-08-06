package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ya {
    public static final ya X1lG3V04pd = new ya();
    public final HashMap GWasM1elztuh = new HashMap();
    public final HashMap Yi7zF1RB1 = new HashMap();

    public static void Yi7zF1RB1(HashMap hashMap, xa xaVar, l90 l90Var, Class cls) {
        l90 l90Var2 = (l90) hashMap.get(xaVar);
        if (l90Var2 == null || l90Var == l90Var2) {
            if (l90Var2 == null) {
                hashMap.put(xaVar, l90Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + xaVar.Yi7zF1RB1.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + String.valueOf(l90Var2) + ", new value " + String.valueOf(l90Var));
    }

    public final wa GWasM1elztuh(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.GWasM1elztuh;
        if (superclass != null) {
            wa waVar = (wa) hashMap2.get(superclass);
            if (waVar == null) {
                waVar = GWasM1elztuh(superclass, null);
            }
            hashMap.putAll(waVar.Yi7zF1RB1);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            wa waVar2 = (wa) hashMap2.get(cls2);
            if (waVar2 == null) {
                waVar2 = GWasM1elztuh(cls2, null);
            }
            for (Map.Entry entry : waVar2.Yi7zF1RB1.entrySet()) {
                Yi7zF1RB1(hashMap, (xa) entry.getKey(), (l90) entry.getValue(), cls);
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
            jl0 jl0Var = (jl0) method.getAnnotation(jl0.class);
            if (jl0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!t90.class.isAssignableFrom(parameterTypes[0])) {
                        o4.mE4lRynR("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                l90 value = jl0Var.value();
                if (parameterTypes.length > 1) {
                    if (!l90.class.isAssignableFrom(parameterTypes[1])) {
                        o4.mE4lRynR("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != l90.ON_ANY) {
                        o4.mE4lRynR("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    o4.mE4lRynR("cannot have more than 2 params");
                    return null;
                }
                Yi7zF1RB1(hashMap, new xa(i, method), value, cls);
                z = true;
            }
        }
        wa waVar3 = new wa(hashMap);
        hashMap2.put(cls, waVar3);
        this.Yi7zF1RB1.put(cls, Boolean.valueOf(z));
        return waVar3;
    }
}
