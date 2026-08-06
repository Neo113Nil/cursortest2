package defpackage;

/* loaded from: classes.dex */
public final class fz0 extends defpackage.ce1 implements defpackage.l00 {
    public defpackage.ol0 DFo87pBq1E5;
    public final /* synthetic */ defpackage.gz0 EgCjBq0SZwJ;
    public int G3OKOH3wZRC;
    public defpackage.ol0 JlrlGoKF;
    public defpackage.ol0 QoRHpC4k;
    public java.util.List SH1y5HwkJhh;
    public defpackage.ol0 SyNS6RMn;
    public java.util.Set cnag84Bm;
    public java.util.List ez2rX8ReCYw;
    public /* synthetic */ defpackage.o3 kd6TUFXn;
    public java.util.List riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(defpackage.gz0 gz0Var, defpackage.ej ejVar) {
        super(3, ejVar);
        this.EgCjBq0SZwJ = gz0Var;
    }

    public static final void G3OKOH3wZRC(defpackage.gz0 gz0Var, java.util.List list, java.util.List list2, java.util.List list3, defpackage.ol0 ol0Var, defpackage.ol0 ol0Var2, defpackage.ol0 ol0Var3, defpackage.ol0 ol0Var4) {
        char c;
        long j;
        long j2;
        synchronized (gz0Var.r1MBDhnF) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    defpackage.kh khVar = (defpackage.kh) list3.get(i);
                    khVar.IHQe1A4L2xu();
                    gz0Var.mAr5m2L7gYDP(khVar);
                }
                list3.clear();
                java.lang.Object[] objArr = ol0Var.oh6vYeIP;
                long[] jArr = ol0Var.IHQe1A4L2xu;
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
                                    defpackage.kh khVar2 = (defpackage.kh) objArr[(i2 << 3) + i4];
                                    khVar2.IHQe1A4L2xu();
                                    gz0Var.mAr5m2L7gYDP(khVar2);
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
                ol0Var.oh6vYeIP();
                java.lang.Object[] objArr2 = ol0Var2.oh6vYeIP;
                long[] jArr2 = ol0Var2.IHQe1A4L2xu;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((defpackage.kh) objArr2[(i5 << 3) + i7]).AARZUJiTa();
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
                ol0Var2.oh6vYeIP();
                ol0Var3.oh6vYeIP();
                java.lang.Object[] objArr3 = ol0Var4.oh6vYeIP;
                long[] jArr3 = ol0Var4.IHQe1A4L2xu;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    defpackage.kh khVar3 = (defpackage.kh) objArr3[(i8 << 3) + i10];
                                    khVar3.IHQe1A4L2xu();
                                    gz0Var.mAr5m2L7gYDP(khVar3);
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
                ol0Var4.oh6vYeIP();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static final void kd6TUFXn(java.util.List list, defpackage.gz0 gz0Var) {
        list.clear();
        synchronized (gz0Var.r1MBDhnF) {
            try {
                java.util.ArrayList arrayList = gz0Var.ez2rX8ReCYw;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((defpackage.jk0) arrayList.get(i));
                }
                gz0Var.ez2rX8ReCYw.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.fz0 fz0Var = new defpackage.fz0(this.EgCjBq0SZwJ, (defpackage.ej) obj3);
        fz0Var.kd6TUFXn = (defpackage.o3) obj2;
        fz0Var.SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
        return defpackage.vj.adDC3e2L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0124 -> B:6:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01d9 -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.o3 o3Var;
        defpackage.ol0 ol0Var;
        defpackage.ol0 ol0Var2;
        java.util.List list;
        java.util.Set set;
        final java.util.List list2;
        defpackage.ol0 ol0Var3;
        java.util.List list3;
        defpackage.ol0 ol0Var4;
        final java.util.List list4;
        final defpackage.ol0 ol0Var5;
        final java.util.List list5;
        final defpackage.ol0 ol0Var6;
        defpackage.gz0 gz0Var;
        java.lang.Object obj2;
        defpackage.bb bbVar;
        defpackage.vj vjVar;
        defpackage.o3 o3Var2;
        defpackage.gl0 gl0Var;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        int i = this.G3OKOH3wZRC;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            o3Var = this.kd6TUFXn;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            defpackage.ol0 ol0Var7 = defpackage.a51.IHQe1A4L2xu;
            ol0Var = new defpackage.ol0();
            defpackage.ol0 ol0Var8 = new defpackage.ol0();
            defpackage.ol0 ol0Var9 = new defpackage.ol0();
            defpackage.b51 b51Var = new defpackage.b51(ol0Var9);
            ol0Var2 = new defpackage.ol0();
            list = arrayList;
            set = b51Var;
            list2 = arrayList2;
            ol0Var3 = ol0Var9;
            list3 = arrayList3;
            ol0Var4 = ol0Var8;
            synchronized (this.EgCjBq0SZwJ.r1MBDhnF) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.ol0 ol0Var10 = this.QoRHpC4k;
                set = this.cnag84Bm;
                ol0Var3 = this.SyNS6RMn;
                ol0Var4 = this.DFo87pBq1E5;
                ol0Var = this.JlrlGoKF;
                list3 = this.ez2rX8ReCYw;
                list2 = this.SH1y5HwkJhh;
                list = this.riuEU0zW4;
                defpackage.o3 o3Var3 = this.kd6TUFXn;
                defpackage.f70.nBH8hAHy(obj);
                ol0Var2 = ol0Var10;
                o3Var = o3Var3;
                defpackage.gz0 gz0Var2 = this.EgCjBq0SZwJ;
                synchronized (gz0Var2.r1MBDhnF) {
                    try {
                        if (gz0Var2.JlrlGoKF.SH1y5HwkJhh()) {
                            defpackage.gl0 oh6vYeIP = defpackage.tk0.oh6vYeIP(gz0Var2.JlrlGoKF);
                            gz0Var2.JlrlGoKF.IHQe1A4L2xu();
                            defpackage.F7NU4MC0GW f7nu4mc0gw = gz0Var2.DFo87pBq1E5;
                            ((defpackage.nl0) f7nu4mc0gw.xiZrDbcSW0).IHQe1A4L2xu();
                            ((defpackage.nl0) f7nu4mc0gw.AARZUJiTa).IHQe1A4L2xu();
                            gz0Var2.cnag84Bm.IHQe1A4L2xu();
                            gl0Var = new defpackage.gl0(oh6vYeIP.oh6vYeIP);
                            java.lang.Object[] objArr = oh6vYeIP.IHQe1A4L2xu;
                            int i4 = oh6vYeIP.oh6vYeIP;
                            vjVar = vjVar2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                defpackage.jk0 jk0Var = (defpackage.jk0) objArr[i5];
                                gl0Var.IHQe1A4L2xu(new defpackage.et0(jk0Var, gz0Var2.SyNS6RMn.AARZUJiTa(jk0Var)));
                                i5 = i6 + 1;
                                o3Var = o3Var;
                                objArr = objArr;
                            }
                            o3Var2 = o3Var;
                            gz0Var2.SyNS6RMn.IHQe1A4L2xu();
                        } else {
                            vjVar = vjVar2;
                            o3Var2 = o3Var;
                            gl0Var = defpackage.vp0.oh6vYeIP;
                            gl0Var.getClass();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                java.lang.Object[] objArr2 = gl0Var.IHQe1A4L2xu;
                int i7 = gl0Var.oh6vYeIP;
                for (int i8 = 0; i8 < i7; i8++) {
                    defpackage.et0 et0Var = (defpackage.et0) objArr2[i8];
                }
                defpackage.v5 v5Var = this.EgCjBq0SZwJ.oh6vYeIP;
                ((defpackage.y6) v5Var.oh6vYeIP).set(0);
                ((defpackage.m7) v5Var.r1MBDhnF).adDC3e2L(new defpackage.uc0(20));
                vjVar2 = vjVar;
                o3Var = o3Var2;
                i2 = 2;
                i3 = 1;
                synchronized (this.EgCjBq0SZwJ.r1MBDhnF) {
                }
                defpackage.gz0 gz0Var3 = this.EgCjBq0SZwJ;
                this.kd6TUFXn = o3Var;
                this.riuEU0zW4 = list;
                this.SH1y5HwkJhh = list2;
                this.ez2rX8ReCYw = list3;
                this.JlrlGoKF = ol0Var;
                this.DFo87pBq1E5 = ol0Var4;
                this.SyNS6RMn = ol0Var3;
                this.cnag84Bm = set;
                this.QoRHpC4k = ol0Var2;
                this.G3OKOH3wZRC = i3;
                if (gz0Var3.nBH8hAHy()) {
                    obj2 = defpackage.ok1.IHQe1A4L2xu;
                } else {
                    defpackage.bb bbVar2 = new defpackage.bb(i3, defpackage.c80.V7bD7b8KA(this));
                    bbVar2.PAEGRtP0bX();
                    synchronized (gz0Var3.r1MBDhnF) {
                        if (gz0Var3.nBH8hAHy()) {
                            bbVar = bbVar2;
                        } else {
                            gz0Var3.kd6TUFXn = bbVar2;
                            bbVar = null;
                        }
                    }
                    if (bbVar != null) {
                        bbVar.SH1y5HwkJhh(defpackage.ok1.IHQe1A4L2xu);
                    }
                    obj2 = bbVar2.kNAkVymC();
                    if (obj2 != defpackage.vj.adDC3e2L) {
                        obj2 = defpackage.ok1.IHQe1A4L2xu;
                    }
                }
                if (obj2 != vjVar2) {
                    java.util.List list6 = list;
                    ol0Var5 = ol0Var;
                    ol0Var6 = ol0Var2;
                    list4 = list3;
                    list5 = list6;
                    final java.util.Set set2 = set;
                    final defpackage.ol0 ol0Var11 = ol0Var4;
                    final defpackage.ol0 ol0Var12 = ol0Var3;
                    gz0Var = this.EgCjBq0SZwJ;
                    defpackage.hc1 hc1Var = defpackage.gz0.QQUzIjv3iOC5;
                    if (gz0Var.XZx205DYe()) {
                        java.util.List list7 = list4;
                        ol0Var2 = ol0Var6;
                        ol0Var = ol0Var5;
                        list = list5;
                        list3 = list7;
                        ol0Var3 = ol0Var12;
                        ol0Var4 = ol0Var11;
                        set = set2;
                        synchronized (this.EgCjBq0SZwJ.r1MBDhnF) {
                        }
                    } else {
                        final defpackage.gz0 gz0Var4 = this.EgCjBq0SZwJ;
                        defpackage.g00 g00Var = new defpackage.g00() { // from class: ez0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.g00
                            public final java.lang.Object AARZUJiTa(java.lang.Object obj3) {
                                boolean QQUzIjv3iOC5;
                                java.lang.Object[] objArr3;
                                java.util.List list8;
                                java.util.List list9;
                                long j;
                                java.util.List list10;
                                java.util.List list11;
                                java.util.List list12;
                                defpackage.ol0 ol0Var13;
                                java.lang.Object[] objArr4;
                                boolean z;
                                defpackage.gz0 gz0Var5 = defpackage.gz0.this;
                                defpackage.ol0 ol0Var14 = ol0Var12;
                                defpackage.ol0 ol0Var15 = ol0Var6;
                                java.util.List list13 = list5;
                                java.util.List list14 = list2;
                                defpackage.ol0 ol0Var16 = ol0Var5;
                                java.util.List list15 = list4;
                                defpackage.ol0 ol0Var17 = ol0Var11;
                                java.util.Set set3 = set2;
                                final long longValue = ((java.lang.Long) obj3).longValue();
                                synchronized (gz0Var5.r1MBDhnF) {
                                    QQUzIjv3iOC5 = gz0Var5.QQUzIjv3iOC5();
                                }
                                boolean z2 = 0;
                                if (QQUzIjv3iOC5) {
                                    android.os.Trace.beginSection("Recomposer:animation");
                                    try {
                                        ((defpackage.m7) gz0Var5.IHQe1A4L2xu.AARZUJiTa).adDC3e2L(new defpackage.g00() { // from class: o9
                                            @Override // defpackage.g00
                                            public final java.lang.Object AARZUJiTa(java.lang.Object obj4) {
                                                defpackage.bb bbVar3;
                                                java.lang.Object p11Var;
                                                long j2 = longValue;
                                                defpackage.p9 p9Var = (defpackage.p9) obj4;
                                                defpackage.g00 g00Var2 = p9Var.oh6vYeIP;
                                                if (g00Var2 != null && (bbVar3 = p9Var.IHQe1A4L2xu) != null) {
                                                    try {
                                                        p11Var = g00Var2.AARZUJiTa(java.lang.Long.valueOf(j2));
                                                    } catch (java.lang.Throwable th2) {
                                                        p11Var = new defpackage.p11(th2);
                                                    }
                                                    bbVar3.SH1y5HwkJhh(p11Var);
                                                }
                                                return defpackage.ok1.IHQe1A4L2xu;
                                            }
                                        });
                                        synchronized (defpackage.wa1.r1MBDhnF) {
                                            defpackage.ol0 ol0Var18 = defpackage.wa1.SH1y5HwkJhh.EXtogiMhuM;
                                            if (ol0Var18 != null) {
                                                z = ol0Var18.EXtogiMhuM();
                                            }
                                        }
                                        if (z) {
                                            defpackage.wa1.IHQe1A4L2xu();
                                        }
                                    } finally {
                                    }
                                }
                                android.os.Trace.beginSection("Recomposer:recompose");
                                try {
                                    gz0Var5.XZx205DYe();
                                    synchronized (gz0Var5.r1MBDhnF) {
                                        try {
                                            defpackage.xl0 xl0Var = gz0Var5.riuEU0zW4;
                                            java.lang.Object[] objArr5 = xl0Var.adDC3e2L;
                                            int i9 = xl0Var.AARZUJiTa;
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                list13.add((defpackage.kh) objArr5[i10]);
                                            }
                                            gz0Var5.riuEU0zW4.AARZUJiTa();
                                        } finally {
                                        }
                                    }
                                    ol0Var14.oh6vYeIP();
                                    ol0Var15.oh6vYeIP();
                                    while (true) {
                                        if (list13.isEmpty() && list14.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list13.size();
                                            for (int i11 = 0; i11 < size; i11++) {
                                                defpackage.kh khVar = (defpackage.kh) list13.get(i11);
                                                defpackage.kh yIx6ChFVk = gz0Var5.yIx6ChFVk(khVar, ol0Var14);
                                                if (yIx6ChFVk != null) {
                                                    list15.add(yIx6ChFVk);
                                                }
                                                ol0Var15.IHQe1A4L2xu(khVar);
                                            }
                                            list13.clear();
                                            if (ol0Var14.EXtogiMhuM() || gz0Var5.riuEU0zW4.AARZUJiTa != 0) {
                                                synchronized (gz0Var5.r1MBDhnF) {
                                                    try {
                                                        java.util.List v5iciZok = gz0Var5.v5iciZok();
                                                        int size2 = v5iciZok.size();
                                                        for (int i12 = 0; i12 < size2; i12++) {
                                                            defpackage.kh khVar2 = (defpackage.kh) v5iciZok.get(i12);
                                                            if (!ol0Var15.r1MBDhnF(khVar2) && khVar2.V7bD7b8KA(set3)) {
                                                                list13.add(khVar2);
                                                            }
                                                        }
                                                        defpackage.xl0 xl0Var2 = gz0Var5.riuEU0zW4;
                                                        int i13 = xl0Var2.AARZUJiTa;
                                                        int i14 = 0;
                                                        int i15 = 0;
                                                        while (true) {
                                                            objArr3 = xl0Var2.adDC3e2L;
                                                            if (i14 >= i13) {
                                                                break;
                                                            }
                                                            defpackage.kh khVar3 = (defpackage.kh) objArr3[i14];
                                                            if (!ol0Var15.r1MBDhnF(khVar3) && !list13.contains(khVar3)) {
                                                                list13.add(khVar3);
                                                                i15++;
                                                            } else if (i15 > 0) {
                                                                java.lang.Object[] objArr6 = xl0Var2.adDC3e2L;
                                                                objArr6[i14 - i15] = objArr6[i14];
                                                            }
                                                            i14++;
                                                        }
                                                        int i16 = i13 - i15;
                                                        java.util.Arrays.fill(objArr3, i16, i13, (java.lang.Object) null);
                                                        xl0Var2.AARZUJiTa = i16;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list13.isEmpty()) {
                                                try {
                                                    defpackage.fz0.kd6TUFXn(list14, gz0Var5);
                                                    while (!list14.isEmpty()) {
                                                        java.util.List p4kuH6PDtgom = gz0Var5.p4kuH6PDtgom(list14, ol0Var14);
                                                        ol0Var16.getClass();
                                                        java.util.Iterator it = p4kuH6PDtgom.iterator();
                                                        while (it.hasNext()) {
                                                            ol0Var16.ez2rX8ReCYw(it.next());
                                                        }
                                                        defpackage.fz0.kd6TUFXn(list14, gz0Var5);
                                                    }
                                                } catch (java.lang.Throwable th2) {
                                                    gz0Var5.wll2JLbTBC2(th2, null);
                                                    defpackage.fz0.G3OKOH3wZRC(gz0Var5, list13, list14, list15, ol0Var16, ol0Var17, ol0Var14, ol0Var15);
                                                }
                                            }
                                            z2 = 0;
                                        } catch (java.lang.Throwable th3) {
                                            try {
                                                gz0Var5.wll2JLbTBC2(th3, null);
                                                defpackage.fz0.G3OKOH3wZRC(gz0Var5, list13, list14, list15, ol0Var16, ol0Var17, ol0Var14, ol0Var15);
                                            } finally {
                                                list13.clear();
                                            }
                                        }
                                    }
                                    defpackage.oa1 SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
                                    defpackage.oa1 ri1Var = SH1y5HwkJhh instanceof defpackage.rl0 ? new defpackage.ri1((defpackage.rl0) SH1y5HwkJhh, null, null, true, false) : new defpackage.si1(SH1y5HwkJhh, null, true, z2);
                                    try {
                                        defpackage.oa1 SH1y5HwkJhh2 = ri1Var.SH1y5HwkJhh();
                                        try {
                                            if (!list15.isEmpty()) {
                                                try {
                                                    int size3 = list15.size();
                                                    for (int i17 = z2; i17 < size3; i17++) {
                                                        ol0Var17.IHQe1A4L2xu((defpackage.kh) list15.get(i17));
                                                    }
                                                    int size4 = list15.size();
                                                    for (int i18 = z2; i18 < size4; i18++) {
                                                        ((defpackage.kh) list15.get(i18)).F7NU4MC0GW();
                                                    }
                                                } catch (java.lang.Throwable th4) {
                                                    try {
                                                        gz0Var5.wll2JLbTBC2(th4, null);
                                                        defpackage.fz0.G3OKOH3wZRC(gz0Var5, list13, list14, list15, ol0Var16, ol0Var17, ol0Var14, ol0Var15);
                                                        defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                                                        return defpackage.ok1.IHQe1A4L2xu;
                                                    } finally {
                                                        list15.clear();
                                                    }
                                                }
                                            }
                                            if (ol0Var16.EXtogiMhuM()) {
                                                try {
                                                    ol0Var17.SH1y5HwkJhh(ol0Var16);
                                                    java.lang.Object[] objArr7 = ol0Var16.oh6vYeIP;
                                                    long[] jArr = ol0Var16.IHQe1A4L2xu;
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
                                                                            ((defpackage.kh) objArr7[(i19 << 3) + i21]).xiZrDbcSW0();
                                                                        } catch (java.lang.Throwable th5) {
                                                                            th = th5;
                                                                            try {
                                                                                gz0Var5.wll2JLbTBC2(th, null);
                                                                                defpackage.fz0.G3OKOH3wZRC(gz0Var5, list8, list9, list15, ol0Var16, ol0Var17, ol0Var14, ol0Var15);
                                                                                defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                                                                                return defpackage.ok1.IHQe1A4L2xu;
                                                                            } finally {
                                                                                ol0Var16.oh6vYeIP();
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
                                            if (ol0Var17.EXtogiMhuM()) {
                                                try {
                                                    java.lang.Object[] objArr8 = ol0Var17.oh6vYeIP;
                                                    long[] jArr2 = ol0Var17.IHQe1A4L2xu;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        list10 = list13;
                                                        list11 = list14;
                                                        int i22 = 0;
                                                        while (true) {
                                                            try {
                                                                long j3 = jArr2[i22];
                                                                list12 = list15;
                                                                ol0Var13 = ol0Var16;
                                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                                                                    int i24 = 0;
                                                                    while (i24 < i23) {
                                                                        if ((j3 & j) < 128) {
                                                                            try {
                                                                                ((defpackage.kh) objArr8[(i22 << 3) + i24]).AARZUJiTa();
                                                                            } catch (java.lang.Throwable th7) {
                                                                                th = th7;
                                                                                try {
                                                                                    gz0Var5.wll2JLbTBC2(th, null);
                                                                                    defpackage.fz0.G3OKOH3wZRC(gz0Var5, list10, list11, list12, ol0Var13, ol0Var17, ol0Var14, ol0Var15);
                                                                                    return defpackage.ok1.IHQe1A4L2xu;
                                                                                } finally {
                                                                                    ol0Var17.oh6vYeIP();
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
                                                                ol0Var16 = ol0Var13;
                                                                list15 = list12;
                                                                objArr8 = objArr4;
                                                            } catch (java.lang.Throwable th8) {
                                                                th = th8;
                                                                list12 = list15;
                                                                ol0Var13 = ol0Var16;
                                                                gz0Var5.wll2JLbTBC2(th, null);
                                                                defpackage.fz0.G3OKOH3wZRC(gz0Var5, list10, list11, list12, ol0Var13, ol0Var17, ol0Var14, ol0Var15);
                                                                return defpackage.ok1.IHQe1A4L2xu;
                                                            }
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th9) {
                                                    th = th9;
                                                    list10 = list13;
                                                    list11 = list14;
                                                }
                                            }
                                            ri1Var.r1MBDhnF();
                                            synchronized (gz0Var5.r1MBDhnF) {
                                                if (gz0Var5.NHJTzaLwkd() != null) {
                                                    defpackage.dh.IHQe1A4L2xu("unexpected to get continuation here");
                                                }
                                            }
                                            defpackage.wa1.SH1y5HwkJhh().DFo87pBq1E5();
                                            ol0Var15.oh6vYeIP();
                                            ol0Var14.oh6vYeIP();
                                            gz0Var5.G3OKOH3wZRC = null;
                                            return defpackage.ok1.IHQe1A4L2xu;
                                        } finally {
                                            defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                                        }
                                    } finally {
                                        ri1Var.r1MBDhnF();
                                    }
                                } finally {
                                }
                            }
                        };
                        this.kd6TUFXn = o3Var;
                        this.riuEU0zW4 = list5;
                        this.SH1y5HwkJhh = list2;
                        this.ez2rX8ReCYw = list4;
                        this.JlrlGoKF = ol0Var5;
                        this.DFo87pBq1E5 = ol0Var11;
                        this.SyNS6RMn = ol0Var12;
                        this.cnag84Bm = set2;
                        this.QoRHpC4k = ol0Var6;
                        this.G3OKOH3wZRC = i2;
                        if (o3Var.IHQe1A4L2xu(g00Var, this) != vjVar2) {
                            java.util.List list8 = list4;
                            ol0Var2 = ol0Var6;
                            ol0Var = ol0Var5;
                            list = list5;
                            list3 = list8;
                            ol0Var3 = ol0Var12;
                            ol0Var4 = ol0Var11;
                            set = set2;
                            defpackage.gz0 gz0Var22 = this.EgCjBq0SZwJ;
                            synchronized (gz0Var22.r1MBDhnF) {
                            }
                        }
                    }
                }
                return vjVar2;
            }
            defpackage.ol0 ol0Var13 = this.QoRHpC4k;
            set = this.cnag84Bm;
            ol0Var3 = this.SyNS6RMn;
            ol0Var4 = this.DFo87pBq1E5;
            defpackage.ol0 ol0Var14 = this.JlrlGoKF;
            java.util.List list9 = this.ez2rX8ReCYw;
            list2 = this.SH1y5HwkJhh;
            java.util.List list10 = this.riuEU0zW4;
            defpackage.o3 o3Var4 = this.kd6TUFXn;
            defpackage.f70.nBH8hAHy(obj);
            ol0Var6 = ol0Var13;
            o3Var = o3Var4;
            list4 = list9;
            list5 = list10;
            ol0Var5 = ol0Var14;
            final java.util.Set set22 = set;
            final defpackage.ol0 ol0Var112 = ol0Var4;
            final defpackage.ol0 ol0Var122 = ol0Var3;
            gz0Var = this.EgCjBq0SZwJ;
            defpackage.hc1 hc1Var2 = defpackage.gz0.QQUzIjv3iOC5;
            if (gz0Var.XZx205DYe()) {
            }
        }
    }
}
