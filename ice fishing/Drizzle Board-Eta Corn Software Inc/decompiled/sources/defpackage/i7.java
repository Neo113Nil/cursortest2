package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i7 implements to {
    public final /* synthetic */ f4UNdked MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ i7(f4UNdked f4undked, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = f4undked;
    }

    @Override // defpackage.to
    public final void P7K7Inc8(vo voVar, oo ooVar) {
        switch (this.NCTxEWno) {
            case 0:
                if (ooVar == oo.ON_STOP) {
                    Window window = this.MdtA4re8.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 1:
                if (ooVar == oo.ON_DESTROY) {
                    this.MdtA4re8.MdtA4re8.NCTxEWno = null;
                    if (!this.MdtA4re8.isChangingConfigurations()) {
                        this.MdtA4re8.P7K7Inc8().qoPGr6Ce();
                    }
                    l7 l7Var = this.MdtA4re8.eVhOlqcC;
                    f4UNdked f4undked = l7Var.VgvYg0wo;
                    f4undked.getWindow().getDecorView().removeCallbacks(l7Var);
                    f4undked.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(l7Var);
                    break;
                }
                break;
            default:
                f4UNdked f4undked2 = this.MdtA4re8;
                if (f4undked2.b2ZJblxo == null) {
                    k7 k7Var = (k7) f4undked2.getLastNonConfigurationInstance();
                    if (k7Var != null) {
                        f4undked2.b2ZJblxo = k7Var.qoPGr6Ce;
                    }
                    if (f4undked2.b2ZJblxo == null) {
                        f4undked2.b2ZJblxo = new ug0();
                    }
                }
                f4undked2.VgvYg0wo.P7K7Inc8(this);
                break;
        }
    }
}
