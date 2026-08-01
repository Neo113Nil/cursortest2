package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2020a = u1.h.F(Application.class, I.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f2021b = h0.f.s(I.class);

    public static final Constructor a(Class cls, List list) {
        D1.i.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        D1.i.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            D1.i.d(parameterTypes, "constructor.parameterTypes");
            List H2 = u1.f.H(parameterTypes);
            if (list.equals(H2)) {
                return constructor;
            }
            if (list.size() == H2.size() && H2.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final Q b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (Q) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
