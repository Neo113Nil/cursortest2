package defpackage;

import com.yandex.go.taxi.order.models.api.totw.TotwUpsellResponse;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class w7j {
    public final TotwUpsellResponse a;

    public w7j(TotwUpsellResponse totwUpsellResponse) {
        this.a = totwUpsellResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7j) && this.a.equals(((w7j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Dependencies(upsell=" + this.a + Extension.C_BRAKE;
    }
}
