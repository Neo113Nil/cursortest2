package q0;

import z7.InterfaceC5240d;

/* renamed from: q0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4865e extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public AbstractC4866f f40025n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f40026u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC4866f f40027v;

    /* renamed from: w, reason: collision with root package name */
    public int f40028w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4865e(AbstractC4866f abstractC4866f, InterfaceC5240d interfaceC5240d) {
        super(interfaceC5240d);
        this.f40027v = abstractC4866f;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f40026u = obj;
        this.f40028w |= Integer.MIN_VALUE;
        return AbstractC4866f.c(this.f40027v, null, this);
    }
}
