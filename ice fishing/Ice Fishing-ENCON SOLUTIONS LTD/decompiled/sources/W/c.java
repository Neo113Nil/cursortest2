package W;

import b0.C0128b;
import h1.C0239i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.d f1837a;

    /* renamed from: b, reason: collision with root package name */
    public final C0128b f1838b;

    public c(kotlin.jvm.internal.d dVar, C0128b c0128b) {
        this.f1837a = dVar;
        this.f1838b = c0128b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String str;
        kotlin.jvm.internal.i.e(obj, "obj");
        kotlin.jvm.internal.i.e(method, "method");
        boolean a2 = kotlin.jvm.internal.i.a(method.getName(), "accept");
        C0128b c0128b = this.f1838b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if ((kotlin.jvm.internal.i.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((kotlin.jvm.internal.i.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(c0128b.hashCode());
            }
            if (kotlin.jvm.internal.i.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return c0128b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class jClass = this.f1837a.f8070a;
        kotlin.jvm.internal.i.e(jClass, "jClass");
        Map map = kotlin.jvm.internal.d.f8067b;
        kotlin.jvm.internal.i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            isInstance = s.b(num.intValue(), obj2);
        } else {
            isInstance = (jClass.isPrimitive() ? R1.d.q(q.a(jClass)) : jClass).isInstance(obj2);
        }
        if (isInstance) {
            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c0128b.invoke(obj2);
            return C0239i.f3393a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            HashMap hashMap = kotlin.jvm.internal.d.f8068c;
            if (isArray) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(jClass.getName());
                if (str2 == null) {
                    str2 = jClass.getCanonicalName();
                }
            }
        }
        sb.append(str2);
        throw new ClassCastException(sb.toString());
    }
}
