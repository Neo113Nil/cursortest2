package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class v1q implements g1q {
    public final StationId a;
    public final List b;
    public final String c;
    public final jyr d;

    public v1q(StationId stationId, List list, String str) {
        stationId.getClass();
        list.getClass();
        this.a = stationId;
        this.b = list;
        this.c = str;
        this.d = btf.b(new oxo(13, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1q)) {
            return false;
        }
        v1q v1qVar = (v1q) obj;
        return Intrinsics.d(this.a, v1qVar.a) && Intrinsics.d(this.b, v1qVar.b) && Intrinsics.d(this.c, v1qVar.c);
    }

    @Override // defpackage.g1q
    public final String getId() {
        return this.a.h();
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharedGlagolRadioId(stationId=");
        sb.append(this.a);
        sb.append(", seedsStrings=");
        sb.append(this.b);
        sb.append(", radioSessionId=");
        return su4.o(sb, this.c, ")");
    }
}
