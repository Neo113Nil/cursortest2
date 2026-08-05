package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hz implements md0, d10 {
    public final AtomicInteger MdtA4re8;
    public final f40 NCTxEWno;
    public final dl qoPGr6Ce;
    public ld0 wxUZMvaN;

    public hz(dl dlVar, f40 f40Var) {
        f40Var.getClass();
        this.qoPGr6Ce = dlVar;
        this.NCTxEWno = f40Var;
        this.MdtA4re8 = new AtomicInteger(0);
    }

    @Override // defpackage.md0
    public final Boolean MdtA4re8(g9 g9Var) {
        return Boolean.valueOf(this.wxUZMvaN != null || this.NCTxEWno.ow5vqvCr());
    }

    @Override // defpackage.d10
    public final f40 NCTxEWno() {
        return this.NCTxEWno;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object VgvYg0wo(ld0 ld0Var, dl dlVar, h9 h9Var) {
        dz dzVar;
        int i;
        AtomicInteger atomicInteger;
        int i2;
        try {
            if (h9Var instanceof dz) {
                dzVar = (dz) h9Var;
                int i3 = dzVar.Qr9iLBAD;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dzVar.Qr9iLBAD = i3 - Integer.MIN_VALUE;
                    Object obj = dzVar.P7K7Inc8;
                    i = dzVar.Qr9iLBAD;
                    atomicInteger = this.MdtA4re8;
                    i2 = 1;
                    f40 f40Var = this.NCTxEWno;
                    if (i != 0) {
                        fn.SgZGMMPL(obj);
                        int ordinal = ld0Var.ordinal();
                        if (ordinal == 0) {
                            w30.KlHjfFWx(f40Var, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            w30.KlHjfFWx(f40Var, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new d7();
                            }
                            w30.KlHjfFWx(f40Var, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                        if (atomicInteger.incrementAndGet() > 0) {
                            this.wxUZMvaN = ld0Var;
                        }
                        Object czVar = new cz(0, this);
                        dzVar.VgvYg0wo = 1;
                        dzVar.Qr9iLBAD = 1;
                        obj = dlVar.Qr9iLBAD(czVar, dzVar);
                        Object obj2 = u9.NCTxEWno;
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = dzVar.VgvYg0wo;
                        fn.SgZGMMPL(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.wxUZMvaN = null;
                    }
                    if (i2 == 0) {
                        w30.KlHjfFWx(f40Var, "END TRANSACTION");
                        return obj;
                    }
                    w30.KlHjfFWx(f40Var, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i != 0) {
            }
            if (atomicInteger.decrementAndGet() == 0) {
            }
            if (i2 == 0) {
            }
        } finally {
        }
        dzVar = new dz(this, h9Var);
        Object obj3 = dzVar.P7K7Inc8;
        i = dzVar.Qr9iLBAD;
        atomicInteger = this.MdtA4re8;
        i2 = 1;
        f40 f40Var2 = this.NCTxEWno;
    }

    @Override // defpackage.md0
    public final Object qoPGr6Ce(ld0 ld0Var, dl dlVar, bb0 bb0Var) {
        return this.qoPGr6Ce.Qr9iLBAD(new gz(this, ld0Var, dlVar, null), bb0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0046, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.rz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object wxUZMvaN(String str, zk zkVar, h9 h9Var) {
        ez ezVar;
        Object obj;
        int i;
        if (h9Var instanceof ez) {
            ezVar = (ez) h9Var;
            int i2 = ezVar.jb9XjC4I;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ezVar.jb9XjC4I = i2 - Integer.MIN_VALUE;
                obj = ezVar.b2ZJblxo;
                i = ezVar.jb9XjC4I;
                Object obj2 = u9.NCTxEWno;
                if (i != 0) {
                    fn.SgZGMMPL(obj);
                    ezVar.VgvYg0wo = str;
                    ezVar.P7K7Inc8 = zkVar;
                    ezVar.jb9XjC4I = 1;
                    obj = MdtA4re8(ezVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            fn.SgZGMMPL(obj);
                            return obj;
                        }
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zkVar = ezVar.P7K7Inc8;
                    str = ezVar.VgvYg0wo;
                    fn.SgZGMMPL(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    fz fzVar = new fz(this, str, zkVar, null);
                    ezVar.VgvYg0wo = null;
                    ezVar.P7K7Inc8 = null;
                    ezVar.jb9XjC4I = 2;
                    Object Qr9iLBAD = this.qoPGr6Ce.Qr9iLBAD(fzVar, ezVar);
                    return Qr9iLBAD == obj2 ? obj2 : Qr9iLBAD;
                }
                h40 Ey6iv0m0 = this.NCTxEWno.Ey6iv0m0(str);
                try {
                    Object ow5vqvCr = zkVar.ow5vqvCr(Ey6iv0m0);
                    le0.eVhOlqcC(Ey6iv0m0, null);
                    return ow5vqvCr;
                } finally {
                }
            }
        }
        ezVar = new ez(this, h9Var);
        obj = ezVar.b2ZJblxo;
        i = ezVar.jb9XjC4I;
        Object obj22 = u9.NCTxEWno;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
