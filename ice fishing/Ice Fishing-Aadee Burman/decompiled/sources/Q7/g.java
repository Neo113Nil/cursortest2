package Q7;

import v7.AbstractC5120a;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements I7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2682n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC5120a f2683u;

    public /* synthetic */ g(AbstractC5120a abstractC5120a, int i) {
        this.f2682n = i;
        this.f2683u = abstractC5120a;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        switch (this.f2682n) {
            case 0:
                return ((h) this.f2683u).c(((Integer) obj).intValue());
            default:
                return obj == this.f2683u ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
