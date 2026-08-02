package defpackage;

/* loaded from: classes3.dex */
public final class x5n implements w5n {
    public final /* synthetic */ w5n a;
    public final /* synthetic */ x3n b;
    public final /* synthetic */ qzc c;

    public x5n(w5n w5nVar, x3n x3nVar, qzc qzcVar) {
        this.a = w5nVar;
        this.b = x3nVar;
        this.c = qzcVar;
    }

    @Override // defpackage.w5n
    public final void a() {
        this.a.a();
        x3n x3nVar = this.b;
        n3m n3mVar = (n3m) x3nVar.d;
        if (n3mVar != null) {
            if (((Boolean) ((jyr) n3mVar.d).getValue()).booleanValue()) {
                ((sai) n3mVar.f).a();
            } else {
                ((jp0) n3mVar.e).e();
            }
        }
        x3nVar.d = null;
    }

    @Override // defpackage.w5n
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.w5n
    public final void c() {
        w1g.y((hn5) this.c.b, "yandexmusic://cards/promo/audio_quality_formats", true);
        this.a.c();
    }

    @Override // defpackage.w5n
    public final void d(uft uftVar, uft uftVar2) {
        uftVar2.getClass();
        this.a.d(uftVar, uftVar2);
        x3n x3nVar = this.b;
        n3m n3mVar = (n3m) x3nVar.d;
        if (n3mVar != null) {
            if (((Boolean) ((jyr) n3mVar.d).getValue()).booleanValue()) {
                ((sai) n3mVar.f).a();
            } else {
                ((jp0) n3mVar.e).e();
            }
        }
        x3nVar.d = null;
    }
}
