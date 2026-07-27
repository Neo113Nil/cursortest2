package X;

import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class u extends AbstractC5219c {

    /* renamed from: A, reason: collision with root package name */
    public int f3601A;

    /* renamed from: n, reason: collision with root package name */
    public Object f3602n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3603u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3604v;

    /* renamed from: w, reason: collision with root package name */
    public kotlin.jvm.internal.r f3605w;

    /* renamed from: x, reason: collision with root package name */
    public D f3606x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3607y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v f3608z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f3608z = vVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3607y = obj;
        this.f3601A |= Integer.MIN_VALUE;
        return this.f3608z.a(null, this);
    }
}
