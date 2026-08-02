package defpackage;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class g7 extends y7 {
    private static final long serialVersionUID = 6588350623831699109L;

    public g7(Map map) {
        o2g.L(map.isEmpty());
        this.d = map;
    }

    @Override // defpackage.f8
    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map d = d();
        this.c = d;
        return d;
    }

    public final boolean h(Double d, Integer num) {
        Collection collection = (Collection) this.d.get(d);
        if (collection != null) {
            if (!collection.add(num)) {
                return false;
            }
            this.e++;
            return true;
        }
        Collection e = e();
        if (!e.add(num)) {
            xq0.w("New Collection violated the Collection spec");
            return false;
        }
        this.e++;
        this.d.put(d, e);
        return true;
    }
}
