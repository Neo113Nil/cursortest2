package defpackage;

/* loaded from: classes9.dex */
public abstract class zc5 {
    public final l050 a;
    public l050 b;
    public boolean c;

    public zc5(Class cls) {
        this.a = (l050) ((zxf0) pwf0.c(cls));
    }

    public void Bg(l050 l050Var) {
        this.b = l050Var;
        if (this.c) {
            Gg();
        }
    }

    public void Cg() {
        if (this.c) {
            Fg();
        }
        this.b = null;
        getClass().toString();
    }

    public final l050 Dg() {
        l050 l050Var = this.b;
        return l050Var == null ? this.a : l050Var;
    }

    public final boolean Eg() {
        return this.b != null;
    }

    public void Fg() {
    }

    public void Gg() {
    }

    public final void pause() {
        boolean z = this.c;
        this.c = false;
        if (z && Eg()) {
            Fg();
        }
    }

    public final void resume() {
        boolean z = this.c;
        this.c = true;
        if (z || !Eg()) {
            return;
        }
        Gg();
    }
}
