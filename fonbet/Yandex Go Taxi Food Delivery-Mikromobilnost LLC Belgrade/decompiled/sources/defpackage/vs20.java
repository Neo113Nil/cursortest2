package defpackage;

import com.yandex.xplat.common.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class vs20 {
    public final String a;

    public vs20(int i) {
        this.a = "/";
    }

    public final String a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        String X = a.X(arrayList2, this.a, null, null, null, 62);
        if (X.length() <= 0) {
            return Extension.DOT_CHAR;
        }
        String str = this.a;
        boolean x = cvu0.x(X, str, false);
        boolean s = cvu0.s(X, str, false);
        ArrayList e = c.e(X, str);
        vxd vxdVar = new vxd(this, x);
        Object arrayList3 = new ArrayList();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            arrayList3 = vxdVar.invoke(arrayList3, it.next());
        }
        List list = (List) arrayList3;
        if (list.size() != 0) {
            String X2 = a.X(list, this.a, null, null, null, 62);
            if (s) {
                X2 = X2.concat(str);
            }
            return x ? str.concat(X2) : X2;
        }
        if (x) {
            return str;
        }
        if (!s) {
            str = "";
        }
        return Extension.DOT_CHAR.concat(str);
    }

    public vs20() {
        this(0);
    }
}
