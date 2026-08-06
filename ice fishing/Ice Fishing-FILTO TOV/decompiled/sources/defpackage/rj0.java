package defpackage;

import android.os.Build;
import android.os.Trace;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class rj0 {
    public static final pp JFJ3QoxA;
    public static final pp OOA6hdeuvCS;
    public static final float iwATDS1i01k = 24.0f;
    public static final float uFEq9NpZ = 24.0f;
    public static final q4 GWasM1elztuh = new q4();
    public static final p4 Yi7zF1RB1 = new p4();
    public static final k61 X1lG3V04pd = new k61(13);
    public static final k61 xqGvceK5x = new k61(14);
    public static final hl EljAMC1QTz = new hl(1.0f, 1.0f);
    public static final l1 AvO7iQsrTN = new l1(5);
    public static final StackTraceElement[] encWxUiV2 = new StackTraceElement[0];
    public static final hv0 mOu10nynGul = new hv0();
    public static final x51 rQPn8YBR = new x51(1);
    public static final Object E7jCp8Ls = new Object();
    public static final x51 XnEVoBF0td1l = new x51(2);

    static {
        int i = 1;
        OOA6hdeuvCS = new pp("CLOSED", i);
        JFJ3QoxA = new pp("NO_VALUE", i);
    }

    public static final void A1EKNP6CxJ(SyyZR548qbcW syyZR548qbcW, d01 d01Var) {
        Object AvO7iQsrTN2 = d01Var.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.AvO7iQsrTN);
        if (AvO7iQsrTN2 == null) {
            AvO7iQsrTN2 = null;
        }
        if (AvO7iQsrTN2 != null) {
            o4.YmKjaVtbfp5Z();
            return;
        }
        d01 E7jCp8Ls2 = d01Var.E7jCp8Ls();
        if (E7jCp8Ls2 == null) {
            return;
        }
        Object AvO7iQsrTN3 = E7jCp8Ls2.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.OOA6hdeuvCS);
        if (AvO7iQsrTN3 == null) {
            AvO7iQsrTN3 = null;
        }
        if (AvO7iQsrTN3 != null) {
            Object AvO7iQsrTN4 = E7jCp8Ls2.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.EljAMC1QTz);
            qb qbVar = (qb) (AvO7iQsrTN4 != null ? AvO7iQsrTN4 : null);
            if (qbVar == null || (qbVar.GWasM1elztuh >= 0 && qbVar.Yi7zF1RB1 >= 0)) {
                if (d01Var.rQPn8YBR().OOA6hdeuvCS.X1lG3V04pd(h01.eUH21U3apd)) {
                    ArrayList arrayList = new ArrayList();
                    List JFJ3QoxA2 = d01.JFJ3QoxA(4, E7jCp8Ls2);
                    int size = JFJ3QoxA2.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        d01 d01Var2 = (d01) JFJ3QoxA2.get(i2);
                        if (d01Var2.rQPn8YBR().OOA6hdeuvCS.X1lG3V04pd(h01.eUH21U3apd)) {
                            arrayList.add(d01Var2);
                            if (d01Var2.X1lG3V04pd.lv06NcmrQ() < d01Var.X1lG3V04pd.lv06NcmrQ()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean WIEu4Ya2g8 = WIEu4Ya2g8(arrayList);
                    int i3 = WIEu4Ya2g8 ? 0 : i;
                    int i4 = WIEu4Ya2g8 ? i : 0;
                    Object AvO7iQsrTN5 = d01Var.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.eUH21U3apd);
                    if (AvO7iQsrTN5 == null) {
                        AvO7iQsrTN5 = Boolean.FALSE;
                    }
                    syyZR548qbcW.GWasM1elztuh.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) AvO7iQsrTN5).booleanValue()));
                }
            }
        }
    }

    public static final Object AEn1Rrio(cp0 cp0Var, ps0 ps0Var) {
        ps0Var.getClass();
        Object obj = cp0Var.get(ps0Var);
        if (obj == null) {
            obj = ps0Var.Yi7zF1RB1();
        }
        return ((jd1) obj).GWasM1elztuh(cp0Var);
    }

    public static final void AvO7iQsrTN(String str, jd jdVar, qx qxVar, int i) {
        qxVar.Uxq83abb04(-721399050);
        int i2 = (qxVar.EljAMC1QTz(str) ? 4 : 2) | i;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 19) != 18)) {
            y61.GWasM1elztuh(v21.GWasM1elztuh, vv0.GWasM1elztuh(16.0f), yb.Yi7zF1RB1(0.7f, ac.xqGvceK5x), 0L, 0.0f, null, YZjbz8VdP5(-1385319023, new zz(str, jdVar), qxVar), qxVar, 12583302, 120);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new zz(str, jdVar, i);
        }
    }

    public static final void DmJncFq5(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static final lx E7jCp8Ls(lx lxVar) {
        if (lxVar == null) {
            lxVar = null;
        }
        if (lxVar != null) {
            return lxVar;
        }
        we.Yi7zF1RB1("Inconsistent composition");
        throw new vc();
    }

    public static void EXrPz3p7hFb(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    public static h21 EljAMC1QTz(int i) {
        int i2 = (i & 1) != 0 ? 0 : 1;
        int i3 = (i & 2) == 0 ? 16 : 0;
        if (i2 <= 0 && i3 <= 0) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + l8.EljAMC1QTz).toString());
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new h21(i2, i4);
    }

    public static final void GWasM1elztuh(final wu wuVar, final jd jdVar, ie0 ie0Var, final lv lvVar, final lv lvVar2, final lv lvVar3, z11 z11Var, final long j, long j2, final long j3, final long j4, bm bmVar, qx qxVar, final int i) {
        final ie0 ie0Var2;
        final z11 z11Var2;
        final long j5;
        final bm bmVar2;
        int i2;
        bm bmVar3;
        long j6;
        z11 z11Var3;
        ie0 ie0Var3;
        qxVar.Uxq83abb04(94478519);
        int i3 = i | (qxVar.encWxUiV2(wuVar) ? 4 : 2) | 272654720;
        if (qxVar.dqB83aoLBB(i3 & 1, (306783379 & i3) != 306783378)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                z11 GWasM1elztuh2 = e21.GWasM1elztuh(n30.OOA6hdeuvCS, qxVar);
                long X1lG3V04pd2 = fc.X1lG3V04pd(n30.encWxUiV2, qxVar);
                i2 = i3 & (-1908408321);
                bmVar3 = new bm(true, true, true);
                j6 = X1lG3V04pd2;
                z11Var3 = GWasM1elztuh2;
                ie0Var3 = fe0.GWasM1elztuh;
            } else {
                qxVar.YXi2hvwn7WL();
                i2 = i3 & (-1908408321);
                ie0Var3 = ie0Var;
                z11Var3 = z11Var;
                j6 = j2;
                bmVar3 = bmVar;
            }
            qxVar.YmKjaVtbfp5Z();
            P4U4zqyW7wx.X1lG3V04pd(wuVar, jdVar, ie0Var3, lvVar, lvVar2, lvVar3, z11Var3, j, j6, j3, j4, bmVar3, qxVar, i2 & 2147483646, 3510);
            ie0Var2 = ie0Var3;
            j5 = j6;
            bmVar2 = bmVar3;
            z11Var2 = z11Var3;
        } else {
            qxVar.YXi2hvwn7WL();
            ie0Var2 = ie0Var;
            z11Var2 = z11Var;
            j5 = j2;
            bmVar2 = bmVar;
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new lv(jdVar, ie0Var2, lvVar, lvVar2, lvVar3, z11Var2, j, j5, j3, j4, bmVar2, i) { // from class: pjimB8cb
                public final /* synthetic */ ie0 AvO7iQsrTN;
                public final /* synthetic */ long E7jCp8Ls;
                public final /* synthetic */ jd EljAMC1QTz;
                public final /* synthetic */ lv JFJ3QoxA;
                public final /* synthetic */ bm WIEu4Ya2g8;
                public final /* synthetic */ long XnEVoBF0td1l;
                public final /* synthetic */ lv encWxUiV2;
                public final /* synthetic */ long iwATDS1i01k;
                public final /* synthetic */ lv mOu10nynGul;
                public final /* synthetic */ z11 rQPn8YBR;
                public final /* synthetic */ long uFEq9NpZ;

                @Override // defpackage.lv
                public final Object EljAMC1QTz(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int lv06NcmrQ = n4.lv06NcmrQ(102435889);
                    rj0.GWasM1elztuh(wu.this, this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2, this.mOu10nynGul, this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, this.iwATDS1i01k, this.WIEu4Ya2g8, (qx) obj, lv06NcmrQ);
                    return kc1.GWasM1elztuh;
                }
            };
        }
    }

    public static final cp0 HFYAaqMd6(qs0[] qs0VarArr, cp0 cp0Var, cp0 cp0Var2) {
        bp0 bp0Var = new bp0(cp0.encWxUiV2);
        for (qs0 qs0Var : qs0VarArr) {
            ps0 ps0Var = qs0Var.GWasM1elztuh;
            if (qs0Var.EljAMC1QTz || !cp0Var.containsKey(ps0Var)) {
                bp0Var.put(ps0Var, ps0Var.X1lG3V04pd(qs0Var, (jd1) cp0Var2.get(ps0Var)));
            }
        }
        return bp0Var.GWasM1elztuh();
    }

    public static final void JFJ3QoxA(ie0 ie0Var, lv lvVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(1090521195);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(ie0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.encWxUiV2(lvVar) ? 32 : 16;
        }
        int i3 = 0;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 19) != 18)) {
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = e0.Yi7zF1RB1;
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            bd0 bd0Var = (bd0) HFYAaqMd6;
            int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
            cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar, ie0Var);
            oe.X1lG3V04pd.getClass();
            hf hfVar = ne.Yi7zF1RB1;
            int i4 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(hfVar);
            } else {
                qxVar.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, bd0Var);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls2);
            l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar, Integer.valueOf(hashCode));
            l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
            lvVar.EljAMC1QTz(qxVar, Integer.valueOf((i4 >> 6) & 14));
            qxVar.WIEu4Ya2g8(true);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new f0(ie0Var, lvVar, i, i3);
        }
    }

    public static vg M3K9sHhK(vg vgVar) {
        vgVar.getClass();
        wg wgVar = vgVar instanceof wg ? (wg) vgVar : null;
        if (wgVar == null || (vgVar = wgVar.AvO7iQsrTN) != null) {
            return vgVar;
        }
        ih ihVar = (ih) wgVar.OOA6hdeuvCS().E7jCp8Ls(b9xEq24R1.arNh8D4Z5gB);
        vg imVar = ihVar != null ? new im(ihVar, wgVar) : wgVar;
        wgVar.AvO7iQsrTN = imVar;
        return imVar;
    }

    public static final ys0 MZhzXH72(si siVar, ug ugVar, k51 k51Var, Float f) {
        z9.Yi7zF1RB1.getClass();
        y9 y9Var = y9.GWasM1elztuh;
        d dVar = new d(20, siVar, vp.OOA6hdeuvCS);
        p51 EljAMC1QTz2 = vc0.EljAMC1QTz(f);
        gh ghVar = (gh) dVar.AvO7iQsrTN;
        ls lsVar = (ls) dVar.EljAMC1QTz;
        sh shVar = k51Var.equals(k21.GWasM1elztuh) ? sh.OOA6hdeuvCS : sh.encWxUiV2;
        i2 i2Var = new i2(k51Var, lsVar, EljAMC1QTz2, f, null, 3);
        gh lv06NcmrQ = o30.lv06NcmrQ(ugVar.EljAMC1QTz(), ghVar, true);
        pk pkVar = mm.GWasM1elztuh;
        if (lv06NcmrQ != pkVar && lv06NcmrQ.E7jCp8Ls(b9xEq24R1.arNh8D4Z5gB) == null) {
            lv06NcmrQ = lv06NcmrQ.mOu10nynGul(pkVar);
        }
        YmKjaVtbfp5Z y80Var = shVar == sh.EljAMC1QTz ? new y80(lv06NcmrQ, i2Var) : new f51(lv06NcmrQ, true);
        y80Var.rASgSCrgZkT7(shVar, y80Var, i2Var);
        return new ys0(EljAMC1QTz2);
    }

    public static ie0 Mjvvu5DE(ie0 ie0Var, wu wuVar) {
        return ie0Var.X1lG3V04pd(new za(null, null, true, true, null, wuVar));
    }

    public static final long OOA6hdeuvCS(int i) {
        long j = i << 32;
        int i2 = w40.WIEu4Ya2g8;
        return j;
    }

    public static Object TpUsjqg3bxO(lv lvVar, Object obj, vg vgVar) {
        lvVar.getClass();
        gh OOA6hdeuvCS2 = vgVar.OOA6hdeuvCS();
        Object r30Var = OOA6hdeuvCS2 == vp.OOA6hdeuvCS ? new r30(vgVar) : new s30(vgVar, OOA6hdeuvCS2);
        fb1.XnEVoBF0td1l(2, lvVar);
        return lvVar.EljAMC1QTz(obj, r30Var);
    }

    public static final boolean WIEu4Ya2g8(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = xp.OOA6hdeuvCS;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    d01 d01Var = (d01) obj2;
                    d01 d01Var2 = (d01) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (d01Var2.AvO7iQsrTN().GWasM1elztuh() >> 32)) - Float.intBitsToFloat((int) (d01Var.AvO7iQsrTN().GWasM1elztuh() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (d01Var2.AvO7iQsrTN().GWasM1elztuh() & 4294967295L)) - Float.intBitsToFloat((int) (d01Var.AvO7iQsrTN().GWasM1elztuh() & 4294967295L)));
                    arrayList2.add(new uk0((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((uk0) rb.jed7WnvkLvFq(list)).GWasM1elztuh;
            } else {
                if (list.isEmpty()) {
                    xa0.X1lG3V04pd("Empty collection can't be reduced.");
                }
                Object jed7WnvkLvFq = rb.jed7WnvkLvFq(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        jed7WnvkLvFq = new uk0(uk0.OOA6hdeuvCS(((uk0) jed7WnvkLvFq).GWasM1elztuh, ((uk0) list.get(i2)).GWasM1elztuh));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((uk0) jed7WnvkLvFq).GWasM1elztuh;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final long WRKkgoJXwDn(j6IIN2O8eOU j6iin2o8eou) {
        DragEvent dragEvent = (DragEvent) j6iin2o8eou.EljAMC1QTz;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static Set WdrkLMV3xh() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final void X1lG3V04pd(wu wuVar, bm bmVar, jd jdVar, qx qxVar, int i) {
        int i2;
        qx qxVar2;
        p50 p50Var;
        Object obj;
        int i3;
        qxVar.Uxq83abb04(826668973);
        if ((i & 6) == 0) {
            i2 = i | (qxVar.encWxUiV2(wuVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.EljAMC1QTz(bmVar) ? 32 : 16;
        }
        int i4 = i2;
        if (qxVar.dqB83aoLBB(i4 & 1, (i4 & 147) != 146)) {
            View view = (View) qxVar.JFJ3QoxA(r.EljAMC1QTz);
            el elVar = (el) qxVar.JFJ3QoxA(kf.encWxUiV2);
            p50 p50Var2 = (p50) qxVar.JFJ3QoxA(kf.uFEq9NpZ);
            ox qugwajBSa59j = fb1.qugwajBSa59j(qxVar);
            mg0 pog2g9KITJA = z50.pog2g9KITJA(jdVar, qxVar);
            Object[] objArr = new Object[0];
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            k61 k61Var = ue.GWasM1elztuh;
            if (HFYAaqMd6 == k61Var) {
                HFYAaqMd6 = q.E7jCp8Ls;
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            Object YZjbz8VdP5 = d70.YZjbz8VdP5(Arrays.copyOf(objArr, 0), ki1.rQPn8YBR, (wu) HFYAaqMd6, qxVar, 3456, 0);
            qx qxVar3 = qxVar;
            UUID uuid = (UUID) YZjbz8VdP5;
            boolean xqGvceK5x2 = qxVar3.xqGvceK5x(bmVar.AvO7iQsrTN) | qxVar3.EljAMC1QTz(view) | qxVar3.EljAMC1QTz(elVar) | qxVar3.EljAMC1QTz(null);
            Object HFYAaqMd62 = qxVar3.HFYAaqMd6();
            if (xqGvceK5x2 || HFYAaqMd62 == k61Var) {
                p50Var = p50Var2;
                dm dmVar = new dm(wuVar, bmVar, view, p50Var, elVar, uuid);
                jd jdVar2 = new jd(-1338939603, true, new iwATDS1i01k(r12, pog2g9KITJA));
                yl ylVar = dmVar.E7jCp8Ls;
                ylVar.setParentCompositionContext(qugwajBSa59j);
                ylVar.iwATDS1i01k.setValue(jdVar2);
                ylVar.mE4lRynR = true;
                ylVar.OOA6hdeuvCS();
                qxVar3.dcDmLGVhzWm(dmVar);
                obj = dmVar;
            } else {
                obj = HFYAaqMd62;
                p50Var = p50Var2;
            }
            dm dmVar2 = (dm) obj;
            boolean encWxUiV22 = qxVar3.encWxUiV2(dmVar2);
            Object HFYAaqMd63 = qxVar3.HFYAaqMd6();
            if (encWxUiV22 || HFYAaqMd63 == k61Var) {
                i3 = 0;
                HFYAaqMd63 = new a0(dmVar2, i3);
                qxVar3.dcDmLGVhzWm(HFYAaqMd63);
            } else {
                i3 = 0;
            }
            ki1.EljAMC1QTz(dmVar2, (hv) HFYAaqMd63, qxVar3);
            int i5 = (qxVar3.encWxUiV2(dmVar2) ? 1 : 0) | ((i4 & 14) == 4 ? 1 : i3) | ((i4 & 112) != 32 ? i3 : 1) | (qxVar3.xqGvceK5x(p50Var.ordinal()) ? 1 : 0);
            Object HFYAaqMd64 = qxVar3.HFYAaqMd6();
            if (i5 != 0 || HFYAaqMd64 == k61Var) {
                HFYAaqMd64 = new b0(dmVar2, wuVar, bmVar, p50Var);
                qxVar3.dcDmLGVhzWm(HFYAaqMd64);
            }
            ki1.rQPn8YBR((wu) HFYAaqMd64, qxVar3);
            qxVar2 = qxVar3;
        } else {
            qx qxVar4 = qxVar;
            qxVar4.YXi2hvwn7WL();
            qxVar2 = qxVar4;
        }
        at0 Mjvvu5DE = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new c0(wuVar, bmVar, jdVar, i, 0);
        }
    }

    public static final int XnEVoBF0td1l(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final Object Y6hRI1cF8(wz0 wz0Var, long j, lv lvVar) {
        while (true) {
            if (wz0Var.OOA6hdeuvCS >= j && !wz0Var.EljAMC1QTz()) {
                return wz0Var;
            }
            Object xqGvceK5x2 = wz0Var.xqGvceK5x();
            pp ppVar = OOA6hdeuvCS;
            if (xqGvceK5x2 == ppVar) {
                return ppVar;
            }
            wz0 wz0Var2 = (wz0) ((pf) xqGvceK5x2);
            if (wz0Var2 == null) {
                wz0Var2 = (wz0) lvVar.EljAMC1QTz(Long.valueOf(wz0Var.OOA6hdeuvCS + 1), wz0Var);
                if (wz0Var.mOu10nynGul(wz0Var2)) {
                    if (wz0Var.EljAMC1QTz()) {
                        wz0Var.encWxUiV2();
                    }
                }
            }
            wz0Var = wz0Var2;
        }
    }

    public static final jd YZjbz8VdP5(int i, tv tvVar, qx qxVar) {
        Object HFYAaqMd6 = qxVar.HFYAaqMd6();
        if (HFYAaqMd6 == ue.GWasM1elztuh) {
            HFYAaqMd6 = new jd(i, true, tvVar);
            qxVar.dcDmLGVhzWm(HFYAaqMd6);
        }
        jd jdVar = (jd) HFYAaqMd6;
        if (!jdVar.AvO7iQsrTN.equals(tvVar)) {
            jdVar.AvO7iQsrTN = tvVar;
            if (jdVar.EljAMC1QTz) {
                at0 at0Var = jdVar.encWxUiV2;
                if (at0Var != null) {
                    df dfVar = at0Var.GWasM1elztuh;
                    if (dfVar != null) {
                        dfVar.mE4lRynR(at0Var, null);
                    }
                    jdVar.encWxUiV2 = null;
                }
                ArrayList arrayList = jdVar.mOu10nynGul;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        at0 at0Var2 = (at0) arrayList.get(i2);
                        df dfVar2 = at0Var2.GWasM1elztuh;
                        if (dfVar2 != null) {
                            dfVar2.mE4lRynR(at0Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return jdVar;
    }

    public static hl Yi7zF1RB1() {
        return new hl(1.0f, 1.0f);
    }

    public static ie0 YmKjaVtbfp5Z(ie0 ie0Var, tf0 tf0Var, nv0 nv0Var, boolean z, ov0 ov0Var, wu wuVar, int i) {
        if ((i & 16) != 0) {
            ov0Var = null;
        }
        ov0 ov0Var2 = ov0Var;
        return ie0Var.X1lG3V04pd(nv0Var != null ? new za(tf0Var, nv0Var, false, z, ov0Var2, wuVar) : nv0Var == null ? new za(tf0Var, null, false, z, ov0Var2, wuVar) : tf0Var != null ? t00.GWasM1elztuh(fe0.GWasM1elztuh, tf0Var, nv0Var).X1lG3V04pd(new za(tf0Var, null, false, z, ov0Var2, wuVar)) : new te(new ab(nv0Var, z, ov0Var2, wuVar)));
    }

    public static final gb arNh8D4Z5gB(ch0 ch0Var) {
        gb gbVar;
        synchronized (XnEVoBF0td1l) {
            gbVar = (gb) ch0Var.X1lG3V04pd("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (gbVar == null) {
                gh ghVar = vp.OOA6hdeuvCS;
                try {
                    pk pkVar = mm.GWasM1elztuh;
                    ghVar = cc0.GWasM1elztuh.JFJ3QoxA;
                } catch (IllegalStateException | nk0 unused) {
                }
                gb gbVar2 = new gb(ghVar.mOu10nynGul(new u61(null)));
                ch0Var.GWasM1elztuh("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", gbVar2);
                gbVar = gbVar2;
            }
        }
        return gbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object cilMamHF(jj jjVar, wg wgVar) {
        at atVar;
        int i;
        rt0 rt0Var;
        GWasM1elztuh e;
        v8 v8Var;
        Object obj;
        pp ppVar = n30.JFJ3QoxA;
        if (wgVar instanceof at) {
            atVar = (at) wgVar;
            int i2 = atVar.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                atVar.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj2 = atVar.JFJ3QoxA;
                i = atVar.rQPn8YBR;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj2);
                    rt0 rt0Var2 = new rt0();
                    rt0Var2.OOA6hdeuvCS = ppVar;
                    v8 v8Var2 = new v8(3, rt0Var2);
                    try {
                        atVar.encWxUiV2 = rt0Var2;
                        atVar.mOu10nynGul = v8Var2;
                        atVar.rQPn8YBR = 1;
                        Object GWasM1elztuh2 = jjVar.GWasM1elztuh(v8Var2, atVar);
                        Object obj3 = qh.OOA6hdeuvCS;
                        if (GWasM1elztuh2 == obj3) {
                            return obj3;
                        }
                        rt0Var = rt0Var2;
                    } catch (GWasM1elztuh e2) {
                        rt0Var = rt0Var2;
                        e = e2;
                        v8Var = v8Var2;
                        if (e.OOA6hdeuvCS != v8Var) {
                            throw e;
                        }
                        obj = rt0Var.OOA6hdeuvCS;
                        if (obj == ppVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v8Var = atVar.mOu10nynGul;
                    rt0Var = atVar.encWxUiV2;
                    try {
                        o50.A1EKNP6CxJ(obj2);
                    } catch (GWasM1elztuh e3) {
                        e = e3;
                        if (e.OOA6hdeuvCS != v8Var) {
                        }
                        obj = rt0Var.OOA6hdeuvCS;
                        if (obj == ppVar) {
                        }
                    }
                }
                obj = rt0Var.OOA6hdeuvCS;
                if (obj == ppVar) {
                    return obj;
                }
                o4.AvO7iQsrTN("Expected at least one element");
                return null;
            }
        }
        atVar = new at(wgVar);
        Object obj22 = atVar.JFJ3QoxA;
        i = atVar.rQPn8YBR;
        if (i != 0) {
        }
        obj = rt0Var.OOA6hdeuvCS;
        if (obj == ppVar) {
        }
    }

    public static final void eUH21U3apd(SyyZR548qbcW syyZR548qbcW, d01 d01Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = syyZR548qbcW.GWasM1elztuh;
        Object AvO7iQsrTN2 = d01Var.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.EljAMC1QTz);
        if (AvO7iQsrTN2 == null) {
            AvO7iQsrTN2 = null;
        }
        qb qbVar = (qb) AvO7iQsrTN2;
        if (qbVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(qbVar.GWasM1elztuh, qbVar.Yi7zF1RB1, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object AvO7iQsrTN3 = d01Var.rQPn8YBR().OOA6hdeuvCS.AvO7iQsrTN(h01.OOA6hdeuvCS);
        if ((AvO7iQsrTN3 != null ? AvO7iQsrTN3 : null) != null) {
            List JFJ3QoxA2 = d01.JFJ3QoxA(4, d01Var);
            int size = JFJ3QoxA2.size();
            for (int i = 0; i < size; i++) {
                d01 d01Var2 = (d01) JFJ3QoxA2.get(i);
                if (d01Var2.rQPn8YBR().OOA6hdeuvCS.X1lG3V04pd(h01.eUH21U3apd)) {
                    arrayList.add(d01Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean WIEu4Ya2g8 = WIEu4Ya2g8(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(WIEu4Ya2g8 ? 1 : arrayList.size(), WIEu4Ya2g8 ? arrayList.size() : 1, false, 0));
    }

    public static final void encWxUiV2(ie0 ie0Var, lv lvVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(-1298353104);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(ie0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.encWxUiV2(lvVar) ? 32 : 16;
        }
        int i3 = 1;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 19) != 18)) {
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new o61(b9xEq24R1.J3Xc8BaqpN8);
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            mOu10nynGul((o61) HFYAaqMd6, ie0Var, lvVar, qxVar, (i2 << 3) & 1008);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new f0(ie0Var, lvVar, i, i3);
        }
    }

    public static ls iwATDS1i01k(ls lsVar, int i) {
        l8 l8Var;
        if (i < 0 && i != -2 && i != -1) {
            o4.OOA6hdeuvCS(mr0.AvO7iQsrTN("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i));
            return null;
        }
        if (i == -1) {
            i = 0;
            l8Var = l8.EljAMC1QTz;
        } else {
            l8Var = l8.OOA6hdeuvCS;
        }
        boolean z = lsVar instanceof wv;
        vp vpVar = vp.OOA6hdeuvCS;
        return z ? ((wv) lsVar).Yi7zF1RB1(vpVar, i, l8Var) : new da(lsVar, vpVar, i, l8Var);
    }

    public static final ls jivtDDk9H(ls lsVar) {
        return lsVar instanceof n51 ? lsVar : lsVar instanceof zm ? lsVar : new zm(lsVar);
    }

    public static final boolean k8h8IjolWQ(KeyEvent keyEvent) {
        long OOA6hdeuvCS2 = OOA6hdeuvCS(keyEvent.getKeyCode());
        return w40.GWasM1elztuh(OOA6hdeuvCS2, w40.encWxUiV2) || w40.GWasM1elztuh(OOA6hdeuvCS2, w40.rQPn8YBR) || w40.GWasM1elztuh(OOA6hdeuvCS2, w40.iwATDS1i01k) || w40.GWasM1elztuh(OOA6hdeuvCS2, w40.JFJ3QoxA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lv06NcmrQ(ls lsVar, lv lvVar, wg wgVar) {
        bt btVar;
        int i;
        lv lvVar2;
        rt0 rt0Var;
        GWasM1elztuh e;
        ij ijVar;
        Object obj;
        pp ppVar = n30.JFJ3QoxA;
        if (wgVar instanceof bt) {
            btVar = (bt) wgVar;
            int i2 = btVar.E7jCp8Ls;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                btVar.E7jCp8Ls = i2 - Integer.MIN_VALUE;
                Object obj2 = btVar.rQPn8YBR;
                i = btVar.E7jCp8Ls;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj2);
                    rt0 rt0Var2 = new rt0();
                    rt0Var2.OOA6hdeuvCS = ppVar;
                    ij ijVar2 = new ij(3, lvVar, rt0Var2);
                    try {
                        btVar.encWxUiV2 = (d71) lvVar;
                        btVar.mOu10nynGul = rt0Var2;
                        btVar.JFJ3QoxA = ijVar2;
                        btVar.E7jCp8Ls = 1;
                        Object GWasM1elztuh2 = lsVar.GWasM1elztuh(ijVar2, btVar);
                        Object obj3 = qh.OOA6hdeuvCS;
                        if (GWasM1elztuh2 == obj3) {
                            return obj3;
                        }
                        lvVar2 = lvVar;
                        rt0Var = rt0Var2;
                    } catch (GWasM1elztuh e2) {
                        lvVar2 = lvVar;
                        rt0Var = rt0Var2;
                        e = e2;
                        ijVar = ijVar2;
                        if (e.OOA6hdeuvCS != ijVar) {
                            throw e;
                        }
                        obj = rt0Var.OOA6hdeuvCS;
                        if (obj == ppVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ijVar = btVar.JFJ3QoxA;
                    rt0Var = btVar.mOu10nynGul;
                    lvVar2 = (lv) btVar.encWxUiV2;
                    try {
                        o50.A1EKNP6CxJ(obj2);
                    } catch (GWasM1elztuh e3) {
                        e = e3;
                        if (e.OOA6hdeuvCS != ijVar) {
                        }
                        obj = rt0Var.OOA6hdeuvCS;
                        if (obj == ppVar) {
                        }
                    }
                }
                obj = rt0Var.OOA6hdeuvCS;
                if (obj == ppVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + lvVar2);
            }
        }
        btVar = new bt(wgVar);
        Object obj22 = btVar.rQPn8YBR;
        i = btVar.E7jCp8Ls;
        if (i != 0) {
        }
        obj = rt0Var.OOA6hdeuvCS;
        if (obj == ppVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vg mE4lRynR(vg vgVar, vg vgVar2, lv lvVar) {
        lvVar.getClass();
        if (lvVar instanceof h6) {
            return ((h6) lvVar).uFEq9NpZ(vgVar2, vgVar);
        }
        gh OOA6hdeuvCS2 = vgVar2.OOA6hdeuvCS();
        return OOA6hdeuvCS2 == vp.OOA6hdeuvCS ? new p30(vgVar2, vgVar, lvVar) : new q30(vgVar2, OOA6hdeuvCS2, lvVar, vgVar);
    }

    public static final void mOu10nynGul(o61 o61Var, ie0 ie0Var, lv lvVar, qx qxVar, int i) {
        int i2;
        qxVar.Uxq83abb04(-511989831);
        if ((i & 6) == 0) {
            i2 = (qxVar.encWxUiV2(o61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.EljAMC1QTz(ie0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.encWxUiV2(lvVar) ? 256 : 128;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 147) != 146)) {
            int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
            ox qugwajBSa59j = fb1.qugwajBSa59j(qxVar);
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar, ie0Var);
            cp0 E7jCp8Ls2 = qxVar.E7jCp8Ls();
            hf hfVar = hf.XnEVoBF0td1l;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(hfVar);
            } else {
                qxVar.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(o61Var.X1lG3V04pd, qxVar, o61Var);
            l60.WRKkgoJXwDn(o61Var.xqGvceK5x, qxVar, qugwajBSa59j);
            l60.WRKkgoJXwDn(o61Var.OOA6hdeuvCS, qxVar, lvVar);
            oe.X1lG3V04pd.getClass();
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls2);
            l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
            l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar, Integer.valueOf(hashCode));
            qxVar.WIEu4Ya2g8(true);
            if (qxVar.pog2g9KITJA()) {
                qxVar.MjxSquD6Av(-1259187287);
                qxVar.WIEu4Ya2g8(false);
            } else {
                qxVar.MjxSquD6Av(-1259245908);
                boolean encWxUiV22 = qxVar.encWxUiV2(o61Var);
                Object HFYAaqMd6 = qxVar.HFYAaqMd6();
                if (encWxUiV22 || HFYAaqMd6 == ue.GWasM1elztuh) {
                    HFYAaqMd6 = new d3(10, o61Var);
                    qxVar.dcDmLGVhzWm(HFYAaqMd6);
                }
                ki1.rQPn8YBR((wu) HFYAaqMd6, qxVar);
                qxVar.WIEu4Ya2g8(false);
            }
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new c0(o61Var, ie0Var, lvVar, i, 1);
        }
    }

    public static void ozMwhSAI(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f2 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    public static final void pog2g9KITJA(gh ghVar, Throwable th) {
        try {
            jh jhVar = (jh) ghVar.E7jCp8Ls(b9xEq24R1.pog2g9KITJA);
            if (jhVar != null) {
                jhVar.uFEq9NpZ(ghVar, th);
            } else {
                vc0.arNh8D4Z5gB(ghVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                p.xqGvceK5x(runtimeException, th);
                th = runtimeException;
            }
            vc0.arNh8D4Z5gB(ghVar, th);
        }
    }

    public static final void rQPn8YBR(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final Object rezfBrjOrqK(gh ghVar, Object obj, Object obj2, lv lvVar, vg vgVar) {
        Object EljAMC1QTz2;
        Object M3K9sHhK = p.M3K9sHhK(ghVar, obj2);
        try {
            d51 d51Var = new d51(vgVar, ghVar);
            if (lvVar == null) {
                EljAMC1QTz2 = TpUsjqg3bxO(lvVar, obj, d51Var);
            } else {
                fb1.XnEVoBF0td1l(2, lvVar);
                EljAMC1QTz2 = lvVar.EljAMC1QTz(obj, d51Var);
            }
            p.jivtDDk9H(ghVar, M3K9sHhK);
            if (EljAMC1QTz2 == qh.OOA6hdeuvCS) {
                vgVar.getClass();
            }
            return EljAMC1QTz2;
        } catch (Throwable th) {
            p.jivtDDk9H(ghVar, M3K9sHhK);
            throw th;
        }
    }

    public static final Object uFEq9NpZ(xk xkVar, t5 t5Var, d71 d71Var) {
        Object obj;
        bk0 YZjbz8VdP5;
        Object EDwNPVYuViP0;
        xj0 xj0Var;
        if (((he0) xkVar).OOA6hdeuvCS.Mjvvu5DE) {
            he0 he0Var = (he0) xkVar;
            if (!he0Var.OOA6hdeuvCS.Mjvvu5DE) {
                t10.Yi7zF1RB1("visitAncestors called on an unattached node");
            }
            he0 he0Var2 = he0Var.OOA6hdeuvCS.mOu10nynGul;
            g60 eUH21U3apd = vc0.eUH21U3apd(xkVar);
            loop0: while (true) {
                obj = null;
                if (eUH21U3apd == null) {
                    break;
                }
                if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 524288) != 0) {
                    while (he0Var2 != null) {
                        if ((he0Var2.AvO7iQsrTN & 524288) != 0) {
                            he0 he0Var3 = he0Var2;
                            rg0 rg0Var = null;
                            while (he0Var3 != null) {
                                if (he0Var3 instanceof w7) {
                                    obj = he0Var3;
                                    break loop0;
                                }
                                if ((he0Var3.AvO7iQsrTN & 524288) != 0 && (he0Var3 instanceof yk)) {
                                    int i = 0;
                                    for (he0 he0Var4 = ((yk) he0Var3).jivtDDk9H; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
                                        if ((he0Var4.AvO7iQsrTN & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                he0Var3 = he0Var4;
                                            } else {
                                                if (rg0Var == null) {
                                                    rg0Var = new rg0(new he0[16]);
                                                }
                                                if (he0Var3 != null) {
                                                    rg0Var.Yi7zF1RB1(he0Var3);
                                                    he0Var3 = null;
                                                }
                                                rg0Var.Yi7zF1RB1(he0Var4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                he0Var3 = vc0.E7jCp8Ls(rg0Var);
                            }
                        }
                        he0Var2 = he0Var2.mOu10nynGul;
                    }
                }
                eUH21U3apd = eUH21U3apd.cilMamHF();
                he0Var2 = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
            }
            w7 w7Var = (w7) obj;
            if (w7Var != null && (EDwNPVYuViP0 = w7Var.EDwNPVYuViP0((YZjbz8VdP5 = vc0.YZjbz8VdP5(xkVar)), new psOJLYhIz(2, t5Var, YZjbz8VdP5), d71Var)) == qh.OOA6hdeuvCS) {
                return EDwNPVYuViP0;
            }
        }
        return kc1.GWasM1elztuh;
    }

    public static final void xqGvceK5x(wu wuVar, qx qxVar, int i) {
        qx qxVar2;
        wuVar.getClass();
        qxVar.Uxq83abb04(-1276249499);
        int i2 = 4;
        int i3 = (qxVar.encWxUiV2(wuVar) ? 4 : 2) | i;
        int i4 = 0;
        if (qxVar.dqB83aoLBB(i3 & 1, (i3 & 3) != 2)) {
            xy0 GWasM1elztuh2 = tn0.GWasM1elztuh(0);
            qxVar2 = qxVar;
            ki1.iwATDS1i01k(GWasM1elztuh2.GWasM1elztuh, null, YZjbz8VdP5(-352977467, new xz(i4, wuVar, GWasM1elztuh2), qxVar), qxVar2, 384);
        } else {
            qxVar2 = qxVar;
            qxVar2.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar2.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new k4(i, i2, wuVar);
        }
    }
}
