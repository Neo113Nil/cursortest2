package m0;

import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k2 implements Iterable, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final j2 f4643g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4644h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4645i;

    public k2(j2 j2Var, int i10, int i11) {
        this.f4643g = j2Var;
        this.f4644h = i10;
        this.f4645i = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j2 j2Var = this.f4643g;
        if (j2Var.f4638n != this.f4645i) {
            l2.f();
        }
        int i10 = this.f4644h;
        j2Var.f(i10);
        return new p0(j2Var, i10 + 1, l2.a(j2Var.f4631g, i10) + i10);
    }
}
