package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class bb0 extends h9 implements ml {
    public final int VgvYg0wo;

    public bb0(int i, g9 g9Var) {
        super(g9Var);
        this.VgvYg0wo = i;
    }

    @Override // defpackage.ml
    public final int NCTxEWno() {
        return this.VgvYg0wo;
    }

    @Override // defpackage.h9
    public final String toString() {
        if (this.NCTxEWno != null) {
            return super.toString();
        }
        m20.qoPGr6Ce.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
