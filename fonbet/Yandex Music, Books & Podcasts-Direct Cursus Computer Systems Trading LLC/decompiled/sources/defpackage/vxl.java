package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class vxl implements xxl {
    public final nyl a;
    public final ndc b;
    public final ArrayList c;
    public final StationId d;
    public final int e;

    public vxl(nyl nylVar, ndc ndcVar, ArrayList arrayList, StationId stationId) {
        ndcVar.getClass();
        stationId.getClass();
        this.a = nylVar;
        this.b = ndcVar;
        this.c = arrayList;
        this.d = stationId;
        this.e = arrayList.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxl)) {
            return false;
        }
        vxl vxlVar = (vxl) obj;
        return this.a.equals(vxlVar.a) && Intrinsics.d(this.b, vxlVar.b) && this.c.equals(vxlVar.c) && Intrinsics.d(this.d, vxlVar.d);
    }

    @Override // defpackage.xxl
    public final int getCount() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + dfi.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "FilterBlock(playlistInfo=" + this.a + ", filterUiState=" + this.b + ", tracksUi=" + this.c + ", stationId=" + this.d + ")";
    }
}
