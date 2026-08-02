package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class urh {
    public static final blp e;
    public static final d8l f;
    public final blp a;
    public final d8l b;
    public final yde c;
    public final yde d;

    static {
        HashSet hashSet = new HashSet();
        qsn qsnVar = alp.d;
        for (int i = 0; i < qsnVar.d; i++) {
            hashSet.add(new alp(((Integer) qsnVar.get(i)).intValue()));
        }
        e = new blp(hashSet);
        HashSet hashSet2 = new HashSet();
        qsn qsnVar2 = alp.e;
        for (int i2 = 0; i2 < qsnVar2.d; i2++) {
            hashSet2.add(new alp(((Integer) qsnVar2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < qsnVar.d; i3++) {
            hashSet2.add(new alp(((Integer) qsnVar.get(i3)).intValue()));
        }
        new blp(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i4 : ozw.d) {
            vq1.A(!false);
            sparseBooleanArray.append(i4, true);
        }
        vq1.A(!false);
        f = new d8l(new xgc(sparseBooleanArray));
    }

    public urh(blp blpVar, d8l d8lVar, yde ydeVar, yde ydeVar2) {
        this.a = blpVar;
        this.b = d8lVar;
        this.c = ydeVar;
        this.d = ydeVar2;
    }
}
