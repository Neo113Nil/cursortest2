package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ar0 implements Window.Callback {
    public final Window.Callback a;
    public z6n b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ er0 f;

    public ar0(er0 er0Var, Window.Callback callback) {
        this.f = er0Var;
        if (callback != null) {
            this.a = callback;
        } else {
            xq0.x("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        dpv.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f.y(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            er0 er0Var = this.f;
            er0Var.F();
            qd qdVar = er0Var.o;
            if (qdVar == null || !qdVar.j(keyCode, keyEvent)) {
                dr0 dr0Var = er0Var.Y;
                if (dr0Var == null || !er0Var.K(dr0Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (er0Var.Y == null) {
                        dr0 E = er0Var.E(0);
                        er0Var.L(E, keyEvent);
                        boolean K = er0Var.K(E, keyEvent.getKeyCode(), keyEvent);
                        E.k = false;
                        if (K) {
                        }
                    }
                    return false;
                }
                dr0 dr0Var2 = er0Var.Y;
                if (dr0Var2 != null) {
                    dr0Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof hxh)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        z6n z6nVar = this.b;
        if (z6nVar != null) {
            View view = i == 0 ? new View(((tos) z6nVar.b).a.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            er0 er0Var = this.f;
            er0Var.F();
            qd qdVar = er0Var.o;
            if (qdVar != null) {
                qdVar.c(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        er0 er0Var = this.f;
        if (i == 108) {
            er0Var.F();
            qd qdVar = er0Var.o;
            if (qdVar != null) {
                qdVar.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            dr0 E = er0Var.E(i);
            if (E.m) {
                er0Var.w(E, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        epv.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        hxh hxhVar = menu instanceof hxh ? (hxh) menu : null;
        if (i == 0 && hxhVar == null) {
            return false;
        }
        if (hxhVar != null) {
            hxhVar.x = true;
        }
        z6n z6nVar = this.b;
        if (z6nVar != null && i == 0) {
            tos tosVar = (tos) z6nVar.b;
            if (!tosVar.d) {
                tosVar.a.l = true;
                tosVar.d = true;
            }
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (hxhVar != null) {
            hxhVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        hxh hxhVar = this.f.E(0).h;
        if (hxhVar != null) {
            d(list, hxhVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return cpv.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        er0 er0Var = this.f;
        if (!er0Var.z || i != 0) {
            return cpv.b(this.a, callback, i);
        }
        Context context = er0Var.k;
        x3n x3nVar = new x3n();
        x3nVar.b = context;
        x3nVar.a = callback;
        x3nVar.c = new ArrayList();
        x3nVar.d = new ciq(0);
        ig p = er0Var.p(x3nVar);
        if (p != null) {
            return x3nVar.a0(p);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
