package F;

import h1.C0239i;
import java.util.concurrent.atomic.AtomicInteger;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class O extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.o f405e;

    /* renamed from: f, reason: collision with root package name */
    public int f406f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f407g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f408h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P f409i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f410j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f411k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(kotlin.jvm.internal.o oVar, P p2, Object obj, boolean z2, l1.d dVar) {
        super(2, dVar);
        this.f408h = oVar;
        this.f409i = p2;
        this.f410j = obj;
        this.f411k = z2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        O o2 = new O(this.f408h, this.f409i, this.f410j, this.f411k, dVar);
        o2.f407g = obj;
        return o2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // n1.AbstractC0991b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        kotlin.jvm.internal.o oVar;
        a0 a0Var;
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f406f;
        kotlin.jvm.internal.o oVar2 = this.f408h;
        Object obj2 = this.f410j;
        P p2 = this.f409i;
        if (i2 == 0) {
            R1.l.F(obj);
            a0 a0Var2 = (a0) this.f407g;
            j0 f2 = p2.f();
            this.f407g = a0Var2;
            this.f405e = oVar2;
            this.f406f = 1;
            Integer num = new Integer(((AtomicInteger) f2.f506b.f124b).incrementAndGet());
            if (num == enumC0985a) {
                return enumC0985a;
            }
            oVar = oVar2;
            a0Var = a0Var2;
            obj = num;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.l.F(obj);
                if (this.f411k) {
                    p2.f419h.p(new C0028d(obj2 != null ? obj2.hashCode() : 0, oVar2.f8075a, obj2));
                }
                return C0239i.f3393a;
            }
            oVar = this.f405e;
            a0Var = (a0) this.f407g;
            R1.l.F(obj);
        }
        oVar.f8075a = ((Number) obj).intValue();
        this.f407g = null;
        this.f405e = null;
        this.f406f = 2;
        if (a0Var.b(obj2, this) == enumC0985a) {
            return enumC0985a;
        }
        if (this.f411k) {
        }
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((O) b((a0) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
