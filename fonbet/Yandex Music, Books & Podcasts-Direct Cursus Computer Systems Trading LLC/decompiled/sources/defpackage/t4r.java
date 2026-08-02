package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class t4r extends x6t {
    @Override // defpackage.x6t
    public final void n(Object obj) {
        qzc qzcVar = new qzc(2, (byte) 0);
        Iterator it = ((List) obj).iterator();
        if (it.hasNext()) {
            ((ytd) it.next()).getClass();
            throw null;
        }
        on3 on3Var = ytd.a;
        String str = on3Var.c;
        if (str == null) {
            str = new String(on3Var.a, ne4.b);
            on3Var.c = str;
        }
        Locale locale = Locale.US;
        List list = (List) ((wvd) qzcVar.b).remove(str.toLowerCase(locale).toLowerCase(locale));
        ((list == null || list.size() == 0) ? null : (String) list.get(0)).split(StringUtil.SPACE, 2);
        throw null;
    }
}
