package h;

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
import i1.C4585b;
import java.util.List;
import k.AbstractC4625b;
import k.AbstractC4635l;
import k.AbstractC4636m;
import k.AbstractC4637n;

/* loaded from: classes.dex */
public final class w implements Window.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final Window.Callback f37943n;

    /* renamed from: u, reason: collision with root package name */
    public C4585b f37944u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f37945v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f37946w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f37947x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4537A f37948y;

    public w(LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A, Window.Callback callback) {
        this.f37948y = layoutInflaterFactory2C4537A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f37943n = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f37945v = true;
            callback.onContentChanged();
        } finally {
            this.f37945v = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f37943n.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f37943n.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        AbstractC4636m.a(this.f37943n, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f37943n.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f37946w;
        Window.Callback callback = this.f37943n;
        return z6 ? callback.dispatchKeyEvent(keyEvent) : this.f37948y.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f37943n.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = this.f37948y;
            layoutInflaterFactory2C4537A.C();
            AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
            if (abstractC4545a == null || !abstractC4545a.i(keyCode, keyEvent)) {
                z zVar = layoutInflaterFactory2C4537A.f37816n0;
                if (zVar == null || !layoutInflaterFactory2C4537A.H(zVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C4537A.f37816n0 == null) {
                        z B3 = layoutInflaterFactory2C4537A.B(0);
                        layoutInflaterFactory2C4537A.I(B3, keyEvent);
                        boolean H8 = layoutInflaterFactory2C4537A.H(B3, keyEvent.getKeyCode(), keyEvent);
                        B3.f37962k = false;
                        if (H8) {
                        }
                    }
                    return false;
                }
                z zVar2 = layoutInflaterFactory2C4537A.f37816n0;
                if (zVar2 != null) {
                    zVar2.f37963l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f37943n.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f37943n.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f37943n.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f37943n.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f37943n.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f37943n.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f37945v) {
            this.f37943n.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof l.m)) {
            return this.f37943n.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C4585b c4585b = this.f37944u;
        if (c4585b != null) {
            View view = i == 0 ? new View(((C4544H) c4585b.f38152u).f37844a.f39151a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f37943n.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f37943n.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f37943n.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = this.f37948y;
        if (i == 108) {
            layoutInflaterFactory2C4537A.C();
            AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
            if (abstractC4545a != null) {
                abstractC4545a.c(true);
            }
        } else {
            layoutInflaterFactory2C4537A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f37947x) {
            this.f37943n.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = this.f37948y;
        if (i == 108) {
            layoutInflaterFactory2C4537A.C();
            AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
            if (abstractC4545a != null) {
                abstractC4545a.c(false);
                return;
            }
            return;
        }
        if (i != 0) {
            layoutInflaterFactory2C4537A.getClass();
            return;
        }
        z B3 = layoutInflaterFactory2C4537A.B(i);
        if (B3.f37964m) {
            layoutInflaterFactory2C4537A.t(B3, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z6) {
        AbstractC4637n.a(this.f37943n, z6);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        l.m mVar = menu instanceof l.m ? (l.m) menu : null;
        if (i == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f38746Q = true;
        }
        C4585b c4585b = this.f37944u;
        if (c4585b != null && i == 0) {
            C4544H c4544h = (C4544H) c4585b.f38152u;
            if (!c4544h.f37847d) {
                c4544h.f37844a.f39161l = true;
                c4544h.f37847d = true;
            }
        }
        boolean onPreparePanel = this.f37943n.onPreparePanel(i, view, menu);
        if (mVar != null) {
            mVar.f38746Q = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        l.m mVar = this.f37948y.B(0).f37960h;
        if (mVar != null) {
            d(list, mVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC4635l.a(this.f37943n, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f37943n.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        this.f37943n.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = this.f37948y;
        layoutInflaterFactory2C4537A.getClass();
        if (i != 0) {
            return AbstractC4635l.b(this.f37943n, callback, i);
        }
        S0.n nVar = new S0.n(layoutInflaterFactory2C4537A.f37786D, callback);
        AbstractC4625b n9 = layoutInflaterFactory2C4537A.n(nVar);
        if (n9 != null) {
            return nVar.k(n9);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f37943n.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
