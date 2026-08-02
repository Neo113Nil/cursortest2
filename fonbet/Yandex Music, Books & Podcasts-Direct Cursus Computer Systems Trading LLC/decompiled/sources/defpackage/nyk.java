package defpackage;

import java.io.Serializable;
import java.util.Objects;
import ru.yandex.music.common.media.context.PlaybackContextName;

/* loaded from: classes5.dex */
public final class nyk implements Serializable {
    public static final nyk d = new nyk(PlaybackContextName.UNKNOWN, null, null);
    private static final long serialVersionUID = 1;
    public final PlaybackContextName a;
    public final String b;
    public final String c;

    public nyk(PlaybackContextName playbackContextName, String str, String str2) {
        this.a = playbackContextName;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyk)) {
            return false;
        }
        nyk nykVar = (nyk) obj;
        if (this.a == nykVar.a && Objects.equals(this.b, nykVar.b)) {
            return Objects.equals(this.c, nykVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackContextInfo{mName=");
        sb.append(this.a);
        sb.append(", mId='");
        sb.append(this.b);
        sb.append("', mDescription='");
        return su4.o(sb, this.c, "'}");
    }
}
