package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.preorder.source.pickup.a;

/* loaded from: classes5.dex */
public final class rpb0 {
    public final a a;

    public rpb0(a aVar) {
        this.a = aVar;
    }

    public final ArrayList a() {
        List b = this.a.o.b();
        ArrayList arrayList = new ArrayList(tcc.n(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(((wpb0) it.next()).b);
        }
        return arrayList;
    }
}
