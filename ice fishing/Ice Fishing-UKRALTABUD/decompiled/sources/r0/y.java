package r0;

/* loaded from: classes.dex */
public final class y extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2942i;

    /* renamed from: j, reason: collision with root package name */
    public int f2943j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0255p f2944k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0255p c0255p, v0.d dVar) {
        super(dVar);
        this.f2944k = c0255p;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2942i = obj;
        this.f2943j |= Integer.MIN_VALUE;
        return this.f2944k.b(null, this);
    }
}
