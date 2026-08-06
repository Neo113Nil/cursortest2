package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l71 implements defpackage.k71 {
    public defpackage.yn0 QiMR8OkAhezm;
    public final defpackage.y10 WDYagTQQm9ns;
    public final defpackage.yn0 oh71FJcDz6S2;

    public l71(java.util.Map map, defpackage.y10 y10Var) {
        defpackage.yn0 yn0Var;
        this.WDYagTQQm9ns = y10Var;
        if (map == null || map.isEmpty()) {
            yn0Var = null;
        } else {
            yn0Var = new defpackage.yn0(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                yn0Var.h3m55N1URyyK(entry.getKey(), entry.getValue());
            }
        }
        this.oh71FJcDz6S2 = yn0Var;
    }

    @Override // defpackage.k71
    public final boolean JhCgjQRTAOCT(java.lang.Object obj) {
        return ((java.lang.Boolean) this.WDYagTQQm9ns.P05cfTpS5W5L(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // defpackage.k71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map WDYagTQQm9ns() {
        char c;
        long j;
        long j2;
        long j3;
        defpackage.yn0 yn0Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        defpackage.yn0 yn0Var2 = this.oh71FJcDz6S2;
        if (yn0Var2 == null && this.QiMR8OkAhezm == null) {
            return defpackage.bv.WDYagTQQm9ns;
        }
        int i3 = 0;
        int i4 = yn0Var2 != null ? yn0Var2.WDYagTQQm9ns : 0;
        defpackage.yn0 yn0Var3 = this.QiMR8OkAhezm;
        java.util.HashMap hashMap = new java.util.HashMap(i4 + (yn0Var3 != null ? yn0Var3.WDYagTQQm9ns : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (yn0Var2 != null) {
            java.lang.Object[] objArr = yn0Var2.giKS3J6vZuNy;
            java.lang.Object[] objArr2 = yn0Var2.fWTAfUmVKrZq;
            long[] jArr3 = yn0Var2.ZpBGe2uQfcn8;
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
                yn0Var = this.QiMR8OkAhezm;
                if (yn0Var != null) {
                    java.lang.Object[] objArr3 = yn0Var.giKS3J6vZuNy;
                    java.lang.Object[] objArr4 = yn0Var.fWTAfUmVKrZq;
                    long[] jArr4 = yn0Var.ZpBGe2uQfcn8;
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
                                            java.lang.Object ZpBGe2uQfcn8 = ((defpackage.n10) list.get(i3)).ZpBGe2uQfcn8();
                                            if (ZpBGe2uQfcn8 != null) {
                                                if (!JhCgjQRTAOCT(ZpBGe2uQfcn8)) {
                                                    throw new java.lang.IllegalStateException(defpackage.v70.WmetiUbpKU9I(ZpBGe2uQfcn8).toString());
                                                }
                                                hashMap.put(str, defpackage.ma0.P05cfTpS5W5L(ZpBGe2uQfcn8));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            java.util.ArrayList arrayList = new java.util.ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                java.lang.Object ZpBGe2uQfcn82 = ((defpackage.n10) list.get(i3)).ZpBGe2uQfcn8();
                                                if (ZpBGe2uQfcn82 != null && !JhCgjQRTAOCT(ZpBGe2uQfcn82)) {
                                                    throw new java.lang.IllegalStateException(defpackage.v70.WmetiUbpKU9I(ZpBGe2uQfcn82).toString());
                                                }
                                                arrayList.add(ZpBGe2uQfcn82);
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
        yn0Var = this.QiMR8OkAhezm;
        if (yn0Var != null) {
        }
        return hashMap;
    }

    @Override // defpackage.k71
    public final defpackage.a7 ZpBGe2uQfcn8(java.lang.String str, defpackage.n10 n10Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!defpackage.jr0.frSwwKIlbUhK(str.charAt(i))) {
                defpackage.yn0 yn0Var = this.QiMR8OkAhezm;
                if (yn0Var == null) {
                    long[] jArr = defpackage.m81.ZpBGe2uQfcn8;
                    yn0Var = new defpackage.yn0();
                    this.QiMR8OkAhezm = yn0Var;
                }
                java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm(str);
                if (QiMR8OkAhezm == null) {
                    QiMR8OkAhezm = new java.util.ArrayList();
                    yn0Var.h3m55N1URyyK(str, QiMR8OkAhezm);
                }
                ((java.util.List) QiMR8OkAhezm).add(n10Var);
                return new defpackage.a7(yn0Var, str, n10Var, 15);
            }
        }
        defpackage.h7.w7APNrr0aGRc("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.k71
    public final java.lang.Object oh71FJcDz6S2(java.lang.String str) {
        defpackage.yn0 yn0Var = this.oh71FJcDz6S2;
        java.util.List list = yn0Var != null ? (java.util.List) yn0Var.Ns0WNyEWdPsk(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && yn0Var != null) {
            java.util.List subList = list.subList(1, list.size());
            int oh71FJcDz6S2 = yn0Var.oh71FJcDz6S2(str);
            if (oh71FJcDz6S2 < 0) {
                oh71FJcDz6S2 = ~oh71FJcDz6S2;
            }
            java.lang.Object[] objArr = yn0Var.fWTAfUmVKrZq;
            java.lang.Object obj = objArr[oh71FJcDz6S2];
            yn0Var.giKS3J6vZuNy[oh71FJcDz6S2] = str;
            objArr[oh71FJcDz6S2] = subList;
        }
        return list.get(0);
    }
}
