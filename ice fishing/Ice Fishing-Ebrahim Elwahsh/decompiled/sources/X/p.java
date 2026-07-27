package X;

import v7.InterfaceC5133d;
import x7.AbstractC5219c;

/* loaded from: classes.dex */
public final class p extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3578n;

    /* renamed from: u, reason: collision with root package name */
    public int f3579u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ R7.i f3580v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(R7.i iVar, InterfaceC5133d interfaceC5133d) {
        super(interfaceC5133d);
        this.f3580v = iVar;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f3578n = obj;
        this.f3579u |= Integer.MIN_VALUE;
        return this.f3580v.a(null, this);
    }
}
