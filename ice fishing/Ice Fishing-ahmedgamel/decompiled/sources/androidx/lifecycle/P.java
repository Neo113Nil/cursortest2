package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import v7.AbstractC5128i;
import v7.AbstractC5130k;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5137a = AbstractC5130k.v(Application.class, K.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f5138b = d6.c.k(K.class);

    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.h.e(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.h.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.h.d(parameterTypes, "constructor.parameterTypes");
            List y7 = AbstractC5128i.y(parameterTypes);
            if (signature.equals(y7)) {
                return constructor;
            }
            if (signature.size() == y7.size() && y7.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final S b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (S) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Failed to access " + cls, e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
