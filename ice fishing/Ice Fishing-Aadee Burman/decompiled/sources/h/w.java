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
import g1.C4523c;
import java.util.List;
import k.AbstractC4615b;
import k.AbstractC4625l;
import k.AbstractC4626m;
import k.AbstractC4627n;

/* loaded from: classes.dex */
public final class w implements Window.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final Window.Callback f37917n;

    /* renamed from: u, reason: collision with root package name */
    public C4523c f37918u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f37919v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f37920w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f37921x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4533A f37922y;

    public w(LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A, Window.Callback callback) {
        this.f37922y = layoutInflaterFactory2C4533A;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f37917n = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f37919v = true;
            callback.onContentChanged();
        } finally {
            this.f37919v = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f37917n.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f37917n.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        AbstractC4626m.a(this.f37917n, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f37917n.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f37920w;
        Window.Callback callback = this.f37917n;
        return z3 ? callback.dispatchKeyEvent(keyEvent) : this.f37922y.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f37917n.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = this.f37922y;
            layoutInflaterFactory2C4533A.C();
            AbstractC4541a abstractC4541a = layoutInflaterFactory2C4533A.f37768H;
            if (abstractC4541a == null || !abstractC4541a.i(keyCode, keyEvent)) {
                z zVar = layoutInflaterFactory2C4533A.f37796s0;
                if (zVar == null || !layoutInflaterFactory2C4533A.H(zVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C4533A.f37796s0 == null) {
                        z B9 = layoutInflaterFactory2C4533A.B(0);
                        layoutInflaterFactory2C4533A.I(B9, keyEvent);
                        boolean H8 = layoutInflaterFactory2C4533A.H(B9, keyEvent.getKeyCode(), keyEvent);
                        B9.f37936k = false;
                        if (H8) {
                        }
                    }
                    return false;
                }
                z zVar2 = layoutInflaterFactory2C4533A.f37796s0;
                if (zVar2 != null) {
                    zVar2.f37937l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f37917n.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f37917n.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f37917n.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f37917n.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f37917n.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f37917n.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f37919v) {
            this.f37917n.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof l.m)) {
            return this.f37917n.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C4523c c4523c = this.f37918u;
        if (c4523c != null) {
            View view = i == 0 ? new View(((C4539G) c4523c.f37627u).f37818a.f39081a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f37917n.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f37917n.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f37917n.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = this.f37922y;
        if (i == 108) {
            layoutInflaterFactory2C4533A.C();
            AbstractC4541a abstractC4541a = layoutInflaterFactory2C4533A.f37768H;
            if (abstractC4541a != null) {
                abstractC4541a.c(true);
            }
        } else {
            layoutInflaterFactory2C4533A.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f37921x) {
            this.f37917n.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = this.f37922y;
        if (i == 108) {
            layoutInflaterFactory2C4533A.C();
            AbstractC4541a abstractC4541a = layoutInflaterFactory2C4533A.f37768H;
            if (abstractC4541a != null) {
                abstractC4541a.c(false);
                return;
            }
            return;
        }
        if (i != 0) {
            layoutInflaterFactory2C4533A.getClass();
            return;
        }
        z B9 = layoutInflaterFactory2C4533A.B(i);
        if (B9.f37938m) {
            layoutInflaterFactory2C4533A.t(B9, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z3) {
        AbstractC4627n.a(this.f37917n, z3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        l.m mVar = menu instanceof l.m ? (l.m) menu : null;
        if (i == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f38819Q = true;
        }
        C4523c c4523c = this.f37918u;
        if (c4523c != null && i == 0) {
            C4539G c4539g = (C4539G) c4523c.f37627u;
            if (!c4539g.f37821d) {
                c4539g.f37818a.f39091l = true;
                c4539g.f37821d = true;
            }
        }
        boolean onPreparePanel = this.f37917n.onPreparePanel(i, view, menu);
        if (mVar != null) {
            mVar.f38819Q = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        l.m mVar = this.f37922y.B(0).f37934h;
        if (mVar != null) {
            d(list, mVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC4625l.a(this.f37917n, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f37917n.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        this.f37917n.onWindowFocusChanged(z3);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = this.f37922y;
        layoutInflaterFactory2C4533A.getClass();
        if (i != 0) {
            return AbstractC4625l.b(this.f37917n, callback, i);
        }
        S0.i iVar = new S0.i(layoutInflaterFactory2C4533A.f37760D, callback);
        AbstractC4615b m4 = layoutInflaterFactory2C4533A.m(iVar);
        if (m4 != null) {
            return iVar.e(m4);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f37917n.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
