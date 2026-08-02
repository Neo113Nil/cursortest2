package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.yb.c;
import defpackage.qu;
import defpackage.sls;
import defpackage.xx70;
import ru.yandex.taxi.common_models.net.map_object.i0;
import ru.yandex.taxi.communications.stories.domain.a;
import ru.yandex.taxi.map_common.b;
import ru.yandex.taxi.preorder.source.ConfirmationDialog;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes12.dex */
public final class xx70 extends h55 {
    public final /* synthetic */ int D;
    public Object E;
    public final Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx70(int i, Object obj, Object obj2) {
        super(null);
        this.D = i;
        this.F = obj;
        this.E = obj2;
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 9:
                ((b) ((ysd0) this.F)).a(i0.class, new enw(2, this));
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        switch (this.D) {
            case 9:
                ((b) ((ysd0) this.F)).b(i0.class);
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 3:
                ConfirmationDialog confirmationDialog = (ConfirmationDialog) this.E;
                if (confirmationDialog != null) {
                    confirmationDialog.dismiss();
                }
                this.E = null;
                break;
            case 8:
                AlertDialog alertDialog = (AlertDialog) this.E;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                this.E = null;
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        int i = this.D;
        int i2 = 8;
        int i3 = 6;
        final int i4 = 0;
        int i5 = 5;
        final int i6 = 1;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                o2y0 o2y0Var = (o2y0) obj;
                tx70 tx70Var = (tx70) ((yvf0) this.E).get();
                w030 a = ((i130) obj2).a();
                tx70Var.getClass();
                a.getClass();
                o2y0Var.getClass();
                s4g s4gVar = new s4g(tx70Var, 4);
                n3w a2 = n3w.a(o2y0Var);
                s4g s4gVar2 = new s4g(tx70Var, i5);
                A(new by70(a, new ge50((xvf0) s4gVar, (xvf0) a2, (xvf0) new ut(s4gVar, a2, s4gVar2, new s4g(tx70Var, i4), new s4g(tx70Var, i2), new s4g(tx70Var, 9), new s4g(tx70Var, 11), new s4g(tx70Var, 2), new s4g(tx70Var, i6), new s4g(tx70Var, 3), new s4g(tx70Var, 12), new s4g(tx70Var, 6), new s4g(tx70Var, 10), new ys10((xvf0) new f870(new s4g(tx70Var, 7), 14), (xvf0) new aos(a2, 22), 27), 10), (xvf0) s4gVar2, 10, (byte) 0)), o2y0Var, new dl1(25, this));
                break;
            case 1:
                E((m950) ((yvf0) this.E).get(), (ydp) obj, new y01(this, i6), hxx.a);
                break;
            case 2:
                A((a) obj2, (npu0) obj, new bb0(this, 21));
                break;
            case 3:
                hl60 hl60Var = (hl60) obj;
                String str = hl60Var.b;
                String str2 = hl60Var.c;
                if (str != null && str2 != null) {
                    ConfirmationDialog confirmationDialog = new ConfirmationDialog((Context) obj2, str, str2, null, a0h0.bridge);
                    confirmationDialog.show();
                    this.E = confirmationDialog;
                    break;
                } else {
                    i();
                    break;
                }
            case 4:
                A((k6c0) obj2, (zy11) obj, new sy60() { // from class: com.yandex.go.places.impl.ui.main.a
                    @Override // defpackage.sy60
                    public final void a() {
                        qu quVar = new qu(9);
                        xx70 xx70Var = xx70.this;
                        xx70Var.r(quVar);
                        ((DiscoveryMainPresenter$openNativeScreen$2) ((sls) xx70Var.E)).invoke();
                    }
                });
                break;
            case 5:
                A((ru.yandex.taxi.statebar.router.a) obj2, (zy11) obj, new wui(this, i2));
                break;
            case 6:
                A((oo11) obj2, (jo11) obj, new pn4(this, i6));
                break;
            case 7:
                A((com.yandex.go.flex.common.router.settings.a) obj2, (zy11) obj, new mo30(i3, this));
                break;
            case 8:
                this.E = new AlertDialog((Activity) obj2).setMessage(kyh0.debt_error_while_processing).setNegativeButton(kyh0.common_close, new Runnable(this) { // from class: rz90
                    public final /* synthetic */ xx70 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = i4;
                        xx70 xx70Var = this.b;
                        switch (i7) {
                            case 0:
                                xx70Var.r(new qu(9));
                                break;
                            default:
                                xx70Var.r(new qu(9));
                                break;
                        }
                    }
                }).setDismissListener(new Runnable(this) { // from class: rz90
                    public final /* synthetic */ xx70 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i7 = i6;
                        xx70 xx70Var = this.b;
                        switch (i7) {
                            case 0:
                                xx70Var.r(new qu(9));
                                break;
                            default:
                                xx70Var.r(new qu(9));
                                break;
                        }
                    }
                }).show();
                break;
            case 10:
                A((u) obj2, (z) obj, new p6t0(this));
                break;
            case 11:
                A((qzi) obj2, (wzi) obj, new j83(i5, this));
                break;
            case 12:
                A((o5w0) obj2, (m5w0) obj, new com.yandex.go.superapp.orders.bundle.modal.impl.presentation.routing.b(this));
                break;
            case 13:
                A((m950) ((yvf0) this.E).get(), (TaxiOrder) obj, new mhz0(this, i6));
                break;
            case 14:
                A((c) obj2, (fv51) obj, new ev51(this));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx70(yvf0 yvf0Var, cms cmsVar, int i) {
        super(null);
        this.D = i;
        this.E = yvf0Var;
        this.F = cmsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx70(Context context, int i) {
        super(null);
        this.D = i;
        this.F = context;
    }
}
