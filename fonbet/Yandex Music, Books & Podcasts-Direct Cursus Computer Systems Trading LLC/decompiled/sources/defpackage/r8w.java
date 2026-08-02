package defpackage;

/* loaded from: classes.dex */
public final class r8w implements va7, vyi {
    public liq a;
    public ra7 c;
    public boolean e;
    public va7 f;
    public int g;
    public q8w h;
    public boolean i = false;
    public va7 b = new l9c();
    public vp3 d = vp3.R;

    @Override // defpackage.va7
    public final db7 a() {
        va7 va7Var = this.f;
        ta7 ta7Var = null;
        db7 a = va7Var != null ? va7Var.a() : null;
        int i = this.g;
        liq liqVar = this.a;
        liqVar.getClass();
        if (!this.e && a != null) {
            ra7 ra7Var = this.c;
            ta7Var = ra7Var != null ? ra7Var.e() : new hp3(liqVar, 5242880L);
        }
        return new s8w(liqVar, a, this.b.a(), ta7Var, this.d, i, this.h);
    }

    @Override // defpackage.vyi
    public final String d() {
        return "YandexCacheDataSource.Factory";
    }

    @Override // defpackage.vyi
    public final boolean g() {
        return this.i;
    }
}
