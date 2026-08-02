package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.ButtonType;

/* loaded from: classes5.dex */
public final class y47 {
    public final r0 a;
    public final gci0 b;

    public y47() {
        r0 c = bvf0.c(b.f());
        this.a = c;
        this.b = e.d(c);
    }

    public final void a(List list, boolean z) {
        r0 r0Var = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) r0Var.getValue());
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Pair((ButtonType) it.next(), Boolean.valueOf(z)));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        linkedHashMap.putAll(b.i((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        r0Var.getClass();
        r0Var.m(null, linkedHashMap);
    }
}
