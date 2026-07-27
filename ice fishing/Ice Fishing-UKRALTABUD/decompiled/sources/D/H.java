package D;

/* loaded from: classes.dex */
public final class H extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public Object f88j;

    /* renamed from: k, reason: collision with root package name */
    public int f89k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ boolean f90l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f91m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f92n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(S s2, int i2, v0.d dVar) {
        super(2, dVar);
        this.f91m = s2;
        this.f92n = i2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((H) l(bool, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        H h2 = new H(this.f91m, this.f92n, dVar);
        h2.f90l = ((Boolean) obj).booleanValue();
        return h2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // x0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        boolean z2;
        Object obj2;
        int i2;
        w0.a aVar = w0.a.f3071f;
        int i3 = this.f89k;
        S s2 = this.f91m;
        if (i3 == 0) {
            o.g.C(obj);
            z2 = this.f90l;
            this.f90l = z2;
            this.f89k = 1;
            obj = s2.h(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f88j;
                o.g.C(obj);
                i2 = ((Number) obj).intValue();
                return new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
            }
            z2 = this.f90l;
            o.g.C(obj);
        }
        if (!z2) {
            obj2 = obj;
            i2 = this.f92n;
            return new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
        }
        l0 f2 = s2.f();
        this.f88j = obj;
        this.f89k = 2;
        Integer a2 = f2.a();
        if (a2 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = a2;
        i2 = ((Number) obj).intValue();
        return new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
    }
}
