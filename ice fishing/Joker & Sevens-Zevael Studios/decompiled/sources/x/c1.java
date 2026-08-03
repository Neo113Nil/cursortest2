package x;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c1 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7756g;

    /* renamed from: h, reason: collision with root package name */
    public int f7757h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f7758i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(h0 h0Var, fc.d dVar, int i10) {
        super(2, dVar);
        this.f7756g = i10;
        this.f7758i = h0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7756g) {
            case 0:
                return new c1(this.f7758i, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new c1(this.f7758i, dVar, 1);
            default:
                return new c1(this.f7758i, dVar, 2);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f7756g) {
        }
        return ((c1) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7756g) {
            case 0:
                int i10 = this.f7757h;
                if (i10 == 0) {
                    v6.a.W(obj);
                    this.f7757h = 1;
                    Object a6 = this.f7758i.a(this);
                    gc.a aVar = gc.a.f2559g;
                    if (a6 == aVar) {
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
                int i11 = this.f7757h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    this.f7757h = 1;
                    Object a8 = this.f7758i.a(this);
                    gc.a aVar2 = gc.a.f2559g;
                    if (a8 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            default:
                int i12 = this.f7757h;
                if (i12 == 0) {
                    v6.a.W(obj);
                    this.f7757h = 1;
                    Object a10 = this.f7758i.a(this);
                    gc.a aVar3 = gc.a.f2559g;
                    if (a10 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
        }
    }
}
