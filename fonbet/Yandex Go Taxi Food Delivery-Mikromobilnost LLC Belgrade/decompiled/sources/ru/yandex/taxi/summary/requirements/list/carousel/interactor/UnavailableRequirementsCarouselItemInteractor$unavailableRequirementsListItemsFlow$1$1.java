package ru.yandex.taxi.summary.requirements.list.carousel.interactor;

import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.apj0;
import defpackage.bdj0;
import defpackage.bms;
import defpackage.bpj0;
import defpackage.cdj0;
import defpackage.cjj0;
import defpackage.ejj0;
import defpackage.fnx0;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.lmw0;
import defpackage.m7x0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qw11;
import defpackage.tcc;
import defpackage.vfx0;
import defpackage.vg70;
import defpackage.vvb1;
import defpackage.ycc;
import defpackage.za31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00000\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lb580;", DownloadService.KEY_REQUIREMENTS, "Lru/yandex/taxi/requirements/models/net/experiment/c;", "exp", "", "carouselRequirements", "Lf6v;", "Lhmx0;", "Lapj0;", "<anonymous>", "(Ljava/util/List;Lru/yandex/taxi/requirements/models/net/experiment/c;Ljava/util/List;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.carousel.interactor.UnavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1", f = "UnavailableRequirementsCarouselItemInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class UnavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1 extends SuspendLambda implements bms {
    final /* synthetic */ fnx0 $tariffSelection;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ qw11 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1(qw11 qw11Var, fnx0 fnx0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = qw11Var;
        this.$tariffSelection = fnx0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        UnavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1 unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1 = new UnavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1(this.this$0, this.$tariffSelection, (Continuation) obj4);
        unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.L$0 = (List) obj;
        unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.L$1 = (ru.yandex.taxi.requirements.models.net.experiment.c) obj2;
        unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.L$2 = (List) obj3;
        return unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bdj0 c;
        Iterable iterable;
        List list;
        qw11 qw11Var;
        lmw0 lmw0Var;
        Object obj2;
        mi31 mi31Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        String label;
        String str;
        String a;
        Object obj3;
        ?? r14;
        boolean z;
        vg70 s;
        UnavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1 unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1 = this;
        vvb1 vvb1Var = vvb1.N;
        List list2 = (List) unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.L$0;
        ru.yandex.taxi.requirements.models.net.experiment.c cVar = (ru.yandex.taxi.requirements.models.net.experiment.c) unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.L$1;
        List list3 = (List) unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        cjj0 cjj0Var = unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.this$0.g;
        fnx0 fnx0Var = unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.$tariffSelection;
        c = cjj0Var.c(fnx0Var.c, fnx0Var.d, list2, cVar, cdj0.a);
        List list4 = c.b;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list4) {
            if (list3.contains(((Pair) obj4).c())) {
                arrayList3.add(obj4);
            }
        }
        qw11 qw11Var2 = unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.this$0;
        mi31 mi31Var2 = unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1.$tariffSelection.a;
        qw11Var2.getClass();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str2 = (String) pair.getFirst();
            List list5 = (List) pair.getSecond();
            bpj0 bpj0Var = qw11Var2.f;
            List list6 = ((k) qw11Var2.a).j().a;
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                ycc.r(((za31) it2.next()).b, arrayList5);
            }
            ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(((mi31) it3.next()).a);
            }
            Iterator it4 = arrayList6.iterator();
            while (true) {
                boolean hasNext = it4.hasNext();
                iterable = EmptyList.a;
                list = list5;
                if (!hasNext) {
                    qw11Var = qw11Var2;
                    lmw0Var = null;
                    break;
                }
                Iterator it5 = ((pex0) it4.next()).c.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        qw11Var = qw11Var2;
                        obj3 = null;
                        break;
                    }
                    obj3 = it5.next();
                    lmw0 lmw0Var2 = (lmw0) obj3;
                    boolean l = jl40.l(lmw0Var2.getName(), str2);
                    jmw0 jmw0Var = lmw0Var2 instanceof jmw0 ? (jmw0) lmw0Var2 : null;
                    if (jmw0Var == null || (s = jmw0Var.s()) == null) {
                        qw11Var = qw11Var2;
                        r14 = 0;
                    } else {
                        ArrayList arrayList7 = s.c;
                        qw11Var = qw11Var2;
                        r14 = new ArrayList(tcc.n(arrayList7, 10));
                        Iterator it6 = arrayList7.iterator();
                        while (it6.hasNext()) {
                            r14.add(((ejj0) it6.next()).a);
                        }
                    }
                    if (r14 == 0) {
                        r14 = iterable;
                    }
                    List list7 = list;
                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                        Iterator it7 = list7.iterator();
                        while (it7.hasNext()) {
                            if (!r14.contains((String) it7.next())) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    if (l && z) {
                        break;
                    }
                    qw11Var2 = qw11Var;
                }
                lmw0Var = (lmw0) obj3;
                if (lmw0Var != null) {
                    break;
                }
                list5 = list;
                qw11Var2 = qw11Var;
            }
            if (lmw0Var == null) {
                mi31Var = mi31Var2;
                arrayList2 = arrayList4;
            } else {
                List list8 = !list.isEmpty() ? list : null;
                Iterator it8 = mi31Var2.a.f().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it8.next();
                    if (jl40.l(((lmw0) obj2).getName(), str2)) {
                        break;
                    }
                }
                lmw0 lmw0Var3 = (lmw0) obj2;
                boolean z2 = lmw0Var3 != null;
                if (list8 == null) {
                    arrayList = arrayList4;
                    mi31Var = mi31Var2;
                    iterable = Collections.singletonList(new apj0(lmw0Var.getName(), lmw0Var.getLabel(), "", bpj0Var.a(lmw0Var), true, null, false, null, vvb1Var, null, null, Boolean.FALSE, null, false));
                } else {
                    mi31Var = mi31Var2;
                    arrayList = arrayList4;
                    if (!z2) {
                        arrayList2 = arrayList;
                        iterable = Collections.singletonList(new apj0(lmw0Var.getName(), lmw0Var.getLabel(), "", bpj0Var.a(lmw0Var), true, null, false, null, vvb1Var, null, null, Boolean.FALSE, list, false));
                    } else if ((lmw0Var3 instanceof jmw0 ? (jmw0) lmw0Var3 : null) != null) {
                        List<String> list9 = list8;
                        ArrayList arrayList8 = new ArrayList(tcc.n(list9, 10));
                        for (String str3 : list9) {
                            jmw0 jmw0Var2 = (jmw0) lmw0Var3;
                            bpj0Var.getClass();
                            ejj0 p = jmw0Var2.p(str3);
                            if (p == null || (label = p.b) == null) {
                                label = jmw0Var2.getLabel();
                            }
                            if (p != null) {
                                String str4 = p.k;
                                if (str4 == null || str4.length() == 0) {
                                    str4 = null;
                                }
                                if (str4 != null) {
                                    str = str3;
                                    a = ((m7x0) bpj0Var.b).a(str4);
                                    ArrayList arrayList9 = arrayList8;
                                    arrayList9.add(new apj0(jmw0Var2.getName(), label, "", bpj0Var.a(jmw0Var2), true, null, false, null, vvb1Var, a, null, Boolean.FALSE, Collections.singletonList(str), false));
                                    arrayList8 = arrayList9;
                                    bpj0Var = bpj0Var;
                                    lmw0Var3 = lmw0Var3;
                                    arrayList = arrayList;
                                }
                            }
                            str = str3;
                            a = null;
                            ArrayList arrayList92 = arrayList8;
                            arrayList92.add(new apj0(jmw0Var2.getName(), label, "", bpj0Var.a(jmw0Var2), true, null, false, null, vvb1Var, a, null, Boolean.FALSE, Collections.singletonList(str), false));
                            arrayList8 = arrayList92;
                            bpj0Var = bpj0Var;
                            lmw0Var3 = lmw0Var3;
                            arrayList = arrayList;
                        }
                        arrayList2 = arrayList;
                        iterable = arrayList8;
                    }
                }
                arrayList2 = arrayList;
            }
            ArrayList arrayList10 = arrayList2;
            ycc.r(iterable, arrayList10);
            arrayList4 = arrayList10;
            mi31Var2 = mi31Var;
            qw11Var2 = qw11Var;
            unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1 = this;
        }
        UnavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1 unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$12 = unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$1;
        vfx0 vfx0Var = unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$12.this$0.d;
        mi31 mi31Var3 = unavailableRequirementsCarouselItemInteractor$unavailableRequirementsListItemsFlow$1$12.$tariffSelection.a;
        vfx0Var.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(arrayList4, vfx0.b(mi31Var3));
    }
}
