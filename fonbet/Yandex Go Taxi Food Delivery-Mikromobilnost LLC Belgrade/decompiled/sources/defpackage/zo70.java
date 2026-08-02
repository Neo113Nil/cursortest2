package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class zo70 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ zo70(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        pzt0 pzt0Var;
        int i = this.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                h5y0 h5y0Var = (h5y0) obj;
                vzx0 vzx0Var = (vzx0) fVar.x;
                h5y0Var.n1((vzx0Var == null || !vzx0Var.b) ? qzx0.a : szx0.a, new Preorder(0));
                break;
            case 1:
                h5y0 h5y0Var2 = (h5y0) obj;
                vzx0 vzx0Var2 = (vzx0) fVar.x;
                h5y0Var2.n1((vzx0Var2 == null || !vzx0Var2.b) ? qzx0.a : szx0.a, new Preorder(0));
                break;
            case 2:
                o2y0 o2y0Var = (o2y0) obj;
                if (!o2y0Var.b().I()) {
                    fVar.w0();
                } else if (fVar.d0(o2y0Var).d() && !o2y0Var.b().l.q) {
                    if (!fVar.C1.c.q(pp70.class, new sdc(15, new fd60(25)))) {
                        if (!fVar.C1.c.q(pp70.class, new sdc(16, new fd60(26)))) {
                            if (!fVar.C1.c.q(String.class, new sdc(14, new fd60(24))) && !fVar.m0.a() && ((pzt0Var = fVar.d0(o2y0Var).L) == null || !pzt0Var.isActive())) {
                                fVar.d0(o2y0Var).h(fVar.e0(o2y0Var));
                            }
                        }
                    }
                }
                fVar.x0(o2y0Var);
                break;
            default:
                h5y0 h5y0Var3 = (h5y0) obj;
                vzx0 vzx0Var3 = (vzx0) fVar.x;
                h5y0Var3.n1((vzx0Var3 == null || !vzx0Var3.b) ? qzx0.a : szx0.a, new Preorder(0));
                break;
        }
        return zy11.a;
    }
}
