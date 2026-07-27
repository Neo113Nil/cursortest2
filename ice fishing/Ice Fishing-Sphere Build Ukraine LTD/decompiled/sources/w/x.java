package w;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static Field f3074a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3075b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0264b c0264b) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (c0264b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = AbstractC0282u.a(viewGroup);
            } else {
                if (!f3075b) {
                    if (f3074a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f3074a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f3075b = true;
                        }
                    }
                    try {
                        Object obj = f3074a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f3075b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0263a) {
                c0264b = new C0264b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(c0264b != null ? c0264b.f3051b : null);
    }
}
