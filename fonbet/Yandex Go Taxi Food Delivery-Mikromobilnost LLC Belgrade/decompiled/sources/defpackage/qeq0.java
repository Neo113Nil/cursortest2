package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.a;
import ru.yandex.taxi.locationsdk.core.input_controller.internal.b;
import ru.yandex.taxi.locationsdk.core.priority.InputSourcePriority$Active;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

/* loaded from: classes9.dex */
public final class qeq0 implements wbz {
    public final b a;
    public final peq0 b;
    public final TimestampSelector c;

    public qeq0(b bVar, peq0 peq0Var, TimestampSelector timestampSelector) {
        this.a = bVar;
        this.b = peq0Var;
        this.c = timestampSelector;
    }

    @Override // defpackage.wbz
    public final k7z a() {
        Collection values = this.a.b(this.b.a).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (c((k7z) obj)) {
                arrayList.add(obj);
            }
        }
        return (k7z) a.f0(arrayList, new uez0(this.c));
    }

    @Override // defpackage.wbz
    public final tpr b() {
        peq0 peq0Var = this.b;
        boolean z = peq0Var.b;
        b bVar = this.a;
        return new g92(9, new ha2(17, z ? bVar.d(d(), peq0Var.a) : bVar.c(d()), this));
    }

    public final boolean c(k7z k7zVar) {
        return this.b.a.contains(new q6z(qke.q(k7zVar)));
    }

    public final tpr d() {
        LinkedHashSet linkedHashSet = this.b.a;
        InputSourcePriority$Active inputSourcePriority$Active = InputSourcePriority$Active.Normal;
        int d = gw00.d(tcc.n(linkedHashSet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Pair pair = new Pair(new q6z(((q6z) it.next()).a), inputSourcePriority$Active);
            linkedHashMap.put(pair.c(), pair.f());
        }
        return new g92(2, linkedHashMap);
    }
}
