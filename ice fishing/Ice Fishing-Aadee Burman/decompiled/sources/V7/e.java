package V7;

import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class e extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public f f3328n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3329u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3330v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f3331w;

    /* renamed from: x, reason: collision with root package name */
    public int f3332x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC5267d interfaceC5267d) {
        super(interfaceC5267d);
        this.f3331w = fVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3330v = obj;
        this.f3332x |= Integer.MIN_VALUE;
        return this.f3331w.a(null, this);
    }
}
