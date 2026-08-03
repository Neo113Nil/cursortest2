package rd;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import v.h1;
import v.o0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6189g;

    /* renamed from: h, reason: collision with root package name */
    public int f6190h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v.c f6191i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v.c cVar, fc.d dVar, int i10) {
        super(2, dVar);
        this.f6189g = i10;
        this.f6191i = cVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f6189g) {
            case 0:
                return new t(this.f6191i, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new t(this.f6191i, dVar, 1);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new t(this.f6191i, dVar, 2);
            case 3:
                return new t(this.f6191i, dVar, 3);
            default:
                return new t(this.f6191i, dVar, 4);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f6189g) {
        }
        return ((t) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Float f10;
        o0 i10;
        switch (this.f6189g) {
            case 0:
                int i11 = this.f6190h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    Float f11 = new Float(1.0f);
                    o0 i12 = v.d.i(0.5f, 200.0f, null, 4);
                    this.f6190h = 1;
                    Object c3 = v.c.c(this.f6191i, f11, i12, null, this, 12);
                    gc.a aVar = gc.a.f2559g;
                    if (c3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i13 = this.f6190h;
                gc.a aVar2 = gc.a.f2559g;
                if (i13 == 0) {
                    v6.a.W(obj);
                    Float f12 = new Float(0.85f);
                    h1 j3 = v.d.j(100, 6, null);
                    this.f6190h = 1;
                    if (v.c.c(this.f6191i, f12, j3, null, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj);
                            return ac.o.f277a;
                        }
                        v6.a.W(obj);
                        f10 = new Float(1.0f);
                        i10 = v.d.i(0.5f, 200.0f, null, 4);
                        this.f6190h = 3;
                        if (v.c.c(this.f6191i, f10, i10, null, this, 12) == aVar2) {
                            return aVar2;
                        }
                        return ac.o.f277a;
                    }
                    v6.a.W(obj);
                }
                Float f13 = new Float(1.1f);
                h1 j6 = v.d.j(100, 6, null);
                this.f6190h = 2;
                if (v.c.c(this.f6191i, f13, j6, null, this, 12) == aVar2) {
                    return aVar2;
                }
                f10 = new Float(1.0f);
                i10 = v.d.i(0.5f, 200.0f, null, 4);
                this.f6190h = 3;
                if (v.c.c(this.f6191i, f10, i10, null, this, 12) == aVar2) {
                }
                return ac.o.f277a;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int i14 = this.f6190h;
                if (i14 == 0) {
                    v6.a.W(obj);
                    Float f14 = new Float(1.0f);
                    o0 i15 = v.d.i(0.5f, 1500.0f, null, 4);
                    this.f6190h = 1;
                    Object c7 = v.c.c(this.f6191i, f14, i15, null, this, 12);
                    gc.a aVar3 = gc.a.f2559g;
                    if (c7 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            case 3:
                int i16 = this.f6190h;
                if (i16 == 0) {
                    v6.a.W(obj);
                    Float f15 = new Float(1.15f);
                    v.b0 h10 = v.d.h(v.d.j(900, 2, v.w.f7002a), 4);
                    this.f6190h = 1;
                    Object c10 = v.c.c(this.f6191i, f15, h10, null, this, 12);
                    gc.a aVar4 = gc.a.f2559g;
                    if (c10 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            default:
                int i17 = this.f6190h;
                if (i17 == 0) {
                    v6.a.W(obj);
                    Float f16 = new Float(360.0f);
                    v.b0 h11 = v.d.h(v.d.j(3000, 2, v.w.f7003b), 6);
                    this.f6190h = 1;
                    Object c11 = v.c.c(this.f6191i, f16, h11, null, this, 12);
                    gc.a aVar5 = gc.a.f2559g;
                    if (c11 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
        }
    }
}
