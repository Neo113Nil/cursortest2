package y1;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final e2.j f8579a;

    /* renamed from: b, reason: collision with root package name */
    public final s.v f8580b;

    public k1(e2.n nVar, s.k kVar) {
        this.f8579a = nVar.f1996d;
        this.f8580b = new s.v(e2.n.j(4, nVar).size());
        List j3 = e2.n.j(4, nVar);
        int size = j3.size();
        for (int i10 = 0; i10 < size; i10++) {
            e2.n nVar2 = (e2.n) j3.get(i10);
            if (kVar.a(nVar2.f1999g)) {
                this.f8580b.a(nVar2.f1999g);
            }
        }
    }
}
