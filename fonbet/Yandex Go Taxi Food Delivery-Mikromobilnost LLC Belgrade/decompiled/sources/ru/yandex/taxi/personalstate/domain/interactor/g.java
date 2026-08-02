package ru.yandex.taxi.personalstate.domain.interactor;

import defpackage.j6b0;
import defpackage.j7b0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ptv;
import defpackage.qfo;
import defpackage.tcc;
import defpackage.wfa0;
import defpackage.wma0;
import defpackage.zz90;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class g implements wfa0 {
    public final f a;

    public g(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PaymentPersonalStateInteractorImpl$paymentsExtraInfo$1 paymentPersonalStateInteractorImpl$paymentsExtraInfo$1;
        int i;
        String str2;
        List list;
        j7b0.d dVar;
        Object obj;
        if (continuationImpl instanceof PaymentPersonalStateInteractorImpl$paymentsExtraInfo$1) {
            paymentPersonalStateInteractorImpl$paymentsExtraInfo$1 = (PaymentPersonalStateInteractorImpl$paymentsExtraInfo$1) continuationImpl;
            int i2 = paymentPersonalStateInteractorImpl$paymentsExtraInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentPersonalStateInteractorImpl$paymentsExtraInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentPersonalStateInteractorImpl$paymentsExtraInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentPersonalStateInteractorImpl$paymentsExtraInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    paymentPersonalStateInteractorImpl$paymentsExtraInfo$1.L$0 = str;
                    paymentPersonalStateInteractorImpl$paymentsExtraInfo$1.label = 1;
                    Object a = this.a.a(paymentPersonalStateInteractorImpl$paymentsExtraInfo$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj2 = a;
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) paymentPersonalStateInteractorImpl$paymentsExtraInfo$1.L$0;
                    kotlin.b.b(obj2);
                }
                j6b0 j6b0Var = (j6b0) obj2;
                list = j6b0Var == null ? j6b0Var.f : null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(str2, ((j7b0.d) obj).a)) {
                            break;
                        }
                    }
                    dVar = (j7b0.d) obj;
                }
                dVar = new j7b0.d(0);
                List<j7b0.c> list2 = dVar.b;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (j7b0.c cVar : list2) {
                    String str3 = cVar.a;
                    String str4 = cVar.b;
                    String str5 = cVar.c;
                    String str6 = cVar.d;
                    j7b0.b bVar = cVar.e;
                    ptv ptvVar = bVar != null ? new ptv(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e) : null;
                    j7b0.a aVar = cVar.f;
                    arrayList.add(new zz90(str3, str4, str5, str6, ptvVar, aVar != null ? new qfo(aVar.a, aVar.b, aVar.c) : null));
                }
                return new wma0(arrayList);
            }
        }
        paymentPersonalStateInteractorImpl$paymentsExtraInfo$1 = new PaymentPersonalStateInteractorImpl$paymentsExtraInfo$1(this, continuationImpl);
        Object obj22 = paymentPersonalStateInteractorImpl$paymentsExtraInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentPersonalStateInteractorImpl$paymentsExtraInfo$1.label;
        if (i != 0) {
        }
        j6b0 j6b0Var2 = (j6b0) obj22;
        if (j6b0Var2 == null) {
        }
        if (list != null) {
        }
        dVar = new j7b0.d(0);
        List<j7b0.c> list22 = dVar.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(list22, 10));
        while (r0.hasNext()) {
        }
        return new wma0(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, ContinuationImpl continuationImpl) {
        PaymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1 paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1;
        int i;
        List list;
        Object obj;
        if (continuationImpl instanceof PaymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1) {
            paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1 = (PaymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1) continuationImpl;
            int i2 = paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1.L$0 = str;
                    paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1.label = 1;
                    obj2 = this.a.a(paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1.L$0;
                    kotlin.b.b(obj2);
                }
                j6b0 j6b0Var = (j6b0) obj2;
                list = j6b0Var == null ? j6b0Var.f : null;
                if (list != null) {
                    return EmptyList.a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    Iterator it = ((j7b0.d) obj3).b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((j7b0.c) obj).a, str)) {
                            break;
                        }
                    }
                    if (obj != null) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str2 = ((j7b0.d) it2.next()).a;
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                }
                return arrayList2;
            }
        }
        paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1 = new PaymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1(this, continuationImpl);
        Object obj22 = paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentPersonalStateInteractorImpl$tariffsWithExtraInfoForCard$1.label;
        if (i != 0) {
        }
        j6b0 j6b0Var2 = (j6b0) obj22;
        if (j6b0Var2 == null) {
        }
        if (list != null) {
        }
    }
}
