package defpackage;

import com.yandex.delivery.mapper.model.CancelType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xv7 extends cw7 {
    public final CancelType a;

    public xv7(CancelType cancelType) {
        this.a = cancelType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xv7) && this.a == ((xv7) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CancelMessageActionContinueOrderCancellation(cancelType=" + this.a + Extension.C_BRAKE;
    }
}
