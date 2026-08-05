package defpackage;

import android.database.SQLException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yz implements md0, d10 {
    public final boolean MdtA4re8;
    public final c8 NCTxEWno;
    public volatile boolean VgvYg0wo;
    public final re qoPGr6Ce;
    public final q0 wxUZMvaN;

    public yz(re reVar, c8 c8Var, boolean z) {
        reVar.getClass();
        this.qoPGr6Ce = reVar;
        this.NCTxEWno = c8Var;
        this.MdtA4re8 = z;
        this.wxUZMvaN = new q0();
    }

    @Override // defpackage.md0
    public final Boolean MdtA4re8(g9 g9Var) {
        if (this.VgvYg0wo) {
            w30.bvfAo0eO("Connection is recycled", 21);
            throw null;
        }
        l9 l9Var = ((h9) g9Var).MdtA4re8;
        l9Var.getClass();
        t7 t7Var = (t7) l9Var.OnDfzHZD(this.qoPGr6Ce);
        if (t7Var != null && t7Var.MdtA4re8 == this) {
            return Boolean.valueOf(!this.wxUZMvaN.isEmpty() || this.NCTxEWno.NCTxEWno.ow5vqvCr());
        }
        w30.bvfAo0eO("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    @Override // defpackage.d10
    public final f40 NCTxEWno() {
        return this.NCTxEWno;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P7K7Inc8(boolean z, h9 h9Var) {
        vz vzVar;
        int i;
        c8 c8Var;
        q0 q0Var = this.wxUZMvaN;
        try {
            if (h9Var instanceof vz) {
                vzVar = (vz) h9Var;
                int i2 = vzVar.jb9XjC4I;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vzVar.jb9XjC4I = i2 - Integer.MIN_VALUE;
                    Object obj = vzVar.b2ZJblxo;
                    i = vzVar.jb9XjC4I;
                    c8 c8Var2 = this.NCTxEWno;
                    if (i != 0) {
                        fn.SgZGMMPL(obj);
                        vzVar.P7K7Inc8 = c8Var2;
                        vzVar.VgvYg0wo = z;
                        vzVar.jb9XjC4I = 1;
                        Object P7K7Inc8 = c8Var2.MdtA4re8.P7K7Inc8(vzVar);
                        u9 u9Var = u9.NCTxEWno;
                        if (P7K7Inc8 == u9Var) {
                            return u9Var;
                        }
                        c8Var = c8Var2;
                    } else {
                        if (i != 1) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = vzVar.VgvYg0wo;
                        c8Var = vzVar.P7K7Inc8;
                        fn.SgZGMMPL(obj);
                    }
                    if (!q0Var.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    tz tzVar = (tz) d6.TrssYQ34(q0Var);
                    if (z) {
                        tzVar.getClass();
                        if (q0Var.isEmpty()) {
                            w30.KlHjfFWx(c8Var2, "END TRANSACTION");
                        } else {
                            w30.KlHjfFWx(c8Var2, "RELEASE SAVEPOINT '" + tzVar.qoPGr6Ce + '\'');
                        }
                    } else if (q0Var.isEmpty()) {
                        w30.KlHjfFWx(c8Var2, "ROLLBACK TRANSACTION");
                    } else {
                        w30.KlHjfFWx(c8Var2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + tzVar.qoPGr6Ce + '\'');
                    }
                    xe0 xe0Var = xe0.qoPGr6Ce;
                    c8Var.VgvYg0wo(null);
                    return xe0Var;
                }
            }
            if (!q0Var.isEmpty()) {
            }
        } catch (Throwable th) {
            c8Var.VgvYg0wo(null);
            throw th;
        }
        vzVar = new vz(this, h9Var);
        Object obj2 = vzVar.b2ZJblxo;
        i = vzVar.jb9XjC4I;
        c8 c8Var22 = this.NCTxEWno;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008e, B:23:0x0068, B:24:0x006d, B:25:0x006e, B:26:0x0074, B:27:0x007a), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object VgvYg0wo(ld0 ld0Var, h9 h9Var) {
        uz uzVar;
        int i;
        c8 c8Var;
        q0 q0Var = this.wxUZMvaN;
        try {
            if (h9Var instanceof uz) {
                uzVar = (uz) h9Var;
                int i2 = uzVar.jb9XjC4I;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    uzVar.jb9XjC4I = i2 - Integer.MIN_VALUE;
                    Object obj = uzVar.b2ZJblxo;
                    i = uzVar.jb9XjC4I;
                    c8 c8Var2 = this.NCTxEWno;
                    if (i != 0) {
                        fn.SgZGMMPL(obj);
                        uzVar.VgvYg0wo = ld0Var;
                        uzVar.P7K7Inc8 = c8Var2;
                        uzVar.jb9XjC4I = 1;
                        Object P7K7Inc8 = c8Var2.MdtA4re8.P7K7Inc8(uzVar);
                        u9 u9Var = u9.NCTxEWno;
                        if (P7K7Inc8 == u9Var) {
                            return u9Var;
                        }
                        c8Var = c8Var2;
                    } else {
                        if (i != 1) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c8 c8Var3 = uzVar.P7K7Inc8;
                        ld0 ld0Var2 = uzVar.VgvYg0wo;
                        fn.SgZGMMPL(obj);
                        c8Var = c8Var3;
                        ld0Var = ld0Var2;
                    }
                    int i3 = q0Var.wxUZMvaN;
                    if (q0Var.isEmpty()) {
                        w30.KlHjfFWx(c8Var2, "SAVEPOINT '" + i3 + '\'');
                    } else {
                        int ordinal = ld0Var.ordinal();
                        if (ordinal == 0) {
                            w30.KlHjfFWx(c8Var2, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            w30.KlHjfFWx(c8Var2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new d7();
                            }
                            w30.KlHjfFWx(c8Var2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    q0Var.addLast(new tz(i3));
                    xe0 xe0Var = xe0.qoPGr6Ce;
                    c8Var.VgvYg0wo(null);
                    return xe0Var;
                }
            }
            int i32 = q0Var.wxUZMvaN;
            if (q0Var.isEmpty()) {
            }
            q0Var.addLast(new tz(i32));
            xe0 xe0Var2 = xe0.qoPGr6Ce;
            c8Var.VgvYg0wo(null);
            return xe0Var2;
        } catch (Throwable th) {
            c8Var.VgvYg0wo(null);
            throw th;
        }
        uzVar = new uz(this, h9Var);
        Object obj2 = uzVar.b2ZJblxo;
        i = uzVar.jb9XjC4I;
        c8 c8Var22 = this.NCTxEWno;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        if (VgvYg0wo(r11, r0) == r8) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b2ZJblxo(ld0 ld0Var, dl dlVar, h9 h9Var) {
        wz wzVar;
        Object obj;
        int i;
        Object obj2;
        SQLException e;
        Throwable th;
        int i2;
        try {
            if (h9Var instanceof wz) {
                wzVar = (wz) h9Var;
                int i3 = wzVar.eVhOlqcC;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    wzVar.eVhOlqcC = i3 - Integer.MIN_VALUE;
                    obj = wzVar.Qr9iLBAD;
                    i = wzVar.eVhOlqcC;
                    obj2 = u9.NCTxEWno;
                    if (i != 0) {
                        fn.SgZGMMPL(obj);
                        if (ld0Var == null) {
                            ld0Var = ld0.NCTxEWno;
                        }
                        wzVar.VgvYg0wo = dlVar;
                        wzVar.eVhOlqcC = 1;
                    } else if (i == 1) {
                        dlVar = (dl) wzVar.VgvYg0wo;
                        fn.SgZGMMPL(obj);
                    } else {
                        if (i == 2) {
                            i2 = wzVar.b2ZJblxo;
                            fn.SgZGMMPL(obj);
                            boolean z = i2 != 0;
                            wzVar.VgvYg0wo = obj;
                            wzVar.eVhOlqcC = 3;
                            return P7K7Inc8(z, wzVar) != obj2 ? obj2 : obj;
                        }
                        if (i == 3 || i == 4) {
                            Object obj3 = wzVar.VgvYg0wo;
                            fn.SgZGMMPL(obj);
                            return obj3;
                        }
                        if (i != 5) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = wzVar.P7K7Inc8;
                        th = (Throwable) wzVar.VgvYg0wo;
                        try {
                            fn.SgZGMMPL(obj);
                            throw th;
                        } catch (SQLException e2) {
                            e = e2;
                            if (th != null) {
                            }
                        }
                    }
                    cz czVar = new cz(1, this);
                    wzVar.VgvYg0wo = null;
                    wzVar.b2ZJblxo = 1;
                    wzVar.eVhOlqcC = 2;
                    obj = dlVar.Qr9iLBAD(czVar, wzVar);
                    if (obj != obj2) {
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        wzVar.VgvYg0wo = obj;
                        wzVar.eVhOlqcC = 3;
                        if (P7K7Inc8(z, wzVar) != obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            cz czVar2 = new cz(1, this);
            wzVar.VgvYg0wo = null;
            wzVar.b2ZJblxo = 1;
            wzVar.eVhOlqcC = 2;
            obj = dlVar.Qr9iLBAD(czVar2, wzVar);
            if (obj != obj2) {
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    wzVar.VgvYg0wo = th;
                    wzVar.P7K7Inc8 = th3;
                    wzVar.eVhOlqcC = 5;
                    if (P7K7Inc8(false, wzVar) != obj2) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    w30.wxUZMvaN(th, e);
                    throw th;
                }
            }
        }
        wzVar = new wz(this, h9Var);
        obj = wzVar.Qr9iLBAD;
        i = wzVar.eVhOlqcC;
        obj2 = u9.NCTxEWno;
    }

    @Override // defpackage.md0
    public final Object qoPGr6Ce(ld0 ld0Var, dl dlVar, bb0 bb0Var) {
        if (this.VgvYg0wo) {
            w30.bvfAo0eO("Connection is recycled", 21);
            throw null;
        }
        l9 l9Var = bb0Var.MdtA4re8;
        l9Var.getClass();
        t7 t7Var = (t7) l9Var.OnDfzHZD(this.qoPGr6Ce);
        if (t7Var != null && t7Var.MdtA4re8 == this) {
            return b2ZJblxo(ld0Var, dlVar, bb0Var);
        }
        w30.bvfAo0eO("Attempted to use connection on a different coroutine", 21);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.rz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object wxUZMvaN(String str, zk zkVar, h9 h9Var) {
        xz xzVar;
        int i;
        c8 c8Var;
        try {
            try {
                if (h9Var instanceof xz) {
                    xzVar = (xz) h9Var;
                    int i2 = xzVar.eVhOlqcC;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        xzVar.eVhOlqcC = i2 - Integer.MIN_VALUE;
                        Object obj = xzVar.Qr9iLBAD;
                        u9 u9Var = u9.NCTxEWno;
                        i = xzVar.eVhOlqcC;
                        if (i != 0) {
                            fn.SgZGMMPL(obj);
                            if (this.VgvYg0wo) {
                                w30.bvfAo0eO("Connection is recycled", 21);
                                throw null;
                            }
                            l9 l9Var = xzVar.MdtA4re8;
                            l9Var.getClass();
                            t7 t7Var = (t7) l9Var.OnDfzHZD(this.qoPGr6Ce);
                            if (t7Var == null || t7Var.MdtA4re8 != this) {
                                w30.bvfAo0eO("Attempted to use connection on a different coroutine", 21);
                                throw null;
                            }
                            c8Var = this.NCTxEWno;
                            xzVar.VgvYg0wo = str;
                            xzVar.P7K7Inc8 = zkVar;
                            xzVar.b2ZJblxo = c8Var;
                            xzVar.eVhOlqcC = 1;
                            if (c8Var.MdtA4re8.P7K7Inc8(xzVar) == u9Var) {
                                return u9Var;
                            }
                        } else {
                            if (i != 1) {
                                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            c8 c8Var2 = xzVar.b2ZJblxo;
                            zkVar = xzVar.P7K7Inc8;
                            String str2 = xzVar.VgvYg0wo;
                            fn.SgZGMMPL(obj);
                            c8Var = c8Var2;
                            str = str2;
                        }
                        sz szVar = new sz(this, this.NCTxEWno.Ey6iv0m0(str));
                        Object ow5vqvCr = zkVar.ow5vqvCr(szVar);
                        le0.eVhOlqcC(szVar, null);
                        return ow5vqvCr;
                    }
                }
                Object ow5vqvCr2 = zkVar.ow5vqvCr(szVar);
                le0.eVhOlqcC(szVar, null);
                return ow5vqvCr2;
            } finally {
            }
            sz szVar2 = new sz(this, this.NCTxEWno.Ey6iv0m0(str));
        } finally {
            c8Var.VgvYg0wo(null);
        }
        xzVar = new xz(this, h9Var);
        Object obj2 = xzVar.Qr9iLBAD;
        u9 u9Var2 = u9.NCTxEWno;
        i = xzVar.eVhOlqcC;
        if (i != 0) {
        }
    }
}
