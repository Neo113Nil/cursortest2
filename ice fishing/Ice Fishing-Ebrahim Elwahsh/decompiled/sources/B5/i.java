package B5;

import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class i extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public j f342n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f343u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f344v;

    /* renamed from: w, reason: collision with root package name */
    public int f345w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, AbstractC5219c abstractC5219c) {
        super(abstractC5219c);
        this.f344v = jVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f343u = obj;
        this.f345w |= Integer.MIN_VALUE;
        return this.f344v.c(this);
    }
}
