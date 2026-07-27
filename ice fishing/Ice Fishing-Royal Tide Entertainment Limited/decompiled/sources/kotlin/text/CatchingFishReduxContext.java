package kotlin.text;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CatchingFishReduxContext {
    public static final List CatchingFishParcelableFAB = CatchingFishToastCustomView.CatchingFishLayoutInflater(Application.class, CatchingFishSnackbarRedux.class);
    public static final List CatchingFishSnackbar = CatchingFishGsonCardView.CatchingFishFragmentFactory(CatchingFishSnackbarRedux.class);

    public static final Constructor CatchingFishParcelableFAB(Class cls, List list) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(parameterTypes, "getParameterTypes(...)");
            int length = parameterTypes.length;
            List arrayList = length != 0 ? length != 1 ? new ArrayList(new CatchingFishLiveDataCameraX(parameterTypes, false)) : CatchingFishGsonCardView.CatchingFishFragmentFactory(parameterTypes[0]) : CatchingFishViewPagerDagger.CatchingFishReduxKtor;
            if (list.equals(arrayList)) {
                return constructor;
            }
            if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final CatchingFishLayoutGlide CatchingFishSnackbar(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (CatchingFishLayoutGlide) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
