package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class e40 {
    public ArrayList NCTxEWno;
    public th0 qoPGr6Ce;

    public static long NCTxEWno(ac acVar, long j) {
        th0 th0Var = acVar.wxUZMvaN;
        ArrayList arrayList = acVar.k3x7lurq;
        if (th0Var instanceof hm) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            yb ybVar = (yb) arrayList.get(i);
            if (ybVar instanceof ac) {
                ac acVar2 = (ac) ybVar;
                if (acVar2.wxUZMvaN != th0Var) {
                    j2 = Math.max(j2, NCTxEWno(acVar2, acVar2.P7K7Inc8 + j));
                }
            }
        }
        ac acVar3 = th0Var.Qr9iLBAD;
        ac acVar4 = th0Var.jb9XjC4I;
        if (acVar != acVar3) {
            return j2;
        }
        long eVhOlqcC = th0Var.eVhOlqcC() + j;
        return Math.max(Math.max(j2, NCTxEWno(acVar4, eVhOlqcC)), eVhOlqcC - acVar4.P7K7Inc8);
    }

    public static long qoPGr6Ce(ac acVar, long j) {
        th0 th0Var = acVar.wxUZMvaN;
        ArrayList arrayList = acVar.k3x7lurq;
        if (th0Var instanceof hm) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            yb ybVar = (yb) arrayList.get(i);
            if (ybVar instanceof ac) {
                ac acVar2 = (ac) ybVar;
                if (acVar2.wxUZMvaN != th0Var) {
                    j2 = Math.min(j2, qoPGr6Ce(acVar2, acVar2.P7K7Inc8 + j));
                }
            }
        }
        ac acVar3 = th0Var.jb9XjC4I;
        ac acVar4 = th0Var.Qr9iLBAD;
        if (acVar != acVar3) {
            return j2;
        }
        long eVhOlqcC = j - th0Var.eVhOlqcC();
        return Math.min(Math.min(j2, qoPGr6Ce(acVar4, eVhOlqcC)), eVhOlqcC - acVar4.P7K7Inc8);
    }
}
