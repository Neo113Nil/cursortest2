package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class muf implements luf {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mxo c;

    public /* synthetic */ muf(mxo mxoVar, boolean z, int i) {
        this.a = i;
        this.c = mxoVar;
        this.b = z;
    }

    @Override // defpackage.luf
    public final int a() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                o3k o3kVar = (o3k) this.c;
                i = -o3kVar.l().f;
                i2 = o3kVar.l().d;
                break;
            default:
                fvf fvfVar = (fvf) this.c;
                i = -fvfVar.j().l;
                i2 = fvfVar.j().q;
                break;
        }
        return i + i2;
    }

    @Override // defpackage.luf
    public final float b() {
        switch (this.a) {
            case 0:
                o3k o3kVar = (o3k) this.c;
                return r3k.a(o3kVar.l(), o3kVar.n());
            default:
                fvf fvfVar = (fvf) this.c;
                int h = fvfVar.h();
                int i = fvfVar.i();
                return fvfVar.d() ? (h * 500) + i + 100 : (h * 500) + i;
        }
    }

    @Override // defpackage.luf
    public final ky4 c() {
        switch (this.a) {
            case 0:
                o3k o3kVar = (o3k) this.c;
                return this.b ? new ky4(o3kVar.n(), 1) : new ky4(1, o3kVar.n());
            default:
                return this.b ? new ky4(-1, 1) : new ky4(1, -1);
        }
    }

    @Override // defpackage.luf
    public final int d() {
        switch (this.a) {
            case 0:
                o3k o3kVar = (o3k) this.c;
                return (int) (o3kVar.l().e == bxj.a ? o3kVar.l().g() & 4294967295L : o3kVar.l().g() >> 32);
            default:
                fvf fvfVar = (fvf) this.c;
                return (int) (fvfVar.j().p == bxj.a ? fvfVar.j().g() & 4294967295L : fvfVar.j().g() >> 32);
        }
    }

    @Override // defpackage.luf
    public final float e() {
        switch (this.a) {
            case 0:
                return uwf.k((o3k) this.c);
            default:
                fvf fvfVar = (fvf) this.c;
                return (fvfVar.h() * 500) + fvfVar.i();
        }
    }

    @Override // defpackage.luf
    public final Object f(int i, dv0 dv0Var) {
        int i2 = this.a;
        mxo mxoVar = this.c;
        switch (i2) {
            case 0:
                Object v = o3k.v(i, (o3k) mxoVar, dv0Var);
                if (v != nm6.a) {
                    break;
                }
                break;
            default:
                apo apoVar = fvf.w;
                Object m = ((fvf) mxoVar).m(i, 0, dv0Var);
                if (m != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
