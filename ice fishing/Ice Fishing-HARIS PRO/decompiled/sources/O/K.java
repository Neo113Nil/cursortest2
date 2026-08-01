package O;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C0285w;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f747a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f748b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f749c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f750d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final C0045v e = new C0045v();

    /* renamed from: f, reason: collision with root package name */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0047x f751f = new ViewTreeObserverOnGlobalLayoutListenerC0047x();

    public static N a(View view) {
        if (f747a == null) {
            f747a = new WeakHashMap();
        }
        N n2 = (N) f747a.get(view);
        if (n2 != null) {
            return n2;
        }
        N n3 = new N(view);
        f747a.put(view, n3);
        return n3;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = J.f743d;
        J j = (J) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (j == null) {
            j = new J();
            j.f744a = null;
            j.f745b = null;
            j.f746c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, j);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = j.f744a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = J.f743d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (j.f744a == null) {
                            j.f744a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = J.f743d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                j.f744a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    j.f744a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = j.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (j.f745b == null) {
                    j.f745b = new SparseArray();
                }
                j.f745b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return G.a(view);
        }
        if (f749c) {
            return null;
        }
        if (f748b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f748b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f749c = true;
                return null;
            }
        }
        try {
            Object obj = f748b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f749c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = F.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(C0285w c0285w) {
        return Build.VERSION.SDK_INT >= 31 ? I.a(c0285w) : (String[]) c0285w.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z2) {
                    obtain.getText().add(d(view));
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
            obtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0030f h(View view, C0030f c0030f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0030f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return I.b(view, c0030f);
        }
        R.k kVar = (R.k) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0040p interfaceC0040p = e;
        if (kVar == null) {
            if (view instanceof InterfaceC0040p) {
                interfaceC0040p = (InterfaceC0040p) view;
            }
            return interfaceC0040p.a(c0030f);
        }
        C0030f a2 = R.k.a(view, c0030f);
        if (a2 == null) {
            return null;
        }
        if (view instanceof InterfaceC0040p) {
            interfaceC0040p = (InterfaceC0040p) view;
        }
        return interfaceC0040p.a(a2);
    }

    public static void i(View view, int i) {
        ArrayList e2 = e(view);
        for (int i2 = 0; i2 < e2.size(); i2++) {
            if (((P.d) e2.get(i2)).a() == i) {
                e2.remove(i2);
                return;
            }
        }
    }

    public static void j(View view, P.d dVar, P.o oVar) {
        P.d dVar2 = new P.d(null, dVar.f888b, null, oVar, dVar.f889c);
        View.AccessibilityDelegate c2 = c(view);
        C0026b c0026b = c2 == null ? null : c2 instanceof C0025a ? ((C0025a) c2).f783a : new C0026b(c2);
        if (c0026b == null) {
            c0026b = new C0026b();
        }
        l(view, c0026b);
        i(view, dVar2.a());
        e(view).add(dVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            G.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, C0026b c0026b) {
        if (c0026b == null && (c(view) instanceof C0025a)) {
            c0026b = new C0026b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0026b == null ? null : c0026b.f786b);
    }

    public static void m(View view, CharSequence charSequence) {
        new C0046w(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0047x viewTreeObserverOnGlobalLayoutListenerC0047x = f751f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0047x.f835a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0047x);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0047x);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0047x.f835a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0047x);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0047x);
            }
        }
    }
}
