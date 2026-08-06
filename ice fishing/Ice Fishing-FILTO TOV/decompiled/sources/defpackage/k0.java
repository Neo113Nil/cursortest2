package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class k0 extends ru0 implements lv {
    public int AvO7iQsrTN;
    public /* synthetic */ Object encWxUiV2;
    public final /* synthetic */ m0 mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, vg vgVar) {
        super(vgVar);
        this.mOu10nynGul = m0Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((k0) uFEq9NpZ((vg) obj2, (g71) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r14 != r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0037, code lost:
    
        if (r14 == r6) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004c -> B:6:0x004f). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        g71 g71Var;
        Object obj2;
        int i = this.AvO7iQsrTN;
        hq0 hq0Var = hq0.EljAMC1QTz;
        m0 m0Var = this.mOu10nynGul;
        qh qhVar = qh.OOA6hdeuvCS;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            g71Var = (g71) this.encWxUiV2;
            this.encWxUiV2 = g71Var;
            this.AvO7iQsrTN = 1;
            obj = z50.OOA6hdeuvCS(g71Var, hq0Var, this);
        } else if (i == 1) {
            g71Var = (g71) this.encWxUiV2;
            o50.A1EKNP6CxJ(obj);
        } else {
            if (i != 2) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g71Var = (g71) this.encWxUiV2;
            o50.A1EKNP6CxJ(obj);
            List list = ((gq0) obj).GWasM1elztuh;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj3 = list.get(i3);
                if (((kq0) obj3).xqGvceK5x) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                if (q70.XnEVoBF0td1l(((kq0) obj2).GWasM1elztuh, m0Var.encWxUiV2)) {
                    break;
                }
                i2++;
            }
            kq0 kq0Var = (kq0) obj2;
            if (kq0Var == null) {
                kq0Var = (kq0) rb.YTyqgZhdF(arrayList);
            }
            if (kq0Var != null) {
                m0Var.encWxUiV2 = kq0Var.GWasM1elztuh;
                m0Var.Yi7zF1RB1 = kq0Var.X1lG3V04pd;
            }
            if (arrayList.isEmpty()) {
                m0Var.encWxUiV2 = -1L;
                return kc1.GWasM1elztuh;
            }
            this.encWxUiV2 = g71Var;
            this.AvO7iQsrTN = 2;
            obj = g71Var.GWasM1elztuh(hq0Var, this);
        }
        kq0 kq0Var2 = (kq0) obj;
        m0Var.encWxUiV2 = kq0Var2.GWasM1elztuh;
        m0Var.Yi7zF1RB1 = kq0Var2.X1lG3V04pd;
        this.encWxUiV2 = g71Var;
        this.AvO7iQsrTN = 2;
        obj = g71Var.GWasM1elztuh(hq0Var, this);
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        k0 k0Var = new k0(this.mOu10nynGul, vgVar);
        k0Var.encWxUiV2 = obj;
        return k0Var;
    }
}
