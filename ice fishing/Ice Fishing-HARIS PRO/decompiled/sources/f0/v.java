package f0;

/* loaded from: classes.dex */
public final class v extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f2987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(s sVar, int i) {
        super(1);
        this.f2986b = i;
        this.f2987c = sVar;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        switch (this.f2986b) {
            case 0:
                D1.i.e((String) obj, "key");
                return Boolean.valueOf(!this.f2987c.b().contains(r2));
            default:
                D1.i.e((String) obj, "key");
                return Boolean.valueOf(!this.f2987c.b().contains(r2));
        }
    }
}
