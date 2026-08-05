package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.kolosta.rejin.jilosa.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class hg0 {
    public static boolean MdtA4re8 = false;
    public static Field NCTxEWno;
    public static WeakHashMap qoPGr6Ce;
    public static final uf0 wxUZMvaN = new uf0();
    public static final wf0 VgvYg0wo = new wf0();

    public static boolean MdtA4re8(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = gg0.wxUZMvaN;
        gg0 gg0Var = (gg0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (gg0Var == null) {
            gg0Var = new gg0();
            gg0Var.qoPGr6Ce = null;
            gg0Var.NCTxEWno = null;
            gg0Var.MdtA4re8 = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, gg0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = gg0Var.qoPGr6Ce;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = gg0.wxUZMvaN;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (gg0Var.qoPGr6Ce == null) {
                            gg0Var.qoPGr6Ce = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = gg0.wxUZMvaN;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                gg0Var.qoPGr6Ce.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    gg0Var.qoPGr6Ce.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View qoPGr6Ce2 = gg0Var.qoPGr6Ce(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (qoPGr6Ce2 != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = gg0Var.NCTxEWno;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    gg0Var.NCTxEWno = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(qoPGr6Ce2));
            }
        }
        return qoPGr6Ce2 != null;
    }

    public static void NCTxEWno(View view, wi0 wi0Var) {
        WindowInsets wxUZMvaN2 = wi0Var.wxUZMvaN();
        if (wxUZMvaN2 != null) {
            WindowInsets qoPGr6Ce2 = Build.VERSION.SDK_INT >= 30 ? eg0.qoPGr6Ce(view, wxUZMvaN2) : xf0.qoPGr6Ce(view, wxUZMvaN2);
            if (qoPGr6Ce2.equals(wxUZMvaN2)) {
                return;
            }
            wi0.VgvYg0wo(qoPGr6Ce2, view);
        }
    }

    public static String[] P7K7Inc8(qIGtQL9b qigtql9b) {
        return Build.VERSION.SDK_INT >= 31 ? fg0.qoPGr6Ce(qigtql9b) : (String[]) qigtql9b.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c9 Qr9iLBAD(View view, c9 c9Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c9Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return fg0.NCTxEWno(view, c9Var);
        }
        hc0 hc0Var = (hc0) view.getTag(R.id.tag_on_receive_content_listener);
        dx dxVar = wxUZMvaN;
        if (hc0Var == null) {
            if (view instanceof dx) {
                dxVar = (dx) view;
            }
            return dxVar.qoPGr6Ce(c9Var);
        }
        c9 qoPGr6Ce2 = hc0.qoPGr6Ce(view, c9Var);
        if (qoPGr6Ce2 == null) {
            return null;
        }
        if (view instanceof dx) {
            dxVar = (dx) view;
        }
        return dxVar.qoPGr6Ce(qoPGr6Ce2);
    }

    public static View.AccessibilityDelegate VgvYg0wo(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return dg0.qoPGr6Ce(view);
        }
        if (MdtA4re8) {
            return null;
        }
        if (NCTxEWno == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                NCTxEWno = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                MdtA4re8 = true;
                return null;
            }
        }
        try {
            Object obj = NCTxEWno.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            MdtA4re8 = true;
            return null;
        }
    }

    public static void b2ZJblxo(View view, int i) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = cg0.qoPGr6Ce(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    List<CharSequence> text = obtain.getText();
                    if (i2 >= 28) {
                        charSequence = cg0.qoPGr6Ce(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
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
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
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
            List<CharSequence> text2 = obtain2.getText();
            if (i2 >= 28) {
                charSequence = cg0.qoPGr6Ce(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static void eVhOlqcC(View view, Mq3SeTnW mq3SeTnW) {
        if (mq3SeTnW == null && (VgvYg0wo(view) instanceof i7xS8jrb)) {
            mq3SeTnW = new Mq3SeTnW();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(mq3SeTnW == null ? null : mq3SeTnW.NCTxEWno);
    }

    public static void jb9XjC4I(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            dg0.NCTxEWno(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void k3x7lurq(View view, CharSequence charSequence) {
        new vf0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).P7K7Inc8(view, charSequence);
        wf0 wf0Var = VgvYg0wo;
        if (charSequence == null) {
            wf0Var.NCTxEWno.remove(view);
            view.removeOnAttachStateChangeListener(wf0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(wf0Var);
        } else {
            wf0Var.NCTxEWno.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(wf0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(wf0Var);
            }
        }
    }

    public static xg0 qoPGr6Ce(View view) {
        WeakHashMap weakHashMap = qoPGr6Ce;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            qoPGr6Ce = weakHashMap;
        }
        xg0 xg0Var = (xg0) weakHashMap.get(view);
        if (xg0Var != null) {
            return xg0Var;
        }
        xg0 xg0Var2 = new xg0(view);
        qoPGr6Ce.put(view, xg0Var2);
        return xg0Var2;
    }

    public static boolean wxUZMvaN(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = gg0.wxUZMvaN;
            gg0 gg0Var = (gg0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (gg0Var == null) {
                gg0Var = new gg0();
                gg0Var.qoPGr6Ce = null;
                gg0Var.NCTxEWno = null;
                gg0Var.MdtA4re8 = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, gg0Var);
            }
            WeakReference weakReference2 = gg0Var.MdtA4re8;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                gg0Var.MdtA4re8 = new WeakReference(keyEvent);
                SparseArray sparseArray = gg0Var.NCTxEWno;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    gg0Var.NCTxEWno = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    m1.qoPGr6Ce();
                    return false;
                }
            }
        }
        return false;
    }
}
