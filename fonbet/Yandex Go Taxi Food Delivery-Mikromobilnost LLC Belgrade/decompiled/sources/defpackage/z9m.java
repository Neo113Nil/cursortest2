package defpackage;

import com.yandex.go.design.compose.list.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class z9m {
    public final oz40 a;
    public final yx40 b;
    public final tx40 c;
    public final l3t0 d;
    public final w5 e;

    public z9m(oz40 oz40Var, yx40 yx40Var, tx40 tx40Var, l3t0 l3t0Var, w5 w5Var) {
        this.a = oz40Var;
        this.b = yx40Var;
        this.c = tx40Var;
        this.d = l3t0Var;
        this.e = w5Var;
    }

    public static final float a(z9m z9mVar, float f) {
        b1x b1xVar;
        l3t0 l3t0Var = z9mVar.d;
        int intValue = z9mVar.b.getIntValue();
        if (intValue == -1 || (b1xVar = (b1x) l3t0Var.get(Integer.valueOf(intValue))) == null || l3t0Var.isEmpty()) {
            return f;
        }
        Iterator it = l3t0Var.w.iterator();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        while (((c5u0) it).hasNext()) {
            b1x b1xVar2 = (b1x) ((c5u0) it).next();
            float f4 = b1xVar2.a;
            if (f4 < f2) {
                f2 = f4;
            }
            float f5 = f4 + b1xVar2.b;
            if (f5 > f3) {
                f3 = f5;
            }
        }
        float f6 = b1xVar.a;
        return y6i0.c(f, f2 - f6, f3 - (f6 + b1xVar.b));
    }

    public static final void b(z9m z9mVar, boolean z) {
        yx40 yx40Var = z9mVar.b;
        boolean z2 = yx40Var.getIntValue() != -1;
        yx40Var.setIntValue(-1);
        z9mVar.c.setFloatValue(0.0f);
        if (z2 && z) {
            z9mVar.e.invoke(((bpl0) z9mVar.a.getValue()).a);
        }
    }

    public final void c(int i, int i2) {
        oz40 oz40Var = this.a;
        List list = ((bpl0) oz40Var.getValue()).a;
        int d = y6i0.d(i2, 0, scc.f(list));
        if (d == i || i < 0) {
            return;
        }
        List list2 = list;
        if (i < list2.size()) {
            ArrayList arrayList = new ArrayList(list2);
            arrayList.add(d, arrayList.remove(i));
            oz40Var.setValue(a.b(arrayList, ((bpl0) oz40Var.getValue()).b));
            this.e.invoke(((bpl0) oz40Var.getValue()).a);
        }
    }
}
