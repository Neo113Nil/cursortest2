package defpackage;

import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class wm0 extends ym0 {
    public final SbpChallengeInfo a;

    public wm0(SbpChallengeInfo sbpChallengeInfo) {
        this.a = sbpChallengeInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm0) && this.a.equals(((wm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SHOW_CHALLENGE(challengeInfo=" + this.a + Extension.C_BRAKE;
    }
}
