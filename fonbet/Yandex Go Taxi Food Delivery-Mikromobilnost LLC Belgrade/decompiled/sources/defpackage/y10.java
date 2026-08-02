package defpackage;

import java.util.HashMap;

/* loaded from: classes14.dex */
public final class y10 implements c4y0 {
    public final a480 a;
    public final q480 b;

    public y10(a480 a480Var, q480 q480Var) {
        this.a = a480Var;
        this.b = q480Var;
    }

    @Override // defpackage.c4y0
    public final void a() {
        a4y0 a4y0Var = (a4y0) this.a.a.getValue();
        if (a4y0Var == null) {
            return;
        }
        co40 co40Var = this.b.a;
        String str = a4y0Var.a;
        String str2 = a4y0Var.b;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("modal_id", str2);
        co40Var.a.a("OrderModalCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.c4y0
    public final void e() {
        a480 a480Var = this.a;
        a4y0 a4y0Var = (a4y0) a480Var.a.getValue();
        if (a4y0Var != null) {
            co40 co40Var = this.b.a;
            String str = a4y0Var.a;
            String str2 = a4y0Var.b;
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("order_id", str);
            hashMap.put("modal_id", str2);
            co40Var.a.a("OrderModalCard.Closed", hashMap, 1, new HashMap());
        }
        a480Var.a.l(null);
    }
}
