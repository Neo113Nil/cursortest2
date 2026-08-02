package defpackage;

/* loaded from: classes.dex */
public abstract class ctr implements cko {
    public final rsr a;
    public final String b;
    public boolean c;

    public ctr(rsr rsrVar, String str) {
        this.a = rsrVar;
        this.b = str;
    }

    public final void a() {
        if (this.c) {
            p6g.H(21, "statement is closed");
            throw null;
        }
    }

    @Override // defpackage.cko
    public void clearBindings() {
        a();
    }

    @Override // defpackage.cko
    public void reset() {
        a();
    }
}
