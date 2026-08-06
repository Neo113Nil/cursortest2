package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.combinations.level.experts.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ed extends Activity implements t90 {
    public final w90 OOA6hdeuvCS = new w90(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (o30.jivtDDk9H(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!o30.jivtDDk9H) {
                    try {
                        o30.Y6hRI1cF8 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    o30.jivtDDk9H = true;
                }
                Method method = o30.Y6hRI1cF8;
                boolean z = false;
                if (method != null) {
                    try {
                        Object invoke = method.invoke(actionBar, keyEvent);
                        if (invoke != null) {
                            z = ((Boolean) invoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i = ne1.GWasM1elztuh;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = me1.xqGvceK5x;
            me1 me1Var = (me1) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            if (me1Var == null) {
                me1Var = new me1();
                me1Var.GWasM1elztuh = null;
                me1Var.Yi7zF1RB1 = null;
                me1Var.X1lG3V04pd = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, me1Var);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = me1Var.GWasM1elztuh;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = me1.xqGvceK5x;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (me1Var.GWasM1elztuh == null) {
                                me1Var.GWasM1elztuh = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = me1.xqGvceK5x;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    me1Var.GWasM1elztuh.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        me1Var.GWasM1elztuh.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View GWasM1elztuh = me1Var.GWasM1elztuh(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (GWasM1elztuh != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (me1Var.Yi7zF1RB1 == null) {
                        me1Var.Yi7zF1RB1 = new SparseArray();
                    }
                    me1Var.Yi7zF1RB1.put(keyCode, new WeakReference(GWasM1elztuh));
                }
            }
            if (GWasM1elztuh != null) {
                return true;
            }
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (o30.jivtDDk9H(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = mu0.EljAMC1QTz;
        ku0.Yi7zF1RB1(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        w90 w90Var = this.OOA6hdeuvCS;
        w90Var.getClass();
        w90Var.X1lG3V04pd("setCurrentState");
        w90Var.OOA6hdeuvCS(m90.AvO7iQsrTN);
        super.onSaveInstanceState(bundle);
    }
}
