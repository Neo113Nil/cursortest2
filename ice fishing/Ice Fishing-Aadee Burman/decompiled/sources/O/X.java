package O;

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
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.icefishing.icefishinglive2.C5275R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C4714u;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2054a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2055b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2056c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2057d = {C5275R.id.accessibility_custom_action_0, C5275R.id.accessibility_custom_action_1, C5275R.id.accessibility_custom_action_2, C5275R.id.accessibility_custom_action_3, C5275R.id.accessibility_custom_action_4, C5275R.id.accessibility_custom_action_5, C5275R.id.accessibility_custom_action_6, C5275R.id.accessibility_custom_action_7, C5275R.id.accessibility_custom_action_8, C5275R.id.accessibility_custom_action_9, C5275R.id.accessibility_custom_action_10, C5275R.id.accessibility_custom_action_11, C5275R.id.accessibility_custom_action_12, C5275R.id.accessibility_custom_action_13, C5275R.id.accessibility_custom_action_14, C5275R.id.accessibility_custom_action_15, C5275R.id.accessibility_custom_action_16, C5275R.id.accessibility_custom_action_17, C5275R.id.accessibility_custom_action_18, C5275R.id.accessibility_custom_action_19, C5275R.id.accessibility_custom_action_20, C5275R.id.accessibility_custom_action_21, C5275R.id.accessibility_custom_action_22, C5275R.id.accessibility_custom_action_23, C5275R.id.accessibility_custom_action_24, C5275R.id.accessibility_custom_action_25, C5275R.id.accessibility_custom_action_26, C5275R.id.accessibility_custom_action_27, C5275R.id.accessibility_custom_action_28, C5275R.id.accessibility_custom_action_29, C5275R.id.accessibility_custom_action_30, C5275R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final F f2058e = new F();

    /* renamed from: f, reason: collision with root package name */
    public static final H f2059f = new H();

    public static C0330e0 a(View view) {
        if (f2054a == null) {
            f2054a = new WeakHashMap();
        }
        C0330e0 c0330e0 = (C0330e0) f2054a.get(view);
        if (c0330e0 != null) {
            return c0330e0;
        }
        C0330e0 c0330e02 = new C0330e0(view);
        f2054a.put(view, c0330e02);
        return c0330e02;
    }

    public static A0 b(View view, A0 a02) {
        WindowInsets g4 = a02.g();
        if (g4 != null) {
            WindowInsets a9 = J.a(view, g4);
            if (!a9.equals(g4)) {
                return A0.h(view, a9);
            }
        }
        return a02;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = W.f2050d;
        W w6 = (W) view.getTag(C5275R.id.tag_unhandled_key_event_manager);
        if (w6 == null) {
            w6 = new W();
            w6.f2051a = null;
            w6.f2052b = null;
            w6.f2053c = null;
            view.setTag(C5275R.id.tag_unhandled_key_event_manager, w6);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = w6.f2051a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = W.f2050d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (w6.f2051a == null) {
                            w6.f2051a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = W.f2050d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                w6.f2051a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    w6.f2051a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a9 = w6.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a9 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (w6.f2052b == null) {
                    w6.f2052b = new SparseArray();
                }
                w6.f2052b.put(keyCode, new WeakReference(a9));
            }
        }
        return a9 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Q.a(view);
        }
        if (f2056c) {
            return null;
        }
        if (f2055b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2055b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2056c = true;
                return null;
            }
        }
        try {
            Object obj = f2055b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2056c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = P.b(view);
        } else {
            tag = view.getTag(C5275R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C5275R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C5275R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(C4714u c4714u) {
        return Build.VERSION.SDK_INT >= 31 ? T.a(c4714u) : (String[]) c4714u.getTag(C5275R.id.tag_on_receive_content_mime_types);
    }

    public static E0 h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return S.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new E0(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void i(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z3 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z3) {
                    obtain.getText().add(e(view));
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
                    } catch (AbstractMethodError e9) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e9);
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
            obtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static A0 j(View view, A0 a02) {
        WindowInsets g4 = a02.g();
        if (g4 != null) {
            WindowInsets b9 = J.b(view, g4);
            if (!b9.equals(g4)) {
                return A0.h(view, b9);
            }
        }
        return a02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0331f k(View view, C0331f c0331f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0331f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return T.b(view, c0331f);
        }
        InterfaceC0346v interfaceC0346v = (InterfaceC0346v) view.getTag(C5275R.id.tag_on_receive_content_listener);
        InterfaceC0347w interfaceC0347w = f2058e;
        if (interfaceC0346v == null) {
            if (view instanceof InterfaceC0347w) {
                interfaceC0347w = (InterfaceC0347w) view;
            }
            return interfaceC0347w.a(c0331f);
        }
        C0331f a9 = ((U.r) interfaceC0346v).a(view, c0331f);
        if (a9 == null) {
            return null;
        }
        if (view instanceof InterfaceC0347w) {
            interfaceC0347w = (InterfaceC0347w) view;
        }
        return interfaceC0347w.a(a9);
    }

    public static void l(int i, View view) {
        ArrayList f3 = f(view);
        for (int i6 = 0; i6 < f3.size(); i6++) {
            if (((P.f) f3.get(i6)).a() == i) {
                f3.remove(i6);
                return;
            }
        }
    }

    public static void m(View view, P.f fVar, P.u uVar) {
        if (uVar == null) {
            l(fVar.a(), view);
            i(0, view);
            return;
        }
        P.f fVar2 = new P.f(null, fVar.f2404b, null, uVar, fVar.f2405c);
        View.AccessibilityDelegate d2 = d(view);
        C0323b c0323b = d2 == null ? null : d2 instanceof C0321a ? ((C0321a) d2).f2060a : new C0323b(d2);
        if (c0323b == null) {
            c0323b = new C0323b();
        }
        o(view, c0323b);
        l(fVar2.a(), view);
        f(view).add(fVar2);
        i(0, view);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Q.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void o(View view, C0323b c0323b) {
        if (c0323b == null && (d(view) instanceof C0321a)) {
            c0323b = new C0323b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0323b == null ? null : c0323b.f2063b);
    }

    public static void p(View view, CharSequence charSequence) {
        new G(C5275R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        H h9 = f2059f;
        if (charSequence == null) {
            h9.f2041n.remove(view);
            view.removeOnAttachStateChangeListener(h9);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(h9);
        } else {
            h9.f2041n.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(h9);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(h9);
            }
        }
    }
}
