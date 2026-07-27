package B5;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class g extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f335n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f336u;

    /* renamed from: v, reason: collision with root package name */
    public int f337v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f336u = jVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f335n = obj;
        this.f337v |= Integer.MIN_VALUE;
        return j.a(this.f336u, this);
    }
}
