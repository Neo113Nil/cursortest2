package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public abstract class r45 extends l55 {
    public final String a;

    public r45(String str) {
        this.a = str;
    }

    @Override // defpackage.l55, defpackage.hz50
    public final wj00 a() {
        wj00 wj00Var = new wj00(0);
        wj00Var.k("purchase_token", this.a);
        wj00Var.b.put("payment_method_data", e());
        return wj00Var;
    }

    @Override // defpackage.hz50
    public final String c() {
        return "v2/supply_payment_data";
    }

    public abstract wj00 e();

    @Override // defpackage.hz50
    public final y5j0 encoding() {
        return new aex();
    }

    @Override // defpackage.hz50
    public final NetworkMethod method() {
        return NetworkMethod.post;
    }
}
