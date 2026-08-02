package defpackage;

/* loaded from: classes5.dex */
public final class z9i extends ks2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z9i(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.ks2
    public final z9h e() {
        switch (this.b) {
            case 0:
                z9h z9hVar = new z9h();
                z9hVar.j("method", "new_sbp_token");
                return z9hVar;
            default:
                z9h z9hVar2 = new z9h();
                z9hVar2.j("method", "sbp_qr");
                return z9hVar2;
        }
    }
}
