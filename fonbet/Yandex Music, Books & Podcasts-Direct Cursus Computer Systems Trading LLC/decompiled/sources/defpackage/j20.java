package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class j20 {
    public final ueo a;
    public final xq b = new xq(2);

    public j20(ueo ueoVar) {
        this.a = ueoVar;
    }

    public static l10 a(cko ckoVar) {
        int o = s7g.o(ckoVar, "album_id");
        int o2 = s7g.o(ckoVar, "album_name");
        int o3 = s7g.o(ckoVar, "track_id");
        int o4 = s7g.o(ckoVar, "vol");
        int o5 = s7g.o(ckoVar, "position");
        if (o == -1) {
            xq0.q("Missing column 'album_id' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x0 = ckoVar.x0(o);
        if (o2 == -1) {
            xq0.q("Missing column 'album_name' for a NON-NULL value, column not found in result.");
            return null;
        }
        String x02 = ckoVar.x0(o2);
        if (o3 != -1) {
            return new l10(x0, o4 == -1 ? 0 : (int) ckoVar.getLong(o4), o5 != -1 ? (int) ckoVar.getLong(o5) : 0, x02, ckoVar.x0(o3));
        }
        xq0.q("Missing column 'track_id' for a NON-NULL value, column not found in result.");
        return null;
    }

    public final Object b(Collection collection, cg6 cg6Var) {
        StringBuilder k = dfi.k("SELECT * FROM album_track WHERE track_id in (");
        swf.x(collection.size(), k);
        k.append(")");
        return up6.G(this.a, true, false, new h20(k.toString(), collection, 0), cg6Var);
    }
}
