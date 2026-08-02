package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eatskit.dto.SdkErrorCode;

@gsq0
/* loaded from: classes5.dex */
public final class w731 extends a831 {
    public static final v731 Companion = new v731();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(25))};
    public final SdkErrorCode b;

    public /* synthetic */ w731(int i, SdkErrorCode sdkErrorCode) {
        if (1 == (i & 1)) {
            this.b = sdkErrorCode;
        } else {
            qje.Z(i, 1, u731.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w731) && this.b == ((w731) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SdkError(code=" + this.b + Extension.C_BRAKE;
    }

    public w731(SdkErrorCode sdkErrorCode) {
        this.b = sdkErrorCode;
    }
}
