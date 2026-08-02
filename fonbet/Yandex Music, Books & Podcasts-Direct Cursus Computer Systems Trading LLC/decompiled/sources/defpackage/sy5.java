package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class sy5 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sy5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((r26) this.b).h(((Boolean) obj).booleanValue());
                break;
            default:
                eps epsVar = (eps) this.b;
                us5 us5Var = (us5) obj;
                Context context = (Context) epsVar.a;
                kle b = ogp.r().b();
                context.getClass();
                b.getClass();
                if (ogp.v() != null) {
                    rke.a(context).c(b);
                }
                ((r26) epsVar.c).g(us5Var);
                sv5 sv5Var = new sv5((dn9) epsVar.g);
                ty5 ty5Var = (ty5) epsVar.d;
                Objects.requireNonNull(ty5Var);
                sv5Var.c = new n(16, ty5Var);
                sv5Var.b = ((r26) epsVar.c).c();
                us5 us5Var2 = sv5Var.d;
                if (us5Var2 != null) {
                    sv5Var.a(us5Var2);
                }
                sv5Var.a(us5Var);
                ((ArrayList) epsVar.b).add(sv5Var);
                ((r26) epsVar.c).e(us5Var, new aw5(3, epsVar, us5Var));
                if (!us5Var.m.isEmpty()) {
                    ((r26) epsVar.c).a(us5Var.m, new at5(2, epsVar));
                    break;
                }
                break;
        }
    }
}
