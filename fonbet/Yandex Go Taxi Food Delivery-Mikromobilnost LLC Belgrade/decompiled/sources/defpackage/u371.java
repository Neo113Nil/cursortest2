package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class u371 {
    public static rr41 a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((bs81) obj).a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        return new rr41(12, (List) pair.getSecond(), (List) pair.getFirst());
    }
}
