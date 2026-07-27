package N0;

import r0.C0255p;

/* loaded from: classes.dex */
public final class n extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public C0255p f787i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f788j;

    /* renamed from: k, reason: collision with root package name */
    public int f789k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0255p f790l;

    /* renamed from: m, reason: collision with root package name */
    public Object f791m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0255p c0255p, v0.d dVar) {
        super(dVar);
        this.f790l = c0255p;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f788j = obj;
        this.f789k |= Integer.MIN_VALUE;
        return this.f790l.b(null, this);
    }
}
