package rd;

import v.h1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public int f6192g;

    /* renamed from: h, reason: collision with root package name */
    public int f6193h;

    /* renamed from: i, reason: collision with root package name */
    public v.c f6194i;

    /* renamed from: j, reason: collision with root package name */
    public int f6195j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f6196k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e0 f6197l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.c f6198m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z10, e0 e0Var, v.c cVar, fc.d dVar) {
        super(2, dVar);
        this.f6196k = z10;
        this.f6197l = e0Var;
        this.f6198m = cVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        return new u(this.f6196k, this.f6197l, this.f6198m, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (v.c.c(r0, r1, r2, null, r15, 12) == r12) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (v.c.c(r15.f6198m, r1, r2, null, r15, 12) == r12) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008c -> B:13:0x008e). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10;
        v.c cVar;
        int i11;
        v.c cVar2;
        int i12;
        int i13 = this.f6195j;
        gc.a aVar = gc.a.f2559g;
        if (i13 == 0) {
            v6.a.W(obj);
            if (this.f6196k && this.f6197l == e0.f6136h) {
                i10 = 0;
                cVar = this.f6198m;
                i11 = 3;
                if (i10 < i11) {
                }
                return aVar;
            }
        } else {
            if (i13 == 1) {
                int i14 = this.f6193h;
                int i15 = this.f6192g;
                v.c cVar3 = this.f6194i;
                v6.a.W(obj);
                i10 = i14;
                i11 = i15;
                cVar = cVar3;
                Float f10 = new Float(1.2f);
                h1 j3 = v.d.j(50, 6, null);
                this.f6194i = cVar;
                this.f6192g = i11;
                this.f6193h = i10;
                this.f6195j = 2;
                if (v.c.c(cVar, f10, j3, null, this, 12) != aVar) {
                    cVar2 = cVar;
                    i12 = i10;
                    i10 = i12 + 1;
                    cVar = cVar2;
                    if (i10 < i11) {
                    }
                }
                return aVar;
            }
            if (i13 == 2) {
                i12 = this.f6193h;
                int i16 = this.f6192g;
                cVar2 = this.f6194i;
                v6.a.W(obj);
                i11 = i16;
                i10 = i12 + 1;
                cVar = cVar2;
                if (i10 < i11) {
                    Float f11 = new Float(0.8f);
                    h1 j6 = v.d.j(50, 6, null);
                    this.f6194i = cVar;
                    this.f6192g = i11;
                    this.f6193h = i10;
                    this.f6195j = 1;
                } else {
                    Float f12 = new Float(1.0f);
                    h1 j10 = v.d.j(50, 6, null);
                    this.f6194i = null;
                    this.f6195j = 3;
                }
                return aVar;
            }
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
        }
        return ac.o.f277a;
    }
}
