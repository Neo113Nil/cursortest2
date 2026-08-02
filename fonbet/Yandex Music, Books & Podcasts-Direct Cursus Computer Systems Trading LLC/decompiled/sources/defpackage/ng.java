package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class ng {
    public static final moi a(lg... lgVarArr) {
        ArrayList arrayList = new ArrayList(lgVarArr.length);
        for (lg lgVar : lgVarArr) {
            arrayList.add(new Pair(lgVar.a, lgVar.b));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return new moi(uah.g((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }
}
