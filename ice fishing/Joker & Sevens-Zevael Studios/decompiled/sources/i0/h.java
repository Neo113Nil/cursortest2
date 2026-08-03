package i0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import v.h1;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2956g;

    /* renamed from: h, reason: collision with root package name */
    public int f2957h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f2958i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, fc.d dVar, int i10) {
        super(2, dVar);
        this.f2956g = i10;
        this.f2958i = jVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f2956g) {
            case 0:
                return new h(this.f2958i, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new h(this.f2958i, dVar, 1);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new h(this.f2958i, dVar, 2);
            default:
                return new h(this.f2958i, dVar, 3);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f2956g) {
        }
        return ((h) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2956g) {
            case 0:
                int i10 = this.f2957h;
                if (i10 == 0) {
                    v6.a.W(obj);
                    v.c cVar = this.f2958i.f2967f;
                    Float f10 = new Float(1.0f);
                    h1 j3 = v.d.j(75, 2, v.w.f7003b);
                    this.f2957h = 1;
                    Object c3 = v.c.c(cVar, f10, j3, null, this, 12);
                    gc.a aVar = gc.a.f2559g;
                    if (c3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i11 = this.f2957h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    v.c cVar2 = this.f2958i.f2968g;
                    Float f11 = new Float(1.0f);
                    h1 j6 = v.d.j(225, 2, v.w.f7002a);
                    this.f2957h = 1;
                    Object c7 = v.c.c(cVar2, f11, j6, null, this, 12);
                    gc.a aVar2 = gc.a.f2559g;
                    if (c7 == aVar2) {
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
                int i12 = this.f2957h;
                if (i12 == 0) {
                    v6.a.W(obj);
                    v.c cVar3 = this.f2958i.f2969h;
                    Float f12 = new Float(1.0f);
                    h1 j10 = v.d.j(225, 2, v.w.f7003b);
                    this.f2957h = 1;
                    Object c10 = v.c.c(cVar3, f12, j10, null, this, 12);
                    gc.a aVar3 = gc.a.f2559g;
                    if (c10 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            default:
                int i13 = this.f2957h;
                if (i13 == 0) {
                    v6.a.W(obj);
                    v.c cVar4 = this.f2958i.f2967f;
                    Float f13 = new Float(0.0f);
                    h1 j11 = v.d.j(150, 2, v.w.f7003b);
                    this.f2957h = 1;
                    Object c11 = v.c.c(cVar4, f13, j11, null, this, 12);
                    gc.a aVar4 = gc.a.f2559g;
                    if (c11 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
        }
    }
}
