package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class ty implements uy {
    public final StationId a;
    public final o1u b;

    public ty(StationId stationId, o1u o1uVar) {
        stationId.getClass();
        this.a = stationId;
        this.b = o1uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty)) {
            return false;
        }
        ty tyVar = (ty) obj;
        return Intrinsics.d(this.a, tyVar.a) && this.b.equals(tyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VibeButton(stationId=" + this.a + ", vibeButtonData=" + this.b + ")";
    }
}
