package L6;

import J6.o;

/* loaded from: classes2.dex */
public final class m extends J6.l {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1783d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final m[] f1784e = new m[0];

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1785b;

    /* renamed from: c, reason: collision with root package name */
    public final J6.l f1786c;

    public m(byte[] bArr, J6.l lVar) {
        super(J6.k.d(Q6.d.f2729b, lVar) + J6.k.b(Q6.d.f2728a, bArr));
        this.f1785b = bArr;
        this.f1786c = lVar;
    }

    public static m[] d(b6.c cVar) {
        if (cVar.isEmpty()) {
            return f1784e;
        }
        m[] mVarArr = new m[cVar.size()];
        cVar.forEach(new h(mVarArr, 1));
        return mVarArr;
    }

    @Override // J6.f
    public final void c(o oVar) {
        oVar.n(Q6.d.f2728a, this.f1785b);
        oVar.a(Q6.d.f2729b, this.f1786c);
    }
}
