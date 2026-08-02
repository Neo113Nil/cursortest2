package defpackage;

import com.yandex.music.shared.wave.domain.offline.OfflineWaveException;

/* loaded from: classes4.dex */
public final class lxu implements mxu {
    public final OfflineWaveException a;

    public lxu(OfflineWaveException offlineWaveException) {
        this.a = offlineWaveException;
    }

    @Override // defpackage.mxu
    public final Exception a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxu) && this.a.equals(((lxu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Offline(exception=" + this.a + ")";
    }
}
