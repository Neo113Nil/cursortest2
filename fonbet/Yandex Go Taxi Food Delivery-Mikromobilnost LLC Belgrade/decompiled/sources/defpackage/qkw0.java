package defpackage;

/* loaded from: classes.dex */
public abstract class qkw0 implements ull0 {
    public final hkw0 a;
    public final String b;
    public boolean c;

    public qkw0(hkw0 hkw0Var, String str) {
        this.a = hkw0Var;
        this.b = str;
    }

    @Override // defpackage.ull0
    public void C() {
        a();
    }

    public final void a() {
        if (this.c) {
            vez0.Y(21, "statement is closed");
            throw null;
        }
    }

    @Override // defpackage.ull0
    public void reset() {
        a();
    }
}
