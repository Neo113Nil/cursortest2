package kotlin.text;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class CatchingFishAdMobReduxRedux extends CatchingFishReduxOkHttpMVI {
    @Override // kotlin.text.CatchingFishReduxOkHttpMVI
    public final Method CatchingFishNavigationGson(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // kotlin.text.CatchingFishReduxOkHttpMVI
    public final Typeface CatchingFishStripeAPI(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.CatchingFishCloudMessaging, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.CatchingFishRoomDatabase.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
