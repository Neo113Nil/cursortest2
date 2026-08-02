package defpackage;

import com.yandex.music.shared.wave.domain.offline.OfflineProlongationException;

/* loaded from: classes4.dex */
public final class sxu implements txu {
    public final OfflineProlongationException a;

    public sxu(OfflineProlongationException offlineProlongationException) {
        this.a = offlineProlongationException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxu) && this.a.equals(((sxu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Offline(exception=" + this.a + ")";
    }
}
