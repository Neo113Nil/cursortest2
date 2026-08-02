package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class z60 {
    public static void a(long[] jArr, ArrayList arrayList) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.a aVar = (ImmutableList.a) arrayList.get(i);
            if (aVar != null) {
                aVar.a(new qk51(j, jArr[i]));
            }
        }
    }

    public static int b(joo[] jooVarArr, int i) {
        for (int i2 = 0; i2 < jooVarArr.length; i2++) {
            joo jooVar = jooVarArr[i2];
            if (jooVar != null) {
                xzz0 xzz0Var = jooVar.a;
                if (xzz0Var.a >= 1 && eh20.i(xzz0Var.d[0].n) == i) {
                    return i2;
                }
            }
        }
        return -1;
    }
}
