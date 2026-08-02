package defpackage;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class ptk {
    public static final ptk b;
    public final Constructor a;

    static {
        b = "Dalvik".equals(System.getProperty("java.vm.name")) ? new gtk() : new ptk();
    }

    public ptk() {
        Constructor constructor = null;
        try {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.a = constructor;
    }

    public Executor a() {
        return null;
    }

    public Object b(Class cls, Object obj, Method method, Object... objArr) {
        Constructor constructor = this.a;
        return (constructor != null ? (MethodHandles.Lookup) constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
