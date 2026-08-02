package F5;

import f6.C4522a;

/* loaded from: classes2.dex */
public final class n extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public String f1011n;

    /* renamed from: u, reason: collision with root package name */
    public l6.i f1012u;

    /* renamed from: v, reason: collision with root package name */
    public C4522a f1013v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1014w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f1015x;

    /* renamed from: y, reason: collision with root package name */
    public int f1016y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, B7.c cVar) {
        super(cVar);
        this.f1015x = oVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f1014w = obj;
        this.f1016y |= Integer.MIN_VALUE;
        return this.f1015x.a(null, null, null, null, null, null, this);
    }
}
