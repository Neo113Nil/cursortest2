package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class qhe implements phe {
    public final LinkedHashMap a;

    public qhe(cot cotVar) {
        ArrayList arrayList = (ArrayList) cotVar.b;
        int d = gw00.d(tcc.n(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bie bieVar = (bie) it.next();
            Pair pair = new Pair(bieVar.a, bieVar.c);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        return (KSerializer) this.a.get(str);
    }
}
