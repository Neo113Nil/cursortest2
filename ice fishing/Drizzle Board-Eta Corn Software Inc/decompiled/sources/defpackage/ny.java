package defpackage;

import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ny {
    public final n6 NCTxEWno = new n6(2);
    public final v30 qoPGr6Ce;

    public ny(v30 v30Var) {
        this.qoPGr6Ce = v30Var;
    }

    public final Object qoPGr6Ce(List list, h9 h9Var) {
        StringBuilder sb = new StringBuilder("SELECT * FROM pairings WHERE id IN (");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("?");
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return fn.gjV1z5T1(h9Var, new cm(sb.toString(), 6, list), this.qoPGr6Ce, true, false);
    }
}
