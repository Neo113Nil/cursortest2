package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eatskit.dto.BleErrorCode;

@gsq0
/* loaded from: classes5.dex */
public final class s731 extends a831 {
    public static final r731 Companion = new r731();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(24))};
    public final BleErrorCode b;

    public /* synthetic */ s731(int i, BleErrorCode bleErrorCode) {
        if (1 == (i & 1)) {
            this.b = bleErrorCode;
        } else {
            qje.Z(i, 1, q731.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s731) && this.b == ((s731) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "BleError(code=" + this.b + Extension.C_BRAKE;
    }

    public s731(BleErrorCode bleErrorCode) {
        this.b = bleErrorCode;
    }
}
