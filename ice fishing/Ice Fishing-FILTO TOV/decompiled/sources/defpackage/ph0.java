package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ph0 {
    public final p51 AvO7iQsrTN;
    public final LinkedHashMap E7jCp8Ls;
    public final v4 EljAMC1QTz = new v4();
    public final hi0 GWasM1elztuh;
    public final LinkedHashMap JFJ3QoxA;
    public final lh0 Mjvvu5DE;
    public Bundle[] OOA6hdeuvCS;
    public final ArrayList WIEu4Ya2g8;
    public final ArrayList WRKkgoJXwDn;
    public int WdrkLMV3xh;
    public bi0 X1lG3V04pd;
    public final LinkedHashMap XnEVoBF0td1l;
    public hv Y6hRI1cF8;
    public final j4 Yi7zF1RB1;
    public m90 YmKjaVtbfp5Z;
    public final h21 arNh8D4Z5gB;
    public mh0 cilMamHF;
    public final p51 encWxUiV2;
    public qh0 iwATDS1i01k;
    public final LinkedHashMap jivtDDk9H;
    public final LinkedHashMap lv06NcmrQ;
    public final fj0 mE4lRynR;
    public final ys0 mOu10nynGul;
    public final LinkedHashMap rQPn8YBR;
    public t90 uFEq9NpZ;
    public Bundle xqGvceK5x;

    public ph0(hi0 hi0Var, j4 j4Var) {
        this.GWasM1elztuh = hi0Var;
        this.Yi7zF1RB1 = j4Var;
        xp xpVar = xp.OOA6hdeuvCS;
        this.AvO7iQsrTN = vc0.EljAMC1QTz(xpVar);
        p51 EljAMC1QTz = vc0.EljAMC1QTz(xpVar);
        this.encWxUiV2 = EljAMC1QTz;
        this.mOu10nynGul = new ys0(EljAMC1QTz);
        this.JFJ3QoxA = new LinkedHashMap();
        this.rQPn8YBR = new LinkedHashMap();
        this.E7jCp8Ls = new LinkedHashMap();
        this.XnEVoBF0td1l = new LinkedHashMap();
        this.WIEu4Ya2g8 = new ArrayList();
        this.YmKjaVtbfp5Z = m90.EljAMC1QTz;
        this.Mjvvu5DE = new lh0(0, this);
        this.mE4lRynR = new fj0();
        this.jivtDDk9H = new LinkedHashMap();
        this.lv06NcmrQ = new LinkedHashMap();
        this.WRKkgoJXwDn = new ArrayList();
        this.arNh8D4Z5gB = rj0.EljAMC1QTz(2);
    }

    public static xh0 OOA6hdeuvCS(int i, xh0 xh0Var, xh0 xh0Var2, boolean z) {
        if (xh0Var.EljAMC1QTz.GWasM1elztuh == i && (xh0Var2 == null || (xh0Var.equals(xh0Var2) && o30.rQPn8YBR(xh0Var.AvO7iQsrTN, xh0Var2.AvO7iQsrTN)))) {
            return xh0Var;
        }
        bi0 bi0Var = xh0Var instanceof bi0 ? (bi0) xh0Var : null;
        if (bi0Var == null) {
            bi0Var = xh0Var.AvO7iQsrTN;
            bi0Var.getClass();
        }
        return bi0Var.JFJ3QoxA.X1lG3V04pd(i, bi0Var, xh0Var2, z);
    }

    public static /* synthetic */ void iwATDS1i01k(ph0 ph0Var, fh0 fh0Var) {
        ph0Var.uFEq9NpZ(fh0Var, false, new v4());
    }

    public final fh0 AvO7iQsrTN() {
        return (fh0) this.EljAMC1QTz.encWxUiV2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0321, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x031f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0331, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021e, code lost:
    
        if (r27.EljAMC1QTz.GWasM1elztuh == r0.EljAMC1QTz.GWasM1elztuh) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x020c, code lost:
    
        if (r10.equals(r0) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0220, code lost:
    
        r0 = new defpackage.v4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x022b, code lost:
    
        if (defpackage.fb1.EXrPz3p7hFb(r26.EljAMC1QTz) < r5) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x022d, code lost:
    
        r9 = r26.EljAMC1QTz;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0236, code lost:
    
        if (r9.isEmpty() != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0238, code lost:
    
        r9 = (defpackage.fh0) r9.remove(r9.size() - 1);
        Mjvvu5DE(r9);
        r17 = new defpackage.fh0(r9.OOA6hdeuvCS, r9.EljAMC1QTz, r9.EljAMC1QTz.GWasM1elztuh(r28), r9.encWxUiV2, r9.mOu10nynGul, r9.JFJ3QoxA, r9.rQPn8YBR);
        r10 = r17.E7jCp8Ls;
        r12 = r9.encWxUiV2;
        r10.getClass();
        r12.getClass();
        r10.xqGvceK5x = r12;
        r10 = r17.E7jCp8Ls;
        r9 = r9.E7jCp8Ls.rQPn8YBR;
        r10.getClass();
        r9.getClass();
        r10.rQPn8YBR = r9;
        r10.Yi7zF1RB1();
        r0.addFirst(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0292, code lost:
    
        defpackage.o4.AvO7iQsrTN("List is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0297, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0298, code lost:
    
        r16 = true;
        r5 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02a2, code lost:
    
        if (r5.hasNext() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02a4, code lost:
    
        r8 = (defpackage.fh0) r5.next();
        r9 = r8.EljAMC1QTz.AvO7iQsrTN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02ae, code lost:
    
        if (r9 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02b0, code lost:
    
        rQPn8YBR(r8, EljAMC1QTz(r9.EljAMC1QTz.GWasM1elztuh));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02bb, code lost:
    
        r26.EljAMC1QTz.addLast(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02c1, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02c9, code lost:
    
        if (r0.hasNext() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02cb, code lost:
    
        r5 = (defpackage.fh0) r0.next();
        r8 = r26.mE4lRynR.Yi7zF1RB1(r5.EljAMC1QTz.OOA6hdeuvCS);
        r9 = r5.EljAMC1QTz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02dd, code lost:
    
        if (r9 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02e0, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e1, code lost:
    
        if (r9 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02e4, code lost:
    
        r8.X1lG3V04pd(r9);
        r8 = r8.Yi7zF1RB1();
        r9 = r8.GWasM1elztuh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02ed, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ee, code lost:
    
        r10 = defpackage.rb.sb9fmtV8A((java.util.Collection) r8.OOA6hdeuvCS.OOA6hdeuvCS.getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0308, code lost:
    
        if (r11.hasPrevious() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0318, code lost:
    
        if (defpackage.o30.rQPn8YBR(((defpackage.fh0) r11.previous()).JFJ3QoxA, r5.JFJ3QoxA) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031a, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0322, code lost:
    
        r10.set(r11, r5);
        r5 = r8.Yi7zF1RB1;
        r5.getClass();
        r5.JFJ3QoxA(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x032e, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010f A[LOOP:8: B:122:0x004f->B:131:0x010f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0115 A[EDGE_INSN: B:132:0x0115->B:133:0x0115 BREAK  A[LOOP:8: B:122:0x004f->B:131:0x010f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0377 A[LOOP:1: B:22:0x0371->B:24:0x0377, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E7jCp8Ls(xh0 xh0Var, Bundle bundle, si0 si0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        ListIterator listIterator;
        int i;
        Iterator it;
        boolean XnEVoBF0td1l;
        Object obj;
        ListIterator listIterator2;
        Bundle bundle2;
        Object obj2;
        boolean z4;
        xh0Var.getClass();
        Iterator it2 = this.jivtDDk9H.values().iterator();
        while (it2.hasNext()) {
            ((kh0) it2.next()).xqGvceK5x = true;
        }
        nt0 nt0Var = new nt0();
        if (si0Var != null) {
            String str = si0Var.encWxUiV2;
            if (str != null) {
                boolean z5 = si0Var.xqGvceK5x;
                boolean z6 = si0Var.OOA6hdeuvCS;
                str.getClass();
                v4 v4Var = this.EljAMC1QTz;
                if (!v4Var.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator3 = v4Var.listIterator(v4Var.GWasM1elztuh());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator3.previous();
                        fh0 fh0Var = (fh0) obj;
                        xh0 xh0Var2 = fh0Var.EljAMC1QTz;
                        Bundle GWasM1elztuh = fh0Var.E7jCp8Ls.GWasM1elztuh();
                        xh0Var2.getClass();
                        ai0 ai0Var = xh0Var2.EljAMC1QTz;
                        ai0Var.getClass();
                        if (!o30.rQPn8YBR((String) ai0Var.OOA6hdeuvCS, str)) {
                            wh0 GWasM1elztuh2 = ai0Var.GWasM1elztuh(str);
                            if (((xh0) ai0Var.Yi7zF1RB1).equals(GWasM1elztuh2 != null ? GWasM1elztuh2.OOA6hdeuvCS : null)) {
                                Bundle bundle3 = GWasM1elztuh2.EljAMC1QTz;
                                if (GWasM1elztuh != null && bundle3 != null) {
                                    Set<String> keySet = bundle3.keySet();
                                    keySet.getClass();
                                    for (String str2 : keySet) {
                                        str2.getClass();
                                        if (GWasM1elztuh.containsKey(str2)) {
                                            listIterator2 = listIterator3;
                                            eh0 eh0Var = (eh0) GWasM1elztuh2.OOA6hdeuvCS.Yi7zF1RB1().get(str2);
                                            ui0 ui0Var = eh0Var != null ? eh0Var.GWasM1elztuh : null;
                                            if (ui0Var != null) {
                                                bundle2 = bundle3;
                                                obj2 = ui0Var.GWasM1elztuh(bundle3, str2);
                                            } else {
                                                bundle2 = bundle3;
                                                obj2 = null;
                                            }
                                            Object GWasM1elztuh3 = ui0Var != null ? ui0Var.GWasM1elztuh(GWasM1elztuh, str2) : null;
                                            if (ui0Var != null && !ui0Var.EljAMC1QTz(obj2, GWasM1elztuh3)) {
                                                z4 = false;
                                                break;
                                            } else {
                                                listIterator3 = listIterator2;
                                                bundle3 = bundle2;
                                            }
                                        }
                                    }
                                }
                            }
                            listIterator2 = listIterator3;
                            z4 = false;
                            if (!z5 || !z4) {
                                arrayList.add(this.mE4lRynR.Yi7zF1RB1(fh0Var.EljAMC1QTz.OOA6hdeuvCS));
                            }
                            if (!z4) {
                                break;
                            } else {
                                listIterator3 = listIterator2;
                            }
                        }
                        listIterator2 = listIterator3;
                        z4 = true;
                        if (!z5) {
                        }
                        arrayList.add(this.mE4lRynR.Yi7zF1RB1(fh0Var.EljAMC1QTz.OOA6hdeuvCS));
                        if (!z4) {
                        }
                    }
                    fh0 fh0Var2 = (fh0) obj;
                    xh0 xh0Var3 = fh0Var2 != null ? fh0Var2.EljAMC1QTz : null;
                    if (xh0Var3 == null) {
                        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
                    } else {
                        XnEVoBF0td1l = X1lG3V04pd(arrayList, xh0Var3, z5, z6);
                    }
                }
                XnEVoBF0td1l = false;
            } else {
                int i2 = si0Var.X1lG3V04pd;
                if (i2 != -1) {
                    XnEVoBF0td1l = XnEVoBF0td1l(i2, si0Var.xqGvceK5x, si0Var.OOA6hdeuvCS);
                }
            }
            z = XnEVoBF0td1l;
            Bundle GWasM1elztuh4 = xh0Var.GWasM1elztuh(bundle);
            if (si0Var == null && si0Var.Yi7zF1RB1 && this.E7jCp8Ls.containsKey(Integer.valueOf(xh0Var.EljAMC1QTz.GWasM1elztuh))) {
                nt0Var.OOA6hdeuvCS = YmKjaVtbfp5Z(xh0Var.EljAMC1QTz.GWasM1elztuh, GWasM1elztuh4, si0Var);
                z3 = false;
            } else {
                if (si0Var != null && si0Var.GWasM1elztuh) {
                    fh0 AvO7iQsrTN = AvO7iQsrTN();
                    v4 v4Var2 = this.EljAMC1QTz;
                    listIterator = v4Var2.listIterator(v4Var2.GWasM1elztuh());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            if (((fh0) listIterator.previous()).EljAMC1QTz == xh0Var) {
                                i = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i != -1) {
                        if (xh0Var instanceof bi0) {
                            int i3 = bi0.rQPn8YBR;
                            List ozMwhSAI = x01.ozMwhSAI(new r71(x01.EXrPz3p7hFb((bi0) xh0Var, new oh0(3)), new oh0(0), 1));
                            if (this.EljAMC1QTz.AvO7iQsrTN - i == ozMwhSAI.size()) {
                                v4 v4Var3 = this.EljAMC1QTz;
                                List subList = v4Var3.subList(i, v4Var3.AvO7iQsrTN);
                                ArrayList arrayList2 = new ArrayList(sb.dcDmLGVhzWm(subList, 10));
                                Iterator it3 = subList.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(Integer.valueOf(((fh0) it3.next()).EljAMC1QTz.EljAMC1QTz.GWasM1elztuh));
                                }
                            }
                        } else if (AvO7iQsrTN != null) {
                            xh0 xh0Var4 = AvO7iQsrTN.EljAMC1QTz;
                            if (xh0Var4 != null) {
                            }
                        }
                        if (!z2) {
                            fh0 rQPn8YBR = vt.rQPn8YBR(this.GWasM1elztuh.X1lG3V04pd, xh0Var, GWasM1elztuh4, mOu10nynGul(), this.iwATDS1i01k);
                            ej0 Yi7zF1RB1 = this.mE4lRynR.Yi7zF1RB1(xh0Var.OOA6hdeuvCS);
                            List HFYAaqMd6 = fb1.HFYAaqMd6(rQPn8YBR);
                            this.Y6hRI1cF8 = new dk(nt0Var, this, xh0Var, GWasM1elztuh4, 5);
                            Yi7zF1RB1.xqGvceK5x(HFYAaqMd6, si0Var);
                            this.Y6hRI1cF8 = null;
                        }
                        z3 = z2;
                    }
                }
                z2 = false;
                if (!z2) {
                }
                z3 = z2;
            }
            this.Yi7zF1RB1.GWasM1elztuh();
            it = this.jivtDDk9H.values().iterator();
            while (it.hasNext()) {
                ((kh0) it.next()).xqGvceK5x = false;
            }
            if (z && !nt0Var.OOA6hdeuvCS && !z3) {
                mE4lRynR();
                return;
            }
            Yi7zF1RB1();
        }
        z = false;
        Bundle GWasM1elztuh42 = xh0Var.GWasM1elztuh(bundle);
        if (si0Var == null) {
        }
        if (si0Var != null) {
            fh0 AvO7iQsrTN2 = AvO7iQsrTN();
            v4 v4Var22 = this.EljAMC1QTz;
            listIterator = v4Var22.listIterator(v4Var22.GWasM1elztuh());
            while (true) {
                if (!listIterator.hasPrevious()) {
                }
            }
            if (i != -1) {
            }
        }
        z2 = false;
        if (!z2) {
        }
        z3 = z2;
        this.Yi7zF1RB1.GWasM1elztuh();
        it = this.jivtDDk9H.values().iterator();
        while (it.hasNext()) {
        }
        if (z) {
        }
        Yi7zF1RB1();
    }

    public final fh0 EljAMC1QTz(int i) {
        Object obj;
        v4 v4Var = this.EljAMC1QTz;
        ListIterator<E> listIterator = v4Var.listIterator(v4Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((fh0) obj).EljAMC1QTz.EljAMC1QTz.GWasM1elztuh == i) {
                break;
            }
        }
        fh0 fh0Var = (fh0) obj;
        if (fh0Var != null) {
            return fh0Var;
        }
        StringBuilder rQPn8YBR = mr0.rQPn8YBR("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        rQPn8YBR.append(encWxUiV2());
        throw new IllegalArgumentException(rQPn8YBR.toString().toString());
    }

    public final void GWasM1elztuh(xh0 xh0Var, Bundle bundle, fh0 fh0Var, List list) {
        Object obj;
        Object obj2;
        kp kpVar = this.GWasM1elztuh.X1lG3V04pd;
        xh0 xh0Var2 = fh0Var.EljAMC1QTz;
        boolean z = xh0Var2 instanceof zl;
        v4 v4Var = this.EljAMC1QTz;
        if (!z) {
            while (!v4Var.isEmpty() && (((fh0) v4Var.last()).EljAMC1QTz instanceof zl) && XnEVoBF0td1l(((fh0) v4Var.last()).EljAMC1QTz.EljAMC1QTz.GWasM1elztuh, true, false)) {
            }
        }
        v4 v4Var2 = new v4();
        Object obj3 = null;
        if (xh0Var instanceof bi0) {
            xh0 xh0Var3 = xh0Var2;
            do {
                xh0Var3.getClass();
                xh0Var3 = xh0Var3.AvO7iQsrTN;
                if (xh0Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = listIterator.previous();
                            if (o30.rQPn8YBR(((fh0) obj2).EljAMC1QTz, xh0Var3)) {
                                break;
                            }
                        }
                    }
                    fh0 fh0Var2 = (fh0) obj2;
                    if (fh0Var2 == null) {
                        fh0Var2 = vt.rQPn8YBR(kpVar, xh0Var3, bundle, mOu10nynGul(), this.iwATDS1i01k);
                    }
                    v4Var2.addFirst(fh0Var2);
                    if (!v4Var.isEmpty() && ((fh0) v4Var.last()).EljAMC1QTz == xh0Var3) {
                        iwATDS1i01k(this, (fh0) v4Var.last());
                    }
                }
                if (xh0Var3 == null) {
                    break;
                }
            } while (xh0Var3 != xh0Var);
        }
        xh0 xh0Var4 = v4Var2.isEmpty() ? xh0Var2 : ((fh0) v4Var2.first()).EljAMC1QTz;
        while (xh0Var4 != null && xqGvceK5x(xh0Var4.EljAMC1QTz.GWasM1elztuh, xh0Var4) != xh0Var4) {
            xh0Var4 = xh0Var4.AvO7iQsrTN;
            if (xh0Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator2.previous();
                        if (o30.rQPn8YBR(((fh0) obj).EljAMC1QTz, xh0Var4)) {
                            break;
                        }
                    }
                }
                fh0 fh0Var3 = (fh0) obj;
                if (fh0Var3 == null) {
                    fh0Var3 = vt.rQPn8YBR(kpVar, xh0Var4, xh0Var4.GWasM1elztuh(bundle2), mOu10nynGul(), this.iwATDS1i01k);
                }
                v4Var2.addFirst(fh0Var3);
            }
        }
        if (!v4Var2.isEmpty()) {
            xh0Var2 = ((fh0) v4Var2.first()).EljAMC1QTz;
        }
        while (!v4Var.isEmpty() && (((fh0) v4Var.last()).EljAMC1QTz instanceof bi0)) {
            xh0 xh0Var5 = ((fh0) v4Var.last()).EljAMC1QTz;
            xh0Var5.getClass();
            if (((bi0) xh0Var5).JFJ3QoxA.Yi7zF1RB1.Yi7zF1RB1(xh0Var2.EljAMC1QTz.GWasM1elztuh) != null) {
                break;
            } else {
                iwATDS1i01k(this, (fh0) v4Var.last());
            }
        }
        fh0 fh0Var4 = (fh0) v4Var.EljAMC1QTz();
        if (fh0Var4 == null) {
            fh0Var4 = (fh0) v4Var2.EljAMC1QTz();
        }
        if (!o30.rQPn8YBR(fh0Var4 != null ? fh0Var4.EljAMC1QTz : null, this.X1lG3V04pd)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                xh0 xh0Var6 = ((fh0) previous).EljAMC1QTz;
                bi0 bi0Var = this.X1lG3V04pd;
                bi0Var.getClass();
                if (o30.rQPn8YBR(xh0Var6, bi0Var)) {
                    obj3 = previous;
                    break;
                }
            }
            fh0 fh0Var5 = (fh0) obj3;
            if (fh0Var5 == null) {
                bi0 bi0Var2 = this.X1lG3V04pd;
                bi0Var2.getClass();
                bi0 bi0Var3 = this.X1lG3V04pd;
                bi0Var3.getClass();
                fh0Var5 = vt.rQPn8YBR(kpVar, bi0Var2, bi0Var3.GWasM1elztuh(bundle), mOu10nynGul(), this.iwATDS1i01k);
            }
            v4Var2.addFirst(fh0Var5);
        }
        Iterator it = v4Var2.iterator();
        while (it.hasNext()) {
            fh0 fh0Var6 = (fh0) it.next();
            Object obj4 = this.jivtDDk9H.get(this.mE4lRynR.Yi7zF1RB1(fh0Var6.EljAMC1QTz.OOA6hdeuvCS));
            if (obj4 == null) {
                o4.encWxUiV2("NavigatorBackStack for ", xh0Var.OOA6hdeuvCS, " should already be created");
                return;
            }
            ((kh0) obj4).GWasM1elztuh(fh0Var6);
        }
        v4Var.addAll(v4Var2);
        v4Var.addLast(fh0Var);
        ArrayList gHe2tSmr6w = rb.gHe2tSmr6w(v4Var2, fh0Var);
        int size = gHe2tSmr6w.size();
        int i = 0;
        while (i < size) {
            Object obj5 = gHe2tSmr6w.get(i);
            i++;
            fh0 fh0Var7 = (fh0) obj5;
            bi0 bi0Var4 = fh0Var7.EljAMC1QTz.AvO7iQsrTN;
            if (bi0Var4 != null) {
                rQPn8YBR(fh0Var7, EljAMC1QTz(bi0Var4.EljAMC1QTz.GWasM1elztuh));
            }
        }
    }

    public final bi0 JFJ3QoxA() {
        xh0 xh0Var;
        fh0 fh0Var = (fh0) this.EljAMC1QTz.encWxUiV2();
        if (fh0Var == null || (xh0Var = fh0Var.EljAMC1QTz) == null) {
            xh0Var = this.X1lG3V04pd;
            xh0Var.getClass();
        }
        bi0 bi0Var = xh0Var instanceof bi0 ? (bi0) xh0Var : null;
        if (bi0Var != null) {
            return bi0Var;
        }
        bi0 bi0Var2 = xh0Var.AvO7iQsrTN;
        bi0Var2.getClass();
        return bi0Var2;
    }

    public final void Mjvvu5DE(fh0 fh0Var) {
        fh0Var.getClass();
        fh0 fh0Var2 = (fh0) this.JFJ3QoxA.remove(fh0Var);
        if (fh0Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.rQPn8YBR;
        h5 h5Var = (h5) linkedHashMap.get(fh0Var2);
        Integer valueOf = h5Var != null ? Integer.valueOf(h5Var.GWasM1elztuh.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            kh0 kh0Var = (kh0) this.jivtDDk9H.get(this.mE4lRynR.Yi7zF1RB1(fh0Var2.EljAMC1QTz.OOA6hdeuvCS));
            if (kh0Var != null) {
                kh0Var.X1lG3V04pd(fh0Var2);
            }
            linkedHashMap.remove(fh0Var2);
        }
    }

    public final ArrayList WIEu4Ya2g8() {
        m90 m90Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.jivtDDk9H.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            m90Var = m90.encWxUiV2;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((kh0) it.next()).EljAMC1QTz.OOA6hdeuvCS.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                fh0 fh0Var = (fh0) obj;
                if (!arrayList.contains(fh0Var) && fh0Var.E7jCp8Ls.rQPn8YBR.compareTo(m90Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            wb.nXl1EmE5(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.EljAMC1QTz.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            fh0 fh0Var2 = (fh0) next;
            if (!arrayList.contains(fh0Var2) && fh0Var2.E7jCp8Ls.rQPn8YBR.compareTo(m90Var) >= 0) {
                arrayList3.add(next);
            }
        }
        wb.nXl1EmE5(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((fh0) obj2).EljAMC1QTz instanceof bi0)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean X1lG3V04pd(ArrayList arrayList, xh0 xh0Var, boolean z, boolean z2) {
        boolean z3;
        nt0 nt0Var = new nt0();
        v4 v4Var = new v4();
        int size = arrayList.size();
        final int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z3 = z2;
                break;
            }
            int i3 = i2 + 1;
            ej0 ej0Var = (ej0) arrayList.get(i2);
            nt0 nt0Var2 = new nt0();
            fh0 fh0Var = (fh0) this.EljAMC1QTz.last();
            z3 = z2;
            mh0 mh0Var = new mh0(nt0Var2, nt0Var, this, z3, v4Var);
            ej0Var.getClass();
            fh0Var.getClass();
            this.cilMamHF = mh0Var;
            ej0Var.OOA6hdeuvCS(fh0Var, z3);
            this.cilMamHF = null;
            if (!nt0Var2.OOA6hdeuvCS) {
                break;
            }
            i2 = i3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.E7jCp8Ls;
            if (!z) {
                vr vrVar = new vr(new r71(x01.EXrPz3p7hFb(xh0Var, new bCsSzSHkbaQ(28)), new hv(this) { // from class: nh0
                    public final /* synthetic */ ph0 EljAMC1QTz;

                    {
                        this.EljAMC1QTz = this;
                    }

                    @Override // defpackage.hv
                    public final Object mOu10nynGul(Object obj) {
                        boolean containsKey;
                        int i4 = i;
                        ph0 ph0Var = this.EljAMC1QTz;
                        xh0 xh0Var2 = (xh0) obj;
                        switch (i4) {
                            case 0:
                                xh0Var2.getClass();
                                containsKey = ph0Var.E7jCp8Ls.containsKey(Integer.valueOf(xh0Var2.EljAMC1QTz.GWasM1elztuh));
                                break;
                            default:
                                xh0Var2.getClass();
                                containsKey = ph0Var.E7jCp8Ls.containsKey(Integer.valueOf(xh0Var2.EljAMC1QTz.GWasM1elztuh));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (vrVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((xh0) vrVar.next()).EljAMC1QTz.GWasM1elztuh);
                    ih0 ih0Var = (ih0) v4Var.EljAMC1QTz();
                    linkedHashMap.put(valueOf, ih0Var != null ? (String) ih0Var.GWasM1elztuh.Yi7zF1RB1 : null);
                }
            }
            if (!v4Var.isEmpty()) {
                a1 a1Var = ((ih0) v4Var.first()).GWasM1elztuh;
                final int i4 = 1;
                vr vrVar2 = new vr(new r71(x01.EXrPz3p7hFb(xqGvceK5x(a1Var.GWasM1elztuh, null), new bCsSzSHkbaQ(29)), new hv(this) { // from class: nh0
                    public final /* synthetic */ ph0 EljAMC1QTz;

                    {
                        this.EljAMC1QTz = this;
                    }

                    @Override // defpackage.hv
                    public final Object mOu10nynGul(Object obj) {
                        boolean containsKey;
                        int i42 = i4;
                        ph0 ph0Var = this.EljAMC1QTz;
                        xh0 xh0Var2 = (xh0) obj;
                        switch (i42) {
                            case 0:
                                xh0Var2.getClass();
                                containsKey = ph0Var.E7jCp8Ls.containsKey(Integer.valueOf(xh0Var2.EljAMC1QTz.GWasM1elztuh));
                                break;
                            default:
                                xh0Var2.getClass();
                                containsKey = ph0Var.E7jCp8Ls.containsKey(Integer.valueOf(xh0Var2.EljAMC1QTz.GWasM1elztuh));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (vrVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((xh0) vrVar2.next()).EljAMC1QTz.GWasM1elztuh), (String) a1Var.Yi7zF1RB1);
                }
                if (linkedHashMap.values().contains((String) a1Var.Yi7zF1RB1)) {
                    this.XnEVoBF0td1l.put((String) a1Var.Yi7zF1RB1, v4Var);
                }
            }
        }
        this.Yi7zF1RB1.GWasM1elztuh();
        return nt0Var.OOA6hdeuvCS;
    }

    public final boolean XnEVoBF0td1l(int i, boolean z, boolean z2) {
        xh0 xh0Var;
        v4 v4Var = this.EljAMC1QTz;
        if (v4Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = rb.kbVzROOfKK(v4Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                xh0Var = null;
                break;
            }
            xh0Var = ((fh0) it.next()).EljAMC1QTz;
            String str = xh0Var.OOA6hdeuvCS;
            ai0 ai0Var = xh0Var.EljAMC1QTz;
            ej0 Yi7zF1RB1 = this.mE4lRynR.Yi7zF1RB1(str);
            if (z || ai0Var.GWasM1elztuh != i) {
                arrayList.add(Yi7zF1RB1);
            }
            if (ai0Var.GWasM1elztuh == i) {
                break;
            }
        }
        if (xh0Var != null) {
            return X1lG3V04pd(arrayList, xh0Var, z, z2);
        }
        int i2 = xh0.mOu10nynGul;
        Log.i("NavController", "Ignoring popBackStack to destination " + o50.YmKjaVtbfp5Z(this.GWasM1elztuh.X1lG3V04pd, i) + " as it was not found on the current back stack");
        return false;
    }

    public final boolean Yi7zF1RB1() {
        v4 v4Var;
        while (true) {
            v4Var = this.EljAMC1QTz;
            if (v4Var.isEmpty() || !(((fh0) v4Var.last()).EljAMC1QTz instanceof bi0)) {
                break;
            }
            iwATDS1i01k(this, (fh0) v4Var.last());
        }
        fh0 fh0Var = (fh0) v4Var.encWxUiV2();
        ArrayList arrayList = this.WRKkgoJXwDn;
        if (fh0Var != null) {
            arrayList.add(fh0Var);
        }
        this.WdrkLMV3xh++;
        mE4lRynR();
        int i = this.WdrkLMV3xh - 1;
        this.WdrkLMV3xh = i;
        if (i == 0) {
            ArrayList sb9fmtV8A = rb.sb9fmtV8A(arrayList);
            arrayList.clear();
            int size = sb9fmtV8A.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = sb9fmtV8A.get(i2);
                i2++;
                fh0 fh0Var2 = (fh0) obj;
                Iterator it = rb.gqMuANyCes(this.WIEu4Ya2g8).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        o4.YmKjaVtbfp5Z();
                        return false;
                    }
                    xh0 xh0Var = fh0Var2.EljAMC1QTz;
                    fh0Var2.E7jCp8Ls.GWasM1elztuh();
                    throw null;
                }
                this.arNh8D4Z5gB.WIEu4Ya2g8(fh0Var2);
            }
            ArrayList arrayList2 = new ArrayList(v4Var);
            p51 p51Var = this.AvO7iQsrTN;
            p51Var.getClass();
            p51Var.JFJ3QoxA(null, arrayList2);
            ArrayList WIEu4Ya2g8 = WIEu4Ya2g8();
            p51 p51Var2 = this.encWxUiV2;
            p51Var2.getClass();
            p51Var2.JFJ3QoxA(null, WIEu4Ya2g8);
        }
        return fh0Var != null;
    }

    public final boolean YmKjaVtbfp5Z(int i, Bundle bundle, si0 si0Var) {
        xh0 xh0Var;
        fh0 fh0Var;
        xh0 xh0Var2;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.E7jCp8Ls;
        int i2 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (o30.rQPn8YBR((String) it.next(), str)) {
                it.remove();
            }
        }
        v4 v4Var = (v4) fb1.rQPn8YBR(this.XnEVoBF0td1l).remove(str);
        kp kpVar = this.GWasM1elztuh.X1lG3V04pd;
        ArrayList arrayList = new ArrayList();
        fh0 fh0Var2 = (fh0) this.EljAMC1QTz.encWxUiV2();
        if ((fh0Var2 == null || (xh0Var = fh0Var2.EljAMC1QTz) == null) && (xh0Var = this.X1lG3V04pd) == null) {
            o4.jivtDDk9H("You must call setGraph() before calling getGraph()");
            return false;
        }
        if (v4Var != null) {
            Iterator it2 = v4Var.iterator();
            while (it2.hasNext()) {
                ih0 ih0Var = (ih0) it2.next();
                a1 a1Var = ih0Var.GWasM1elztuh;
                a1 a1Var2 = ih0Var.GWasM1elztuh;
                xh0 OOA6hdeuvCS = OOA6hdeuvCS(a1Var.GWasM1elztuh, xh0Var, null, true);
                if (OOA6hdeuvCS == null) {
                    int i3 = xh0.mOu10nynGul;
                    o4.WIEu4Ya2g8("Restore State failed: destination ", o50.YmKjaVtbfp5Z(kpVar, a1Var2.GWasM1elztuh), " cannot be found from the current destination ", xh0Var);
                    return false;
                }
                m90 mOu10nynGul = mOu10nynGul();
                qh0 qh0Var = this.iwATDS1i01k;
                kpVar.getClass();
                mOu10nynGul.getClass();
                Bundle bundle3 = (Bundle) a1Var2.X1lG3V04pd;
                if (bundle3 != null) {
                    Context context = kpVar.GWasM1elztuh;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) a1Var2.Yi7zF1RB1;
                Bundle bundle4 = (Bundle) a1Var2.xqGvceK5x;
                str2.getClass();
                arrayList.add(new fh0(kpVar, OOA6hdeuvCS, bundle2, mOu10nynGul, qh0Var, str2, bundle4));
                xh0Var = OOA6hdeuvCS;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((fh0) obj).EljAMC1QTz instanceof bi0)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            fh0 fh0Var3 = (fh0) obj2;
            List list = (List) rb.cTIXpaxc(arrayList2);
            if (o30.rQPn8YBR((list == null || (fh0Var = (fh0) rb.vaTCmWUgXF(list)) == null || (xh0Var2 = fh0Var.EljAMC1QTz) == null) ? null : xh0Var2.OOA6hdeuvCS, fh0Var3.EljAMC1QTz.OOA6hdeuvCS)) {
                list.add(fh0Var3);
            } else {
                arrayList2.add(fb1.TpUsjqg3bxO(fh0Var3));
            }
        }
        nt0 nt0Var = new nt0();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            ej0 Yi7zF1RB1 = this.mE4lRynR.Yi7zF1RB1(((fh0) rb.jed7WnvkLvFq(list2)).EljAMC1QTz.OOA6hdeuvCS);
            ArrayList arrayList4 = arrayList;
            this.Y6hRI1cF8 = new bf0(nt0Var, arrayList4, new pt0(), this, bundle);
            Yi7zF1RB1.xqGvceK5x(list2, si0Var);
            this.Y6hRI1cF8 = null;
            arrayList = arrayList4;
        }
        return nt0Var.OOA6hdeuvCS;
    }

    public final xh0 encWxUiV2() {
        fh0 AvO7iQsrTN = AvO7iQsrTN();
        if (AvO7iQsrTN != null) {
            return AvO7iQsrTN.EljAMC1QTz;
        }
        return null;
    }

    public final void mE4lRynR() {
        h5 h5Var;
        ys0 ys0Var;
        Set set;
        ArrayList sb9fmtV8A = rb.sb9fmtV8A(this.EljAMC1QTz);
        if (sb9fmtV8A.isEmpty()) {
            return;
        }
        ArrayList TpUsjqg3bxO = fb1.TpUsjqg3bxO(((fh0) rb.vaTCmWUgXF(sb9fmtV8A)).EljAMC1QTz);
        ArrayList arrayList = new ArrayList();
        if (rb.vaTCmWUgXF(TpUsjqg3bxO) instanceof zl) {
            Iterator it = rb.kbVzROOfKK(sb9fmtV8A).iterator();
            while (it.hasNext()) {
                xh0 xh0Var = ((fh0) it.next()).EljAMC1QTz;
                arrayList.add(xh0Var);
                if (!(xh0Var instanceof zl) && !(xh0Var instanceof bi0)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (fh0 fh0Var : rb.kbVzROOfKK(sb9fmtV8A)) {
            m90 m90Var = fh0Var.E7jCp8Ls.rQPn8YBR;
            xh0 xh0Var2 = fh0Var.EljAMC1QTz;
            xh0 xh0Var3 = (xh0) rb.YTyqgZhdF(TpUsjqg3bxO);
            m90 m90Var2 = m90.mOu10nynGul;
            m90 m90Var3 = m90.encWxUiV2;
            if (xh0Var3 != null && xh0Var3.EljAMC1QTz.GWasM1elztuh == xh0Var2.EljAMC1QTz.GWasM1elztuh) {
                if (m90Var != m90Var2) {
                    kh0 kh0Var = (kh0) this.jivtDDk9H.get(this.mE4lRynR.Yi7zF1RB1(fh0Var.EljAMC1QTz.OOA6hdeuvCS));
                    if (o30.rQPn8YBR((kh0Var == null || (ys0Var = kh0Var.EljAMC1QTz) == null || (set = (Set) ys0Var.OOA6hdeuvCS.getValue()) == null) ? null : Boolean.valueOf(set.contains(fh0Var)), Boolean.TRUE) || ((h5Var = (h5) this.rQPn8YBR.get(fh0Var)) != null && h5Var.GWasM1elztuh.get() == 0)) {
                        hashMap.put(fh0Var, m90Var3);
                    } else {
                        hashMap.put(fh0Var, m90Var2);
                    }
                }
                xh0 xh0Var4 = (xh0) rb.YTyqgZhdF(arrayList);
                if (xh0Var4 != null && xh0Var4.EljAMC1QTz.GWasM1elztuh == xh0Var2.EljAMC1QTz.GWasM1elztuh) {
                    wb.K0ReC6MK(arrayList);
                }
                wb.K0ReC6MK(TpUsjqg3bxO);
                bi0 bi0Var = xh0Var2.AvO7iQsrTN;
                if (bi0Var != null) {
                    TpUsjqg3bxO.add(bi0Var);
                }
            } else if (arrayList.isEmpty() || xh0Var2.EljAMC1QTz.GWasM1elztuh != ((xh0) rb.jed7WnvkLvFq(arrayList)).EljAMC1QTz.GWasM1elztuh) {
                fh0Var.GWasM1elztuh(m90.AvO7iQsrTN);
            } else {
                xh0 xh0Var5 = (xh0) wb.K0ReC6MK(arrayList);
                if (m90Var == m90Var2) {
                    fh0Var.GWasM1elztuh(m90Var3);
                } else if (m90Var != m90Var3) {
                    hashMap.put(fh0Var, m90Var3);
                }
                bi0 bi0Var2 = xh0Var5.AvO7iQsrTN;
                if (bi0Var2 != null && !arrayList.contains(bi0Var2)) {
                    arrayList.add(bi0Var2);
                }
            }
        }
        int size = sb9fmtV8A.size();
        int i = 0;
        while (i < size) {
            Object obj = sb9fmtV8A.get(i);
            i++;
            fh0 fh0Var2 = (fh0) obj;
            m90 m90Var4 = (m90) hashMap.get(fh0Var2);
            if (m90Var4 != null) {
                fh0Var2.GWasM1elztuh(m90Var4);
            } else {
                fh0Var2.E7jCp8Ls.Yi7zF1RB1();
            }
        }
    }

    public final m90 mOu10nynGul() {
        return this.uFEq9NpZ == null ? m90.AvO7iQsrTN : this.YmKjaVtbfp5Z;
    }

    public final void rQPn8YBR(fh0 fh0Var, fh0 fh0Var2) {
        this.JFJ3QoxA.put(fh0Var, fh0Var2);
        LinkedHashMap linkedHashMap = this.rQPn8YBR;
        if (linkedHashMap.get(fh0Var2) == null) {
            linkedHashMap.put(fh0Var2, new h5());
        }
        Object obj = linkedHashMap.get(fh0Var2);
        obj.getClass();
        ((h5) obj).GWasM1elztuh.incrementAndGet();
    }

    public final void uFEq9NpZ(fh0 fh0Var, boolean z, v4 v4Var) {
        qh0 qh0Var;
        ys0 ys0Var;
        Set set;
        fh0Var.getClass();
        v4 v4Var2 = this.EljAMC1QTz;
        fh0 fh0Var2 = (fh0) v4Var2.last();
        if (!o30.rQPn8YBR(fh0Var2, fh0Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(fh0Var.EljAMC1QTz);
            xh0 xh0Var = fh0Var2.EljAMC1QTz;
            sb.append(", which is not the top of the back stack (");
            sb.append(xh0Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        if (v4Var2.isEmpty()) {
            o4.AvO7iQsrTN("List is empty.");
            return;
        }
        boolean z2 = true;
        v4Var2.remove(v4Var2.size() - 1);
        kh0 kh0Var = (kh0) this.jivtDDk9H.get(this.mE4lRynR.Yi7zF1RB1(fh0Var2.EljAMC1QTz.OOA6hdeuvCS));
        if ((kh0Var == null || (ys0Var = kh0Var.EljAMC1QTz) == null || (set = (Set) ys0Var.OOA6hdeuvCS.getValue()) == null || !set.contains(fh0Var2)) && !this.rQPn8YBR.containsKey(fh0Var2)) {
            z2 = false;
        }
        m90 m90Var = fh0Var2.E7jCp8Ls.JFJ3QoxA.encWxUiV2;
        m90 m90Var2 = m90.AvO7iQsrTN;
        if (m90Var.compareTo(m90Var2) >= 0) {
            if (z) {
                fh0Var2.GWasM1elztuh(m90Var2);
                v4Var.addFirst(new ih0(fh0Var2));
            }
            if (z2) {
                fh0Var2.GWasM1elztuh(m90Var2);
            } else {
                fh0Var2.GWasM1elztuh(m90.OOA6hdeuvCS);
                Mjvvu5DE(fh0Var2);
            }
        }
        if (z || z2 || (qh0Var = this.iwATDS1i01k) == null) {
            return;
        }
        String str = fh0Var2.JFJ3QoxA;
        str.getClass();
        ef1 ef1Var = (ef1) qh0Var.Yi7zF1RB1.remove(str);
        if (ef1Var != null) {
            ef1Var.GWasM1elztuh();
        }
    }

    public final xh0 xqGvceK5x(int i, xh0 xh0Var) {
        xh0 xh0Var2;
        bi0 bi0Var = this.X1lG3V04pd;
        if (bi0Var == null) {
            return null;
        }
        if (bi0Var.EljAMC1QTz.GWasM1elztuh == i) {
            if (xh0Var == null) {
                return bi0Var;
            }
            if (o30.rQPn8YBR(bi0Var, xh0Var) && xh0Var.AvO7iQsrTN == null) {
                return this.X1lG3V04pd;
            }
        }
        fh0 fh0Var = (fh0) this.EljAMC1QTz.encWxUiV2();
        if (fh0Var == null || (xh0Var2 = fh0Var.EljAMC1QTz) == null) {
            xh0Var2 = this.X1lG3V04pd;
            xh0Var2.getClass();
        }
        return OOA6hdeuvCS(i, xh0Var2, xh0Var, false);
    }
}
