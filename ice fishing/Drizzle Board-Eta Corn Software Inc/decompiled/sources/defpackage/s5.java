package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class s5 {
    public static final s5 MdtA4re8 = new s5();
    public final HashMap qoPGr6Ce = new HashMap();
    public final HashMap NCTxEWno = new HashMap();

    public static void NCTxEWno(HashMap hashMap, r5 r5Var, oo ooVar, Class cls) {
        oo ooVar2 = (oo) hashMap.get(r5Var);
        if (ooVar2 == null || ooVar == ooVar2) {
            if (ooVar2 == null) {
                hashMap.put(r5Var, ooVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + r5Var.NCTxEWno.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ooVar2 + ", new value " + ooVar);
    }

    public final q5 qoPGr6Ce(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.qoPGr6Ce;
        if (superclass != null) {
            q5 q5Var = (q5) hashMap2.get(superclass);
            if (q5Var == null) {
                q5Var = qoPGr6Ce(superclass, null);
            }
            hashMap.putAll(q5Var.NCTxEWno);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            q5 q5Var2 = (q5) hashMap2.get(cls2);
            if (q5Var2 == null) {
                q5Var2 = qoPGr6Ce(cls2, null);
            }
            for (Map.Entry entry : q5Var2.NCTxEWno.entrySet()) {
                NCTxEWno(hashMap, (r5) entry.getKey(), (oo) entry.getValue(), cls);
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
            cx cxVar = (cx) method.getAnnotation(cx.class);
            if (cxVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!vo.class.isAssignableFrom(parameterTypes[0])) {
                        m1.sjUBp5pO("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                oo value = cxVar.value();
                if (parameterTypes.length > 1) {
                    if (!oo.class.isAssignableFrom(parameterTypes[1])) {
                        m1.sjUBp5pO("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != oo.ON_ANY) {
                        m1.sjUBp5pO("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    m1.sjUBp5pO("cannot have more than 2 params");
                    return null;
                }
                NCTxEWno(hashMap, new r5(i, method), value, cls);
                z = true;
            }
        }
        q5 q5Var3 = new q5(hashMap);
        hashMap2.put(cls, q5Var3);
        this.NCTxEWno.put(cls, Boolean.valueOf(z));
        return q5Var3;
    }
}
