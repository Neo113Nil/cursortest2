package defpackage;

/* loaded from: classes5.dex */
public final class x9i extends ks2 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9i(String str, String str2) {
        super(str);
        str.getClass();
        this.b = str2;
    }

    @Override // defpackage.ks2
    public final z9h e() {
        z9h z9hVar = new z9h();
        z9hVar.j("method", "google_pay");
        String str = this.b;
        if (str != null) {
            z9hVar.j("token", str);
        }
        return z9hVar;
    }
}
