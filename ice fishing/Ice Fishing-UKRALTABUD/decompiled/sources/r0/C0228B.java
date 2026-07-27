package r0;

import D.C0019u;

/* renamed from: r0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228B extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2825i;

    /* renamed from: j, reason: collision with root package name */
    public int f2826j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0019u f2827k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228B(C0019u c0019u, v0.d dVar) {
        super(dVar);
        this.f2827k = c0019u;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f2825i = obj;
        this.f2826j |= Integer.MIN_VALUE;
        return this.f2827k.b(null, this);
    }
}
