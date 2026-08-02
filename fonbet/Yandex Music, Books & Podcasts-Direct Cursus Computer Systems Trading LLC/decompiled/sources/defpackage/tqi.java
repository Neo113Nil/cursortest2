package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class tqi {
    public static final String a;

    static {
        String str;
        css[] values = css.values();
        ArrayList arrayList = new ArrayList();
        for (css cssVar : values) {
            if (cssVar.b()) {
                arrayList.add(cssVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            css cssVar2 = (css) it.next();
            cssVar2.getClass();
            int ordinal = cssVar2.ordinal();
            if (ordinal == 0) {
                str = "Temp";
            } else if (ordinal == 1) {
                str = "Auto";
            } else if (ordinal == 2) {
                str = "Smart";
            } else if (ordinal == 3) {
                str = "Strong";
            } else {
                if (ordinal != 4) {
                    b6e.s();
                    return;
                }
                str = "Weak";
            }
            arrayList2.add(str);
        }
        a = hlr.d("\nSELECT\n  track_id,\n  MAX(cache_type IN (" + CollectionsKt.X(arrayList2, null, null, null, new coi(1), 31) + ")) AS is_permanent\nFROM\n  tracks_cache\nGROUP BY\n  track_id\n");
    }
}
