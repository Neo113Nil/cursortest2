package defpackage;

/* loaded from: classes11.dex */
public abstract class zmz0 {
    public final cxk a;
    public final int b;
    public final int c;
    public final m3k d;

    public zmz0(cxk cxkVar, int i) {
        this.a = cxkVar;
        this.b = i;
        this.c = cxkVar.a.c();
        this.d = cxkVar.a;
    }

    public final boolean a(zmz0 zmz0Var) {
        return this.c == zmz0Var.c && uml.h(this.d).equals(uml.h(zmz0Var.d));
    }
}
