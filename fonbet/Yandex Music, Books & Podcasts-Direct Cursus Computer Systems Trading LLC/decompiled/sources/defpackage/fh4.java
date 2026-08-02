package defpackage;

/* loaded from: classes3.dex */
public final class fh4 extends ih4 implements eh4 {
    public final dh4 b;
    public final /* synthetic */ kh4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh4(kh4 kh4Var, dh4 dh4Var) {
        super("empty");
        dh4Var.getClass();
        this.c = kh4Var;
        this.b = dh4Var;
    }

    @Override // defpackage.eh4
    public final dh4 a() {
        return this.b;
    }

    @Override // defpackage.ih4
    public final jh4 c(p7h p7hVar, gu1 gu1Var, yh4 yh4Var) {
        gu1Var.getClass();
        kh4 kh4Var = this.c;
        qdc qdcVar = kh4Var.a;
        k5r.t(qdcVar, qdcVar, "wm_foreground_loading");
        fi4 a = kh4Var.b.a();
        a.b(p7hVar, gu1Var, yh4Var);
        return new bh4(kh4Var, this.b, a, p7hVar);
    }

    @Override // defpackage.ih4
    public final ih4 f() {
        return new gh4(this.c);
    }

    public final jh4 g() {
        kh4 kh4Var = this.c;
        qdc qdcVar = kh4Var.a;
        qdcVar.getClass();
        dwt.b(new zya(18, qdcVar, "wm_background_loading"));
        fi4 a = kh4Var.b.a();
        dh4 dh4Var = this.b;
        ah4 ah4Var = new ah4(kh4Var, dh4Var, a, 1);
        return dh4Var.h ? ah4Var.h() : ah4Var;
    }

    @Override // defpackage.ih4
    public final ih4 b() {
        return this;
    }

    @Override // defpackage.ih4
    public final ih4 d() {
        return this;
    }
}
