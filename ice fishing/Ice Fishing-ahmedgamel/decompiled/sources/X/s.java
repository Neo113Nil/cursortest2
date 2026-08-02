package X;

import S7.C0399m;

/* loaded from: classes.dex */
public final class s extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public Object f3692n;

    /* renamed from: u, reason: collision with root package name */
    public D f3693u;

    /* renamed from: v, reason: collision with root package name */
    public C0399m f3694v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3695w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ D f3696x;

    /* renamed from: y, reason: collision with root package name */
    public int f3697y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(D d9, B7.c cVar) {
        super(cVar);
        this.f3696x = d9;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3695w = obj;
        this.f3697y |= Integer.MIN_VALUE;
        return D.a(this.f3696x, null, this);
    }
}
