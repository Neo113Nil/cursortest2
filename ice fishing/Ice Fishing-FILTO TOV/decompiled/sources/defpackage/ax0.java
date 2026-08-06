package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ax0 {
    public static final List GWasM1elztuh = fb1.rezfBrjOrqK(Application.class, pw0.class);
    public static final List Yi7zF1RB1 = fb1.HFYAaqMd6(pw0.class);

    public static final Constructor GWasM1elztuh(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List nXl1EmE5 = d5.nXl1EmE5(parameterTypes);
            if (list.equals(nXl1EmE5)) {
                return constructor;
            }
            if (list.size() == nXl1EmE5.size() && nXl1EmE5.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final we1 Yi7zF1RB1(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (we1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            o4.rQPn8YBR("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
