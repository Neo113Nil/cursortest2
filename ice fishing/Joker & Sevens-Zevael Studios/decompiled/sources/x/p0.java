package x;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7866g;

    /* renamed from: h, reason: collision with root package name */
    public int f7867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7868i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f7869j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(long j3, r1.y yVar, fc.d dVar) {
        super(2, dVar);
        this.f7866g = 4;
        this.f7869j = j3;
        this.f7868i = yVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7866g) {
            case 0:
                return new p0((s0) this.f7868i, this.f7869j, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new p0((s0) this.f7868i, this.f7869j, dVar, 1);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new p0((s0) this.f7868i, this.f7869j, dVar, 2);
            case 3:
                p0 p0Var = new p0((s0) this.f7868i, dVar);
                p0Var.f7869j = ((e1.b) obj).f1929a;
                return p0Var;
            default:
                return new p0(this.f7869j, (r1.y) this.f7868i, dVar);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7866g) {
            case 0:
                return ((p0) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return ((p0) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return ((p0) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            case 3:
                long j3 = ((e1.b) obj).f1929a;
                p0 p0Var = new p0((s0) this.f7868i, (fc.d) obj2);
                p0Var.f7869j = j3;
                return p0Var.invokeSuspend(ac.o.f277a);
            default:
                return ((p0) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x013a, code lost:
    
        if (r11 == r5) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013d, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (r11 != r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0151, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014c, code lost:
    
        if (r11 == r5) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend;
        yc.g gVar;
        switch (this.f7866g) {
            case 0:
                int i10 = this.f7867h;
                ac.o oVar = ac.o.f277a;
                if (i10 == 0) {
                    v6.a.W(obj);
                    z0 z0Var = ((s0) this.f7868i).J;
                    long j3 = this.f7869j;
                    this.f7867h = 1;
                    long a6 = z0Var.f7954d == e0.f7770h ? s2.p.a(j3, 0.0f, 0.0f, 1) : s2.p.a(j3, 0.0f, 0.0f, 2);
                    y0 y0Var = new y0(z0Var, null);
                    w.w0 w0Var = z0Var.f7952b;
                    gc.a aVar = gc.a.f2559g;
                    if (w0Var != null && (z0Var.f7951a.c() || z0Var.f7951a.a())) {
                        invokeSuspend = w0Var.e(a6, y0Var, this);
                        break;
                    } else {
                        y0 y0Var2 = new y0(y0Var.f7944j, this);
                        y0Var2.f7943i = a6;
                        invokeSuspend = y0Var2.invokeSuspend(oVar);
                        break;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i11 = this.f7867h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    z0 z0Var2 = ((s0) this.f7868i).J;
                    q0 q0Var = new q0(this.f7869j, null, 0);
                    this.f7867h = 1;
                    Object e10 = z0Var2.e(w.p0.f7481h, q0Var, this);
                    gc.a aVar2 = gc.a.f2559g;
                    if (e10 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int i12 = this.f7867h;
                if (i12 == 0) {
                    v6.a.W(obj);
                    z0 z0Var3 = ((s0) this.f7868i).J;
                    q0 q0Var2 = new q0(this.f7869j, null, 1);
                    this.f7867h = 1;
                    Object e11 = z0Var3.e(w.p0.f7481h, q0Var2, this);
                    gc.a aVar3 = gc.a.f2559g;
                    if (e11 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            case 3:
                int i13 = this.f7867h;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return obj;
                }
                v6.a.W(obj);
                long j6 = this.f7869j;
                z0 z0Var4 = ((s0) this.f7868i).J;
                this.f7867h = 1;
                Object a8 = androidx.compose.foundation.gestures.a.a(z0Var4, j6, this);
                gc.a aVar4 = gc.a.f2559g;
                return a8 == aVar4 ? aVar4 : a8;
            default:
                long j10 = this.f7869j;
                int i14 = this.f7867h;
                gc.a aVar5 = gc.a.f2559g;
                if (i14 == 0) {
                    v6.a.W(obj);
                    this.f7867h = 1;
                    if (yc.a0.f(j10 - 8, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        gVar = ((r1.y) this.f7868i).f6003i;
                        if (gVar != null) {
                            gVar.resumeWith(v6.a.s(new r1.i(j10)));
                        }
                        return ac.o.f277a;
                    }
                    v6.a.W(obj);
                }
                this.f7867h = 2;
                if (yc.a0.f(8L, this) == aVar5) {
                    return aVar5;
                }
                gVar = ((r1.y) this.f7868i).f6003i;
                if (gVar != null) {
                }
                return ac.o.f277a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(s0 s0Var, long j3, fc.d dVar, int i10) {
        super(2, dVar);
        this.f7866g = i10;
        this.f7868i = s0Var;
        this.f7869j = j3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, fc.d dVar) {
        super(2, dVar);
        this.f7866g = 3;
        this.f7868i = s0Var;
    }
}
