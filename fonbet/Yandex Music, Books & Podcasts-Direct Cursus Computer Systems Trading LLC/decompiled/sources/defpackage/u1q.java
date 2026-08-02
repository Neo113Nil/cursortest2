package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class u1q implements z3q, d2q {
    public final dgr a;
    public final qhd b;
    public final v1q c;
    public final String d;

    public u1q(dgr dgrVar, qhd qhdVar) {
        qhdVar.getClass();
        this.a = dgrVar;
        this.b = qhdVar;
        StationId stationId = dgrVar.a;
        stationId.getClass();
        List list = dgrVar.b;
        list.getClass();
        this.c = new v1q(stationId, list, qhdVar.e);
        String str = dgrVar.c;
        str.getClass();
        this.d = str;
    }

    @Override // defpackage.z3q
    public final qhd e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1q)) {
            return false;
        }
        u1q u1qVar = (u1q) obj;
        return this.a.equals(u1qVar.a) && Intrinsics.d(this.b, u1qVar.b);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SharedGlagolRadioEntity(station=" + this.a + ", preview=" + this.b + ")";
    }

    @Override // defpackage.z3q, defpackage.u3q
    public final g1q getId() {
        return this.c;
    }
}
