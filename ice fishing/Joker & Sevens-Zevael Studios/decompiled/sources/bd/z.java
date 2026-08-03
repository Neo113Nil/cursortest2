package bd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends hc.j implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public int f1166g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ f f1167h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f1168i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f1169j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, fc.d dVar) {
        super(3, dVar);
        this.f1169j = b0Var;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        z zVar = new z(this.f1169j, (fc.d) obj3);
        zVar.f1167h = (f) obj;
        zVar.f1168i = intValue;
        return zVar.invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (r0.a(bd.w.f1161i, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (yc.a0.f(Long.MAX_VALUE, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0.a(bd.w.f1160h, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r0.a(bd.w.f1159g, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (yc.a0.f(0, r7) == r6) goto L32;
     */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        int i10 = this.f1166g;
        gc.a aVar = gc.a.f2559g;
        if (i10 == 0) {
            v6.a.W(obj);
            fVar = this.f1167h;
            if (this.f1168i > 0) {
                this.f1166g = 1;
            } else {
                this.f1167h = fVar;
                this.f1166g = 2;
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                fVar = this.f1167h;
                v6.a.W(obj);
                this.f1167h = fVar;
                this.f1166g = 3;
            } else if (i10 == 3) {
                fVar = this.f1167h;
                v6.a.W(obj);
                this.f1167h = fVar;
                this.f1166g = 4;
            } else if (i10 == 4) {
                fVar = this.f1167h;
                v6.a.W(obj);
                this.f1167h = null;
                this.f1166g = 5;
            } else if (i10 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        v6.a.W(obj);
        return ac.o.f277a;
    }
}
