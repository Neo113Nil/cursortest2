package defpackage;

/* loaded from: classes5.dex */
public final class vi4 extends x28 {
    public final String a;

    public vi4(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "check_payment";
    }

    @Override // defpackage.x28
    public final z9h e() {
        z9h z9hVar = new z9h();
        z9hVar.j("purchase_token", this.a);
        return z9hVar;
    }
}
