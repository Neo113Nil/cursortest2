package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fa extends bb0 implements dl {
    public ld0 P7K7Inc8;
    public /* synthetic */ Object Qr9iLBAD;
    public int b2ZJblxo;
    public final /* synthetic */ boolean eVhOlqcC;
    public final /* synthetic */ boolean jb9XjC4I;
    public final /* synthetic */ v30 k3x7lurq;
    public final /* synthetic */ zk ow5vqvCr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(g9 g9Var, zk zkVar, v30 v30Var, boolean z, boolean z2) {
        super(2, g9Var);
        this.jb9XjC4I = z;
        this.eVhOlqcC = z2;
        this.k3x7lurq = v30Var;
        this.ow5vqvCr = zkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r13 == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r13 == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b7  */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        ld0 ld0Var;
        md0 md0Var;
        ld0 ld0Var2;
        md0 md0Var2;
        Object obj2;
        int i = this.b2ZJblxo;
        zk zkVar = this.ow5vqvCr;
        v30 v30Var = this.k3x7lurq;
        boolean z = this.eVhOlqcC;
        g9 g9Var = null;
        u9 u9Var = u9.NCTxEWno;
        if (i == 0) {
            fn.SgZGMMPL(obj);
            md0 md0Var3 = (md0) this.Qr9iLBAD;
            if (!this.jb9XjC4I) {
                md0Var3.getClass();
                return zkVar.ow5vqvCr(((d10) md0Var3).NCTxEWno());
            }
            ld0Var = z ? ld0.NCTxEWno : ld0.MdtA4re8;
            if (!z) {
                this.Qr9iLBAD = md0Var3;
                this.P7K7Inc8 = ld0Var;
                this.b2ZJblxo = 1;
                Boolean MdtA4re8 = md0Var3.MdtA4re8(this);
                if (MdtA4re8 != u9Var) {
                    md0Var2 = md0Var3;
                    obj = MdtA4re8;
                }
                return u9Var;
            }
            ld0 ld0Var3 = ld0Var;
            md0Var = md0Var3;
            ld0Var2 = ld0Var3;
            ea eaVar = new ea((g9) null, zkVar);
            this.Qr9iLBAD = md0Var;
            this.P7K7Inc8 = null;
            this.b2ZJblxo = 3;
            obj = md0Var.qoPGr6Ce(ld0Var2, eaVar, this);
        } else if (i == 1) {
            ld0Var = this.P7K7Inc8;
            md0Var2 = (md0) this.Qr9iLBAD;
            fn.SgZGMMPL(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    md0Var = (md0) this.Qr9iLBAD;
                    fn.SgZGMMPL(obj);
                    if (z) {
                        return obj;
                    }
                    this.Qr9iLBAD = obj;
                    this.b2ZJblxo = 4;
                    Boolean MdtA4re82 = md0Var.MdtA4re8(this);
                    if (MdtA4re82 != u9Var) {
                        Object obj3 = obj;
                        obj = MdtA4re82;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        return obj2;
                    }
                    return u9Var;
                }
                if (i != 4) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.Qr9iLBAD;
                fn.SgZGMMPL(obj);
                if (!((Boolean) obj).booleanValue()) {
                    hn wxUZMvaN = v30Var.wxUZMvaN();
                    ie0 ie0Var = wxUZMvaN.NCTxEWno;
                    ek ekVar = wxUZMvaN.VgvYg0wo;
                    ek ekVar2 = wxUZMvaN.P7K7Inc8;
                    ie0Var.getClass();
                    ekVar.getClass();
                    ekVar2.getClass();
                    if (ie0Var.eVhOlqcC.compareAndSet(false, true)) {
                        e9 e9Var = ie0Var.qoPGr6Ce.qoPGr6Ce;
                        if (e9Var != null) {
                            fn.Ey6iv0m0(e9Var, new p9(p9.MdtA4re8), new y7(ie0Var, ekVar2, g9Var, 8), 2);
                            return obj2;
                        }
                        fn.ytu5o6f4("coroutineScope");
                        throw null;
                    }
                }
                return obj2;
            }
            ld0Var = this.P7K7Inc8;
            md0Var2 = (md0) this.Qr9iLBAD;
            fn.SgZGMMPL(obj);
            ld0Var2 = ld0Var;
            md0Var = md0Var2;
            ea eaVar2 = new ea((g9) null, zkVar);
            this.Qr9iLBAD = md0Var;
            this.P7K7Inc8 = null;
            this.b2ZJblxo = 3;
            obj = md0Var.qoPGr6Ce(ld0Var2, eaVar2, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            hn wxUZMvaN2 = v30Var.wxUZMvaN();
            this.Qr9iLBAD = md0Var2;
            this.P7K7Inc8 = ld0Var;
            this.b2ZJblxo = 2;
            Object VgvYg0wo = wxUZMvaN2.NCTxEWno.VgvYg0wo(this);
            if (VgvYg0wo != u9Var) {
                VgvYg0wo = xe0.qoPGr6Ce;
            }
        }
        ld0Var2 = ld0Var;
        md0Var = md0Var2;
        ea eaVar22 = new ea((g9) null, zkVar);
        this.Qr9iLBAD = md0Var;
        this.P7K7Inc8 = null;
        this.b2ZJblxo = 3;
        obj = md0Var.qoPGr6Ce(ld0Var2, eaVar22, this);
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((fa) lDXGDhIF((g9) obj2, (md0) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        fa faVar = new fa(g9Var, this.ow5vqvCr, this.k3x7lurq, this.jb9XjC4I, this.eVhOlqcC);
        faVar.Qr9iLBAD = obj;
        return faVar;
    }
}
