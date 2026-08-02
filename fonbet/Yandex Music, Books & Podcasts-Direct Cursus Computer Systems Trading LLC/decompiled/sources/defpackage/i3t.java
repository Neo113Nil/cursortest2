package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class i3t {
    public final ueo a;
    public final xq b = new xq(27);

    public i3t(ueo ueoVar) {
        this.a = ueoVar;
    }

    public final void a(List list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM tracks_cache WHERE track_id IN (");
        swf.x(list.size(), sb);
        sb.append(")");
        up6.F(this.a, false, true, new i20(sb.toString(), list, 8));
    }

    public final List b(List list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tracks_cache WHERE track_id IN (");
        swf.x(list.size(), sb);
        sb.append(")");
        return (List) up6.F(this.a, true, false, new i20(sb.toString(), list, 7));
    }
}
