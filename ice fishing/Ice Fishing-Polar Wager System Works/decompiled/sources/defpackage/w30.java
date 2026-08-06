package defpackage;

/* loaded from: classes.dex */
public final class w30 implements defpackage.zm1 {
    public static final defpackage.ky F7NU4MC0GW = new defpackage.ky(5);
    public final defpackage.fb0 IHQe1A4L2xu;
    public final defpackage.zm1 oh6vYeIP;
    public final defpackage.QuX7t5UZl9 r1MBDhnF;

    public w30(defpackage.fb0 fb0Var, defpackage.zm1 zm1Var, defpackage.F7NU4MC0GW f7nu4mc0gw) {
        this.IHQe1A4L2xu = fb0Var;
        this.oh6vYeIP = zm1Var;
        this.r1MBDhnF = new defpackage.QuX7t5UZl9(1, f7nu4mc0gw);
    }

    @Override // defpackage.zm1
    public final defpackage.vm1 IHQe1A4L2xu(java.lang.Class cls) {
        if (this.IHQe1A4L2xu.containsKey(cls)) {
            throw new java.lang.UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return this.oh6vYeIP.IHQe1A4L2xu(cls);
    }

    @Override // defpackage.zm1
    public final defpackage.vm1 oh6vYeIP(java.lang.Class cls, defpackage.uk0 uk0Var) {
        return this.IHQe1A4L2xu.containsKey(cls) ? this.r1MBDhnF.oh6vYeIP(cls, uk0Var) : this.oh6vYeIP.oh6vYeIP(cls, uk0Var);
    }
}
