package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class km implements rg0 {
    public static final re wxUZMvaN = new re(23);
    public final wkPeYiwH MdtA4re8;
    public final rg0 NCTxEWno;
    public final go qoPGr6Ce;

    public km(go goVar, rg0 rg0Var, mcXgUFR8 mcxgufr8) {
        this.qoPGr6Ce = goVar;
        this.NCTxEWno = rg0Var;
        this.MdtA4re8 = new wkPeYiwH(1, mcxgufr8);
    }

    @Override // defpackage.rg0
    public final ng0 NCTxEWno(Class cls, mt mtVar) {
        return this.qoPGr6Ce.containsKey(cls) ? this.MdtA4re8.NCTxEWno(cls, mtVar) : this.NCTxEWno.NCTxEWno(cls, mtVar);
    }

    @Override // defpackage.rg0
    public final ng0 qoPGr6Ce(Class cls) {
        if (!this.qoPGr6Ce.containsKey(cls)) {
            return this.NCTxEWno.qoPGr6Ce(cls);
        }
        m1.b2ZJblxo("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }
}
