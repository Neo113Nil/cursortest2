package defpackage;

import androidx.compose.ui.layout.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yh0 implements kfh {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ yh0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        ksk kskVar;
        Object obj;
        List list2;
        ksk kskVar2;
        Object obj2;
        Integer num;
        Object obj3;
        int i;
        boolean z;
        ksk kskVar3;
        Object obj4;
        boolean z2;
        float e;
        ArrayList arrayList;
        ArrayList arrayList2;
        Pair pair;
        switch (this.a) {
            case 0:
                ((jhm) this.b).setParentLayoutDirection((xof) this.c);
                return mfh.m0(mfhVar, 0, 0, d5.F);
            case 1:
                mfhVar.getClass();
                list.getClass();
                lke lkeVar = (lke) ((aqi) this.b).getValue();
                boolean z3 = lkeVar != null && lkeVar.d().contains(wke.a);
                List list3 = list;
                Iterator it = list3.iterator();
                while (true) {
                    kskVar = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.d(a.a((ffh) obj), "InformerLayoutId")) {
                        }
                    } else {
                        obj = null;
                    }
                }
                ffh ffhVar = (ffh) obj;
                if (ffhVar != null) {
                    list2 = list3;
                    kskVar2 = ffhVar.M(j);
                } else {
                    list2 = list3;
                    kskVar2 = null;
                }
                int i2 = kskVar2 != null ? kskVar2.b : 0;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (Intrinsics.d(a.a((ffh) obj2), "PlayerScreenBottomSheetCapLayoutId")) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ffh ffhVar2 = (ffh) obj2;
                if (ffhVar2 != null) {
                    num = null;
                    kskVar = ffhVar2.M(j);
                } else {
                    num = null;
                }
                int i3 = kskVar != null ? kskVar.b : 0;
                Integer valueOf = kskVar2 != null ? Integer.valueOf(kskVar2.b) : num;
                if (!z3) {
                    valueOf = num;
                }
                int intValue = (valueOf != null ? valueOf.intValue() : 0) + i3;
                Iterator it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (Intrinsics.d(a.a((ffh) obj3), "CommonBackground")) {
                        }
                    } else {
                        obj3 = num;
                    }
                }
                ffh ffhVar3 = (ffh) obj3;
                if (ffhVar3 != null) {
                    i = intValue;
                    z = z3;
                    kskVar3 = ffhVar3.M(ga6.b(j, 0, 0, i, i, 3));
                } else {
                    i = intValue;
                    z = z3;
                    kskVar3 = null;
                }
                Iterator it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj4 = it4.next();
                        if (Intrinsics.d(a.a((ffh) obj4), "InformerGlowLayoutId")) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                ffh ffhVar4 = (ffh) obj4;
                ksk M = ffhVar4 != null ? ffhVar4.M(ga6.b(j, 0, 0, i, i, 3)) : null;
                ((aqi) this.c).setValue(Integer.valueOf(i2));
                return mfh.m0(mfhVar, ga6.i(j), i3 + i2, new ljl(z, i2, kskVar3, kskVar2, kskVar, M));
            case 2:
                ja0 ja0Var = (ja0) this.c;
                e2o e2oVar = (e2o) this.b;
                mfhVar.getClass();
                list.getClass();
                if (list.size() != 1) {
                    xq0.x("ResizableBottomSheet expects a single composable child.");
                    return null;
                }
                ffh ffhVar5 = (ffh) CollectionsKt.k0(list);
                float h = ga6.h(j);
                if (h == 0.0f) {
                    return mfh.m0(mfhVar, ga6.i(j), ga6.h(j), new kin(23));
                }
                t6k t6kVar = e2oVar.e;
                u6k u6kVar = e2oVar.i;
                u6k u6kVar2 = e2oVar.h;
                x6k x6kVar = e2oVar.j;
                t6k t6kVar2 = e2oVar.f;
                t6k t6kVar3 = e2oVar.b;
                t6k t6kVar4 = e2oVar.c;
                t6kVar.h(h);
                if (!((Boolean) x6kVar.getValue()).booleanValue() || u6kVar2.h() == 0) {
                    z2 = false;
                } else {
                    x6kVar.setValue(Boolean.FALSE);
                    float h2 = u6kVar2.h() / h;
                    if (u6kVar.h() != 0) {
                        float h3 = u6kVar.h() / h;
                        if (h3 > 1.0f) {
                            e2oVar.b(true);
                            e = 1.0f;
                        } else {
                            e2oVar.b(false);
                            e = yhn.c(h3, h2, 1.0f);
                        }
                    } else {
                        e = t6kVar4.e();
                    }
                    if (e2oVar.a()) {
                        t6kVar3.h(0.0f);
                        t6kVar4.h(1.0f);
                    } else {
                        t6kVar3.h(h2);
                        t6kVar4.h(e);
                    }
                    z2 = true;
                }
                if (ja0Var.c().c == 0 || z2) {
                    ja0Var.j(com.yandex.music.core.ui.compose.draggable.a.b(new kz4(h, e2oVar, 3)), (d2o) e2oVar.a.g.getValue());
                }
                float c = yhn.c(1 - (ja0Var.j.e() / h), 0.0f, 1.0f);
                t6kVar2.h(c);
                if (!e2oVar.a()) {
                    e2oVar.g.h(yhn.c((c - t6kVar3.e()) / (t6kVar4.e() - t6kVar3.e()), 0.0f, 1.0f));
                }
                int b = e2oVar.a() ? eeh.b(h) : (!e2oVar.a() && t6kVar2.e() >= t6kVar3.e()) ? eeh.b(t6kVar2.e() * h) : eeh.b(t6kVar3.e() * h);
                return mfh.m0(mfhVar, ga6.i(j), ga6.h(j), new zj(ffhVar5.M(ga6.b(j, 0, 0, 0, b < 0 ? 0 : b, 3)), 7));
            default:
                ArrayList arrayList3 = new ArrayList(list.size());
                List list4 = list;
                int size = list4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj5 = list.get(i4);
                    if (!(((ffh) obj5).n() instanceof sds)) {
                        arrayList3.add(obj5);
                    }
                }
                List list5 = (List) ((Function0) this.c).invoke();
                if (list5 != null) {
                    ArrayList arrayList4 = new ArrayList(list5.size());
                    int size2 = list5.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        ynn ynnVar = (ynn) list5.get(i5);
                        if (ynnVar != null) {
                            float f = ynnVar.b;
                            float f2 = ynnVar.a;
                            arrayList2 = arrayList4;
                            pair = new Pair(((ffh) arrayList3.get(i5)).M(ia6.b((int) Math.floor(ynnVar.c - f2), (int) Math.floor(ynnVar.d - f), 5)), new wpe((Math.round(f) & 4294967295L) | (Math.round(f2) << 32)));
                        } else {
                            arrayList2 = arrayList4;
                            pair = null;
                        }
                        ArrayList arrayList5 = arrayList2;
                        if (pair != null) {
                            arrayList5.add(pair);
                        }
                        i5++;
                        arrayList4 = arrayList5;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size3 = list4.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    Object obj6 = list.get(i6);
                    if (((ffh) obj6).n() instanceof sds) {
                        arrayList6.add(obj6);
                    }
                }
                return mfh.m0(mfhVar, ga6.i(j), ga6.h(j), new gcp(16, arrayList, j66.G(arrayList6, (Function0) this.b)));
        }
    }
}
