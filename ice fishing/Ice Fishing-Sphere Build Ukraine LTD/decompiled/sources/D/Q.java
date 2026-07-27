package D;

import java.util.concurrent.atomic.AtomicInteger;
import t0.C0252g;

/* loaded from: classes.dex */
public final class Q extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public E0.o f118i;

    /* renamed from: j, reason: collision with root package name */
    public int f119j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f120k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E0.o f121l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f122m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f123n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f124o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(E0.o oVar, S s2, Object obj, boolean z2, v0.d dVar) {
        super(2, dVar);
        this.f121l = oVar;
        this.f122m = s2;
        this.f123n = obj;
        this.f124o = z2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((Q) l((c0) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        Q q2 = new Q(this.f121l, this.f122m, this.f123n, this.f124o, dVar);
        q2.f120k = obj;
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
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f119j;
        E0.o oVar2 = this.f121l;
        Object obj2 = this.f123n;
        S s2 = this.f122m;
        if (i2 == 0) {
            o.g.z(obj);
            c0 c0Var2 = (c0) this.f120k;
            l0 f2 = s2.f();
            this.f120k = c0Var2;
            this.f118i = oVar2;
            this.f119j = 1;
            Integer num = new Integer(((AtomicInteger) f2.f231b.f30f).incrementAndGet());
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
                o.g.z(obj);
                if (this.f124o) {
                    s2.f132l.G(new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, oVar2.f312e));
                }
                return C0252g.f2994a;
            }
            oVar = this.f118i;
            c0Var = (c0) this.f120k;
            o.g.z(obj);
        }
        oVar.f312e = ((Number) obj).intValue();
        this.f120k = null;
        this.f118i = null;
        this.f119j = 2;
        if (c0Var.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f124o) {
        }
        return C0252g.f2994a;
    }
}
