package v;

import m0.w2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 implements w2 {

    /* renamed from: g, reason: collision with root package name */
    public Float f6800g;

    /* renamed from: h, reason: collision with root package name */
    public Float f6801h;

    /* renamed from: i, reason: collision with root package name */
    public final m0.l1 f6802i;

    /* renamed from: j, reason: collision with root package name */
    public w0 f6803j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6804k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6805l;

    /* renamed from: m, reason: collision with root package name */
    public long f6806m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f6807n;

    public c0(e0 e0Var, Float f10, Float f11, b0 b0Var) {
        x4.s sVar = i1.f6863a;
        this.f6807n = e0Var;
        this.f6800g = f10;
        this.f6801h = f11;
        this.f6802i = m0.z.s(f10);
        this.f6803j = new w0(b0Var, sVar, this.f6800g, this.f6801h, null);
    }

    @Override // m0.w2
    public final Object getValue() {
        return this.f6802i.getValue();
    }
}
