package defpackage;

/* loaded from: classes5.dex */
public final class j13 extends vs2 {
    public final /* synthetic */ int a;
    public final String b;

    public j13(String str, int i) {
        this.a = i;
        str.getClass();
        switch (i) {
            case 3:
                this.b = str;
                break;
            default:
                this.b = str;
                break;
        }
    }

    @Override // defpackage.e1j
    public final String b() {
        switch (this.a) {
            case 0:
                return "v1/bind_sbp_token";
            case 1:
                return "v2/check_payment";
            case 2:
                return "v2/init_verification";
            case 3:
                return "v1/unbind_sbp_token";
            default:
                return "v2/check_verification";
        }
    }

    @Override // defpackage.vs2, defpackage.e1j
    public final z9h d() {
        switch (this.a) {
            case 0:
                z9h z9hVar = new z9h();
                z9hVar.j("redirect_url", this.b);
                z9hVar.j("mode", "async");
                return z9hVar;
            case 1:
                z9h z9hVar2 = new z9h();
                z9hVar2.j("purchase_token", this.b);
                return z9hVar2;
            case 2:
                z9h z9hVar3 = new z9h();
                z9hVar3.j("verification_intent_id", "");
                String str = this.b;
                if (str != null) {
                    z9hVar3.j("currency", str);
                }
                return z9hVar3;
            case 3:
                z9h z9hVar4 = new z9h();
                z9hVar4.j("sbp_token_id", this.b);
                return z9hVar4;
            default:
                z9h z9hVar5 = new z9h();
                z9hVar5.j("verification_id", this.b);
                return z9hVar5;
        }
    }

    @Override // defpackage.e1j
    public final s0o encoding() {
        switch (this.a) {
        }
        return new pv9(13);
    }

    @Override // defpackage.e1j
    public final q0j method() {
        switch (this.a) {
        }
        return q0j.post;
    }

    public /* synthetic */ j13(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }
}
