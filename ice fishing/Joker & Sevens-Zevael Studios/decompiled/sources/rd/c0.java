package rd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public int f6122g;

    /* renamed from: h, reason: collision with root package name */
    public int f6123h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f6124i;

    /* renamed from: j, reason: collision with root package name */
    public int f6125j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0 f6126k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ qd.h f6127l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, qd.h hVar, fc.d dVar) {
        super(2, dVar);
        this.f6126k = d0Var;
        this.f6127l = hVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        return new c0(this.f6126k, this.f6127l, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (r11.c(r18) == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r5 == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007e -> B:12:0x0081). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        int i10;
        int i11;
        d0 d0Var2 = this.f6126k;
        id.i iVar = d0Var2.f6129b;
        int i12 = this.f6125j;
        ac.o oVar = ac.o.f277a;
        qd.h hVar = this.f6127l;
        gc.a aVar = gc.a.f2559g;
        if (i12 == 0) {
            v6.a.W(obj);
            int i13 = hVar.f5853i;
            this.f6125j = 1;
            nd.k kVar = iVar.f3283a;
            ((g5.j) kVar.f1234a).a(-1334209012, "UPDATE player_data SET chips = chips + ? WHERE id = 1", new nd.a(2, i13));
            kVar.b(new nd.d(8));
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                i10 = this.f6123h;
                int i14 = this.f6122g;
                d0 d0Var3 = this.f6124i;
                v6.a.W(obj);
                i11 = i14;
                d0Var = d0Var3;
                i10++;
                if (i10 >= i11) {
                    id.i iVar2 = d0Var.f6129b;
                    this.f6124i = d0Var;
                    this.f6122g = i11;
                    this.f6123h = i10;
                    this.f6125j = 2;
                } else {
                    int i15 = hVar.f5851g;
                    int i16 = hVar.f5853i;
                    this.f6124i = null;
                    this.f6125j = 3;
                    nd.k kVar2 = iVar.f3283a;
                    final long j3 = i15;
                    final long j6 = i16;
                    final long currentTimeMillis = System.currentTimeMillis();
                    ((g5.j) kVar2.f1234a).a(176043025, "INSERT INTO high_scores(score, chips_earned, created_at) VALUES (?, ?, ?)", new oc.c() { // from class: nd.i
                        @Override // oc.c
                        public final Object invoke(Object obj2) {
                            g5.k kVar3 = (g5.k) obj2;
                            pc.j.e(kVar3, "$this$execute");
                            kVar3.e(0, Long.valueOf(j3));
                            kVar3.e(1, Long.valueOf(j6));
                            kVar3.e(2, Long.valueOf(currentTimeMillis));
                            return ac.o.f277a;
                        }
                    });
                    kVar2.b(new nd.d(9));
                    if (oVar != aVar) {
                        return oVar;
                    }
                }
                return aVar;
            }
            v6.a.W(obj);
        }
        d0Var = d0Var2;
        i10 = 0;
        i11 = hVar.f5854j;
        if (i10 >= i11) {
        }
        return aVar;
    }
}
