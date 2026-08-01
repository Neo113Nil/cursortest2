package h;

import O.AbstractC0049z;
import O.N;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.AbstractC0177a;
import k.C0179c;
import k.C0180d;
import l.MenuC0229m;

/* loaded from: classes.dex */
public final class w implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f3235a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3236b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3237c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3238d;
    public final /* synthetic */ LayoutInflaterFactory2C0159B e;

    public w(LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B, Window.Callback callback) {
        this.e = layoutInflaterFactory2C0159B;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f3235a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f3236b = true;
            callback.onContentChanged();
        } finally {
            this.f3236b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f3235a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f3235a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        k.l.a(this.f3235a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f3235a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f3237c;
        Window.Callback callback = this.f3235a;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.e.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z2;
        MenuC0229m menuC0229m;
        boolean performShortcut;
        if (this.f3235a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = this.e;
        layoutInflaterFactory2C0159B.z();
        M m2 = layoutInflaterFactory2C0159B.f3117o;
        if (m2 != null) {
            L l2 = m2.i;
            if (l2 == null || (menuC0229m = l2.f3151d) == null) {
                performShortcut = false;
            } else {
                menuC0229m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                performShortcut = menuC0229m.performShortcut(keyCode, keyEvent, 0);
            }
        }
        C0158A c0158a = layoutInflaterFactory2C0159B.f3092M;
        if (c0158a == null || !layoutInflaterFactory2C0159B.E(c0158a, keyEvent.getKeyCode(), keyEvent)) {
            if (layoutInflaterFactory2C0159B.f3092M == null) {
                C0158A y2 = layoutInflaterFactory2C0159B.y(0);
                layoutInflaterFactory2C0159B.F(y2, keyEvent);
                boolean E2 = layoutInflaterFactory2C0159B.E(y2, keyEvent.getKeyCode(), keyEvent);
                y2.f3072k = false;
            }
            z2 = false;
            return !z2;
        }
        C0158A c0158a2 = layoutInflaterFactory2C0159B.f3092M;
        if (c0158a2 != null) {
            c0158a2.f3073l = true;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f3235a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f3235a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f3235a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f3235a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f3235a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f3235a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f3236b) {
            this.f3235a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0229m)) {
            return this.f3235a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f3235a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f3235a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f3235a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = this.e;
        if (i == 108) {
            layoutInflaterFactory2C0159B.z();
            M m2 = layoutInflaterFactory2C0159B.f3117o;
            if (m2 != null && true != m2.f3164l) {
                m2.f3164l = true;
                ArrayList arrayList = m2.f3165m;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            layoutInflaterFactory2C0159B.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f3238d) {
            this.f3235a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = this.e;
        if (i != 108) {
            if (i != 0) {
                layoutInflaterFactory2C0159B.getClass();
                return;
            }
            C0158A y2 = layoutInflaterFactory2C0159B.y(i);
            if (y2.f3074m) {
                layoutInflaterFactory2C0159B.q(y2, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0159B.z();
        M m2 = layoutInflaterFactory2C0159B.f3117o;
        if (m2 == null || !m2.f3164l) {
            return;
        }
        m2.f3164l = false;
        ArrayList arrayList = m2.f3165m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        k.m.a(this.f3235a, z2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0229m menuC0229m = menu instanceof MenuC0229m ? (MenuC0229m) menu : null;
        if (i == 0 && menuC0229m == null) {
            return false;
        }
        if (menuC0229m != null) {
            menuC0229m.f3729x = true;
        }
        boolean onPreparePanel = this.f3235a.onPreparePanel(i, view, menu);
        if (menuC0229m != null) {
            menuC0229m.f3729x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0229m menuC0229m = this.e.y(0).f3071h;
        if (menuC0229m != null) {
            d(list, menuC0229m, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.f3235a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f3235a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f3235a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        boolean z2 = false;
        int i2 = 1;
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = this.e;
        layoutInflaterFactory2C0159B.getClass();
        if (i != 0) {
            return k.k.b(this.f3235a, callback, i);
        }
        B.k kVar = new B.k(layoutInflaterFactory2C0159B.f3113k, callback);
        AbstractC0177a abstractC0177a = layoutInflaterFactory2C0159B.f3123u;
        if (abstractC0177a != null) {
            abstractC0177a.a();
        }
        F.i iVar = new F.i(layoutInflaterFactory2C0159B, kVar, 9, z2);
        layoutInflaterFactory2C0159B.z();
        M m2 = layoutInflaterFactory2C0159B.f3117o;
        if (m2 != null) {
            L l2 = m2.i;
            if (l2 != null) {
                l2.a();
            }
            m2.f3158c.setHideOnContentScrollEnabled(false);
            m2.f3160f.e();
            L l3 = new L(m2, m2.f3160f.getContext(), iVar);
            MenuC0229m menuC0229m = l3.f3151d;
            menuC0229m.w();
            try {
                if (((B.k) l3.e.f208b).n(l3, menuC0229m)) {
                    m2.i = l3;
                    l3.g();
                    m2.f3160f.c(l3);
                    m2.v0(true);
                } else {
                    l3 = null;
                }
                layoutInflaterFactory2C0159B.f3123u = l3;
            } finally {
                menuC0229m.v();
            }
        }
        if (layoutInflaterFactory2C0159B.f3123u == null) {
            N n2 = layoutInflaterFactory2C0159B.f3127y;
            if (n2 != null) {
                n2.b();
            }
            AbstractC0177a abstractC0177a2 = layoutInflaterFactory2C0159B.f3123u;
            if (abstractC0177a2 != null) {
                abstractC0177a2.a();
            }
            if (layoutInflaterFactory2C0159B.f3124v == null) {
                boolean z3 = layoutInflaterFactory2C0159B.f3089I;
                Context context = layoutInflaterFactory2C0159B.f3113k;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0179c c0179c = new C0179c(context, 0);
                        c0179c.getTheme().setTo(newTheme);
                        context = c0179c;
                    }
                    layoutInflaterFactory2C0159B.f3124v = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0159B.f3125w = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C0159B.f3125w.setContentView(layoutInflaterFactory2C0159B.f3124v);
                    layoutInflaterFactory2C0159B.f3125w.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0159B.f3124v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0159B.f3125w.setHeight(-2);
                    layoutInflaterFactory2C0159B.f3126x = new q(layoutInflaterFactory2C0159B, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0159B.f3081A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0159B.z();
                        M m3 = layoutInflaterFactory2C0159B.f3117o;
                        Context w02 = m3 != null ? m3.w0() : null;
                        if (w02 != null) {
                            context = w02;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C0159B.f3124v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0159B.f3124v != null) {
                N n3 = layoutInflaterFactory2C0159B.f3127y;
                if (n3 != null) {
                    n3.b();
                }
                layoutInflaterFactory2C0159B.f3124v.e();
                Context context2 = layoutInflaterFactory2C0159B.f3124v.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0159B.f3124v;
                C0180d c0180d = new C0180d();
                c0180d.f3316c = context2;
                c0180d.f3317d = actionBarContextView;
                c0180d.e = iVar;
                MenuC0229m menuC0229m2 = new MenuC0229m(actionBarContextView.getContext());
                menuC0229m2.f3717l = 1;
                c0180d.f3320h = menuC0229m2;
                menuC0229m2.e = c0180d;
                if (((B.k) iVar.f208b).n(c0180d, menuC0229m2)) {
                    c0180d.g();
                    layoutInflaterFactory2C0159B.f3124v.c(c0180d);
                    layoutInflaterFactory2C0159B.f3123u = c0180d;
                    if (layoutInflaterFactory2C0159B.f3128z && (viewGroup = layoutInflaterFactory2C0159B.f3081A) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0159B.f3124v.setAlpha(RecyclerView.f2111C0);
                        N a2 = O.K.a(layoutInflaterFactory2C0159B.f3124v);
                        a2.a(1.0f);
                        layoutInflaterFactory2C0159B.f3127y = a2;
                        a2.d(new s(i2, layoutInflaterFactory2C0159B));
                    } else {
                        layoutInflaterFactory2C0159B.f3124v.setAlpha(1.0f);
                        layoutInflaterFactory2C0159B.f3124v.setVisibility(0);
                        if (layoutInflaterFactory2C0159B.f3124v.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0159B.f3124v.getParent();
                            WeakHashMap weakHashMap = O.K.f747a;
                            AbstractC0049z.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0159B.f3125w != null) {
                        layoutInflaterFactory2C0159B.f3114l.getDecorView().post(layoutInflaterFactory2C0159B.f3126x);
                    }
                } else {
                    layoutInflaterFactory2C0159B.f3123u = null;
                }
            }
            layoutInflaterFactory2C0159B.H();
            layoutInflaterFactory2C0159B.f3123u = layoutInflaterFactory2C0159B.f3123u;
        }
        layoutInflaterFactory2C0159B.H();
        AbstractC0177a abstractC0177a3 = layoutInflaterFactory2C0159B.f3123u;
        if (abstractC0177a3 != null) {
            return kVar.g(abstractC0177a3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f3235a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
