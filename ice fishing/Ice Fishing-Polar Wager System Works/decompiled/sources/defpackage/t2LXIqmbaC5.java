package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class t2LXIqmbaC5 implements defpackage.k00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ t2LXIqmbaC5(int i, int i2, java.lang.Object obj) {
        this.adDC3e2L = i2;
        this.xiZrDbcSW0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a2, code lost:
    
        if (r3 == null) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a9  */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.Collection] */
    @Override // defpackage.k00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.t31 t31Var;
        char c;
        char c2;
        java.util.ArrayList arrayList;
        char c3 = 7;
        defpackage.ab abVar = null;
        r11 = null;
        r11 = null;
        r11 = null;
        defpackage.w71 w71Var = null;
        defpackage.u80 u80Var = null;
        switch (this.adDC3e2L) {
            case 0:
                ((java.lang.Integer) obj2).getClass();
                defpackage.fm.JlrlGoKF((java.util.List) this.xiZrDbcSW0, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(1));
                return defpackage.ok1.IHQe1A4L2xu;
            case 1:
                ((java.lang.Integer) obj2).getClass();
                defpackage.z8.IHQe1A4L2xu((defpackage.mj0) this.xiZrDbcSW0, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(1));
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.v01 v01Var = (defpackage.v01) this.xiZrDbcSW0;
                ((java.lang.Integer) obj).getClass();
                if (obj2 instanceof defpackage.ig) {
                    defpackage.ig igVar = (defpackage.ig) obj2;
                    defpackage.ol0 ol0Var = v01Var.EXtogiMhuM;
                    if (ol0Var == null) {
                        defpackage.ol0 ol0Var2 = defpackage.a51.IHQe1A4L2xu;
                        ol0Var = new defpackage.ol0();
                        v01Var.EXtogiMhuM = ol0Var;
                    }
                    ol0Var.ez2rX8ReCYw(igVar);
                    v01Var.xiZrDbcSW0.oh6vYeIP(igVar);
                }
                if (obj2 instanceof defpackage.x10) {
                    v01Var.adDC3e2L((defpackage.x10) obj2);
                }
                if (obj2 instanceof defpackage.az0) {
                    ((defpackage.az0) obj2).r1MBDhnF();
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                ((java.lang.Integer) obj2).getClass();
                defpackage.ci0.adDC3e2L((defpackage.no) this.xiZrDbcSW0, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(1));
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.t10 t10Var = (defpackage.t10) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                if (t10Var.lpprD5VAS(intValue & 1, (intValue & 3) != 2)) {
                    throw null;
                }
                t10Var.WLpAkxCo();
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                ((java.lang.Integer) obj2).getClass();
                defpackage.s21.adDC3e2L((defpackage.j30) this.xiZrDbcSW0, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(1));
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.q31 q31Var = (defpackage.q31) obj;
                java.util.List list = (java.util.List) ((defpackage.e6) this.xiZrDbcSW0).adDC3e2L(q31Var, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    java.lang.Object obj3 = list.get(i);
                    if (obj3 != null && (t31Var = q31Var.xiZrDbcSW0) != null && !t31Var.F7NU4MC0GW(obj3)) {
                        throw new java.lang.IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new java.util.ArrayList(list);
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Integer) obj2).getClass();
                defpackage.mj1.IHQe1A4L2xu((defpackage.WnQbjbWuMR) this.xiZrDbcSW0, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(1));
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.sk0 sk0Var = (defpackage.sk0) this.xiZrDbcSW0;
                java.util.Set set = (java.util.Set) obj;
                synchronized (sk0Var.IHQe1A4L2xu) {
                    try {
                        defpackage.nl0 nl0Var = sk0Var.oh6vYeIP;
                        defpackage.r1MBDhnF r1mbdhnf = new defpackage.r1MBDhnF(15, set, sk0Var);
                        defpackage.mj1.kNAkVymC(1, r1mbdhnf);
                        java.lang.Object[] objArr = nl0Var.oh6vYeIP;
                        long[] jArr = nl0Var.IHQe1A4L2xu;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((j & 255) < 128) {
                                            r1mbdhnf.AARZUJiTa(objArr[(i2 << 3) + i4]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i3 != 8) {
                                    }
                                }
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                        defpackage.ol0 ol0Var3 = sk0Var.F7NU4MC0GW;
                        java.lang.Object[] objArr2 = ol0Var3.oh6vYeIP;
                        long[] jArr2 = ol0Var3.IHQe1A4L2xu;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j2 = jArr2[i5];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j2 & 255) < 128) {
                                            ((defpackage.w71) objArr2[(i5 << 3) + i7]).riuEU0zW4(defpackage.ok1.IHQe1A4L2xu);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i6 != 8) {
                                    }
                                }
                                if (i5 != length2) {
                                    i5++;
                                }
                            }
                        }
                        sk0Var.F7NU4MC0GW.oh6vYeIP();
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 9:
                defpackage.gz0 gz0Var = (defpackage.gz0) this.xiZrDbcSW0;
                java.util.Set set2 = (java.util.Set) obj;
                synchronized (gz0Var.r1MBDhnF) {
                    try {
                        if (((defpackage.dz0) gz0Var.kNAkVymC.getValue()).compareTo(defpackage.dz0.riuEU0zW4) >= 0) {
                            defpackage.ol0 ol0Var4 = gz0Var.EXtogiMhuM;
                            if (set2 instanceof defpackage.b51) {
                                defpackage.ol0 ol0Var5 = ((defpackage.b51) set2).adDC3e2L;
                                java.lang.Object[] objArr3 = ol0Var5.oh6vYeIP;
                                long[] jArr3 = ol0Var5.IHQe1A4L2xu;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j3 = jArr3[i8];
                                        if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                                            int i10 = 0;
                                            while (i10 < i9) {
                                                if ((j3 & 255) < 128) {
                                                    java.lang.Object obj4 = objArr3[(i8 << 3) + i10];
                                                    c2 = c3;
                                                    if (!(obj4 instanceof defpackage.lc1) || ((defpackage.lc1) obj4).adDC3e2L(1)) {
                                                        ol0Var4.IHQe1A4L2xu(obj4);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j3 >>= 8;
                                                i10++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i9 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i8 != length3) {
                                            i8++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (java.lang.Object obj5 : set2) {
                                    if (!(obj5 instanceof defpackage.lc1) || ((defpackage.lc1) obj5).adDC3e2L(1)) {
                                        ol0Var4.IHQe1A4L2xu(obj5);
                                    }
                                }
                            }
                            abVar = gz0Var.NHJTzaLwkd();
                        }
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
                if (abVar != null) {
                    ((defpackage.bb) abVar).SH1y5HwkJhh(defpackage.ok1.IHQe1A4L2xu);
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 10:
                defpackage.l31 l31Var = (defpackage.l31) this.xiZrDbcSW0;
                int intValue2 = ((java.lang.Integer) obj).intValue();
                defpackage.jj jjVar = (defpackage.jj) obj2;
                defpackage.kj key = jjVar.getKey();
                defpackage.jj cnag84Bm = l31Var.riuEU0zW4.cnag84Bm(key);
                if (key != defpackage.n.lpprD5VAS) {
                    if (jjVar != cnag84Bm) {
                        intValue2 = Integer.MIN_VALUE;
                    }
                    intValue2++;
                } else {
                    defpackage.u80 u80Var2 = (defpackage.u80) cnag84Bm;
                    defpackage.u80 u80Var3 = (defpackage.u80) jjVar;
                    while (u80Var3 != null) {
                        if (u80Var3 != u80Var2 && (u80Var3 instanceof defpackage.e51)) {
                            defpackage.ic lpprD5VAS = ((defpackage.e51) u80Var3).lpprD5VAS();
                            u80Var3 = lpprD5VAS != null ? lpprD5VAS.getParent() : null;
                        } else {
                            u80Var = u80Var3;
                            if (u80Var == u80Var2) {
                                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + u80Var + ", expected child of " + u80Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (u80Var == u80Var2) {
                    }
                }
                return java.lang.Integer.valueOf(intValue2);
            case 11:
                defpackage.a61 a61Var = (defpackage.a61) this.xiZrDbcSW0;
                defpackage.fm.SiPhmbmu(a61Var.dOmtpLcqqI1y(), null, new defpackage.z51(a61Var, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue(), null), 3);
                return java.lang.Boolean.TRUE;
            case 12:
                defpackage.jg1 jg1Var = (defpackage.jg1) this.xiZrDbcSW0;
                defpackage.t10 t10Var2 = (defpackage.t10) obj;
                int intValue3 = ((java.lang.Integer) obj2).intValue();
                if (t10Var2.lpprD5VAS(intValue3 & 1, (intValue3 & 3) != 2)) {
                    defpackage.of1.oh6vYeIP(jg1Var.adDC3e2L, null, 0L, 0L, 0L, null, 0L, 2, false, 1, 0, null, t10Var2, 0, 24960, 241662);
                } else {
                    t10Var2.WLpAkxCo();
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 13:
                defpackage.y91 y91Var = (defpackage.y91) this.xiZrDbcSW0;
                java.util.Set set3 = (java.util.Set) obj;
                synchronized (y91Var.IHQe1A4L2xu) {
                    try {
                        defpackage.ol0 ol0Var6 = y91Var.F7NU4MC0GW;
                        if (ol0Var6 != null) {
                            java.lang.Object[] objArr4 = ol0Var6.oh6vYeIP;
                            long[] jArr4 = ol0Var6.IHQe1A4L2xu;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j4 = jArr4[i11];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length4)) >>> 31);
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < i12) {
                                                if ((j4 & 255) >= 128 || !set3.contains(objArr4[(i11 << 3) + i13])) {
                                                    j4 >>= 8;
                                                    i13++;
                                                } else {
                                                    w71Var = y91Var.xiZrDbcSW0;
                                                }
                                            } else if (i12 != 8) {
                                            }
                                        }
                                    }
                                    if (i11 != length4) {
                                        i11++;
                                    }
                                }
                            }
                        } else if (defpackage.td.CGXpA9s3RjIa(set3, y91Var.oh6vYeIP)) {
                            w71Var = y91Var.xiZrDbcSW0;
                        }
                    } catch (java.lang.Throwable th3) {
                        throw th3;
                    }
                }
                if (w71Var != null) {
                    w71Var.riuEU0zW4(defpackage.ok1.IHQe1A4L2xu);
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 14:
                defpackage.ib1 ib1Var = (defpackage.ib1) this.xiZrDbcSW0;
                java.util.Set set4 = (java.util.Set) obj;
                java.util.concurrent.atomic.AtomicReference atomicReference = ib1Var.oh6vYeIP;
                while (true) {
                    java.lang.Object obj6 = atomicReference.get();
                    if (obj6 == null) {
                        arrayList = set4;
                    } else if (obj6 instanceof java.util.Set) {
                        arrayList = defpackage.fm.yIx6ChFVk(new java.util.Set[]{obj6, set4});
                    } else {
                        if (!(obj6 instanceof java.util.List)) {
                            defpackage.dh.oh6vYeIP("Unexpected notification");
                            throw new defpackage.cf();
                        }
                        arrayList = defpackage.td.flIYPhR0((java.util.Collection) obj6, defpackage.fm.p4kuH6PDtgom(set4));
                    }
                    while (!atomicReference.compareAndSet(obj6, arrayList)) {
                        if (atomicReference.get() != obj6) {
                            break;
                        }
                    }
                    if (ib1Var.IHQe1A4L2xu()) {
                        ib1Var.IHQe1A4L2xu.AARZUJiTa(new defpackage.e3(21, ib1Var));
                    }
                    return defpackage.ok1.IHQe1A4L2xu;
                    break;
                }
            default:
                return new defpackage.z60(((defpackage.e8) this.xiZrDbcSW0).IHQe1A4L2xu(0L, ((defpackage.i70) obj).IHQe1A4L2xu, (defpackage.w90) obj2));
        }
    }

    public /* synthetic */ t2LXIqmbaC5(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }
}
