package defpackage;

import com.yandex.mapkit.geometry.Polyline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class zlm {
    public final d0l0 a;
    public final List b;
    public final boolean c;

    public zlm(d0l0 d0l0Var, List list, boolean z) {
        this.a = d0l0Var;
        this.b = list;
        this.c = z;
    }

    public final Polyline a() {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ylm) obj).a) {
                break;
            }
        }
        ylm ylmVar = (ylm) obj;
        if (ylmVar != null) {
            return ylmVar.a();
        }
        return null;
    }

    public final ArrayList b() {
        return new ArrayList(this.b);
    }
}
