package bc;

import java.util.RandomAccess;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public final e f1055g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1056h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1057i;

    public d(e eVar, int i10, int i11) {
        this.f1055g = eVar;
        this.f1056h = i10;
        x4.f.A(i10, i11, eVar.a());
        this.f1057i = i11 - i10;
    }

    @Override // bc.a
    public final int a() {
        return this.f1057i;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f1057i;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a4.d.f(i10, i11, "index: ", ", size: "));
        }
        return this.f1055g.get(this.f1056h + i10);
    }
}
