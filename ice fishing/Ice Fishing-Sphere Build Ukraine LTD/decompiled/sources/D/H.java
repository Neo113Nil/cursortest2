package D;

import t0.C0252g;

/* loaded from: classes.dex */
public final class H extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public Object f88i;

    /* renamed from: j, reason: collision with root package name */
    public int f89j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f90k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f91l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f92m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(S s2, int i2, v0.d dVar) {
        super(2, dVar);
        this.f91l = s2;
        this.f92m = i2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((H) l(bool, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        H h2 = new H(this.f91l, this.f92m, dVar);
        h2.f90k = ((Boolean) obj).booleanValue();
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
        w0.a aVar = w0.a.f3076e;
        int i3 = this.f89j;
        S s2 = this.f91l;
        if (i3 == 0) {
            o.g.z(obj);
            z2 = this.f90k;
            this.f90k = z2;
            this.f89j = 1;
            obj = s2.h(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f88i;
                o.g.z(obj);
                i2 = ((Number) obj).intValue();
                return new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
            }
            z2 = this.f90k;
            o.g.z(obj);
        }
        if (!z2) {
            obj2 = obj;
            i2 = this.f92m;
            return new C0003d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
        }
        l0 f2 = s2.f();
        this.f88i = obj;
        this.f89j = 2;
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
