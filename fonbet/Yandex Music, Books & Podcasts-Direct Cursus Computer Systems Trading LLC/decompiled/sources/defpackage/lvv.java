package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class lvv {
    public final kvv a(rj6 rj6Var) {
        rj6Var.getClass();
        if (!(rj6Var instanceof qj6)) {
            if (!(rj6Var instanceof pj6)) {
                b6e.s();
                return null;
            }
            IntRange m = yhn.m(0, 3);
            ArrayList arrayList = new ArrayList(v75.o(m, 10));
            ype it = m.iterator();
            while (it.c) {
                arrayList.add((Integer) it.next());
            }
            return new hvv(arrayList);
        }
        Object obj = ((qj6) rj6Var).a;
        juv juvVar = (juv) obj;
        String str = juvVar.a;
        String str2 = juvVar.b;
        IntRange m2 = yhn.m(0, 3);
        ArrayList arrayList2 = new ArrayList(v75.o(m2, 10));
        ype it2 = m2.iterator();
        while (it2.c) {
            u51 u51Var = (u51) CollectionsKt.S(((juv) obj).d, ((Integer) it2.next()).intValue());
            u9b u9bVar = u51Var != null ? u51Var.c : null;
            arrayList2.add(u9bVar == null ? suv.a : new ruv(u9bVar.e(wct.s(), WebPath$Storage.AVATARS)));
        }
        return new jvv(str, str2, arrayList2);
    }

    public final ivv b() {
        IntRange m = yhn.m(0, 3);
        ArrayList arrayList = new ArrayList(v75.o(m, 10));
        ype it = m.iterator();
        while (it.c) {
            Integer num = (Integer) it.next();
            num.getClass();
            arrayList.add(num);
        }
        return new ivv(arrayList);
    }
}
