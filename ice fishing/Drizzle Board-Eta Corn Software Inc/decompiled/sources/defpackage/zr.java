package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zr implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, os {
    public PVxc5pbY MdtA4re8;
    public ka0 NCTxEWno;
    public pp wxUZMvaN;

    @Override // defpackage.os
    public final boolean Ey6iv0m0(yr yrVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ka0 ka0Var = this.NCTxEWno;
        pp ppVar = this.wxUZMvaN;
        op opVar = ppVar.b2ZJblxo;
        if (opVar == null) {
            opVar = new op(ppVar);
            ppVar.b2ZJblxo = opVar;
        }
        ka0Var.OxcuoDLp(opVar.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.wxUZMvaN.qoPGr6Ce(this.NCTxEWno, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        ka0 ka0Var = this.NCTxEWno;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.MdtA4re8.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.MdtA4re8.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                ka0Var.MdtA4re8(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return ka0Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.os
    public final void qoPGr6Ce(yr yrVar, boolean z) {
        PVxc5pbY pVxc5pbY;
        if ((z || yrVar == this.NCTxEWno) && (pVxc5pbY = this.MdtA4re8) != null) {
            pVxc5pbY.dismiss();
        }
    }
}
