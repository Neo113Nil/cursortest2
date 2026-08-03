package v;

import m0.w2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements w2 {

    /* renamed from: g, reason: collision with root package name */
    public final x4.s f6856g;

    /* renamed from: h, reason: collision with root package name */
    public final m0.l1 f6857h;

    /* renamed from: i, reason: collision with root package name */
    public n f6858i;

    /* renamed from: j, reason: collision with root package name */
    public long f6859j;

    /* renamed from: k, reason: collision with root package name */
    public long f6860k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6861l;

    public /* synthetic */ i(x4.s sVar, Object obj, n nVar, int i10) {
        this(sVar, obj, (i10 & 4) != 0 ? null : nVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // m0.w2
    public final Object getValue() {
        return this.f6857h.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f6857h.getValue() + ", velocity=" + ((oc.c) this.f6856g.f8357i).invoke(this.f6858i) + ", isRunning=" + this.f6861l + ", lastFrameTimeNanos=" + this.f6859j + ", finishedTimeNanos=" + this.f6860k + ')';
    }

    public i(x4.s sVar, Object obj, n nVar, long j3, long j6, boolean z10) {
        n nVar2;
        this.f6856g = sVar;
        this.f6857h = m0.z.s(obj);
        if (nVar != null) {
            nVar2 = d.e(nVar);
        } else {
            nVar2 = (n) ((oc.c) sVar.f8356h).invoke(obj);
            nVar2.d();
        }
        this.f6858i = nVar2;
        this.f6859j = j3;
        this.f6860k = j6;
        this.f6861l = z10;
    }
}
