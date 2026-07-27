package r0;

import D.C0019u;

/* loaded from: classes.dex */
public final class z extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2952h;

    /* renamed from: i, reason: collision with root package name */
    public int f2953i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0019u f2954j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0019u c0019u, v0.d dVar) {
        super(dVar);
        this.f2954j = c0019u;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2952h = obj;
        this.f2953i |= Integer.MIN_VALUE;
        return this.f2954j.b(null, this);
    }
}
