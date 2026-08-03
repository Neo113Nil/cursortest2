package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z1 extends dd.t {

    /* renamed from: k, reason: collision with root package name */
    public final ThreadLocal f8926k;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z1(fc.d dVar, fc.i iVar) {
        super(dVar, iVar.v(r0) == null ? iVar.d(r0) : iVar);
        a2 a2Var = a2.f8830g;
        this.f8926k = new ThreadLocal();
        if (dVar.getContext().v(fc.e.f2347g) instanceof u) {
            return;
        }
        Object l10 = dd.a.l(iVar, null);
        dd.a.f(iVar, l10);
        h0(iVar, l10);
    }

    public final boolean g0() {
        boolean z10 = this.threadLocalIsSet && this.f8926k.get() == null;
        this.f8926k.remove();
        return !z10;
    }

    public final void h0(fc.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f8926k.set(new ac.i(iVar, obj));
    }

    @Override // dd.t, yc.k1
    public final void z(Object obj) {
        if (this.threadLocalIsSet) {
            ac.i iVar = (ac.i) this.f8926k.get();
            if (iVar != null) {
                dd.a.f((fc.i) iVar.f270g, iVar.f271h);
            }
            this.f8926k.remove();
        }
        Object s10 = a0.s(obj);
        fc.d dVar = this.f1882j;
        fc.i context = dVar.getContext();
        Object l10 = dd.a.l(context, null);
        z1 z10 = l10 != dd.a.f1844f ? a0.z(dVar, context, l10) : null;
        try {
            this.f1882j.resumeWith(s10);
            if (z10 == null || z10.g0()) {
                dd.a.f(context, l10);
            }
        } catch (Throwable th) {
            if (z10 == null || z10.g0()) {
                dd.a.f(context, l10);
            }
            throw th;
        }
    }
}
