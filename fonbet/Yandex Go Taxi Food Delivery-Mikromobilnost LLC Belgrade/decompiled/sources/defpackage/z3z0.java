package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class z3z0 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tls b;
    public final /* synthetic */ String c;

    public /* synthetic */ z3z0(tls tlsVar, String str) {
        this.b = tlsVar;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                x3z0 x3z0Var = (x3z0) obj;
                List<w3z0> list = x3z0Var.i;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (w3z0 w3z0Var : list) {
                    if ((w3z0Var instanceof v3z0) && jl40.l(((v3z0) w3z0Var).c, str)) {
                        w3z0Var = (w3z0) tlsVar.invoke(w3z0Var);
                    }
                    arrayList.add(w3z0Var);
                }
                return new x3z0(x3z0Var.a, x3z0Var.b, x3z0Var.c, x3z0Var.d, x3z0Var.e, x3z0Var.f, x3z0Var.g, x3z0Var.h, arrayList, x3z0Var.j, x3z0Var.k, x3z0Var.l, x3z0Var.m, x3z0Var.n);
            default:
                u6y.b((u6y) obj, null, new a(1344018007, new ays0(17, tlsVar, str), true), 3);
                return zy11.a;
        }
    }

    public /* synthetic */ z3z0(String str, tls tlsVar) {
        this.c = str;
        this.b = tlsVar;
    }
}
