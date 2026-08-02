package defpackage;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class q1m {
    public final ueo a;
    public final xq b = new xq(20);

    public q1m(ueo ueoVar) {
        this.a = ueoVar;
    }

    public static j2m a(cko ckoVar) {
        int o = s7g.o(ckoVar, "_id");
        int o2 = s7g.o(ckoVar, "playlist_id");
        int o3 = s7g.o(ckoVar, "track_id");
        int o4 = s7g.o(ckoVar, "album_id");
        int o5 = s7g.o(ckoVar, "timestamp");
        int o6 = s7g.o(ckoVar, "position");
        long j = o == -1 ? 0L : ckoVar.getLong(o);
        long j2 = o2 != -1 ? ckoVar.getLong(o2) : 0L;
        if (o3 == -1) {
            xq0.q("Missing column 'track_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x0 = ckoVar.x0(o3);
        if (o4 == -1) {
            xq0.q("Missing column 'album_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x02 = ckoVar.x0(o4);
        if (o5 != -1) {
            return new j2m(j, j2, x0, x02, ckoVar.x0(o5), o6 == -1 ? 0 : (int) ckoVar.getLong(o6));
        }
        xq0.q("Missing column 'timestamp' for a NON-NULL value, column not found in result.");
        return null;
    }

    public final Object b(long j, cg6 cg6Var) {
        Object G = up6.G(this.a, false, true, new fn1(j, 11), cg6Var);
        return G == nm6.a ? G : Unit.a;
    }

    public final Object c(long j, List list, aur aurVar) {
        StringBuilder k = dfi.k("DELETE FROM playlist_track WHERE track_id IN (");
        int size = list.size();
        swf.x(size, k);
        k.append(") AND playlist_id = ");
        k.append("?");
        return up6.G(this.a, false, true, new p1m(k.toString(), list, size, j), aurVar);
    }
}
