package R1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1753a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1754b;

    /* renamed from: c, reason: collision with root package name */
    public String f1755c;

    public i(ArrayList arrayList) {
        this.f1753a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        kotlin.jvm.internal.i.e(proxy, "proxy");
        kotlin.jvm.internal.i.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.i.a(name, "supports") && kotlin.jvm.internal.i.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.i.a(name, "unsupported") && kotlin.jvm.internal.i.a(Void.TYPE, returnType)) {
            this.f1754b = true;
            return null;
        }
        boolean a2 = kotlin.jvm.internal.i.a(name, "protocols");
        ArrayList arrayList = this.f1753a;
        if (a2 && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.i.a(name, "selectProtocol") || kotlin.jvm.internal.i.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        Object obj2 = list.get(i2);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj2;
                        if (arrayList.contains(str)) {
                            this.f1755c = str;
                            return str;
                        }
                        if (i2 == size) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f1755c = str2;
                return str2;
            }
        }
        if ((!kotlin.jvm.internal.i.a(name, "protocolSelected") && !kotlin.jvm.internal.i.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f1755c = (String) obj3;
        return null;
    }
}
