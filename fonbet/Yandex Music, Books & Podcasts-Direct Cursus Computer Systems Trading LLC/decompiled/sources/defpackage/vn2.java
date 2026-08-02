package defpackage;

import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class vn2 {
    public final czi a;
    public final uuu b;

    public vn2(czi cziVar, uuu uuuVar) {
        this.a = cziVar;
        this.b = uuuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn2)) {
            return false;
        }
        vn2 vn2Var = (vn2) obj;
        return this.a.equals(vn2Var.a) && this.b.equals(vn2Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.informers_slow_network_with_offline_wave_playing_text) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BarAboveStringResources(network=" + this.a + ", wave=" + this.b + ")";
    }
}
