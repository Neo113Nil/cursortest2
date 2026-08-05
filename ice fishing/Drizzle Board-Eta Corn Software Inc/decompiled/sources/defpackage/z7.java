package defpackage;

import android.database.SQLException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z7 implements u7 {
    public final qz MdtA4re8;
    public final qz NCTxEWno;
    public volatile boolean P7K7Inc8;
    public final ThreadLocal VgvYg0wo;
    public final long b2ZJblxo;
    public final re wxUZMvaN;

    public z7(final mcXgUFR8 mcxgufr8, final String str, int i) {
        long FXJmAAN1;
        str.getClass();
        this.wxUZMvaN = new re(10);
        this.VgvYg0wo = new ThreadLocal();
        re reVar = ge.NCTxEWno;
        ie ieVar = ie.SECONDS;
        if (ieVar.compareTo(ieVar) <= 0) {
            int i2 = he.qoPGr6Ce;
            FXJmAAN1 = 60000000000L;
        } else {
            FXJmAAN1 = le0.FXJmAAN1(30L, ieVar);
        }
        this.b2ZJblxo = FXJmAAN1;
        if (i <= 0) {
            m1.sjUBp5pO("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i3 = 0;
        this.NCTxEWno = new qz(i, new ok() { // from class: v7
            @Override // defpackage.ok
            public final Object qoPGr6Ce() {
                int i4 = i3;
                String str2 = str;
                mcXgUFR8 mcxgufr82 = mcxgufr8;
                switch (i4) {
                    case 0:
                        f40 wxUZMvaN = mcxgufr82.wxUZMvaN(str2);
                        w30.KlHjfFWx(wxUZMvaN, "PRAGMA query_only = 1");
                        return wxUZMvaN;
                    default:
                        return mcxgufr82.wxUZMvaN(str2);
                }
            }
        });
        final int i4 = 1;
        this.MdtA4re8 = new qz(1, new ok() { // from class: v7
            @Override // defpackage.ok
            public final Object qoPGr6Ce() {
                int i42 = i4;
                String str2 = str;
                mcXgUFR8 mcxgufr82 = mcxgufr8;
                switch (i42) {
                    case 0:
                        f40 wxUZMvaN = mcxgufr82.wxUZMvaN(str2);
                        w30.KlHjfFWx(wxUZMvaN, "PRAGMA query_only = 1");
                        return wxUZMvaN;
                    default:
                        return mcxgufr82.wxUZMvaN(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.P7K7Inc8) {
            return;
        }
        this.P7K7Inc8 = true;
        this.NCTxEWno.MdtA4re8();
        this.MdtA4re8.MdtA4re8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #2 {all -> 0x01a3, blocks: (B:56:0x0125, B:60:0x0141, B:62:0x014c), top: B:55:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r15v0, types: [w7] */
    @Override // defpackage.u7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k3x7lurq(boolean z, dl dlVar, h9 h9Var) {
        x7 x7Var;
        int i;
        l20 l20Var;
        String str;
        Throwable th;
        qz qzVar;
        String str2;
        dl dlVar2;
        l9 l9Var;
        re reVar;
        qz qzVar2;
        l20 l20Var2;
        Object obj;
        l20 l20Var3;
        yz yzVar;
        final boolean z2 = z;
        try {
            if (h9Var instanceof x7) {
                x7Var = (x7) h9Var;
                int i2 = x7Var.ygLcUYwZ;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    x7Var.ygLcUYwZ = i2 - Integer.MIN_VALUE;
                    Object obj2 = x7Var.ow5vqvCr;
                    u9 u9Var = u9.NCTxEWno;
                    i = x7Var.ygLcUYwZ;
                    int i3 = 0;
                    boolean z3 = true;
                    boolean z4 = true;
                    l9 l9Var2 = null;
                    boolean z5 = false;
                    boolean z6 = false;
                    boolean z7 = false;
                    if (i != 0) {
                        fn.SgZGMMPL(obj2);
                        if (this.P7K7Inc8) {
                            w30.bvfAo0eO("Connection pool is closed", 21);
                            throw null;
                        }
                        yz yzVar2 = (yz) this.VgvYg0wo.get();
                        if (yzVar2 == null) {
                            l9 l9Var3 = x7Var.MdtA4re8;
                            l9Var3.getClass();
                            t7 t7Var = (t7) l9Var3.OnDfzHZD(this.wxUZMvaN);
                            yzVar2 = t7Var != null ? t7Var.MdtA4re8 : null;
                        }
                        if (yzVar2 == null) {
                            qz qzVar3 = z2 ? this.NCTxEWno : this.MdtA4re8;
                            l20Var = new l20();
                            try {
                                l9 l9Var4 = x7Var.MdtA4re8;
                                l9Var4.getClass();
                                re reVar2 = this.wxUZMvaN;
                                str2 = "ROLLBACK TRANSACTION";
                                try {
                                    long j = this.b2ZJblxo;
                                    ?? r15 = new ok() { // from class: w7
                                        @Override // defpackage.ok
                                        public final Object qoPGr6Ce() {
                                            String str3 = z2 ? "reader" : "writer";
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Timed out attempting to acquire a " + str3 + " connection.");
                                            sb.append("\n\nWriter pool:\n");
                                            z7 z7Var = z7.this;
                                            z7Var.MdtA4re8.wxUZMvaN(sb);
                                            sb.append("Reader pool:");
                                            sb.append('\n');
                                            z7Var.NCTxEWno.wxUZMvaN(sb);
                                            try {
                                                w30.bvfAo0eO(sb.toString(), 5);
                                                throw null;
                                            } catch (SQLException e) {
                                                e.printStackTrace();
                                                return xe0.qoPGr6Ce;
                                            }
                                        }
                                    };
                                    x7Var.P7K7Inc8 = dlVar;
                                    x7Var.b2ZJblxo = qzVar3;
                                    x7Var.Qr9iLBAD = l20Var;
                                    x7Var.jb9XjC4I = l9Var4;
                                    x7Var.eVhOlqcC = l20Var;
                                    x7Var.k3x7lurq = reVar2;
                                    x7Var.VgvYg0wo = z2;
                                    x7Var.ygLcUYwZ = 3;
                                    Object NCTxEWno = qzVar3.NCTxEWno(j, r15, x7Var);
                                    if (NCTxEWno != u9Var) {
                                        dlVar2 = dlVar;
                                        l9Var = l9Var4;
                                        reVar = reVar2;
                                        qzVar2 = qzVar3;
                                        obj2 = NCTxEWno;
                                        l20Var2 = l20Var;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str = str2;
                                    th = th;
                                    qzVar = qzVar3;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                str = "ROLLBACK TRANSACTION";
                            }
                        } else {
                            if (!z2 && yzVar2.MdtA4re8) {
                                w30.bvfAo0eO("Cannot upgrade connection from reader to writer", 1);
                                throw null;
                            }
                            l9 l9Var5 = x7Var.MdtA4re8;
                            l9Var5.getClass();
                            if (l9Var5.OnDfzHZD(this.wxUZMvaN) == null) {
                                l9 WYNAV5pd = fn.WYNAV5pd(new t7(this.wxUZMvaN, yzVar2), new jc0(yzVar2, this.VgvYg0wo));
                                y7 y7Var = new y7(dlVar, yzVar2, z5 ? 1 : 0, i3);
                                x7Var.ygLcUYwZ = 1;
                                Object fVMzMhyS = fn.fVMzMhyS(WYNAV5pd, y7Var, x7Var);
                                if (fVMzMhyS != u9Var) {
                                    return fVMzMhyS;
                                }
                            } else {
                                x7Var.ygLcUYwZ = 2;
                                Object Qr9iLBAD = dlVar.Qr9iLBAD(yzVar2, x7Var);
                                if (Qr9iLBAD != u9Var) {
                                    return Qr9iLBAD;
                                }
                            }
                        }
                        return u9Var;
                    }
                    if (i == 1) {
                        fn.SgZGMMPL(obj2);
                        return obj2;
                    }
                    if (i == 2) {
                        fn.SgZGMMPL(obj2);
                        return obj2;
                    }
                    if (i == 3) {
                        z2 = x7Var.VgvYg0wo;
                        reVar = x7Var.k3x7lurq;
                        l20 l20Var4 = x7Var.eVhOlqcC;
                        l9Var = x7Var.jb9XjC4I;
                        l20 l20Var5 = x7Var.Qr9iLBAD;
                        qzVar2 = (qz) x7Var.b2ZJblxo;
                        dlVar2 = (dl) x7Var.P7K7Inc8;
                        try {
                            fn.SgZGMMPL(obj2);
                            l20Var2 = l20Var4;
                            str2 = "ROLLBACK TRANSACTION";
                            l20Var = l20Var5;
                        } catch (Throwable th4) {
                            th = th4;
                            str = "ROLLBACK TRANSACTION";
                            l20Var = l20Var5;
                            qzVar = qzVar2;
                            throw th;
                        }
                    } else {
                        if (i != 4) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l20Var3 = (l20) x7Var.b2ZJblxo;
                        qzVar = (qz) x7Var.P7K7Inc8;
                        try {
                            fn.SgZGMMPL(obj2);
                            str2 = "ROLLBACK TRANSACTION";
                            yzVar = (yz) l20Var3.NCTxEWno;
                            if (yzVar != null) {
                                if (!yzVar.VgvYg0wo) {
                                    yzVar.VgvYg0wo = true;
                                    if (yzVar.NCTxEWno.NCTxEWno.ow5vqvCr()) {
                                        w30.KlHjfFWx(yzVar.NCTxEWno, str2);
                                    }
                                }
                                c8 c8Var = yzVar.NCTxEWno;
                                c8Var.wxUZMvaN = null;
                                c8Var.VgvYg0wo = null;
                                qzVar.VgvYg0wo(c8Var);
                            }
                            return obj2;
                        } catch (Throwable th5) {
                            l20Var = l20Var3;
                            str = "ROLLBACK TRANSACTION";
                            th = th5;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    c8 c8Var2 = (c8) obj2;
                    c8Var2.getClass();
                    l9Var.getClass();
                    c8Var2.wxUZMvaN = l9Var;
                    c8Var2.VgvYg0wo = new Throwable();
                    l20Var2.NCTxEWno = new yz(reVar, c8Var2, this.NCTxEWno == this.MdtA4re8 && z2);
                    obj = l20Var.NCTxEWno;
                    if (obj != null) {
                        str = str2;
                        try {
                            throw new IllegalArgumentException("Required value was null.");
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            qzVar = qzVar2;
                            throw th;
                        }
                    }
                    yz yzVar3 = (yz) obj;
                    l9 WYNAV5pd2 = fn.WYNAV5pd(new t7(this.wxUZMvaN, yzVar3), new jc0(yzVar3, this.VgvYg0wo));
                    y7 y7Var2 = new y7(dlVar2, l20Var, z6 ? 1 : 0, z4 ? 1 : 0);
                    x7Var.P7K7Inc8 = qzVar2;
                    x7Var.b2ZJblxo = l20Var;
                    x7Var.Qr9iLBAD = null;
                    x7Var.jb9XjC4I = null;
                    x7Var.eVhOlqcC = null;
                    x7Var.k3x7lurq = null;
                    x7Var.ygLcUYwZ = 4;
                    obj2 = fn.fVMzMhyS(WYNAV5pd2, y7Var2, x7Var);
                    if (obj2 != u9Var) {
                        l20Var3 = l20Var;
                        qzVar = qzVar2;
                        yzVar = (yz) l20Var3.NCTxEWno;
                        if (yzVar != null) {
                        }
                        return obj2;
                    }
                    return u9Var;
                }
            }
            c8 c8Var22 = (c8) obj2;
            c8Var22.getClass();
            l9Var.getClass();
            c8Var22.wxUZMvaN = l9Var;
            c8Var22.VgvYg0wo = new Throwable();
            l20Var2.NCTxEWno = new yz(reVar, c8Var22, this.NCTxEWno == this.MdtA4re8 && z2);
            obj = l20Var.NCTxEWno;
            if (obj != null) {
            }
        } catch (Throwable th7) {
            th = th7;
            str = str2;
        }
        x7Var = new x7(this, h9Var);
        Object obj22 = x7Var.ow5vqvCr;
        u9 u9Var2 = u9.NCTxEWno;
        i = x7Var.ygLcUYwZ;
        int i32 = 0;
        boolean z32 = true;
        boolean z42 = true;
        l9 l9Var22 = null;
        boolean z52 = false;
        boolean z62 = false;
        boolean z72 = false;
        if (i != 0) {
        }
    }

    public z7(mcXgUFR8 mcxgufr8) {
        long FXJmAAN1;
        this.wxUZMvaN = new re(10);
        this.VgvYg0wo = new ThreadLocal();
        re reVar = ge.NCTxEWno;
        ie ieVar = ie.SECONDS;
        if (ieVar.compareTo(ieVar) <= 0) {
            int i = he.qoPGr6Ce;
            FXJmAAN1 = 60000000000L;
        } else {
            FXJmAAN1 = le0.FXJmAAN1(30L, ieVar);
        }
        this.b2ZJblxo = FXJmAAN1;
        qz qzVar = new qz(1, new e7(1, mcxgufr8));
        this.NCTxEWno = qzVar;
        this.MdtA4re8 = qzVar;
    }
}
