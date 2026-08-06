package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ki {
    public final /* synthetic */ bh0 GWasM1elztuh;
    public final /* synthetic */ rt0 X1lG3V04pd;
    public final /* synthetic */ nt0 Yi7zF1RB1;
    public final /* synthetic */ fj xqGvceK5x;

    public ki(bh0 bh0Var, nt0 nt0Var, rt0 rt0Var, fj fjVar) {
        this.GWasM1elztuh = bh0Var;
        this.Yi7zF1RB1 = nt0Var;
        this.X1lG3V04pd = rt0Var;
        this.xqGvceK5x = fjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r10.xqGvceK5x(r0) == r6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:27:0x004e, B:28:0x00a8, B:30:0x00b0), top: B:26:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GWasM1elztuh(ei eiVar, wg wgVar) {
        ji jiVar;
        int i;
        bh0 bh0Var;
        nt0 nt0Var;
        rt0 rt0Var;
        fj fjVar;
        lv lvVar;
        bh0 bh0Var2;
        bh0 bh0Var3;
        rt0 rt0Var2;
        Object obj;
        try {
            if (wgVar instanceof ji) {
                jiVar = (ji) wgVar;
                int i2 = jiVar.iwATDS1i01k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jiVar.iwATDS1i01k = i2 - Integer.MIN_VALUE;
                    Object obj2 = jiVar.XnEVoBF0td1l;
                    i = jiVar.iwATDS1i01k;
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (i != 0) {
                        o50.A1EKNP6CxJ(obj2);
                        jiVar.encWxUiV2 = eiVar;
                        bh0Var = this.GWasM1elztuh;
                        jiVar.mOu10nynGul = bh0Var;
                        nt0Var = this.Yi7zF1RB1;
                        jiVar.JFJ3QoxA = nt0Var;
                        rt0Var = this.X1lG3V04pd;
                        jiVar.rQPn8YBR = rt0Var;
                        fjVar = this.xqGvceK5x;
                        jiVar.E7jCp8Ls = fjVar;
                        jiVar.iwATDS1i01k = 1;
                        lvVar = eiVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = jiVar.JFJ3QoxA;
                                rt0Var2 = (rt0) jiVar.mOu10nynGul;
                                bh0Var2 = (bh0) jiVar.encWxUiV2;
                                try {
                                    o50.A1EKNP6CxJ(obj2);
                                    rt0Var2.OOA6hdeuvCS = obj;
                                    Object obj3 = rt0Var2.OOA6hdeuvCS;
                                    bh0Var2.AvO7iQsrTN(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    bh0Var2.AvO7iQsrTN(null);
                                    throw th;
                                }
                            }
                            fjVar = (fj) jiVar.JFJ3QoxA;
                            rt0Var2 = (rt0) jiVar.mOu10nynGul;
                            bh0Var3 = (bh0) jiVar.encWxUiV2;
                            try {
                                o50.A1EKNP6CxJ(obj2);
                                if (!o30.rQPn8YBR(obj2, rt0Var2.OOA6hdeuvCS)) {
                                    bh0Var2 = bh0Var3;
                                    Object obj32 = rt0Var2.OOA6hdeuvCS;
                                    bh0Var2.AvO7iQsrTN(null);
                                    return obj32;
                                }
                                jiVar.encWxUiV2 = bh0Var3;
                                jiVar.mOu10nynGul = rt0Var2;
                                jiVar.JFJ3QoxA = obj2;
                                jiVar.iwATDS1i01k = 3;
                                if (fjVar.rQPn8YBR(obj2, false, jiVar) != qhVar) {
                                    obj = obj2;
                                    bh0Var2 = bh0Var3;
                                    rt0Var2.OOA6hdeuvCS = obj;
                                    Object obj322 = rt0Var2.OOA6hdeuvCS;
                                    bh0Var2.AvO7iQsrTN(null);
                                    return obj322;
                                }
                                return qhVar;
                            } catch (Throwable th2) {
                                th = th2;
                                bh0Var2 = bh0Var3;
                                bh0Var2.AvO7iQsrTN(null);
                                throw th;
                            }
                        }
                        fjVar = jiVar.E7jCp8Ls;
                        rt0 rt0Var3 = jiVar.rQPn8YBR;
                        nt0Var = (nt0) jiVar.JFJ3QoxA;
                        bh0 bh0Var4 = (bh0) jiVar.mOu10nynGul;
                        lv lvVar2 = (lv) jiVar.encWxUiV2;
                        o50.A1EKNP6CxJ(obj2);
                        rt0Var = rt0Var3;
                        lvVar = lvVar2;
                        bh0Var = bh0Var4;
                    }
                    if (!nt0Var.OOA6hdeuvCS) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = rt0Var.OOA6hdeuvCS;
                    jiVar.encWxUiV2 = bh0Var;
                    jiVar.mOu10nynGul = rt0Var;
                    jiVar.JFJ3QoxA = fjVar;
                    jiVar.rQPn8YBR = null;
                    jiVar.E7jCp8Ls = null;
                    jiVar.iwATDS1i01k = 2;
                    Object EljAMC1QTz = lvVar.EljAMC1QTz(obj4, jiVar);
                    if (EljAMC1QTz != qhVar) {
                        bh0Var3 = bh0Var;
                        obj2 = EljAMC1QTz;
                        rt0Var2 = rt0Var;
                        if (!o30.rQPn8YBR(obj2, rt0Var2.OOA6hdeuvCS)) {
                        }
                    }
                    return qhVar;
                }
            }
            if (!nt0Var.OOA6hdeuvCS) {
            }
        } catch (Throwable th3) {
            th = th3;
            bh0Var2 = bh0Var;
            bh0Var2.AvO7iQsrTN(null);
            throw th;
        }
        jiVar = new ji(this, wgVar);
        Object obj22 = jiVar.XnEVoBF0td1l;
        i = jiVar.iwATDS1i01k;
        qh qhVar2 = qh.OOA6hdeuvCS;
        if (i != 0) {
        }
    }
}
