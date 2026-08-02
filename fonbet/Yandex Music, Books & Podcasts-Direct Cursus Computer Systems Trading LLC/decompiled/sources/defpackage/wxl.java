package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class wxl implements xxl {
    public final nyl a;
    public final ArrayList b;
    public final StationId c;
    public final int d;

    public wxl(nyl nylVar, ArrayList arrayList, StationId stationId) {
        stationId.getClass();
        this.a = nylVar;
        this.b = arrayList;
        this.c = stationId;
        this.d = arrayList.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxl)) {
            return false;
        }
        wxl wxlVar = (wxl) obj;
        return this.a.equals(wxlVar.a) && this.b.equals(wxlVar.b) && Intrinsics.d(this.c, wxlVar.c);
    }

    @Override // defpackage.xxl
    public final int getCount() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + dfi.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SimpleBlock(playlistInfo=" + this.a + ", tracksUi=" + this.b + ", stationId=" + this.c + ")";
    }
}
