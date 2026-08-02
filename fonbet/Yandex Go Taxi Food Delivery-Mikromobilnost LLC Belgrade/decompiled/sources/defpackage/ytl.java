package defpackage;

/* loaded from: classes9.dex */
public final class ytl implements eg90 {
    public final pul c;
    public final String d;
    public final eg90 e;

    public ytl(pul pulVar, String str, eg90 eg90Var) {
        this.c = pulVar;
        this.d = str;
        this.e = eg90Var;
    }

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        this.c.a(exc, this.d);
        this.e.a(exc);
    }

    @Override // defpackage.eg90
    public final void b(Exception exc, String str) {
        this.c.b(exc, this.d, str);
        this.e.b(exc, str);
    }
}
