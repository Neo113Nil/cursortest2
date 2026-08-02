package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import com.yandex.go.tariffcard.ui.model.SectionSeparatorMarginType;
import defpackage.bix0;
import defpackage.d3u;
import defpackage.dms;
import defpackage.eij0;
import defpackage.f6v;
import defpackage.fnx0;
import defpackage.kix0;
import defpackage.lix0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pmx0;
import defpackage.r3q0;
import defpackage.tcc;
import defpackage.tw60;
import defpackage.ub60;
import defpackage.vu30;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00022\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002H\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lfnx0;", "tariffSelection", "Lf6v;", "Lufx0;", "", "Lkij0;", "soloItems", "Lhmx0;", "Ld3u;", "groupedRequirementsIdentifiable", "Lpmx0;", "tariffRuleData", "Luhx0;", "<anonymous>", "(Lfnx0;Lf6v;Lf6v;Lf6v;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.holder.OldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1", f = "OldTariffCardRequirementsDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1 extends SuspendLambda implements dms {
    final /* synthetic */ tw60 $this_with;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1(tw60 tw60Var, Continuation continuation) {
        super(5, continuation);
        this.$this_with = tw60Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        OldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1 oldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1 = new OldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1(this.$this_with, (Continuation) obj5);
        oldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1.L$0 = (fnx0) obj;
        oldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1.L$1 = (f6v) obj2;
        oldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1.L$2 = (f6v) obj3;
        oldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1.L$3 = (f6v) obj4;
        return oldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        f6v f6vVar = (f6v) this.L$1;
        f6v f6vVar2 = (f6v) this.L$2;
        f6v f6vVar3 = (f6v) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$this_with.g.e(fnx0Var);
        new lix0();
        r3q0 a = this.$this_with.b.a(SectionSeparatorMarginType.NONE);
        kix0 kix0Var = new kix0((List) f6vVar.b, new vu30(13));
        ArrayList arrayList = ((d3u) f6vVar2.b).b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new kix0((List) it.next(), new vu30(14)));
        }
        pmx0 pmx0Var = (pmx0) f6vVar3.b;
        String str = pmx0Var != null ? pmx0Var.a : null;
        if (str == null || str.length() == 0) {
            str = null;
        }
        Object eij0Var = str != null ? new eij0(str) : a;
        pmx0 pmx0Var2 = (pmx0) f6vVar3.b;
        kix0 kix0Var2 = new kix0(pmx0Var2 != null ? pmx0Var2.b : EmptyList.a, new vu30(15));
        bix0 bix0Var = new bix0();
        bix0 bix0Var2 = new bix0();
        LinkedHashSet linkedHashSet = bix0Var2.b;
        LinkedHashSet linkedHashSet2 = bix0Var.b;
        linkedHashSet.addAll(linkedHashSet2);
        bix0Var2.a(kix0Var, null);
        ArrayList arrayList3 = bix0Var2.a;
        boolean isEmpty = arrayList3.isEmpty();
        ArrayList arrayList4 = bix0Var.c;
        ArrayList arrayList5 = bix0Var.a;
        if (!isEmpty) {
            arrayList5.add(a);
            arrayList5.addAll(arrayList3);
            arrayList4.addAll(bix0Var2.c);
            bix0Var.c(arrayList3);
        }
        bix0Var.b(arrayList2, new ub60(5, a));
        bix0 bix0Var3 = new bix0();
        bix0Var3.b.addAll(linkedHashSet2);
        bix0Var3.a(kix0Var2, null);
        ArrayList arrayList6 = bix0Var3.a;
        if (!arrayList6.isEmpty()) {
            arrayList5.add(eij0Var);
            arrayList5.addAll(arrayList6);
            arrayList4.addAll(bix0Var3.c);
            bix0Var.c(arrayList6);
        }
        return arrayList5;
    }
}
