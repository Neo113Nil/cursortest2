package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes5.dex */
public final class p2m {
    public final i5h a = (i5h) l18.b.c(hag.I(i5h.class));

    public static void a(String str, List list) {
        str.getClass();
        list.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(i5h.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        mys R = ((MainDatabase) ((i5h) qdcVar.C(I)).c(str)).R();
        List<hys> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (hys hysVar : list2) {
            Long valueOf = Long.valueOf(hysVar.a);
            Integer valueOf2 = Integer.valueOf(ouj.D(hysVar.b));
            Integer valueOf3 = Integer.valueOf(hysVar.d);
            rr5 rr5Var = hysVar.c;
            String str2 = rr5Var.a;
            String str3 = rr5Var.b;
            Date date = hysVar.e;
            arrayList.add(new jys(null, valueOf, valueOf2, valueOf3, str2, str3, date != null ? Long.valueOf(date.getTime()) : null));
        }
        R.getClass();
        up6.F(R.a, false, true, new lys(R, arrayList, 0));
    }
}
