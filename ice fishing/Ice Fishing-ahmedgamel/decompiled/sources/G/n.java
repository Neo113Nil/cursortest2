package G;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class n extends m {
    @Override // G.m
    public final Typeface D(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1049g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1054m.invoke(null, newInstance, com.anythink.basead.exoplayer.b.f7178m, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // G.m
    public final Method H(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
