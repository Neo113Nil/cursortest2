package P6;

import N6.o;

/* loaded from: classes2.dex */
public final class m extends N6.l {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f2430d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final m[] f2431e = new m[0];

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2432b;

    /* renamed from: c, reason: collision with root package name */
    public final N6.l f2433c;

    public m(byte[] bArr, N6.l lVar) {
        super(N6.k.d(U6.d.f3340b, lVar) + N6.k.b(U6.d.f3339a, bArr));
        this.f2432b = bArr;
        this.f2433c = lVar;
    }

    public static m[] d(f6.c cVar) {
        if (cVar.isEmpty()) {
            return f2431e;
        }
        m[] mVarArr = new m[cVar.size()];
        cVar.forEach(new h(mVarArr, 1));
        return mVarArr;
    }

    @Override // N6.f
    public final void c(o oVar) {
        oVar.n(U6.d.f3339a, this.f2432b);
        oVar.a(U6.d.f3340b, this.f2433c);
    }
}
