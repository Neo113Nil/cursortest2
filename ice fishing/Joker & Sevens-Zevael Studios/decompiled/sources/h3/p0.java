package h3;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f2807a;

    /* renamed from: b, reason: collision with root package name */
    public a3.b[] f2808b;

    public p0() {
        this(new a1());
    }

    public final void a() {
        a3.b[] bVarArr = this.f2808b;
        if (bVarArr != null) {
            a3.b bVar = bVarArr[0];
            a3.b bVar2 = bVarArr[1];
            a1 a1Var = this.f2807a;
            if (bVar2 == null) {
                bVar2 = a1Var.f2745a.f(2);
            }
            if (bVar == null) {
                bVar = a1Var.f2745a.f(1);
            }
            g(a3.b.a(bVar, bVar2));
            a3.b bVar3 = this.f2808b[bc.a0.v(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            a3.b bVar4 = this.f2808b[bc.a0.v(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            a3.b bVar5 = this.f2808b[bc.a0.v(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract a1 b();

    public void c(int i10, a3.b bVar) {
        if (this.f2808b == null) {
            this.f2808b = new a3.b[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f2808b[bc.a0.v(i11)] = bVar;
            }
        }
    }

    public abstract void e(a3.b bVar);

    public abstract void g(a3.b bVar);

    public p0(a1 a1Var) {
        this.f2807a = a1Var;
    }

    public void d(a3.b bVar) {
    }

    public void f(a3.b bVar) {
    }

    public void h(a3.b bVar) {
    }
}
