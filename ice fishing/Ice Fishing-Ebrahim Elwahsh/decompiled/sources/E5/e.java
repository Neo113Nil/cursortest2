package E5;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class e extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public f f839n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f840u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f841v;

    /* renamed from: w, reason: collision with root package name */
    public int f842w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f841v = fVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f840u = obj;
        this.f842w |= Integer.MIN_VALUE;
        return this.f841v.a(this);
    }
}
