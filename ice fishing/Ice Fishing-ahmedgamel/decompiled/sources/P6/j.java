package P6;

import N6.o;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class j extends N6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2422b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2423c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2424d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2425e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(k kVar, byte[] bArr, List list) {
        super(r1 + r3);
        int b9 = N6.k.b(V6.c.f3423c, bArr) + N6.k.d(V6.c.f3421a, kVar);
        int i = V6.c.f3422b.f2043c;
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            int a9 = ((N6.f) it.next()).a();
            i4 += N6.d.b(a9) + i + a9;
        }
        this.f2424d = kVar;
        this.f2423c = bArr;
        this.f2425e = list;
    }

    @Override // N6.f
    public final void c(o oVar) {
        switch (this.f2422b) {
            case 0:
                oVar.n(U6.c.f3336a, this.f2423c);
                oVar.n(U6.c.f3337b, (byte[]) this.f2424d);
                oVar.k(U6.c.f3338c, (m[]) this.f2425e);
                break;
            case 1:
                oVar.a(V6.c.f3421a, (k) this.f2424d);
                oVar.j(V6.c.f3422b, (List) this.f2425e);
                oVar.n(V6.c.f3423c, this.f2423c);
                break;
            default:
                oVar.a(V6.b.f3418a, (n) this.f2424d);
                oVar.k(V6.b.f3419b, (j[]) this.f2425e);
                oVar.n(V6.b.f3420c, this.f2423c);
                break;
        }
    }

    public j(n nVar, byte[] bArr, j[] jVarArr) {
        super(N6.k.e(V6.b.f3419b, jVarArr) + N6.k.b(V6.b.f3420c, bArr) + N6.k.d(V6.b.f3418a, nVar));
        this.f2424d = nVar;
        this.f2423c = bArr;
        this.f2425e = jVarArr;
    }

    public j(byte[] bArr, byte[] bArr2, m[] mVarArr) {
        super(N6.k.e(U6.c.f3338c, mVarArr) + N6.k.b(U6.c.f3337b, bArr2) + N6.k.b(U6.c.f3336a, bArr));
        this.f2423c = bArr;
        this.f2424d = bArr2;
        this.f2425e = mVarArr;
    }
}
