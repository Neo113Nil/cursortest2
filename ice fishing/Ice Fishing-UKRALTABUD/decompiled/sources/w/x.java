package w;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static Field f3069a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3070b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0270b c0270b) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c0270b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = AbstractC0288u.a(viewGroup);
            } else {
                if (!f3070b) {
                    if (f3069a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f3069a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f3070b = true;
                        }
                    }
                    try {
                        Object obj = f3069a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f3070b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0269a) {
                c0270b = new C0270b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c0270b != null ? c0270b.f3046b : null);
    }
}
