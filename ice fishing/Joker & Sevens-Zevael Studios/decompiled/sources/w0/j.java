package w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public long[] f7564h;

    /* renamed from: i, reason: collision with root package name */
    public int f7565i;

    /* renamed from: j, reason: collision with root package name */
    public int f7566j;

    /* renamed from: k, reason: collision with root package name */
    public int f7567k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7568l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f7569m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, fc.d dVar) {
        super(dVar);
        this.f7569m = kVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        j jVar = new j(this.f7569m, dVar);
        jVar.f7568l = obj;
        return jVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((wc.f) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bd -> B:7:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:20:0x0095). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wc.f fVar;
        long[] jArr;
        int length;
        int i10;
        wc.f fVar2;
        int i11;
        wc.f fVar3;
        int i12;
        k kVar = this.f7569m;
        long j3 = kVar.f7571g;
        long j6 = kVar.f7573i;
        long j10 = kVar.f7572h;
        int i13 = this.f7567k;
        gc.a aVar = gc.a.f2559g;
        if (i13 == 0) {
            v6.a.W(obj);
            fVar = (wc.f) this.f7568l;
            jArr = kVar.f7574j;
            if (jArr != null) {
                length = jArr.length;
                i10 = 0;
            }
            if (j10 != 0) {
                fVar2 = fVar;
                i11 = 0;
                if (i11 >= 64) {
                }
            }
            if (j3 != 0) {
            }
            return ac.o.f277a;
        }
        if (i13 == 1) {
            length = this.f7566j;
            int i14 = this.f7565i;
            jArr = this.f7564h;
            fVar = (wc.f) this.f7568l;
            v6.a.W(obj);
            i10 = i14 + 1;
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = this.f7565i;
                fVar3 = (wc.f) this.f7568l;
                v6.a.W(obj);
                i12 = i15 + 1;
                if (i12 < 64) {
                    if (((1 << i12) & j3) != 0) {
                        Long l10 = new Long(j6 + i12 + 64);
                        this.f7568l = fVar3;
                        this.f7564h = null;
                        this.f7565i = i12;
                        this.f7567k = 3;
                        fVar3.b(l10, this);
                        return aVar;
                    }
                    i15 = i12;
                    i12 = i15 + 1;
                    if (i12 < 64) {
                    }
                }
                return ac.o.f277a;
            }
            i11 = this.f7565i;
            fVar2 = (wc.f) this.f7568l;
            v6.a.W(obj);
            i11++;
            if (i11 >= 64) {
                fVar = fVar2;
                if (j3 != 0) {
                    fVar3 = fVar;
                    i12 = 0;
                    if (i12 < 64) {
                    }
                }
                return ac.o.f277a;
            }
            if ((j10 & (1 << i11)) != 0) {
                Long l11 = new Long(j6 + i11);
                this.f7568l = fVar2;
                this.f7564h = null;
                this.f7565i = i11;
                this.f7567k = 2;
                fVar2.b(l11, this);
                return aVar;
            }
            i11++;
            if (i11 >= 64) {
            }
        }
        if (i10 < length) {
            Long l12 = new Long(jArr[i10]);
            this.f7568l = fVar;
            this.f7564h = jArr;
            this.f7565i = i10;
            this.f7566j = length;
            this.f7567k = 1;
            fVar.b(l12, this);
            return aVar;
        }
        if (j10 != 0) {
        }
        if (j3 != 0) {
        }
        return ac.o.f277a;
    }
}
