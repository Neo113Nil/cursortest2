package defpackage;

import com.yandex.media.ynison.service.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class aow {
    public final w a;
    public final List b;
    public final fyu c;
    public final g9p d;

    public aow(w wVar, List list, fyu fyuVar, g9p g9pVar) {
        wVar.getClass();
        list.getClass();
        this.a = wVar;
        this.b = list;
        this.c = fyuVar;
        this.d = g9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aow)) {
            return false;
        }
        aow aowVar = (aow) obj;
        return Intrinsics.d(this.a, aowVar.a) && Intrinsics.d(this.b, aowVar.b) && Intrinsics.d(this.c, aowVar.c) && Intrinsics.d(this.d, aowVar.d);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b);
        fyu fyuVar = this.c;
        int hashCode = (d + (fyuVar == null ? 0 : fyuVar.hashCode())) * 31;
        g9p g9pVar = this.d;
        return hashCode + (g9pVar != null ? g9pVar.hashCode() : 0);
    }

    public final String toString() {
        return "QueueWithPlayables(queue=" + this.a + ", playables=" + this.b + ", waveFixedQueueShuffleState=" + this.c + ", fallbackStationId=" + this.d + ")";
    }

    public /* synthetic */ aow(w wVar, List list, g9p g9pVar, int i) {
        this(wVar, list, (fyu) null, (i & 8) != 0 ? null : g9pVar);
    }
}
