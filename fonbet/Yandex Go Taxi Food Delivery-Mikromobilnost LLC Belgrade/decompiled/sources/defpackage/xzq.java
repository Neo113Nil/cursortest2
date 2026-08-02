package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class xzq {
    public static final int b = wwg0.msg_ic_file_blank;
    public static final int c = wwg0.msg_ic_file_audio;
    public final Map a;

    public xzq() {
        Map map = yzq.a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Pair(((String) it.next()).toLowerCase(Locale.ROOT), Integer.valueOf(intValue)));
            }
            ycc.r(arrayList2, arrayList);
        }
        this.a = b.s(arrayList);
    }

    public final Integer a(String str) {
        return (Integer) this.a.get(str != null ? str.toLowerCase(Locale.ROOT) : null);
    }
}
