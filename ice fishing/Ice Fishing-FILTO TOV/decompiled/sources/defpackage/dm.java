package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.combinations.level.experts.R;
import java.util.UUID;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class dm extends Dialog implements t90, il0, wi0, yw0 {
    public final m71 AvO7iQsrTN;
    public final yl E7jCp8Ls;
    public final d EljAMC1QTz;
    public bm JFJ3QoxA;
    public w90 OOA6hdeuvCS;
    public boolean XnEVoBF0td1l;
    public final m71 encWxUiV2;
    public wu mOu10nynGul;
    public final View rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(wu wuVar, bm bmVar, View view, p50 p50Var, el elVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), bmVar.OOA6hdeuvCS ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        final int i = 0;
        this.EljAMC1QTz = new d(new xw0(this, new o1(13, this)), 18);
        this.AvO7iQsrTN = new m71(new wu(this) { // from class: hd
            public final /* synthetic */ dm EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                int i2 = i;
                dm dmVar = this.EljAMC1QTz;
                switch (i2) {
                    case 0:
                        fm fmVar = new fm();
                        dmVar.GWasM1elztuh().xqGvceK5x(fmVar);
                        return fmVar;
                    default:
                        return new hl0(new uFEq9NpZ(5, dmVar));
                }
            }
        });
        final int i2 = 1;
        this.encWxUiV2 = new m71(new wu(this) { // from class: hd
            public final /* synthetic */ dm EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                int i22 = i2;
                dm dmVar = this.EljAMC1QTz;
                switch (i22) {
                    case 0:
                        fm fmVar = new fm();
                        dmVar.GWasM1elztuh().xqGvceK5x(fmVar);
                        return fmVar;
                    default:
                        return new hl0(new uFEq9NpZ(5, dmVar));
                }
            }
        });
        this.mOu10nynGul = wuVar;
        this.JFJ3QoxA = bmVar;
        this.rQPn8YBR = view;
        Window window = getWindow();
        if (window == null) {
            o4.jivtDDk9H("Dialog has no window");
            throw null;
        }
        bm bmVar2 = this.JFJ3QoxA;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = bmVar2.AvO7iQsrTN;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        l60.arNh8D4Z5gB(window, this.JFJ3QoxA.OOA6hdeuvCS);
        window.setGravity(17);
        if (!this.JFJ3QoxA.OOA6hdeuvCS) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                z3.GWasM1elztuh.GWasM1elztuh(attributes2);
            }
            if (i3 >= 30) {
                b4 b4Var = b4.GWasM1elztuh;
                b4Var.Yi7zF1RB1(attributes2, 0);
                b4Var.X1lG3V04pd(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        yl ylVar = new yl(getContext(), window);
        setTitle(this.JFJ3QoxA.EljAMC1QTz);
        ylVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        ylVar.setClipChildren(false);
        ylVar.setElevation(elVar.jivtDDk9H(8.0f));
        ylVar.setOutlineProvider(new cm(0));
        this.E7jCp8Ls = ylVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            OOA6hdeuvCS(viewGroup);
        }
        setContentView(ylVar);
        ylVar.setTag(R.id.view_tree_lifecycle_owner, q70.WIEu4Ya2g8(view));
        ylVar.setTag(R.id.view_tree_view_model_store_owner, z50.WIEu4Ya2g8(view));
        ylVar.setTag(R.id.view_tree_saved_state_registry_owner, o50.WIEu4Ya2g8(view));
        mOu10nynGul(this.mOu10nynGul, this.JFJ3QoxA, p50Var);
        hl0 Yi7zF1RB1 = Yi7zF1RB1();
        a0 a0Var = new a0(this, 1);
        Yi7zF1RB1.getClass();
        y5 y5Var = new y5(a0Var);
        final w90 EljAMC1QTz = EljAMC1QTz();
        if (EljAMC1QTz.encWxUiV2 == m90.OOA6hdeuvCS) {
            return;
        }
        bl0 bl0Var = new bl0(y5Var, new cl0(y5Var, this));
        y5Var.GWasM1elztuh.add(bl0Var);
        bl0Var.AvO7iQsrTN(false);
        rx0.X1lG3V04pd(Yi7zF1RB1.GWasM1elztuh(), bl0Var);
        final ok okVar = new ok(bl0Var, Yi7zF1RB1, EljAMC1QTz);
        EljAMC1QTz.GWasM1elztuh(okVar);
        y5Var.X1lG3V04pd.add(new AutoCloseable() { // from class: dl0
            @Override // java.lang.AutoCloseable
            public final void close() {
                w90.this.EljAMC1QTz(okVar);
            }
        });
    }

    public static final void OOA6hdeuvCS(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof yl) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                OOA6hdeuvCS(viewGroup2);
            }
        }
    }

    public static void xqGvceK5x(dm dmVar) {
        super.onBackPressed();
    }

    @Override // defpackage.t90
    public final w90 AvO7iQsrTN() {
        return EljAMC1QTz();
    }

    public final w90 EljAMC1QTz() {
        w90 w90Var = this.OOA6hdeuvCS;
        if (w90Var != null) {
            return w90Var;
        }
        w90 w90Var2 = new w90(this, true);
        this.OOA6hdeuvCS = w90Var2;
        return w90Var2;
    }

    @Override // defpackage.wi0
    public final rx0 GWasM1elztuh() {
        return Yi7zF1RB1().GWasM1elztuh();
    }

    @Override // defpackage.yw0
    public final d X1lG3V04pd() {
        return (d) this.EljAMC1QTz.AvO7iQsrTN;
    }

    @Override // defpackage.il0
    public final hl0 Yi7zF1RB1() {
        return (hl0) this.encWxUiV2.getValue();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        encWxUiV2();
        super.addContentView(view, layoutParams);
    }

    public final void encWxUiV2() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final void mOu10nynGul(wu wuVar, bm bmVar, p50 p50Var) {
        int i;
        this.mOu10nynGul = wuVar;
        this.JFJ3QoxA = bmVar;
        lz0 lz0Var = bmVar.X1lG3V04pd;
        int i2 = k1.GWasM1elztuh;
        ViewGroup.LayoutParams layoutParams = this.rQPn8YBR.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = lz0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = true;
            } else {
                if (ordinal != 2) {
                    o4.xqGvceK5x();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int ordinal2 = p50Var.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                o4.xqGvceK5x();
                return;
            }
            i = 1;
        }
        yl ylVar = this.E7jCp8Ls;
        ylVar.setLayoutDirection(i);
        boolean z2 = bmVar.OOA6hdeuvCS;
        boolean z3 = bmVar.xqGvceK5x;
        Window window2 = ylVar.uFEq9NpZ;
        boolean z4 = (ylVar.Mjvvu5DE && z3 == ylVar.WIEu4Ya2g8 && z2 == ylVar.YmKjaVtbfp5Z) ? false : true;
        ylVar.WIEu4Ya2g8 = z3;
        ylVar.YmKjaVtbfp5Z = z2;
        if (z4) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z3 ? -2 : -1;
            if (i3 != attributes.width || !ylVar.Mjvvu5DE) {
                window2.setLayout(i3, -2);
                ylVar.Mjvvu5DE = true;
            }
        }
        setCanceledOnTouchOutside(bmVar.Yi7zF1RB1);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z2 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((fm) this.AvO7iQsrTN.getValue()).GWasM1elztuh();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            hl0 Yi7zF1RB1 = Yi7zF1RB1();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            Yi7zF1RB1.Yi7zF1RB1(onBackInvokedDispatcher);
        }
        this.EljAMC1QTz.Mjvvu5DE(bundle);
        EljAMC1QTz().xqGvceK5x(l90.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.JFJ3QoxA.GWasM1elztuh || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.mOu10nynGul.GWasM1elztuh();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.EljAMC1QTz.mE4lRynR(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        EljAMC1QTz().xqGvceK5x(l90.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        EljAMC1QTz().xqGvceK5x(l90.ON_DESTROY);
        this.OOA6hdeuvCS = null;
        super.onStop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.JFJ3QoxA.Yi7zF1RB1) {
            yl ylVar = this.E7jCp8Ls;
            ylVar.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = ylVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + ylVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + ylVar.getTop();
                int height = childAt.getHeight() + top;
                int MZhzXH72 = vc0.MZhzXH72(motionEvent.getX());
                if (left <= MZhzXH72) {
                    if (MZhzXH72 <= width) {
                        int MZhzXH722 = vc0.MZhzXH72(motionEvent.getY());
                        if (top <= MZhzXH722) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.XnEVoBF0td1l = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.XnEVoBF0td1l = false;
                    return onTouchEvent;
                }
            } else if (this.XnEVoBF0td1l) {
                this.mOu10nynGul.GWasM1elztuh();
                this.XnEVoBF0td1l = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.XnEVoBF0td1l = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        encWxUiV2();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        encWxUiV2();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        encWxUiV2();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
