package androidx.window.layout;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import t0.C0350b;

/* loaded from: classes.dex */
public abstract class d {
    public static f a(Activity activity, FoldingFeature foldingFeature) {
        e eVar;
        e eVar2;
        Rect rect;
        WindowMetrics currentWindowMetrics;
        int type = foldingFeature.getType();
        if (type == 1) {
            eVar = e.f2226g;
        } else {
            if (type != 2) {
                return null;
            }
            eVar = e.f2227h;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            eVar2 = e.e;
        } else {
            if (state != 2) {
                return null;
            }
            eVar2 = e.f2225f;
        }
        Rect bounds = foldingFeature.getBounds();
        D1.i.d(bounds, "oemFeature.bounds");
        C0350b c0350b = new C0350b(bounds);
        int i = a.f2214b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            D1.i.d(rect, "activity.windowManager.currentWindowMetrics.bounds");
        } else if (i2 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e) {
                Log.w("a", e);
                rect = a.a(activity);
            } catch (NoSuchFieldException e2) {
                Log.w("a", e2);
                rect = a.a(activity);
            } catch (NoSuchMethodException e3) {
                Log.w("a", e3);
                rect = a.a(activity);
            } catch (InvocationTargetException e4) {
                Log.w("a", e4);
                rect = a.a(activity);
            }
        } else if (i2 >= 28) {
            rect = a.a(activity);
        } else {
            Rect rect2 = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect2);
            if (!activity.isInMultiWindowMode()) {
                Point c2 = a.c(defaultDisplay);
                int b2 = a.b(activity);
                int i3 = rect2.bottom + b2;
                if (i3 == c2.y) {
                    rect2.bottom = i3;
                } else {
                    int i4 = rect2.right + b2;
                    if (i4 == c2.x) {
                        rect2.right = i4;
                    }
                }
            }
            rect = rect2;
        }
        Rect c3 = new C0350b(rect).c();
        if (c0350b.a() == 0 && c0350b.b() == 0) {
            return null;
        }
        if (c0350b.b() != c3.width() && c0350b.a() != c3.height()) {
            return null;
        }
        if (c0350b.b() < c3.width() && c0350b.a() < c3.height()) {
            return null;
        }
        if (c0350b.b() == c3.width() && c0350b.a() == c3.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        D1.i.d(bounds2, "oemFeature.bounds");
        return new f(new C0350b(bounds2), eVar, eVar2);
    }

    public static z b(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        f fVar;
        D1.i.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        D1.i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                D1.i.d(foldingFeature, "feature");
                fVar = a(activity, foldingFeature);
            } else {
                fVar = null;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return new z(arrayList);
    }
}
