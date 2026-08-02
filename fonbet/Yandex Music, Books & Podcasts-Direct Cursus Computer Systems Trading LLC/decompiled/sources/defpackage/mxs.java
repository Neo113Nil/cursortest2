package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class mxs {
    public final mq a;
    public final fcc b;
    public final oq c;
    public final List d;
    public final yys e;

    public mxs(mq mqVar, fcc fccVar, oq oqVar) {
        int i;
        ArrayList Z = o8g.Z(oqVar, mqVar);
        mqVar.getClass();
        oqVar.getClass();
        this.a = mqVar;
        this.b = fccVar;
        this.c = oqVar;
        this.d = Z;
        String D = q7g.D(oqVar);
        int ordinal = mqVar.ordinal();
        if (ordinal == 0) {
            i = R.string.track_order_old_first;
        } else {
            if (ordinal != 1) {
                b6e.s();
                throw null;
            }
            i = R.string.track_order_new_first;
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.e = new yys(D, ((skr) qdcVar.C(I)).c(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxs)) {
            return false;
        }
        mxs mxsVar = (mxs) obj;
        return this.a == mxsVar.a && Intrinsics.d(this.b, mxsVar.b) && Intrinsics.d(this.c, mxsVar.c) && Intrinsics.d(this.d, mxsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a);
    }

    public final String toString() {
        return "TrackListUiData(trackOrder=" + this.a + ", trackOrderFilterInfo=" + this.b + ", album=" + this.c + ", trackItems=" + this.d + ")";
    }
}
