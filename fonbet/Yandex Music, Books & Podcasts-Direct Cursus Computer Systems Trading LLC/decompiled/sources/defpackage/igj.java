package defpackage;

/* loaded from: classes5.dex */
public final class igj extends vs2 {
    public final /* synthetic */ int a;
    public final Enum b;

    public /* synthetic */ igj(Enum r1, int i) {
        this.a = i;
        this.b = r1;
    }

    @Override // defpackage.vs2, defpackage.e1j
    public z9h a() {
        switch (this.a) {
            case 0:
                z9h z9hVar = new z9h();
                z9hVar.j("src", ((kgj) this.b).a);
                return z9hVar;
            default:
                return super.a();
        }
    }

    @Override // defpackage.e1j
    public final String b() {
        switch (this.a) {
            case 0:
                return "v1/nspk_bank_apps_common";
            default:
                return "v1/payment_methods";
        }
    }

    @Override // defpackage.vs2, defpackage.e1j
    public z9h d() {
        switch (this.a) {
            case 1:
                z9h z9hVar = new z9h();
                String str = ((jeq) this.b).a;
                jeq jeqVar = jeq.enabled;
                z9hVar.h("show_sbp_tokens", str.equals("sbpTokensEnabled"));
                return z9hVar;
            default:
                return super.d();
        }
    }

    @Override // defpackage.e1j
    public final s0o encoding() {
        switch (this.a) {
            case 0:
                return new kpm(16);
            default:
                return new pv9(13);
        }
    }

    @Override // defpackage.e1j
    public final q0j method() {
        switch (this.a) {
            case 0:
                return q0j.get;
            default:
                return q0j.post;
        }
    }
}
