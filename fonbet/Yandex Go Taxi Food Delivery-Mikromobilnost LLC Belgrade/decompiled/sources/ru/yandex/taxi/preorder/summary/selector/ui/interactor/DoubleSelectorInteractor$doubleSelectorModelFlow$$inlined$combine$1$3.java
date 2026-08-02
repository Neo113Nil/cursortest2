package ru.yandex.taxi.preorder.summary.selector.ui.interactor;

import defpackage.ag31;
import defpackage.bf31;
import defpackage.c6m;
import defpackage.d6m;
import defpackage.dk31;
import defpackage.dlx0;
import defpackage.eg31;
import defpackage.elx0;
import defpackage.gwk0;
import defpackage.hk31;
import defpackage.ik31;
import defpackage.is60;
import defpackage.jl40;
import defpackage.ke31;
import defpackage.mi31;
import defpackage.mrx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oa31;
import defpackage.pb31;
import defpackage.pex0;
import defpackage.scc;
import defpackage.sgx0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wu1;
import defpackage.za31;
import defpackage.zls;
import defpackage.zxs0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.selector.ui.interactor.DoubleSelectorInteractor$doubleSelectorModelFlow$$inlined$combine$1$3", f = "DoubleSelectorInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class DoubleSelectorInteractor$doubleSelectorModelFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c6m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleSelectorInteractor$doubleSelectorModelFlow$$inlined$combine$1$3(Continuation continuation, c6m c6mVar) {
        super(3, continuation);
        this.this$0 = c6mVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DoubleSelectorInteractor$doubleSelectorModelFlow$$inlined$combine$1$3 doubleSelectorInteractor$doubleSelectorModelFlow$$inlined$combine$1$3 = new DoubleSelectorInteractor$doubleSelectorModelFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        doubleSelectorInteractor$doubleSelectorModelFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        doubleSelectorInteractor$doubleSelectorModelFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return doubleSelectorInteractor$doubleSelectorModelFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x02dc A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        List list;
        pex0 pex0Var;
        int i;
        d6m d6mVar;
        String str;
        pex0 pex0Var2;
        pb31 pb31Var;
        boolean z;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            Map map = (Map) obj3;
            ik31 ik31Var = (ik31) obj2;
            eg31 eg31Var = (eg31) this.this$0.d.get();
            zxs0 zxs0Var = eg31Var.a;
            boolean z2 = ik31Var.d;
            dk31 dk31Var = ik31Var.a;
            if (!z2) {
                th = null;
                ik31 a = eg31Var.c.a(ik31Var);
                List<za31> list2 = a.a.a;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (za31 za31Var : list2) {
                    oa31 oa31Var = za31Var.a;
                    String str2 = za31Var.d;
                    eg31 eg31Var2 = eg31Var;
                    ArrayList q = zxs0Var.q(eg31Var.b.a(za31Var.b, ik31Var.c, za31Var.c, true, dk31Var.d), str2);
                    boolean z3 = gwk0.v(str2) && jl40.l(a.b.b, str2);
                    mi31 mi31Var = za31Var.c;
                    wu1 wu1Var = (mi31Var == null || (pex0Var = mi31Var.a) == null) ? null : pex0Var.O;
                    dlx0 dlx0Var = new dlx0();
                    ik31 ik31Var2 = a;
                    dlx0Var.d = oa31Var.d;
                    dlx0Var.t = z3;
                    String str3 = oa31Var.a;
                    dlx0Var.b = str3;
                    dlx0Var.c = q;
                    dlx0Var.J = wu1Var;
                    arrayList.add(dlx0Var.a(new sgx0(str3, is60.c)));
                    eg31Var = eg31Var2;
                    a = ik31Var2;
                }
                list = arrayList;
            } else if (dk31Var.a.isEmpty()) {
                list = EmptyList.a;
                th = null;
            } else {
                za31 za31Var2 = (za31) dk31Var.a.get(0);
                mrx0 mrx0Var = eg31Var.b;
                List list3 = za31Var2.b;
                String str4 = za31Var2.d;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((mi31) it.next()).d(str4));
                }
                th = null;
                list = zxs0Var.q(mrx0Var.a(arrayList2, ik31Var.c, ik31Var.b, true, dk31Var.d), str4);
            }
            Iterator it2 = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((elx0) it2.next()).u) {
                    break;
                }
                i3++;
            }
            List list5 = list;
            ArrayList arrayList3 = new ArrayList(tcc.n(list5, 10));
            int i4 = 0;
            for (Object obj7 : list5) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    scc.m();
                    throw th;
                }
                elx0 elx0Var = (elx0) obj7;
                pb31 pb31Var2 = this.this$0.f;
                dk31 dk31Var2 = dk31Var;
                String str5 = elx0Var.a;
                String str6 = elx0Var.f;
                if (i4 == i3) {
                    pb31Var = pb31Var2;
                    z = true;
                } else {
                    pb31Var = pb31Var2;
                    z = false;
                }
                List list6 = list;
                int i6 = i3;
                char c = '\n';
                ArrayList arrayList4 = new ArrayList(tcc.n(list5, 10));
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    elx0 elx0Var2 = (elx0) it3.next();
                    arrayList4.add(new bf31(elx0Var2.a, elx0Var2.f));
                    list5 = list5;
                    it3 = it3;
                    c = '\n';
                }
                arrayList3.add(pb31Var.a(str5, str6, z, map, arrayList4));
                dk31Var = dk31Var2;
                i3 = i6;
                i4 = i5;
                list = list6;
                list5 = list5;
            }
            List list7 = list;
            int i7 = i3;
            hk31 hk31Var = (hk31) this.this$0.e.get();
            List list8 = dk31Var.a;
            hk31Var.getClass();
            List list9 = list8;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj8 : list9) {
                za31 za31Var3 = (za31) obj8;
                List list10 = za31Var3.b;
                if (!za31Var3.a.c() || list10.isEmpty() || list10.size() == 1) {
                    arrayList5.add(obj8);
                }
            }
            if (!arrayList5.isEmpty()) {
                String X = kotlin.collections.a.X(list9, ",", null, null, new ke31(11), 30);
                if (!hk31Var.c.equals(X)) {
                    hk31Var.c = X;
                    ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        za31 za31Var4 = (za31) it4.next();
                        Pair pair = new Pair("vertical_id", za31Var4.a.a);
                        mi31 mi31Var2 = (mi31) kotlin.collections.a.R(za31Var4.b);
                        if (mi31Var2 == null || (pex0Var2 = mi31Var2.a) == null || (str = pex0Var2.b) == null) {
                            str = "";
                        }
                        arrayList6.add(kotlin.collections.b.i(pair, new Pair("tariff_class", str)));
                    }
                    ag31 ag31Var = hk31Var.a;
                    ag31Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("compact_verticals", arrayList6);
                    i = 1;
                    ag31Var.a.a("VerticalSelector.CompactVerticalDetected", hashMap, 1, new HashMap());
                    d6mVar = new d6m(arrayList3, list7, i7, ik31Var.c, booleanValue);
                    Throwable th2 = th;
                    this.L$0 = th2;
                    this.L$1 = th2;
                    this.label = i;
                    if (vprVar.emit(d6mVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            i = 1;
            d6mVar = new d6m(arrayList3, list7, i7, ik31Var.c, booleanValue);
            Throwable th22 = th;
            this.L$0 = th22;
            this.L$1 = th22;
            this.label = i;
            if (vprVar.emit(d6mVar, this) == coroutineSingletons) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
