package defpackage;

/* loaded from: classes.dex */
public final class poj implements f6e {
    public final /* synthetic */ int a;
    public String b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public poj(String str, poj pojVar, nnk nnkVar, bjq bjqVar, iwe iweVar) {
        this.a = 1;
        iweVar.getClass();
        this.b = str;
        this.c = pojVar;
        this.d = nnkVar;
        this.e = bjqVar;
        this.f = iweVar;
    }

    @Override // defpackage.va7
    public final db7 a() {
        switch (this.a) {
            case 0:
                qoj qojVar = new qoj((ds3) this.d, this.b, (cp3) this.f, (j6e) this.c);
                t6t t6tVar = (t6t) this.e;
                if (t6tVar != null) {
                    qojVar.q(t6tVar);
                }
                return qojVar;
            default:
                return b();
        }
    }

    public final k6e b() {
        switch (this.a) {
            case 0:
                qoj qojVar = new qoj((ds3) this.d, this.b, (cp3) this.f, (j6e) this.c);
                t6t t6tVar = (t6t) this.e;
                if (t6tVar != null) {
                    qojVar.q(t6tVar);
                }
                return qojVar;
            default:
                return new ulr(this.b, ((poj) this.c).b(), (nnk) this.d, (bjq) this.e, (iwe) this.f);
        }
    }

    public poj(ds3 ds3Var) {
        this.a = 0;
        this.d = ds3Var;
        this.c = new j6e(0);
    }
}
