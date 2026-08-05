package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class o7 extends Dialog implements vo, s50 {
    public final q50 MdtA4re8;
    public xo NCTxEWno;
    public final ax wxUZMvaN;

    public o7(Context context, int i) {
        super(context, i);
        this.MdtA4re8 = new q50(new r50(this, new e7(8, this)));
        this.wxUZMvaN = new ax(new d3vfVszL(5, this));
    }

    public static final void MdtA4re8(o7 o7Var) {
        super.onBackPressed();
    }

    public final void NCTxEWno() {
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
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        NCTxEWno();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.vo
    public final xo b2ZJblxo() {
        xo xoVar = this.NCTxEWno;
        if (xoVar != null) {
            return xoVar;
        }
        xo xoVar2 = new xo(this);
        this.NCTxEWno = xoVar2;
        return xoVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.wxUZMvaN.NCTxEWno();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            ax axVar = this.wxUZMvaN;
            axVar.getClass();
            axVar.VgvYg0wo = onBackInvokedDispatcher;
            axVar.MdtA4re8(axVar.b2ZJblxo);
        }
        this.MdtA4re8.jb9XjC4I(bundle);
        xo xoVar = this.NCTxEWno;
        if (xoVar == null) {
            xoVar = new xo(this);
            this.NCTxEWno = xoVar;
        }
        xoVar.wxUZMvaN(oo.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.MdtA4re8.eVhOlqcC(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        xo xoVar = this.NCTxEWno;
        if (xoVar == null) {
            xoVar = new xo(this);
            this.NCTxEWno = xoVar;
        }
        xoVar.wxUZMvaN(oo.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        xo xoVar = this.NCTxEWno;
        if (xoVar == null) {
            xoVar = new xo(this);
            this.NCTxEWno = xoVar;
        }
        xoVar.wxUZMvaN(oo.ON_DESTROY);
        this.NCTxEWno = null;
        super.onStop();
    }

    @Override // defpackage.s50
    public final mcXgUFR8 qoPGr6Ce() {
        return (mcXgUFR8) this.MdtA4re8.NCTxEWno;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        NCTxEWno();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        NCTxEWno();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        NCTxEWno();
        super.setContentView(view, layoutParams);
    }
}
