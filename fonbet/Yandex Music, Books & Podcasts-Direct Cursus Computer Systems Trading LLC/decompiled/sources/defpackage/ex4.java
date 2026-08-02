package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ex4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ ex4(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = ((zv) obj2).c;
                Map map = this.b;
                return gl5.b((Long) map.get(str), (Long) map.get(((zv) obj).c));
            case 1:
                String str2 = ((rxs) obj2).a.a;
                Map map2 = this.b;
                return gl5.b((Long) map2.get(str2), (Long) map2.get(((rxs) obj).a.a));
            default:
                qwl qwlVar = (qwl) obj2;
                String o = ouj.o(qwlVar.c, StringUtils.PROCESS_POSTFIX_DELIMITER, qwlVar.b);
                Map map3 = this.b;
                qwl qwlVar2 = (qwl) obj;
                return gl5.b((Long) map3.get(o), (Long) map3.get(qwlVar2.c + StringUtils.PROCESS_POSTFIX_DELIMITER + qwlVar2.b));
        }
    }
}
