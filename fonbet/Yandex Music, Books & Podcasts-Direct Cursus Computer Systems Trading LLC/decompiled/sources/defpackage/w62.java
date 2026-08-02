package defpackage;

import com.yandex.music.databases.user.UserDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class w62 {
    public final dst a;

    public w62(dst dstVar) {
        this.a = dstVar;
    }

    public static ArrayList c(List list) {
        List<ib2> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (ib2 ib2Var : list2) {
            arrayList.add(new y62(ib2Var.a, new x62(ib2Var.b.a)));
        }
        return arrayList;
    }

    public final hb2 a(String str) {
        return ((UserDatabase) this.a.c(str)).w();
    }

    public final void b(String str, List list) {
        str.getClass();
        list.getClass();
        hb2 a = a(str);
        a.getClass();
        StringBuilder k = dfi.k("DELETE FROM auto_tracks_cache_info WHERE track_id IN (");
        swf.x(list.size(), k);
        k.append(")");
        up6.F(a.a, false, true, new i20(k.toString(), list, 3));
    }
}
