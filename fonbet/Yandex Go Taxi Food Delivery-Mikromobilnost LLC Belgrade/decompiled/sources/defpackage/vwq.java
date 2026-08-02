package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class vwq implements wwq {
    public final o631 a;
    public final HashMap b = new HashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public vwq(o631 o631Var) {
        this.a = o631Var;
    }

    @Override // defpackage.wwq
    public final void b(String str, u7u0 u7u0Var, String str2, String str3) {
        long j = u7u0Var.a;
        Long l = (Long) this.b.remove(str3);
        if (l != null) {
            long longValue = l.longValue();
            long j2 = u7u0Var.b;
            if (j == 0 || j2 == 0) {
                return;
            }
            String format = String.format("FlexDocumentFetchingTime.%s.TTFB", Arrays.copyOf(new Object[]{str}, 1));
            o631 o631Var = this.a;
            o631Var.a(j - longValue, format);
            long j3 = j2 - longValue;
            o631Var.a(j3, String.format("FlexDocumentFetchingTime.%s.TTLB", Arrays.copyOf(new Object[]{str}, 1)));
            Integer o = qke.o(this.c, str, str2);
            if (o != null) {
                int intValue = o.intValue();
                o631Var.a(j - longValue, String.format("FlexDocumentFetchingTime.%s.TTFB", Arrays.copyOf(new Object[]{str}, 1)) + ".page_" + intValue + "");
                o631Var.a(j3, String.format("FlexDocumentFetchingTime.%s.TTLB", Arrays.copyOf(new Object[]{str}, 1)) + ".page_" + intValue + "");
            }
        }
    }

    @Override // defpackage.wwq, defpackage.uyg
    public final void clearNetworkPageInfo(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c.get(new q690(str));
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    @Override // defpackage.wwq
    public final void e(String str, String str2) {
        this.b.put(str2, Long.valueOf(System.currentTimeMillis()));
    }
}
