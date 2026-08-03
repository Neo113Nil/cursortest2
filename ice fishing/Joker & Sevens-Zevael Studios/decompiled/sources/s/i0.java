package s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public e0 f6280h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f6281i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f6282j;

    /* renamed from: k, reason: collision with root package name */
    public int f6283k;

    /* renamed from: l, reason: collision with root package name */
    public int f6284l;

    /* renamed from: m, reason: collision with root package name */
    public int f6285m;

    /* renamed from: n, reason: collision with root package name */
    public int f6286n;

    /* renamed from: o, reason: collision with root package name */
    public long f6287o;

    /* renamed from: p, reason: collision with root package name */
    public int f6288p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f6289q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j0 f6290r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f6291s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, e0 e0Var, fc.d dVar) {
        super(dVar);
        this.f6290r = j0Var;
        this.f6291s = e0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        i0 i0Var = new i0(this.f6290r, this.f6291s, dVar);
        i0Var.f6289q = obj;
        return i0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((wc.f) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0095). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wc.f fVar;
        j0 j0Var;
        long[] jArr;
        int length;
        e0 e0Var;
        int i10;
        long j3;
        int i11 = this.f6288p;
        if (i11 == 0) {
            v6.a.W(obj);
            fVar = (wc.f) this.f6289q;
            j0Var = this.f6290r;
            jArr = j0Var.f6294h.f6274a;
            length = jArr.length - 2;
            if (length >= 0) {
                e0Var = this.f6291s;
                i10 = 0;
                j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i10 != length) {
                }
            }
            return ac.o.f277a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i12 = this.f6286n;
        int i13 = this.f6285m;
        long j6 = this.f6287o;
        int i14 = this.f6284l;
        int i15 = this.f6283k;
        long[] jArr2 = this.f6282j;
        j0 j0Var2 = this.f6281i;
        e0 e0Var2 = this.f6280h;
        wc.f fVar2 = (wc.f) this.f6289q;
        v6.a.W(obj);
        j6 >>= 8;
        i12++;
        if (i12 < i13) {
            if (i13 == 8) {
                length = i15;
                jArr = jArr2;
                j0Var = j0Var2;
                fVar = fVar2;
                i10 = i14;
                e0Var = e0Var2;
                if (i10 != length) {
                    i10++;
                    j3 = jArr[i10];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        fVar2 = fVar;
                        i12 = 0;
                        j0Var2 = j0Var;
                        jArr2 = jArr;
                        i13 = 8 - ((~(i10 - length)) >>> 31);
                        e0Var2 = e0Var;
                        i14 = i10;
                        i15 = length;
                        j6 = j3;
                        if (i12 < i13) {
                            if ((255 & j6) < 128) {
                                int i16 = (i14 << 3) + i12;
                                e0Var2.f6255h = i16;
                                Object obj2 = j0Var2.f6294h.f6275b[i16];
                                this.f6289q = fVar2;
                                this.f6280h = e0Var2;
                                this.f6281i = j0Var2;
                                this.f6282j = jArr2;
                                this.f6283k = i15;
                                this.f6284l = i14;
                                this.f6287o = j6;
                                this.f6285m = i13;
                                this.f6286n = i12;
                                this.f6288p = 1;
                                fVar2.b(obj2, this);
                                return gc.a.f2559g;
                            }
                            j6 >>= 8;
                            i12++;
                            if (i12 < i13) {
                            }
                        }
                    }
                    if (i10 != length) {
                    }
                }
            }
            return ac.o.f277a;
        }
    }
}
