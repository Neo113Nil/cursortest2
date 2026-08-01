package X;

import S7.C0395m;

/* loaded from: classes.dex */
public final class s extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f3530n;

    /* renamed from: u, reason: collision with root package name */
    public D f3531u;

    /* renamed from: v, reason: collision with root package name */
    public C0395m f3532v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3533w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ D f3534x;

    /* renamed from: y, reason: collision with root package name */
    public int f3535y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(D d2, B7.c cVar) {
        super(cVar);
        this.f3534x = d2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3533w = obj;
        this.f3535y |= Integer.MIN_VALUE;
        return D.a(this.f3534x, null, this);
    }
}
