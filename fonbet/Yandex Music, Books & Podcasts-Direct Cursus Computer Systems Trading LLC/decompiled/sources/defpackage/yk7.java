package defpackage;

import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class yk7 implements ib7, vyi {
    public final OkHttpClient a;
    public final String b;
    public pyi c;

    public yk7(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = okHttpClient;
        this.b = "DefaultDataSourceFactory";
    }

    @Override // defpackage.ib7
    public final void B0(pt0 pt0Var) {
        pt0Var.getClass();
        if (this.c == null) {
            this.c = new pyi(this.a, pt0Var);
        }
    }

    @Override // defpackage.ib7
    public final va7 b(t6t t6tVar) {
        ds3 ds3Var = this.c;
        if (ds3Var == null) {
            ds3Var = this.a;
        }
        poj pojVar = new poj(ds3Var);
        pojVar.b = null;
        pojVar.e = t6tVar;
        pojVar.f = new cp3(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
        return new vdg(pojVar, g(), "DefaultDataSourceFactory");
    }

    @Override // defpackage.vyi
    public final String d() {
        return this.b;
    }

    @Override // defpackage.vyi
    public final boolean g() {
        return this.c != null;
    }
}
