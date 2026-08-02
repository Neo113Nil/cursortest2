package defpackage;

import com.yandex.plus.pay.adapter.internal.q;

/* loaded from: classes8.dex */
public final /* synthetic */ class w3m implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ cop0 b;

    public /* synthetic */ w3m(cop0 cop0Var, int i) {
        this.a = i;
        this.b = cop0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        cop0 cop0Var = this.b;
        switch (i) {
            case 0:
                return new t2h(cop0Var.a, cop0Var.A, cop0Var.d);
            case 1:
                return new k450(cop0Var.a);
            case 2:
                return nm91.e(cop0Var.a);
            case 3:
                return Boolean.valueOf(o430.B.o(cop0Var.a).a());
            case 4:
                lb7 lb7Var = cop0Var.h;
                return new q((oay0) lb7Var.b, (tls) lb7Var.c);
            default:
                return (dn) ((i3y) cop0Var.B.c).getValue();
        }
    }
}
