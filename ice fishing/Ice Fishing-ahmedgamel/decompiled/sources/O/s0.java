package O;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f2219a;

    /* renamed from: b, reason: collision with root package name */
    public G.e[] f2220b;

    public s0() {
        this(new A0());
    }

    public final void a() {
        G.e[] eVarArr = this.f2220b;
        if (eVarArr != null) {
            G.e eVar = eVarArr[0];
            G.e eVar2 = eVarArr[1];
            A0 a02 = this.f2219a;
            if (eVar2 == null) {
                eVar2 = a02.f2115a.f(2);
            }
            if (eVar == null) {
                eVar = a02.f2115a.f(1);
            }
            g(G.e.a(eVar, eVar2));
            G.e eVar3 = this.f2220b[com.bumptech.glide.d.v(16)];
            if (eVar3 != null) {
                f(eVar3);
            }
            G.e eVar4 = this.f2220b[com.bumptech.glide.d.v(32)];
            if (eVar4 != null) {
                d(eVar4);
            }
            G.e eVar5 = this.f2220b[com.bumptech.glide.d.v(64)];
            if (eVar5 != null) {
                h(eVar5);
            }
        }
    }

    public abstract A0 b();

    public void c(int i, G.e eVar) {
        if (this.f2220b == null) {
            this.f2220b = new G.e[9];
        }
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i & i4) != 0) {
                this.f2220b[com.bumptech.glide.d.v(i4)] = eVar;
            }
        }
    }

    public abstract void e(G.e eVar);

    public abstract void g(G.e eVar);

    public s0(A0 a02) {
        this.f2219a = a02;
    }

    public void d(G.e eVar) {
    }

    public void f(G.e eVar) {
    }

    public void h(G.e eVar) {
    }
}
