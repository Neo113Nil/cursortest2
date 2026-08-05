package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class x90 extends DK9slbsy implements xg, ol, v90, yg {
    public static final /* synthetic */ long b2ZJblxo = b1.qoPGr6Ce.objectFieldOffset(x90.class.getDeclaredField("_state$volatile"));
    public int P7K7Inc8;
    private volatile /* synthetic */ Object _state$volatile;

    public x90(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.DK9slbsy
    public final lwWCatUu MdtA4re8() {
        return new y90();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r13.equals(r15) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        if (r9 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007c, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:24:0x0094, B:26:0x00b5, B:29:0x00c5, B:30:0x00e1, B:36:0x00f1, B:32:0x00e8, B:35:0x00ee, B:45:0x009a, B:48:0x00a1, B:53:0x00fb, B:54:0x0100, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007c, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:24:0x0094, B:26:0x00b5, B:29:0x00c5, B:30:0x00e1, B:36:0x00f1, B:32:0x00e8, B:35:0x00ee, B:45:0x009a, B:48:0x00a1, B:53:0x00fb, B:54:0x0100, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:15:0x007c, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:24:0x0094, B:26:0x00b5, B:29:0x00c5, B:30:0x00e1, B:36:0x00f1, B:32:0x00e8, B:35:0x00ee, B:45:0x009a, B:48:0x00a1, B:53:0x00fb, B:54:0x0100, B:58:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [lwWCatUu] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [y90] */
    /* JADX WARN: Type inference failed for: r1v6, types: [y90] */
    /* JADX WARN: Type inference failed for: r1v7, types: [y90] */
    /* JADX WARN: Type inference failed for: r1v9, types: [y90] */
    /* JADX WARN: Type inference failed for: r8v1, types: [DK9slbsy] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c4 -> B:14:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.xg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object NCTxEWno(yg ygVar, g9 g9Var) {
        w90 w90Var;
        ?? r1;
        x90 x90Var;
        yg ygVar2;
        vn vnVar;
        Object obj;
        Object andSet;
        try {
            if (g9Var instanceof w90) {
                w90Var = (w90) g9Var;
                int i = w90Var.ow5vqvCr;
                if ((i & Integer.MIN_VALUE) != 0) {
                    w90Var.ow5vqvCr = i - Integer.MIN_VALUE;
                    Object obj2 = w90Var.eVhOlqcC;
                    r1 = w90Var.ow5vqvCr;
                    u9 u9Var = u9.NCTxEWno;
                    if (r1 != 0) {
                        fn.SgZGMMPL(obj2);
                        r1 = (y90) qoPGr6Ce();
                    } else if (r1 == 1) {
                        r1 = w90Var.b2ZJblxo;
                        ygVar = w90Var.P7K7Inc8;
                        this = w90Var.VgvYg0wo;
                        try {
                            fn.SgZGMMPL(obj2);
                            r1 = r1;
                        } catch (Throwable th) {
                            ?? r8 = this;
                            th = th;
                            r8.P7K7Inc8(r1);
                            throw th;
                        }
                    } else if (r1 == 2) {
                        obj = w90Var.jb9XjC4I;
                        vnVar = w90Var.Qr9iLBAD;
                        y90 y90Var = w90Var.b2ZJblxo;
                        ygVar2 = w90Var.P7K7Inc8;
                        x90Var = w90Var.VgvYg0wo;
                        fn.SgZGMMPL(obj2);
                        r1 = y90Var;
                        AtomicReference atomicReference = r1.qoPGr6Ce;
                        lf lfVar = ra.ow5vqvCr;
                        andSet = atomicReference.getAndSet(lfVar);
                        andSet.getClass();
                        if (andSet == ra.OnDfzHZD) {
                        }
                        if (x90Var != null) {
                        }
                    } else {
                        if (r1 != 3) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = w90Var.jb9XjC4I;
                        vnVar = w90Var.Qr9iLBAD;
                        r1 = w90Var.b2ZJblxo;
                        ygVar2 = w90Var.P7K7Inc8;
                        x90Var = w90Var.VgvYg0wo;
                        fn.SgZGMMPL(obj2);
                        if (x90Var != null) {
                            Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(x90Var, b2ZJblxo);
                            if (vnVar != null && !vnVar.VhgXwMj9()) {
                                throw vnVar.DK9slbsy();
                            }
                            Object obj3 = objectVolatile == fn.OxcuoDLp ? null : objectVolatile;
                            w90Var.VgvYg0wo = x90Var;
                            w90Var.P7K7Inc8 = ygVar2;
                            w90Var.b2ZJblxo = r1;
                            w90Var.Qr9iLBAD = vnVar;
                            w90Var.jb9XjC4I = objectVolatile;
                            w90Var.ow5vqvCr = 2;
                            if (ygVar2.OnDfzHZD(obj3, w90Var) == u9Var) {
                                return u9Var;
                            }
                            obj = objectVolatile;
                            r1 = r1;
                            AtomicReference atomicReference2 = r1.qoPGr6Ce;
                            lf lfVar2 = ra.ow5vqvCr;
                            andSet = atomicReference2.getAndSet(lfVar2);
                            andSet.getClass();
                            if (andSet == ra.OnDfzHZD) {
                                w90Var.VgvYg0wo = x90Var;
                                w90Var.P7K7Inc8 = ygVar2;
                                w90Var.b2ZJblxo = r1;
                                w90Var.Qr9iLBAD = vnVar;
                                w90Var.jb9XjC4I = obj;
                                w90Var.ow5vqvCr = 3;
                                xe0 xe0Var = xe0.qoPGr6Ce;
                                m3 m3Var = new m3(1, w30.SgZGMMPL(w90Var));
                                m3Var.I5GHvsYW();
                                AtomicReference atomicReference3 = r1.qoPGr6Ce;
                                while (true) {
                                    if (atomicReference3.compareAndSet(lfVar2, m3Var)) {
                                        break;
                                    }
                                    if (atomicReference3.get() != lfVar2) {
                                        m3Var.P7K7Inc8(xe0Var);
                                        break;
                                    }
                                }
                                Object Ey6iv0m0 = m3Var.Ey6iv0m0();
                                if (Ey6iv0m0 == u9Var) {
                                }
                            }
                            if (x90Var != null) {
                                throw new ClassCastException();
                            }
                        }
                    }
                    l9 l9Var = w90Var.MdtA4re8;
                    l9Var.getClass();
                    x90Var = this;
                    ygVar2 = ygVar;
                    vnVar = (vn) l9Var.OnDfzHZD(re.VgvYg0wo);
                    obj = null;
                    if (x90Var != null) {
                    }
                }
            }
            if (r1 != 0) {
            }
            l9 l9Var2 = w90Var.MdtA4re8;
            l9Var2.getClass();
            x90Var = this;
            ygVar2 = ygVar;
            vnVar = (vn) l9Var2.OnDfzHZD(re.VgvYg0wo);
            obj = null;
            if (x90Var != null) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        w90Var = new w90(this, g9Var);
        Object obj22 = w90Var.eVhOlqcC;
        r1 = w90Var.ow5vqvCr;
        u9 u9Var2 = u9.NCTxEWno;
    }

    @Override // defpackage.yg
    public final Object OnDfzHZD(Object obj, g9 g9Var) {
        jb9XjC4I(obj);
        return xe0.qoPGr6Ce;
    }

    public final Object Qr9iLBAD() {
        lf lfVar = fn.OxcuoDLp;
        Object objectVolatile = b1.qoPGr6Ce.getObjectVolatile(this, b2ZJblxo);
        if (objectVolatile == lfVar) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.ol
    public final xg VgvYg0wo(l9 l9Var, int i, v2 v2Var) {
        return ((((i < 0 || i >= 2) && i != -2) || v2Var != v2.MdtA4re8) && !((i == 0 || i == -3) && v2Var == v2.NCTxEWno)) ? new n4(this, l9Var, i, v2Var) : this;
    }

    public final boolean eVhOlqcC(Object obj, Object obj2) {
        int i;
        lwWCatUu[] lwwcatuuArr;
        lf lfVar;
        synchronized (this) {
            Unsafe unsafe = b1.qoPGr6Ce;
            long j = b2ZJblxo;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !fn.qoPGr6Ce(objectVolatile, obj)) {
                return false;
            }
            if (fn.qoPGr6Ce(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.P7K7Inc8;
            if ((i2 & 1) != 0) {
                this.P7K7Inc8 = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.P7K7Inc8 = i3;
            lwWCatUu[] lwwcatuuArr2 = this.NCTxEWno;
            while (true) {
                y90[] y90VarArr = (y90[]) lwwcatuuArr2;
                if (y90VarArr != null) {
                    for (y90 y90Var : y90VarArr) {
                        if (y90Var != null) {
                            AtomicReference atomicReference = y90Var.qoPGr6Ce;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (lfVar = ra.OnDfzHZD)) {
                                    lf lfVar2 = ra.ow5vqvCr;
                                    if (obj3 != lfVar2) {
                                        while (!atomicReference.compareAndSet(obj3, lfVar2)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        ((m3) obj3).P7K7Inc8(xe0.qoPGr6Ce);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, lfVar)) {
                                        if (atomicReference.get() != obj3) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.P7K7Inc8;
                    if (i == i3) {
                        this.P7K7Inc8 = i3 + 1;
                        return true;
                    }
                    lwwcatuuArr = this.NCTxEWno;
                }
                lwwcatuuArr2 = lwwcatuuArr;
                i3 = i;
            }
        }
    }

    public final void jb9XjC4I(Object obj) {
        if (obj == null) {
            obj = fn.OxcuoDLp;
        }
        eVhOlqcC(null, obj);
    }

    @Override // defpackage.DK9slbsy
    public final lwWCatUu[] wxUZMvaN() {
        return new y90[2];
    }
}
