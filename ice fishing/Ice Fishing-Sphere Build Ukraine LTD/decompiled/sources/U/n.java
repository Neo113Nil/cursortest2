package U;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import w.C0262F;
import w.G;
import w.H;
import w.S;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1046b = 0;

    static {
        new ArrayList(new u0.a(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static l a(Activity activity) {
        Rect rect;
        S b2;
        WindowMetrics currentWindowMetrics;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            E0.i.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i2 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                E0.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e2) {
                Log.w("n", e2);
                rect = b(activity);
            } catch (NoSuchFieldException e3) {
                Log.w("n", e3);
                rect = b(activity);
            } catch (NoSuchMethodException e4) {
                Log.w("n", e4);
                rect = b(activity);
            } catch (InvocationTargetException e5) {
                Log.w("n", e5);
                rect = b(activity);
            }
        } else if (i2 >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i3 = rect.bottom + dimensionPixelSize;
                if (i3 == point.y) {
                    rect.bottom = i3;
                } else {
                    int i4 = rect.right + dimensionPixelSize;
                    if (i4 == point.x) {
                        rect.right = i4;
                    }
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            b2 = (i5 >= 30 ? new H() : i5 >= 29 ? new G() : new C0262F()).b();
            E0.i.d(b2, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i5 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b2 = Y.b.f1080a.a(activity);
        }
        return new l(new R.b(rect), b2);
    }

    public static Rect b(Activity activity) {
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
                E0.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                E0.i.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e2) {
            Log.w("n", e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e3) {
            Log.w("n", e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e4) {
            Log.w("n", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e5) {
            Log.w("n", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        E0.i.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + dimensionPixelSize;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == dimensionPixelSize) {
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
                if (J.k.x(obj2)) {
                    displayCutout = J.k.p(obj2);
                }
            } catch (ClassNotFoundException e6) {
                Log.w("n", e6);
            } catch (IllegalAccessException e7) {
                Log.w("n", e7);
            } catch (InstantiationException e8) {
                Log.w("n", e8);
            } catch (NoSuchFieldException e9) {
                Log.w("n", e9);
            } catch (NoSuchMethodException e10) {
                Log.w("n", e10);
            } catch (InvocationTargetException e11) {
                Log.w("n", e11);
            }
            if (displayCutout != null) {
                int i4 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i4 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i5 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i5 == safeInsetRight) {
                    int i6 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i6;
                }
                int i7 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i7 == safeInsetTop) {
                    rect.top = 0;
                }
                int i8 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i8 == safeInsetBottom) {
                    int i9 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i9;
                }
            }
        }
        return rect;
    }
}
