package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import h.DialogInterfaceC0165f;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: a, reason: collision with root package name */
    public SubMenuC0216E f3730a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterfaceC0165f f3731b;

    /* renamed from: c, reason: collision with root package name */
    public C0225i f3732c;

    @Override // l.x
    public final void b(MenuC0229m menuC0229m, boolean z2) {
        DialogInterfaceC0165f dialogInterfaceC0165f;
        if ((z2 || menuC0229m == this.f3730a) && (dialogInterfaceC0165f = this.f3731b) != null) {
            dialogInterfaceC0165f.dismiss();
        }
    }

    @Override // l.x
    public final boolean j(MenuC0229m menuC0229m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0225i c0225i = this.f3732c;
        if (c0225i.f3702f == null) {
            c0225i.f3702f = new C0224h(c0225i);
        }
        this.f3730a.q(c0225i.f3702f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3732c.b(this.f3730a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0216E subMenuC0216E = this.f3730a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3731b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3731b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0216E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0216E.performShortcut(i, keyEvent, 0);
    }
}
