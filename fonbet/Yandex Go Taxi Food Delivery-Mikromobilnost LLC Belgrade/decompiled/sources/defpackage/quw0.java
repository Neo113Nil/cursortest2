package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.surge.models.domain.PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle;
import ru.yandex.taxi.surge.models.domain.PriceComplainFeedback$FeedbackActionButtonsContent$Orientation;
import ru.yandex.taxi.surge.models.dto.SurgeInfoItem$ActionButtonsContent;
import ru.yandex.taxi.surge.models.dto.f0;
import ru.yandex.taxi.surge.models.dto.g0;
import ru.yandex.taxi.surge.models.dto.h0;
import ru.yandex.taxi.surge.models.dto.v;
import ru.yandex.taxi.surge.models.dto.x;
import ru.yandex.taxi.surge.models.dto.y;

/* loaded from: classes6.dex */
public final class quw0 {
    public static qye0 a(SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent) {
        PriceComplainFeedback$FeedbackActionButtonsContent$Orientation priceComplainFeedback$FeedbackActionButtonsContent$Orientation;
        low0 low0Var;
        PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle;
        int i = puw0.a[surgeInfoItem$ActionButtonsContent.a.ordinal()];
        if (i == 1) {
            priceComplainFeedback$FeedbackActionButtonsContent$Orientation = PriceComplainFeedback$FeedbackActionButtonsContent$Orientation.VERTICAL;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            priceComplainFeedback$FeedbackActionButtonsContent$Orientation = PriceComplainFeedback$FeedbackActionButtonsContent$Orientation.HORIZONTAL;
        }
        List<SurgeInfoItem$ActionButtonsContent.a> list = surgeInfoItem$ActionButtonsContent.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (SurgeInfoItem$ActionButtonsContent.a aVar : list) {
            h0 h0Var = aVar.c;
            if (h0Var instanceof v) {
                low0Var = new gow0(((v) h0Var).a);
            } else if (h0Var instanceof x) {
                low0Var = new jow0(((x) h0Var).a);
            } else if (jl40.l(h0Var, f0.INSTANCE)) {
                low0Var = kow0.b;
            } else {
                if (!(h0Var instanceof y) && !jl40.l(h0Var, g0.INSTANCE)) {
                    w511.b();
                    return null;
                }
                low0Var = null;
            }
            String str = aVar.a;
            int i2 = puw0.b[aVar.b.ordinal()];
            if (i2 == 1) {
                priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle = PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle.DEFAULT;
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle = PriceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle.ACCENT;
            }
            arrayList.add(new pye0(low0Var, str, priceComplainFeedback$FeedbackActionButtonsContent$ButtonStyle, aVar.d));
        }
        return new qye0(priceComplainFeedback$FeedbackActionButtonsContent$Orientation, arrayList);
    }
}
