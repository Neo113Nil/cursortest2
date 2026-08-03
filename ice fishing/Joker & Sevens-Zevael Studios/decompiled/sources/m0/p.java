package m0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends v {

    /* renamed from: a, reason: collision with root package name */
    public final long f4697a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4698b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4699c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f4700d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4701e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final l1 f4702f = new l1(u0.i.f6678j, z0.f4842j);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f4703g;

    public p(r rVar, long j3, boolean z10, boolean z11, f8.c cVar) {
        this.f4703g = rVar;
        this.f4697a = j3;
        this.f4698b = z10;
        this.f4699c = z11;
    }

    @Override // m0.v
    public final void a(y yVar, oc.e eVar) {
        this.f4703g.f4722b.a(yVar, eVar);
    }

    @Override // m0.v
    public final void b() {
        r rVar = this.f4703g;
        rVar.A--;
    }

    @Override // m0.v
    public final boolean c() {
        return this.f4703g.f4722b.c();
    }

    @Override // m0.v
    public final boolean d() {
        return this.f4698b;
    }

    @Override // m0.v
    public final boolean e() {
        return this.f4699c;
    }

    @Override // m0.v
    public final long f() {
        return this.f4697a;
    }

    @Override // m0.v
    public final u g() {
        return this.f4703g.f4728h;
    }

    @Override // m0.v
    public final r1 h() {
        return (r1) this.f4702f.getValue();
    }

    @Override // m0.v
    public final fc.i i() {
        return this.f4703g.f4722b.i();
    }

    @Override // m0.v
    public final void j(y yVar) {
        r rVar = this.f4703g;
        rVar.f4722b.j(rVar.f4728h);
        rVar.f4722b.j(yVar);
    }

    @Override // m0.v
    public final b1 k(c1 c1Var) {
        return this.f4703g.f4722b.k(c1Var);
    }

    @Override // m0.v
    public final void l(Set set) {
        HashSet hashSet = this.f4700d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f4700d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // m0.v
    public final void m(r rVar) {
        this.f4701e.add(rVar);
    }

    @Override // m0.v
    public final void n(y yVar) {
        this.f4703g.f4722b.n(yVar);
    }

    @Override // m0.v
    public final void o() {
        this.f4703g.A++;
    }

    @Override // m0.v
    public final void p(r rVar) {
        HashSet hashSet = this.f4700d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                pc.j.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(rVar.f4723c);
            }
        }
        pc.v.a(this.f4701e).remove(rVar);
    }

    @Override // m0.v
    public final void q(y yVar) {
        this.f4703g.f4722b.q(yVar);
    }

    public final void r() {
        LinkedHashSet<r> linkedHashSet = this.f4701e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f4700d;
        if (hashSet != null) {
            for (r rVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(rVar.f4723c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
