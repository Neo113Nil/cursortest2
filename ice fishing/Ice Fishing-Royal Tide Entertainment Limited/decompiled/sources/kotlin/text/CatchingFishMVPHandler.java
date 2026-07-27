package kotlin.text;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class CatchingFishMVPHandler {
    public static final Method CatchingFishCoroutine;
    public static final Method CatchingFishParcelableFAB;
    public static final boolean CatchingFishReduxKtor;
    public static final Method CatchingFishSnackbar;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            CatchingFishParcelableFAB = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            CatchingFishSnackbar = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            CatchingFishCoroutine = declaredMethod3;
            declaredMethod3.setAccessible(true);
            CatchingFishReduxKtor = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
