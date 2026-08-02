package defpackage;

import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class br3 implements ib7, vyi {
    public final liq a;
    public final OkHttpClient b;
    public final t8w c;
    public final uq3 d;
    public pt0 e;

    public br3(liq liqVar, OkHttpClient okHttpClient, t8w t8wVar, uq3 uq3Var) {
        okHttpClient.getClass();
        this.a = liqVar;
        this.b = okHttpClient;
        this.c = t8wVar;
        this.d = uq3Var;
    }

    @Override // defpackage.ib7
    public final void B0(pt0 pt0Var) {
        pt0Var.getClass();
        this.e = pt0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [pyi] */
    @Override // defpackage.ib7
    public final va7 b(t6t t6tVar) {
        OkHttpClient okHttpClient = this.b;
        okHttpClient.getClass();
        pt0 pt0Var = this.e;
        OkHttpClient pyiVar = pt0Var != null ? new pyi(okHttpClient, pt0Var) : null;
        if (pyiVar != null) {
            okHttpClient = pyiVar;
        }
        poj pojVar = new poj(okHttpClient);
        pojVar.b = null;
        pojVar.e = t6tVar;
        pojVar.f = new cp3(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
        final vdg vdgVar = new vdg(pojVar, pyiVar != null, "DefaultDataSourceFactory");
        r8w r8wVar = new r8w();
        boolean g = g();
        final liq liqVar = this.a;
        r8wVar.a = liqVar;
        r8wVar.f = new va7() { // from class: vq3
            @Override // defpackage.va7
            public final db7 a() {
                db7 a = vdgVar.a();
                return br3.this.d.a ? new xq3(liqVar, a) : a;
            }
        };
        r8wVar.b = new wq3(0, this, liqVar);
        r8wVar.c = new v13(1, this, liqVar);
        r8wVar.e = false;
        r8wVar.g = 3;
        r8wVar.i = g;
        if (this.d.a) {
            r8wVar.h = new ar3();
        }
        r8wVar.d = this.c;
        return r8wVar;
    }

    @Override // defpackage.vyi
    public final String d() {
        return "CachedDataSourceFactory";
    }

    @Override // defpackage.vyi
    public final boolean g() {
        return this.e != null;
    }
}
