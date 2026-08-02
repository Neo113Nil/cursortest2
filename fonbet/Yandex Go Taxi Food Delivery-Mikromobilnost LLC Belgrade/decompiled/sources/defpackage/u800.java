package defpackage;

import com.yandex.div.core.expression.variables.a;
import com.ybsdk.utils.poller.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class u800 implements v7p {
    public final /* synthetic */ int a = 2;
    public final xvf0 b;
    public final y2r0 c;

    public u800(y2r0 y2r0Var, xvf0 xvf0Var) {
        this.c = y2r0Var;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        y2r0 y2r0Var = this.c;
        switch (i) {
            case 0:
                smp smpVar = (smp) xvf0Var.get();
                Set set = (Set) y2r0Var.get();
                Iterator it = set.iterator();
                int size = set.size();
                c231[] c231VarArr = new c231[size];
                for (int i2 = 0; i2 < size; i2++) {
                    c231VarArr[i2] = ((i231) it.next()).create();
                }
                a a = smpVar.a();
                a.i((c231[]) Arrays.copyOf(c231VarArr, size));
                return a;
            case 1:
                return new u1b0((dlw0) xvf0Var.get(), (Set) y2r0Var.get());
            case 2:
                return new b((Set) y2r0Var.get(), (nyd0) xvf0Var.get());
            default:
                return new dlw0((Set) y2r0Var.get(), (Set) xvf0Var.get());
        }
    }

    public u800(xvf0 xvf0Var, y2r0 y2r0Var) {
        this.b = xvf0Var;
        this.c = y2r0Var;
    }

    public u800(epp0 epp0Var, y2r0 y2r0Var, npe0 npe0Var) {
        this.c = y2r0Var;
        this.b = npe0Var;
    }

    public u800(t800 t800Var, y2g y2gVar, y2r0 y2r0Var) {
        this.b = y2gVar;
        this.c = y2r0Var;
    }
}
