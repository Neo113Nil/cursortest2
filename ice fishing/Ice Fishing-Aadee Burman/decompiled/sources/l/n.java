package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import h.DialogInterfaceC4548h;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: n, reason: collision with root package name */
    public SubMenuC4643E f38827n;

    /* renamed from: u, reason: collision with root package name */
    public DialogInterfaceC4548h f38828u;

    /* renamed from: v, reason: collision with root package name */
    public C4652i f38829v;

    @Override // l.x
    public final void b(m mVar, boolean z3) {
        DialogInterfaceC4548h dialogInterfaceC4548h;
        if ((z3 || mVar == this.f38827n) && (dialogInterfaceC4548h = this.f38828u) != null) {
            dialogInterfaceC4548h.dismiss();
        }
    }

    @Override // l.x
    public final boolean j(m mVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C4652i c4652i = this.f38829v;
        if (c4652i.f38796y == null) {
            c4652i.f38796y = new C4651h(c4652i);
        }
        this.f38827n.q(c4652i.f38796y.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f38829v.b(this.f38827n, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC4643E subMenuC4643E = this.f38827n;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f38828u.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f38828u.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC4643E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC4643E.performShortcut(i, keyEvent, 0);
    }
}
