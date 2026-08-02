package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import v7.AbstractC5118i;
import v7.AbstractC5120k;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5104a = AbstractC5120k.t(Application.class, K.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f5105b = Z2.d.n(K.class);

    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.h.e(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.h.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.h.d(parameterTypes, "constructor.parameterTypes");
            List B3 = AbstractC5118i.B(parameterTypes);
            if (signature.equals(B3)) {
                return constructor;
            }
            if (signature.size() == B3.size() && B3.containsAll(signature)) {
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
