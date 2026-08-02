package defpackage;

import java.util.Collections;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class yyw extends mwc0 {
    public final boolean a;

    public yyw(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yyw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return zkb1.b(Collections.singletonList(Boolean.valueOf(this.a)), Collections.singletonList(Boolean.valueOf(((yyw) obj).a)));
    }

    public final int hashCode() {
        return Collections.singletonList(Boolean.valueOf(this.a)).hashCode();
    }

    public final String toString() {
        return nzs.b("IsPlayingStateEvent(isPlaying=", Extension.C_BRAKE, this.a);
    }
}
