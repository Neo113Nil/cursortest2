package F5;

import f6.C4512a;

/* loaded from: classes2.dex */
public final class n extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public String f985n;

    /* renamed from: u, reason: collision with root package name */
    public l6.i f986u;

    /* renamed from: v, reason: collision with root package name */
    public C4512a f987v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f988w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f989x;

    /* renamed from: y, reason: collision with root package name */
    public int f990y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, B7.c cVar) {
        super(cVar);
        this.f989x = oVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f988w = obj;
        this.f990y |= Integer.MIN_VALUE;
        return this.f989x.a(null, null, null, null, null, null, this);
    }
}
