package P6;

import N6.o;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class j extends N6.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2587b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2588c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2589d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2590e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(k kVar, byte[] bArr, List list) {
        super(r1 + r3);
        int b9 = N6.k.b(V6.c.f3293c, bArr) + N6.k.d(V6.c.f3291a, kVar);
        int i = V6.c.f3292b.f1955c;
        Iterator it = list.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            int a9 = ((N6.f) it.next()).a();
            i6 += N6.d.b(a9) + i + a9;
        }
        this.f2589d = kVar;
        this.f2588c = bArr;
        this.f2590e = list;
    }

    @Override // N6.f
    public final void c(o oVar) {
        switch (this.f2587b) {
            case 0:
                oVar.n(U6.c.f3213a, this.f2588c);
                oVar.n(U6.c.f3214b, (byte[]) this.f2589d);
                oVar.k(U6.c.f3215c, (m[]) this.f2590e);
                break;
            case 1:
                oVar.a(V6.c.f3291a, (k) this.f2589d);
                oVar.j(V6.c.f3292b, (List) this.f2590e);
                oVar.n(V6.c.f3293c, this.f2588c);
                break;
            default:
                oVar.a(V6.b.f3288a, (n) this.f2589d);
                oVar.k(V6.b.f3289b, (j[]) this.f2590e);
                oVar.n(V6.b.f3290c, this.f2588c);
                break;
        }
    }

    public j(n nVar, byte[] bArr, j[] jVarArr) {
        super(N6.k.e(V6.b.f3289b, jVarArr) + N6.k.b(V6.b.f3290c, bArr) + N6.k.d(V6.b.f3288a, nVar));
        this.f2589d = nVar;
        this.f2588c = bArr;
        this.f2590e = jVarArr;
    }

    public j(byte[] bArr, byte[] bArr2, m[] mVarArr) {
        super(N6.k.e(U6.c.f3215c, mVarArr) + N6.k.b(U6.c.f3214b, bArr2) + N6.k.b(U6.c.f3213a, bArr));
        this.f2588c = bArr;
        this.f2589d = bArr2;
        this.f2590e = mVarArr;
    }
}
