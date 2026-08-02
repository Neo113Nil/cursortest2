package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.presentation.AmountScreenStatus;

/* loaded from: classes3.dex */
public final /* synthetic */ class s7g0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9g0 b;

    public /* synthetic */ s7g0(d9g0 d9g0Var, int i) {
        this.a = i;
        this.b = d9g0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        v031 v031Var;
        v031 q031Var;
        switch (this.a) {
            case 0:
                return d9g0.c(this.b, null, null, null, null, AmountScreenStatus.EDIT_AMOUNT, null, o031.a, false, null, 56319);
            case 1:
                return d9g0.c(this.b, null, null, null, null, AmountScreenStatus.SELECT_AGREEMENT, null, null, false, null, 64511);
            case 2:
                return d9g0.c(this.b, null, null, null, null, null, null, o031.a, false, null, 57343);
            default:
                d9g0 d9g0Var = this.b;
                v031 v031Var2 = d9g0Var.n;
                if (v031Var2 instanceof r031) {
                    r031 r031Var = (r031) v031Var2;
                    q031Var = new r031(r031Var.a, null, r031Var.c);
                } else {
                    if (!(v031Var2 instanceof q031)) {
                        if (v031Var2 instanceof l031) {
                            l031 l031Var = (l031) v031Var2;
                            v031Var = new l031(l031Var.a, null, l031Var.c, l031Var.d, l031Var.e, l031Var.f);
                        } else {
                            if (!jl40.l(v031Var2, o031.a) && !(v031Var2 instanceof n031)) {
                                w511.b();
                                return null;
                            }
                            v031Var = v031Var2;
                        }
                        return d9g0.c(d9g0Var, null, null, null, null, null, null, v031Var, false, null, 57343);
                    }
                    q031 q031Var2 = (q031) v031Var2;
                    q031Var = new q031(null, q031Var2.b, q031Var2.c);
                }
                v031Var = q031Var;
                return d9g0.c(d9g0Var, null, null, null, null, null, null, v031Var, false, null, 57343);
        }
    }
}
