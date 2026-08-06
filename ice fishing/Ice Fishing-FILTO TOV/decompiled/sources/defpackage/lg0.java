package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class lg0 extends y31 {
    public static final int[] uFEq9NpZ = new int[0];
    public int AvO7iQsrTN;
    public int E7jCp8Ls;
    public final hv EljAMC1QTz;
    public c41 JFJ3QoxA;
    public final hv OOA6hdeuvCS;
    public boolean XnEVoBF0td1l;
    public ig0 encWxUiV2;
    public ArrayList mOu10nynGul;
    public int[] rQPn8YBR;

    public lg0(long j, c41 c41Var, hv hvVar, hv hvVar2) {
        super(j, c41Var);
        this.OOA6hdeuvCS = hvVar;
        this.EljAMC1QTz = hvVar2;
        this.JFJ3QoxA = c41.mOu10nynGul;
        this.rQPn8YBR = uFEq9NpZ;
        this.E7jCp8Ls = 1;
    }

    @Override // defpackage.y31
    public void E7jCp8Ls() {
        if (this.E7jCp8Ls <= 0) {
            tq0.GWasM1elztuh("no pending nested snapshots");
        }
        int i = this.E7jCp8Ls - 1;
        this.E7jCp8Ls = i;
        if (i != 0 || this.XnEVoBF0td1l) {
            return;
        }
        ig0 WdrkLMV3xh = WdrkLMV3xh();
        if (WdrkLMV3xh != null) {
            if (this.XnEVoBF0td1l) {
                tq0.Yi7zF1RB1("Unsupported operation on a snapshot that has been applied");
            }
            M3K9sHhK(null);
            long AvO7iQsrTN = AvO7iQsrTN();
            Object[] objArr = WdrkLMV3xh.Yi7zF1RB1;
            long[] jArr = WdrkLMV3xh.GWasM1elztuh;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (u51 GWasM1elztuh = ((s51) objArr[(i2 << 3) + i4]).GWasM1elztuh(); GWasM1elztuh != null; GWasM1elztuh = GWasM1elztuh.Yi7zF1RB1) {
                                    long j2 = GWasM1elztuh.GWasM1elztuh;
                                    if (j2 == AvO7iQsrTN || rb.JB4pnjMK(this.JFJ3QoxA, Long.valueOf(j2))) {
                                        dx0 dx0Var = e41.GWasM1elztuh;
                                        GWasM1elztuh.GWasM1elztuh = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        GWasM1elztuh();
    }

    @Override // defpackage.y31
    public boolean EljAMC1QTz() {
        return false;
    }

    public void M3K9sHhK(ig0 ig0Var) {
        this.encWxUiV2 = ig0Var;
    }

    @Override // defpackage.y31
    public final void WIEu4Ya2g8() {
        int length = this.rQPn8YBR.length;
        for (int i = 0; i < length; i++) {
            e41.Y6hRI1cF8(this.rQPn8YBR[i]);
        }
        iwATDS1i01k();
    }

    @Override // defpackage.y31
    /* renamed from: WRKkgoJXwDn, reason: merged with bridge method [inline-methods] */
    public hv OOA6hdeuvCS() {
        return this.OOA6hdeuvCS;
    }

    public ig0 WdrkLMV3xh() {
        return this.encWxUiV2;
    }

    @Override // defpackage.y31
    public void X1lG3V04pd() {
        if (this.X1lG3V04pd) {
            return;
        }
        this.X1lG3V04pd = true;
        synchronized (e41.X1lG3V04pd) {
            iwATDS1i01k();
        }
        E7jCp8Ls();
    }

    @Override // defpackage.y31
    public void XnEVoBF0td1l() {
        if (this.XnEVoBF0td1l || this.X1lG3V04pd) {
            return;
        }
        cilMamHF();
    }

    @Override // defpackage.y31
    public y31 Y6hRI1cF8(hv hvVar) {
        ij0 ij0Var;
        if (this.X1lG3V04pd) {
            tq0.GWasM1elztuh("Cannot use a disposed snapshot");
        }
        if (this.XnEVoBF0td1l && this.xqGvceK5x < 0) {
            tq0.Yi7zF1RB1("Unsupported operation on a disposed or applied snapshot");
        }
        long AvO7iQsrTN = AvO7iQsrTN();
        pog2g9KITJA(AvO7iQsrTN());
        Object obj = e41.X1lG3V04pd;
        synchronized (obj) {
            long j = e41.OOA6hdeuvCS;
            e41.OOA6hdeuvCS = j + 1;
            e41.xqGvceK5x = e41.xqGvceK5x.EljAMC1QTz(j);
            ij0Var = new ij0(j, e41.xqGvceK5x(xqGvceK5x(), AvO7iQsrTN + 1, j), e41.rQPn8YBR(hvVar, OOA6hdeuvCS(), true), this);
        }
        if (this.XnEVoBF0td1l || this.X1lG3V04pd) {
            return ij0Var;
        }
        long AvO7iQsrTN2 = AvO7iQsrTN();
        synchronized (obj) {
            long j2 = e41.OOA6hdeuvCS;
            e41.OOA6hdeuvCS = j2 + 1;
            mE4lRynR(j2);
            e41.xqGvceK5x = e41.xqGvceK5x.EljAMC1QTz(AvO7iQsrTN());
        }
        Mjvvu5DE(e41.xqGvceK5x(xqGvceK5x(), AvO7iQsrTN2 + 1, AvO7iQsrTN()));
        return ij0Var;
    }

    @Override // defpackage.y31
    public final void Yi7zF1RB1() {
        e41.xqGvceK5x = e41.xqGvceK5x.Yi7zF1RB1(AvO7iQsrTN()).GWasM1elztuh(this.JFJ3QoxA);
    }

    public final q70 arNh8D4Z5gB(long j, ig0 ig0Var, HashMap hashMap, c41 c41Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        c41 c41Var2;
        Object[] objArr;
        long[] jArr;
        c41 c41Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        u51 Yi7zF1RB1;
        c41 OOA6hdeuvCS = xqGvceK5x().EljAMC1QTz(AvO7iQsrTN()).OOA6hdeuvCS(this.JFJ3QoxA);
        Object[] objArr3 = ig0Var.Yi7zF1RB1;
        long[] jArr3 = ig0Var.GWasM1elztuh;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            s51 s51Var = (s51) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            u51 GWasM1elztuh = s51Var.GWasM1elztuh();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            u51 mE4lRynR = e41.mE4lRynR(GWasM1elztuh, j, c41Var);
                            if (mE4lRynR == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                u51 mE4lRynR2 = e41.mE4lRynR(GWasM1elztuh, AvO7iQsrTN(), OOA6hdeuvCS);
                                if (mE4lRynR2 != null && mE4lRynR2.GWasM1elztuh != 1 && !mE4lRynR.equals(mE4lRynR2)) {
                                    c41Var3 = OOA6hdeuvCS;
                                    u51 mE4lRynR3 = e41.mE4lRynR(GWasM1elztuh, AvO7iQsrTN(), xqGvceK5x());
                                    if (mE4lRynR3 == null) {
                                        e41.Mjvvu5DE();
                                        throw null;
                                    }
                                    if (hashMap == null || (Yi7zF1RB1 = (u51) hashMap.get(mE4lRynR)) == null) {
                                        Yi7zF1RB1 = s51Var.Yi7zF1RB1(mE4lRynR2, mE4lRynR, mE4lRynR3);
                                    }
                                    if (Yi7zF1RB1 == null) {
                                        return new z31(this);
                                    }
                                    if (!Yi7zF1RB1.equals(mE4lRynR3)) {
                                        if (Yi7zF1RB1.equals(mE4lRynR)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new rn0(s51Var, mE4lRynR.Yi7zF1RB1(AvO7iQsrTN())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(s51Var);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!Yi7zF1RB1.equals(mE4lRynR2) ? new rn0(s51Var, Yi7zF1RB1) : new rn0(s51Var, mE4lRynR2.Yi7zF1RB1(AvO7iQsrTN())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            c41Var3 = OOA6hdeuvCS;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            c41Var3 = OOA6hdeuvCS;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        OOA6hdeuvCS = c41Var3;
                    }
                    c41Var2 = OOA6hdeuvCS;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    c41Var2 = OOA6hdeuvCS;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                OOA6hdeuvCS = c41Var2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            cilMamHF();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                rn0 rn0Var = (rn0) arrayList3.get(i5);
                s51 s51Var2 = (s51) rn0Var.OOA6hdeuvCS;
                u51 u51Var = (u51) rn0Var.EljAMC1QTz;
                u51Var.GWasM1elztuh = j;
                synchronized (e41.X1lG3V04pd) {
                    u51Var.Yi7zF1RB1 = s51Var2.GWasM1elztuh();
                    s51Var2.X1lG3V04pd(u51Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ig0Var.E7jCp8Ls((s51) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.mOu10nynGul;
            if (arrayList7 != null) {
                arrayList2 = rb.hOpoc9RpANL(arrayList7, arrayList2);
            }
            this.mOu10nynGul = arrayList2;
        }
        return a41.GWasM1elztuh;
    }

    public final void cilMamHF() {
        pog2g9KITJA(AvO7iQsrTN());
        if (this.XnEVoBF0td1l || this.X1lG3V04pd) {
            return;
        }
        long AvO7iQsrTN = AvO7iQsrTN();
        synchronized (e41.X1lG3V04pd) {
            long j = e41.OOA6hdeuvCS;
            e41.OOA6hdeuvCS = j + 1;
            mE4lRynR(j);
            e41.xqGvceK5x = e41.xqGvceK5x.EljAMC1QTz(AvO7iQsrTN());
        }
        Mjvvu5DE(e41.xqGvceK5x(xqGvceK5x(), AvO7iQsrTN + 1, AvO7iQsrTN()));
    }

    @Override // defpackage.y31
    public int encWxUiV2() {
        return this.AvO7iQsrTN;
    }

    @Override // defpackage.y31
    public void jivtDDk9H(int i) {
        this.AvO7iQsrTN = i;
    }

    public lg0 k8h8IjolWQ(hv hvVar, hv hvVar2) {
        hj0 hj0Var;
        if (this.X1lG3V04pd) {
            tq0.GWasM1elztuh("Cannot use a disposed snapshot");
        }
        if (this.XnEVoBF0td1l && this.xqGvceK5x < 0) {
            tq0.Yi7zF1RB1("Unsupported operation on a disposed or applied snapshot");
        }
        pog2g9KITJA(AvO7iQsrTN());
        Object obj = e41.X1lG3V04pd;
        synchronized (obj) {
            long j = e41.OOA6hdeuvCS;
            e41.OOA6hdeuvCS = j + 1;
            e41.xqGvceK5x = e41.xqGvceK5x.EljAMC1QTz(j);
            c41 xqGvceK5x = xqGvceK5x();
            Mjvvu5DE(xqGvceK5x.EljAMC1QTz(j));
            hj0Var = new hj0(j, e41.xqGvceK5x(xqGvceK5x, AvO7iQsrTN() + 1, j), e41.rQPn8YBR(hvVar, OOA6hdeuvCS(), true), e41.E7jCp8Ls(hvVar2, mOu10nynGul()), this);
        }
        if (this.XnEVoBF0td1l || this.X1lG3V04pd) {
            return hj0Var;
        }
        long AvO7iQsrTN = AvO7iQsrTN();
        synchronized (obj) {
            long j2 = e41.OOA6hdeuvCS;
            e41.OOA6hdeuvCS = j2 + 1;
            mE4lRynR(j2);
            e41.xqGvceK5x = e41.xqGvceK5x.EljAMC1QTz(AvO7iQsrTN());
        }
        Mjvvu5DE(e41.xqGvceK5x(xqGvceK5x(), AvO7iQsrTN + 1, AvO7iQsrTN()));
        return hj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q70 lv06NcmrQ() {
        HashMap hashMap;
        List list;
        ig0 ig0Var;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        ig0 WdrkLMV3xh = WdrkLMV3xh();
        if (WdrkLMV3xh != null) {
            long j3 = e41.JFJ3QoxA.Yi7zF1RB1;
            hashMap = e41.Yi7zF1RB1(j3, this, e41.xqGvceK5x.Yi7zF1RB1(j3));
        } else {
            hashMap = null;
        }
        xp xpVar = xp.OOA6hdeuvCS;
        synchronized (e41.X1lG3V04pd) {
            try {
                e41.X1lG3V04pd(this);
                if (WdrkLMV3xh != null && WdrkLMV3xh.xqGvceK5x != 0) {
                    jy jyVar = e41.JFJ3QoxA;
                    q70 arNh8D4Z5gB = arNh8D4Z5gB(e41.OOA6hdeuvCS, WdrkLMV3xh, hashMap, e41.xqGvceK5x.Yi7zF1RB1(jyVar.Yi7zF1RB1));
                    if (!arNh8D4Z5gB.equals(a41.GWasM1elztuh)) {
                        return arNh8D4Z5gB;
                    }
                    Yi7zF1RB1();
                    ig0Var = jyVar.encWxUiV2;
                    e41.cilMamHF(jyVar, e41.GWasM1elztuh);
                    M3K9sHhK(null);
                    jyVar.encWxUiV2 = null;
                    list = e41.encWxUiV2;
                    this.XnEVoBF0td1l = true;
                    if (ig0Var != null) {
                        mx0 mx0Var = new mx0(ig0Var);
                        if (!ig0Var.AvO7iQsrTN()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((lv) list.get(i2)).EljAMC1QTz(mx0Var, this);
                            }
                        }
                    }
                    if (WdrkLMV3xh != null && WdrkLMV3xh.encWxUiV2()) {
                        mx0 mx0Var2 = new mx0(WdrkLMV3xh);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((lv) list.get(i)).EljAMC1QTz(mx0Var2, this);
                        }
                    }
                    synchronized (e41.X1lG3V04pd) {
                        try {
                            WIEu4Ya2g8();
                            e41.EljAMC1QTz();
                            if (ig0Var != null) {
                                Object[] objArr = ig0Var.Yi7zF1RB1;
                                long[] jArr = ig0Var.GWasM1elztuh;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    e41.YmKjaVtbfp5Z((s51) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (WdrkLMV3xh != null) {
                                        Object[] objArr2 = WdrkLMV3xh.Yi7zF1RB1;
                                        long[] jArr2 = WdrkLMV3xh.GWasM1elztuh;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            e41.YmKjaVtbfp5Z((s51) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.mOu10nynGul;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            e41.YmKjaVtbfp5Z((s51) arrayList.get(i9));
                                        }
                                    }
                                    this.mOu10nynGul = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (WdrkLMV3xh != null) {
                            }
                            arrayList = this.mOu10nynGul;
                            if (arrayList != null) {
                            }
                            this.mOu10nynGul = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return a41.GWasM1elztuh;
                }
                Yi7zF1RB1();
                jy jyVar2 = e41.JFJ3QoxA;
                ig0 ig0Var2 = jyVar2.encWxUiV2;
                e41.cilMamHF(jyVar2, e41.GWasM1elztuh);
                if (ig0Var2 == null || !ig0Var2.encWxUiV2()) {
                    list = xpVar;
                    ig0Var = null;
                } else {
                    list = e41.encWxUiV2;
                    ig0Var = ig0Var2;
                }
                this.XnEVoBF0td1l = true;
                if (ig0Var != null) {
                }
                if (WdrkLMV3xh != null) {
                    mx0 mx0Var22 = new mx0(WdrkLMV3xh);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (e41.X1lG3V04pd) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.y31
    public hv mOu10nynGul() {
        return this.EljAMC1QTz;
    }

    public final void pog2g9KITJA(long j) {
        synchronized (e41.X1lG3V04pd) {
            this.JFJ3QoxA = this.JFJ3QoxA.EljAMC1QTz(j);
        }
    }

    @Override // defpackage.y31
    public void rQPn8YBR() {
        this.E7jCp8Ls++;
    }

    @Override // defpackage.y31
    public void uFEq9NpZ(s51 s51Var) {
        ig0 WdrkLMV3xh = WdrkLMV3xh();
        if (WdrkLMV3xh == null) {
            ig0 ig0Var = lx0.GWasM1elztuh;
            WdrkLMV3xh = new ig0();
            M3K9sHhK(WdrkLMV3xh);
        }
        WdrkLMV3xh.GWasM1elztuh(s51Var);
    }
}
