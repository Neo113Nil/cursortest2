package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l31 extends defpackage.mi1 implements defpackage.d20 {
    public final /* synthetic */ defpackage.m31 BHfvd2J71qpO;
    public java.util.List GE9mJIPrb8gP;
    public java.util.List Ns0WNyEWdPsk;
    public java.util.Set T1fB7bDYiVJQ;
    public int WmetiUbpKU9I;
    public defpackage.zn0 XntWc4eZSQ8j;
    public java.util.List e6mdH7fiFuta;
    public defpackage.zn0 fNwYGHIYeJcR;
    public defpackage.zn0 gUjdnLbkVAaA;
    public defpackage.zn0 h3m55N1URyyK;
    public /* synthetic */ defpackage.q4 s0TASMVLSWD5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l31(defpackage.m31 m31Var, defpackage.kl klVar) {
        super(3, klVar);
        this.BHfvd2J71qpO = m31Var;
    }

    public static final void ZVVdXbWmyCSK(defpackage.m31 m31Var, java.util.List list, java.util.List list2, java.util.List list3, defpackage.zn0 zn0Var, defpackage.zn0 zn0Var2, defpackage.zn0 zn0Var3, defpackage.zn0 zn0Var4) {
        char c;
        long j;
        long j2;
        synchronized (m31Var.fWTAfUmVKrZq) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    defpackage.lj ljVar = (defpackage.lj) list3.get(i);
                    ljVar.ZpBGe2uQfcn8();
                    m31Var.GcLuU6pT9wO9(ljVar);
                }
                list3.clear();
                java.lang.Object[] objArr = zn0Var.giKS3J6vZuNy;
                long[] jArr = zn0Var.ZpBGe2uQfcn8;
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
                                    defpackage.lj ljVar2 = (defpackage.lj) objArr[(i2 << 3) + i4];
                                    ljVar2.ZpBGe2uQfcn8();
                                    m31Var.GcLuU6pT9wO9(ljVar2);
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
                zn0Var.giKS3J6vZuNy();
                java.lang.Object[] objArr2 = zn0Var2.giKS3J6vZuNy;
                long[] jArr2 = zn0Var2.ZpBGe2uQfcn8;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((defpackage.lj) objArr2[(i5 << 3) + i7]).QiMR8OkAhezm();
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
                zn0Var2.giKS3J6vZuNy();
                zn0Var3.giKS3J6vZuNy();
                java.lang.Object[] objArr3 = zn0Var4.giKS3J6vZuNy;
                long[] jArr3 = zn0Var4.ZpBGe2uQfcn8;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    defpackage.lj ljVar3 = (defpackage.lj) objArr3[(i8 << 3) + i10];
                                    ljVar3.ZpBGe2uQfcn8();
                                    m31Var.GcLuU6pT9wO9(ljVar3);
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
                zn0Var4.giKS3J6vZuNy();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static final void w7APNrr0aGRc(java.util.List list, defpackage.m31 m31Var) {
        list.clear();
        synchronized (m31Var.fWTAfUmVKrZq) {
            try {
                java.util.ArrayList arrayList = m31Var.Ns0WNyEWdPsk;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((defpackage.sm0) arrayList.get(i));
                }
                m31Var.Ns0WNyEWdPsk.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.d20
    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.l31 l31Var = new defpackage.l31(this.BHfvd2J71qpO, (defpackage.kl) obj3);
        l31Var.s0TASMVLSWD5 = (defpackage.q4) obj2;
        l31Var.s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
        return defpackage.tm.WDYagTQQm9ns;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0124 -> B:6:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01d8 -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.q4 q4Var;
        defpackage.zn0 zn0Var;
        defpackage.zn0 zn0Var2;
        java.util.List list;
        java.util.Set set;
        final java.util.List list2;
        defpackage.zn0 zn0Var3;
        java.util.List list3;
        defpackage.zn0 zn0Var4;
        final java.util.List list4;
        final defpackage.zn0 zn0Var5;
        final java.util.List list5;
        final defpackage.zn0 zn0Var6;
        defpackage.m31 m31Var;
        java.lang.Object obj2;
        defpackage.dd ddVar;
        defpackage.tm tmVar;
        defpackage.q4 q4Var2;
        defpackage.sn0 sn0Var;
        defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
        int i = this.WmetiUbpKU9I;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            q4Var = this.s0TASMVLSWD5;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            defpackage.zn0 zn0Var7 = defpackage.n81.ZpBGe2uQfcn8;
            zn0Var = new defpackage.zn0();
            defpackage.zn0 zn0Var8 = new defpackage.zn0();
            defpackage.zn0 zn0Var9 = new defpackage.zn0();
            defpackage.o81 o81Var = new defpackage.o81(zn0Var9);
            zn0Var2 = new defpackage.zn0();
            list = arrayList;
            set = o81Var;
            list2 = arrayList2;
            zn0Var3 = zn0Var9;
            list3 = arrayList3;
            zn0Var4 = zn0Var8;
            synchronized (this.BHfvd2J71qpO.fWTAfUmVKrZq) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.zn0 zn0Var10 = this.XntWc4eZSQ8j;
                set = this.T1fB7bDYiVJQ;
                zn0Var3 = this.gUjdnLbkVAaA;
                zn0Var4 = this.h3m55N1URyyK;
                zn0Var = this.fNwYGHIYeJcR;
                list3 = this.Ns0WNyEWdPsk;
                list2 = this.GE9mJIPrb8gP;
                list = this.e6mdH7fiFuta;
                defpackage.q4 q4Var3 = this.s0TASMVLSWD5;
                defpackage.b80.KrtOTfE6jiS2(obj);
                zn0Var2 = zn0Var10;
                q4Var = q4Var3;
                defpackage.m31 m31Var2 = this.BHfvd2J71qpO;
                synchronized (m31Var2.fWTAfUmVKrZq) {
                    try {
                        if (m31Var2.fNwYGHIYeJcR.GE9mJIPrb8gP()) {
                            defpackage.sn0 giKS3J6vZuNy = defpackage.cn0.giKS3J6vZuNy(m31Var2.fNwYGHIYeJcR);
                            m31Var2.fNwYGHIYeJcR.ZpBGe2uQfcn8();
                            defpackage.n80 n80Var = m31Var2.h3m55N1URyyK;
                            ((defpackage.yn0) n80Var.oh71FJcDz6S2).ZpBGe2uQfcn8();
                            ((defpackage.yn0) n80Var.QiMR8OkAhezm).ZpBGe2uQfcn8();
                            m31Var2.T1fB7bDYiVJQ.ZpBGe2uQfcn8();
                            sn0Var = new defpackage.sn0(giKS3J6vZuNy.giKS3J6vZuNy);
                            java.lang.Object[] objArr = giKS3J6vZuNy.ZpBGe2uQfcn8;
                            int i4 = giKS3J6vZuNy.giKS3J6vZuNy;
                            tmVar = tmVar2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                defpackage.sm0 sm0Var = (defpackage.sm0) objArr[i5];
                                sn0Var.ZpBGe2uQfcn8(new defpackage.bw0(sm0Var, m31Var2.gUjdnLbkVAaA.QiMR8OkAhezm(sm0Var)));
                                i5 = i6 + 1;
                                q4Var = q4Var;
                                objArr = objArr;
                            }
                            q4Var2 = q4Var;
                            m31Var2.gUjdnLbkVAaA.ZpBGe2uQfcn8();
                        } else {
                            tmVar = tmVar2;
                            q4Var2 = q4Var;
                            sn0Var = defpackage.ns0.giKS3J6vZuNy;
                            sn0Var.getClass();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                java.lang.Object[] objArr2 = sn0Var.ZpBGe2uQfcn8;
                int i7 = sn0Var.giKS3J6vZuNy;
                for (int i8 = 0; i8 < i7; i8++) {
                    defpackage.bw0 bw0Var = (defpackage.bw0) objArr2[i8];
                }
                defpackage.a7 a7Var = this.BHfvd2J71qpO.giKS3J6vZuNy;
                ((defpackage.h8) a7Var.giKS3J6vZuNy).set(0);
                ((defpackage.x8) a7Var.fWTAfUmVKrZq).QiMR8OkAhezm(new defpackage.lp0(6));
                tmVar2 = tmVar;
                q4Var = q4Var2;
                i2 = 2;
                i3 = 1;
                synchronized (this.BHfvd2J71qpO.fWTAfUmVKrZq) {
                }
                defpackage.m31 m31Var3 = this.BHfvd2J71qpO;
                this.s0TASMVLSWD5 = q4Var;
                this.e6mdH7fiFuta = list;
                this.GE9mJIPrb8gP = list2;
                this.Ns0WNyEWdPsk = list3;
                this.fNwYGHIYeJcR = zn0Var;
                this.h3m55N1URyyK = zn0Var4;
                this.gUjdnLbkVAaA = zn0Var3;
                this.T1fB7bDYiVJQ = set;
                this.XntWc4eZSQ8j = zn0Var2;
                this.WmetiUbpKU9I = i3;
                if (m31Var3.UmgHb6n58gfG()) {
                    obj2 = defpackage.gs1.ZpBGe2uQfcn8;
                } else {
                    defpackage.dd ddVar2 = new defpackage.dd(i3, defpackage.q70.OcTWLQzke1i2(this));
                    ddVar2.IJ0hOnjhPOri();
                    synchronized (m31Var3.fWTAfUmVKrZq) {
                        if (m31Var3.UmgHb6n58gfG()) {
                            ddVar = ddVar2;
                        } else {
                            m31Var3.s0TASMVLSWD5 = ddVar2;
                            ddVar = null;
                        }
                    }
                    if (ddVar != null) {
                        ddVar.e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
                    }
                    obj2 = ddVar2.w7APNrr0aGRc();
                    if (obj2 != defpackage.tm.WDYagTQQm9ns) {
                        obj2 = defpackage.gs1.ZpBGe2uQfcn8;
                    }
                }
                if (obj2 != tmVar2) {
                    java.util.List list6 = list;
                    zn0Var5 = zn0Var;
                    zn0Var6 = zn0Var2;
                    list4 = list3;
                    list5 = list6;
                    final java.util.Set set2 = set;
                    final defpackage.zn0 zn0Var11 = zn0Var4;
                    final defpackage.zn0 zn0Var12 = zn0Var3;
                    m31Var = this.BHfvd2J71qpO;
                    defpackage.gg1 gg1Var = defpackage.m31.dG7RjM6DqYVL;
                    if (m31Var.hH0RRJrNssvh()) {
                        java.util.List list7 = list4;
                        zn0Var2 = zn0Var6;
                        zn0Var = zn0Var5;
                        list = list5;
                        list3 = list7;
                        zn0Var3 = zn0Var12;
                        zn0Var4 = zn0Var11;
                        set = set2;
                        synchronized (this.BHfvd2J71qpO.fWTAfUmVKrZq) {
                        }
                    } else {
                        final defpackage.m31 m31Var4 = this.BHfvd2J71qpO;
                        defpackage.y10 y10Var = new defpackage.y10() { // from class: k31
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.y10
                            public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj3) {
                                boolean dG7RjM6DqYVL;
                                java.lang.Object[] objArr3;
                                java.util.List list8;
                                java.util.List list9;
                                long j;
                                java.util.List list10;
                                java.util.List list11;
                                java.util.List list12;
                                defpackage.zn0 zn0Var13;
                                java.lang.Object[] objArr4;
                                boolean z;
                                defpackage.m31 m31Var5 = defpackage.m31.this;
                                defpackage.zn0 zn0Var14 = zn0Var12;
                                defpackage.zn0 zn0Var15 = zn0Var6;
                                java.util.List list13 = list5;
                                java.util.List list14 = list2;
                                defpackage.zn0 zn0Var16 = zn0Var5;
                                java.util.List list15 = list4;
                                defpackage.zn0 zn0Var17 = zn0Var11;
                                java.util.Set set3 = set2;
                                long longValue = ((java.lang.Long) obj3).longValue();
                                synchronized (m31Var5.fWTAfUmVKrZq) {
                                    dG7RjM6DqYVL = m31Var5.dG7RjM6DqYVL();
                                }
                                boolean z2 = 0;
                                if (dG7RjM6DqYVL) {
                                    android.os.Trace.beginSection("Recomposer:animation");
                                    try {
                                        ((defpackage.x8) m31Var5.ZpBGe2uQfcn8.QiMR8OkAhezm).QiMR8OkAhezm(new defpackage.t0(1, longValue));
                                        synchronized (defpackage.te1.fWTAfUmVKrZq) {
                                            defpackage.zn0 zn0Var18 = defpackage.te1.GE9mJIPrb8gP.P05cfTpS5W5L;
                                            if (zn0Var18 != null) {
                                                z = zn0Var18.P05cfTpS5W5L();
                                            }
                                        }
                                        if (z) {
                                            defpackage.te1.ZpBGe2uQfcn8();
                                        }
                                    } finally {
                                    }
                                }
                                android.os.Trace.beginSection("Recomposer:recompose");
                                try {
                                    m31Var5.hH0RRJrNssvh();
                                    synchronized (m31Var5.fWTAfUmVKrZq) {
                                        try {
                                            defpackage.ho0 ho0Var = m31Var5.e6mdH7fiFuta;
                                            java.lang.Object[] objArr5 = ho0Var.WDYagTQQm9ns;
                                            int i9 = ho0Var.QiMR8OkAhezm;
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                list13.add((defpackage.lj) objArr5[i10]);
                                            }
                                            m31Var5.e6mdH7fiFuta.QiMR8OkAhezm();
                                        } finally {
                                        }
                                    }
                                    zn0Var14.giKS3J6vZuNy();
                                    zn0Var15.giKS3J6vZuNy();
                                    while (true) {
                                        if (list13.isEmpty() && list14.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list13.size();
                                            for (int i11 = 0; i11 < size; i11++) {
                                                defpackage.lj ljVar = (defpackage.lj) list13.get(i11);
                                                defpackage.lj IBvW5fLsPuHy = m31Var5.IBvW5fLsPuHy(ljVar, zn0Var14);
                                                if (IBvW5fLsPuHy != null) {
                                                    list15.add(IBvW5fLsPuHy);
                                                }
                                                zn0Var15.ZpBGe2uQfcn8(ljVar);
                                            }
                                            list13.clear();
                                            if (zn0Var14.P05cfTpS5W5L() || m31Var5.e6mdH7fiFuta.QiMR8OkAhezm != 0) {
                                                synchronized (m31Var5.fWTAfUmVKrZq) {
                                                    try {
                                                        java.util.List qjMheFZ0l9kA = m31Var5.qjMheFZ0l9kA();
                                                        int size2 = qjMheFZ0l9kA.size();
                                                        for (int i12 = 0; i12 < size2; i12++) {
                                                            defpackage.lj ljVar2 = (defpackage.lj) qjMheFZ0l9kA.get(i12);
                                                            if (!zn0Var15.fWTAfUmVKrZq(ljVar2) && ljVar2.maCixPsq4ml2(set3)) {
                                                                list13.add(ljVar2);
                                                            }
                                                        }
                                                        defpackage.ho0 ho0Var2 = m31Var5.e6mdH7fiFuta;
                                                        int i13 = ho0Var2.QiMR8OkAhezm;
                                                        int i14 = 0;
                                                        int i15 = 0;
                                                        while (true) {
                                                            objArr3 = ho0Var2.WDYagTQQm9ns;
                                                            if (i14 >= i13) {
                                                                break;
                                                            }
                                                            defpackage.lj ljVar3 = (defpackage.lj) objArr3[i14];
                                                            if (!zn0Var15.fWTAfUmVKrZq(ljVar3) && !list13.contains(ljVar3)) {
                                                                list13.add(ljVar3);
                                                                i15++;
                                                            } else if (i15 > 0) {
                                                                java.lang.Object[] objArr6 = ho0Var2.WDYagTQQm9ns;
                                                                objArr6[i14 - i15] = objArr6[i14];
                                                            }
                                                            i14++;
                                                        }
                                                        int i16 = i13 - i15;
                                                        java.util.Arrays.fill(objArr3, i16, i13, (java.lang.Object) null);
                                                        ho0Var2.QiMR8OkAhezm = i16;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list13.isEmpty()) {
                                                try {
                                                    defpackage.l31.w7APNrr0aGRc(list14, m31Var5);
                                                    while (!list14.isEmpty()) {
                                                        java.util.List KrtOTfE6jiS2 = m31Var5.KrtOTfE6jiS2(list14, zn0Var14);
                                                        zn0Var16.getClass();
                                                        java.util.Iterator it = KrtOTfE6jiS2.iterator();
                                                        while (it.hasNext()) {
                                                            zn0Var16.Ns0WNyEWdPsk(it.next());
                                                        }
                                                        defpackage.l31.w7APNrr0aGRc(list14, m31Var5);
                                                    }
                                                } catch (java.lang.Throwable th2) {
                                                    m31Var5.BXaznwstz2U0(th2, null);
                                                    defpackage.l31.ZVVdXbWmyCSK(m31Var5, list13, list14, list15, zn0Var16, zn0Var17, zn0Var14, zn0Var15);
                                                }
                                            }
                                            z2 = 0;
                                        } catch (java.lang.Throwable th3) {
                                            try {
                                                m31Var5.BXaznwstz2U0(th3, null);
                                                defpackage.l31.ZVVdXbWmyCSK(m31Var5, list13, list14, list15, zn0Var16, zn0Var17, zn0Var14, zn0Var15);
                                            } finally {
                                                list13.clear();
                                            }
                                        }
                                    }
                                    defpackage.me1 GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
                                    defpackage.me1 op1Var = GE9mJIPrb8gP instanceof defpackage.do0 ? new defpackage.op1((defpackage.do0) GE9mJIPrb8gP, null, null, true, false) : new defpackage.pp1(GE9mJIPrb8gP, null, true, z2);
                                    try {
                                        defpackage.me1 GE9mJIPrb8gP2 = op1Var.GE9mJIPrb8gP();
                                        try {
                                            if (!list15.isEmpty()) {
                                                try {
                                                    int size3 = list15.size();
                                                    for (int i17 = z2; i17 < size3; i17++) {
                                                        zn0Var17.ZpBGe2uQfcn8((defpackage.lj) list15.get(i17));
                                                    }
                                                    int size4 = list15.size();
                                                    for (int i18 = z2; i18 < size4; i18++) {
                                                        ((defpackage.lj) list15.get(i18)).JhCgjQRTAOCT();
                                                    }
                                                } catch (java.lang.Throwable th4) {
                                                    try {
                                                        m31Var5.BXaznwstz2U0(th4, null);
                                                        defpackage.l31.ZVVdXbWmyCSK(m31Var5, list13, list14, list15, zn0Var16, zn0Var17, zn0Var14, zn0Var15);
                                                        defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                                                        return defpackage.gs1.ZpBGe2uQfcn8;
                                                    } finally {
                                                        list15.clear();
                                                    }
                                                }
                                            }
                                            if (zn0Var16.P05cfTpS5W5L()) {
                                                try {
                                                    zn0Var17.GE9mJIPrb8gP(zn0Var16);
                                                    java.lang.Object[] objArr7 = zn0Var16.giKS3J6vZuNy;
                                                    long[] jArr = zn0Var16.ZpBGe2uQfcn8;
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
                                                                            ((defpackage.lj) objArr7[(i19 << 3) + i21]).oh71FJcDz6S2();
                                                                        } catch (java.lang.Throwable th5) {
                                                                            th = th5;
                                                                            try {
                                                                                m31Var5.BXaznwstz2U0(th, null);
                                                                                defpackage.l31.ZVVdXbWmyCSK(m31Var5, list8, list9, list15, zn0Var16, zn0Var17, zn0Var14, zn0Var15);
                                                                                defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                                                                                return defpackage.gs1.ZpBGe2uQfcn8;
                                                                            } finally {
                                                                                zn0Var16.giKS3J6vZuNy();
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
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    list8 = list13;
                                                    list9 = list14;
                                                }
                                            } else {
                                                j = 255;
                                            }
                                            if (zn0Var17.P05cfTpS5W5L()) {
                                                try {
                                                    java.lang.Object[] objArr8 = zn0Var17.giKS3J6vZuNy;
                                                    long[] jArr2 = zn0Var17.ZpBGe2uQfcn8;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        list10 = list13;
                                                        list11 = list14;
                                                        int i22 = 0;
                                                        while (true) {
                                                            try {
                                                                long j3 = jArr2[i22];
                                                                list12 = list15;
                                                                zn0Var13 = zn0Var16;
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                                    int i24 = 0;
                                                                    while (i24 < i23) {
                                                                        if ((j3 & j) < 128) {
                                                                            try {
                                                                                ((defpackage.lj) objArr8[(i22 << 3) + i24]).QiMR8OkAhezm();
                                                                            } catch (java.lang.Throwable th7) {
                                                                                th = th7;
                                                                                try {
                                                                                    m31Var5.BXaznwstz2U0(th, null);
                                                                                    defpackage.l31.ZVVdXbWmyCSK(m31Var5, list10, list11, list12, zn0Var13, zn0Var17, zn0Var14, zn0Var15);
                                                                                    return defpackage.gs1.ZpBGe2uQfcn8;
                                                                                } finally {
                                                                                    zn0Var17.giKS3J6vZuNy();
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
                                                                zn0Var16 = zn0Var13;
                                                                list15 = list12;
                                                                objArr8 = objArr4;
                                                            } catch (java.lang.Throwable th8) {
                                                                th = th8;
                                                                list12 = list15;
                                                                zn0Var13 = zn0Var16;
                                                                m31Var5.BXaznwstz2U0(th, null);
                                                                defpackage.l31.ZVVdXbWmyCSK(m31Var5, list10, list11, list12, zn0Var13, zn0Var17, zn0Var14, zn0Var15);
                                                                return defpackage.gs1.ZpBGe2uQfcn8;
                                                            }
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th9) {
                                                    th = th9;
                                                    list10 = list13;
                                                    list11 = list14;
                                                }
                                            }
                                            op1Var.fWTAfUmVKrZq();
                                            synchronized (m31Var5.fWTAfUmVKrZq) {
                                                if (m31Var5.oCu53ZX2v4Ju() != null) {
                                                    defpackage.ej.ZpBGe2uQfcn8("unexpected to get continuation here");
                                                }
                                            }
                                            defpackage.te1.GE9mJIPrb8gP().h3m55N1URyyK();
                                            zn0Var15.giKS3J6vZuNy();
                                            zn0Var14.giKS3J6vZuNy();
                                            m31Var5.WmetiUbpKU9I = null;
                                            return defpackage.gs1.ZpBGe2uQfcn8;
                                        } finally {
                                            defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                                        }
                                    } finally {
                                        op1Var.fWTAfUmVKrZq();
                                    }
                                } finally {
                                }
                            }
                        };
                        this.s0TASMVLSWD5 = q4Var;
                        this.e6mdH7fiFuta = list5;
                        this.GE9mJIPrb8gP = list2;
                        this.Ns0WNyEWdPsk = list4;
                        this.fNwYGHIYeJcR = zn0Var5;
                        this.h3m55N1URyyK = zn0Var11;
                        this.gUjdnLbkVAaA = zn0Var12;
                        this.T1fB7bDYiVJQ = set2;
                        this.XntWc4eZSQ8j = zn0Var6;
                        this.WmetiUbpKU9I = i2;
                        if (q4Var.ZpBGe2uQfcn8(this, y10Var) != tmVar2) {
                            java.util.List list8 = list4;
                            zn0Var2 = zn0Var6;
                            zn0Var = zn0Var5;
                            list = list5;
                            list3 = list8;
                            zn0Var3 = zn0Var12;
                            zn0Var4 = zn0Var11;
                            set = set2;
                            defpackage.m31 m31Var22 = this.BHfvd2J71qpO;
                            synchronized (m31Var22.fWTAfUmVKrZq) {
                            }
                        }
                    }
                }
                return tmVar2;
            }
            defpackage.zn0 zn0Var13 = this.XntWc4eZSQ8j;
            set = this.T1fB7bDYiVJQ;
            zn0Var3 = this.gUjdnLbkVAaA;
            zn0Var4 = this.h3m55N1URyyK;
            defpackage.zn0 zn0Var14 = this.fNwYGHIYeJcR;
            java.util.List list9 = this.Ns0WNyEWdPsk;
            list2 = this.GE9mJIPrb8gP;
            java.util.List list10 = this.e6mdH7fiFuta;
            defpackage.q4 q4Var4 = this.s0TASMVLSWD5;
            defpackage.b80.KrtOTfE6jiS2(obj);
            zn0Var6 = zn0Var13;
            q4Var = q4Var4;
            list4 = list9;
            list5 = list10;
            zn0Var5 = zn0Var14;
            final java.util.Set set22 = set;
            final defpackage.zn0 zn0Var112 = zn0Var4;
            final defpackage.zn0 zn0Var122 = zn0Var3;
            m31Var = this.BHfvd2J71qpO;
            defpackage.gg1 gg1Var2 = defpackage.m31.dG7RjM6DqYVL;
            if (m31Var.hH0RRJrNssvh()) {
            }
        }
    }
}
