package defpackage;

import com.yandex.go.payments.paymentlist.navigation.c;
import com.yandex.go.payments.paymentlist.navigation.d;
import com.yandex.go.payments.paymentlist.navigation.f;

/* loaded from: classes13.dex */
public final /* synthetic */ class xf8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl8 b;

    public /* synthetic */ xf8(fl8 fl8Var, int i) {
        this.a = i;
        this.b = fl8Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        fl8 fl8Var = this.b;
        switch (i) {
            case 0:
                ((c) obj).n1(fl8Var);
                break;
            case 1:
                ((c) obj).b.e(fl8Var);
                break;
            case 2:
                f fVar = ((c) obj).a;
                k5g k5gVar = fVar.p0;
                if (k5gVar != null) {
                    fVar.G.c(fl8Var, new iba0(k5gVar.a()), new bgc(12));
                    break;
                }
                break;
            default:
                ((d) obj).n1(fl8Var);
                break;
        }
        return zy11Var;
    }
}
