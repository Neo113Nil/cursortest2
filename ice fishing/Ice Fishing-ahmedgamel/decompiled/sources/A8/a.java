package A8;

import I0.j;
import com.facebook.ads.internal.dynamicloading.g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f226b;

    public /* synthetic */ a(int i, Object obj) {
        this.f225a = i;
        this.f226b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.f225a) {
            case 0:
                try {
                    return Class.forName(method.getDeclaringClass().getName(), true, j.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke((j) this.f226b, objArr);
                } catch (InvocationTargetException e9) {
                    throw e9.getTargetException();
                } catch (ReflectiveOperationException e10) {
                    throw new RuntimeException("Reflection failed for method " + method, e10);
                }
            default:
                if ("toString".equals(method.getName())) {
                    return null;
                }
                ((g) this.f226b).f24310a = method;
                return null;
        }
    }
}
