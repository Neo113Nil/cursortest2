package q0;

import z7.InterfaceC5267d;

/* renamed from: q0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4865e extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public AbstractC4866f f39975n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f39976u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC4866f f39977v;

    /* renamed from: w, reason: collision with root package name */
    public int f39978w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4865e(AbstractC4866f abstractC4866f, InterfaceC5267d interfaceC5267d) {
        super(interfaceC5267d);
        this.f39977v = abstractC4866f;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f39976u = obj;
        this.f39978w |= Integer.MIN_VALUE;
        return AbstractC4866f.c(this.f39977v, null, this);
    }
}
