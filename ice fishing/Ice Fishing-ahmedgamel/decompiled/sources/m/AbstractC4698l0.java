package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: m.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4698l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f39179a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f39180b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f39181c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f39182d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f39179a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f39180b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f39181c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f39182d = true;
        } catch (NoSuchMethodException e9) {
            e9.printStackTrace();
        }
    }
}
