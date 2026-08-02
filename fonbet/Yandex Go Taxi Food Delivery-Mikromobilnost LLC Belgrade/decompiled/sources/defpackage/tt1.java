package defpackage;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.taxi.order.feedback.domain.model.TitleShownStrategy;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$FeedbackBadgeType;
import com.yandex.go.zone.dto.objects.FeedbackRatingMapping;
import com.yandex.go.zone.dto.objects.h2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.order.view.FeedbackMvpView;

/* loaded from: classes8.dex */
public final class tt1 implements FeedbackStrategy {
    public static final tt1 a = new tt1();

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final boolean H5(isq isqVar) {
        return isqVar.e.a(isqVar.j);
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final List I6(isq isqVar) {
        Object obj;
        List<String> b = isqVar.e.b(isqVar.j);
        ArrayList arrayList = new ArrayList();
        for (String str : b) {
            Iterator it = isqVar.e.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(str, ((r8i0) obj).c())) {
                    break;
                }
            }
            r8i0 r8i0Var = (r8i0) obj;
            if (r8i0Var != null) {
                arrayList.add(r8i0Var);
            }
        }
        return arrayList;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final FeedbackDto J1(FeedbackDto feedbackDto, ksq ksqVar) {
        List c = ksqVar.c.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (((r8i0) obj).a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r8i0) it.next()).c());
        }
        return feedbackDto.b(new FeedbackChoices((List) null, (List) null, (Map) null, (List) null, 31).f(arrayList2));
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final boolean N2(isq isqVar, TaxiOrder taxiOrder, ksq ksqVar) {
        q6c0 q6c0Var = new q6c0(21, taxiOrder.V().A.b, taxiOrder.V().A.c, taxiOrder.V().A.a);
        List J = q6c0Var.J();
        wrq wrqVar = ksqVar.c;
        List c = wrqVar.c();
        if (J.size() == c.size()) {
            List list = c;
            int d = gw00.d(tcc.n(list, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (Object obj : list) {
                linkedHashMap.put(((r8i0) obj).c(), obj);
            }
            Iterator it = J.iterator();
            while (true) {
                if (!it.hasNext()) {
                    for (FeedbackRatingMapping feedbackRatingMapping : q6c0Var.K()) {
                        if (!feedbackRatingMapping.equals(wrqVar.h(feedbackRatingMapping.getE()))) {
                        }
                    }
                    return false;
                }
                h2 h2Var = (h2) it.next();
                r8i0 r8i0Var = (r8i0) linkedHashMap.get(h2Var.getA());
                if (!jl40.l(r8i0Var != null ? r8i0Var.b() : null, h2Var.getB())) {
                    break;
                }
            }
        }
        List c2 = wrqVar.c();
        int d2 = gw00.d(tcc.n(c2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
        for (Object obj2 : c2) {
            linkedHashMap2.put(((r8i0) obj2).c(), obj2);
        }
        wrq wrqVar2 = wrq.f;
        isqVar.e = vrq.a(q6c0Var, new eo1(3, linkedHashMap2));
        return true;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final FeedbackStrategy.FeedbackType getRatingType() {
        return FeedbackStrategy.FeedbackType.ALL_RATING;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final t8i0 qd(isq isqVar, String str) {
        String f = isqVar.e.f(isqVar.j);
        TitleShownStrategy g = isqVar.e.g(isqVar.j);
        String e = isqVar.e.e(isqVar.j);
        boolean i = isqVar.e.i(isqVar.j);
        String d = isqVar.e.d(isqVar.j);
        return new t8i0(f, g, e, i, d == null ? str : d);
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final FeedbackMvpView.RatingReasonsState w2(isq isqVar) {
        FeedbackRatingMapping h = isqVar.e.h(isqVar.j);
        FeedbackBadgeChoice$FeedbackBadgeType b = h != null ? h.getB() : null;
        if (uga1.e(isqVar.j) || b == null) {
            return FeedbackMvpView.RatingReasonsState.NO_RATING_REASONS;
        }
        int i = st1.a[b.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? FeedbackMvpView.RatingReasonsState.NO_RATING_REASONS : FeedbackMvpView.RatingReasonsState.TEXT_RATING_REASONS : FeedbackMvpView.RatingReasonsState.TAG_RATING_REASONS : FeedbackMvpView.RatingReasonsState.ACHIEVEMENT_ICON_RATING_REASONS;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final void xe(FeedbackParam.a aVar, ksq ksqVar) {
        List b = ksqVar.c.b(ksqVar.i);
        List c = ksqVar.c.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            r8i0 r8i0Var = (r8i0) obj;
            if (r8i0Var.a() && b.contains(r8i0Var.c())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r8i0) it.next()).c());
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        aVar.f = aVar.f.f(arrayList2);
    }
}
