package u0;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends o.g {
    public static List D(Object... objArr) {
        if (objArr.length <= 0) {
            return l.f3001f;
        }
        List asList = Arrays.asList(objArr);
        E0.i.d(asList, "asList(...)");
        return asList;
    }
}
