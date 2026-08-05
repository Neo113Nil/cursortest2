package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zd0 {
    public final View NCTxEWno;
    public final HashMap qoPGr6Ce = new HashMap();
    public final ArrayList MdtA4re8 = new ArrayList();

    public zd0(View view) {
        this.NCTxEWno = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zd0)) {
            return false;
        }
        zd0 zd0Var = (zd0) obj;
        return this.NCTxEWno == zd0Var.NCTxEWno && this.qoPGr6Ce.equals(zd0Var.qoPGr6Ce);
    }

    public final int hashCode() {
        return this.qoPGr6Ce.hashCode() + (this.NCTxEWno.hashCode() * 31);
    }

    public final String toString() {
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.NCTxEWno + "\n").concat("    values:");
        HashMap hashMap = this.qoPGr6Ce;
        for (String str : hashMap.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
