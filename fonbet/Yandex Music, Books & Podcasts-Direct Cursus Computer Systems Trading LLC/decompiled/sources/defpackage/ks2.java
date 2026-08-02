package defpackage;

/* loaded from: classes5.dex */
public abstract class ks2 extends vs2 {
    public final String a;

    public ks2(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "v2/supply_payment_data";
    }

    @Override // defpackage.vs2, defpackage.e1j
    public final z9h d() {
        z9h z9hVar = new z9h();
        z9hVar.j("purchase_token", this.a);
        w1g.B(z9hVar.b, "payment_method_data", e());
        return z9hVar;
    }

    public abstract z9h e();

    @Override // defpackage.e1j
    public final s0o encoding() {
        return new pv9(13);
    }

    @Override // defpackage.e1j
    public final q0j method() {
        return q0j.post;
    }
}
