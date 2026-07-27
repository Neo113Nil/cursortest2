package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import h.DialogInterfaceC4550i;

/* loaded from: classes.dex */
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* renamed from: n, reason: collision with root package name */
    public SubMenuC4672D f38969n;

    /* renamed from: u, reason: collision with root package name */
    public DialogInterfaceC4550i f38970u;

    /* renamed from: v, reason: collision with root package name */
    public C4680h f38971v;

    @Override // l.w
    public final void e(l lVar, boolean z8) {
        DialogInterfaceC4550i dialogInterfaceC4550i;
        if ((z8 || lVar == this.f38969n) && (dialogInterfaceC4550i = this.f38970u) != null) {
            dialogInterfaceC4550i.dismiss();
        }
    }

    @Override // l.w
    public final boolean g(l lVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C4680h c4680h = this.f38971v;
        if (c4680h.f38938y == null) {
            c4680h.f38938y = new C4679g(c4680h);
        }
        this.f38969n.q(c4680h.f38938y.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f38971v.e(this.f38969n, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC4672D subMenuC4672D = this.f38969n;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f38970u.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f38970u.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC4672D.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC4672D.performShortcut(i, keyEvent, 0);
    }
}
