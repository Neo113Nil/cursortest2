package defpackage;

import androidx.fragment.app.o;

/* loaded from: classes3.dex */
public final class hh4 extends jh4 {
    public final fi4 b;
    public final o c;
    public final /* synthetic */ kh4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh4(kh4 kh4Var, fi4 fi4Var, p7h p7hVar) {
        super("foreground_only");
        fi4Var.getClass();
        p7hVar.getClass();
        this.d = kh4Var;
        this.b = fi4Var;
        this.c = p7hVar;
    }

    @Override // defpackage.ih4
    public final jh4 c(p7h p7hVar, gu1 gu1Var, yh4 yh4Var) {
        gu1Var.getClass();
        if (p7hVar.equals(this.c)) {
            return this;
        }
        kh4 kh4Var = this.d;
        qdc qdcVar = kh4Var.a;
        qdcVar.getClass();
        dwt.b(new zya(18, qdcVar, "wm_foreground_only_replacing"));
        fi4 fi4Var = this.b;
        fi4Var.d();
        fi4Var.b(p7hVar, gu1Var, yh4Var);
        return new hh4(kh4Var, fi4Var, p7hVar);
    }

    @Override // defpackage.ih4
    public final ih4 e(p7h p7hVar) {
        if (!p7hVar.equals(this.c)) {
            return this;
        }
        kh4 kh4Var = this.d;
        qdc qdcVar = kh4Var.a;
        qdcVar.getClass();
        dwt.b(new zya(18, qdcVar, "wm_foreground_only_detaching"));
        fi4 fi4Var = this.b;
        fi4Var.d();
        fi4Var.c();
        return new gh4(kh4Var);
    }

    @Override // defpackage.ih4
    public final ih4 f() {
        qdc qdcVar = this.d.a;
        k5r.t(qdcVar, qdcVar, "wm_foreground_only_releasing");
        return this;
    }

    @Override // defpackage.jh4
    public final fi4 g() {
        return this.b;
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
