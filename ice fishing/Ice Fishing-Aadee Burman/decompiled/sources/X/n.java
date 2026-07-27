package X;

import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public final class n extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3517n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3518u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3519v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(D d2, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3519v = d2;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        n nVar = new n(this.f3519v, interfaceC5267d);
        nVar.f3518u = obj;
        return nVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((l) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r7 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r7 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    @Override // B7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        A7.a aVar = A7.a.f58n;
        int i = this.f3517n;
        u7.v vVar = u7.v.f41350a;
        if (i != 0) {
            if (i == 1) {
                com.bumptech.glide.d.k(obj);
                return vVar;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return vVar;
        }
        com.bumptech.glide.d.k(obj);
        l lVar = (l) this.f3518u;
        boolean z3 = lVar instanceof j;
        D d2 = this.f3519v;
        if (!z3) {
            if (lVar instanceof k) {
                this.f3517n = 2;
                if (D.a(d2, (k) lVar, this) == aVar) {
                }
            }
        }
        j jVar = (j) lVar;
        this.f3517n = 1;
        E e9 = (E) d2.f3485e.E();
        if (!(e9 instanceof C0408a)) {
            if (e9 instanceof h) {
                if (e9 == jVar.f3510a) {
                    obj2 = d2.e(this);
                }
            } else if (kotlin.jvm.internal.h.a(e9, F.f3488a)) {
                obj2 = d2.e(this);
            } else if (e9 instanceof g) {
                throw new IllegalStateException("Can't read in final state.");
            }
        }
        obj2 = vVar;
        return obj2 == aVar ? aVar : vVar;
    }
}
