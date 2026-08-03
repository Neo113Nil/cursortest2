package j0;

import m0.w2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3296g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f3297h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w2 f3298i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f3299j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w2 f3300k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f3301l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w2 f3302m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w2 f3303n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i10, float f10, v.c0 c0Var, long j3, v.c0 c0Var2, long j6, v.c0 c0Var3, v.c0 c0Var4) {
        super(1);
        this.f3296g = i10;
        this.f3297h = f10;
        this.f3298i = c0Var;
        this.f3299j = j3;
        this.f3300k = c0Var2;
        this.f3301l = j6;
        this.f3302m = c0Var3;
        this.f3303n = c0Var4;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        h1.d dVar = (h1.d) obj;
        float b2 = e1.e.b(dVar.d());
        int i10 = this.f3296g;
        float f10 = this.f3297h;
        if (i10 != 0 && e1.e.b(dVar.d()) <= e1.e.d(dVar.d())) {
            f10 += dVar.d0(b2);
        }
        float d02 = f10 / dVar.d0(e1.e.d(dVar.d()));
        w2 w2Var = this.f3298i;
        if (((Number) w2Var.getValue()).floatValue() < 1.0f - d02) {
            e0.b(dVar, ((Number) w2Var.getValue()).floatValue() > 0.0f ? ((Number) w2Var.getValue()).floatValue() + d02 : 0.0f, 1.0f, this.f3299j, b2, this.f3296g);
        }
        float floatValue = ((Number) w2Var.getValue()).floatValue();
        w2 w2Var2 = this.f3300k;
        if (floatValue - ((Number) w2Var2.getValue()).floatValue() > 0.0f) {
            e0.b(dVar, ((Number) w2Var.getValue()).floatValue(), ((Number) w2Var2.getValue()).floatValue(), this.f3301l, b2, this.f3296g);
        }
        float floatValue2 = ((Number) w2Var2.getValue()).floatValue();
        w2 w2Var3 = this.f3302m;
        if (floatValue2 > d02) {
            e0.b(dVar, ((Number) w2Var3.getValue()).floatValue() > 0.0f ? ((Number) w2Var3.getValue()).floatValue() + d02 : 0.0f, ((Number) w2Var2.getValue()).floatValue() < 1.0f ? ((Number) w2Var2.getValue()).floatValue() - d02 : 1.0f, this.f3299j, b2, this.f3296g);
        }
        float floatValue3 = ((Number) w2Var3.getValue()).floatValue();
        w2 w2Var4 = this.f3303n;
        if (floatValue3 - ((Number) w2Var4.getValue()).floatValue() > 0.0f) {
            e0.b(dVar, ((Number) w2Var3.getValue()).floatValue(), ((Number) w2Var4.getValue()).floatValue(), this.f3301l, b2, this.f3296g);
        }
        if (((Number) w2Var4.getValue()).floatValue() > d02) {
            e0.b(dVar, 0.0f, ((Number) w2Var4.getValue()).floatValue() < 1.0f ? ((Number) w2Var4.getValue()).floatValue() - d02 : 1.0f, this.f3299j, b2, this.f3296g);
        }
        return ac.o.f277a;
    }
}
