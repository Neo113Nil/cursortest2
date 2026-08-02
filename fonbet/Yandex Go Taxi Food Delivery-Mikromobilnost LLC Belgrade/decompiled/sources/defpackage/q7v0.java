package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes5.dex */
public final class q7v0 {
    public final PointType a;

    public q7v0(PointType pointType) {
        this.a = pointType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7v0) && this.a == ((q7v0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuggestPayload(pointType=" + this.a + Extension.C_BRAKE;
    }
}
