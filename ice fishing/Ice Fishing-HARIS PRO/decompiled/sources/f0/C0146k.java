package f0;

/* renamed from: f0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146k extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f2945c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0146k(z zVar, int i) {
        super(1);
        this.f2944b = i;
        this.f2945c = zVar;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        switch (this.f2944b) {
            case 0:
                D1.i.e((w) obj, "destination");
                return Boolean.valueOf(!this.f2945c.f3013l.containsKey(Integer.valueOf(r2.f2994h)));
            default:
                D1.i.e((w) obj, "destination");
                return Boolean.valueOf(!this.f2945c.f3013l.containsKey(Integer.valueOf(r2.f2994h)));
        }
    }
}
