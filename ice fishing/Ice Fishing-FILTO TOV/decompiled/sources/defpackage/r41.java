package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r41 {
    public final hv GWasM1elztuh;
    public boolean X1lG3V04pd;
    public el0 encWxUiV2;
    public q41 mOu10nynGul;
    public final AtomicReference Yi7zF1RB1 = new AtomicReference(null);
    public final k4 xqGvceK5x = new k4(12, this);
    public final E7jCp8Ls OOA6hdeuvCS = new E7jCp8Ls(20, this);
    public final rg0 EljAMC1QTz = new rg0(new q41[16]);
    public final Object AvO7iQsrTN = new Object();
    public long JFJ3QoxA = -1;

    public r41(hv hvVar) {
        this.GWasM1elztuh = hvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:11:0x0078, B:13:0x0080, B:15:0x0090, B:17:0x0085, B:20:0x0021, B:23:0x002d, B:25:0x0041, B:27:0x004f, B:29:0x0059, B:31:0x0069, B:39:0x0074, B:42:0x0094), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void GWasM1elztuh(vz0 vz0Var) {
        int i;
        int i2;
        synchronized (this.AvO7iQsrTN) {
            try {
                rg0 rg0Var = this.EljAMC1QTz;
                int i3 = rg0Var.AvO7iQsrTN;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = rg0Var.OOA6hdeuvCS;
                    if (i4 < i3) {
                        q41 q41Var = (q41) objArr[i4];
                        zf0 zf0Var = (zf0) q41Var.EljAMC1QTz.rQPn8YBR(vz0Var);
                        if (zf0Var != null) {
                            Object[] objArr2 = zf0Var.Yi7zF1RB1;
                            int[] iArr = zf0Var.X1lG3V04pd;
                            long[] jArr = zf0Var.GWasM1elztuh;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i6 << 3) + i8;
                                                i2 = i8;
                                                Object obj = objArr2[i9];
                                                int i10 = iArr[i9];
                                                q41Var.X1lG3V04pd(vz0Var, obj);
                                            } else {
                                                i2 = i8;
                                            }
                                            j >>= 8;
                                            i8 = i2 + 1;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (q41Var.EljAMC1QTz.JFJ3QoxA()) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = rg0Var.OOA6hdeuvCS;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (q41Var.EljAMC1QTz.JFJ3QoxA()) {
                        }
                        i4 = i + 1;
                    } else {
                        int i11 = i3 - i5;
                        Arrays.fill(objArr, i11, i3, (Object) null);
                        rg0Var.AvO7iQsrTN = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [rg0] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X1lG3V04pd(Object obj, hv hvVar, wu wuVar) {
        ?? r6;
        Object obj2;
        q41 q41Var;
        boolean z;
        q41 q41Var2;
        long j;
        long j2;
        q41 q41Var3;
        y31 sa1Var;
        long j3;
        zf0 zf0Var;
        int i;
        long j4;
        zf0 zf0Var2;
        long XnEVoBF0td1l = z50.XnEVoBF0td1l();
        synchronized (this.AvO7iQsrTN) {
            r6 = this.EljAMC1QTz;
            Object[] objArr = r6.OOA6hdeuvCS;
            int i2 = r6.AvO7iQsrTN;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((q41) obj2).GWasM1elztuh == hvVar) {
                    break;
                } else {
                    i3++;
                }
            }
            q41Var = (q41) obj2;
            z = true;
            if (q41Var == null) {
                hvVar.getClass();
                fb1.XnEVoBF0td1l(1, hvVar);
                q41Var = new q41(hvVar);
                r6.Yi7zF1RB1(q41Var);
            }
            q41Var2 = this.mOu10nynGul;
            j = this.JFJ3QoxA;
        }
        long j5 = r6;
        if (j != -1) {
            j5 = r6;
            if (j != XnEVoBF0td1l) {
                tq0.GWasM1elztuh("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + XnEVoBF0td1l + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                j5 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.AvO7iQsrTN) {
                try {
                    this.mOu10nynGul = q41Var;
                    this.JFJ3QoxA = XnEVoBF0td1l;
                } catch (Throwable th) {
                    th = th;
                    j2 = j5;
                }
            }
            E7jCp8Ls e7jCp8Ls = this.OOA6hdeuvCS;
            Object obj3 = q41Var.Yi7zF1RB1;
            zf0 zf0Var3 = q41Var.X1lG3V04pd;
            int i4 = q41Var.xqGvceK5x;
            q41Var.Yi7zF1RB1 = obj;
            q41Var.X1lG3V04pd = (zf0) q41Var.EljAMC1QTz.AvO7iQsrTN(obj);
            if (q41Var.xqGvceK5x == -1) {
                q41Var.xqGvceK5x = Long.hashCode(e41.JFJ3QoxA().AvO7iQsrTN());
            }
            px pxVar = q41Var.mOu10nynGul;
            rg0 uFEq9NpZ = z50.uFEq9NpZ();
            try {
                uFEq9NpZ.Yi7zF1RB1(pxVar);
                if (e7jCp8Ls == null) {
                    wuVar.GWasM1elztuh();
                    q41Var3 = q41Var;
                } else {
                    y31 y31Var = (y31) e41.Yi7zF1RB1.OOA6hdeuvCS();
                    if (y31Var instanceof sa1) {
                        q41Var3 = q41Var;
                        if (((sa1) y31Var).jivtDDk9H == z50.XnEVoBF0td1l()) {
                            hv hvVar2 = ((sa1) y31Var).Mjvvu5DE;
                            hv hvVar3 = ((sa1) y31Var).mE4lRynR;
                            try {
                                ((sa1) y31Var).Mjvvu5DE = e41.rQPn8YBR(e7jCp8Ls, hvVar2, true);
                                ((sa1) y31Var).mE4lRynR = hvVar3;
                                wuVar.GWasM1elztuh();
                                ((sa1) y31Var).Mjvvu5DE = hvVar2;
                                ((sa1) y31Var).mE4lRynR = hvVar3;
                            } catch (Throwable th2) {
                                ((sa1) y31Var).Mjvvu5DE = hvVar2;
                                ((sa1) y31Var).mE4lRynR = hvVar3;
                                throw th2;
                            }
                        }
                    } else {
                        q41Var3 = q41Var;
                    }
                    if (y31Var == null || (y31Var instanceof lg0)) {
                        sa1Var = new sa1(y31Var instanceof lg0 ? (lg0) y31Var : null, e7jCp8Ls, null, true, false);
                    } else {
                        sa1Var = y31Var.Y6hRI1cF8(e7jCp8Ls);
                    }
                    try {
                        y31 JFJ3QoxA = sa1Var.JFJ3QoxA();
                        try {
                            wuVar.GWasM1elztuh();
                            y31.YmKjaVtbfp5Z(JFJ3QoxA);
                            sa1Var.X1lG3V04pd();
                        } catch (Throwable th3) {
                            try {
                                y31.YmKjaVtbfp5Z(JFJ3QoxA);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    sa1Var.X1lG3V04pd();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    uFEq9NpZ.rQPn8YBR(uFEq9NpZ.AvO7iQsrTN - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                uFEq9NpZ.rQPn8YBR(uFEq9NpZ.AvO7iQsrTN - 1);
                q41 q41Var4 = q41Var3;
                Object obj4 = q41Var4.Yi7zF1RB1;
                obj4.getClass();
                int i5 = q41Var4.xqGvceK5x;
                zf0 zf0Var4 = q41Var4.X1lG3V04pd;
                if (zf0Var4 != null) {
                    try {
                        long[] jArr = zf0Var4.GWasM1elztuh;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j6 = jArr[i6];
                                boolean z2 = z;
                                zf0 zf0Var5 = zf0Var4;
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j6 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j6;
                                            zf0Var2 = zf0Var5;
                                            Object obj5 = zf0Var2.Yi7zF1RB1[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = zf0Var2.X1lG3V04pd[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    q41Var4.X1lG3V04pd(obj4, obj5);
                                                }
                                                if (z3) {
                                                    zf0Var2.EljAMC1QTz(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.AvO7iQsrTN) {
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j6;
                                            zf0Var2 = zf0Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j7 = j3;
                                        zf0Var5 = zf0Var2;
                                        j6 = j4 >> 8;
                                        j = j7;
                                    }
                                    zf0Var = zf0Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    zf0Var = zf0Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                zf0Var4 = zf0Var;
                                z = z2;
                                j = j3;
                            }
                            q41Var4.Yi7zF1RB1 = obj3;
                            q41Var4.X1lG3V04pd = zf0Var3;
                            q41Var4.xqGvceK5x = i4;
                            synchronized (this.AvO7iQsrTN) {
                                this.mOu10nynGul = q41Var2;
                                this.JFJ3QoxA = j3;
                            }
                            return;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.AvO7iQsrTN) {
                            this.mOu10nynGul = q41Var2;
                            this.JFJ3QoxA = j2;
                        }
                        throw th;
                    }
                }
                j3 = j;
                q41Var4.Yi7zF1RB1 = obj3;
                q41Var4.X1lG3V04pd = zf0Var3;
                q41Var4.xqGvceK5x = i4;
                synchronized (this.AvO7iQsrTN) {
                }
            } catch (Throwable th9) {
                th = th9;
                uFEq9NpZ.rQPn8YBR(uFEq9NpZ.AvO7iQsrTN - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Yi7zF1RB1() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.AvO7iQsrTN) {
            z = this.X1lG3V04pd;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.Yi7zF1RB1;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        we.Yi7zF1RB1("Unexpected notification");
                        throw new vc();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.AvO7iQsrTN) {
                rg0 rg0Var = this.EljAMC1QTz;
                Object[] objArr = rg0Var.OOA6hdeuvCS;
                int i = rg0Var.AvO7iQsrTN;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((q41) objArr[i2]).GWasM1elztuh(set) || z2;
                }
            }
        }
    }

    public final void xqGvceK5x() {
        k4 k4Var = this.xqGvceK5x;
        e41.OOA6hdeuvCS(e41.GWasM1elztuh);
        synchronized (e41.X1lG3V04pd) {
            e41.encWxUiV2 = rb.gHe2tSmr6w(e41.encWxUiV2, k4Var);
        }
        this.encWxUiV2 = new el0(k4Var);
    }
}
