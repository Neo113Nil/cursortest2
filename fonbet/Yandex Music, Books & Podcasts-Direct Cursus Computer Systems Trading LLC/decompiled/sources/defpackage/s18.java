package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public abstract class s18 {
    public static final String a = jsg.n("DiagnosticsWrkr");

    public static final String a(l4w l4wVar, z4w z4wVar, jzr jzrVar, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t4w t4wVar = (t4w) it.next();
            a4w A = bzf.A(t4wVar);
            String str = t4wVar.a;
            jzrVar.getClass();
            String str2 = A.a;
            int i = A.b;
            str2.getClass();
            izr izrVar = (izr) up6.F(jzrVar.a, true, false, new x20(str2, i, 7));
            Integer valueOf = izrVar != null ? Integer.valueOf(izrVar.c) : null;
            l4wVar.getClass();
            str.getClass();
            String X = CollectionsKt.X((List) up6.F(l4wVar.a, true, false, new srp(str, 26)), StringUtils.COMMA, null, null, null, 62);
            z4wVar.getClass();
            String X2 = CollectionsKt.X((List) up6.F(z4wVar.a, true, false, new v4w(str, 8)), StringUtils.COMMA, null, null, null, 62);
            StringBuilder u = ouj.u(StringUtil.LF, str, "\t ");
            u.append(t4wVar.c);
            u.append("\t ");
            u.append(valueOf);
            u.append("\t ");
            u.append(t4wVar.b.name());
            u.append("\t ");
            u.append(X);
            u.append("\t ");
            u.append(X2);
            u.append('\t');
            sb.append(u.toString());
        }
        return sb.toString();
    }
}
