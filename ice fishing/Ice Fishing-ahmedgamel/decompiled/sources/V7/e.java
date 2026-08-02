package V7;

import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class e extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public f f3458n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3459u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3460v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f3461w;

    /* renamed from: x, reason: collision with root package name */
    public int f3462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC5240d interfaceC5240d) {
        super(interfaceC5240d);
        this.f3461w = fVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3460v = obj;
        this.f3462x |= Integer.MIN_VALUE;
        return this.f3461w.a(null, this);
    }
}
