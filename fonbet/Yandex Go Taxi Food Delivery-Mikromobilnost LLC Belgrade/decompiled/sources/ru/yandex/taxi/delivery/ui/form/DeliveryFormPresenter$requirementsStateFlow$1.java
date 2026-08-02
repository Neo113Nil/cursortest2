package ru.yandex.taxi.delivery.ui.form;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.b580;
import defpackage.bpi;
import defpackage.d6z;
import defpackage.dzg0;
import defpackage.e95;
import defpackage.ejj0;
import defpackage.fli;
import defpackage.fmw0;
import defpackage.g7v;
import defpackage.hgi;
import defpackage.i7v;
import defpackage.io;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.k7x0;
import defpackage.kbi;
import defpackage.kmw0;
import defpackage.lmw0;
import defpackage.m7x0;
import defpackage.mq;
import defpackage.mvg;
import defpackage.mzg0;
import defpackage.n3a;
import defpackage.nvi;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pwh;
import defpackage.qai;
import defpackage.qqo;
import defpackage.rf70;
import defpackage.rmi;
import defpackage.s1i;
import defpackage.sc3;
import defpackage.scc;
import defpackage.smi;
import defpackage.sq;
import defpackage.vmi;
import defpackage.vq;
import defpackage.vsi;
import defpackage.w511;
import defpackage.wax0;
import defpackage.wiq0;
import defpackage.wth;
import defpackage.x8;
import defpackage.yga0;
import defpackage.zlj0;
import defpackage.zls;
import defpackage.zmi;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lhgi;", "selectedRequirements", "Lnvi;", ClidProvider.STATE, "Lsmi;", "<anonymous>", "(Ljava/util/List;Lnvi;)Lsmi;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$requirementsStateFlow$1", f = "DeliveryFormPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$requirementsStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFormPresenter$requirementsStateFlow$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryFormPresenter$requirementsStateFlow$1 deliveryFormPresenter$requirementsStateFlow$1 = new DeliveryFormPresenter$requirementsStateFlow$1(this.this$0, (Continuation) obj3);
        deliveryFormPresenter$requirementsStateFlow$1.L$0 = (List) obj;
        deliveryFormPresenter$requirementsStateFlow$1.L$1 = (nvi) obj2;
        return deliveryFormPresenter$requirementsStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0340  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [zlj0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r8v14, types: [yga0] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r9v12, types: [lr] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        char c;
        zlj0 zlj0Var;
        zlj0 rmiVar;
        String str;
        k7x0 k7x0Var;
        wiq0 wiq0Var;
        int i;
        char c2;
        rmi rmiVar2;
        Collection collection;
        pex0 m;
        ?? r4;
        ?? r8;
        String str2;
        g7v g7vVar;
        Object obj3;
        Object obj4;
        String label;
        String description;
        boolean z;
        lmw0 lmw0Var;
        Object obj5;
        List list = (List) this.L$0;
        nvi nviVar = (nvi) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zmi zmiVar = this.this$0.L;
        s1i s1iVar = nviVar != null ? nviVar.n : null;
        boolean z2 = nviVar != null ? nviVar.d : false;
        n3a n3aVar = zmiVar.e;
        k7x0 k7x0Var2 = zmiVar.h;
        wiq0 wiq0Var2 = zmiVar.g;
        qqo qqoVar = zmiVar.d.a;
        boolean z3 = ((vmi) qqoVar.b()).b;
        Collection collection2 = EmptyList.a;
        Iterator it = (z3 ? ((vmi) qqoVar.b()).c : collection2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            List list2 = ((wax0) obj2).a;
            pex0 m2 = ((k) wiq0Var2).m();
            if (kotlin.collections.a.G(list2, m2 != null ? m2.b : null)) {
                break;
            }
        }
        wax0 wax0Var = (wax0) obj2;
        Collection collection3 = wax0Var != null ? wax0Var.b : null;
        if (collection3 == null) {
            collection3 = collection2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj6 : collection3) {
            if (obj6 instanceof sc3) {
                arrayList.add(obj6);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sc3 sc3Var = (sc3) it2.next();
            pex0 m3 = ((k) wiq0Var2).m();
            if (m3 != null) {
                String str3 = sc3Var.a;
                Iterator it3 = m3.f().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it3.next();
                    if (jl40.l(((lmw0) obj5).getName(), str3)) {
                        break;
                    }
                }
                if (!(obj5 instanceof lmw0)) {
                    obj5 = null;
                }
                lmw0Var = (lmw0) obj5;
            } else {
                lmw0Var = null;
            }
            if (lmw0Var != null) {
                arrayList2.add(lmw0Var);
            }
        }
        int size = arrayList2.size();
        if (size == 1) {
            lmw0 lmw0Var2 = (lmw0) arrayList2.get(0);
            if (lmw0Var2 instanceof fmw0) {
                fmw0 fmw0Var = (fmw0) lmw0Var2;
                String str4 = fmw0Var.a;
                List list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        if (jl40.l(((hgi) it4.next()).a, str4)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                c = 0;
                rmiVar = new pwh(new e95(fmw0Var.b, fmw0Var.c, new sq(str4, !z), new g7v(mzg0.ic_delivery_express_door_to_door), zmiVar.c.a(str4), null), z);
            } else {
                c = 0;
                if (lmw0Var2 instanceof jmw0) {
                    jmw0 jmw0Var = (jmw0) lmw0Var2;
                    kbi kbiVar = zmiVar.f;
                    Iterator it5 = ((x8) zmiVar.b).d.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it5.next();
                        if (jl40.l(((b580) obj3).a, jmw0Var.getName())) {
                            break;
                        }
                    }
                    b580 b580Var = (b580) obj3;
                    rf70 b = b580Var != null ? b580Var.b() : null;
                    ArrayList arrayList3 = jmw0Var.s().c;
                    ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = listIterator.previous();
                        if (jl40.l(((ejj0) obj4).l, b)) {
                            break;
                        }
                    }
                    ejj0 ejj0Var = (ejj0) obj4;
                    String a = ejj0Var == null ? kbiVar.a(jmw0Var.getName(), null) : kbiVar.a(jmw0Var.getName(), ejj0Var.a);
                    i7v i7vVar = (a == null || a.length() == 0) ? null : new i7v(((m7x0) k7x0Var2).a(a));
                    if (ejj0Var == null || (label = ejj0Var.b) == null) {
                        label = jmw0Var.getLabel();
                    }
                    String str5 = label;
                    if (ejj0Var == null || (description = ejj0Var.c) == null) {
                        description = jmw0Var.getDescription();
                    }
                    rmiVar = new rmi(new e95(str5, description, new vq(new bpi(kbiVar.c(jmw0Var.getName()), kbiVar.b(jmw0Var.getName()), jmw0Var.getName(), true)), i7vVar, null, new g7v(dzg0.chevron_next)));
                } else {
                    if (!(lmw0Var2 instanceof kmw0)) {
                        w511.b();
                        return null;
                    }
                    rmiVar = null;
                }
            }
        } else {
            c = 0;
            if (size >= 2) {
                boolean isEmpty = list.isEmpty();
                vsi vsiVar = zmiVar.a;
                String str6 = isEmpty ? vsiVar.c.a : vsiVar.c.b;
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(((lmw0) it6.next()).getName());
                }
                rmiVar = new rmi(new e95(str6, d6z.j(kotlin.collections.a.X(arrayList4, Extension.FIX_SPACE, null, null, new wth(29), 30)), io.e, null, null, new g7v(mzg0.ic_delivery_options)));
            } else {
                zlj0Var = null;
                if (s1iVar == null) {
                    qai qaiVar = s1iVar.b;
                    char c3 = (s1iVar.a == null || z2) ? c : (char) 1;
                    String str7 = qaiVar.a;
                    String str8 = qaiVar.b;
                    String str9 = qaiVar.c;
                    String str10 = qaiVar.d;
                    g7v g7vVar2 = new g7v(mzg0.ic_delivery_info_outline);
                    if (c3 != 0) {
                        str = null;
                        g7vVar = new g7v(dzg0.chevron_next);
                    } else {
                        str = null;
                        g7vVar = null;
                    }
                    k7x0Var = k7x0Var2;
                    wiq0Var = wiq0Var2;
                    ?? r9 = c3 != 0 ? io.c : str;
                    i = 2;
                    c2 = 1;
                    rmiVar2 = new rmi(new e95(str7, str8, r9, g7vVar2, str9, str10, g7vVar, z2, "DeliveryDetailsCard.DetailedPricingInfoButton.Shown"));
                } else {
                    str = null;
                    k7x0Var = k7x0Var2;
                    wiq0Var = wiq0Var2;
                    i = 2;
                    c2 = 1;
                    rmiVar2 = null;
                }
                if (n3aVar.d().getB()) {
                    collection2 = n3aVar.d().g;
                }
                collection = collection2;
                k kVar = (k) wiq0Var;
                m = kVar.m();
                if (kotlin.collections.a.G(collection, m == null ? m.b : str)) {
                    if (n3aVar.d().getB()) {
                        String Y = d6z.Y(n3aVar.d(), n3aVar.d().d);
                        String str11 = n3aVar.d().e;
                        r8 = new yga0(Y, str11 != null ? d6z.Y(n3aVar.d(), str11) : str, n3aVar.d().f);
                    } else {
                        r8 = str;
                    }
                    if (r8 != 0) {
                        String str12 = r8.a;
                        String str13 = r8.b;
                        i7v i7vVar2 = new i7v(((m7x0) k7x0Var).a(r8.c));
                        g7v g7vVar3 = new g7v(dzg0.chevron_next);
                        pex0 m4 = kVar.m();
                        if (m4 == null || (str2 = m4.b) == null) {
                            str2 = "";
                        }
                        r4 = new fli(new e95(str12, str13, new mq(str2), i7vVar2, null, g7vVar3));
                        if (r4 == 0) {
                            return new smi(scc.h(rmiVar2), zlj0Var);
                        }
                        zlj0[] zlj0VarArr = new zlj0[i];
                        zlj0VarArr[c] = zlj0Var;
                        zlj0VarArr[c2] = rmiVar2;
                        return new smi(j73.A(zlj0VarArr), r4);
                    }
                }
                r4 = str;
                if (r4 == 0) {
                }
            }
        }
        zlj0Var = rmiVar;
        if (s1iVar == null) {
        }
        if (n3aVar.d().getB()) {
        }
        collection = collection2;
        k kVar2 = (k) wiq0Var;
        m = kVar2.m();
        if (kotlin.collections.a.G(collection, m == null ? m.b : str)) {
        }
        r4 = str;
        if (r4 == 0) {
        }
    }
}
