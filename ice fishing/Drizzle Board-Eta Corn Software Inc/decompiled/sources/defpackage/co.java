package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class co implements ml, Serializable {
    public final int NCTxEWno;

    public co(int i) {
        this.NCTxEWno = i;
    }

    @Override // defpackage.ml
    public final int NCTxEWno() {
        return this.NCTxEWno;
    }

    public final String toString() {
        m20.qoPGr6Ce.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
