package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f710a = bc.n.L(Application.class, j0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f711b = i7.b.z(j0.class);

    public static final Constructor a(Class cls, List list) {
        pc.j.e(list, "signature");
        bc.b h10 = pc.j.h(cls.getConstructors());
        while (h10.hasNext()) {
            Constructor constructor = (Constructor) h10.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            pc.j.d(parameterTypes, "getParameterTypes(...)");
            List c02 = bc.l.c0(parameterTypes);
            if (list.equals(c02)) {
                return constructor;
            }
            if (list.size() == c02.size() && c02.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final t0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (t0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
