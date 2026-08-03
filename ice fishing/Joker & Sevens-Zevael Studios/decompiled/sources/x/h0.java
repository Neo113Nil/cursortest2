package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 implements s2.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s2.c f7798g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7799h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7800i;

    /* renamed from: j, reason: collision with root package name */
    public final gd.d f7801j = new gd.d();

    public h0(s2.c cVar) {
        this.f7798g = cVar;
    }

    @Override // s2.c
    public final float B(long j3) {
        return this.f7798g.B(j3);
    }

    @Override // s2.c
    public final int D(float f10) {
        return this.f7798g.D(f10);
    }

    @Override // s2.c
    public final long L(long j3) {
        return this.f7798g.L(j3);
    }

    @Override // s2.c
    public final float N(long j3) {
        return this.f7798g.N(j3);
    }

    @Override // s2.c
    public final long U(float f10) {
        return this.f7798g.U(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hc.c cVar) {
        f0 f0Var;
        int i10;
        h0 h0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i11 = f0Var.f7782j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f0Var.f7782j = i11 - Integer.MIN_VALUE;
                Object obj = f0Var.f7780h;
                i10 = f0Var.f7782j;
                if (i10 != 0) {
                    v6.a.W(obj);
                    f0Var.f7779g = this;
                    f0Var.f7782j = 1;
                    Object c3 = this.f7801j.c(f0Var);
                    gc.a aVar = gc.a.f2559g;
                    if (c3 == aVar) {
                        return aVar;
                    }
                    h0Var = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h0Var = f0Var.f7779g;
                    v6.a.W(obj);
                }
                h0Var.f7799h = false;
                h0Var.f7800i = false;
                return ac.o.f277a;
            }
        }
        f0Var = new f0(this, cVar);
        Object obj2 = f0Var.f7780h;
        i10 = f0Var.f7782j;
        if (i10 != 0) {
        }
        h0Var.f7799h = false;
        h0Var.f7800i = false;
        return ac.o.f277a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hc.c cVar) {
        g0 g0Var;
        int i10;
        h0 h0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i11 = g0Var.f7793j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g0Var.f7793j = i11 - Integer.MIN_VALUE;
                Object obj = g0Var.f7791h;
                i10 = g0Var.f7793j;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (this.f7799h || this.f7800i) {
                        h0Var = this;
                        return Boolean.valueOf(h0Var.f7799h);
                    }
                    g0Var.f7790g = this;
                    g0Var.f7793j = 1;
                    Object c3 = this.f7801j.c(g0Var);
                    gc.a aVar = gc.a.f2559g;
                    if (c3 == aVar) {
                        return aVar;
                    }
                    h0Var = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h0Var = g0Var.f7790g;
                    v6.a.W(obj);
                }
                h0Var.f7801j.d(null);
                return Boolean.valueOf(h0Var.f7799h);
            }
        }
        g0Var = new g0(this, cVar);
        Object obj2 = g0Var.f7791h;
        i10 = g0Var.f7793j;
        if (i10 != 0) {
        }
        h0Var.f7801j.d(null);
        return Boolean.valueOf(h0Var.f7799h);
    }

    @Override // s2.c
    public final float c() {
        return this.f7798g.c();
    }

    @Override // s2.c
    public final float d0(float f10) {
        return this.f7798g.d0(f10);
    }

    @Override // s2.c
    public final float m() {
        return this.f7798g.m();
    }

    @Override // s2.c
    public final long v(float f10) {
        return this.f7798g.v(f10);
    }

    @Override // s2.c
    public final float x(float f10) {
        return this.f7798g.x(f10);
    }
}
