package defpackage;

/* loaded from: classes.dex */
public final class u31 implements defpackage.t31 {
    public defpackage.nl0 AARZUJiTa;
    public final defpackage.g00 adDC3e2L;
    public final defpackage.nl0 xiZrDbcSW0;

    public u31(java.util.Map map, defpackage.g00 g00Var) {
        defpackage.nl0 nl0Var;
        this.adDC3e2L = g00Var;
        if (map == null || map.isEmpty()) {
            nl0Var = null;
        } else {
            nl0Var = new defpackage.nl0(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                nl0Var.DFo87pBq1E5(entry.getKey(), entry.getValue());
            }
        }
        this.xiZrDbcSW0 = nl0Var;
    }

    @Override // defpackage.t31
    public final boolean F7NU4MC0GW(java.lang.Object obj) {
        return ((java.lang.Boolean) this.adDC3e2L.AARZUJiTa(obj)).booleanValue();
    }

    @Override // defpackage.t31
    public final defpackage.v5 IHQe1A4L2xu(java.lang.String str, defpackage.vz vzVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!defpackage.x70.yIx6ChFVk(str.charAt(i))) {
                defpackage.nl0 nl0Var = this.AARZUJiTa;
                if (nl0Var == null) {
                    long[] jArr = defpackage.z41.IHQe1A4L2xu;
                    nl0Var = new defpackage.nl0();
                    this.AARZUJiTa = nl0Var;
                }
                java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(str);
                if (AARZUJiTa == null) {
                    AARZUJiTa = new java.util.ArrayList();
                    nl0Var.DFo87pBq1E5(str, AARZUJiTa);
                }
                ((java.util.List) AARZUJiTa).add(vzVar);
                return new defpackage.v5(nl0Var, str, vzVar, 13);
            }
        }
        defpackage.db.fnWB2E7cs("Registered key is empty or blank");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // defpackage.t31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map adDC3e2L() {
        char c;
        long j;
        long j2;
        long j3;
        defpackage.nl0 nl0Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        defpackage.nl0 nl0Var2 = this.xiZrDbcSW0;
        if (nl0Var2 == null && this.AARZUJiTa == null) {
            return defpackage.ot.adDC3e2L;
        }
        int i3 = 0;
        int i4 = nl0Var2 != null ? nl0Var2.adDC3e2L : 0;
        defpackage.nl0 nl0Var3 = this.AARZUJiTa;
        java.util.HashMap hashMap = new java.util.HashMap(i4 + (nl0Var3 != null ? nl0Var3.adDC3e2L : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (nl0Var2 != null) {
            java.lang.Object[] objArr = nl0Var2.oh6vYeIP;
            java.lang.Object[] objArr2 = nl0Var2.r1MBDhnF;
            long[] jArr3 = nl0Var2.IHQe1A4L2xu;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((java.lang.String) objArr[i9], (java.util.List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                nl0Var = this.AARZUJiTa;
                if (nl0Var != null) {
                    java.lang.Object[] objArr3 = nl0Var.oh6vYeIP;
                    java.lang.Object[] objArr4 = nl0Var.r1MBDhnF;
                    long[] jArr4 = nl0Var.IHQe1A4L2xu;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        java.lang.Object obj = objArr3[i13];
                                        java.util.List list = (java.util.List) objArr4[i13];
                                        java.lang.String str = (java.lang.String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            java.lang.Object IHQe1A4L2xu = ((defpackage.vz) list.get(i3)).IHQe1A4L2xu();
                                            if (IHQe1A4L2xu != null) {
                                                if (!F7NU4MC0GW(IHQe1A4L2xu)) {
                                                    throw new java.lang.IllegalStateException(defpackage.e90.cnag84Bm(IHQe1A4L2xu).toString());
                                                }
                                                hashMap.put(str, defpackage.fm.QoRHpC4k(IHQe1A4L2xu));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            java.util.ArrayList arrayList = new java.util.ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                java.lang.Object IHQe1A4L2xu2 = ((defpackage.vz) list.get(i3)).IHQe1A4L2xu();
                                                if (IHQe1A4L2xu2 != null && !F7NU4MC0GW(IHQe1A4L2xu2)) {
                                                    throw new java.lang.IllegalStateException(defpackage.e90.cnag84Bm(IHQe1A4L2xu2).toString());
                                                }
                                                arrayList.add(IHQe1A4L2xu2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
                                    i12++;
                                    i5 = i2;
                                    jArr4 = jArr2;
                                    i3 = 0;
                                }
                                jArr = jArr4;
                                i = i5;
                                if (i11 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i5;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i10++;
                            i5 = i;
                            jArr4 = jArr;
                            i3 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        nl0Var = this.AARZUJiTa;
        if (nl0Var != null) {
        }
        return hashMap;
    }

    @Override // defpackage.t31
    public final java.lang.Object xiZrDbcSW0(java.lang.String str) {
        defpackage.nl0 nl0Var = this.xiZrDbcSW0;
        java.util.List list = nl0Var != null ? (java.util.List) nl0Var.ez2rX8ReCYw(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && nl0Var != null) {
            java.util.List subList = list.subList(1, list.size());
            int xiZrDbcSW0 = nl0Var.xiZrDbcSW0(str);
            if (xiZrDbcSW0 < 0) {
                xiZrDbcSW0 = ~xiZrDbcSW0;
            }
            java.lang.Object[] objArr = nl0Var.r1MBDhnF;
            java.lang.Object obj = objArr[xiZrDbcSW0];
            nl0Var.oh6vYeIP[xiZrDbcSW0] = str;
            objArr[xiZrDbcSW0] = subList;
        }
        return list.get(0);
    }
}
