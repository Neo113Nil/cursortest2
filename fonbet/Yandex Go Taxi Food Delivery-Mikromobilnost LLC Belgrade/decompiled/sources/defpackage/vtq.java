package defpackage;

import com.yandex.go.taxi.order.feedback.domain.b;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.provider.FeedbackProvider$special$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.u;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;

/* loaded from: classes14.dex */
public final class vtq {
    public final dm21 a;
    public final FeedbackStrategy b;
    public final a3y0 c = new a3y0(TaxiOrderLogGroup.FEEDBACK.getTag(), "FeedbackProvider");

    public vtq(hit hitVar, u uVar, dm21 dm21Var, FeedbackStrategy feedbackStrategy) {
        this.a = dm21Var;
        this.b = feedbackStrategy;
        tje.N(hitVar.a, null, null, new FeedbackProvider$special$$inlined$safeCollectIn$1(uVar.a(), null, this), 3);
    }

    public final void a(String str) {
        b bVar = (b) this.a;
        isq isqVar = new isq(str, bVar.b(str));
        isqVar.c = EmptyList.a;
        isqVar.e = wrq.f;
        isqVar.j = 0;
        bVar.c(new ksq(isqVar), false);
    }
}
