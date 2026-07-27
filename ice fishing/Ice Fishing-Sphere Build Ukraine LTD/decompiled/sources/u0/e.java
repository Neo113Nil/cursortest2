package u0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends o.g {
    public static List B(Object... objArr) {
        if (objArr.length <= 0) {
            return l.f3006e;
        }
        List asList = Arrays.asList(objArr);
        E0.i.d(asList, "asList(...)");
        return asList;
    }
}
