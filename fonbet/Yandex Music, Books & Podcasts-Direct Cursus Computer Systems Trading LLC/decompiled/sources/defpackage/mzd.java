package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mzd extends jbp {
    public mzd(onh onhVar, ip3 ip3Var) {
        this(onhVar, ip3Var, new gx0(1));
    }

    public static void h(xzd xzdVar, uzd uzdVar, HashSet hashSet, ArrayList arrayList) {
        String str = xzdVar.a;
        long j = xzdVar.h + uzdVar.e;
        String str2 = uzdVar.g;
        if (str2 != null) {
            Uri N = p1g.N(str, str2);
            if (hashSet.add(N)) {
                arrayList.add(new hbp(j, jbp.c(N)));
            }
        }
        arrayList.add(new hbp(j, new nb7(p1g.N(str, uzdVar.a), uzdVar.i, uzdVar.j)));
    }

    @Override // defpackage.jbp
    public final ArrayList d(jp3 jp3Var, icc iccVar, boolean z) {
        i0e i0eVar = (i0e) iccVar;
        ArrayList arrayList = new ArrayList();
        if (i0eVar instanceof h0e) {
            List list = ((h0e) i0eVar).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(jbp.c((Uri) list.get(i)));
            }
        } else {
            arrayList.add(jbp.c(Uri.parse(i0eVar.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nb7 nb7Var = (nb7) it.next();
            arrayList2.add(new hbp(0L, nb7Var));
            try {
                xzd xzdVar = (xzd) ((icc) b(new fbp(this, jp3Var, nb7Var), z));
                yde ydeVar = xzdVar.r;
                uzd uzdVar = null;
                for (int i2 = 0; i2 < ydeVar.size(); i2++) {
                    uzd uzdVar2 = (uzd) ydeVar.get(i2);
                    uzd uzdVar3 = uzdVar2.b;
                    if (uzdVar3 != null && uzdVar3 != uzdVar) {
                        h(xzdVar, uzdVar3, hashSet, arrayList2);
                        uzdVar = uzdVar3;
                    }
                    h(xzdVar, uzdVar2, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }

    public mzd(onh onhVar, ip3 ip3Var, Executor executor) {
        super(onhVar, new k0e(), ip3Var, executor);
    }
}
