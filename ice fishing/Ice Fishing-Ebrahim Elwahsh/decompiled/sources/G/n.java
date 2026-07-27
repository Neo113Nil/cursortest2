package G;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class n extends m {
    @Override // G.m
    public final Typeface F(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1169f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1174l.invoke(null, newInstance, com.anythink.basead.exoplayer.b.f6549m, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // G.m
    public final Method J(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
