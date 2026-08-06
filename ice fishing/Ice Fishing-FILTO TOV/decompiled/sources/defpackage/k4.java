package defpackage;

import com.combinations.level.experts.core.domain.model.Side;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements lv {
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ k4(int i, int i2, Object obj) {
        this.OOA6hdeuvCS = i2;
        this.EljAMC1QTz = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0247, code lost:
    
        if (r4 == null) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.Collection] */
    @Override // defpackage.lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        kw0 kw0Var;
        ArrayList arrayList;
        Object obj3;
        rn0 rn0Var;
        Object obj4;
        l9 l9Var = null;
        r14 = null;
        r14 = null;
        r14 = null;
        t01 t01Var = null;
        f40 f40Var = null;
        switch (this.OOA6hdeuvCS) {
            case 0:
                ((Integer) obj2).getClass();
                qj.Yi7zF1RB1((hi0) this.EljAMC1QTz, (qx) obj, n4.lv06NcmrQ(1));
                return kc1.GWasM1elztuh;
            case 1:
                au0 au0Var = (au0) this.EljAMC1QTz;
                ((Integer) obj).getClass();
                if (obj2 instanceof be) {
                    be beVar = (be) obj2;
                    ig0 ig0Var = au0Var.encWxUiV2;
                    if (ig0Var == null) {
                        ig0 ig0Var2 = lx0.GWasM1elztuh;
                        ig0Var = new ig0();
                        au0Var.encWxUiV2 = ig0Var;
                    }
                    ig0Var.rQPn8YBR(beVar);
                    au0Var.EljAMC1QTz.Yi7zF1RB1(beVar);
                }
                if (obj2 instanceof vx) {
                    au0Var.OOA6hdeuvCS((vx) obj2);
                }
                if (obj2 instanceof at0) {
                    ((at0) obj2).X1lG3V04pd();
                }
                return kc1.GWasM1elztuh;
            case 2:
                ((Integer) obj2).getClass();
                fb1.xqGvceK5x((am) this.EljAMC1QTz, (qx) obj, n4.lv06NcmrQ(1));
                return kc1.GWasM1elztuh;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                qx qxVar = (qx) obj;
                int intValue = ((Integer) obj2).intValue();
                if (qxVar.dqB83aoLBB(intValue & 1, (intValue & 3) != 2)) {
                    throw null;
                }
                qxVar.YXi2hvwn7WL();
                return kc1.GWasM1elztuh;
            case 4:
                ((Integer) obj2).getClass();
                rj0.xqGvceK5x((wu) this.EljAMC1QTz, (qx) obj, n4.lv06NcmrQ(1));
                return kc1.GWasM1elztuh;
            case 5:
                ((Integer) obj2).getClass();
                ((m10) this.EljAMC1QTz).GWasM1elztuh(n4.lv06NcmrQ(1), (qx) obj);
                return kc1.GWasM1elztuh;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                hw0 hw0Var = (hw0) obj;
                List list = (List) ((pd) this.EljAMC1QTz).EljAMC1QTz(hw0Var, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    if (obj5 != null && (kw0Var = hw0Var.EljAMC1QTz) != null && !kw0Var.xqGvceK5x(obj5)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj5).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                mf0 mf0Var = (mf0) this.EljAMC1QTz;
                Set set = (Set) obj;
                synchronized (mf0Var.GWasM1elztuh) {
                    try {
                        hg0 hg0Var = mf0Var.Yi7zF1RB1;
                        X1lG3V04pd x1lG3V04pd = new X1lG3V04pd(15, set, mf0Var);
                        fb1.XnEVoBF0td1l(1, x1lG3V04pd);
                        Object[] objArr = hg0Var.Yi7zF1RB1;
                        long[] jArr = hg0Var.GWasM1elztuh;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((j & 255) < 128) {
                                            x1lG3V04pd.mOu10nynGul(objArr[(i2 << 3) + i4]);
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
                        ig0 ig0Var3 = mf0Var.xqGvceK5x;
                        Object[] objArr2 = ig0Var3.Yi7zF1RB1;
                        long[] jArr2 = ig0Var3.GWasM1elztuh;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j2 = jArr2[i5];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j2 & 255) < 128) {
                                            ((t01) objArr2[(i5 << 3) + i7]).mE4lRynR(kc1.GWasM1elztuh);
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
                        mf0Var.xqGvceK5x.Yi7zF1RB1();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return kc1.GWasM1elztuh;
            case 8:
                gt0 gt0Var = (gt0) this.EljAMC1QTz;
                Set set2 = (Set) obj;
                synchronized (gt0Var.X1lG3V04pd) {
                    try {
                        if (((dt0) gt0Var.Y6hRI1cF8.getValue()).compareTo(dt0.mOu10nynGul) >= 0) {
                            ig0 ig0Var4 = gt0Var.encWxUiV2;
                            if (set2 instanceof mx0) {
                                ig0 ig0Var5 = ((mx0) set2).OOA6hdeuvCS;
                                Object[] objArr3 = ig0Var5.Yi7zF1RB1;
                                long[] jArr3 = ig0Var5.GWasM1elztuh;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j3 = jArr3[i8];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j3 & 255) < 128) {
                                                    Object obj6 = objArr3[(i8 << 3) + i10];
                                                    if (!(obj6 instanceof t51) || ((t51) obj6).OOA6hdeuvCS(1)) {
                                                        ig0Var4.GWasM1elztuh(obj6);
                                                    }
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i9 != 8) {
                                            }
                                        }
                                        if (i8 != length3) {
                                            i8++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj7 : set2) {
                                    if (!(obj7 instanceof t51) || ((t51) obj7).OOA6hdeuvCS(1)) {
                                        ig0Var4.GWasM1elztuh(obj7);
                                    }
                                }
                            }
                            l9Var = gt0Var.WRKkgoJXwDn();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (l9Var != null) {
                    ((n9) l9Var).AvO7iQsrTN(kc1.GWasM1elztuh);
                }
                return kc1.GWasM1elztuh;
            case 9:
                cw0 cw0Var = (cw0) this.EljAMC1QTz;
                int intValue2 = ((Integer) obj).intValue();
                eh ehVar = (eh) obj2;
                fh key = ehVar.getKey();
                eh E7jCp8Ls = cw0Var.mOu10nynGul.E7jCp8Ls(key);
                if (key != b9xEq24R1.VeqTn1PQw7) {
                    if (ehVar != E7jCp8Ls) {
                        intValue2 = Integer.MIN_VALUE;
                    }
                    intValue2++;
                } else {
                    f40 f40Var2 = (f40) E7jCp8Ls;
                    f40 f40Var3 = (f40) ehVar;
                    while (f40Var3 != null) {
                        if (f40Var3 != f40Var2 && (f40Var3 instanceof qx0)) {
                            pa rezfBrjOrqK = ((qx0) f40Var3).rezfBrjOrqK();
                            f40Var3 = rezfBrjOrqK != null ? rezfBrjOrqK.getParent() : null;
                        } else {
                            f40Var = f40Var3;
                            if (f40Var == f40Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + f40Var + ", expected child of " + f40Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (f40Var == f40Var2) {
                    }
                }
                return Integer.valueOf(intValue2);
            case 10:
                oy0 oy0Var = (oy0) this.EljAMC1QTz;
                fb1.MZhzXH72(oy0Var.oFzb77RX3H8t(), null, new ny0(oy0Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 11:
                s21 s21Var = (s21) this.EljAMC1QTz;
                Set set3 = (Set) obj;
                synchronized (s21Var.GWasM1elztuh) {
                    try {
                        ig0 ig0Var6 = s21Var.xqGvceK5x;
                        if (ig0Var6 != null) {
                            Object[] objArr4 = ig0Var6.Yi7zF1RB1;
                            long[] jArr4 = ig0Var6.GWasM1elztuh;
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
                                                    t01Var = s21Var.EljAMC1QTz;
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
                        } else if (rb.JB4pnjMK(set3, s21Var.Yi7zF1RB1)) {
                            t01Var = s21Var.EljAMC1QTz;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (t01Var != null) {
                    t01Var.mE4lRynR(kc1.GWasM1elztuh);
                }
                return kc1.GWasM1elztuh;
            case 12:
                r41 r41Var = (r41) this.EljAMC1QTz;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = r41Var.Yi7zF1RB1;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        arrayList = set4;
                    } else if (obj8 instanceof Set) {
                        arrayList = fb1.rezfBrjOrqK(new Set[]{obj8, set4});
                    } else {
                        if (!(obj8 instanceof List)) {
                            we.Yi7zF1RB1("Unexpected notification");
                            throw new vc();
                        }
                        arrayList = rb.hOpoc9RpANL((Collection) obj8, fb1.HFYAaqMd6(set4));
                    }
                    while (!atomicReference.compareAndSet(obj8, arrayList)) {
                        if (atomicReference.get() != obj8) {
                            break;
                        }
                    }
                    if (r41Var.Yi7zF1RB1()) {
                        r41Var.GWasM1elztuh.mOu10nynGul(new o1(20, r41Var));
                    }
                    return kc1.GWasM1elztuh;
                    break;
                }
            case 13:
                List list2 = (List) this.EljAMC1QTz;
                CharSequence charSequence = (CharSequence) obj;
                int intValue3 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list2.size() == 1) {
                    int size2 = list2.size();
                    if (size2 == 0) {
                        o4.AvO7iQsrTN("List is empty.");
                        return null;
                    }
                    if (size2 != 1) {
                        o4.mE4lRynR("List has more than one element.");
                        return null;
                    }
                    String str = (String) list2.get(0);
                    int J3Xc8BaqpN8 = b61.J3Xc8BaqpN8(charSequence, str, intValue3, 4);
                    if (J3Xc8BaqpN8 >= 0) {
                        rn0Var = new rn0(Integer.valueOf(J3Xc8BaqpN8), str);
                        if (rn0Var != null) {
                            return new rn0(rn0Var.OOA6hdeuvCS, Integer.valueOf(((String) rn0Var.EljAMC1QTz).length()));
                        }
                        return null;
                    }
                    rn0Var = null;
                    if (rn0Var != null) {
                    }
                } else {
                    if (intValue3 < 0) {
                        intValue3 = 0;
                    }
                    int i14 = new x20(intValue3, charSequence.length(), 1).EljAMC1QTz;
                    if (charSequence instanceof String) {
                        if (intValue3 <= i14) {
                            while (true) {
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (str2.regionMatches(0, (String) charSequence, intValue3, str2.length())) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    rn0Var = new rn0(Integer.valueOf(intValue3), str3);
                                } else if (intValue3 != i14) {
                                    intValue3++;
                                }
                            }
                        }
                        rn0Var = null;
                        if (rn0Var != null) {
                        }
                    } else {
                        if (intValue3 <= i14) {
                            while (true) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        if (b61.Uxq83abb04(str4, charSequence, intValue3, str4.length(), false)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    rn0Var = new rn0(Integer.valueOf(intValue3), str5);
                                } else if (intValue3 != i14) {
                                    intValue3++;
                                }
                            }
                            if (rn0Var != null) {
                            }
                        }
                        rn0Var = null;
                        if (rn0Var != null) {
                        }
                    }
                }
            case 14:
                ((Integer) obj2).getClass();
                j81.GWasM1elztuh((y81) this.EljAMC1QTz, (qx) obj, n4.lv06NcmrQ(1));
                return kc1.GWasM1elztuh;
            case Side.ALL /* 15 */:
                ((hv) this.EljAMC1QTz).mOu10nynGul(obj);
                return kc1.GWasM1elztuh;
            default:
                return new u20(((r6) this.EljAMC1QTz).GWasM1elztuh(0L, ((b30) obj).GWasM1elztuh, (p50) obj2));
        }
    }

    public /* synthetic */ k4(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }
}
