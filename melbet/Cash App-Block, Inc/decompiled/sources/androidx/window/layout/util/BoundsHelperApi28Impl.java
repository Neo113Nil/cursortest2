package androidx.window.layout.util;

import android.app.Activity;
import android.app.Application;
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
import androidx.window.core.Bounds;
import androidx.window.layout.WindowMetrics;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class BoundsHelperApi28Impl implements BoundsHelper, DensityCompatHelper, WindowMetricsCompatHelper {
    public static final BoundsHelperApi28Impl INSTANCE = new BoundsHelperApi28Impl(0);
    public static final BoundsHelperApi28Impl INSTANCE$1 = new BoundsHelperApi28Impl(1);
    public static final BoundsHelperApi28Impl INSTANCE$2 = new BoundsHelperApi28Impl(2);
    public static final BoundsHelperApi28Impl INSTANCE$3 = new BoundsHelperApi28Impl(3);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BoundsHelperApi28Impl(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        DisplayCutout displayCutout = null;
        switch (this.$r8$classId) {
            case 0:
                Rect rect = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
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
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    Log.w("BoundsHelper", e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
                }
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
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
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        Log.w("BoundsHelper", e2);
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
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object invoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    invoke3.getClass();
                    return new Rect((Rect) invoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    Log.w("BoundsHelper", e3);
                    return INSTANCE.currentWindowBounds(activity);
                }
        }
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(ContextWrapper contextWrapper, DensityCompatHelper densityCompatHelper) {
        densityCompatHelper.getClass();
        Context context = contextWrapper;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                context = contextWrapper;
                break;
            }
            if ((context instanceof Activity) || (context instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) context;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            context = contextWrapper2.getBaseContext();
            context.getClass();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return new WindowMetrics(new Bounds((Build.VERSION.SDK_INT >= 30 ? BoundsHelperApi30Impl.INSTANCE : INSTANCE$1).currentWindowBounds(activity)), densityCompatHelper.density(activity));
        }
        if (!(context instanceof InputMethodService) && !(context instanceof Application)) {
            a$$ExternalSyntheticBUOutline0.m$3("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new WindowMetrics(new Rect(0, 0, point.x, point.y), densityCompatHelper.density(contextWrapper));
    }

    @Override // androidx.window.layout.util.DensityCompatHelper
    public float density(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }
}
