package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class zj {
    public static final yj qoPGr6Ce = yj.qoPGr6Ce;

    public static final void MdtA4re8(li liVar, String str) {
        str.getClass();
        NCTxEWno(new uj(liVar, "Attempting to reuse fragment " + liVar + " with previous ID " + str));
        qoPGr6Ce(liVar).getClass();
    }

    public static void NCTxEWno(uj ujVar) {
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(ujVar.NCTxEWno.getClass().getName()), ujVar);
        }
    }

    public static yj qoPGr6Ce(li liVar) {
        while (liVar != null) {
            if (liVar.I5GHvsYW != null && liVar.ow5vqvCr) {
                liVar.ow5vqvCr();
            }
            liVar = liVar.FySoLYna;
        }
        return qoPGr6Ce;
    }
}
