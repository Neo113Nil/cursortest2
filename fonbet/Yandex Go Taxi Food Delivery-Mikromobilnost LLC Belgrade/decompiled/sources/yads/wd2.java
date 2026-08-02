package yads;

import defpackage.sls;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class wd2 extends Lambda implements sls {
    public static final wd2 w = new wd2();

    public wd2() {
        super(0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Object obj;
        Iterator<E> it = vd2.d.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list = ((vd2) obj).b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        Class.forName((String) it2.next());
                        break loop0;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return (vd2) obj;
    }
}
