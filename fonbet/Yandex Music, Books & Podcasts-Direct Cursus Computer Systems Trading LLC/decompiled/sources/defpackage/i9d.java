package defpackage;

/* loaded from: classes3.dex */
public final class i9d extends mbv {
    public final jsr c;
    public final qdc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9d(jsr jsrVar, qdc qdcVar) {
        super("getLog");
        jsrVar.getClass();
        qdcVar.getClass();
        this.c = jsrVar;
        this.d = qdcVar;
    }

    @Override // defpackage.mbv
    public final void a(hie hieVar) {
        qdc qdcVar = this.d;
        k5r.t(qdcVar, qdcVar, "wm_ask_support_logs");
        jsr jsrVar = this.c;
        jsrVar.getClass();
        jsrVar.a.z(new k0r(11, jsrVar, hieVar));
    }
}
