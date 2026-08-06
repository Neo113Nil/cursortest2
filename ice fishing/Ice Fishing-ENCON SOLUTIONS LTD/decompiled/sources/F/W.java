package F;

import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class W extends AbstractC0991b {

    /* renamed from: d, reason: collision with root package name */
    public Y f438d;

    /* renamed from: e, reason: collision with root package name */
    public S f439e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f440f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f442h;

    /* renamed from: i, reason: collision with root package name */
    public int f443i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y2, AbstractC0991b abstractC0991b) {
        super(abstractC0991b);
        this.f442h = y2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        this.f441g = obj;
        this.f443i |= Integer.MIN_VALUE;
        return this.f442h.a(null, this);
    }
}
