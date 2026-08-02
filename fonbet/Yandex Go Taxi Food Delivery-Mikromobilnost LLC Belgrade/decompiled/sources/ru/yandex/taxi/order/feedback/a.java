package ru.yandex.taxi.order.feedback;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.taxi.order.feedback.domain.model.TitleShownStrategy;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.zone.dto.objects.FeedbackBadgeChoice$TextChoice;
import defpackage.avj0;
import defpackage.gw00;
import defpackage.isq;
import defpackage.jl40;
import defpackage.ksq;
import defpackage.kyh0;
import defpackage.r8i0;
import defpackage.t8i0;
import defpackage.tcc;
import defpackage.tga1;
import defpackage.uga1;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.order.view.FeedbackMvpView;

/* loaded from: classes9.dex */
public final class a implements FeedbackStrategy {
    public final String a;

    public a(zuj0 zuj0Var) {
        this.a = ((avj0) zuj0Var).h(kyh0.rate_comment_title);
    }

    public static ArrayList h(LinkedHashMap linkedHashMap, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FeedbackBadgeChoice$TextChoice feedbackBadgeChoice$TextChoice = (FeedbackBadgeChoice$TextChoice) it.next();
            r8i0 r8i0Var = (r8i0) linkedHashMap.get(feedbackBadgeChoice$TextChoice.getA());
            boolean z = false;
            if (r8i0Var != null && r8i0Var.a()) {
                z = true;
            }
            arrayList.add(tga1.b(feedbackBadgeChoice$TextChoice.getA(), feedbackBadgeChoice$TextChoice.getB(), z));
        }
        return arrayList;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final boolean H5(isq isqVar) {
        return true;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final List I6(isq isqVar) {
        List list = isqVar.c;
        return list == null ? EmptyList.a : list;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final FeedbackDto J1(FeedbackDto feedbackDto, ksq ksqVar) {
        Iterable iterable = ksqVar.b;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((r8i0) obj).a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r8i0) it.next()).c());
        }
        return feedbackDto.b(new FeedbackChoices((List) null, (List) null, (Map) null, (List) null, 31).e(arrayList2));
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final boolean N2(isq isqVar, TaxiOrder taxiOrder, ksq ksqVar) {
        ArrayList arrayList;
        List list = taxiOrder.V().A.e;
        List list2 = ksqVar.b;
        if (list2 == null) {
            list2 = EmptyList.a;
        }
        List list3 = list2;
        int d = gw00.d(tcc.n(list3, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj : list3) {
            linkedHashMap.put(((r8i0) obj).c(), obj);
        }
        if (list.size() == list2.size()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList = null;
                    break;
                }
                FeedbackBadgeChoice$TextChoice feedbackBadgeChoice$TextChoice = (FeedbackBadgeChoice$TextChoice) it.next();
                r8i0 r8i0Var = (r8i0) linkedHashMap.get(feedbackBadgeChoice$TextChoice.getA());
                if (r8i0Var == null) {
                    arrayList = h(linkedHashMap, list);
                    break;
                }
                if (!jl40.l(r8i0Var.b(), feedbackBadgeChoice$TextChoice.getB())) {
                    arrayList = h(linkedHashMap, list);
                    break;
                }
            }
        } else {
            arrayList = h(linkedHashMap, list);
        }
        if (arrayList == null) {
            return false;
        }
        isqVar.c = arrayList;
        return true;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final FeedbackStrategy.FeedbackType getRatingType() {
        return FeedbackStrategy.FeedbackType.LOW_RATING;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final t8i0 qd(isq isqVar, String str) {
        String d = isqVar.e.d(isqVar.j);
        return new t8i0(this.a, uga1.c(isqVar.j) ? TitleShownStrategy.ABOVE_COMMENT : TitleShownStrategy.HIDDEN, "", !uga1.e(isqVar.j), d == null ? str : d);
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final FeedbackMvpView.RatingReasonsState w2(isq isqVar) {
        return uga1.c(isqVar.j) ? FeedbackMvpView.RatingReasonsState.TEXT_RATING_REASONS : FeedbackMvpView.RatingReasonsState.NO_RATING_REASONS;
    }

    @Override // ru.yandex.taxi.order.feedback.FeedbackStrategy
    public final void xe(FeedbackParam.a aVar, ksq ksqVar) {
        if (uga1.c(ksqVar.i)) {
            Iterable iterable = ksqVar.b;
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (((r8i0) obj).a()) {
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
            aVar.f = aVar.f.e(arrayList2);
        }
    }
}
