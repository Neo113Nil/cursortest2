package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.list_player_manager.impl.a;

/* loaded from: classes4.dex */
public final class rwq extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ swq l;
    public final /* synthetic */ qj6 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwq(swq swqVar, qj6 qj6Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = swqVar;
        this.m = qj6Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new rwq(this.l, this.m, continuation, 0);
            default:
                return new rwq(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((rwq) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ak2 ak2Var;
        imh imhVar;
        bcg O;
        xbu xbuVar;
        yjj yjjVar;
        HashSet u0;
        Object value;
        w1u w1uVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    atn atnVar = this.l.n;
                    Object obj2 = this.m.a;
                    ptq ptqVar = (ptq) obj2;
                    List subList = ((ptq) obj2).b.subList(1, ((ptq) obj2).b.size());
                    String str = ptqVar.a;
                    boolean z = ptqVar.c;
                    subList.getClass();
                    ptq ptqVar2 = new ptq(str, subList, z);
                    this.k = 1;
                    if (atnVar.P(ptqVar2, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    nnd nndVar = this.l.k;
                    this.k = 1;
                    if (nndVar.I(this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rjp rjpVar = this.l.q;
                List list = ((ptq) this.m.a).b;
                rjpVar.getClass();
                list.getClass();
                xdr xdrVar = (xdr) rjpVar.a;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(new nb6(((xsq) list.get(i3)).a, false, false, false, i3));
                }
                xdrVar.getClass();
                xdrVar.m(null, arrayList);
                x3n x3nVar = this.l.u;
                List list2 = ((ptq) this.m.a).b;
                x3nVar.getClass();
                list2.getClass();
                xdr xdrVar2 = (xdr) x3nVar.d;
                List<xsq> list3 = list2;
                ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                for (xsq xsqVar : list3) {
                    ak2 ak2Var2 = xsqVar.c;
                    if (ak2Var2 instanceof yj2) {
                        w1uVar = new w1u(xsqVar.a, qbu.a, ak2Var2, false);
                    } else {
                        if (!(ak2Var2 instanceof xj2) && !Intrinsics.d(ak2Var2, zj2.a)) {
                            b6e.s();
                            return null;
                        }
                        w1uVar = new w1u(xsqVar.a, qbu.b, xsqVar.c, false);
                    }
                    arrayList2.add(w1uVar);
                }
                xdrVar2.getClass();
                xdrVar2.m(null, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    ak2 ak2Var3 = ((xsq) it.next()).c;
                    ak2Var3.getClass();
                    yj2 yj2Var = ak2Var3 instanceof yj2 ? (yj2) ak2Var3 : null;
                    imh imhVar2 = yj2Var != null ? (imh) yj2Var.k.getValue() : null;
                    if (imhVar2 != null) {
                        arrayList3.add(imhVar2);
                    }
                }
                bcg O2 = ((nnd) x3nVar.a).O();
                if (O2 != null) {
                    ecg ecgVar = (ecg) O2;
                    ecgVar.a.H(ecgVar.m, "updateItemsList", ecg.b(arrayList3), new Object[0]);
                    qdc qdcVar = ecgVar.e;
                    x0 x0Var = (x0) qdcVar.c;
                    if (x0Var != null) {
                        y7g.Y(false, (qdc) x0Var.c);
                        ArrayList arrayList4 = (ArrayList) x0Var.d;
                        if (!arrayList4.isEmpty() && !arrayList3.isEmpty()) {
                            int indexOf = arrayList4.indexOf(CollectionsKt.Q(arrayList3));
                            if (indexOf != -1) {
                                x0Var.b += indexOf;
                                arrayList4.clear();
                                arrayList4.addAll(arrayList3);
                            } else {
                                int lastIndexOf = arrayList4.lastIndexOf(CollectionsKt.Y(arrayList3));
                                if (lastIndexOf != -1) {
                                    int size2 = x0Var.b - ((arrayList3.size() - lastIndexOf) - 1);
                                    x0Var.b = size2;
                                    if (size2 >= 0) {
                                        arrayList4.clear();
                                        arrayList4.addAll(arrayList3);
                                    }
                                } else {
                                    int indexOf2 = arrayList3.indexOf(CollectionsKt.Q(arrayList4));
                                    if (indexOf2 != -1) {
                                        int i4 = x0Var.b - indexOf2;
                                        x0Var.b = i4;
                                        if (i4 >= 0) {
                                            arrayList4.clear();
                                            arrayList4.addAll(arrayList3);
                                        }
                                    }
                                }
                            }
                            a aVar = ecgVar.b;
                            y7g.Y(false, aVar.c);
                            ArrayList arrayList5 = aVar.h;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList3);
                            xbuVar = ecgVar.c;
                            ArrayList arrayList6 = xbuVar.k;
                            arrayList6.clear();
                            arrayList6.addAll(arrayList3);
                            LinkedHashMap linkedHashMap = xbuVar.m;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                if (arrayList3.contains((imh) entry.getKey())) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            xbuVar.m = new LinkedHashMap(linkedHashMap2);
                            if (xbuVar.r) {
                                xbuVar.c(false);
                            }
                            yjjVar = ecgVar.l;
                            synchronized (yjjVar.a) {
                                u0 = CollectionsKt.u0(yjjVar.a);
                            }
                            Iterator it2 = u0.iterator();
                            while (it2.hasNext()) {
                                gag gagVar = (gag) it2.next();
                                xdr xdrVar3 = gagVar.c;
                                do {
                                    value = xdrVar3.getValue();
                                } while (!xdrVar3.k(value, eag.a((eag) value, arrayList3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070)));
                                gagVar.b();
                            }
                        }
                    }
                    qdcVar.c = new x0(arrayList3, (qdc) qdcVar.b);
                    a aVar2 = ecgVar.b;
                    y7g.Y(false, aVar2.c);
                    ArrayList arrayList52 = aVar2.h;
                    arrayList52.clear();
                    arrayList52.addAll(arrayList3);
                    xbuVar = ecgVar.c;
                    ArrayList arrayList62 = xbuVar.k;
                    arrayList62.clear();
                    arrayList62.addAll(arrayList3);
                    LinkedHashMap linkedHashMap3 = xbuVar.m;
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                    while (r7.hasNext()) {
                    }
                    xbuVar.m = new LinkedHashMap(linkedHashMap22);
                    if (xbuVar.r) {
                    }
                    yjjVar = ecgVar.l;
                    synchronized (yjjVar.a) {
                    }
                }
                xsq xsqVar2 = (xsq) CollectionsKt.S(list2, 0);
                if (xsqVar2 != null && (ak2Var = xsqVar2.c) != null) {
                    yj2 yj2Var2 = ak2Var instanceof yj2 ? (yj2) ak2Var : null;
                    if (yj2Var2 != null && (imhVar = (imh) yj2Var2.k.getValue()) != null && (O = ((nnd) x3nVar.a).O()) != null) {
                        ((ecg) O).h(t75.c(imhVar));
                    }
                }
                x26 x26Var = this.l.s;
                List list4 = ((ptq) this.m.a).b;
                x26Var.getClass();
                list4.getClass();
                xdr xdrVar4 = x26Var.a;
                int size3 = list4.size();
                ArrayList arrayList7 = new ArrayList(size3);
                for (int i5 = 0; i5 < size3; i5++) {
                    arrayList7.add(new kd6(((xsq) list4.get(i5)).a, false));
                }
                xdrVar4.getClass();
                xdrVar4.m(null, arrayList7);
                return Unit.a;
        }
    }
}
