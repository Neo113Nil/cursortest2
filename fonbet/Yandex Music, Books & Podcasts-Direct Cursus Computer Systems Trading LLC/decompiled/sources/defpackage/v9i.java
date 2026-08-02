package defpackage;

/* loaded from: classes5.dex */
public final class v9i extends ks2 {
    public final String b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9i(String str, String str2, String str3) {
        super(str);
        str.getClass();
        str2.getClass();
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.ks2
    public final z9h e() {
        q1f q1fVar;
        z9h z9hVar = new z9h();
        z9hVar.j("method", "bound");
        z9hVar.j("binding_id", this.b);
        hah hahVar = hah.b;
        String str = this.c;
        if (str != null) {
            q1fVar = (q1f) ((uif) hahVar.a.c).invoke(str);
        } else {
            hahVar.getClass();
            q1fVar = null;
        }
        if (q1fVar != null) {
            w1g.B(z9hVar.b, "payload", q1fVar);
        }
        return z9hVar;
    }
}
