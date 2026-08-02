package defpackage;

import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.RideCardModalView;

/* loaded from: classes14.dex */
public final class xkk0 extends h55 {
    public final w030 D;
    public final h3y E;
    public final h3y F;
    public final ix70 G;
    public final h3y H;
    public RideCardModalView I;

    public xkk0(w030 w030Var, h3y h3yVar, h3y h3yVar2, ix70 ix70Var, h3y h3yVar3) {
        super(null);
        this.D = w030Var;
        this.E = h3yVar;
        this.F = h3yVar2;
        this.G = ix70Var;
        this.H = h3yVar3;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        RideCardModalView rideCardModalView = (RideCardModalView) this.E.get();
        final int i = 1;
        final iik0 iik0Var = new iik0(i, this);
        final int i2 = 0;
        rideCardModalView.setDismissOnBackPressed(false);
        rideCardModalView.setOnArrowClickListener(new Runnable() { // from class: vkk0
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                iik0 iik0Var2 = iik0Var;
                switch (i3) {
                    case 0:
                        iik0Var2.invoke();
                        break;
                    case 1:
                        iik0Var2.invoke();
                        break;
                    default:
                        iik0Var2.invoke();
                        break;
                }
            }
        });
        rideCardModalView.setOnSlideOutListener(new Runnable() { // from class: vkk0
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                iik0 iik0Var2 = iik0Var;
                switch (i3) {
                    case 0:
                        iik0Var2.invoke();
                        break;
                    case 1:
                        iik0Var2.invoke();
                        break;
                    default:
                        iik0Var2.invoke();
                        break;
                }
            }
        });
        final int i3 = 2;
        rideCardModalView.setOnBackPressedListener(new Runnable() { // from class: vkk0
            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                iik0 iik0Var2 = iik0Var;
                switch (i32) {
                    case 0:
                        iik0Var2.invoke();
                        break;
                    case 1:
                        iik0Var2.invoke();
                        break;
                    default:
                        iik0Var2.invoke();
                        break;
                }
            }
        });
        this.I = rideCardModalView;
        this.D.s(rideCardModalView, false);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        RideCardModalView rideCardModalView = this.I;
        if (rideCardModalView != null) {
            this.I = null;
            this.D.l(rideCardModalView);
        }
    }
}
