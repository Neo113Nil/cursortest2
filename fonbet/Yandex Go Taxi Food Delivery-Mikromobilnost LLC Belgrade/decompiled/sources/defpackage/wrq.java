package defpackage;

import com.yandex.go.taxi.order.feedback.domain.model.TitleShownStrategy;
import com.yandex.go.zone.dto.objects.FeedbackRatingMapping;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class wrq {
    public static final wrq f;
    public final List a;
    public final List b;
    public final Map c;
    public final String d;
    public final LinkedHashMap e;

    static {
        Map f2 = b.f();
        EmptyList emptyList = EmptyList.a;
        f = new wrq("", emptyList, emptyList, f2);
    }

    public wrq(String str, List list, List list2, Map map) {
        this.a = list;
        this.b = list2;
        this.c = map;
        this.d = str;
        List list3 = list2;
        int d = gw00.d(tcc.n(list3, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : list3) {
            linkedHashMap.put(Integer.valueOf(((FeedbackRatingMapping) obj).e), obj);
        }
        this.e = linkedHashMap;
    }

    public final boolean a(int i) {
        FeedbackRatingMapping.LayoutOptions layoutOptions;
        FeedbackRatingMapping h = h(i);
        if (h == null || (layoutOptions = h.f) == null) {
            return true;
        }
        return layoutOptions.d;
    }

    public final List b(int i) {
        FeedbackRatingMapping h = h(i);
        if (h == null) {
            return EmptyList.a;
        }
        List list = h.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.c.get((String) obj) == h.b) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List c() {
        return this.a;
    }

    public final String d(int i) {
        FeedbackRatingMapping h = h(i);
        if (h != null) {
            return h.d;
        }
        return null;
    }

    public final String e(int i) {
        FeedbackRatingMapping h;
        FeedbackRatingMapping.LayoutOptions layoutOptions;
        return (!uga1.e(i) && ((h = h(i)) == null || (layoutOptions = h.f) == null || !layoutOptions.a)) ? "" : this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrq)) {
            return false;
        }
        wrq wrqVar = (wrq) obj;
        return this.a.equals(wrqVar.a) && jl40.l(this.b, wrqVar.b) && this.c.equals(wrqVar.c) && jl40.l(this.d, wrqVar.d);
    }

    public final String f(int i) {
        String str;
        FeedbackRatingMapping h = h(i);
        return (h == null || (str = h.c) == null) ? "" : str;
    }

    public final TitleShownStrategy g(int i) {
        FeedbackRatingMapping.LayoutOptions layoutOptions;
        if (uga1.e(i)) {
            return TitleShownStrategy.HIDDEN;
        }
        FeedbackRatingMapping h = h(i);
        return (h == null || (layoutOptions = h.f) == null || !layoutOptions.c) ? TitleShownStrategy.ABOVE_COMMENT : TitleShownStrategy.ABOVE_REASONS;
    }

    public final FeedbackRatingMapping h(int i) {
        return (FeedbackRatingMapping) this.e.get(Integer.valueOf(i));
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.d(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final boolean i(int i) {
        FeedbackRatingMapping.LayoutOptions layoutOptions;
        if (uga1.e(i)) {
            return false;
        }
        FeedbackRatingMapping h = h(i);
        if (h == null || (layoutOptions = h.f) == null) {
            return true;
        }
        return layoutOptions.b;
    }

    public final String toString() {
        StringBuilder v = qv10.v("FeedbackBadgesPresentationModel(feedbackBadges=", this.a, ", feedbackRatingMappings=", this.b, ", badgesTypes=");
        v.append(this.c);
        v.append(", textHint=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
