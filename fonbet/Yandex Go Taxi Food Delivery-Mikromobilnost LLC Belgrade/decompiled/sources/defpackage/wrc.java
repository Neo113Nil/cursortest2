package defpackage;

import androidx.media3.common.PlaybackException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wrc implements zrc {
    public final Throwable a;

    public wrc(PlaybackException playbackException) {
        this.a = playbackException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrc) && jl40.l(this.a, ((wrc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("Error(error=", Extension.C_BRAKE, this.a);
    }
}
