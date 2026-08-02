package defpackage;

import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class nzl implements ozl {
    public final StationId a;
    public final o1u b;

    public nzl(StationId stationId, o1u o1uVar) {
        this.a = stationId;
        this.b = o1uVar;
    }

    @Override // defpackage.ozl
    public final thj b(int i) {
        return bfg.k(this.a, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzl)) {
            return false;
        }
        nzl nzlVar = (nzl) obj;
        return this.a.equals(nzlVar.a) && this.b.equals(nzlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VibeWrapper(stationId=" + this.a + ", vibeUiData=" + this.b + ")";
    }
}
