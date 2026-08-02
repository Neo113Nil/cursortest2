package defpackage;

import io.appmetrica.analytics.impl.C0574qb;

/* loaded from: classes3.dex */
public final class bh4 extends jh4 implements eh4 {
    public final dh4 b;
    public final fi4 c;
    public final p7h d;
    public final /* synthetic */ kh4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh4(kh4 kh4Var, dh4 dh4Var, fi4 fi4Var, p7h p7hVar) {
        super(C0574qb.g);
        dh4Var.getClass();
        fi4Var.getClass();
        this.e = kh4Var;
        this.b = dh4Var;
        this.c = fi4Var;
        this.d = p7hVar;
    }

    @Override // defpackage.eh4
    public final dh4 a() {
        return this.b;
    }

    @Override // defpackage.ih4
    public final jh4 c(p7h p7hVar, gu1 gu1Var, yh4 yh4Var) {
        gu1Var.getClass();
        if (p7hVar.equals(this.d)) {
            return this;
        }
        kh4 kh4Var = this.e;
        qdc qdcVar = kh4Var.a;
        qdcVar.getClass();
        dwt.b(new zya(18, qdcVar, "wm_foreground_replacing"));
        fi4 fi4Var = this.c;
        fi4Var.d();
        fi4Var.b(p7hVar, gu1Var, yh4Var);
        return new bh4(kh4Var, this.b, fi4Var, p7hVar);
    }

    @Override // defpackage.ih4
    public final ih4 d() {
        qdc qdcVar = this.e.a;
        k5r.t(qdcVar, qdcVar, "wm_foreground_owning");
        return this;
    }

    @Override // defpackage.ih4
    public final ih4 e(p7h p7hVar) {
        if (!p7hVar.equals(this.d)) {
            return this;
        }
        kh4 kh4Var = this.e;
        qdc qdcVar = kh4Var.a;
        qdcVar.getClass();
        dwt.b(new zya(18, qdcVar, "wm_foreground_detaching"));
        fi4 fi4Var = this.c;
        fi4Var.d();
        fi4Var.c();
        return new fh4(kh4Var, this.b);
    }

    @Override // defpackage.ih4
    public final ih4 f() {
        kh4 kh4Var = this.e;
        qdc qdcVar = kh4Var.a;
        qdcVar.getClass();
        dwt.b(new zya(18, qdcVar, "wm_foreground_releasing"));
        return new hh4(kh4Var, this.c, this.d);
    }

    @Override // defpackage.jh4
    public final fi4 g() {
        return this.c;
    }

    @Override // defpackage.ih4
    public final ih4 b() {
        return this;
    }
}
