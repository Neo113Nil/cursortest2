package O;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f2131a;

    /* renamed from: b, reason: collision with root package name */
    public G.e[] f2132b;

    public s0() {
        this(new A0());
    }

    public final void a() {
        G.e[] eVarArr = this.f2132b;
        if (eVarArr != null) {
            G.e eVar = eVarArr[0];
            G.e eVar2 = eVarArr[1];
            A0 a02 = this.f2131a;
            if (eVar2 == null) {
                eVar2 = a02.f2027a.f(2);
            }
            if (eVar == null) {
                eVar = a02.f2027a.f(1);
            }
            g(G.e.a(eVar, eVar2));
            G.e eVar3 = this.f2132b[com.bumptech.glide.e.g(16)];
            if (eVar3 != null) {
                f(eVar3);
            }
            G.e eVar4 = this.f2132b[com.bumptech.glide.e.g(32)];
            if (eVar4 != null) {
                d(eVar4);
            }
            G.e eVar5 = this.f2132b[com.bumptech.glide.e.g(64)];
            if (eVar5 != null) {
                h(eVar5);
            }
        }
    }

    public abstract A0 b();

    public void c(int i, G.e eVar) {
        if (this.f2132b == null) {
            this.f2132b = new G.e[9];
        }
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i & i6) != 0) {
                this.f2132b[com.bumptech.glide.e.g(i6)] = eVar;
            }
        }
    }

    public abstract void e(G.e eVar);

    public abstract void g(G.e eVar);

    public s0(A0 a02) {
        this.f2131a = a02;
    }

    public void d(G.e eVar) {
    }

    public void f(G.e eVar) {
    }

    public void h(G.e eVar) {
    }
}
