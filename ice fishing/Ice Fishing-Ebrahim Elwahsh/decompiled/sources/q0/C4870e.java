package q0;

import v7.InterfaceC5133d;
import x7.AbstractC5219c;

/* renamed from: q0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4870e extends AbstractC5219c {

    /* renamed from: n, reason: collision with root package name */
    public AbstractC4871f f39885n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f39886u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC4871f f39887v;

    /* renamed from: w, reason: collision with root package name */
    public int f39888w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4870e(AbstractC4871f abstractC4871f, InterfaceC5133d interfaceC5133d) {
        super(interfaceC5133d);
        this.f39887v = abstractC4871f;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        this.f39886u = obj;
        this.f39888w |= Integer.MIN_VALUE;
        return AbstractC4871f.c(this.f39887v, null, this);
    }
}
