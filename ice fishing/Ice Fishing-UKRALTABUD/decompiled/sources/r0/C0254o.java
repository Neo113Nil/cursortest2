package r0;

/* renamed from: r0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254o extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2901i;

    /* renamed from: j, reason: collision with root package name */
    public int f2902j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0255p f2903k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0254o(C0255p c0255p, v0.d dVar) {
        super(dVar);
        this.f2903k = c0255p;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2901i = obj;
        this.f2902j |= Integer.MIN_VALUE;
        return this.f2903k.b(null, this);
    }
}
