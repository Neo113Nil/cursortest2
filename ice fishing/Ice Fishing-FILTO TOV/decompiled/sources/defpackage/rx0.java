package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rx0 implements k5, wd1 {
    public static final a61 mOu10nynGul = new a61();
    public Object AvO7iQsrTN;
    public Object EljAMC1QTz;
    public Object OOA6hdeuvCS;
    public Object encWxUiV2;

    public rx0(Typeface typeface, yd0 yd0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.encWxUiV2 = typeface;
        this.OOA6hdeuvCS = yd0Var;
        this.AvO7iQsrTN = new zd0(1024);
        int GWasM1elztuh = yd0Var.GWasM1elztuh(6);
        if (GWasM1elztuh != 0) {
            int i5 = GWasM1elztuh + yd0Var.OOA6hdeuvCS;
            i = ((ByteBuffer) yd0Var.encWxUiV2).getInt(((ByteBuffer) yd0Var.encWxUiV2).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.EljAMC1QTz = new char[i * 2];
        int GWasM1elztuh2 = yd0Var.GWasM1elztuh(6);
        if (GWasM1elztuh2 != 0) {
            int i6 = GWasM1elztuh2 + yd0Var.OOA6hdeuvCS;
            i2 = ((ByteBuffer) yd0Var.encWxUiV2).getInt(((ByteBuffer) yd0Var.encWxUiV2).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            qb1 qb1Var = new qb1(this, i7);
            xd0 Yi7zF1RB1 = qb1Var.Yi7zF1RB1();
            int GWasM1elztuh3 = Yi7zF1RB1.GWasM1elztuh(4);
            Character.toChars(GWasM1elztuh3 != 0 ? ((ByteBuffer) Yi7zF1RB1.encWxUiV2).getInt(GWasM1elztuh3 + Yi7zF1RB1.OOA6hdeuvCS) : 0, (char[]) this.EljAMC1QTz, i7 * 2);
            xd0 Yi7zF1RB12 = qb1Var.Yi7zF1RB1();
            int GWasM1elztuh4 = Yi7zF1RB12.GWasM1elztuh(16);
            if (GWasM1elztuh4 != 0) {
                int i8 = GWasM1elztuh4 + Yi7zF1RB12.OOA6hdeuvCS;
                i3 = ((ByteBuffer) Yi7zF1RB12.encWxUiV2).getInt(((ByteBuffer) Yi7zF1RB12.encWxUiV2).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                o4.mE4lRynR("invalid metadata codepoint length");
                throw null;
            }
            zd0 zd0Var = (zd0) this.AvO7iQsrTN;
            xd0 Yi7zF1RB13 = qb1Var.Yi7zF1RB1();
            int GWasM1elztuh5 = Yi7zF1RB13.GWasM1elztuh(16);
            if (GWasM1elztuh5 != 0) {
                int i9 = GWasM1elztuh5 + Yi7zF1RB13.OOA6hdeuvCS;
                i4 = ((ByteBuffer) Yi7zF1RB13.encWxUiV2).getInt(((ByteBuffer) Yi7zF1RB13.encWxUiV2).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            zd0Var.GWasM1elztuh(qb1Var, 0, i4 - 1);
        }
    }

    public static void X1lG3V04pd(rx0 rx0Var, xi0 xi0Var) {
        rx0Var.getClass();
        xi0Var.getClass();
        if (((LinkedHashSet) rx0Var.AvO7iQsrTN).add(xi0Var)) {
            aj0 aj0Var = (aj0) rx0Var.EljAMC1QTz;
            aj0Var.getClass();
            if (xi0Var.X1lG3V04pd != null) {
                o4.iwATDS1i01k("Handler '", xi0Var, "' is already registered with a dispatcher");
                return;
            }
            aj0Var.OOA6hdeuvCS.addFirst(xi0Var);
            xi0Var.X1lG3V04pd = rx0Var;
            aj0Var.Yi7zF1RB1();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AvO7iQsrTN(long j, long j2, wg wgVar) {
        jj0 jj0Var;
        int i;
        long j3;
        if (wgVar instanceof jj0) {
            jj0Var = (jj0) wgVar;
            int i2 = jj0Var.JFJ3QoxA;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jj0Var.JFJ3QoxA = i2 - Integer.MIN_VALUE;
                jj0 jj0Var2 = jj0Var;
                Object obj = jj0Var2.encWxUiV2;
                i = jj0Var2.JFJ3QoxA;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    nj0 nj0Var = (nj0) this.OOA6hdeuvCS;
                    nj0 sb9fmtV8A = nj0Var != null ? nj0Var.sb9fmtV8A() : null;
                    j3 = 0;
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (sb9fmtV8A == null) {
                        nj0 nj0Var2 = (nj0) this.EljAMC1QTz;
                        if (nj0Var2 != null) {
                            jj0Var2.JFJ3QoxA = 1;
                            obj = nj0Var2.XmVeRDAr(j, j2, jj0Var2);
                        }
                    } else {
                        nj0 nj0Var3 = (nj0) this.OOA6hdeuvCS;
                        nj0 sb9fmtV8A2 = nj0Var3 != null ? nj0Var3.sb9fmtV8A() : null;
                        if (sb9fmtV8A2 != null) {
                            jj0Var2.JFJ3QoxA = 2;
                            obj = sb9fmtV8A2.XmVeRDAr(j, j2, jj0Var2);
                        }
                    }
                } else if (i == 1) {
                    o50.A1EKNP6CxJ(obj);
                    j3 = ((yd1) obj).GWasM1elztuh;
                } else {
                    if (i != 2) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                    j3 = ((yd1) obj).GWasM1elztuh;
                }
                return new yd1(j3);
            }
        }
        jj0Var = new jj0(this, wgVar);
        jj0 jj0Var22 = jj0Var;
        Object obj2 = jj0Var22.encWxUiV2;
        i = jj0Var22.JFJ3QoxA;
        if (i != 0) {
        }
        return new yd1(j3);
    }

    @Override // defpackage.td1
    public r3 E7jCp8Ls(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        if (((r3) this.AvO7iQsrTN) == null) {
            this.AvO7iQsrTN = r3Var3.X1lG3V04pd();
        }
        r3 r3Var4 = (r3) this.AvO7iQsrTN;
        if (r3Var4 == null) {
            o30.YXi2hvwn7WL("velocityVector");
            throw null;
        }
        int Yi7zF1RB1 = r3Var4.Yi7zF1RB1();
        int i = 0;
        while (true) {
            r3 r3Var5 = (r3) this.AvO7iQsrTN;
            if (i >= Yi7zF1RB1) {
                if (r3Var5 != null) {
                    return r3Var5;
                }
                o30.YXi2hvwn7WL("velocityVector");
                throw null;
            }
            if (r3Var5 == null) {
                o30.YXi2hvwn7WL("velocityVector");
                throw null;
            }
            r3Var5.OOA6hdeuvCS(((ha1) this.OOA6hdeuvCS).xqGvceK5x(i).X1lG3V04pd(j, r3Var.GWasM1elztuh(i), r3Var2.GWasM1elztuh(i), r3Var3.GWasM1elztuh(i)), i);
            i++;
        }
    }

    public void EljAMC1QTz(zi0 zi0Var, vi0 vi0Var) {
        aj0 aj0Var = (aj0) this.EljAMC1QTz;
        aj0Var.getClass();
        if (aj0Var.AvO7iQsrTN != 0) {
            return;
        }
        xi0 X1lG3V04pd = aj0Var.X1lG3V04pd(-1);
        aj0Var.EljAMC1QTz = X1lG3V04pd;
        aj0Var.AvO7iQsrTN = -1;
        aj0Var.encWxUiV2 = zi0Var;
        if (vi0Var != null) {
            if (X1lG3V04pd != null) {
                X1lG3V04pd.xqGvceK5x(vi0Var);
            }
            p51 p51Var = aj0Var.GWasM1elztuh;
            cj0 cj0Var = new cj0(vi0Var);
            p51Var.getClass();
            p51Var.JFJ3QoxA(null, cj0Var);
        }
    }

    public ph JFJ3QoxA() {
        ph phVar = (ph) ((wu) this.AvO7iQsrTN).GWasM1elztuh();
        if (phVar != null) {
            return phVar;
        }
        o4.jivtDDk9H("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10.xqGvceK5x(r1) == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:25:0x005d, B:29:0x0069), top: B:24:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Mjvvu5DE(wg wgVar) {
        bw0 bw0Var;
        int i;
        bh0 bh0Var;
        Throwable th;
        bh0 bh0Var2;
        rc rcVar = (rc) this.EljAMC1QTz;
        try {
            if (wgVar instanceof bw0) {
                bw0Var = (bw0) wgVar;
                int i2 = bw0Var.rQPn8YBR;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bw0Var.rQPn8YBR = i2 - Integer.MIN_VALUE;
                    Object obj = bw0Var.mOu10nynGul;
                    i = bw0Var.rQPn8YBR;
                    kc1 kc1Var = kc1.GWasM1elztuh;
                    Object obj2 = qh.OOA6hdeuvCS;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        if (!(rcVar.TpUsjqg3bxO() instanceof p00)) {
                            return kc1Var;
                        }
                        bh0Var = (bh0) this.OOA6hdeuvCS;
                        bw0Var.encWxUiV2 = bh0Var;
                        bw0Var.rQPn8YBR = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            bh0Var2 = bw0Var.encWxUiV2;
                            try {
                                o50.A1EKNP6CxJ(obj);
                                rcVar.qugwajBSa59j(kc1Var);
                                bh0Var2.AvO7iQsrTN(null);
                                return kc1Var;
                            } catch (Throwable th2) {
                                th = th2;
                                bh0Var2.AvO7iQsrTN(null);
                                throw th;
                            }
                        }
                        bh0 bh0Var3 = bw0Var.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                        bh0Var = bh0Var3;
                    }
                    if (rcVar.TpUsjqg3bxO() instanceof p00) {
                        bh0Var.AvO7iQsrTN(null);
                        return kc1Var;
                    }
                    bw0Var.encWxUiV2 = bh0Var;
                    bw0Var.rQPn8YBR = 2;
                    if (mOu10nynGul(bw0Var) != obj2) {
                        bh0Var2 = bh0Var;
                        rcVar.qugwajBSa59j(kc1Var);
                        bh0Var2.AvO7iQsrTN(null);
                        return kc1Var;
                    }
                    return obj2;
                }
            }
            if (rcVar.TpUsjqg3bxO() instanceof p00) {
            }
        } catch (Throwable th3) {
            bh0 bh0Var4 = bh0Var;
            th = th3;
            bh0Var2 = bh0Var4;
            bh0Var2.AvO7iQsrTN(null);
            throw th;
        }
        bw0Var = new bw0(this, wgVar);
        Object obj3 = bw0Var.mOu10nynGul;
        i = bw0Var.rQPn8YBR;
        kc1 kc1Var2 = kc1.GWasM1elztuh;
        Object obj22 = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
    }

    public void OOA6hdeuvCS(yk0 yk0Var, int i) {
        if (i != 1 && i != 0) {
            o4.OOA6hdeuvCS(mr0.AvO7iQsrTN("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.encWxUiV2).add(yk0Var)) {
            ((aj0) this.EljAMC1QTz).GWasM1elztuh(this, yk0Var, i);
        }
    }

    @Override // defpackage.td1
    public r3 WIEu4Ya2g8(r3 r3Var, r3 r3Var2, r3 r3Var3) {
        if (((r3) this.encWxUiV2) == null) {
            this.encWxUiV2 = r3Var3.X1lG3V04pd();
        }
        r3 r3Var4 = (r3) this.encWxUiV2;
        if (r3Var4 == null) {
            o30.YXi2hvwn7WL("endVelocityVector");
            throw null;
        }
        int Yi7zF1RB1 = r3Var4.Yi7zF1RB1();
        int i = 0;
        while (true) {
            r3 r3Var5 = (r3) this.encWxUiV2;
            if (i >= Yi7zF1RB1) {
                if (r3Var5 != null) {
                    return r3Var5;
                }
                o30.YXi2hvwn7WL("endVelocityVector");
                throw null;
            }
            if (r3Var5 == null) {
                o30.YXi2hvwn7WL("endVelocityVector");
                throw null;
            }
            r3Var5.OOA6hdeuvCS(((ha1) this.OOA6hdeuvCS).xqGvceK5x(i).OOA6hdeuvCS(r3Var.GWasM1elztuh(i), r3Var2.GWasM1elztuh(i), r3Var3.GWasM1elztuh(i)), i);
            i++;
        }
    }

    public r3 XnEVoBF0td1l(long j, r3 r3Var, r3 r3Var2) {
        if (((r3) this.AvO7iQsrTN) == null) {
            this.AvO7iQsrTN = r3Var.X1lG3V04pd();
        }
        r3 r3Var3 = (r3) this.AvO7iQsrTN;
        if (r3Var3 == null) {
            o30.YXi2hvwn7WL("velocityVector");
            throw null;
        }
        int Yi7zF1RB1 = r3Var3.Yi7zF1RB1();
        int i = 0;
        while (true) {
            r3 r3Var4 = (r3) this.AvO7iQsrTN;
            if (i >= Yi7zF1RB1) {
                if (r3Var4 != null) {
                    return r3Var4;
                }
                o30.YXi2hvwn7WL("velocityVector");
                throw null;
            }
            if (r3Var4 == null) {
                o30.YXi2hvwn7WL("velocityVector");
                throw null;
            }
            j6IIN2O8eOU j6iin2o8eou = (j6IIN2O8eOU) this.OOA6hdeuvCS;
            r3Var.getClass();
            long j2 = j / 1000000;
            bs GWasM1elztuh = ((cs) j6iin2o8eou.EljAMC1QTz).GWasM1elztuh(r3Var2.GWasM1elztuh(i));
            long j3 = GWasM1elztuh.X1lG3V04pd;
            r3Var4.OOA6hdeuvCS((((Math.signum(GWasM1elztuh.GWasM1elztuh) * r0.GWasM1elztuh(j3 > 0 ? j2 / j3 : 1.0f).Yi7zF1RB1) * GWasM1elztuh.Yi7zF1RB1) / j3) * 1000.0f, i);
            i++;
        }
    }

    @Override // defpackage.td1
    public long Yi7zF1RB1(r3 r3Var, r3 r3Var2, r3 r3Var3) {
        int Yi7zF1RB1 = r3Var.Yi7zF1RB1();
        long j = 0;
        for (int i = 0; i < Yi7zF1RB1; i++) {
            j = Math.max(j, ((ha1) this.OOA6hdeuvCS).xqGvceK5x(i).xqGvceK5x(r3Var.GWasM1elztuh(i), r3Var2.GWasM1elztuh(i), r3Var3.GWasM1elztuh(i)));
        }
        return j;
    }

    public we1 YmKjaVtbfp5Z(va vaVar, String str) {
        we1 we1Var;
        we1 GWasM1elztuh;
        synchronized (((x51) this.encWxUiV2)) {
            try {
                we1Var = (we1) ((ef1) this.OOA6hdeuvCS).GWasM1elztuh.get(str);
                if (vaVar.X1lG3V04pd(we1Var)) {
                    af1 af1Var = (af1) this.EljAMC1QTz;
                    if (af1Var instanceof zw0) {
                        zw0 zw0Var = (zw0) af1Var;
                        we1Var.getClass();
                        w90 w90Var = zw0Var.xqGvceK5x;
                        if (w90Var != null) {
                            d dVar = zw0Var.OOA6hdeuvCS;
                            dVar.getClass();
                            b70.uFEq9NpZ(we1Var, dVar, w90Var);
                        }
                    }
                    we1Var.getClass();
                } else {
                    of0 of0Var = new of0((xh) this.AvO7iQsrTN);
                    of0Var.GWasM1elztuh.put(fb1.eUH21U3apd, str);
                    af1 af1Var2 = (af1) this.EljAMC1QTz;
                    af1Var2.getClass();
                    try {
                        try {
                            GWasM1elztuh = af1Var2.X1lG3V04pd(vaVar, of0Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = vaVar.GWasM1elztuh;
                            cls.getClass();
                            GWasM1elztuh = af1Var2.GWasM1elztuh(cls);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = vaVar.GWasM1elztuh;
                        cls2.getClass();
                        GWasM1elztuh = af1Var2.Yi7zF1RB1(cls2, of0Var);
                    }
                    we1Var = GWasM1elztuh;
                    ef1 ef1Var = (ef1) this.OOA6hdeuvCS;
                    ef1Var.getClass();
                    we1Var.getClass();
                    we1 we1Var2 = (we1) ef1Var.GWasM1elztuh.put(str, we1Var);
                    if (we1Var2 != null) {
                        we1Var2.Yi7zF1RB1();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return we1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object encWxUiV2(long j, wg wgVar) {
        kj0 kj0Var;
        int i;
        long j2;
        if (wgVar instanceof kj0) {
            kj0Var = (kj0) wgVar;
            int i2 = kj0Var.JFJ3QoxA;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kj0Var.JFJ3QoxA = i2 - Integer.MIN_VALUE;
                Object obj = kj0Var.encWxUiV2;
                i = kj0Var.JFJ3QoxA;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    nj0 nj0Var = (nj0) this.OOA6hdeuvCS;
                    nj0 sb9fmtV8A = nj0Var != null ? nj0Var.sb9fmtV8A() : null;
                    if (sb9fmtV8A == null) {
                        j2 = 0;
                        return new yd1(j2);
                    }
                    kj0Var.JFJ3QoxA = 1;
                    obj = sb9fmtV8A.OGdJP42E(j, kj0Var);
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (obj == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                j2 = ((yd1) obj).GWasM1elztuh;
                return new yd1(j2);
            }
        }
        kj0Var = new kj0(this, wgVar);
        Object obj2 = kj0Var.encWxUiV2;
        i = kj0Var.JFJ3QoxA;
        if (i != 0) {
        }
        j2 = ((yd1) obj2).GWasM1elztuh;
        return new yd1(j2);
    }

    @Override // defpackage.td1
    public r3 iwATDS1i01k(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        if (((r3) this.EljAMC1QTz) == null) {
            this.EljAMC1QTz = r3Var.X1lG3V04pd();
        }
        r3 r3Var4 = (r3) this.EljAMC1QTz;
        if (r3Var4 == null) {
            o30.YXi2hvwn7WL("valueVector");
            throw null;
        }
        int Yi7zF1RB1 = r3Var4.Yi7zF1RB1();
        int i = 0;
        while (true) {
            r3 r3Var5 = (r3) this.EljAMC1QTz;
            if (i >= Yi7zF1RB1) {
                if (r3Var5 != null) {
                    return r3Var5;
                }
                o30.YXi2hvwn7WL("valueVector");
                throw null;
            }
            if (r3Var5 == null) {
                o30.YXi2hvwn7WL("valueVector");
                throw null;
            }
            r3Var5.OOA6hdeuvCS(((ha1) this.OOA6hdeuvCS).xqGvceK5x(i).Yi7zF1RB1(j, r3Var.GWasM1elztuh(i), r3Var2.GWasM1elztuh(i), r3Var3.GWasM1elztuh(i)), i);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mOu10nynGul(wg wgVar) {
        ii iiVar;
        int i;
        bi biVar;
        fj fjVar = (fj) this.encWxUiV2;
        if (wgVar instanceof ii) {
            iiVar = (ii) wgVar;
            int i2 = iiVar.JFJ3QoxA;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iiVar.JFJ3QoxA = i2 - Integer.MIN_VALUE;
                Object obj = iiVar.encWxUiV2;
                i = iiVar.JFJ3QoxA;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    List list = (List) this.AvO7iQsrTN;
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (list == null || list.isEmpty()) {
                        iiVar.JFJ3QoxA = 1;
                        obj = fj.encWxUiV2(fjVar, false, iiVar);
                    } else {
                        r21 mOu10nynGul2 = fjVar.mOu10nynGul();
                        li liVar = new li(fjVar, this, null);
                        iiVar.JFJ3QoxA = 2;
                        obj = mOu10nynGul2.Yi7zF1RB1(liVar, iiVar);
                    }
                    return qhVar;
                }
                if (i == 1) {
                    o50.A1EKNP6CxJ(obj);
                    biVar = (bi) obj;
                } else {
                    if (i != 2) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                    biVar = (bi) obj;
                }
                fjVar.AvO7iQsrTN.WdrkLMV3xh(biVar);
                return kc1.GWasM1elztuh;
            }
        }
        iiVar = new ii(this, wgVar);
        Object obj2 = iiVar.encWxUiV2;
        i = iiVar.JFJ3QoxA;
        if (i != 0) {
        }
        fjVar.AvO7iQsrTN.WdrkLMV3xh(biVar);
        return kc1.GWasM1elztuh;
    }

    public void xqGvceK5x(zi0 zi0Var) {
        if (((LinkedHashSet) this.encWxUiV2).add(zi0Var)) {
            ((aj0) this.EljAMC1QTz).GWasM1elztuh(this, zi0Var, -1);
        }
    }

    public rx0(w60 w60Var, px0 px0Var, va vaVar, ao0 ao0Var) {
        w60Var.getClass();
        px0Var.getClass();
        this.OOA6hdeuvCS = w60Var;
        this.encWxUiV2 = px0Var;
        this.EljAMC1QTz = vaVar;
        this.AvO7iQsrTN = ao0Var;
        p40.GWasM1elztuh(vaVar);
    }

    public rx0(ef1 ef1Var, af1 af1Var, xh xhVar) {
        ef1Var.getClass();
        af1Var.getClass();
        xhVar.getClass();
        this.OOA6hdeuvCS = ef1Var;
        this.EljAMC1QTz = af1Var;
        this.AvO7iQsrTN = xhVar;
        this.encWxUiV2 = new x51(2);
    }

    public /* synthetic */ rx0(Object obj) {
        this.OOA6hdeuvCS = obj;
    }

    public rx0(gs gsVar) {
        this(new ha1(3, gsVar));
    }
}
