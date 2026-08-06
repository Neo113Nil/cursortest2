package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Trace;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class p {
    public static final ix0 AEn1Rrio;
    public static final pp AvO7iQsrTN;
    public static final f4 E7jCp8Ls;
    public static final pp EXrPz3p7hFb;
    public static final pp EljAMC1QTz;
    public static final float M3K9sHhK;
    public static final d Mjvvu5DE;
    public static final pp OOA6hdeuvCS;
    public static final d WIEu4Ya2g8;
    public static final ec WRKkgoJXwDn;
    public static f4 XnEVoBF0td1l;
    public static final ix0 YZjbz8VdP5;
    public static final d YmKjaVtbfp5Z;
    public static final ec arNh8D4Z5gB;
    public static final pp encWxUiV2;
    public static final d iwATDS1i01k;
    public static final float k8h8IjolWQ;
    public static final d mE4lRynR;
    public static final pp mOu10nynGul;
    public static final ix0 ozMwhSAI;
    public static final wb1 pog2g9KITJA;
    public static final vg[] GWasM1elztuh = new vg[0];
    public static final jd Yi7zF1RB1 = new jd(-1787910579, false, new pd(7));
    public static final eq0 X1lG3V04pd = new eq0(new bq0());
    public static final m00 xqGvceK5x = new m00(false);
    public static final sp JFJ3QoxA = new sp(false);
    public static final sp rQPn8YBR = new sp(true);
    public static final StackTraceElement[] uFEq9NpZ = new StackTraceElement[0];
    public static final ec jivtDDk9H = ec.EljAMC1QTz;
    public static final wb1 Y6hRI1cF8 = wb1.AvO7iQsrTN;
    public static final ec cilMamHF = ec.AvO7iQsrTN;
    public static final float lv06NcmrQ = 6.0f;
    public static final b21 WdrkLMV3xh = b21.EljAMC1QTz;

    static {
        byte b = 0;
        int i = 1;
        OOA6hdeuvCS = new pp("COMPLETING_ALREADY", i);
        EljAMC1QTz = new pp("COMPLETING_WAITING_CHILDREN", i);
        AvO7iQsrTN = new pp("COMPLETING_RETRY", i);
        encWxUiV2 = new pp("TOO_LATE_TO_CANCEL", i);
        mOu10nynGul = new pp("SEALED", i);
        Object obj = null;
        E7jCp8Ls = new f4(obj, obj, obj, 10);
        int i2 = 19;
        iwATDS1i01k = new d(i2, new cx0(26), new dx0(14));
        WIEu4Ya2g8 = new d(i2, new cx0(27), new dx0(15));
        YmKjaVtbfp5Z = new d(i2, new cx0(28), new dx0(16));
        Mjvvu5DE = new d(i2, new cx0(29), new dx0(17));
        mE4lRynR = new d(i2, new ix0(b, b), new dx0(18));
        ec ecVar = ec.OOA6hdeuvCS;
        WRKkgoJXwDn = ecVar;
        arNh8D4Z5gB = ecVar;
        pog2g9KITJA = wb1.OOA6hdeuvCS;
        M3K9sHhK = 48.0f;
        k8h8IjolWQ = 68.0f;
        EXrPz3p7hFb = new pp("NO_THREAD_ELEMENTS", i);
        ozMwhSAI = new ix0(3, b);
        AEn1Rrio = new ix0(4, b);
        YZjbz8VdP5 = new ix0(5, b);
    }

    public static final void AvO7iQsrTN(long j, xm0 xm0Var) {
        if (xm0Var == xm0.OOA6hdeuvCS) {
            if (eg.AvO7iQsrTN(j) != Integer.MAX_VALUE) {
                return;
            }
            w10.X1lG3V04pd("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (eg.encWxUiV2(j) != Integer.MAX_VALUE) {
                return;
            }
            w10.X1lG3V04pd("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final boolean E7jCp8Ls(long j, long j2) {
        return j == j2;
    }

    public static final ie0 EljAMC1QTz(ie0 ie0Var, long j, z11 z11Var) {
        return ie0Var.X1lG3V04pd(new e6(j, null, z11Var, 2));
    }

    public static final y GWasM1elztuh(String str) {
        Set singleton = Collections.singleton(str);
        singleton.getClass();
        return new y(singleton);
    }

    public static final float JFJ3QoxA(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final Object M3K9sHhK(gh ghVar, Object obj) {
        if (obj == null) {
            obj = WRKkgoJXwDn(ghVar);
        }
        if (obj == 0) {
            return EXrPz3p7hFb;
        }
        if (obj instanceof Integer) {
            return ghVar.WIEu4Ya2g8(YZjbz8VdP5, new g91(((Number) obj).intValue(), ghVar));
        }
        Trace.beginSection(null);
        return kc1.GWasM1elztuh;
    }

    public static final Object Mjvvu5DE(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static ie0 OOA6hdeuvCS(ie0 ie0Var, qj qjVar, uv0 uv0Var, int i) {
        z11 z11Var = uv0Var;
        if ((i & 2) != 0) {
            z11Var = vc0.EljAMC1QTz;
        }
        return ie0Var.X1lG3V04pd(new e6(0L, qjVar, z11Var, 1));
    }

    public static final ai WIEu4Ya2g8(rt rtVar) {
        if (!rtVar.Y6hRI1cF8) {
            rtVar.Y6hRI1cF8 = true;
            try {
                ot XmVeRDAr = rtVar.XmVeRDAr();
                nt ntVar = (nt) ((c) vc0.A1EKNP6CxJ(rtVar)).getFocusOwner();
                rt EljAMC1QTz2 = ntVar.EljAMC1QTz();
                XmVeRDAr.JFJ3QoxA.getClass();
                rt EljAMC1QTz3 = ntVar.EljAMC1QTz();
                if (EljAMC1QTz2 != EljAMC1QTz3 && EljAMC1QTz3 != null) {
                    return pt.xqGvceK5x == pt.X1lG3V04pd ? ai.EljAMC1QTz : ai.AvO7iQsrTN;
                }
            } finally {
                rtVar.Y6hRI1cF8 = false;
            }
        }
        return ai.OOA6hdeuvCS;
    }

    public static final Object WRKkgoJXwDn(gh ghVar) {
        Object WIEu4Ya2g82 = ghVar.WIEu4Ya2g8(ozMwhSAI, 0);
        WIEu4Ya2g82.getClass();
        return WIEu4Ya2g82;
    }

    public static final String WdrkLMV3xh(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final void X1lG3V04pd(SyyZR548qbcW syyZR548qbcW, d01 d01Var) {
        if (n30.encWxUiV2(d01Var)) {
            Object AvO7iQsrTN2 = d01Var.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(yz0.mOu10nynGul);
            if (AvO7iQsrTN2 == null) {
                AvO7iQsrTN2 = null;
            }
            VeqTn1PQw7 veqTn1PQw7 = (VeqTn1PQw7) AvO7iQsrTN2;
            if (veqTn1PQw7 != null) {
                syyZR548qbcW.GWasM1elztuh(new EDwNPVYuViP0(null, R.id.accessibilityActionSetProgress, veqTn1PQw7.GWasM1elztuh, null));
            }
        }
    }

    public static final String[] XnEVoBF0td1l(sg sgVar) {
        sgVar.getClass();
        return (String[]) ((y) sgVar).Yi7zF1RB1.toArray(new String[0]);
    }

    public static final void Y6hRI1cF8(n9 n9Var, vg vgVar, boolean z) {
        Object Y6hRI1cF82 = n9Var.Y6hRI1cF8();
        Throwable EljAMC1QTz2 = n9Var.EljAMC1QTz(Y6hRI1cF82);
        Object su0Var = EljAMC1QTz2 != null ? new su0(EljAMC1QTz2) : n9Var.encWxUiV2(Y6hRI1cF82);
        if (!z) {
            vgVar.AvO7iQsrTN(su0Var);
            return;
        }
        vgVar.getClass();
        im imVar = (im) vgVar;
        wg wgVar = imVar.mOu10nynGul;
        Object obj = imVar.rQPn8YBR;
        gh OOA6hdeuvCS2 = wgVar.OOA6hdeuvCS();
        Object M3K9sHhK2 = M3K9sHhK(OOA6hdeuvCS2, obj);
        hc1 qugwajBSa59j = M3K9sHhK2 != EXrPz3p7hFb ? o30.qugwajBSa59j(wgVar, OOA6hdeuvCS2, M3K9sHhK2) : null;
        try {
            wgVar.AvO7iQsrTN(su0Var);
            if (qugwajBSa59j == null || qugwajBSa59j.JB4pnjMK()) {
                jivtDDk9H(OOA6hdeuvCS2, M3K9sHhK2);
            }
        } catch (Throwable th) {
            if (qugwajBSa59j == null || qugwajBSa59j.JB4pnjMK()) {
                jivtDDk9H(OOA6hdeuvCS2, M3K9sHhK2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0080 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Yi7zF1RB1(List list, ki kiVar, wg wgVar) {
        ci ciVar;
        int i;
        List list2;
        rt0 rt0Var;
        Iterator it;
        Throwable th;
        if (wgVar instanceof ci) {
            ciVar = (ci) wgVar;
            int i2 = ciVar.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ciVar.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj = ciVar.JFJ3QoxA;
                i = ciVar.rQPn8YBR;
                Object obj2 = qh.OOA6hdeuvCS;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    ArrayList arrayList = new ArrayList();
                    ei eiVar = new ei(list, arrayList, null);
                    ciVar.encWxUiV2 = arrayList;
                    ciVar.rQPn8YBR = 1;
                    if (kiVar.GWasM1elztuh(eiVar, ciVar) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = ciVar.mOu10nynGul;
                        rt0Var = (rt0) ciVar.encWxUiV2;
                        try {
                            o50.A1EKNP6CxJ(obj);
                        } catch (Throwable th2) {
                            Object obj3 = rt0Var.OOA6hdeuvCS;
                            if (obj3 == null) {
                                rt0Var.OOA6hdeuvCS = th2;
                            } else {
                                xqGvceK5x((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            hv hvVar = (hv) it.next();
                            ciVar.encWxUiV2 = rt0Var;
                            ciVar.mOu10nynGul = it;
                            ciVar.rQPn8YBR = 2;
                            if (hvVar.mOu10nynGul(ciVar) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) rt0Var.OOA6hdeuvCS;
                        if (th == null) {
                            return kc1.GWasM1elztuh;
                        }
                        throw th;
                    }
                    list2 = (List) ciVar.encWxUiV2;
                    o50.A1EKNP6CxJ(obj);
                }
                rt0Var = new rt0();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) rt0Var.OOA6hdeuvCS;
                if (th == null) {
                }
            }
        }
        ciVar = new ci(wgVar);
        Object obj4 = ciVar.JFJ3QoxA;
        i = ciVar.rQPn8YBR;
        Object obj22 = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        rt0Var = new rt0();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) rt0Var.OOA6hdeuvCS;
        if (th == null) {
        }
    }

    public static final ai YmKjaVtbfp5Z(rt rtVar) {
        he0 he0Var;
        xj0 xj0Var;
        int ordinal = rtVar.bfDgRvRIg().ordinal();
        ai aiVar = ai.OOA6hdeuvCS;
        if (ordinal != 0) {
            if (ordinal == 1) {
                rt cilMamHF2 = qj.cilMamHF(rtVar);
                if (cilMamHF2 != null) {
                    return iwATDS1i01k(cilMamHF2);
                }
                o4.mE4lRynR("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    o4.xqGvceK5x();
                    return null;
                }
                if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                }
                he0 he0Var2 = rtVar.OOA6hdeuvCS.mOu10nynGul;
                g60 eUH21U3apd = vc0.eUH21U3apd(rtVar);
                loop0: while (true) {
                    if (eUH21U3apd == null) {
                        he0Var = null;
                        break;
                    }
                    if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 1024) != 0) {
                        while (he0Var2 != null) {
                            if ((he0Var2.AvO7iQsrTN & 1024) != 0) {
                                he0Var = he0Var2;
                                rg0 rg0Var = null;
                                while (he0Var != null) {
                                    if (he0Var instanceof rt) {
                                        break loop0;
                                    }
                                    if ((he0Var.AvO7iQsrTN & 1024) != 0 && (he0Var instanceof yk)) {
                                        int i = 0;
                                        for (he0 he0Var3 = ((yk) he0Var).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                            if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    he0Var = he0Var3;
                                                } else {
                                                    if (rg0Var == null) {
                                                        rg0Var = new rg0(new he0[16]);
                                                    }
                                                    if (he0Var != null) {
                                                        rg0Var.Yi7zF1RB1(he0Var);
                                                        he0Var = null;
                                                    }
                                                    rg0Var.Yi7zF1RB1(he0Var3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    he0Var = vc0.E7jCp8Ls(rg0Var);
                                }
                            }
                            he0Var2 = he0Var2.mOu10nynGul;
                        }
                    }
                    eUH21U3apd = eUH21U3apd.cilMamHF();
                    he0Var2 = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
                }
                rt rtVar2 = (rt) he0Var;
                if (rtVar2 == null) {
                    return aiVar;
                }
                int ordinal2 = rtVar2.bfDgRvRIg().ordinal();
                if (ordinal2 == 0) {
                    return WIEu4Ya2g8(rtVar2);
                }
                if (ordinal2 == 1) {
                    return YmKjaVtbfp5Z(rtVar2);
                }
                if (ordinal2 == 2) {
                    return ai.EljAMC1QTz;
                }
                if (ordinal2 != 3) {
                    o4.xqGvceK5x();
                    return null;
                }
                ai YmKjaVtbfp5Z2 = YmKjaVtbfp5Z(rtVar2);
                ai aiVar2 = YmKjaVtbfp5Z2 != aiVar ? YmKjaVtbfp5Z2 : null;
                return aiVar2 == null ? WIEu4Ya2g8(rtVar2) : aiVar2;
            }
        }
        return aiVar;
    }

    public static final boolean arNh8D4Z5gB(Throwable th, wu wuVar) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = c40.GWasM1elztuh;
        ql qlVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        } else {
            Method method = yp0.Yi7zF1RB1;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = xp.OOA6hdeuvCS;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            }
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) asList.get(i)) instanceof ql) {
                return false;
            }
        }
        try {
            ke keVar = (ke) wuVar.GWasM1elztuh();
            if (keVar != null) {
                boolean z2 = keVar.Yi7zF1RB1;
                List list = keVar.GWasM1elztuh;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((me) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                keVar.getClass();
                qlVar = new ql(keVar);
            }
        } catch (Throwable th2) {
            qlVar = th2;
        }
        if (qlVar != null) {
            xqGvceK5x(th, qlVar);
        }
        return z;
    }

    public static final Object cilMamHF(rt rtVar, int i, hv hvVar) {
        int i2;
        int i3;
        Object obj;
        he0 he0Var;
        i70 OGdJP42E;
        int size;
        int i4;
        xj0 xj0Var;
        if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitAncestors called on an unattached node");
        }
        he0 he0Var2 = rtVar.OOA6hdeuvCS.mOu10nynGul;
        g60 eUH21U3apd = vc0.eUH21U3apd(rtVar);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (eUH21U3apd == null) {
                he0Var = null;
                break;
            }
            if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 1024) != 0) {
                while (he0Var2 != null) {
                    if ((he0Var2.AvO7iQsrTN & 1024) != 0) {
                        he0Var = he0Var2;
                        rg0 rg0Var = null;
                        while (he0Var != null) {
                            if (he0Var instanceof rt) {
                                break loop0;
                            }
                            if ((he0Var.AvO7iQsrTN & 1024) != 0 && (he0Var instanceof yk)) {
                                int i5 = 0;
                                for (he0 he0Var3 = ((yk) he0Var).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                    if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            he0Var = he0Var3;
                                        } else {
                                            if (rg0Var == null) {
                                                rg0Var = new rg0(new he0[16]);
                                            }
                                            if (he0Var != null) {
                                                rg0Var.Yi7zF1RB1(he0Var);
                                                he0Var = null;
                                            }
                                            rg0Var.Yi7zF1RB1(he0Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            he0Var = vc0.E7jCp8Ls(rg0Var);
                        }
                    }
                    he0Var2 = he0Var2.mOu10nynGul;
                }
            }
            eUH21U3apd = eUH21U3apd.cilMamHF();
            he0Var2 = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
        }
        rt rtVar2 = (rt) he0Var;
        if ((rtVar2 == null || !o30.rQPn8YBR(rtVar2.OGdJP42E(), rtVar.OGdJP42E())) && (OGdJP42E = rtVar.OGdJP42E()) != null) {
            int i6 = 5;
            if (i != 5) {
                i6 = 6;
                if (i != 6) {
                    i6 = 3;
                    if (i != 3) {
                        i6 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i6 = 2;
                            } else if (i == 2) {
                                i6 = 1;
                            } else {
                                o4.jivtDDk9H("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (OGdJP42E.mE4lRynR.GWasM1elztuh.AvO7iQsrTN().uFEq9NpZ <= 0 || OGdJP42E.mE4lRynR.GWasM1elztuh.AvO7iQsrTN().rQPn8YBR.isEmpty() || !OGdJP42E.Mjvvu5DE) {
                return hvVar.mOu10nynGul(i70.cilMamHF);
            }
            boolean sb9fmtV8A = OGdJP42E.sb9fmtV8A(i6);
            h80 h80Var = OGdJP42E.mE4lRynR;
            int min = sb9fmtV8A ? Math.min(h80Var.GWasM1elztuh.AvO7iQsrTN().uFEq9NpZ - 1, ((q80) rb.vaTCmWUgXF(h80Var.GWasM1elztuh.AvO7iQsrTN().rQPn8YBR)).GWasM1elztuh) : Math.max(0, ((co0) h80Var.GWasM1elztuh.OOA6hdeuvCS.Yi7zF1RB1).AvO7iQsrTN());
            rt0 rt0Var = new rt0();
            x7 x7Var = OGdJP42E.jivtDDk9H;
            x7Var.getClass();
            e70 e70Var = new e70(min, min);
            x7Var.GWasM1elztuh.Yi7zF1RB1(e70Var);
            rt0Var.OOA6hdeuvCS = e70Var;
            u80 u80Var = OGdJP42E.mE4lRynR.GWasM1elztuh;
            if (u80Var.AvO7iQsrTN().rQPn8YBR.isEmpty()) {
                i3 = 0;
            } else {
                p80 AvO7iQsrTN2 = u80Var.AvO7iQsrTN();
                int AvO7iQsrTN3 = (int) (AvO7iQsrTN2.iwATDS1i01k == xm0.OOA6hdeuvCS ? AvO7iQsrTN2.AvO7iQsrTN() & 4294967295L : AvO7iQsrTN2.AvO7iQsrTN() >> 32);
                p80 AvO7iQsrTN4 = u80Var.AvO7iQsrTN();
                List list = AvO7iQsrTN4.rQPn8YBR;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size2; i8++) {
                        i7 += ((q80) list.get(i8)).rQPn8YBR;
                    }
                    size = (i7 / list.size()) + AvO7iQsrTN4.YmKjaVtbfp5Z;
                }
                if (size != 0 && (i4 = AvO7iQsrTN3 / size) >= 1) {
                    i3 = i4;
                }
            }
            int i9 = i3 * 2;
            int i10 = OGdJP42E.mE4lRynR.GWasM1elztuh.AvO7iQsrTN().uFEq9NpZ;
            if (i9 > i10) {
                i9 = i10;
            }
            while (obj == null && OGdJP42E.gqMuANyCes((e70) rt0Var.OOA6hdeuvCS, i6) && i2 < i9) {
                e70 e70Var2 = (e70) rt0Var.OOA6hdeuvCS;
                int i11 = e70Var2.GWasM1elztuh;
                int i12 = e70Var2.Yi7zF1RB1;
                if (OGdJP42E.sb9fmtV8A(i6)) {
                    i12++;
                } else {
                    i11--;
                }
                x7 x7Var2 = OGdJP42E.jivtDDk9H;
                x7Var2.getClass();
                e70 e70Var3 = new e70(i11, i12);
                x7Var2.GWasM1elztuh.Yi7zF1RB1(e70Var3);
                OGdJP42E.jivtDDk9H.GWasM1elztuh.JFJ3QoxA((e70) rt0Var.OOA6hdeuvCS);
                rt0Var.OOA6hdeuvCS = e70Var3;
                i2++;
                vc0.eUH21U3apd(OGdJP42E).rQPn8YBR();
                obj = hvVar.mOu10nynGul(new h70(OGdJP42E, rt0Var, i6));
            }
            OGdJP42E.jivtDDk9H.GWasM1elztuh.JFJ3QoxA((e70) rt0Var.OOA6hdeuvCS);
            vc0.eUH21U3apd(OGdJP42E).rQPn8YBR();
            return obj;
        }
        return null;
    }

    public static final boolean encWxUiV2(rt rtVar, boolean z) {
        int ordinal = rtVar.bfDgRvRIg().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                rt cilMamHF2 = qj.cilMamHF(rtVar);
                if (!(cilMamHF2 != null ? encWxUiV2(cilMamHF2, z) : true)) {
                    return false;
                }
                rtVar.sb9fmtV8A(qt.EljAMC1QTz, qt.AvO7iQsrTN);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                o4.xqGvceK5x();
                return false;
            }
        }
        return true;
    }

    public static final ai iwATDS1i01k(rt rtVar) {
        int ordinal = rtVar.bfDgRvRIg().ordinal();
        ai aiVar = ai.OOA6hdeuvCS;
        if (ordinal != 0) {
            ai aiVar2 = ai.EljAMC1QTz;
            if (ordinal == 1) {
                rt cilMamHF2 = qj.cilMamHF(rtVar);
                if (cilMamHF2 == null) {
                    o4.mE4lRynR("ActiveParent with no focused child");
                    return null;
                }
                ai iwATDS1i01k2 = iwATDS1i01k(cilMamHF2);
                ai aiVar3 = iwATDS1i01k2 != aiVar ? iwATDS1i01k2 : null;
                if (aiVar3 != null) {
                    return aiVar3;
                }
                if (rtVar.jivtDDk9H) {
                    return aiVar;
                }
                rtVar.jivtDDk9H = true;
                try {
                    ot XmVeRDAr = rtVar.XmVeRDAr();
                    nt ntVar = (nt) ((c) vc0.A1EKNP6CxJ(rtVar)).getFocusOwner();
                    rt EljAMC1QTz2 = ntVar.EljAMC1QTz();
                    XmVeRDAr.rQPn8YBR.getClass();
                    rt EljAMC1QTz3 = ntVar.EljAMC1QTz();
                    return (EljAMC1QTz2 == EljAMC1QTz3 || EljAMC1QTz3 == null) ? aiVar : pt.xqGvceK5x == pt.X1lG3V04pd ? aiVar2 : ai.AvO7iQsrTN;
                } finally {
                    rtVar.jivtDDk9H = false;
                }
            }
            if (ordinal == 2) {
                return aiVar2;
            }
            if (ordinal != 3) {
                o4.xqGvceK5x();
                return null;
            }
        }
        return aiVar;
    }

    public static final void jivtDDk9H(gh ghVar, Object obj) {
        if (obj == EXrPz3p7hFb) {
            return;
        }
        if (!(obj instanceof g91)) {
            Object WIEu4Ya2g82 = ghVar.WIEu4Ya2g8(AEn1Rrio, null);
            WIEu4Ya2g82.getClass();
            Trace.endSection();
            return;
        }
        g91 g91Var = (g91) obj;
        ba1[] ba1VarArr = g91Var.X1lG3V04pd;
        int length = ba1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ba1VarArr[length].getClass();
            Trace.endSection();
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final ie0 k8h8IjolWQ(ie0 ie0Var, sf1 sf1Var) {
        return ie0Var.X1lG3V04pd(new i20(sf1Var));
    }

    public static final void lv06NcmrQ(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final void mE4lRynR(float[] fArr, float[] fArr2) {
        float JFJ3QoxA2 = JFJ3QoxA(fArr2, 0, fArr, 0);
        float JFJ3QoxA3 = JFJ3QoxA(fArr2, 0, fArr, 1);
        float JFJ3QoxA4 = JFJ3QoxA(fArr2, 0, fArr, 2);
        float JFJ3QoxA5 = JFJ3QoxA(fArr2, 0, fArr, 3);
        float JFJ3QoxA6 = JFJ3QoxA(fArr2, 1, fArr, 0);
        float JFJ3QoxA7 = JFJ3QoxA(fArr2, 1, fArr, 1);
        float JFJ3QoxA8 = JFJ3QoxA(fArr2, 1, fArr, 2);
        float JFJ3QoxA9 = JFJ3QoxA(fArr2, 1, fArr, 3);
        float JFJ3QoxA10 = JFJ3QoxA(fArr2, 2, fArr, 0);
        float JFJ3QoxA11 = JFJ3QoxA(fArr2, 2, fArr, 1);
        float JFJ3QoxA12 = JFJ3QoxA(fArr2, 2, fArr, 2);
        float JFJ3QoxA13 = JFJ3QoxA(fArr2, 2, fArr, 3);
        float JFJ3QoxA14 = JFJ3QoxA(fArr2, 3, fArr, 0);
        float JFJ3QoxA15 = JFJ3QoxA(fArr2, 3, fArr, 1);
        float JFJ3QoxA16 = JFJ3QoxA(fArr2, 3, fArr, 2);
        float JFJ3QoxA17 = JFJ3QoxA(fArr2, 3, fArr, 3);
        fArr[0] = JFJ3QoxA2;
        fArr[1] = JFJ3QoxA3;
        fArr[2] = JFJ3QoxA4;
        fArr[3] = JFJ3QoxA5;
        fArr[4] = JFJ3QoxA6;
        fArr[5] = JFJ3QoxA7;
        fArr[6] = JFJ3QoxA8;
        fArr[7] = JFJ3QoxA9;
        fArr[8] = JFJ3QoxA10;
        fArr[9] = JFJ3QoxA11;
        fArr[10] = JFJ3QoxA12;
        fArr[11] = JFJ3QoxA13;
        fArr[12] = JFJ3QoxA14;
        fArr[13] = JFJ3QoxA15;
        fArr[14] = JFJ3QoxA16;
        fArr[15] = JFJ3QoxA17;
    }

    public static final r3 mOu10nynGul(r3 r3Var) {
        r3 X1lG3V04pd2 = r3Var.X1lG3V04pd();
        int Yi7zF1RB12 = X1lG3V04pd2.Yi7zF1RB1();
        for (int i = 0; i < Yi7zF1RB12; i++) {
            X1lG3V04pd2.OOA6hdeuvCS(r3Var.GWasM1elztuh(i), i);
        }
        return X1lG3V04pd2;
    }

    public static final Object pog2g9KITJA(Object obj) {
        p00 p00Var;
        q00 q00Var = obj instanceof q00 ? (q00) obj : null;
        return (q00Var == null || (p00Var = q00Var.GWasM1elztuh) == null) ? obj : p00Var;
    }

    public static final void rQPn8YBR(ho hoVar, oy oyVar) {
        boolean z;
        s9 EljAMC1QTz2 = hoVar.arNh8D4Z5gB().EljAMC1QTz();
        oy oyVar2 = (oy) hoVar.arNh8D4Z5gB().X1lG3V04pd;
        qy qyVar = oyVar.GWasM1elztuh;
        if (oyVar.mE4lRynR) {
            return;
        }
        oyVar.GWasM1elztuh();
        if (!qyVar.A1EKNP6CxJ()) {
            try {
                oyVar.GWasM1elztuh.WdrkLMV3xh(oyVar.Yi7zF1RB1, oyVar.X1lG3V04pd, oyVar, oyVar.OOA6hdeuvCS);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = false;
        boolean z3 = qyVar.eUH21U3apd() > 0.0f;
        if (z3) {
            EljAMC1QTz2.YmKjaVtbfp5Z();
        }
        Canvas GWasM1elztuh2 = ddkiCTz5mZ.GWasM1elztuh(EljAMC1QTz2);
        boolean isHardwareAccelerated = GWasM1elztuh2.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j = oyVar.jivtDDk9H;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            long j2 = oyVar.Y6hRI1cF8;
            float f3 = ((int) (j2 >> 32)) + f;
            float f4 = f2 + ((int) (j2 & 4294967295L));
            float Yi7zF1RB12 = qyVar.Yi7zF1RB1();
            s6 WRKkgoJXwDn2 = qyVar.WRKkgoJXwDn();
            int HFYAaqMd6 = qyVar.HFYAaqMd6();
            if (Yi7zF1RB12 < 1.0f || HFYAaqMd6 != 3 || WRKkgoJXwDn2 != null || qyVar.cilMamHF() == 1) {
                a1 a1Var = oyVar.WIEu4Ya2g8;
                if (a1Var == null) {
                    a1Var = qj.xqGvceK5x();
                    oyVar.WIEu4Ya2g8 = a1Var;
                }
                a1Var.X1lG3V04pd(Yi7zF1RB12);
                a1Var.xqGvceK5x(HFYAaqMd6);
                a1Var.EljAMC1QTz(WRKkgoJXwDn2);
                GWasM1elztuh2.saveLayer(f, f2, f3, f4, (Paint) a1Var.Yi7zF1RB1);
            } else {
                GWasM1elztuh2.save();
            }
            GWasM1elztuh2.translate(f, f2);
            GWasM1elztuh2.concat(qyVar.EXrPz3p7hFb());
        }
        boolean z4 = !isHardwareAccelerated && oyVar.lv06NcmrQ;
        if (z4) {
            EljAMC1QTz2.E7jCp8Ls();
            z50 xqGvceK5x2 = oyVar.xqGvceK5x();
            if (xqGvceK5x2 instanceof an0) {
                kt0 kt0Var = ((an0) xqGvceK5x2).Yi7zF1RB1;
                EljAMC1QTz2.EljAMC1QTz(kt0Var.GWasM1elztuh, kt0Var.Yi7zF1RB1, kt0Var.X1lG3V04pd, kt0Var.xqGvceK5x, 1);
            } else if (xqGvceK5x2 instanceof bn0) {
                h1 h1Var = oyVar.XnEVoBF0td1l;
                if (h1Var != null) {
                    h1Var.GWasM1elztuh.rewind();
                } else {
                    h1Var = j1.GWasM1elztuh();
                    oyVar.XnEVoBF0td1l = h1Var;
                }
                h1.Yi7zF1RB1(h1Var, ((bn0) xqGvceK5x2).Yi7zF1RB1);
                EljAMC1QTz2.Mjvvu5DE(h1Var);
            } else {
                if (!(xqGvceK5x2 instanceof zm0)) {
                    o4.xqGvceK5x();
                    return;
                }
                EljAMC1QTz2.Mjvvu5DE(((zm0) xqGvceK5x2).Yi7zF1RB1);
            }
        }
        if (oyVar2 != null) {
            ra raVar = oyVar2.Mjvvu5DE;
            if (!raVar.GWasM1elztuh) {
                s10.GWasM1elztuh("Only add dependencies during a tracking");
            }
            ig0 ig0Var = (ig0) raVar.xqGvceK5x;
            if (ig0Var != null) {
                ig0Var.GWasM1elztuh(oyVar);
            } else if (((oy) raVar.Yi7zF1RB1) != null) {
                ig0 ig0Var2 = lx0.GWasM1elztuh;
                ig0 ig0Var3 = new ig0();
                oy oyVar3 = (oy) raVar.Yi7zF1RB1;
                oyVar3.getClass();
                ig0Var3.GWasM1elztuh(oyVar3);
                ig0Var3.GWasM1elztuh(oyVar);
                raVar.xqGvceK5x = ig0Var3;
                raVar.Yi7zF1RB1 = null;
            } else {
                raVar.Yi7zF1RB1 = oyVar;
            }
            ig0 ig0Var4 = (ig0) raVar.OOA6hdeuvCS;
            if (ig0Var4 != null) {
                z2 = !ig0Var4.E7jCp8Ls(oyVar);
            } else if (((oy) raVar.X1lG3V04pd) != oyVar) {
                z2 = true;
            } else {
                raVar.X1lG3V04pd = null;
            }
            if (z2) {
                oyVar.YmKjaVtbfp5Z++;
            }
        }
        if (((Jz7YUlEP53) EljAMC1QTz2).GWasM1elztuh.isHardwareAccelerated()) {
            z = z3;
            qyVar.jivtDDk9H(EljAMC1QTz2);
        } else {
            u9 u9Var = oyVar.iwATDS1i01k;
            if (u9Var == null) {
                u9Var = new u9();
                oyVar.iwATDS1i01k = u9Var;
            }
            f4 f4Var = u9Var.EljAMC1QTz;
            el elVar = oyVar.Yi7zF1RB1;
            p50 p50Var = oyVar.X1lG3V04pd;
            long CMh55RymNfS = o30.CMh55RymNfS(oyVar.Y6hRI1cF8);
            t9 t9Var = ((u9) f4Var.xqGvceK5x).OOA6hdeuvCS;
            el elVar2 = t9Var.GWasM1elztuh;
            p50 p50Var2 = t9Var.Yi7zF1RB1;
            s9 EljAMC1QTz3 = f4Var.EljAMC1QTz();
            long mOu10nynGul2 = f4Var.mOu10nynGul();
            z = z3;
            oy oyVar4 = (oy) f4Var.X1lG3V04pd;
            f4Var.Mjvvu5DE(elVar);
            f4Var.mE4lRynR(p50Var);
            f4Var.YmKjaVtbfp5Z(EljAMC1QTz2);
            f4Var.jivtDDk9H(CMh55RymNfS);
            f4Var.X1lG3V04pd = oyVar;
            EljAMC1QTz2.E7jCp8Ls();
            try {
                oyVar.X1lG3V04pd(u9Var);
            } finally {
                EljAMC1QTz2.JFJ3QoxA();
                f4Var.Mjvvu5DE(elVar2);
                f4Var.mE4lRynR(p50Var2);
                f4Var.YmKjaVtbfp5Z(EljAMC1QTz3);
                f4Var.jivtDDk9H(mOu10nynGul2);
                f4Var.X1lG3V04pd = oyVar4;
            }
        }
        if (z4) {
            EljAMC1QTz2.JFJ3QoxA();
        }
        if (z) {
            EljAMC1QTz2.uFEq9NpZ();
        }
        if (isHardwareAccelerated) {
            return;
        }
        GWasM1elztuh2.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void uFEq9NpZ(go goVar) {
        if (((he0) goVar).OOA6hdeuvCS.Mjvvu5DE) {
            vc0.AEn1Rrio(goVar, 1).r8u5JxottJCl();
        }
    }

    public static void xqGvceK5x(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = c40.GWasM1elztuh;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = yp0.GWasM1elztuh;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
