package defpackage;

import com.yandex.go.address.models.Address;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.collections.a;
import ru.yandex.taxi.order.OrderFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class x71 implements ax4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x71(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ax4
    public final void t(pv0 pv0Var) {
        Object obj;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((y71) obj2).r(new t71(pv0Var, 1));
                break;
            case 1:
                ((qa0) obj2).accept(pv0Var);
                break;
            case 2:
                ((tb) obj2).accept(pv0Var);
                break;
            case 3:
                ((k1a) obj2).r(new qu(9));
                break;
            case 4:
                ((gai) obj2).r(new t71(pv0Var, 2));
                break;
            case 5:
                eks eksVar = (eks) obj2;
                List list = pv0Var.h;
                dw1 dw1Var = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            v7v0 v7v0Var = (v7v0) obj;
                            if (!jl40.l(v7v0Var != null ? v7v0Var.a : null, pv0Var.a.B()) || v7v0Var.M == null) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    v7v0 v7v0Var2 = (v7v0) obj;
                    if (v7v0Var2 != null) {
                        dw1Var = v7v0Var2.M;
                    }
                }
                eksVar.r(new s1r(17, dw1Var));
                break;
            case 6:
                ((y71) obj2).r(new t71(pv0Var, 4));
                break;
            case 7:
                ((da0) obj2).r(new qu(9));
                break;
            case 8:
                f28 f28Var = (f28) obj2;
                wu30 wu30Var = (wu30) f28Var.I;
                Address address = pv0Var.a;
                tu30 tu30Var = wu30Var.a;
                tu30Var.b(a.o0(tu30Var.a().b, address));
                f28Var.r(new qu(9));
                break;
            case 9:
                OrderFragment.showDestinationPicker$lambda$1((Consumer) obj2, pv0Var);
                break;
            default:
                ((da0) obj2).r(new t71(pv0Var, 21));
                break;
        }
    }
}
