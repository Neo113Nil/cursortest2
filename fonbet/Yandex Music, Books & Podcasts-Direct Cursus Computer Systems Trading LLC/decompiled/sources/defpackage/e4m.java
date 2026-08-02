package defpackage;

import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class e4m {
    public final StationId a;
    public final o1u b;

    public e4m(StationId stationId, o1u o1uVar) {
        this.a = stationId;
        this.b = o1uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4m)) {
            return false;
        }
        e4m e4mVar = (e4m) obj;
        return this.a.equals(e4mVar.a) && this.b.equals(e4mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistVibeData(stationId=" + this.a + ", uiData=" + this.b + ")";
    }
}
