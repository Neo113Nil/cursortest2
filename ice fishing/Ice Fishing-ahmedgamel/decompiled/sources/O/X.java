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
import com.IceFishing.LiveIceFishing.C5248R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C4727u;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f2142a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f2143b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2144c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2145d = {C5248R.id.accessibility_custom_action_0, C5248R.id.accessibility_custom_action_1, C5248R.id.accessibility_custom_action_2, C5248R.id.accessibility_custom_action_3, C5248R.id.accessibility_custom_action_4, C5248R.id.accessibility_custom_action_5, C5248R.id.accessibility_custom_action_6, C5248R.id.accessibility_custom_action_7, C5248R.id.accessibility_custom_action_8, C5248R.id.accessibility_custom_action_9, C5248R.id.accessibility_custom_action_10, C5248R.id.accessibility_custom_action_11, C5248R.id.accessibility_custom_action_12, C5248R.id.accessibility_custom_action_13, C5248R.id.accessibility_custom_action_14, C5248R.id.accessibility_custom_action_15, C5248R.id.accessibility_custom_action_16, C5248R.id.accessibility_custom_action_17, C5248R.id.accessibility_custom_action_18, C5248R.id.accessibility_custom_action_19, C5248R.id.accessibility_custom_action_20, C5248R.id.accessibility_custom_action_21, C5248R.id.accessibility_custom_action_22, C5248R.id.accessibility_custom_action_23, C5248R.id.accessibility_custom_action_24, C5248R.id.accessibility_custom_action_25, C5248R.id.accessibility_custom_action_26, C5248R.id.accessibility_custom_action_27, C5248R.id.accessibility_custom_action_28, C5248R.id.accessibility_custom_action_29, C5248R.id.accessibility_custom_action_30, C5248R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final F f2146e = new F();

    /* renamed from: f, reason: collision with root package name */
    public static final H f2147f = new H();

    public static C0335e0 a(View view) {
        if (f2142a == null) {
            f2142a = new WeakHashMap();
        }
        C0335e0 c0335e0 = (C0335e0) f2142a.get(view);
        if (c0335e0 != null) {
            return c0335e0;
        }
        C0335e0 c0335e02 = new C0335e0(view);
        f2142a.put(view, c0335e02);
        return c0335e02;
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
        ArrayList arrayList = W.f2138d;
        W w3 = (W) view.getTag(C5248R.id.tag_unhandled_key_event_manager);
        if (w3 == null) {
            w3 = new W();
            w3.f2139a = null;
            w3.f2140b = null;
            w3.f2141c = null;
            view.setTag(C5248R.id.tag_unhandled_key_event_manager, w3);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = w3.f2139a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = W.f2138d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (w3.f2139a == null) {
                            w3.f2139a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = W.f2138d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                w3.f2139a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    w3.f2139a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a9 = w3.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a9 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (w3.f2140b == null) {
                    w3.f2140b = new SparseArray();
                }
                w3.f2140b.put(keyCode, new WeakReference(a9));
            }
        }
        return a9 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Q.a(view);
        }
        if (f2144c) {
            return null;
        }
        if (f2143b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2143b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2144c = true;
                return null;
            }
        }
        try {
            Object obj = f2143b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2144c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = P.b(view);
        } else {
            tag = view.getTag(C5248R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C5248R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C5248R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(C4727u c4727u) {
        return Build.VERSION.SDK_INT >= 31 ? T.a(c4727u) : (String[]) c4727u.getTag(C5248R.id.tag_on_receive_content_mime_types);
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
            boolean z6 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z6 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z6) {
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
    public static C0336f k(View view, C0336f c0336f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0336f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return T.b(view, c0336f);
        }
        InterfaceC0351v interfaceC0351v = (InterfaceC0351v) view.getTag(C5248R.id.tag_on_receive_content_listener);
        InterfaceC0352w interfaceC0352w = f2146e;
        if (interfaceC0351v == null) {
            if (view instanceof InterfaceC0352w) {
                interfaceC0352w = (InterfaceC0352w) view;
            }
            return interfaceC0352w.a(c0336f);
        }
        C0336f a9 = ((U.r) interfaceC0351v).a(view, c0336f);
        if (a9 == null) {
            return null;
        }
        if (view instanceof InterfaceC0352w) {
            interfaceC0352w = (InterfaceC0352w) view;
        }
        return interfaceC0352w.a(a9);
    }

    public static void l(int i, View view) {
        ArrayList f2 = f(view);
        for (int i4 = 0; i4 < f2.size(); i4++) {
            if (((P.f) f2.get(i4)).a() == i) {
                f2.remove(i4);
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
        P.f fVar2 = new P.f(null, fVar.f2335b, null, uVar, fVar.f2336c);
        View.AccessibilityDelegate d9 = d(view);
        C0328b c0328b = d9 == null ? null : d9 instanceof C0326a ? ((C0326a) d9).f2148a : new C0328b(d9);
        if (c0328b == null) {
            c0328b = new C0328b();
        }
        o(view, c0328b);
        l(fVar2.a(), view);
        f(view).add(fVar2);
        i(0, view);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Q.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void o(View view, C0328b c0328b) {
        if (c0328b == null && (d(view) instanceof C0326a)) {
            c0328b = new C0328b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0328b == null ? null : c0328b.f2151b);
    }

    public static void p(View view, CharSequence charSequence) {
        new G(C5248R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        H h3 = f2147f;
        if (charSequence == null) {
            h3.f2129n.remove(view);
            view.removeOnAttachStateChangeListener(h3);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(h3);
        } else {
            h3.f2129n.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(h3);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(h3);
            }
        }
    }
}
