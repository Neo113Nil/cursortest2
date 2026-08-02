package Q7;

import v7.AbstractC5110a;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements I7.l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2719n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC5110a f2720u;

    public /* synthetic */ g(AbstractC5110a abstractC5110a, int i) {
        this.f2719n = i;
        this.f2720u = abstractC5110a;
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        switch (this.f2719n) {
            case 0:
                return ((h) this.f2720u).c(((Integer) obj).intValue());
            default:
                return obj == this.f2720u ? "(this Collection)" : String.valueOf(obj);
        }
    }
}
