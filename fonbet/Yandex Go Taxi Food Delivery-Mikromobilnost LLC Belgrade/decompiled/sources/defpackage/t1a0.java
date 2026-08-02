package defpackage;

import com.ybsdk.feature.qr.payments.api.data.TryToRefreshEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class t1a0 implements w1a0 {
    public final TryToRefreshEntity a;

    public t1a0(TryToRefreshEntity tryToRefreshEntity) {
        this.a = tryToRefreshEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1a0) && this.a.equals(((t1a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Refresh(refresh=" + this.a + Extension.C_BRAKE;
    }
}
