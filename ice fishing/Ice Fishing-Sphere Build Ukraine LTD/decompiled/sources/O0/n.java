package O0;

import r0.C0242n;

/* loaded from: classes.dex */
public final class n extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public C0242n f795h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f796i;

    /* renamed from: j, reason: collision with root package name */
    public int f797j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0242n f798k;

    /* renamed from: l, reason: collision with root package name */
    public Object f799l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0242n c0242n, v0.d dVar) {
        super(dVar);
        this.f798k = c0242n;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f796i = obj;
        this.f797j |= Integer.MIN_VALUE;
        return this.f798k.b(null, this);
    }
}
