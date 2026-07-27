package r0;

/* renamed from: r0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227A extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2822i;

    /* renamed from: j, reason: collision with root package name */
    public int f2823j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0255p f2824k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227A(C0255p c0255p, v0.d dVar) {
        super(dVar);
        this.f2824k = c0255p;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2822i = obj;
        this.f2823j |= Integer.MIN_VALUE;
        return this.f2824k.b(null, this);
    }
}
