package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class zqv implements yqv {
    public static final zqv b = new zqv();

    static {
        u75.d(1, 2, 4, 8, 16, 32, 64, 128);
    }

    public static xqv a(Activity activity) {
        Rect rect;
        kqv b2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rect = ye6.a(activity);
        } else if (i >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e) {
                Log.w("zqv", e);
                rect = c(activity);
            } catch (NoSuchFieldException e2) {
                Log.w("zqv", e2);
                rect = c(activity);
            } catch (NoSuchMethodException e3) {
                Log.w("zqv", e3);
                rect = c(activity);
            } catch (InvocationTargetException e4) {
                Log.w("zqv", e4);
                rect = c(activity);
            }
        } else if (i >= 28) {
            rect = c(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i2 = rect.bottom + dimensionPixelSize;
                if (i2 == point.y) {
                    rect.bottom = i2;
                } else {
                    int i3 = rect.right + dimensionPixelSize;
                    if (i3 == point.x) {
                        rect.right = i3;
                    }
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            b2 = (i4 >= 34 ? new zpv() : i4 >= 30 ? new ypv() : i4 >= 29 ? new xpv() : new wpv()).b();
            b2.getClass();
        } else {
            if (i4 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b2 = ye6.a.b(activity);
        }
        return new xqv(new mg3(rect), b2);
    }

    public static Rect c(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e) {
            Log.w("zqv", e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e2) {
            Log.w("zqv", e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e3) {
            Log.w("zqv", e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e4) {
            Log.w("zqv", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
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
                if (obj2 instanceof DisplayCutout) {
                    displayCutout = (DisplayCutout) obj2;
                }
            } catch (ClassNotFoundException e5) {
                Log.w("zqv", e5);
            } catch (IllegalAccessException e6) {
                Log.w("zqv", e6);
            } catch (InstantiationException e7) {
                Log.w("zqv", e7);
            } catch (NoSuchFieldException e8) {
                Log.w("zqv", e8);
            } catch (NoSuchMethodException e9) {
                Log.w("zqv", e9);
            } catch (InvocationTargetException e10) {
                Log.w("zqv", e10);
            }
            if (displayCutout != null) {
                if (rect.left == displayCutout.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutout.getSafeInsetRight()) {
                    rect.right = displayCutout.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutout.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutout.getSafeInsetBottom()) {
                    rect.bottom = displayCutout.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }

    public final xqv b(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            return ye6.c(context);
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            boolean z = context2 instanceof Activity;
            if (!z && !(context2 instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) context2;
                if (contextWrapper.getBaseContext() != null) {
                    context2 = contextWrapper.getBaseContext();
                    context2.getClass();
                }
            }
            if (z) {
                return a((Activity) context2);
            }
            if (!(context2 instanceof InputMethodService)) {
                throw new IllegalArgumentException(context + " is not a UiContext");
            }
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            defaultDisplay.getClass();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect(0, 0, point.x, point.y);
            int i = Build.VERSION.SDK_INT;
            kqv b2 = (i >= 34 ? new zpv() : i >= 30 ? new ypv() : i >= 29 ? new xpv() : new wpv()).b();
            b2.getClass();
            return new xqv(rect, b2);
        }
        wvs.g(context, " is not a UiContext", "Context ");
        return null;
    }
}
