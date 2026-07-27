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
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C4762u;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2240a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2241b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2242c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2243d = {C5284R.id.accessibility_custom_action_0, C5284R.id.accessibility_custom_action_1, C5284R.id.accessibility_custom_action_2, C5284R.id.accessibility_custom_action_3, C5284R.id.accessibility_custom_action_4, C5284R.id.accessibility_custom_action_5, C5284R.id.accessibility_custom_action_6, C5284R.id.accessibility_custom_action_7, C5284R.id.accessibility_custom_action_8, C5284R.id.accessibility_custom_action_9, C5284R.id.accessibility_custom_action_10, C5284R.id.accessibility_custom_action_11, C5284R.id.accessibility_custom_action_12, C5284R.id.accessibility_custom_action_13, C5284R.id.accessibility_custom_action_14, C5284R.id.accessibility_custom_action_15, C5284R.id.accessibility_custom_action_16, C5284R.id.accessibility_custom_action_17, C5284R.id.accessibility_custom_action_18, C5284R.id.accessibility_custom_action_19, C5284R.id.accessibility_custom_action_20, C5284R.id.accessibility_custom_action_21, C5284R.id.accessibility_custom_action_22, C5284R.id.accessibility_custom_action_23, C5284R.id.accessibility_custom_action_24, C5284R.id.accessibility_custom_action_25, C5284R.id.accessibility_custom_action_26, C5284R.id.accessibility_custom_action_27, C5284R.id.accessibility_custom_action_28, C5284R.id.accessibility_custom_action_29, C5284R.id.accessibility_custom_action_30, C5284R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final F f2244e = new F();

    /* renamed from: f, reason: collision with root package name */
    public static final H f2245f = new H();

    public static C0343e0 a(View view) {
        if (f2240a == null) {
            f2240a = new WeakHashMap();
        }
        C0343e0 c0343e0 = (C0343e0) f2240a.get(view);
        if (c0343e0 != null) {
            return c0343e0;
        }
        C0343e0 c0343e02 = new C0343e0(view);
        f2240a.put(view, c0343e02);
        return c0343e02;
    }

    public static A0 b(View view, A0 a02) {
        WindowInsets g9 = a02.g();
        if (g9 != null) {
            WindowInsets a9 = J.a(view, g9);
            if (!a9.equals(g9)) {
                return A0.h(view, a9);
            }
        }
        return a02;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = W.f2236d;
        W w9 = (W) view.getTag(C5284R.id.tag_unhandled_key_event_manager);
        if (w9 == null) {
            w9 = new W();
            w9.f2237a = null;
            w9.f2238b = null;
            w9.f2239c = null;
            view.setTag(C5284R.id.tag_unhandled_key_event_manager, w9);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = w9.f2237a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = W.f2236d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (w9.f2237a == null) {
                            w9.f2237a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = W.f2236d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                w9.f2237a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    w9.f2237a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a9 = w9.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a9 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (w9.f2238b == null) {
                    w9.f2238b = new SparseArray();
                }
                w9.f2238b.put(keyCode, new WeakReference(a9));
            }
        }
        return a9 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Q.a(view);
        }
        if (f2242c) {
            return null;
        }
        if (f2241b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2241b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2242c = true;
                return null;
            }
        }
        try {
            Object obj = f2241b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2242c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = P.b(view);
        } else {
            tag = view.getTag(C5284R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C5284R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C5284R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(C4762u c4762u) {
        return Build.VERSION.SDK_INT >= 31 ? T.a(c4762u) : (String[]) c4762u.getTag(C5284R.id.tag_on_receive_content_mime_types);
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
            boolean z8 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z8) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z8 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z8) {
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
                    } catch (AbstractMethodError e6) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
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
        WindowInsets g9 = a02.g();
        if (g9 != null) {
            WindowInsets b9 = J.b(view, g9);
            if (!b9.equals(g9)) {
                return A0.h(view, b9);
            }
        }
        return a02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0344f k(View view, C0344f c0344f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0344f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return T.b(view, c0344f);
        }
        InterfaceC0359v interfaceC0359v = (InterfaceC0359v) view.getTag(C5284R.id.tag_on_receive_content_listener);
        InterfaceC0360w interfaceC0360w = f2244e;
        if (interfaceC0359v == null) {
            if (view instanceof InterfaceC0360w) {
                interfaceC0360w = (InterfaceC0360w) view;
            }
            return interfaceC0360w.a(c0344f);
        }
        C0344f a9 = ((U.r) interfaceC0359v).a(view, c0344f);
        if (a9 == null) {
            return null;
        }
        if (view instanceof InterfaceC0360w) {
            interfaceC0360w = (InterfaceC0360w) view;
        }
        return interfaceC0360w.a(a9);
    }

    public static void l(int i, View view) {
        ArrayList f6 = f(view);
        for (int i4 = 0; i4 < f6.size(); i4++) {
            if (((P.f) f6.get(i4)).a() == i) {
                f6.remove(i4);
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
        P.f fVar2 = new P.f(null, fVar.f2670b, null, uVar, fVar.f2671c);
        View.AccessibilityDelegate d2 = d(view);
        C0336b c0336b = d2 == null ? null : d2 instanceof C0334a ? ((C0334a) d2).f2246a : new C0336b(d2);
        if (c0336b == null) {
            c0336b = new C0336b();
        }
        o(view, c0336b);
        l(fVar2.a(), view);
        f(view).add(fVar2);
        i(0, view);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Q.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void o(View view, C0336b c0336b) {
        if (c0336b == null && (d(view) instanceof C0334a)) {
            c0336b = new C0336b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0336b == null ? null : c0336b.f2249b);
    }

    public static void p(View view, CharSequence charSequence) {
        new G(C5284R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        H h9 = f2245f;
        if (charSequence == null) {
            h9.f2227n.remove(view);
            view.removeOnAttachStateChangeListener(h9);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(h9);
        } else {
            h9.f2227n.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(h9);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(h9);
            }
        }
    }
}
