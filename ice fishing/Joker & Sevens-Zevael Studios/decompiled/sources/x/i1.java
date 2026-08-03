package x;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i1 extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public Object f7813h;

    /* renamed from: i, reason: collision with root package name */
    public Object f7814i;

    /* renamed from: j, reason: collision with root package name */
    public pc.s f7815j;

    /* renamed from: k, reason: collision with root package name */
    public long f7816k;

    /* renamed from: l, reason: collision with root package name */
    public int f7817l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f7818m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yc.y f7819n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ oc.f f7820o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h0 f7821p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(yc.y yVar, oc.f fVar, h0 h0Var, fc.d dVar) {
        super(dVar);
        this.f7819n = yVar;
        this.f7820o = fVar;
        this.f7821p = h0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        i1 i1Var = new i1(this.f7819n, this.f7820o, this.f7821p, dVar);
        i1Var.f7818m = obj;
        return i1Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((r1.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (x.k1.a(r0, r14) == r9) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r12.b(r10, r15, r14) == r9) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0142, code lost:
    
        if (x.k1.a(r8, r14) == r9) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117 A[Catch: i -> 0x00ac, TryCatch #2 {i -> 0x00ac, blocks: (B:33:0x00a7, B:34:0x0111, B:36:0x0117, B:37:0x0121), top: B:32:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121 A[Catch: i -> 0x00ac, TRY_LEAVE, TryCatch #2 {i -> 0x00ac, blocks: (B:33:0x00a7, B:34:0x0111, B:36:0x0117, B:37:0x0121), top: B:32:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b2;
        r1.y yVar;
        r1.n nVar;
        pc.s sVar;
        long j3;
        r1.y yVar2;
        pc.s sVar2;
        Object b10;
        pc.s sVar3;
        pc.s sVar4;
        Object obj2;
        r1.y yVar3;
        int i10 = this.f7817l;
        yc.y yVar4 = this.f7819n;
        oc.f fVar = this.f7820o;
        h0 h0Var = this.f7821p;
        gc.a aVar = gc.a.f2559g;
        switch (i10) {
            case 0:
                v6.a.W(obj);
                r1.y yVar5 = (r1.y) this.f7818m;
                this.f7818m = yVar5;
                this.f7817l = 1;
                b2 = k1.b(yVar5, (r3 & 1) != 0, r1.h.f5957h, this);
                if (b2 != aVar) {
                    yVar = yVar5;
                    obj = b2;
                    nVar = (r1.n) obj;
                    nVar.a();
                    yc.a0.q(yVar4, null, new c1(h0Var, null, 1), 3);
                    if (fVar != k1.f7836a) {
                        yc.a0.q(yVar4, null, new f1(fVar, h0Var, nVar, null, 0), 3);
                    }
                    sVar = new pc.s();
                    j3 = 4611686018427387903L;
                    try {
                        g1 g1Var = new g1(null);
                        this.f7818m = yVar;
                        this.f7813h = nVar;
                        this.f7814i = sVar;
                        this.f7815j = sVar;
                        this.f7816k = 4611686018427387903L;
                        this.f7817l = 2;
                        b10 = yVar.b(4611686018427387903L, g1Var, this);
                    } catch (r1.i unused) {
                        yVar2 = yVar;
                        sVar2 = sVar;
                        this.f7818m = yVar2;
                        this.f7813h = sVar2;
                        this.f7814i = null;
                        this.f7815j = null;
                        this.f7816k = j3;
                        this.f7817l = 3;
                        break;
                    }
                    if (b10 != aVar) {
                        sVar3 = sVar;
                        obj = b10;
                        sVar4 = sVar3;
                        sVar3.f5683g = obj;
                        obj2 = sVar4.f5683g;
                        if (obj2 != null) {
                            yc.a0.q(yVar4, null, new d1(h0Var, null, 3), 3);
                        } else {
                            ((r1.n) obj2).a();
                            yc.a0.q(yVar4, null, new d1(h0Var, null, 4), 3);
                        }
                        Object obj3 = sVar4.f5683g;
                        return ac.o.f277a;
                    }
                }
                return aVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                yVar = (r1.y) this.f7818m;
                v6.a.W(obj);
                nVar = (r1.n) obj;
                nVar.a();
                yc.a0.q(yVar4, null, new c1(h0Var, null, 1), 3);
                if (fVar != k1.f7836a) {
                }
                sVar = new pc.s();
                j3 = 4611686018427387903L;
                g1 g1Var2 = new g1(null);
                this.f7818m = yVar;
                this.f7813h = nVar;
                this.f7814i = sVar;
                this.f7815j = sVar;
                this.f7816k = 4611686018427387903L;
                this.f7817l = 2;
                b10 = yVar.b(4611686018427387903L, g1Var2, this);
                if (b10 != aVar) {
                }
                return aVar;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                j3 = this.f7816k;
                sVar3 = this.f7815j;
                sVar4 = (pc.s) this.f7814i;
                yVar2 = (r1.y) this.f7818m;
                try {
                    v6.a.W(obj);
                    sVar3.f5683g = obj;
                    obj2 = sVar4.f5683g;
                    if (obj2 != null) {
                    }
                } catch (r1.i unused2) {
                    sVar2 = sVar4;
                    this.f7818m = yVar2;
                    this.f7813h = sVar2;
                    this.f7814i = null;
                    this.f7815j = null;
                    this.f7816k = j3;
                    this.f7817l = 3;
                    break;
                }
                Object obj32 = sVar4.f5683g;
                return ac.o.f277a;
            case 3:
                sVar2 = (pc.s) this.f7813h;
                v6.a.W(obj);
                yc.a0.q(yVar4, null, new d1(h0Var, null, 5), 3);
                sVar4 = sVar2;
                Object obj322 = sVar4.f5683g;
                return ac.o.f277a;
            case 4:
                long j6 = this.f7816k;
                pc.s sVar5 = (pc.s) this.f7813h;
                r1.y yVar6 = (r1.y) this.f7818m;
                v6.a.W(obj);
                r1.n nVar2 = (r1.n) obj;
                if (nVar2 != null) {
                    yc.a0.q(yVar4, null, new c1(h0Var, null, 2), 3);
                    if (fVar != k1.f7836a) {
                        yc.a0.q(yVar4, null, new f1(fVar, h0Var, nVar2, null, 1), 3);
                    }
                    try {
                        h1 h1Var = new h1(yVar4, sVar5, h0Var, null);
                        this.f7818m = yVar6;
                        this.f7813h = sVar5;
                        this.f7814i = nVar2;
                        this.f7817l = 5;
                        break;
                    } catch (r1.i unused3) {
                        yVar3 = yVar6;
                        this.f7818m = null;
                        this.f7813h = null;
                        this.f7814i = null;
                        this.f7817l = 6;
                        break;
                    }
                }
                return ac.o.f277a;
            case 5:
                yVar3 = (r1.y) this.f7818m;
                try {
                    v6.a.W(obj);
                } catch (r1.i unused4) {
                    this.f7818m = null;
                    this.f7813h = null;
                    this.f7814i = null;
                    this.f7817l = 6;
                    break;
                }
                return ac.o.f277a;
            case 6:
                v6.a.W(obj);
                yc.a0.q(yVar4, null, new d1(h0Var, null, 2), 3);
                return ac.o.f277a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
