package defpackage;

import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class q5i {
    public final /* synthetic */ r5i a;

    public q5i(r5i r5iVar) {
        this.a = r5iVar;
    }

    public final void a(String str, sy60 sy60Var) {
        r5i r5iVar = this.a;
        String str2 = "discovery_delivery";
        r5iVar.A((m950) r5iVar.V.get(), new npu0((x3) new mpu0(str), str2, Float.valueOf(((avj0) r5iVar.W).b(psg0.shortcuts_corners_round)), false, 120), sy60Var);
    }

    public final void b(String str, sy60 sy60Var, q8s0 q8s0Var) {
        int i;
        int i2;
        Integer num;
        b5i b5iVar = this.a.M;
        if (str != null) {
            b5iVar.getClass();
            int intValue = (q8s0Var == null || (num = q8s0Var.a) == null) ? 1 : num.intValue();
            try {
                i = b5iVar.a.i(str, 0);
            } catch (ClassCastException unused) {
                i = 1;
            }
            if (i < intValue) {
                a(str, sy60Var);
                b5iVar.getClass();
                cne0 cne0Var = b5iVar.a;
                try {
                    i2 = cne0Var.i(str, 0);
                } catch (ClassCastException unused2) {
                    i2 = 1;
                }
                cne0Var.p(i2 + 1, str);
                return;
            }
        }
        sy60Var.a();
    }

    public final void c(PointType pointType, jo0 jo0Var) {
        r5i r5iVar = this.a;
        r5iVar.A((m950) r5iVar.O.get(), new q7v0(pointType), new p5i(r5iVar, this, jo0Var));
    }
}
