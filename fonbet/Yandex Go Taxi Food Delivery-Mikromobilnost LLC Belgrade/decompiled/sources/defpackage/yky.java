package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.linkcard.network.model.LinkCardStatusResponse$LinkCardStatus;

@gsq0
/* loaded from: classes6.dex */
public final class yky {
    public static final vky Companion = new vky();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new vix(29))};
    public final LinkCardStatusResponse$LinkCardStatus a;

    public /* synthetic */ yky(int i, LinkCardStatusResponse$LinkCardStatus linkCardStatusResponse$LinkCardStatus) {
        if (1 == (i & 1)) {
            this.a = linkCardStatusResponse$LinkCardStatus;
        } else {
            qje.Z(i, 1, uky.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yky) && this.a == ((yky) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LinkCardStatusResponse(status=" + this.a + Extension.C_BRAKE;
    }
}
