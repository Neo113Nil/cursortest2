package N0;

import D.M;
import L0.C0048f;
import L0.C0062u;
import t0.C0252g;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f741a = new h();

    public static b a(int i2, int i3, int i4) {
        b mVar;
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (i3 == 1) {
                    return new m(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i2 != 0) {
                return i2 != Integer.MAX_VALUE ? i3 == 1 ? new b(i2, null) : new m(i2, i3, null) : new b(Integer.MAX_VALUE, null);
            }
            mVar = i3 == 1 ? new b(0, null) : new m(1, i3, null);
        } else if (i3 == 1) {
            f.f739b.getClass();
            mVar = new b(e.f738b, null);
        } else {
            mVar = new m(1, i3, null);
        }
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [D0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, F.b bVar, x0.b bVar2) {
        n nVar;
        int i2;
        try {
            if (bVar2 instanceof n) {
                nVar = (n) bVar2;
                int i3 = nVar.f747j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nVar.f747j = i3 - Integer.MIN_VALUE;
                    Object obj = nVar.f746i;
                    w0.a aVar = w0.a.f3076e;
                    i2 = nVar.f747j;
                    if (i2 != 0) {
                        o.g.z(obj);
                        v0.i iVar = nVar.f3091f;
                        E0.i.b(iVar);
                        if (iVar.i(C0062u.f682f) != pVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        nVar.f745h = bVar;
                        nVar.f747j = 1;
                        C0048f c0048f = new C0048f(1, o.g.r(nVar));
                        c0048f.v();
                        ((o) pVar).X(new M(1, c0048f));
                        bVar = bVar;
                        if (c0048f.u() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = nVar.f745h;
                        o.g.z(obj);
                        bVar = r5;
                    }
                    bVar.a();
                    return C0252g.f2994a;
                }
            }
            if (i2 != 0) {
            }
            bVar.a();
            return C0252g.f2994a;
        } catch (Throwable th) {
            bVar.a();
            throw th;
        }
        nVar = new n(bVar2);
        Object obj2 = nVar.f746i;
        w0.a aVar2 = w0.a.f3076e;
        i2 = nVar.f747j;
    }
}
