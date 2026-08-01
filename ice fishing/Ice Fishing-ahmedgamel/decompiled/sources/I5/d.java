package I5;

import S0.s;
import f6.C4512a;

/* loaded from: classes2.dex */
public final class d extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public s f1302n;

    /* renamed from: u, reason: collision with root package name */
    public C4512a f1303u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f1304v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f1305w;

    /* renamed from: x, reason: collision with root package name */
    public int f1306x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s sVar, B7.c cVar) {
        super(cVar);
        this.f1305w = sVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f1304v = obj;
        this.f1306x |= Integer.MIN_VALUE;
        return this.f1305w.o(null, null, this);
    }
}
