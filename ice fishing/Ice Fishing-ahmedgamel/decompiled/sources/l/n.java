package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import h.DialogInterfaceC4552h;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: n, reason: collision with root package name */
    public SubMenuC4654E f38754n;

    /* renamed from: u, reason: collision with root package name */
    public DialogInterfaceC4552h f38755u;

    /* renamed from: v, reason: collision with root package name */
    public C4663i f38756v;

    @Override // l.x
    public final void b(m mVar, boolean z6) {
        DialogInterfaceC4552h dialogInterfaceC4552h;
        if ((z6 || mVar == this.f38754n) && (dialogInterfaceC4552h = this.f38755u) != null) {
            dialogInterfaceC4552h.dismiss();
        }
    }

    @Override // l.x
    public final boolean e(m mVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C4663i c4663i = this.f38756v;
        if (c4663i.f38723y == null) {
            c4663i.f38723y = new C4662h(c4663i);
        }
        this.f38754n.q(c4663i.f38723y.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f38756v.b(this.f38754n, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC4654E subMenuC4654E = this.f38754n;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f38755u.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f38755u.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC4654E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC4654E.performShortcut(i, keyEvent, 0);
    }
}
