package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.surge.models.domain.PriceComplainFeedback$FeedbackActionButtonsContent$Orientation;

/* loaded from: classes6.dex */
public final class qye0 {
    public final PriceComplainFeedback$FeedbackActionButtonsContent$Orientation a;
    public final ArrayList b;

    public qye0(PriceComplainFeedback$FeedbackActionButtonsContent$Orientation priceComplainFeedback$FeedbackActionButtonsContent$Orientation, ArrayList arrayList) {
        this.a = priceComplainFeedback$FeedbackActionButtonsContent$Orientation;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qye0)) {
            return false;
        }
        qye0 qye0Var = (qye0) obj;
        return this.a == qye0Var.a && this.b.equals(qye0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackActionButtonsContent(orientation=" + this.a + ", buttons=" + this.b + Extension.C_BRAKE;
    }
}
