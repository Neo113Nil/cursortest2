package bd;

import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.d1;
import m0.t1;
import v.e1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1107g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1108h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1109i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1110j;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.f1107g = i10;
        this.f1108h = obj;
        this.f1109i = obj2;
        this.f1110j = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    @Override // bd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, fc.d dVar) {
        h hVar;
        Object obj2;
        int i10;
        i iVar;
        switch (this.f1107g) {
            case 0:
                if (dVar instanceof h) {
                    hVar = (h) dVar;
                    int i11 = hVar.f1106k;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        hVar.f1106k = i11 - Integer.MIN_VALUE;
                        obj2 = hVar.f1104i;
                        i10 = hVar.f1106k;
                        ac.o oVar = ac.o.f277a;
                        gc.a aVar = gc.a.f2559g;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    obj = hVar.f1103h;
                                    iVar = hVar.f1102g;
                                    v6.a.W(obj2);
                                } else if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                            v6.a.W(obj2);
                            return oVar;
                        }
                        v6.a.W(obj2);
                        if (((pc.o) this.f1108h).f5679g) {
                            f fVar = (f) this.f1109i;
                            hVar.f1106k = 1;
                            if (fVar.a(obj, hVar) != aVar) {
                                return oVar;
                            }
                        } else {
                            a0 a0Var = (a0) this.f1110j;
                            hVar.f1102g = this;
                            hVar.f1103h = obj;
                            hVar.f1106k = 2;
                            obj2 = a0Var.invoke(obj, hVar);
                            if (obj2 != aVar) {
                                iVar = this;
                            }
                        }
                        return aVar;
                        if (!((Boolean) obj2).booleanValue()) {
                            return oVar;
                        }
                        ((pc.o) iVar.f1108h).f5679g = true;
                        f fVar2 = (f) iVar.f1109i;
                        hVar.f1102g = null;
                        hVar.f1103h = null;
                        hVar.f1106k = 3;
                        if (fVar2.a(obj, hVar) != aVar) {
                            return oVar;
                        }
                        return aVar;
                    }
                }
                hVar = new h(this, dVar);
                obj2 = hVar.f1104i;
                i10 = hVar.f1106k;
                ac.o oVar2 = ac.o.f277a;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Object a6 = cd.c.a((fc.i) this.f1108h, obj, this.f1109i, (c0.d) this.f1110j, dVar);
                return a6 == gc.a.f2559g ? a6 : ac.o.f277a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                e1 e1Var = (e1) this.f1109i;
                ((t1) this.f1108h).setValue(Boolean.valueOf(booleanValue ? ((Boolean) ((oc.e) ((d1) this.f1110j).getValue()).invoke(e1Var.c(), e1Var.f6826d.getValue())).booleanValue() : false));
                return ac.o.f277a;
        }
    }

    public i(f fVar, fc.i iVar) {
        this.f1107g = 1;
        this.f1108h = iVar;
        this.f1109i = dd.a.k(iVar);
        this.f1110j = new c0.d(fVar, null, 1);
    }
}
