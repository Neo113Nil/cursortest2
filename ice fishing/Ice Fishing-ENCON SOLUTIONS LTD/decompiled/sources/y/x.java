package y;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static Field f8596a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8597b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C1069b c1069b) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c1069b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = AbstractC1087u.a(viewGroup);
            } else {
                if (!f8597b) {
                    if (f8596a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f8596a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f8597b = true;
                        }
                    }
                    try {
                        Object obj = f8596a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f8597b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C1068a) {
                c1069b = new C1069b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c1069b != null ? c1069b.f8573b : null);
    }
}
