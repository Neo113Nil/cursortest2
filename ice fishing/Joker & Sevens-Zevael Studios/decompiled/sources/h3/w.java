package h3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static Field f2829a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2830b = false;

    static {
        new WeakHashMap();
    }

    public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            t.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void b(ViewGroup viewGroup, b bVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (bVar == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = t.a(viewGroup);
            } else {
                if (!f2830b) {
                    if (f2829a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f2829a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f2830b = true;
                        }
                    }
                    try {
                        Object obj = f2829a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f2830b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof a) {
                bVar = new b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(bVar != null ? bVar.f2748b : null);
    }

    public static void c(View view, z zVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(zVar != null ? new f0(zVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = e0.f2770e;
        View.OnApplyWindowInsetsListener d0Var = zVar != null ? new d0(view, zVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, d0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(d0Var);
        }
    }
}
