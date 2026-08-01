package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: m.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0269n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3988a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f3989b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f3990c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3991d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f3988a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f3989b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f3990c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f3991d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
