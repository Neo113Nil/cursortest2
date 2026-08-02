package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import ru.yandex.taxi.contacts.SelectedFrom;

/* loaded from: classes6.dex */
public final class sv70 implements rv70 {
    public final ysg a;

    public sv70(ysg ysgVar) {
        this.a = ysgVar;
    }

    @Override // defpackage.dgq0
    public final List e() {
        ysg ysgVar = this.a;
        ysgVar.getClass();
        u1l u1lVar = new u1l(2, new ArrayList(ysgVar.d().c.values()));
        int d = gw00.d(tcc.n(u1lVar, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = u1lVar.iterator();
        while (true) {
            ListIterator listIterator = ((t2k0) it).a;
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            linkedHashMap.put(((pv70) previous).b(), previous);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new bgq0(((pv70) entry.getValue()).c(), ((pv70) entry.getValue()).d(), SelectedFrom.LAST_CONTACTS, 8));
        }
        return arrayList;
    }

    @Override // defpackage.dgq0
    public final void x(String str) {
        ysg ysgVar = this.a;
        synchronized (ysgVar) {
            ysgVar.d().c.remove(str);
            ysgVar.b();
        }
    }
}
