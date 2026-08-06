package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lw0 implements kw0 {
    public hg0 AvO7iQsrTN;
    public final hg0 EljAMC1QTz;
    public final hv OOA6hdeuvCS;

    public lw0(Map map, hv hvVar) {
        hg0 hg0Var;
        this.OOA6hdeuvCS = hvVar;
        if (map == null || map.isEmpty()) {
            hg0Var = null;
        } else {
            hg0Var = new hg0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                hg0Var.XnEVoBF0td1l(entry.getKey(), entry.getValue());
            }
        }
        this.EljAMC1QTz = hg0Var;
    }

    @Override // defpackage.kw0
    public final Object EljAMC1QTz(String str) {
        hg0 hg0Var = this.EljAMC1QTz;
        List list = hg0Var != null ? (List) hg0Var.rQPn8YBR(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && hg0Var != null) {
            List subList = list.subList(1, list.size());
            int EljAMC1QTz = hg0Var.EljAMC1QTz(str);
            if (EljAMC1QTz < 0) {
                EljAMC1QTz = ~EljAMC1QTz;
            }
            Object[] objArr = hg0Var.X1lG3V04pd;
            Object obj = objArr[EljAMC1QTz];
            hg0Var.Yi7zF1RB1[EljAMC1QTz] = str;
            objArr[EljAMC1QTz] = subList;
        }
        return list.get(0);
    }

    @Override // defpackage.kw0
    public final f4 GWasM1elztuh(String str, wu wuVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ki1.A1EKNP6CxJ(str.charAt(i))) {
                hg0 hg0Var = this.AvO7iQsrTN;
                if (hg0Var == null) {
                    long[] jArr = kx0.GWasM1elztuh;
                    hg0Var = new hg0();
                    this.AvO7iQsrTN = hg0Var;
                }
                Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(str);
                if (AvO7iQsrTN == null) {
                    AvO7iQsrTN = new ArrayList();
                    hg0Var.XnEVoBF0td1l(str, AvO7iQsrTN);
                }
                ((List) AvO7iQsrTN).add(wuVar);
                return new f4(hg0Var, str, wuVar, 14);
            }
        }
        o4.mE4lRynR("Registered key is empty or blank");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // defpackage.kw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map OOA6hdeuvCS() {
        char c;
        long j;
        long j2;
        long j3;
        hg0 hg0Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        hg0 hg0Var2 = this.EljAMC1QTz;
        if (hg0Var2 == null && this.AvO7iQsrTN == null) {
            return yp.OOA6hdeuvCS;
        }
        int i3 = 0;
        int i4 = hg0Var2 != null ? hg0Var2.OOA6hdeuvCS : 0;
        hg0 hg0Var3 = this.AvO7iQsrTN;
        HashMap hashMap = new HashMap(i4 + (hg0Var3 != null ? hg0Var3.OOA6hdeuvCS : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (hg0Var2 != null) {
            Object[] objArr = hg0Var2.Yi7zF1RB1;
            Object[] objArr2 = hg0Var2.X1lG3V04pd;
            long[] jArr3 = hg0Var2.GWasM1elztuh;
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
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
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
                hg0Var = this.AvO7iQsrTN;
                if (hg0Var != null) {
                    Object[] objArr3 = hg0Var.Yi7zF1RB1;
                    Object[] objArr4 = hg0Var.X1lG3V04pd;
                    long[] jArr4 = hg0Var.GWasM1elztuh;
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
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object GWasM1elztuh = ((wu) list.get(i3)).GWasM1elztuh();
                                            if (GWasM1elztuh != null) {
                                                if (!xqGvceK5x(GWasM1elztuh)) {
                                                    throw new IllegalStateException(d70.YmKjaVtbfp5Z(GWasM1elztuh).toString());
                                                }
                                                hashMap.put(str, fb1.JFJ3QoxA(GWasM1elztuh));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object GWasM1elztuh2 = ((wu) list.get(i3)).GWasM1elztuh();
                                                if (GWasM1elztuh2 != null && !xqGvceK5x(GWasM1elztuh2)) {
                                                    throw new IllegalStateException(d70.YmKjaVtbfp5Z(GWasM1elztuh2).toString());
                                                }
                                                arrayList.add(GWasM1elztuh2);
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
        hg0Var = this.AvO7iQsrTN;
        if (hg0Var != null) {
        }
        return hashMap;
    }

    @Override // defpackage.kw0
    public final boolean xqGvceK5x(Object obj) {
        return ((Boolean) this.OOA6hdeuvCS.mOu10nynGul(obj)).booleanValue();
    }
}
