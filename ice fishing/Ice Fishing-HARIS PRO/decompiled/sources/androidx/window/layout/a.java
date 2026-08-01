package androidx.window.layout;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2213a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2214b = 0;

    public static Rect a(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                if (invoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e) {
            Log.w("a", e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e2) {
            Log.w("a", e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e3) {
            Log.w("a", e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e4) {
            Log.w("a", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        D1.i.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int b2 = b(activity);
            int i = rect.bottom + b2;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + b2;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == b2) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (M.c.t(obj2)) {
                    displayCutout = M.c.l(obj2);
                }
            } catch (ClassNotFoundException e5) {
                Log.w("a", e5);
            } catch (IllegalAccessException e6) {
                Log.w("a", e6);
            } catch (InstantiationException e7) {
                Log.w("a", e7);
            } catch (NoSuchFieldException e8) {
                Log.w("a", e8);
            } catch (NoSuchMethodException e9) {
                Log.w("a", e9);
            } catch (InvocationTargetException e10) {
                Log.w("a", e10);
            }
            if (displayCutout != null) {
                int i3 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i3 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i4 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i4 == safeInsetRight) {
                    int i5 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i5;
                }
                int i6 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i6 == safeInsetTop) {
                    rect.top = 0;
                }
                int i7 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i7 == safeInsetBottom) {
                    int i8 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i8;
                }
            }
        }
        return rect;
    }

    public static int b(Activity activity) {
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static Point c(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
