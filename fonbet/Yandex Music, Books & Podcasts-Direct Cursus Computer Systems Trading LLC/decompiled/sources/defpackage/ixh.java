package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class ixh implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, fyh {
    public tmr a;
    public p30 b;
    public h9g c;

    @Override // defpackage.fyh
    public final void e(hxh hxhVar, boolean z) {
        p30 p30Var;
        if ((z || hxhVar == this.a) && (p30Var = this.b) != null) {
            p30Var.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        tmr tmrVar = this.a;
        h9g h9gVar = this.c;
        if (h9gVar.f == null) {
            h9gVar.f = new g9g(h9gVar);
        }
        tmrVar.q(h9gVar.f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.e(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        tmr tmrVar = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                tmrVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return tmrVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.fyh
    public final boolean w(hxh hxhVar) {
        return false;
    }
}
