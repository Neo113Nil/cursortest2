package x;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7945g = 0;

    /* renamed from: h, reason: collision with root package name */
    public pc.s f7946h;

    /* renamed from: i, reason: collision with root package name */
    public pc.s f7947i;

    /* renamed from: j, reason: collision with root package name */
    public int f7948j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7949k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s0 f7950l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(pc.s sVar, s0 s0Var, fc.d dVar) {
        super(2, dVar);
        this.f7947i = sVar;
        this.f7950l = s0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7945g) {
            case 0:
                z zVar = new z(this.f7947i, this.f7950l, dVar);
                zVar.f7949k = obj;
                return zVar;
            default:
                z zVar2 = new z(this.f7950l, dVar);
                zVar2.f7949k = obj;
                return zVar2;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7945g) {
            case 0:
                return ((z) create((oc.c) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            default:
                return ((z) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r11 != r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        if (x.s0.u0(r2, r10) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
    
        if (x.s0.u0(r2, r10) != r4) goto L13;
     */
    /* JADX WARN: Path cross not found for [B:34:0x00d9, B:31:0x00c7], limit reached: 88 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d4 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e8 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f6 -> B:9:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x014a -> B:63:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x014f -> B:64:0x0150). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oc.c cVar;
        Object obj2;
        yc.y yVar;
        pc.s sVar;
        pc.s sVar2;
        pc.s sVar3;
        yc.y yVar2;
        yc.y yVar3;
        Object e10;
        q qVar;
        Object obj3;
        switch (this.f7945g) {
            case 0:
                pc.s sVar4 = this.f7947i;
                int i10 = this.f7948j;
                if (i10 == 0) {
                    v6.a.W(obj);
                    cVar = (oc.c) this.f7949k;
                    obj2 = sVar4.f5683g;
                    if (obj2 instanceof p) {
                    }
                    return ac.o.f277a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pc.s sVar5 = this.f7946h;
                cVar = (oc.c) this.f7949k;
                v6.a.W(obj);
                q qVar2 = (q) obj;
                sVar5.f5683g = qVar2;
                obj2 = sVar4.f5683g;
                if (!(obj2 instanceof p) || (obj2 instanceof m)) {
                    return ac.o.f277a;
                }
                qVar2 = null;
                n nVar = obj2 instanceof n ? (n) obj2 : null;
                if (nVar != null) {
                    cVar.invoke(nVar);
                }
                ad.e eVar = this.f7950l.A;
                if (eVar == null) {
                    sVar5 = sVar4;
                    sVar5.f5683g = qVar2;
                    obj2 = sVar4.f5683g;
                    if (obj2 instanceof p) {
                    }
                    return ac.o.f277a;
                }
                this.f7949k = cVar;
                this.f7946h = sVar4;
                this.f7948j = 1;
                obj = eVar.h(this);
                gc.a aVar = gc.a.f2559g;
                if (obj == aVar) {
                    return aVar;
                }
                sVar5 = sVar4;
                q qVar22 = (q) obj;
                sVar5.f5683g = qVar22;
                obj2 = sVar4.f5683g;
                if (obj2 instanceof p) {
                }
                return ac.o.f277a;
            default:
                int i11 = this.f7948j;
                ac.o oVar = ac.o.f277a;
                s0 s0Var = this.f7950l;
                gc.a aVar2 = gc.a.f2559g;
                switch (i11) {
                    case 0:
                        v6.a.W(obj);
                        yVar = (yc.y) this.f7949k;
                        if (yc.a0.p(yVar)) {
                            sVar = new pc.s();
                            ad.e eVar2 = s0Var.A;
                            if (eVar2 != null) {
                                this.f7949k = yVar;
                                this.f7946h = sVar;
                                this.f7947i = sVar;
                                this.f7948j = 1;
                                obj = eVar2.h(this);
                                if (obj != aVar2) {
                                    sVar2 = sVar;
                                    qVar = (q) obj;
                                    sVar.f5683g = qVar;
                                    obj3 = sVar2.f5683g;
                                    if (obj3 instanceof o) {
                                        this.f7949k = yVar;
                                        this.f7946h = sVar2;
                                        this.f7947i = null;
                                        this.f7948j = 2;
                                        if (s0.v0(s0Var, (o) obj3, this) != aVar2) {
                                            sVar3 = sVar2;
                                            yVar2 = yVar;
                                            z zVar = new z(sVar3, s0Var, null);
                                            this.f7949k = yVar2;
                                            this.f7946h = sVar3;
                                            this.f7948j = 3;
                                            z0 z0Var = s0Var.J;
                                            e10 = z0Var.e(w.p0.f7481h, new c0.c(zVar, z0Var, (fc.d) null, 11), this);
                                            if (e10 != aVar2) {
                                                e10 = oVar;
                                                break;
                                            }
                                        }
                                    }
                                    if (yc.a0.p(yVar)) {
                                        return oVar;
                                    }
                                }
                                return aVar2;
                            }
                            sVar2 = sVar;
                            qVar = null;
                            sVar.f5683g = qVar;
                            obj3 = sVar2.f5683g;
                            if (obj3 instanceof o) {
                            }
                            if (yc.a0.p(yVar)) {
                            }
                        }
                        break;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        sVar = this.f7947i;
                        sVar2 = this.f7946h;
                        yVar = (yc.y) this.f7949k;
                        v6.a.W(obj);
                        qVar = (q) obj;
                        sVar.f5683g = qVar;
                        obj3 = sVar2.f5683g;
                        if (obj3 instanceof o) {
                        }
                        if (yc.a0.p(yVar)) {
                        }
                        break;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        sVar3 = this.f7946h;
                        yVar2 = (yc.y) this.f7949k;
                        v6.a.W(obj);
                        z zVar2 = new z(sVar3, s0Var, null);
                        this.f7949k = yVar2;
                        this.f7946h = sVar3;
                        this.f7948j = 3;
                        z0 z0Var2 = s0Var.J;
                        e10 = z0Var2.e(w.p0.f7481h, new c0.c(zVar2, z0Var2, (fc.d) null, 11), this);
                        if (e10 != aVar2) {
                        }
                        break;
                    case 3:
                        sVar3 = this.f7946h;
                        yVar2 = (yc.y) this.f7949k;
                        try {
                            v6.a.W(obj);
                        } catch (CancellationException unused) {
                            yVar3 = yVar2;
                            this.f7949k = yVar3;
                            this.f7946h = null;
                            this.f7948j = 6;
                            break;
                        }
                        yVar = yVar2;
                        try {
                        } catch (CancellationException unused2) {
                            yVar3 = yVar;
                            this.f7949k = yVar3;
                            this.f7946h = null;
                            this.f7948j = 6;
                        }
                        Object obj4 = sVar3.f5683g;
                        if (obj4 instanceof p) {
                            this.f7949k = yVar;
                            this.f7946h = null;
                            this.f7948j = 4;
                            if (s0.w0(s0Var, (p) obj4, this) == aVar2) {
                                return aVar2;
                            }
                            if (yc.a0.p(yVar)) {
                            }
                        } else {
                            if (obj4 instanceof m) {
                                this.f7949k = yVar;
                                this.f7946h = null;
                                this.f7948j = 5;
                                break;
                            }
                            if (yc.a0.p(yVar)) {
                            }
                        }
                        break;
                    case 4:
                        yVar3 = (yc.y) this.f7949k;
                        try {
                            v6.a.W(obj);
                        } catch (CancellationException unused3) {
                            this.f7949k = yVar3;
                            this.f7946h = null;
                            this.f7948j = 6;
                            break;
                        }
                        yVar = yVar3;
                        if (yc.a0.p(yVar)) {
                        }
                        break;
                    case 5:
                        yVar3 = (yc.y) this.f7949k;
                        v6.a.W(obj);
                        yVar = yVar3;
                        if (yc.a0.p(yVar)) {
                        }
                        break;
                    case 6:
                        yVar3 = (yc.y) this.f7949k;
                        v6.a.W(obj);
                        yVar = yVar3;
                        if (yc.a0.p(yVar)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(s0 s0Var, fc.d dVar) {
        super(2, dVar);
        this.f7950l = s0Var;
    }
}
