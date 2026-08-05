package defpackage;

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
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kCZyLIxn implements Window.Callback {
    public boolean MdtA4re8;
    public final Window.Callback NCTxEWno;
    public final /* synthetic */ SJ7tYVsF P7K7Inc8;
    public boolean VgvYg0wo;
    public boolean wxUZMvaN;

    public kCZyLIxn(SJ7tYVsF sJ7tYVsF, Window.Callback callback) {
        this.P7K7Inc8 = sJ7tYVsF;
        if (callback != null) {
            this.NCTxEWno = callback;
        } else {
            m1.sjUBp5pO("Window callback may not be null");
            throw null;
        }
    }

    public final void MdtA4re8(int i, Menu menu) {
        this.NCTxEWno.onPanelClosed(i, menu);
    }

    public final boolean NCTxEWno(int i, Menu menu) {
        return this.NCTxEWno.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.NCTxEWno.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.wxUZMvaN;
        Window.Callback callback = this.NCTxEWno;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.P7K7Inc8.Ey6iv0m0(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L32;
     */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        yr yrVar;
        boolean performShortcut;
        if (!this.NCTxEWno.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            SJ7tYVsF sJ7tYVsF = this.P7K7Inc8;
            sJ7tYVsF.DK9slbsy();
            zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
            if (zh0Var != null) {
                yh0 yh0Var = zh0Var.jb9XjC4I;
                if (yh0Var == null || (yrVar = yh0Var.VgvYg0wo) == null) {
                    performShortcut = false;
                } else {
                    yrVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = yrVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            nBenlUV4 nbenluv4 = sJ7tYVsF.hzgxAD8d;
            if (nbenluv4 == null || !sJ7tYVsF.euDDoUNr(nbenluv4, keyEvent.getKeyCode(), keyEvent)) {
                if (sJ7tYVsF.hzgxAD8d == null) {
                    nBenlUV4 WYNAV5pd = sJ7tYVsF.WYNAV5pd(0);
                    sJ7tYVsF.SgZGMMPL(WYNAV5pd, keyEvent);
                    boolean euDDoUNr = sJ7tYVsF.euDDoUNr(WYNAV5pd, keyEvent.getKeyCode(), keyEvent);
                    WYNAV5pd.k3x7lurq = false;
                    if (euDDoUNr) {
                    }
                }
                return false;
            }
            nBenlUV4 nbenluv42 = sJ7tYVsF.hzgxAD8d;
            if (nbenluv42 != null) {
                nbenluv42.ow5vqvCr = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.NCTxEWno.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.NCTxEWno.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.NCTxEWno.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.NCTxEWno.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.NCTxEWno.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.NCTxEWno.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.MdtA4re8) {
            this.NCTxEWno.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof yr)) {
            return this.NCTxEWno.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.NCTxEWno.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.NCTxEWno.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.NCTxEWno.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        NCTxEWno(i, menu);
        if (i == 108) {
            SJ7tYVsF sJ7tYVsF = this.P7K7Inc8;
            sJ7tYVsF.DK9slbsy();
            zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
            if (zh0Var != null) {
                ArrayList arrayList = zh0Var.OnDfzHZD;
                if (true != zh0Var.ow5vqvCr) {
                    zh0Var.ow5vqvCr = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        m1.qoPGr6Ce();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.VgvYg0wo) {
            this.NCTxEWno.onPanelClosed(i, menu);
            return;
        }
        MdtA4re8(i, menu);
        SJ7tYVsF sJ7tYVsF = this.P7K7Inc8;
        if (i != 108) {
            if (i == 0) {
                nBenlUV4 WYNAV5pd = sJ7tYVsF.WYNAV5pd(i);
                if (WYNAV5pd.OnDfzHZD) {
                    sJ7tYVsF.amk52bBQ(WYNAV5pd, false);
                    return;
                }
                return;
            }
            return;
        }
        sJ7tYVsF.DK9slbsy();
        zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
        if (zh0Var != null) {
            ArrayList arrayList = zh0Var.OnDfzHZD;
            if (zh0Var.ow5vqvCr) {
                zh0Var.ow5vqvCr = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                m1.qoPGr6Ce();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        wh0.qoPGr6Ce(this.NCTxEWno, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        yr yrVar = menu instanceof yr ? (yr) menu : null;
        if (i == 0 && yrVar == null) {
            return false;
        }
        if (yrVar != null) {
            yrVar.gjV1z5T1 = true;
        }
        boolean onPreparePanel = this.NCTxEWno.onPreparePanel(i, view, menu);
        if (yrVar != null) {
            yrVar.gjV1z5T1 = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        yr yrVar = this.P7K7Inc8.WYNAV5pd(0).Qr9iLBAD;
        if (yrVar != null) {
            wxUZMvaN(list, yrVar, i);
        } else {
            wxUZMvaN(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return uh0.qoPGr6Ce(this.NCTxEWno, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.NCTxEWno.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.NCTxEWno.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        SJ7tYVsF sJ7tYVsF = this.P7K7Inc8;
        Context context = sJ7tYVsF.ow5vqvCr;
        if (!sJ7tYVsF.DK9slbsy || i != 0) {
            return uh0.NCTxEWno(this.NCTxEWno, callback, i);
        }
        VZZbw3BB vZZbw3BB = new VZZbw3BB(context, callback);
        yzvmSy3z yzvmsy3z = sJ7tYVsF.I5GHvsYW;
        if (yzvmsy3z != null) {
            yzvmsy3z.qoPGr6Ce();
        }
        mcXgUFR8 mcxgufr8 = new mcXgUFR8(sJ7tYVsF, 4, vZZbw3BB);
        sJ7tYVsF.DK9slbsy();
        zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
        int i2 = 1;
        if (zh0Var != null) {
            yh0 yh0Var = zh0Var.jb9XjC4I;
            if (yh0Var != null) {
                yh0Var.qoPGr6Ce();
            }
            zh0Var.MdtA4re8.setHideOnContentScrollEnabled(false);
            zh0Var.P7K7Inc8.VgvYg0wo();
            yh0 yh0Var2 = new yh0(zh0Var, zh0Var.P7K7Inc8.getContext(), mcxgufr8);
            yr yrVar = yh0Var2.VgvYg0wo;
            yrVar.FySoLYna();
            try {
                if (((VZZbw3BB) yh0Var2.P7K7Inc8.MdtA4re8).ow5vqvCr(yh0Var2, yrVar)) {
                    zh0Var.jb9XjC4I = yh0Var2;
                    yh0Var2.Qr9iLBAD();
                    zh0Var.P7K7Inc8.MdtA4re8(yh0Var2);
                    zh0Var.qoPGr6Ce(true);
                } else {
                    yh0Var2 = null;
                }
                sJ7tYVsF.I5GHvsYW = yh0Var2;
            } finally {
                yrVar.RXQxj5Oe();
            }
        }
        if (sJ7tYVsF.I5GHvsYW == null) {
            xg0 xg0Var = sJ7tYVsF.WYNAV5pd;
            if (xg0Var != null) {
                xg0Var.NCTxEWno();
            }
            yzvmSy3z yzvmsy3z2 = sJ7tYVsF.I5GHvsYW;
            if (yzvmsy3z2 != null) {
                yzvmsy3z2.qoPGr6Ce();
            }
            if (sJ7tYVsF.RXQxj5Oe == null) {
                if (sJ7tYVsF.VhgXwMj9) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        f9 f9Var = new f9(context, 0);
                        f9Var.getTheme().setTo(newTheme);
                        context = f9Var;
                    }
                    sJ7tYVsF.RXQxj5Oe = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    sJ7tYVsF.FySoLYna = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    sJ7tYVsF.FySoLYna.setContentView(sJ7tYVsF.RXQxj5Oe);
                    sJ7tYVsF.FySoLYna.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    sJ7tYVsF.RXQxj5Oe.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    sJ7tYVsF.FySoLYna.setHeight(-2);
                    sJ7tYVsF.gjV1z5T1 = new fhw4zlf4(sJ7tYVsF, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) sJ7tYVsF.U0LaHZX7.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        sJ7tYVsF.DK9slbsy();
                        zh0 zh0Var2 = sJ7tYVsF.lDXGDhIF;
                        Context NCTxEWno = zh0Var2 != null ? zh0Var2.NCTxEWno() : null;
                        if (NCTxEWno != null) {
                            context = NCTxEWno;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        sJ7tYVsF.RXQxj5Oe = (ActionBarContextView) viewStubCompat.qoPGr6Ce();
                    }
                }
            }
            if (sJ7tYVsF.RXQxj5Oe != null) {
                xg0 xg0Var2 = sJ7tYVsF.WYNAV5pd;
                if (xg0Var2 != null) {
                    xg0Var2.NCTxEWno();
                }
                sJ7tYVsF.RXQxj5Oe.VgvYg0wo();
                Context context2 = sJ7tYVsF.RXQxj5Oe.getContext();
                ActionBarContextView actionBarContextView = sJ7tYVsF.RXQxj5Oe;
                p90 p90Var = new p90();
                p90Var.wxUZMvaN = context2;
                p90Var.VgvYg0wo = actionBarContextView;
                p90Var.P7K7Inc8 = mcxgufr8;
                yr yrVar2 = new yr(actionBarContextView.getContext());
                yrVar2.ow5vqvCr = 1;
                p90Var.jb9XjC4I = yrVar2;
                yrVar2.VgvYg0wo = p90Var;
                if (((VZZbw3BB) mcxgufr8.MdtA4re8).ow5vqvCr(p90Var, yrVar2)) {
                    p90Var.Qr9iLBAD();
                    sJ7tYVsF.RXQxj5Oe.MdtA4re8(p90Var);
                    sJ7tYVsF.I5GHvsYW = p90Var;
                    boolean z = sJ7tYVsF.lwWCatUu && (viewGroup = sJ7tYVsF.U0LaHZX7) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = sJ7tYVsF.RXQxj5Oe;
                    if (z) {
                        actionBarContextView2.setAlpha(0.0f);
                        xg0 qoPGr6Ce = hg0.qoPGr6Ce(sJ7tYVsF.RXQxj5Oe);
                        qoPGr6Ce.qoPGr6Ce(1.0f);
                        sJ7tYVsF.WYNAV5pd = qoPGr6Ce;
                        qoPGr6Ce.wxUZMvaN(new n5CPt0tX(i2, sJ7tYVsF));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        sJ7tYVsF.RXQxj5Oe.setVisibility(0);
                        if (sJ7tYVsF.RXQxj5Oe.getParent() instanceof View) {
                            View view = (View) sJ7tYVsF.RXQxj5Oe.getParent();
                            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                            view.requestApplyInsets();
                        }
                    }
                    if (sJ7tYVsF.FySoLYna != null) {
                        sJ7tYVsF.OnDfzHZD.getDecorView().post(sJ7tYVsF.gjV1z5T1);
                    }
                } else {
                    sJ7tYVsF.I5GHvsYW = null;
                }
            }
            sJ7tYVsF.eIA6dogk();
            sJ7tYVsF.I5GHvsYW = sJ7tYVsF.I5GHvsYW;
        }
        sJ7tYVsF.eIA6dogk();
        yzvmSy3z yzvmsy3z3 = sJ7tYVsF.I5GHvsYW;
        if (yzvmsy3z3 != null) {
            return vZZbw3BB.wxUZMvaN(yzvmsy3z3);
        }
        return null;
    }

    public final void qoPGr6Ce(Window.Callback callback) {
        try {
            this.MdtA4re8 = true;
            callback.onContentChanged();
        } finally {
            this.MdtA4re8 = false;
        }
    }

    public final void wxUZMvaN(List list, Menu menu, int i) {
        vh0.qoPGr6Ce(this.NCTxEWno, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.NCTxEWno.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
