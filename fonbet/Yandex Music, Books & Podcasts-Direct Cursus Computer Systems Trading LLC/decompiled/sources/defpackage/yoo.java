package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class yoo {
    public static final List a = u75.h(Application.class, noo.class);
    public static final List b = t75.c(noo.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        c7 H = zc4.H(cls.getConstructors());
        while (H.hasNext()) {
            Constructor constructor = (Constructor) H.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List X = xz0.X(parameterTypes);
            if (list.equals(X)) {
                return constructor;
            }
            if (list.size() == X.size() && X.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final bfu b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (bfu) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            kac.k(tlm.j("Failed to access ", cls), e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            kac.k(tlm.j("An exception happened in constructor of ", cls), e3.getCause());
            return null;
        }
    }
}
