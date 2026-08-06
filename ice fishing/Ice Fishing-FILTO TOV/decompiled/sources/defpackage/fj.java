package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class fj implements gi {
    public f51 EljAMC1QTz;
    public final mr GWasM1elztuh;
    public final m71 JFJ3QoxA;
    public int OOA6hdeuvCS;
    public final si X1lG3V04pd;
    public final ph Yi7zF1RB1;
    public final rx0 encWxUiV2;
    public final m71 mOu10nynGul;
    public final rx0 rQPn8YBR;
    public final bh0 xqGvceK5x = new bh0();
    public final j6IIN2O8eOU AvO7iQsrTN = new j6IIN2O8eOU(8);

    public fj(mr mrVar, List list, vt vtVar, ph phVar) {
        this.GWasM1elztuh = mrVar;
        this.Yi7zF1RB1 = phVar;
        vg vgVar = null;
        this.X1lG3V04pd = new si(2, new EljAMC1QTz(this, vgVar, 5));
        rx0 rx0Var = new rx0();
        rx0Var.encWxUiV2 = this;
        rx0Var.OOA6hdeuvCS = new bh0();
        rx0Var.EljAMC1QTz = o30.X1lG3V04pd();
        rx0Var.AvO7iQsrTN = rb.gqMuANyCes(list);
        this.encWxUiV2 = rx0Var;
        final int i = 0;
        this.mOu10nynGul = new m71(new wu(this) { // from class: hi
            public final /* synthetic */ fj EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                int i2 = i;
                fj fjVar = this.EljAMC1QTz;
                switch (i2) {
                    case 0:
                        mr mrVar2 = fjVar.GWasM1elztuh;
                        File canonicalFile = ((File) mrVar2.Yi7zF1RB1.GWasM1elztuh()).getCanonicalFile();
                        synchronized (mr.xqGvceK5x) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = mr.X1lG3V04pd;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new pr(canonicalFile, (r21) mrVar2.GWasM1elztuh.mOu10nynGul(canonicalFile), new o1(1, canonicalFile));
                    default:
                        return ((pr) fjVar.mOu10nynGul.getValue()).Yi7zF1RB1;
                }
            }
        });
        final int i2 = 1;
        this.JFJ3QoxA = new m71(new wu(this) { // from class: hi
            public final /* synthetic */ fj EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                int i22 = i2;
                fj fjVar = this.EljAMC1QTz;
                switch (i22) {
                    case 0:
                        mr mrVar2 = fjVar.GWasM1elztuh;
                        File canonicalFile = ((File) mrVar2.Yi7zF1RB1.GWasM1elztuh()).getCanonicalFile();
                        synchronized (mr.xqGvceK5x) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = mr.X1lG3V04pd;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new pr(canonicalFile, (r21) mrVar2.GWasM1elztuh.mOu10nynGul(canonicalFile), new o1(1, canonicalFile));
                    default:
                        return ((pr) fjVar.mOu10nynGul.getValue()).Yi7zF1RB1;
                }
            }
        });
        E7jCp8Ls e7jCp8Ls = new E7jCp8Ls(3, this);
        pd pdVar = new pd(18);
        xqGvceK5x xqgvcek5x = new xqGvceK5x(this, vgVar, 12);
        rx0 rx0Var2 = new rx0();
        rx0Var2.OOA6hdeuvCS = phVar;
        rx0Var2.EljAMC1QTz = xqgvcek5x;
        rx0Var2.AvO7iQsrTN = fb1.Yi7zF1RB1(Integer.MAX_VALUE, null, 6);
        rx0Var2.encWxUiV2 = new j6IIN2O8eOU(4);
        f40 f40Var = (f40) phVar.EljAMC1QTz().E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
        if (f40Var != null) {
            f40Var.Mjvvu5DE(new d2(e7jCp8Ls, rx0Var2, pdVar, 7));
        }
        this.rQPn8YBR = rx0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        if (r11 == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object AvO7iQsrTN(fj fjVar, boolean z, vg vgVar) {
        yi yiVar;
        int i;
        l51 AvO7iQsrTN;
        boolean z2;
        rn0 rn0Var;
        j6IIN2O8eOU j6iin2o8eou = fjVar.AvO7iQsrTN;
        if (vgVar instanceof yi) {
            yiVar = (yi) vgVar;
            int i2 = yiVar.E7jCp8Ls;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yiVar.E7jCp8Ls = i2 - Integer.MIN_VALUE;
                Object obj = yiVar.JFJ3QoxA;
                i = yiVar.E7jCp8Ls;
                vg vgVar2 = null;
                qh qhVar = qh.OOA6hdeuvCS;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    AvO7iQsrTN = j6iin2o8eou.AvO7iQsrTN();
                    if (AvO7iQsrTN instanceof ec1) {
                        o4.jivtDDk9H("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    r21 mOu10nynGul = fjVar.mOu10nynGul();
                    yiVar.mOu10nynGul = AvO7iQsrTN;
                    yiVar.encWxUiV2 = z;
                    yiVar.E7jCp8Ls = 1;
                    obj = mOu10nynGul.GWasM1elztuh();
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            o50.A1EKNP6CxJ(obj);
                            rn0Var = (rn0) obj;
                            l51 l51Var = (l51) rn0Var.OOA6hdeuvCS;
                            if (((Boolean) rn0Var.EljAMC1QTz).booleanValue()) {
                            }
                            return l51Var;
                        }
                        if (i != 3) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o50.A1EKNP6CxJ(obj);
                        rn0Var = (rn0) obj;
                        l51 l51Var2 = (l51) rn0Var.OOA6hdeuvCS;
                        if (((Boolean) rn0Var.EljAMC1QTz).booleanValue()) {
                            j6iin2o8eou.WdrkLMV3xh(l51Var2);
                        }
                        return l51Var2;
                    }
                    z = yiVar.encWxUiV2;
                    AvO7iQsrTN = yiVar.mOu10nynGul;
                    o50.A1EKNP6CxJ(obj);
                }
                int intValue = ((Number) obj).intValue();
                z2 = AvO7iQsrTN instanceof bi;
                int i3 = !z2 ? ((bi) AvO7iQsrTN).GWasM1elztuh : -1;
                if (!z2 && intValue == i3) {
                    return AvO7iQsrTN;
                }
                int i4 = 0;
                if (z) {
                    r21 mOu10nynGul2 = fjVar.mOu10nynGul();
                    aj ajVar = new aj(fjVar, i3, vgVar2, i4);
                    yiVar.mOu10nynGul = null;
                    yiVar.E7jCp8Ls = 3;
                    obj = mOu10nynGul2.X1lG3V04pd(ajVar, yiVar);
                } else {
                    r21 mOu10nynGul3 = fjVar.mOu10nynGul();
                    zi ziVar = new zi(fjVar, vgVar2, i4);
                    yiVar.mOu10nynGul = null;
                    yiVar.E7jCp8Ls = 2;
                    obj = mOu10nynGul3.Yi7zF1RB1(ziVar, yiVar);
                }
                return qhVar;
            }
        }
        yiVar = new yi(fjVar, vgVar);
        Object obj2 = yiVar.JFJ3QoxA;
        i = yiVar.E7jCp8Ls;
        vg vgVar22 = null;
        qh qhVar2 = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = AvO7iQsrTN instanceof bi;
        if (!z2) {
        }
        if (!z2) {
        }
        int i42 = 0;
        if (z) {
        }
        return qhVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r1.Mjvvu5DE(r0) != r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object EljAMC1QTz(fj fjVar, wg wgVar) {
        xi xiVar;
        int i;
        int intValue;
        int i2;
        Throwable th;
        try {
            if (wgVar instanceof xi) {
                xiVar = (xi) wgVar;
                int i3 = xiVar.rQPn8YBR;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    xiVar.rQPn8YBR = i3 - Integer.MIN_VALUE;
                    Object obj = xiVar.mOu10nynGul;
                    i = xiVar.rQPn8YBR;
                    Object obj2 = qh.OOA6hdeuvCS;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        r21 mOu10nynGul = fjVar.mOu10nynGul();
                        xiVar.rQPn8YBR = 1;
                        obj = mOu10nynGul.GWasM1elztuh();
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = xiVar.encWxUiV2;
                            try {
                                o50.A1EKNP6CxJ(obj);
                                return kc1.GWasM1elztuh;
                            } catch (Throwable th2) {
                                th = th2;
                                fjVar.AvO7iQsrTN.WdrkLMV3xh(new vs0(th, i2));
                                throw th;
                            }
                        }
                        o50.A1EKNP6CxJ(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    rx0 rx0Var = fjVar.encWxUiV2;
                    xiVar.encWxUiV2 = intValue;
                    xiVar.rQPn8YBR = 2;
                }
            }
            rx0 rx0Var2 = fjVar.encWxUiV2;
            xiVar.encWxUiV2 = intValue;
            xiVar.rQPn8YBR = 2;
        } catch (Throwable th3) {
            i2 = intValue;
            th = th3;
            fjVar.AvO7iQsrTN.WdrkLMV3xh(new vs0(th, i2));
            throw th;
        }
        xiVar = new xi(fjVar, wgVar);
        Object obj3 = xiVar.mOu10nynGul;
        i = xiVar.rQPn8YBR;
        Object obj22 = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:11:0x0041, B:13:0x0048), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OOA6hdeuvCS(fj fjVar, wg wgVar) {
        wi wiVar;
        int i;
        bh0 bh0Var;
        int i2;
        try {
            if (wgVar instanceof wi) {
                wiVar = (wi) wgVar;
                int i3 = wiVar.rQPn8YBR;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    wiVar.rQPn8YBR = i3 - Integer.MIN_VALUE;
                    Object obj = wiVar.mOu10nynGul;
                    i = wiVar.rQPn8YBR;
                    int i4 = 1;
                    vg vgVar = null;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        bh0 bh0Var2 = fjVar.xqGvceK5x;
                        wiVar.encWxUiV2 = bh0Var2;
                        wiVar.rQPn8YBR = 1;
                        Object xqGvceK5x = bh0Var2.xqGvceK5x(wiVar);
                        qh qhVar = qh.OOA6hdeuvCS;
                        if (xqGvceK5x == qhVar) {
                            return qhVar;
                        }
                        bh0Var = bh0Var2;
                    } else {
                        if (i != 1) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bh0Var = wiVar.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                    }
                    i2 = fjVar.OOA6hdeuvCS + 1;
                    fjVar.OOA6hdeuvCS = i2;
                    if (i2 == 1) {
                        fjVar.EljAMC1QTz = fb1.MZhzXH72(fjVar.Yi7zF1RB1, null, new mi(fjVar, vgVar, i4), 3);
                    }
                    bh0Var.AvO7iQsrTN(null);
                    return kc1.GWasM1elztuh;
                }
            }
            i2 = fjVar.OOA6hdeuvCS + 1;
            fjVar.OOA6hdeuvCS = i2;
            if (i2 == 1) {
            }
            bh0Var.AvO7iQsrTN(null);
            return kc1.GWasM1elztuh;
        } catch (Throwable th) {
            bh0Var.AvO7iQsrTN(null);
            throw th;
        }
        wiVar = new wi(fjVar, wgVar);
        Object obj2 = wiVar.mOu10nynGul;
        i = wiVar.rQPn8YBR;
        int i42 = 1;
        vg vgVar2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:11:0x0041, B:13:0x0049, B:15:0x004d, B:16:0x0053), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object X1lG3V04pd(fj fjVar, wg wgVar) {
        ti tiVar;
        int i;
        bh0 bh0Var;
        int i2;
        try {
            if (wgVar instanceof ti) {
                tiVar = (ti) wgVar;
                int i3 = tiVar.rQPn8YBR;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    tiVar.rQPn8YBR = i3 - Integer.MIN_VALUE;
                    Object obj = tiVar.mOu10nynGul;
                    i = tiVar.rQPn8YBR;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj);
                        bh0 bh0Var2 = fjVar.xqGvceK5x;
                        tiVar.encWxUiV2 = bh0Var2;
                        tiVar.rQPn8YBR = 1;
                        Object xqGvceK5x = bh0Var2.xqGvceK5x(tiVar);
                        qh qhVar = qh.OOA6hdeuvCS;
                        if (xqGvceK5x == qhVar) {
                            return qhVar;
                        }
                        bh0Var = bh0Var2;
                    } else {
                        if (i != 1) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bh0Var = tiVar.encWxUiV2;
                        o50.A1EKNP6CxJ(obj);
                    }
                    i2 = fjVar.OOA6hdeuvCS - 1;
                    fjVar.OOA6hdeuvCS = i2;
                    if (i2 == 0) {
                        f51 f51Var = fjVar.EljAMC1QTz;
                        if (f51Var != null) {
                            f51Var.GWasM1elztuh(null);
                        }
                        fjVar.EljAMC1QTz = null;
                    }
                    bh0Var.AvO7iQsrTN(null);
                    return kc1.GWasM1elztuh;
                }
            }
            i2 = fjVar.OOA6hdeuvCS - 1;
            fjVar.OOA6hdeuvCS = i2;
            if (i2 == 0) {
            }
            bh0Var.AvO7iQsrTN(null);
            return kc1.GWasM1elztuh;
        } catch (Throwable th) {
            bh0Var.AvO7iQsrTN(null);
            throw th;
        }
        tiVar = new ti(fjVar, wgVar);
        Object obj2 = tiVar.mOu10nynGul;
        i = tiVar.rQPn8YBR;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        if (r10 != r5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2 A[Catch: uh -> 0x0097, TryCatch #0 {uh -> 0x0097, blocks: (B:36:0x0092, B:37:0x0114, B:40:0x009c, B:41:0x00f9, B:44:0x00a6, B:45:0x00dd, B:48:0x00ac, B:50:0x00c2, B:51:0x00c6, B:57:0x00b5, B:60:0x00e9), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object encWxUiV2(fj fjVar, boolean z, wg wgVar) {
        bj bjVar;
        int i;
        Object GWasM1elztuh;
        Object obj;
        int i2;
        uh uhVar;
        pt0 pt0Var;
        rt0 rt0Var;
        try {
            if (wgVar instanceof bj) {
                bjVar = (bj) wgVar;
                int i3 = bjVar.iwATDS1i01k;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    bjVar.iwATDS1i01k = i3 - Integer.MIN_VALUE;
                    Object obj2 = bjVar.XnEVoBF0td1l;
                    i = bjVar.iwATDS1i01k;
                    int i4 = 1;
                    vg vgVar = null;
                    Object obj3 = qh.OOA6hdeuvCS;
                    switch (i) {
                        case 0:
                            o50.A1EKNP6CxJ(obj2);
                            if (!z) {
                                r21 mOu10nynGul = fjVar.mOu10nynGul();
                                bjVar.encWxUiV2 = z;
                                bjVar.iwATDS1i01k = 3;
                                obj2 = mOu10nynGul.GWasM1elztuh();
                                if (obj2 == obj3) {
                                }
                                int intValue = ((Number) obj2).intValue();
                                r21 mOu10nynGul2 = fjVar.mOu10nynGul();
                                lv ajVar = new aj(fjVar, intValue, vgVar, i4);
                                bjVar.encWxUiV2 = z;
                                bjVar.iwATDS1i01k = 4;
                                obj2 = mOu10nynGul2.X1lG3V04pd(ajVar, bjVar);
                                break;
                            } else {
                                bjVar.encWxUiV2 = z;
                                bjVar.iwATDS1i01k = 1;
                                obj2 = fjVar.JFJ3QoxA(bjVar);
                                if (obj2 == obj3) {
                                }
                                int hashCode = obj2 != null ? obj2.hashCode() : 0;
                                r21 mOu10nynGul3 = fjVar.mOu10nynGul();
                                bjVar.mOu10nynGul = obj2;
                                bjVar.encWxUiV2 = z;
                                bjVar.E7jCp8Ls = hashCode;
                                bjVar.iwATDS1i01k = 2;
                                GWasM1elztuh = mOu10nynGul3.GWasM1elztuh();
                                if (GWasM1elztuh == obj3) {
                                    obj = obj2;
                                    obj2 = GWasM1elztuh;
                                    i2 = hashCode;
                                    return new bi(i2, ((Number) obj2).intValue(), obj);
                                }
                            }
                            return obj3;
                        case 1:
                            z = bjVar.encWxUiV2;
                            o50.A1EKNP6CxJ(obj2);
                            if (obj2 != null) {
                            }
                            r21 mOu10nynGul32 = fjVar.mOu10nynGul();
                            bjVar.mOu10nynGul = obj2;
                            bjVar.encWxUiV2 = z;
                            bjVar.E7jCp8Ls = hashCode;
                            bjVar.iwATDS1i01k = 2;
                            GWasM1elztuh = mOu10nynGul32.GWasM1elztuh();
                            if (GWasM1elztuh == obj3) {
                            }
                            break;
                        case 2:
                            i2 = bjVar.E7jCp8Ls;
                            boolean z2 = bjVar.encWxUiV2;
                            obj = bjVar.mOu10nynGul;
                            o50.A1EKNP6CxJ(obj2);
                            return new bi(i2, ((Number) obj2).intValue(), obj);
                        case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                            z = bjVar.encWxUiV2;
                            o50.A1EKNP6CxJ(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            r21 mOu10nynGul22 = fjVar.mOu10nynGul();
                            lv ajVar2 = new aj(fjVar, intValue2, vgVar, i4);
                            bjVar.encWxUiV2 = z;
                            bjVar.iwATDS1i01k = 4;
                            obj2 = mOu10nynGul22.X1lG3V04pd(ajVar2, bjVar);
                            break;
                        case 4:
                            boolean z3 = bjVar.encWxUiV2;
                            o50.A1EKNP6CxJ(obj2);
                            return (bi) obj2;
                        case 5:
                            boolean z4 = bjVar.encWxUiV2;
                            rt0 rt0Var2 = (rt0) bjVar.rQPn8YBR;
                            rt0 rt0Var3 = bjVar.JFJ3QoxA;
                            uh uhVar2 = (uh) bjVar.mOu10nynGul;
                            o50.A1EKNP6CxJ(obj2);
                            rt0Var2.OOA6hdeuvCS = obj2;
                            pt0 pt0Var2 = new pt0();
                            try {
                                cj cjVar = new cj(rt0Var3, fjVar, pt0Var2, (vg) null);
                                bjVar.mOu10nynGul = uhVar2;
                                bjVar.JFJ3QoxA = rt0Var3;
                                bjVar.rQPn8YBR = pt0Var2;
                                bjVar.iwATDS1i01k = 6;
                                if ((z4 ? cjVar.mOu10nynGul(bjVar) : fjVar.mOu10nynGul().Yi7zF1RB1(new ui(cjVar, null), bjVar)) != obj3) {
                                    pt0Var = pt0Var2;
                                    rt0Var = rt0Var3;
                                    Object obj4 = rt0Var.OOA6hdeuvCS;
                                    return new bi(obj4 != null ? obj4.hashCode() : 0, pt0Var.OOA6hdeuvCS, obj4);
                                }
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                uhVar = uhVar2;
                                p.xqGvceK5x(uhVar, th);
                                throw uhVar;
                            }
                        case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                            pt0Var = (pt0) bjVar.rQPn8YBR;
                            rt0Var = bjVar.JFJ3QoxA;
                            uhVar = (uh) bjVar.mOu10nynGul;
                            try {
                                o50.A1EKNP6CxJ(obj2);
                                Object obj42 = rt0Var.OOA6hdeuvCS;
                                return new bi(obj42 != null ? obj42.hashCode() : 0, pt0Var.OOA6hdeuvCS, obj42);
                            } catch (Throwable th2) {
                                th = th2;
                                p.xqGvceK5x(uhVar, th);
                                throw uhVar;
                            }
                        default:
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (i) {
            }
        } catch (uh e) {
            rt0 rt0Var4 = new rt0();
            bjVar.mOu10nynGul = e;
            bjVar.JFJ3QoxA = rt0Var4;
            bjVar.rQPn8YBR = rt0Var4;
            bjVar.encWxUiV2 = z;
            bjVar.iwATDS1i01k = 5;
            throw e;
        }
        bjVar = new bj(fjVar, wgVar);
        Object obj22 = bjVar.XnEVoBF0td1l;
        i = bjVar.iwATDS1i01k;
        int i42 = 1;
        vg vgVar2 = null;
        Object obj32 = qh.OOA6hdeuvCS;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object xqGvceK5x(fj fjVar, sd0 sd0Var, wg wgVar) {
        vi viVar;
        int i;
        rc rcVar;
        gh ghVar;
        Throwable GWasM1elztuh;
        if (wgVar instanceof vi) {
            viVar = (vi) wgVar;
            int i2 = viVar.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                viVar.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj = viVar.mOu10nynGul;
                i = viVar.rQPn8YBR;
                vg vgVar = null;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    rc rcVar2 = sd0Var.Yi7zF1RB1;
                    try {
                        ghVar = sd0Var.xqGvceK5x;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        gh ghVar2 = viVar.EljAMC1QTz;
                        ghVar2.getClass();
                        gh mOu10nynGul = ghVar.mOu10nynGul(ghVar2);
                        xqGvceK5x xqgvcek5x = new xqGvceK5x(fjVar, sd0Var, vgVar, 10);
                        viVar.encWxUiV2 = rcVar2;
                        viVar.rQPn8YBR = 1;
                        Object ES6ysExf = fb1.ES6ysExf(mOu10nynGul, xqgvcek5x, viVar);
                        qh qhVar = qh.OOA6hdeuvCS;
                        if (ES6ysExf == qhVar) {
                            return qhVar;
                        }
                        obj = ES6ysExf;
                        rcVar = rcVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        rcVar = rcVar2;
                        obj = new su0(th);
                        GWasM1elztuh = tu0.GWasM1elztuh(obj);
                        if (GWasM1elztuh != null) {
                        }
                        return kc1.GWasM1elztuh;
                    }
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rcVar = viVar.encWxUiV2;
                    try {
                        o50.A1EKNP6CxJ(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        obj = new su0(th);
                        GWasM1elztuh = tu0.GWasM1elztuh(obj);
                        if (GWasM1elztuh != null) {
                        }
                        return kc1.GWasM1elztuh;
                    }
                }
                GWasM1elztuh = tu0.GWasM1elztuh(obj);
                if (GWasM1elztuh != null) {
                    rcVar.qugwajBSa59j(obj);
                } else {
                    rcVar.getClass();
                    rcVar.qugwajBSa59j(new uc(GWasM1elztuh, false));
                }
                return kc1.GWasM1elztuh;
            }
        }
        viVar = new vi(fjVar, wgVar);
        Object obj2 = viVar.mOu10nynGul;
        i = viVar.rQPn8YBR;
        vg vgVar2 = null;
        if (i != 0) {
        }
        GWasM1elztuh = tu0.GWasM1elztuh(obj2);
        if (GWasM1elztuh != null) {
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.gi
    public final Object GWasM1elztuh(lv lvVar, wg wgVar) {
        cd1 cd1Var = (cd1) wgVar.OOA6hdeuvCS().E7jCp8Ls(k61.mOu10nynGul);
        if (cd1Var != null) {
            cd1Var.X1lG3V04pd(this);
        }
        return fb1.ES6ysExf(new cd1(cd1Var, this), new EljAMC1QTz(this, lvVar, null, 6), wgVar);
    }

    public final Object JFJ3QoxA(wg wgVar) {
        return ((pr) this.mOu10nynGul.getValue()).GWasM1elztuh(new pi(3, (vg) null), wgVar);
    }

    @Override // defpackage.gi
    public final ls Yi7zF1RB1() {
        return this.X1lG3V04pd;
    }

    public final r21 mOu10nynGul() {
        return (r21) this.JFJ3QoxA.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rQPn8YBR(Object obj, boolean z, wg wgVar) {
        dj djVar;
        int i;
        pt0 pt0Var;
        if (wgVar instanceof dj) {
            djVar = (dj) wgVar;
            int i2 = djVar.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                djVar.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj2 = djVar.mOu10nynGul;
                i = djVar.rQPn8YBR;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj2);
                    pt0 pt0Var2 = new pt0();
                    pr prVar = (pr) this.mOu10nynGul.getValue();
                    ej ejVar = new ej(pt0Var2, this, obj, z, null);
                    djVar.encWxUiV2 = pt0Var2;
                    djVar.rQPn8YBR = 1;
                    Object Yi7zF1RB1 = prVar.Yi7zF1RB1(ejVar, djVar);
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (Yi7zF1RB1 == qhVar) {
                        return qhVar;
                    }
                    pt0Var = pt0Var2;
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pt0Var = djVar.encWxUiV2;
                    o50.A1EKNP6CxJ(obj2);
                }
                return new Integer(pt0Var.OOA6hdeuvCS);
            }
        }
        djVar = new dj(this, wgVar);
        Object obj22 = djVar.mOu10nynGul;
        i = djVar.rQPn8YBR;
        if (i != 0) {
        }
        return new Integer(pt0Var.OOA6hdeuvCS);
    }
}
