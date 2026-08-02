package defpackage;

/* loaded from: classes5.dex */
public final class bit extends x28 {
    public final String a;
    public final String b;

    public bit(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "unbind_card";
    }

    @Override // defpackage.x28
    public final z9h e() {
        z9h z9hVar = new z9h();
        String str = this.a;
        if (str != null) {
            z9hVar.j("token", str);
        }
        z9hVar.j("card", this.b);
        return z9hVar;
    }
}
