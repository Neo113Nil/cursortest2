package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lyn11;", "", "Companion", "pn11", "sn11", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class yn11 {
    public static final sn11 Companion = new sn11();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new gn11(3))};
    public final List a;

    public /* synthetic */ yn11(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final bds0 a(Class cls) {
        mn11 mn11Var;
        Object obj;
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                mn11 mn11Var2 = (mn11) obj;
                if (mn11Var2 != null && cls.isInstance(mn11Var2.a)) {
                    break;
                }
            }
            mn11Var = (mn11) obj;
        } else {
            mn11Var = null;
        }
        if (mn11Var != null) {
            return (bds0) cls.cast(mn11Var.a);
        }
        return null;
    }

    public yn11() {
        this.a = EmptyList.a;
    }
}
