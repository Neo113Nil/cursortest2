package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.core.view.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class wdu {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final idu e = new idu();
    public static final kdu f = new kdu();

    public static void a(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static wgu b(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        wgu wguVar = (wgu) a.get(view);
        if (wguVar != null) {
            return wguVar;
        }
        wgu wguVar2 = new wgu(view);
        a.put(view, wguVar2);
        return wguVar2;
    }

    public static kqv c(View view, kqv kqvVar) {
        WindowInsets g = kqvVar.g();
        if (g != null) {
            WindowInsets a2 = Build.VERSION.SDK_INT >= 30 ? tdu.a(view, g) : ldu.a(view, g);
            if (!a2.equals(g)) {
                return kqv.h(view, a2);
            }
        }
        return kqvVar;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = vdu.d;
        vdu vduVar = (vdu) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (vduVar == null) {
            vduVar = new vdu();
            vduVar.a = null;
            vduVar.b = null;
            vduVar.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, vduVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = vduVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = vdu.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (vduVar.a == null) {
                            vduVar.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = vdu.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                vduVar.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    vduVar.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = vduVar.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (vduVar.b == null) {
                    vduVar.b = new SparseArray();
                }
                vduVar.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static a e(View view) {
        View.AccessibilityDelegate f2 = f(view);
        if (f2 == null) {
            return null;
        }
        return f2 instanceof ua ? ((ua) f2).a : new a(f2);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return sdu.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence g(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = rdu.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] i(kr0 kr0Var) {
        return Build.VERSION.SDK_INT >= 31 ? udu.a(kr0Var) : (String[]) kr0Var.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static pqv j(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return tdu.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new pqv(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void k(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static kqv l(View view, kqv kqvVar) {
        WindowInsets g = kqvVar.g();
        if (g != null) {
            WindowInsets b2 = ldu.b(view, g);
            if (!b2.equals(g)) {
                return kqv.h(view, b2);
            }
        }
        return kqvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jc6 m(View view, jc6 jc6Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + jc6Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return udu.b(view, jc6Var);
        }
        pes pesVar = (pes) view.getTag(R.id.tag_on_receive_content_listener);
        pqj pqjVar = e;
        if (pesVar == null) {
            if (view instanceof pqj) {
                pqjVar = (pqj) view;
            }
            return pqjVar.b(jc6Var);
        }
        jc6 a2 = pes.a(view, jc6Var);
        if (a2 == null) {
            return null;
        }
        if (view instanceof pqj) {
            pqjVar = (pqj) view;
        }
        return pqjVar.b(a2);
    }

    public static void n(int i, View view) {
        ArrayList h = h(view);
        for (int i2 = 0; i2 < h.size(); i2++) {
            if (((qb) h.get(i2)).a() == i) {
                h.remove(i2);
                return;
            }
        }
    }

    public static void o(View view, qb qbVar, CharSequence charSequence, ic icVar) {
        if (icVar == null && charSequence == null) {
            n(qbVar.a(), view);
            k(0, view);
            return;
        }
        qb qbVar2 = new qb(null, qbVar.b, charSequence, icVar, qbVar.c);
        a e2 = e(view);
        if (e2 == null) {
            e2 = new a();
        }
        q(view, e2);
        n(qbVar2.a(), view);
        h(view).add(qbVar2);
        k(0, view);
    }

    public static void p(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            sdu.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void q(View view, a aVar) {
        if (aVar == null && (f(view) instanceof ua)) {
            aVar = new a();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.b);
    }

    public static void r(View view, CharSequence charSequence) {
        new jdu(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        kdu kduVar = f;
        if (charSequence == null) {
            kduVar.a.remove(view);
            view.removeOnAttachStateChangeListener(kduVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(kduVar);
        } else {
            kduVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(kduVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(kduVar);
            }
        }
    }

    public static void s(View view, CharSequence charSequence) {
        new jdu(R.id.tag_state_description, CharSequence.class, 64, 30, 2).g(view, charSequence);
    }

    public static void t(View view, rr4 rr4Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            tpv.h(view, rr4Var);
            return;
        }
        PathInterpolator pathInterpolator = rpv.e;
        View.OnApplyWindowInsetsListener qpvVar = rr4Var != null ? new qpv(view, rr4Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, qpvVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(qpvVar);
        }
    }
}
