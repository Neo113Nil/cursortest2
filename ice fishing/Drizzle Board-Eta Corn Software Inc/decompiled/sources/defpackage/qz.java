package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class qz {
    public final ReentrantLock MdtA4re8 = new ReentrantLock();
    public final ok NCTxEWno;
    public final c8[] P7K7Inc8;
    public final q0 Qr9iLBAD;
    public boolean VgvYg0wo;
    public final f60 b2ZJblxo;
    public final int qoPGr6Ce;
    public int wxUZMvaN;

    public qz(int i, ok okVar) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = okVar;
        this.P7K7Inc8 = new c8[i];
        int i2 = g60.qoPGr6Ce;
        this.b2ZJblxo = new f60(i);
        this.Qr9iLBAD = new q0(i);
    }

    public final void MdtA4re8() {
        ReentrantLock reentrantLock = this.MdtA4re8;
        reentrantLock.lock();
        try {
            this.VgvYg0wo = true;
            for (c8 c8Var : this.P7K7Inc8) {
                if (c8Var != null) {
                    c8Var.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:13|14|(1:(1:34)(2:31|(1:33)))(1:16)|17|18|19|20|21|(1:23)(11:25|12|13|14|(0)(0)|17|18|19|20|21|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        r10 = r10;
        r9 = r9;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: all -> 0x006b, TryCatch #1 {all -> 0x006b, blocks: (B:14:0x0063, B:16:0x0067, B:31:0x006f, B:34:0x0076), top: B:13:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r1v10, types: [ok] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0052 -> B:12:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object NCTxEWno(long j, w7 w7Var, h9 h9Var) {
        pz pzVar;
        int i;
        l20 l20Var;
        pz pzVar2;
        Throwable th;
        Object jb9XjC4I;
        u9 u9Var;
        w7 w7Var2;
        if (h9Var instanceof pz) {
            pzVar = (pz) h9Var;
            int i2 = pzVar.eVhOlqcC;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pzVar.eVhOlqcC = i2 - Integer.MIN_VALUE;
                Object obj = pzVar.Qr9iLBAD;
                i = pzVar.eVhOlqcC;
                int i3 = 1;
                g9 g9Var = null;
                if (i != 0) {
                    fn.SgZGMMPL(obj);
                    l20 l20Var2 = new l20();
                    k4 k4Var = new k4(l20Var2, this, g9Var, i3);
                    pzVar.P7K7Inc8 = w7Var;
                    pzVar.b2ZJblxo = l20Var2;
                    pzVar.VgvYg0wo = j;
                    pzVar.eVhOlqcC = 1;
                    jb9XjC4I = n50.jb9XjC4I(j, k4Var, pzVar);
                    u9Var = u9.NCTxEWno;
                    if (jb9XjC4I == u9Var) {
                    }
                } else {
                    if (i != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = pzVar.VgvYg0wo;
                    l20 l20Var3 = pzVar.b2ZJblxo;
                    ?? r1 = pzVar.P7K7Inc8;
                    try {
                        fn.SgZGMMPL(obj);
                        w7Var2 = r1;
                    } catch (Throwable th2) {
                        l20Var = l20Var3;
                        w7Var = r1;
                        pzVar2 = pzVar;
                        th = th2;
                    }
                    l20Var = l20Var3;
                    w7Var = w7Var2;
                    pzVar2 = pzVar;
                    th = null;
                    try {
                        if (th instanceof oc0) {
                            w7Var.qoPGr6Ce();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj2 = l20Var.NCTxEWno;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        pzVar = pzVar2;
                        l20 l20Var22 = new l20();
                        k4 k4Var2 = new k4(l20Var22, this, g9Var, i3);
                        pzVar.P7K7Inc8 = w7Var;
                        pzVar.b2ZJblxo = l20Var22;
                        pzVar.VgvYg0wo = j;
                        pzVar.eVhOlqcC = 1;
                        jb9XjC4I = n50.jb9XjC4I(j, k4Var2, pzVar);
                        u9Var = u9.NCTxEWno;
                        if (jb9XjC4I == u9Var) {
                            return u9Var;
                        }
                        w7Var2 = w7Var;
                        l20Var3 = l20Var22;
                        l20Var = l20Var3;
                        w7Var = w7Var2;
                        pzVar2 = pzVar;
                        th = null;
                        if (th instanceof oc0) {
                        }
                        pzVar = pzVar2;
                        l20 l20Var222 = new l20();
                        k4 k4Var22 = new k4(l20Var222, this, g9Var, i3);
                        pzVar.P7K7Inc8 = w7Var;
                        pzVar.b2ZJblxo = l20Var222;
                        pzVar.VgvYg0wo = j;
                        pzVar.eVhOlqcC = 1;
                        jb9XjC4I = n50.jb9XjC4I(j, k4Var22, pzVar);
                        u9Var = u9.NCTxEWno;
                        if (jb9XjC4I == u9Var) {
                        }
                    } catch (Throwable th3) {
                        c8 c8Var = (c8) l20Var.NCTxEWno;
                        if (c8Var != null) {
                            VgvYg0wo(c8Var);
                        }
                        throw th3;
                    }
                }
            }
        }
        pzVar = new pz(this, h9Var);
        Object obj3 = pzVar.Qr9iLBAD;
        i = pzVar.eVhOlqcC;
        int i32 = 1;
        g9 g9Var2 = null;
        if (i != 0) {
        }
    }

    public final void VgvYg0wo(c8 c8Var) {
        ReentrantLock reentrantLock = this.MdtA4re8;
        reentrantLock.lock();
        try {
            this.Qr9iLBAD.addLast(c8Var);
            reentrantLock.unlock();
            this.b2ZJblxo.NCTxEWno();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        r8.jb9XjC4I(r4, r0.MdtA4re8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[Catch: all -> 0x00b4, TryCatch #1 {all -> 0x00b4, blocks: (B:13:0x007d, B:15:0x0081, B:17:0x0087, B:20:0x008e, B:21:0x00a8, B:25:0x00b6, B:26:0x00bd), top: B:12:0x007d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6 A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #1 {all -> 0x00b4, blocks: (B:13:0x007d, B:15:0x0081, B:17:0x0087, B:20:0x008e, B:21:0x00a8, B:25:0x00b6, B:26:0x00bd), top: B:12:0x007d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object qoPGr6Ce(h9 h9Var) {
        oz ozVar;
        int i;
        int andDecrement;
        ReentrantLock reentrantLock;
        f60 f60Var = this.b2ZJblxo;
        int i2 = f60Var.NCTxEWno;
        q0 q0Var = this.Qr9iLBAD;
        try {
            try {
                if (h9Var instanceof oz) {
                    ozVar = (oz) h9Var;
                    int i3 = ozVar.b2ZJblxo;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ozVar.b2ZJblxo = i3 - Integer.MIN_VALUE;
                        Object obj = ozVar.VgvYg0wo;
                        i = ozVar.b2ZJblxo;
                        if (i != 0) {
                            fn.SgZGMMPL(obj);
                            ozVar.b2ZJblxo = 1;
                            do {
                                andDecrement = e60.P7K7Inc8.getAndDecrement(f60Var);
                            } while (andDecrement > i2);
                            Object obj2 = xe0.qoPGr6Ce;
                            Object obj3 = u9.NCTxEWno;
                            if (andDecrement <= 0) {
                                m3 amk52bBQ = le0.amk52bBQ(w30.SgZGMMPL(ozVar));
                                try {
                                    if (!f60Var.qoPGr6Ce(amk52bBQ)) {
                                        while (true) {
                                            int andDecrement2 = e60.P7K7Inc8.getAndDecrement(f60Var);
                                            if (andDecrement2 <= i2) {
                                                if (andDecrement2 > 0) {
                                                    break;
                                                }
                                                if (f60Var.qoPGr6Ce(amk52bBQ)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    Object Ey6iv0m0 = amk52bBQ.Ey6iv0m0();
                                    Object obj4 = Ey6iv0m0;
                                    if (Ey6iv0m0 != obj3) {
                                        obj4 = obj2;
                                    }
                                    if (obj4 == obj3) {
                                        obj2 = obj4;
                                    }
                                } catch (Throwable th) {
                                    amk52bBQ.DK9slbsy();
                                    throw th;
                                }
                            }
                            if (obj2 == obj3) {
                                return obj3;
                            }
                        } else {
                            if (i != 1) {
                                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fn.SgZGMMPL(obj);
                        }
                        reentrantLock = this.MdtA4re8;
                        reentrantLock.lock();
                        if (!this.VgvYg0wo) {
                            w30.bvfAo0eO("Connection pool is closed", 21);
                            throw null;
                        }
                        if (q0Var.isEmpty() && this.wxUZMvaN < this.qoPGr6Ce) {
                            c8 c8Var = new c8((f40) this.NCTxEWno.qoPGr6Ce());
                            c8[] c8VarArr = this.P7K7Inc8;
                            int i4 = this.wxUZMvaN;
                            this.wxUZMvaN = i4 + 1;
                            c8VarArr[i4] = c8Var;
                            q0Var.addLast(c8Var);
                        }
                        return (c8) q0Var.removeLast();
                    }
                }
                if (!this.VgvYg0wo) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.MdtA4re8;
            reentrantLock.lock();
        } catch (Throwable th2) {
            f60Var.NCTxEWno();
            throw th2;
        }
        ozVar = new oz(this, h9Var);
        Object obj5 = ozVar.VgvYg0wo;
        i = ozVar.b2ZJblxo;
        if (i != 0) {
        }
    }

    public final void wxUZMvaN(StringBuilder sb) {
        q0 q0Var = this.Qr9iLBAD;
        ReentrantLock reentrantLock = this.MdtA4re8;
        reentrantLock.lock();
        try {
            mp mpVar = new mp(10);
            int i = q0Var.wxUZMvaN;
            for (int i2 = 0; i2 < i; i2++) {
                mpVar.add(q0Var.get(i2));
            }
            mp P7K7Inc8 = ra.P7K7Inc8(mpVar);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.qoPGr6Ce + ", ");
            sb.append("permits=" + Math.max(b1.qoPGr6Ce.getIntVolatile(this.b2ZJblxo, e60.b2ZJblxo), 0) + ", ");
            sb.append("queue=(size=" + P7K7Inc8.qoPGr6Ce() + ")[" + x5.Sjrx9cEN(P7K7Inc8, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            c8[] c8VarArr = this.P7K7Inc8;
            int length = c8VarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                c8 c8Var = c8VarArr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(c8Var != null ? c8Var.NCTxEWno.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (c8Var != null) {
                    c8Var.Qr9iLBAD(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
