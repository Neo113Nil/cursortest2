package defpackage;

/* loaded from: classes6.dex */
public final class vrv0 implements m90 {
    public final yrv0 a;
    public final h1p b;

    public vrv0(yrv0 yrv0Var, h1p h1pVar) {
        this.a = yrv0Var;
        this.b = h1pVar;
    }

    @Override // defpackage.m90
    public final void a() {
        this.a.c("Superapp.AddCard.Cancelled", this.b, null);
    }

    @Override // defpackage.m90
    public final void b(String str) {
        if (str != null) {
            this.a.c("Superapp.AddCard.Succeeded", this.b, null);
        }
    }

    @Override // defpackage.m90
    public final void c() {
        this.a.c("Superapp.AddCard.Failed", this.b, null);
    }
}
