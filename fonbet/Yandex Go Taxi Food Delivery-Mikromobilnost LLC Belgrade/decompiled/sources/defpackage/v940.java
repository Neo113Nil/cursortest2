package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.trains.checkout.model.ModalButtonResultType;

/* loaded from: classes6.dex */
public final class v940 implements w940 {
    public final ModalButtonResultType a;

    public v940(ModalButtonResultType modalButtonResultType) {
        this.a = modalButtonResultType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v940) && this.a == ((v940) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnButtonClick(mtTrainActionPopupButtonAction=" + this.a + Extension.C_BRAKE;
    }
}
