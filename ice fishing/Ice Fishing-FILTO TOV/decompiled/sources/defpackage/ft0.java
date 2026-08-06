package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ft0 extends d71 implements mv {
    public ig0 E7jCp8Ls;
    public List JFJ3QoxA;
    public /* synthetic */ y1 Mjvvu5DE;
    public ig0 WIEu4Ya2g8;
    public ig0 XnEVoBF0td1l;
    public int YmKjaVtbfp5Z;
    public Set iwATDS1i01k;
    public final /* synthetic */ gt0 mE4lRynR;
    public List mOu10nynGul;
    public List rQPn8YBR;
    public ig0 uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(gt0 gt0Var, vg vgVar) {
        super(3, vgVar);
        this.mE4lRynR = gt0Var;
    }

    public static final void Mjvvu5DE(gt0 gt0Var, List list, List list2, List list3, ig0 ig0Var, ig0 ig0Var2, ig0 ig0Var3, ig0 ig0Var4) {
        char c;
        long j;
        long j2;
        synchronized (gt0Var.X1lG3V04pd) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    df dfVar = (df) list3.get(i);
                    dfVar.GWasM1elztuh();
                    gt0Var.HFYAaqMd6(dfVar);
                }
                list3.clear();
                Object[] objArr = ig0Var.Yi7zF1RB1;
                long[] jArr = ig0Var.GWasM1elztuh;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    df dfVar2 = (df) objArr[(i2 << 3) + i4];
                                    dfVar2.GWasM1elztuh();
                                    gt0Var.HFYAaqMd6(dfVar2);
                                }
                                j3 >>= 8;
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
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                ig0Var.Yi7zF1RB1();
                Object[] objArr2 = ig0Var2.Yi7zF1RB1;
                long[] jArr2 = ig0Var2.GWasM1elztuh;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((df) objArr2[(i5 << 3) + i7]).AvO7iQsrTN();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                ig0Var2.Yi7zF1RB1();
                ig0Var3.Yi7zF1RB1();
                Object[] objArr3 = ig0Var4.Yi7zF1RB1;
                long[] jArr3 = ig0Var4.GWasM1elztuh;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    df dfVar3 = (df) objArr3[(i8 << 3) + i10];
                                    dfVar3.GWasM1elztuh();
                                    gt0Var.HFYAaqMd6(dfVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                ig0Var4.Yi7zF1RB1();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void mE4lRynR(List list, gt0 gt0Var) {
        list.clear();
        synchronized (gt0Var.X1lG3V04pd) {
            try {
                ArrayList arrayList = gt0Var.rQPn8YBR;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((gf0) arrayList.get(i));
                }
                gt0Var.rQPn8YBR.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0124 -> B:6:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01d8 -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        y1 y1Var;
        ig0 ig0Var;
        ig0 ig0Var2;
        List list;
        Set set;
        final List list2;
        ig0 ig0Var3;
        List list3;
        ig0 ig0Var4;
        final List list4;
        final ig0 ig0Var5;
        final List list5;
        final ig0 ig0Var6;
        gt0 gt0Var;
        Object obj2;
        n9 n9Var;
        qh qhVar;
        y1 y1Var2;
        ag0 ag0Var;
        qh qhVar2 = qh.OOA6hdeuvCS;
        int i = this.YmKjaVtbfp5Z;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            y1Var = this.Mjvvu5DE;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ig0 ig0Var7 = lx0.GWasM1elztuh;
            ig0Var = new ig0();
            ig0 ig0Var8 = new ig0();
            ig0 ig0Var9 = new ig0();
            mx0 mx0Var = new mx0(ig0Var9);
            ig0Var2 = new ig0();
            list = arrayList;
            set = mx0Var;
            list2 = arrayList2;
            ig0Var3 = ig0Var9;
            list3 = arrayList3;
            ig0Var4 = ig0Var8;
            synchronized (this.mE4lRynR.X1lG3V04pd) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ig0 ig0Var10 = this.WIEu4Ya2g8;
                set = this.iwATDS1i01k;
                ig0Var3 = this.uFEq9NpZ;
                ig0Var4 = this.XnEVoBF0td1l;
                ig0Var = this.E7jCp8Ls;
                list3 = this.rQPn8YBR;
                list2 = this.JFJ3QoxA;
                list = this.mOu10nynGul;
                y1 y1Var3 = this.Mjvvu5DE;
                o50.A1EKNP6CxJ(obj);
                ig0Var2 = ig0Var10;
                y1Var = y1Var3;
                gt0 gt0Var2 = this.mE4lRynR;
                synchronized (gt0Var2.X1lG3V04pd) {
                    try {
                        if (gt0Var2.E7jCp8Ls.JFJ3QoxA()) {
                            ag0 Yi7zF1RB1 = nf0.Yi7zF1RB1(gt0Var2.E7jCp8Ls);
                            gt0Var2.E7jCp8Ls.GWasM1elztuh();
                            d dVar = gt0Var2.XnEVoBF0td1l;
                            ((hg0) dVar.EljAMC1QTz).GWasM1elztuh();
                            ((hg0) dVar.AvO7iQsrTN).GWasM1elztuh();
                            gt0Var2.iwATDS1i01k.GWasM1elztuh();
                            ag0Var = new ag0(Yi7zF1RB1.Yi7zF1RB1);
                            Object[] objArr = Yi7zF1RB1.GWasM1elztuh;
                            int i4 = Yi7zF1RB1.Yi7zF1RB1;
                            qhVar = qhVar2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                gf0 gf0Var = (gf0) objArr[i5];
                                ag0Var.GWasM1elztuh(new rn0(gf0Var, gt0Var2.uFEq9NpZ.AvO7iQsrTN(gf0Var)));
                                i5 = i6 + 1;
                                y1Var = y1Var;
                                objArr = objArr;
                            }
                            y1Var2 = y1Var;
                            gt0Var2.uFEq9NpZ.GWasM1elztuh();
                        } else {
                            qhVar = qhVar2;
                            y1Var2 = y1Var;
                            ag0Var = qk0.Yi7zF1RB1;
                            ag0Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = ag0Var.GWasM1elztuh;
                int i7 = ag0Var.Yi7zF1RB1;
                for (int i8 = 0; i8 < i7; i8++) {
                    rn0 rn0Var = (rn0) objArr2[i8];
                }
                f4 f4Var = this.mE4lRynR.Yi7zF1RB1;
                ((i5) f4Var.Yi7zF1RB1).set(0);
                ((v5) f4Var.X1lG3V04pd).EljAMC1QTz(new oh0(6));
                qhVar2 = qhVar;
                y1Var = y1Var2;
                i2 = 2;
                i3 = 1;
                synchronized (this.mE4lRynR.X1lG3V04pd) {
                }
                gt0 gt0Var3 = this.mE4lRynR;
                this.Mjvvu5DE = y1Var;
                this.mOu10nynGul = list;
                this.JFJ3QoxA = list2;
                this.rQPn8YBR = list3;
                this.E7jCp8Ls = ig0Var;
                this.XnEVoBF0td1l = ig0Var4;
                this.uFEq9NpZ = ig0Var3;
                this.iwATDS1i01k = set;
                this.WIEu4Ya2g8 = ig0Var2;
                this.YmKjaVtbfp5Z = i3;
                if (gt0Var3.k8h8IjolWQ()) {
                    obj2 = kc1.GWasM1elztuh;
                } else {
                    n9 n9Var2 = new n9(i3, rj0.M3K9sHhK(this));
                    n9Var2.cilMamHF();
                    synchronized (gt0Var3.X1lG3V04pd) {
                        if (gt0Var3.k8h8IjolWQ()) {
                            n9Var = n9Var2;
                        } else {
                            gt0Var3.Mjvvu5DE = n9Var2;
                            n9Var = null;
                        }
                    }
                    if (n9Var != null) {
                        n9Var.AvO7iQsrTN(kc1.GWasM1elztuh);
                    }
                    obj2 = n9Var2.jivtDDk9H();
                    if (obj2 != qh.OOA6hdeuvCS) {
                        obj2 = kc1.GWasM1elztuh;
                    }
                }
                if (obj2 != qhVar2) {
                    List list6 = list;
                    ig0Var5 = ig0Var;
                    ig0Var6 = ig0Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final ig0 ig0Var11 = ig0Var4;
                    final ig0 ig0Var12 = ig0Var3;
                    gt0Var = this.mE4lRynR;
                    p51 p51Var = gt0.arNh8D4Z5gB;
                    if (gt0Var.DmJncFq5()) {
                        List list7 = list4;
                        ig0Var2 = ig0Var6;
                        ig0Var = ig0Var5;
                        list = list5;
                        list3 = list7;
                        ig0Var3 = ig0Var12;
                        ig0Var4 = ig0Var11;
                        set = set2;
                        synchronized (this.mE4lRynR.X1lG3V04pd) {
                        }
                    } else {
                        final gt0 gt0Var4 = this.mE4lRynR;
                        hv hvVar = new hv() { // from class: et0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.hv
                            public final Object mOu10nynGul(Object obj3) {
                                boolean arNh8D4Z5gB;
                                Object[] objArr3;
                                List list8;
                                List list9;
                                long j;
                                List list10;
                                List list11;
                                List list12;
                                ig0 ig0Var13;
                                Object[] objArr4;
                                boolean z;
                                gt0 gt0Var5 = gt0.this;
                                ig0 ig0Var14 = ig0Var12;
                                ig0 ig0Var15 = ig0Var6;
                                List list13 = list5;
                                List list14 = list2;
                                ig0 ig0Var16 = ig0Var5;
                                List list15 = list4;
                                ig0 ig0Var17 = ig0Var11;
                                Set set3 = set2;
                                final long longValue = ((Long) obj3).longValue();
                                synchronized (gt0Var5.X1lG3V04pd) {
                                    arNh8D4Z5gB = gt0Var5.arNh8D4Z5gB();
                                }
                                boolean z2 = 0;
                                if (arNh8D4Z5gB) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        ((v5) gt0Var5.GWasM1elztuh.AvO7iQsrTN).EljAMC1QTz(new hv() { // from class: g8
                                            @Override // defpackage.hv
                                            public final Object mOu10nynGul(Object obj4) {
                                                n9 n9Var3;
                                                Object su0Var;
                                                long j2 = longValue;
                                                h8 h8Var = (h8) obj4;
                                                hv hvVar2 = h8Var.Yi7zF1RB1;
                                                if (hvVar2 != null && (n9Var3 = h8Var.GWasM1elztuh) != null) {
                                                    try {
                                                        su0Var = hvVar2.mOu10nynGul(Long.valueOf(j2));
                                                    } catch (Throwable th2) {
                                                        su0Var = new su0(th2);
                                                    }
                                                    n9Var3.AvO7iQsrTN(su0Var);
                                                }
                                                return kc1.GWasM1elztuh;
                                            }
                                        });
                                        synchronized (e41.X1lG3V04pd) {
                                            ig0 ig0Var18 = e41.JFJ3QoxA.encWxUiV2;
                                            if (ig0Var18 != null) {
                                                z = ig0Var18.encWxUiV2();
                                            }
                                        }
                                        if (z) {
                                            e41.GWasM1elztuh();
                                        }
                                    } finally {
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    gt0Var5.DmJncFq5();
                                    synchronized (gt0Var5.X1lG3V04pd) {
                                        try {
                                            rg0 rg0Var = gt0Var5.mOu10nynGul;
                                            Object[] objArr5 = rg0Var.OOA6hdeuvCS;
                                            int i9 = rg0Var.AvO7iQsrTN;
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                list13.add((df) objArr5[i10]);
                                            }
                                            gt0Var5.mOu10nynGul.AvO7iQsrTN();
                                        } finally {
                                        }
                                    }
                                    ig0Var14.Yi7zF1RB1();
                                    ig0Var15.Yi7zF1RB1();
                                    while (true) {
                                        if (list13.isEmpty() && list14.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list13.size();
                                            for (int i11 = 0; i11 < size; i11++) {
                                                df dfVar = (df) list13.get(i11);
                                                df A1EKNP6CxJ = gt0Var5.A1EKNP6CxJ(dfVar, ig0Var14);
                                                if (A1EKNP6CxJ != null) {
                                                    list15.add(A1EKNP6CxJ);
                                                }
                                                ig0Var15.GWasM1elztuh(dfVar);
                                            }
                                            list13.clear();
                                            if (ig0Var14.encWxUiV2() || gt0Var5.mOu10nynGul.AvO7iQsrTN != 0) {
                                                synchronized (gt0Var5.X1lG3V04pd) {
                                                    try {
                                                        List EXrPz3p7hFb = gt0Var5.EXrPz3p7hFb();
                                                        int size2 = EXrPz3p7hFb.size();
                                                        for (int i12 = 0; i12 < size2; i12++) {
                                                            df dfVar2 = (df) EXrPz3p7hFb.get(i12);
                                                            if (!ig0Var15.X1lG3V04pd(dfVar2) && dfVar2.cilMamHF(set3)) {
                                                                list13.add(dfVar2);
                                                            }
                                                        }
                                                        rg0 rg0Var2 = gt0Var5.mOu10nynGul;
                                                        int i13 = rg0Var2.AvO7iQsrTN;
                                                        int i14 = 0;
                                                        int i15 = 0;
                                                        while (true) {
                                                            objArr3 = rg0Var2.OOA6hdeuvCS;
                                                            if (i14 >= i13) {
                                                                break;
                                                            }
                                                            df dfVar3 = (df) objArr3[i14];
                                                            if (!ig0Var15.X1lG3V04pd(dfVar3) && !list13.contains(dfVar3)) {
                                                                list13.add(dfVar3);
                                                                i15++;
                                                            } else if (i15 > 0) {
                                                                Object[] objArr6 = rg0Var2.OOA6hdeuvCS;
                                                                objArr6[i14 - i15] = objArr6[i14];
                                                            }
                                                            i14++;
                                                        }
                                                        int i16 = i13 - i15;
                                                        Arrays.fill(objArr3, i16, i13, (Object) null);
                                                        rg0Var2.AvO7iQsrTN = i16;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list13.isEmpty()) {
                                                try {
                                                    ft0.mE4lRynR(list14, gt0Var5);
                                                    while (!list14.isEmpty()) {
                                                        List eUH21U3apd = gt0Var5.eUH21U3apd(list14, ig0Var14);
                                                        ig0Var16.getClass();
                                                        Iterator it = eUH21U3apd.iterator();
                                                        while (it.hasNext()) {
                                                            ig0Var16.rQPn8YBR(it.next());
                                                        }
                                                        ft0.mE4lRynR(list14, gt0Var5);
                                                    }
                                                } catch (Throwable th2) {
                                                    gt0Var5.MZhzXH72(th2, null);
                                                    ft0.Mjvvu5DE(gt0Var5, list13, list14, list15, ig0Var16, ig0Var17, ig0Var14, ig0Var15);
                                                }
                                            }
                                            z2 = 0;
                                        } catch (Throwable th3) {
                                            try {
                                                gt0Var5.MZhzXH72(th3, null);
                                                ft0.Mjvvu5DE(gt0Var5, list13, list14, list15, ig0Var16, ig0Var17, ig0Var14, ig0Var15);
                                            } finally {
                                                list13.clear();
                                            }
                                        }
                                    }
                                    y31 JFJ3QoxA = e41.JFJ3QoxA();
                                    y31 sa1Var = JFJ3QoxA instanceof lg0 ? new sa1((lg0) JFJ3QoxA, null, null, true, false) : new ta1(JFJ3QoxA, null, true, z2);
                                    try {
                                        y31 JFJ3QoxA2 = sa1Var.JFJ3QoxA();
                                        try {
                                            if (!list15.isEmpty()) {
                                                try {
                                                    int size3 = list15.size();
                                                    for (int i17 = z2; i17 < size3; i17++) {
                                                        ig0Var17.GWasM1elztuh((df) list15.get(i17));
                                                    }
                                                    int size4 = list15.size();
                                                    for (int i18 = z2; i18 < size4; i18++) {
                                                        ((df) list15.get(i18)).xqGvceK5x();
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
                                                        gt0Var5.MZhzXH72(th4, null);
                                                        ft0.Mjvvu5DE(gt0Var5, list13, list14, list15, ig0Var16, ig0Var17, ig0Var14, ig0Var15);
                                                        y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                                                        return kc1.GWasM1elztuh;
                                                    } finally {
                                                        list15.clear();
                                                    }
                                                }
                                            }
                                            if (ig0Var16.encWxUiV2()) {
                                                try {
                                                    ig0Var17.JFJ3QoxA(ig0Var16);
                                                    Object[] objArr7 = ig0Var16.Yi7zF1RB1;
                                                    long[] jArr = ig0Var16.GWasM1elztuh;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i19 = 0;
                                                        j = 255;
                                                        while (true) {
                                                            long j2 = jArr[i19];
                                                            list8 = list13;
                                                            list9 = list14;
                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i20 = 8 - ((~(i19 - length)) >>> 31);
                                                                for (int i21 = 0; i21 < i20; i21++) {
                                                                    if ((j2 & 255) < 128) {
                                                                        try {
                                                                            ((df) objArr7[(i19 << 3) + i21]).EljAMC1QTz();
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            try {
                                                                                gt0Var5.MZhzXH72(th, null);
                                                                                ft0.Mjvvu5DE(gt0Var5, list8, list9, list15, ig0Var16, ig0Var17, ig0Var14, ig0Var15);
                                                                                y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                                                                                return kc1.GWasM1elztuh;
                                                                            } finally {
                                                                                ig0Var16.Yi7zF1RB1();
                                                                            }
                                                                        }
                                                                    }
                                                                    j2 >>= 8;
                                                                }
                                                                if (i20 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i19 == length) {
                                                                break;
                                                            }
                                                            i19++;
                                                            list13 = list8;
                                                            list14 = list9;
                                                        }
                                                    } else {
                                                        list8 = list13;
                                                        list9 = list14;
                                                        j = 255;
                                                    }
                                                    list13 = list8;
                                                    list14 = list9;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    list8 = list13;
                                                    list9 = list14;
                                                }
                                            } else {
                                                j = 255;
                                            }
                                            if (ig0Var17.encWxUiV2()) {
                                                try {
                                                    Object[] objArr8 = ig0Var17.Yi7zF1RB1;
                                                    long[] jArr2 = ig0Var17.GWasM1elztuh;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        list10 = list13;
                                                        list11 = list14;
                                                        int i22 = 0;
                                                        while (true) {
                                                            try {
                                                                long j3 = jArr2[i22];
                                                                list12 = list15;
                                                                ig0Var13 = ig0Var16;
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                                    int i24 = 0;
                                                                    while (i24 < i23) {
                                                                        if ((j3 & j) < 128) {
                                                                            try {
                                                                                ((df) objArr8[(i22 << 3) + i24]).AvO7iQsrTN();
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                try {
                                                                                    gt0Var5.MZhzXH72(th, null);
                                                                                    ft0.Mjvvu5DE(gt0Var5, list10, list11, list12, ig0Var13, ig0Var17, ig0Var14, ig0Var15);
                                                                                    return kc1.GWasM1elztuh;
                                                                                } finally {
                                                                                    ig0Var17.Yi7zF1RB1();
                                                                                }
                                                                            }
                                                                        }
                                                                        j3 >>= 8;
                                                                        i24++;
                                                                        objArr8 = objArr8;
                                                                    }
                                                                    objArr4 = objArr8;
                                                                    if (i23 != 8) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    objArr4 = objArr8;
                                                                }
                                                                if (i22 == length2) {
                                                                    break;
                                                                }
                                                                i22++;
                                                                ig0Var16 = ig0Var13;
                                                                list15 = list12;
                                                                objArr8 = objArr4;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                list12 = list15;
                                                                ig0Var13 = ig0Var16;
                                                                gt0Var5.MZhzXH72(th, null);
                                                                ft0.Mjvvu5DE(gt0Var5, list10, list11, list12, ig0Var13, ig0Var17, ig0Var14, ig0Var15);
                                                                return kc1.GWasM1elztuh;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    list10 = list13;
                                                    list11 = list14;
                                                }
                                            }
                                            sa1Var.X1lG3V04pd();
                                            synchronized (gt0Var5.X1lG3V04pd) {
                                                if (gt0Var5.WRKkgoJXwDn() != null) {
                                                    we.GWasM1elztuh("unexpected to get continuation here");
                                                }
                                            }
                                            e41.JFJ3QoxA().XnEVoBF0td1l();
                                            ig0Var15.Yi7zF1RB1();
                                            ig0Var14.Yi7zF1RB1();
                                            gt0Var5.YmKjaVtbfp5Z = null;
                                            return kc1.GWasM1elztuh;
                                        } finally {
                                            y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                                        }
                                    } finally {
                                        sa1Var.X1lG3V04pd();
                                    }
                                } finally {
                                }
                            }
                        };
                        this.Mjvvu5DE = y1Var;
                        this.mOu10nynGul = list5;
                        this.JFJ3QoxA = list2;
                        this.rQPn8YBR = list4;
                        this.E7jCp8Ls = ig0Var5;
                        this.XnEVoBF0td1l = ig0Var11;
                        this.uFEq9NpZ = ig0Var12;
                        this.iwATDS1i01k = set2;
                        this.WIEu4Ya2g8 = ig0Var6;
                        this.YmKjaVtbfp5Z = i2;
                        if (y1Var.X1lG3V04pd(hvVar, this) != qhVar2) {
                            List list8 = list4;
                            ig0Var2 = ig0Var6;
                            ig0Var = ig0Var5;
                            list = list5;
                            list3 = list8;
                            ig0Var3 = ig0Var12;
                            ig0Var4 = ig0Var11;
                            set = set2;
                            gt0 gt0Var22 = this.mE4lRynR;
                            synchronized (gt0Var22.X1lG3V04pd) {
                            }
                        }
                    }
                }
                return qhVar2;
            }
            ig0 ig0Var13 = this.WIEu4Ya2g8;
            set = this.iwATDS1i01k;
            ig0Var3 = this.uFEq9NpZ;
            ig0Var4 = this.XnEVoBF0td1l;
            ig0 ig0Var14 = this.E7jCp8Ls;
            List list9 = this.rQPn8YBR;
            list2 = this.JFJ3QoxA;
            List list10 = this.mOu10nynGul;
            y1 y1Var4 = this.Mjvvu5DE;
            o50.A1EKNP6CxJ(obj);
            ig0Var6 = ig0Var13;
            y1Var = y1Var4;
            list4 = list9;
            list5 = list10;
            ig0Var5 = ig0Var14;
            final Set set22 = set;
            final ig0 ig0Var112 = ig0Var4;
            final ig0 ig0Var122 = ig0Var3;
            gt0Var = this.mE4lRynR;
            p51 p51Var2 = gt0.arNh8D4Z5gB;
            if (gt0Var.DmJncFq5()) {
            }
        }
    }

    @Override // defpackage.mv
    public final Object X1lG3V04pd(Object obj, Object obj2, Object obj3) {
        ft0 ft0Var = new ft0(this.mE4lRynR, (vg) obj3);
        ft0Var.Mjvvu5DE = (y1) obj2;
        ft0Var.WIEu4Ya2g8(kc1.GWasM1elztuh);
        return qh.OOA6hdeuvCS;
    }
}
