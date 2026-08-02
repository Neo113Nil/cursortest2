package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class tfa extends aur implements ryc {
    public final /* synthetic */ int j;
    public /* synthetic */ List k;
    public /* synthetic */ List l;
    public /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfa(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = (List) obj;
        List list2 = (List) obj2;
        List list3 = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.j) {
            case 0:
                tfa tfaVar = new tfa(4, 0, continuation);
                tfaVar.k = list;
                tfaVar.l = list2;
                tfaVar.m = list3;
                return tfaVar.invokeSuspend(Unit.a);
            case 1:
                tfa tfaVar2 = new tfa(4, 1, continuation);
                tfaVar2.k = list;
                tfaVar2.l = list2;
                tfaVar2.m = list3;
                return tfaVar2.invokeSuspend(Unit.a);
            default:
                tfa tfaVar3 = new tfa(4, 2, continuation);
                tfaVar3.k = list;
                tfaVar3.l = list2;
                tfaVar3.m = list3;
                return tfaVar3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                List list = this.k;
                List list2 = this.l;
                List list3 = this.m;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (list.isEmpty() && list2.isEmpty() && list3.isEmpty()) {
                    return vfa.a;
                }
                List<mqs> list4 = list;
                ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                for (mqs mqsVar : list4) {
                    arrayList.add(new b2t(oo6.a.a(mqsVar), mqsVar));
                }
                List<cvl> list5 = list2;
                ArrayList arrayList2 = new ArrayList(v75.o(list5, 10));
                for (cvl cvlVar : list5) {
                    cvlVar.getClass();
                    arrayList2.add(new bvl(avf.B(cvlVar), cvlVar));
                }
                List<oq> list6 = list3;
                ArrayList arrayList3 = new ArrayList(v75.o(list6, 10));
                for (oq oqVar : list6) {
                    oqVar.getClass();
                    v1g v1gVar = new v1g(oqVar.b, vz1.w(oqVar.D.a), oqVar.i(), qo6.g);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(k8w.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    arrayList3.add(new nt(oqVar, new x1g(v1gVar, ((m8w) ((k8w) qdcVar.C(I))).a(oqVar))));
                }
                return new wfa(arrayList, arrayList2, arrayList3);
            case 1:
                List list7 = this.k;
                List list8 = this.l;
                List list9 = this.m;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (list7.isEmpty() && list8.isEmpty() && list9.isEmpty()) {
                    return u5h.a;
                }
                List<mqs> list10 = list7;
                ArrayList arrayList4 = new ArrayList(v75.o(list10, 10));
                for (mqs mqsVar2 : list10) {
                    arrayList4.add(new c2t(oo6.a.a(mqsVar2), mqsVar2));
                }
                List<cvl> list11 = list8;
                ArrayList arrayList5 = new ArrayList(v75.o(list11, 10));
                for (cvl cvlVar2 : list11) {
                    cvlVar2.getClass();
                    arrayList5.add(new bvl(avf.B(cvlVar2), cvlVar2));
                }
                List<oq> list12 = list9;
                ArrayList arrayList6 = new ArrayList(v75.o(list12, 10));
                for (oq oqVar2 : list12) {
                    oqVar2.getClass();
                    v1g v1gVar2 = new v1g(oqVar2.b, vz1.w(oqVar2.D.a), oqVar2.i(), qo6.g);
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(k8w.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    arrayList6.add(new ot(oqVar2, new x1g(v1gVar2, ((m8w) ((k8w) qdcVar2.C(I2))).a(oqVar2))));
                }
                return new w5h(arrayList4, arrayList5, arrayList6);
            default:
                List list13 = this.k;
                List list14 = this.l;
                List list15 = this.m;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return CollectionsKt.o0(CollectionsKt.g0(CollectionsKt.g0(list13, list14), list15), new ehf(13));
        }
    }
}
