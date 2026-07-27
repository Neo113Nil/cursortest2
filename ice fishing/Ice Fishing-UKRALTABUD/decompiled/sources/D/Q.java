package D;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class Q extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public E0.o f118j;

    /* renamed from: k, reason: collision with root package name */
    public int f119k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f120l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E0.o f121m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S f122n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f123o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f124p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(E0.o oVar, S s2, Object obj, boolean z2, v0.d dVar) {
        super(2, dVar);
        this.f121m = oVar;
        this.f122n = s2;
        this.f123o = obj;
        this.f124p = z2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((Q) l((c0) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        Q q2 = new Q(this.f121m, this.f122n, this.f123o, this.f124p, dVar);
        q2.f120l = obj;
        return q2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // x0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        E0.o oVar;
        c0 c0Var;
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f119k;
        E0.o oVar2 = this.f121m;
        Object obj2 = this.f123o;
        S s2 = this.f122n;
        if (i2 == 0) {
            o.g.C(obj);
            c0 c0Var2 = (c0) this.f120l;
            l0 f2 = s2.f();
            this.f120l = c0Var2;
            this.f118j = oVar2;
            this.f119k = 1;
            Integer num = new Integer(((AtomicInteger) f2.f231b.f30g).incrementAndGet());
            if (num == aVar) {
                return aVar;
            }
            oVar = oVar2;
            c0Var = c0Var2;
            obj = num;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.g.C(obj);
                if (this.f124p) {
                    s2.f132m.G(new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, oVar2.f311f));
                }
                return t0.g.f2989a;
            }
            oVar = this.f118j;
            c0Var = (c0) this.f120l;
            o.g.C(obj);
        }
        oVar.f311f = ((Number) obj).intValue();
        this.f120l = null;
        this.f118j = null;
        this.f119k = 2;
        if (c0Var.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f124p) {
        }
        return t0.g.f2989a;
    }
}
