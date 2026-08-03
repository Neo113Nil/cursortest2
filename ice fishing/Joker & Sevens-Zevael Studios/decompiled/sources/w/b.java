package w;

import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public boolean f7370g;

    /* renamed from: h, reason: collision with root package name */
    public int f7371h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7372i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x.h0 f7373j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f7374k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y.i f7375l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f7376m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x.h0 h0Var, long j3, y.i iVar, q qVar, fc.d dVar) {
        super(2, dVar);
        this.f7373j = h0Var;
        this.f7374k = j3;
        this.f7375l = iVar;
        this.f7376m = qVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        b bVar = new b(this.f7373j, this.f7374k, this.f7375l, this.f7376m, dVar);
        bVar.f7372i = obj;
        return bVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bd, code lost:
    
        if (r14.a(r1, r18) != r11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r14.a(r2, r18) == r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        if (r2 == r11) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [y.k] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v4, types: [yc.b1] */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gc.a aVar;
        ?? r10;
        Object b2;
        ?? r12;
        boolean z10;
        y.l lVar;
        int i10 = this.f7371h;
        q qVar = this.f7376m;
        ac.o oVar = ac.o.f277a;
        y.i iVar = this.f7375l;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 == 0) {
            v6.a.W(obj);
            aVar = aVar2;
            r10 = 0;
            r1 q10 = yc.a0.q((yc.y) this.f7372i, null, new a(qVar, this.f7374k, this.f7375l, null, 0), 3);
            this.f7372i = q10;
            this.f7371h = 1;
            b2 = this.f7373j.b(this);
            r12 = q10;
        } else if (i10 == 1) {
            yc.b1 b1Var = (yc.b1) this.f7372i;
            v6.a.W(obj);
            r10 = 0;
            aVar = aVar2;
            b2 = obj;
            r12 = b1Var;
        } else {
            if (i10 == 2) {
                z10 = this.f7370g;
                v6.a.W(obj);
                r10 = 0;
                aVar = aVar2;
                if (z10) {
                    y.k kVar = new y.k(this.f7374k);
                    y.l lVar2 = new y.l(kVar);
                    this.f7372i = lVar2;
                    this.f7371h = 3;
                    if (iVar.a(kVar, this) != aVar) {
                        lVar = lVar2;
                        r10 = r10;
                        this.f7372i = r10;
                        this.f7371h = 4;
                    }
                    return aVar;
                }
                qVar.F = r10;
                return oVar;
            }
            if (i10 != 3) {
                if (i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                r10 = 0;
                qVar.F = r10;
                return oVar;
            }
            lVar = (y.l) this.f7372i;
            v6.a.W(obj);
            r10 = 0;
            aVar = aVar2;
            this.f7372i = r10;
            this.f7371h = 4;
        }
        boolean booleanValue = ((Boolean) b2).booleanValue();
        if (!r12.b()) {
            y.k kVar2 = qVar.F;
            if (kVar2 != null) {
                y.h lVar3 = booleanValue ? new y.l(kVar2) : new y.j(kVar2);
                this.f7372i = r10;
                this.f7371h = 5;
            }
            qVar.F = r10;
            return oVar;
        }
        this.f7372i = r10;
        this.f7370g = booleanValue;
        this.f7371h = 2;
        r12.a(r10);
        Object j3 = r12.j(this);
        if (j3 != aVar) {
            j3 = oVar;
        }
        if (j3 != aVar) {
            z10 = booleanValue;
            r10 = r10;
            if (z10) {
            }
            qVar.F = r10;
            return oVar;
        }
        return aVar;
    }
}
