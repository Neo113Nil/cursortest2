package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class y5 extends ra {
    public static final List HdOGZAzC(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : ra.FySoLYna(list.get(0)) : wf.NCTxEWno;
    }

    public static List N8VPGzVC(Object... objArr) {
        if (objArr.length <= 0) {
            return wf.NCTxEWno;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void ZyZthT5G() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
