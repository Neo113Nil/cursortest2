package defpackage;

/* loaded from: classes.dex */
public final class auf {
    public final Object a;
    public final buf b;
    public int d;
    public auf e;
    public boolean f;
    public int c = -1;
    public final x6k g = szf.g0(null);

    public auf(Object obj, buf bufVar) {
        this.a = obj;
        this.b = bufVar;
    }

    public final auf a() {
        if (this.f) {
            vme.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            auf aufVar = (auf) this.g.getValue();
            if (aufVar != null) {
                aufVar.a();
            } else {
                aufVar = null;
            }
            this.e = aufVar;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            vme.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            auf aufVar = this.e;
            if (aufVar != null) {
                aufVar.b();
            }
            this.e = null;
        }
    }
}
