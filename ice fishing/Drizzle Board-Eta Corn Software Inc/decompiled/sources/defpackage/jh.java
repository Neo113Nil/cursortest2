package defpackage;

import com.kolosta.rejin.jilosa.data.local.BoardDatabase_Impl;
import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jh extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public final /* synthetic */ Object Qr9iLBAD;
    public int b2ZJblxo;
    public Object eVhOlqcC;
    public final /* synthetic */ Object jb9XjC4I;
    public Object k3x7lurq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(u90 u90Var, xg xgVar, x90 x90Var, Object obj, g9 g9Var) {
        super(2, g9Var);
        this.P7K7Inc8 = 1;
        this.k3x7lurq = u90Var;
        this.Qr9iLBAD = xgVar;
        this.jb9XjC4I = x90Var;
        this.eVhOlqcC = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01aa, code lost:
    
        if (r2.P7K7Inc8(r25) == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0226, code lost:
    
        if (r8.NCTxEWno(r9, r25) == r10) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0206, code lost:
    
        if (r8.NCTxEWno(r9, r25) == r10) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x021d, code lost:
    
        if (defpackage.fn.eVhOlqcC(r3, r5, r25) == r10) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0284, code lost:
    
        if (r0 == r10) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
    
        if (defpackage.fn.fVMzMhyS((defpackage.l9) r10, r11, r25) == r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009c, code lost:
    
        if (r10 == r9) goto L41;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00da A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:19:0x00d6, B:21:0x00da, B:23:0x00e8, B:25:0x00ee, B:29:0x00f3, B:31:0x00f7), top: B:18:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0092  */
    /* JADX WARN: Type inference failed for: r0v20, types: [g9] */
    /* JADX WARN: Type inference failed for: r3v14, types: [dl] */
    /* JADX WARN: Type inference failed for: r3v17, types: [ot] */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        qt qtVar;
        dl dlVar;
        ot otVar;
        m3 m3Var;
        Object fVMzMhyS;
        yg ygVar;
        long j;
        boolean z;
        Object lDXGDhIF;
        nw nwVar;
        ReentrantLock reentrantLock;
        boolean z2;
        int i = 2;
        g9 g9Var = null;
        switch (this.P7K7Inc8) {
            case 0:
                x90 x90Var = (x90) this.jb9XjC4I;
                u9 u9Var = u9.NCTxEWno;
                int i2 = this.b2ZJblxo;
                if (i2 == 0) {
                    fn.SgZGMMPL(obj);
                    int ordinal = ((k70) this.eVhOlqcC).ordinal();
                    if (ordinal == 0) {
                        xg xgVar = (xg) this.Qr9iLBAD;
                        this.b2ZJblxo = 1;
                        if (xgVar.NCTxEWno(x90Var, this) == u9Var) {
                            return u9Var;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new d7();
                        }
                        Object obj2 = this.k3x7lurq;
                        if (obj2 == le0.jb9XjC4I) {
                            m1.b2ZJblxo("MutableStateFlow.resetReplayCache is not supported");
                            return null;
                        }
                        x90Var.eVhOlqcC(null, obj2);
                    }
                } else {
                    if (i2 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                }
                return xe0.qoPGr6Ce;
            case 1:
                xe0 xe0Var = xe0.qoPGr6Ce;
                xg xgVar2 = (xg) this.Qr9iLBAD;
                x90 x90Var2 = (x90) this.jb9XjC4I;
                u9 u9Var2 = u9.NCTxEWno;
                int i3 = this.b2ZJblxo;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            fn.SgZGMMPL(obj);
                            this.b2ZJblxo = 3;
                            break;
                        } else if (i3 != 3 && i3 != 4) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    fn.SgZGMMPL(obj);
                    return xe0Var;
                }
                fn.SgZGMMPL(obj);
                u90 u90Var = (u90) this.k3x7lurq;
                if (u90Var == l70.qoPGr6Ce) {
                    this.b2ZJblxo = 1;
                    break;
                } else if (u90Var == l70.NCTxEWno) {
                    la0 b2ZJblxo = x90Var2.b2ZJblxo();
                    ih ihVar = new ih(2, null);
                    this.b2ZJblxo = 2;
                    break;
                } else {
                    la0 b2ZJblxo2 = x90Var2.b2ZJblxo();
                    s90 s90Var = new s90(u90Var, null);
                    int i4 = fh.qoPGr6Ce;
                    uf ufVar = uf.NCTxEWno;
                    v2 v2Var = v2.NCTxEWno;
                    xg lDXGDhIF2 = ra.lDXGDhIF(ra.lDXGDhIF(new mcXgUFR8(new r4(s90Var, b2ZJblxo2, ufVar, -2, v2Var), new t90(2, null), 18, false)));
                    jh jhVar = new jh(xgVar2, x90Var2, this.eVhOlqcC, null);
                    this.b2ZJblxo = 4;
                    Object NCTxEWno = ra.VgvYg0wo(new r4(new eh(jhVar, (g9) null, 0), lDXGDhIF2, ufVar, -2, v2Var), 0).NCTxEWno(iw.NCTxEWno, this);
                    if (NCTxEWno != u9Var2) {
                        NCTxEWno = xe0Var;
                    }
                    if (NCTxEWno != u9Var2) {
                        NCTxEWno = xe0Var;
                        break;
                    }
                }
                return u9Var2;
            case 2:
                u9 u9Var3 = u9.NCTxEWno;
                int i5 = this.b2ZJblxo;
                try {
                    if (i5 == 0) {
                        fn.SgZGMMPL(obj);
                        qtVar = (qt) this.Qr9iLBAD;
                        ?? r3 = (dl) this.jb9XjC4I;
                        this.eVhOlqcC = qtVar;
                        this.k3x7lurq = (bb0) r3;
                        this.b2ZJblxo = 1;
                        dlVar = r3;
                        break;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            otVar = (ot) this.eVhOlqcC;
                            try {
                                fn.SgZGMMPL(obj);
                                otVar.VgvYg0wo(null);
                                return xe0.qoPGr6Ce;
                            } catch (Throwable th) {
                                th = th;
                                otVar.VgvYg0wo(null);
                                throw th;
                            }
                        }
                        dl dlVar2 = (dl) ((bb0) this.k3x7lurq);
                        ?? r32 = (ot) this.eVhOlqcC;
                        fn.SgZGMMPL(obj);
                        dlVar = dlVar2;
                        qtVar = r32;
                    }
                    y7 y7Var = new y7(dlVar, null);
                    this.eVhOlqcC = qtVar;
                    this.k3x7lurq = null;
                    this.b2ZJblxo = 2;
                    if (ra.OnDfzHZD(y7Var, this) != u9Var3) {
                        otVar = qtVar;
                        otVar.VgvYg0wo(null);
                        return xe0.qoPGr6Ce;
                    }
                    return u9Var3;
                } catch (Throwable th2) {
                    th = th2;
                    otVar = qtVar;
                    otVar.VgvYg0wo(null);
                    throw th;
                }
            case 3:
                u9 u9Var4 = u9.NCTxEWno;
                int i6 = this.b2ZJblxo;
                if (i6 == 0) {
                    fn.SgZGMMPL(obj);
                    j9 OnDfzHZD = ((t9) this.eVhOlqcC).VgvYg0wo().OnDfzHZD(re.MdtA4re8);
                    OnDfzHZD.getClass();
                    n9 n9Var = (n9) OnDfzHZD;
                    v30 v30Var = (v30) this.k3x7lurq;
                    l9 WYNAV5pd = fn.WYNAV5pd(n9Var, new kd0(n9Var));
                    l9 eVhOlqcC = WYNAV5pd.eVhOlqcC(new jc0(WYNAV5pd, v30Var.Qr9iLBAD));
                    m3Var = (m3) this.Qr9iLBAD;
                    y7 y7Var2 = (y7) this.jb9XjC4I;
                    this.eVhOlqcC = m3Var;
                    this.b2ZJblxo = 1;
                    fVMzMhyS = fn.fVMzMhyS(eVhOlqcC, y7Var2, this);
                    if (fVMzMhyS == u9Var4) {
                        return u9Var4;
                    }
                } else {
                    if (i6 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r0 = (g9) this.eVhOlqcC;
                    fn.SgZGMMPL(obj);
                    m3Var = r0;
                    fVMzMhyS = obj;
                }
                m3Var.P7K7Inc8(fVMzMhyS);
                return xe0.qoPGr6Ce;
            default:
                int[] iArr = (int[]) this.Qr9iLBAD;
                ie0 ie0Var = (ie0) this.k3x7lurq;
                u9 u9Var5 = u9.NCTxEWno;
                int i7 = this.b2ZJblxo;
                if (i7 == 0) {
                    fn.SgZGMMPL(obj);
                    ygVar = (yg) this.eVhOlqcC;
                    nw nwVar2 = ie0Var.Qr9iLBAD;
                    ReentrantLock reentrantLock2 = nwVar2.qoPGr6Ce;
                    reentrantLock2.lock();
                    try {
                        boolean z3 = false;
                        for (int i8 : iArr) {
                            long[] jArr = nwVar2.NCTxEWno;
                            long j2 = jArr[i8];
                            jArr[i8] = j2 + 1;
                            if (j2 == 0) {
                                nwVar2.wxUZMvaN = true;
                                z3 = true;
                            }
                        }
                        j = 1;
                        if (!z3 && !nwVar2.wxUZMvaN) {
                            if (!nwVar2.P7K7Inc8) {
                                z = false;
                                reentrantLock2.unlock();
                                if (z) {
                                    BoardDatabase_Impl boardDatabase_Impl = ie0Var.qoPGr6Ce;
                                    this.eVhOlqcC = ygVar;
                                    this.b2ZJblxo = 1;
                                    lDXGDhIF = fn.lDXGDhIF(boardDatabase_Impl, false, this);
                                    break;
                                }
                                l20 l20Var = new l20();
                                tg0 tg0Var = ie0Var.jb9XjC4I;
                                q4 q4Var = new q4(l20Var, ygVar, (String[]) this.jb9XjC4I, iArr);
                                this.eVhOlqcC = null;
                                this.b2ZJblxo = 3;
                                tg0Var.gjV1z5T1(q4Var, this);
                                return u9Var5;
                            }
                        }
                        z = true;
                        reentrantLock2.unlock();
                        if (z) {
                        }
                        l20 l20Var2 = new l20();
                        tg0 tg0Var2 = ie0Var.jb9XjC4I;
                        q4 q4Var2 = new q4(l20Var2, ygVar, (String[]) this.jb9XjC4I, iArr);
                        this.eVhOlqcC = null;
                        this.b2ZJblxo = 3;
                        tg0Var2.gjV1z5T1(q4Var2, this);
                        return u9Var5;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        ygVar = (yg) this.eVhOlqcC;
                        fn.SgZGMMPL(obj);
                        j = 1;
                        try {
                            l20 l20Var22 = new l20();
                            tg0 tg0Var22 = ie0Var.jb9XjC4I;
                            q4 q4Var22 = new q4(l20Var22, ygVar, (String[]) this.jb9XjC4I, iArr);
                            this.eVhOlqcC = null;
                            this.b2ZJblxo = 3;
                            tg0Var22.gjV1z5T1(q4Var22, this);
                            return u9Var5;
                        } catch (Throwable th4) {
                            th = th4;
                            nwVar = ie0Var.Qr9iLBAD;
                            iArr.getClass();
                            reentrantLock = nwVar.qoPGr6Ce;
                            reentrantLock.lock();
                            z2 = false;
                            while (r5 < r4) {
                            }
                            if (!z2) {
                                boolean z4 = nwVar.P7K7Inc8;
                            }
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    if (i7 != 3) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        fn.SgZGMMPL(obj);
                        throw new d7();
                    } catch (Throwable th5) {
                        th = th5;
                        j = 1;
                        nwVar = ie0Var.Qr9iLBAD;
                        iArr.getClass();
                        reentrantLock = nwVar.qoPGr6Ce;
                        reentrantLock.lock();
                        try {
                            z2 = false;
                            for (int i9 : iArr) {
                                long[] jArr2 = nwVar.NCTxEWno;
                                long j3 = jArr2[i9];
                                jArr2[i9] = j3 - j;
                                if (j3 == j) {
                                    nwVar.wxUZMvaN = true;
                                    z2 = true;
                                }
                            }
                            if (!z2 && !nwVar.wxUZMvaN) {
                                boolean z42 = nwVar.P7K7Inc8;
                            }
                            reentrantLock.unlock();
                            throw th;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                }
                ygVar = (yg) this.eVhOlqcC;
                fn.SgZGMMPL(obj);
                lDXGDhIF = obj;
                j = 1;
                rq rqVar = new rq(ie0Var, g9Var, i);
                this.eVhOlqcC = ygVar;
                this.b2ZJblxo = 2;
                break;
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        switch (i) {
            case 0:
                return ((jh) lDXGDhIF((g9) obj2, (k70) obj)).OxcuoDLp(xe0Var);
            case 1:
                return ((jh) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 2:
                return ((jh) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 3:
                return ((jh) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            default:
                ((jh) lDXGDhIF((g9) obj2, (yg) obj)).OxcuoDLp(xe0Var);
                return u9.NCTxEWno;
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.Serializable, java.lang.String[]] */
    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        Object obj2 = this.jb9XjC4I;
        Object obj3 = this.Qr9iLBAD;
        switch (i) {
            case 0:
                jh jhVar = new jh((xg) obj3, (x90) obj2, this.k3x7lurq, g9Var);
                jhVar.eVhOlqcC = obj;
                return jhVar;
            case 1:
                return new jh((u90) this.k3x7lurq, (xg) obj3, (x90) obj2, this.eVhOlqcC, g9Var);
            case 2:
                return new jh((qt) obj3, (dl) obj2, g9Var);
            case 3:
                jh jhVar2 = new jh((v30) this.k3x7lurq, (m3) obj3, (y7) obj2, g9Var, 3);
                jhVar2.eVhOlqcC = obj;
                return jhVar2;
            default:
                jh jhVar3 = new jh(this.k3x7lurq, obj3, (Serializable) obj2, g9Var, 4);
                jhVar3.eVhOlqcC = obj;
                return jhVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(qt qtVar, dl dlVar, g9 g9Var) {
        super(2, g9Var);
        this.P7K7Inc8 = 2;
        this.Qr9iLBAD = qtVar;
        this.jb9XjC4I = dlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(xg xgVar, x90 x90Var, Object obj, g9 g9Var) {
        super(2, g9Var);
        this.P7K7Inc8 = 0;
        this.Qr9iLBAD = xgVar;
        this.jb9XjC4I = x90Var;
        this.k3x7lurq = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh(Object obj, Object obj2, Serializable serializable, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.k3x7lurq = obj;
        this.Qr9iLBAD = obj2;
        this.jb9XjC4I = serializable;
    }
}
