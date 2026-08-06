package defpackage;

/* loaded from: classes.dex */
public final class k80 {
    public final java.lang.Object AARZUJiTa;
    public final java.util.concurrent.locks.ReentrantLock F7NU4MC0GW;
    public final com.corsair.ledger.data.local.CorsairDatabase_Impl IHQe1A4L2xu;
    public final defpackage.g adDC3e2L;
    public final defpackage.kj1 oh6vYeIP;
    public final java.util.LinkedHashMap r1MBDhnF;
    public final defpackage.g xiZrDbcSW0;

    public k80(com.corsair.ledger.data.local.CorsairDatabase_Impl corsairDatabase_Impl, java.util.LinkedHashMap linkedHashMap, java.util.LinkedHashMap linkedHashMap2, java.lang.String... strArr) {
        this.IHQe1A4L2xu = corsairDatabase_Impl;
        defpackage.kj1 kj1Var = new defpackage.kj1(corsairDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, corsairDatabase_Impl.ez2rX8ReCYw, new defpackage.xiZrDbcSW0(1, this, defpackage.k80.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 4));
        this.oh6vYeIP = kj1Var;
        this.r1MBDhnF = new java.util.LinkedHashMap();
        this.F7NU4MC0GW = new java.util.concurrent.locks.ReentrantLock();
        this.adDC3e2L = new defpackage.g(this, 15);
        this.xiZrDbcSW0 = new defpackage.g(this, 16);
        java.util.Collections.newSetFromMap(new java.util.IdentityHashMap()).getClass();
        this.AARZUJiTa = new java.lang.Object();
        kj1Var.ez2rX8ReCYw = new defpackage.e3(5, this);
    }
}
