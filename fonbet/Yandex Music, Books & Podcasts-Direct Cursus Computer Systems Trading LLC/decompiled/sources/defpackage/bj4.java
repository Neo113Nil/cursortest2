package defpackage;

/* loaded from: classes5.dex */
public final class bj4 extends vs2 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public bj4(String str, String str2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = str2;
                break;
            case 2:
                str.getClass();
                this.b = str;
                this.c = str2;
                break;
            default:
                str.getClass();
                this.b = str;
                this.c = str2;
                break;
        }
    }

    @Override // defpackage.e1j
    public final String b() {
        switch (this.a) {
            case 0:
                return "v1/check_verification";
            case 1:
                return "v2/feature_flags";
            default:
                return "v1/verify_binding";
        }
    }

    @Override // defpackage.vs2, defpackage.e1j
    public z9h c() {
        switch (this.a) {
            case 1:
                z9h z9hVar = new z9h();
                z9hVar.j("X-SDK-Application", this.b);
                z9hVar.j("X-USER-UUID", this.c);
                return z9hVar;
            default:
                return super.c();
        }
    }

    @Override // defpackage.vs2, defpackage.e1j
    public z9h d() {
        switch (this.a) {
            case 0:
                z9h z9hVar = new z9h();
                z9hVar.j("binding_id", this.b);
                z9hVar.j("verification_id", this.c);
                return z9hVar;
            case 1:
            default:
                return super.d();
            case 2:
                z9h z9hVar2 = new z9h();
                z9hVar2.j("binding_id", this.b);
                String str = this.c;
                if (str != null) {
                    z9hVar2.j("currency", str);
                }
                return z9hVar2;
        }
    }

    @Override // defpackage.e1j
    public final s0o encoding() {
        switch (this.a) {
            case 0:
                return new pv9(13);
            case 1:
                return new kpm(16);
            default:
                return new pv9(13);
        }
    }

    @Override // defpackage.e1j
    public final q0j method() {
        switch (this.a) {
            case 0:
                return q0j.post;
            case 1:
                return q0j.get;
            default:
                return q0j.post;
        }
    }
}
