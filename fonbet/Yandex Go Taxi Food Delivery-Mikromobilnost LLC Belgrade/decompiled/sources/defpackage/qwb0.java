package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;

/* loaded from: classes7.dex */
public final class qwb0 {
    public final PinInvalidationReason a;
    public final ArrayList b;

    public qwb0(PinInvalidationReason pinInvalidationReason, ArrayList arrayList) {
        this.a = pinInvalidationReason;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwb0)) {
            return false;
        }
        qwb0 qwb0Var = (qwb0) obj;
        return this.a == qwb0Var.a && this.b.equals(qwb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PinInvalidationResult(reason=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }
}
