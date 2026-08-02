package defpackage;

import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class swb0 extends uwb0 {
    public final PinTokenEntity a;

    public swb0(PinTokenEntity pinTokenEntity) {
        this.a = pinTokenEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swb0) && this.a.equals(((swb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IssuedPin(tokenEntity=" + this.a + Extension.C_BRAKE;
    }
}
