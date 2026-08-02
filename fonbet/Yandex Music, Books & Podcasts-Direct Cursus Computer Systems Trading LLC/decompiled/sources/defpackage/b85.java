package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public class b85 extends a85 {
    public static ArrayList C(Iterable iterable, Class cls) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
