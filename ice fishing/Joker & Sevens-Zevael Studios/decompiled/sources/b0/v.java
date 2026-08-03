package b0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.List;
import m0.d1;
import m0.l1;
import m0.w2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f912h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f913i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f914j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f915k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(1);
        this.f911g = i10;
        this.f912h = obj;
        this.f913i = obj2;
        this.f914j = obj3;
        this.f915k = obj4;
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r14v29, types: [oc.a, pc.k] */
    @Override // oc.c
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f911g) {
            case 0:
                d0 d0Var = (d0) this.f912h;
                d0Var.f815c = new a5.c((s) this.f913i, (v1.s0) this.f914j, (b) this.f915k);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                List list = (List) obj;
                pc.j.e(list, "items");
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                v.g gVar = (v.g) obj;
                oc.c cVar = (oc.c) this.f914j;
                v.c cVar2 = (v.c) this.f912h;
                v.d.k(gVar, cVar2.f6792c);
                l1 l1Var = gVar.f6844e;
                Object a6 = v.c.a(cVar2, l1Var.getValue());
                if (!pc.j.a(a6, l1Var.getValue())) {
                    cVar2.f6792c.f6857h.setValue(a6);
                    ((v.i) this.f913i).f6857h.setValue(a6);
                    if (cVar != null) {
                        cVar.invoke(cVar2);
                    }
                    gVar.f6848i.setValue(Boolean.FALSE);
                    gVar.f6843d.invoke();
                    ((pc.o) this.f915k).f5679g = true;
                } else if (cVar != null) {
                    cVar.invoke(cVar2);
                }
                break;
            case 3:
                long longValue = ((Number) obj).longValue();
                yc.y yVar = (yc.y) this.f915k;
                pc.p pVar = (pc.p) this.f914j;
                v.e0 e0Var = (v.e0) this.f913i;
                w2 w2Var = (w2) ((d1) this.f912h).getValue();
                long longValue2 = w2Var != null ? ((Number) w2Var.getValue()).longValue() : longValue;
                long j3 = e0Var.f6821c;
                o0.e eVar = e0Var.f6819a;
                int i10 = 0;
                if (j3 == Long.MIN_VALUE || pVar.f5680g != v.d.g(yVar.f())) {
                    e0Var.f6821c = longValue;
                    int i11 = eVar.f5136i;
                    if (i11 > 0) {
                        Object[] objArr = eVar.f5134g;
                        int i12 = 0;
                        do {
                            ((v.c0) objArr[i12]).f6805l = true;
                            i12++;
                        } while (i12 < i11);
                    }
                    pVar.f5680g = v.d.g(yVar.f());
                }
                float f10 = pVar.f5680g;
                if (f10 == 0.0f) {
                    int i13 = eVar.f5136i;
                    if (i13 > 0) {
                        Object[] objArr2 = eVar.f5134g;
                        do {
                            v.c0 c0Var = (v.c0) objArr2[i10];
                            c0Var.f6802i.setValue(c0Var.f6803j.f7006c);
                            c0Var.f6805l = true;
                            i10++;
                        } while (i10 < i13);
                    }
                } else {
                    long j6 = (long) ((longValue2 - e0Var.f6821c) / f10);
                    int i14 = eVar.f5136i;
                    if (i14 > 0) {
                        Object[] objArr3 = eVar.f5134g;
                        int i15 = 0;
                        z10 = true;
                        do {
                            v.c0 c0Var2 = (v.c0) objArr3[i15];
                            if (!c0Var2.f6804k) {
                                c0Var2.f6807n.f6820b.setValue(Boolean.FALSE);
                                if (c0Var2.f6805l) {
                                    c0Var2.f6805l = false;
                                    c0Var2.f6806m = j6;
                                }
                                long j10 = j6 - c0Var2.f6806m;
                                c0Var2.f6802i.setValue(c0Var2.f6803j.b(j10));
                                c0Var2.f6804k = c0Var2.f6803j.g(j10);
                            }
                            if (!c0Var2.f6804k) {
                                z10 = false;
                            }
                            i15++;
                        } while (i15 < i14);
                    } else {
                        z10 = true;
                    }
                    e0Var.f6822d.setValue(Boolean.valueOf(!z10));
                }
                break;
            default:
                v.g gVar2 = (v.g) obj;
                float floatValue = ((Number) gVar2.f6844e.getValue()).floatValue();
                pc.p pVar2 = (pc.p) this.f912h;
                float f11 = floatValue - pVar2.f5680g;
                float a8 = ((x.v0) this.f913i).a(f11);
                pVar2.f5680g = ((Number) gVar2.f6844e.getValue()).floatValue();
                ((pc.p) this.f914j).f5680g = ((Number) ((oc.c) gVar2.f6840a.f8357i).invoke(gVar2.f6845f)).floatValue();
                if (Math.abs(f11 - a8) > 0.5f) {
                    gVar2.f6848i.setValue(Boolean.FALSE);
                    gVar2.f6843d.invoke();
                }
                ((x.k) this.f915k).getClass();
                break;
        }
        return ac.o.f277a;
    }
}
