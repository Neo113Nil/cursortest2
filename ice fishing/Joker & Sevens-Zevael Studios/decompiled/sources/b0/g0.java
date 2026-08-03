package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f823g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f824h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(i0 i0Var, int i10) {
        super(1);
        this.f823g = i10;
        this.f824h = i0Var;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f823g) {
            case 0:
                a0.i iVar = (a0.i) this.f824h.f833u.invoke();
                int c3 = iVar.c();
                int i10 = 0;
                while (true) {
                    if (i10 >= c3) {
                        i10 = -1;
                    } else if (!iVar.d(i10).equals(obj)) {
                        i10++;
                    }
                }
                return Integer.valueOf(i10);
            default:
                int intValue = ((Number) obj).intValue();
                i0 i0Var = this.f824h;
                a0.i iVar2 = (a0.i) i0Var.f833u.invoke();
                if (intValue >= 0 && intValue < iVar2.c()) {
                    yc.a0.q(i0Var.f0(), null, new h0(i0Var, intValue, null), 3);
                    return Boolean.TRUE;
                }
                throw new IllegalArgumentException(("Can't scroll to index " + intValue + ", it is out of bounds [0, " + iVar2.c() + ')').toString());
        }
    }
}
