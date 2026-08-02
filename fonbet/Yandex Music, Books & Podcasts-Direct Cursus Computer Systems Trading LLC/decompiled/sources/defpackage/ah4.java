package defpackage;

import io.appmetrica.analytics.impl.C0479n3;

/* loaded from: classes3.dex */
public final class ah4 extends jh4 implements eh4 {
    public final /* synthetic */ int b;
    public final dh4 c;
    public final fi4 d;
    public final /* synthetic */ kh4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah4(kh4 kh4Var, dh4 dh4Var, fi4 fi4Var, int i) {
        super(C0479n3.g);
        this.b = i;
        dh4Var.getClass();
        fi4Var.getClass();
        switch (i) {
            case 1:
                this.e = kh4Var;
                super("detached");
                this.c = dh4Var;
                this.d = fi4Var;
                break;
            default:
                this.e = kh4Var;
                this.c = dh4Var;
                this.d = fi4Var;
                break;
        }
    }

    @Override // defpackage.eh4
    public final dh4 a() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // defpackage.ih4
    public final ih4 b() {
        switch (this.b) {
            case 0:
                return this;
            default:
                return h();
        }
    }

    @Override // defpackage.ih4
    public final jh4 c(p7h p7hVar, gu1 gu1Var, yh4 yh4Var) {
        switch (this.b) {
            case 0:
                gu1Var.getClass();
                kh4 kh4Var = this.e;
                qdc qdcVar = kh4Var.a;
                k5r.t(qdcVar, qdcVar, "wm_background_foreground_switching");
                fi4 fi4Var = this.d;
                fi4Var.d();
                fi4Var.b(p7hVar, gu1Var, yh4Var);
                return new bh4(kh4Var, this.c, fi4Var, p7hVar);
            default:
                gu1Var.getClass();
                fi4 fi4Var2 = this.d;
                fi4Var2.b(p7hVar, gu1Var, yh4Var);
                kh4 kh4Var2 = this.e;
                qdc qdcVar2 = kh4Var2.a;
                qdcVar2.getClass();
                dwt.b(new zya(18, qdcVar2, "wm_foreground_attaching"));
                return new bh4(kh4Var2, this.c, fi4Var2, p7hVar);
        }
    }

    @Override // defpackage.ih4
    public final ih4 d() {
        switch (this.b) {
            case 0:
                kh4 kh4Var = this.e;
                qdc qdcVar = kh4Var.a;
                k5r.t(qdcVar, qdcVar, "wm_background_detaching");
                fi4 fi4Var = this.d;
                fi4Var.d();
                return new ah4(kh4Var, this.c, fi4Var, 1);
            default:
                return this;
        }
    }

    @Override // defpackage.ih4
    public final ih4 e(p7h p7hVar) {
        int i = this.b;
        return this;
    }

    @Override // defpackage.ih4
    public final ih4 f() {
        switch (this.b) {
            case 0:
                fi4 fi4Var = this.d;
                fi4Var.d();
                fi4Var.c();
                kh4 kh4Var = this.e;
                qdc qdcVar = kh4Var.a;
                qdcVar.getClass();
                dwt.b(new zya(18, qdcVar, "wm_background_attached_releasing"));
                return new gh4(kh4Var);
            default:
                this.d.c();
                kh4 kh4Var2 = this.e;
                qdc qdcVar2 = kh4Var2.a;
                qdcVar2.getClass();
                dwt.b(new zya(18, qdcVar2, "wm_background_detached_releasing"));
                return new gh4(kh4Var2);
        }
    }

    @Override // defpackage.jh4
    public final fi4 g() {
        switch (this.b) {
        }
        return this.d;
    }

    public ah4 h() {
        kh4 kh4Var = this.e;
        rp7 rp7Var = new rp7(kh4Var);
        yh4 yh4Var = yh4.c;
        fi4 fi4Var = this.d;
        dh4 dh4Var = this.c;
        fi4Var.b(dh4Var, rp7Var, yh4Var);
        qdc qdcVar = kh4Var.a;
        qdcVar.getClass();
        dwt.b(new zya(18, qdcVar, "wm_background_attaching"));
        return new ah4(kh4Var, dh4Var, fi4Var, 0);
    }
}
