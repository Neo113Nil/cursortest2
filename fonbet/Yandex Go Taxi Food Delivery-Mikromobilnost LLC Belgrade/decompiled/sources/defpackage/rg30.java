package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.router.l;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;

/* loaded from: classes6.dex */
public final class rg30 implements g640 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rg30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    @Override // defpackage.g640
    public final void M0(hj40 hj40Var, w1u w1uVar, String str) {
        Object value;
        sk40 sk40Var;
        bzy0 bzy0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((kf30) obj).a(new y540(hj40Var, w1uVar, str));
                break;
            case 1:
                vx30 vx30Var = (vx30) obj;
                MtRoutesModalView mtRoutesModalView = vx30Var.U;
                if (mtRoutesModalView != null) {
                    mtRoutesModalView.setVisibility(8);
                }
                su30 d = vx30Var.L.d();
                if (d != null) {
                    vx30Var.D((m950) vx30Var.N.get(), new qk40(d, new dk40(new y540(hj40Var, w1uVar, str), null)), new mo30(1, vx30Var));
                    break;
                }
                break;
            default:
                tk40 tk40Var = ((l) obj).K;
                if (tk40Var != null) {
                    r0 r0Var = tk40Var.a;
                    do {
                        value = r0Var.getValue();
                        sk40Var = (sk40) value;
                        fk40 fk40Var = sk40Var.b;
                        if (!fk40Var.equals(ck40.a)) {
                            if (!(fk40Var instanceof dk40)) {
                                if (!(fk40Var instanceof ek40)) {
                                    w511.b();
                                    break;
                                } else {
                                    bzy0Var = ((ek40) fk40Var).a;
                                }
                            } else {
                                bzy0Var = ((dk40) fk40Var).b;
                            }
                        } else {
                            bzy0Var = null;
                        }
                    } while (!r0Var.k(value, sk40.a(sk40Var, new dk40(new y540(hj40Var, w1uVar, str), bzy0Var))));
                }
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        Object value;
        Object value2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                r0 r0Var = ((kf30) obj).a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, gf30.a));
            case 1:
                break;
            default:
                tk40 tk40Var = ((l) obj).K;
                if (tk40Var != null) {
                    r0 r0Var2 = tk40Var.a;
                    do {
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, sk40.a((sk40) value2, ck40.a)));
                }
                break;
        }
    }
}
