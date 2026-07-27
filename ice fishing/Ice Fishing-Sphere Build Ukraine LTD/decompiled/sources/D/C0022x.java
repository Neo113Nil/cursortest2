package D;

import t0.C0252g;

/* renamed from: D.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022x extends x0.f implements D0.l {

    /* renamed from: i, reason: collision with root package name */
    public int f276i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I f277j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0022x(I i2, v0.d dVar) {
        super(1, dVar);
        this.f277j = i2;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        return new C0022x(this.f277j, (v0.d) obj).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f276i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f276i = 1;
            obj = this.f277j.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return obj;
    }
}
