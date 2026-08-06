package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zx implements defpackage.tx {
    public final /* synthetic */ defpackage.qd WDYagTQQm9ns;
    public final /* synthetic */ defpackage.li oh71FJcDz6S2;

    public zx(defpackage.qd qdVar, defpackage.li liVar) {
        this.WDYagTQQm9ns = qdVar;
        this.oh71FJcDz6S2 = liVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        if (r11.ZpBGe2uQfcn8(r10, r0) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r11 = new defpackage.fo1(r10);
        r10 = r10.oh71FJcDz6S2;
        r0.Ns0WNyEWdPsk = r10;
        r0.fNwYGHIYeJcR = null;
        r0.e6mdH7fiFuta = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (defpackage.ma0.WDYagTQQm9ns(r11, r10, r10, r0) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.tx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.ux uxVar, defpackage.kl klVar) {
        defpackage.yx yxVar;
        int i;
        defpackage.gs1 gs1Var;
        defpackage.tm tmVar;
        defpackage.b71 b71Var;
        defpackage.b71 b71Var2;
        try {
            if (klVar instanceof defpackage.yx) {
                yxVar = (defpackage.yx) klVar;
                int i2 = yxVar.e6mdH7fiFuta;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yxVar.e6mdH7fiFuta = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = yxVar.P05cfTpS5W5L;
                    i = yxVar.e6mdH7fiFuta;
                    gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                    tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (i != 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        defpackage.qd qdVar = this.WDYagTQQm9ns;
                        yxVar.Ns0WNyEWdPsk = this;
                        yxVar.fNwYGHIYeJcR = uxVar;
                        yxVar.e6mdH7fiFuta = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                java.lang.Throwable th = (java.lang.Throwable) yxVar.Ns0WNyEWdPsk;
                                defpackage.b80.KrtOTfE6jiS2(obj);
                                throw th;
                            }
                            if (i != 3) {
                                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b71Var2 = (defpackage.b71) yxVar.Ns0WNyEWdPsk;
                            try {
                                defpackage.b80.KrtOTfE6jiS2(obj);
                                b71Var2.BHfvd2J71qpO();
                                return gs1Var;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                b71Var2.BHfvd2J71qpO();
                                throw th;
                            }
                        }
                        uxVar = yxVar.fNwYGHIYeJcR;
                        this = (defpackage.zx) yxVar.Ns0WNyEWdPsk;
                        defpackage.b80.KrtOTfE6jiS2(obj);
                    }
                    defpackage.jm jmVar = yxVar.oh71FJcDz6S2;
                    jmVar.getClass();
                    b71Var = new defpackage.b71(uxVar, jmVar);
                    defpackage.li liVar = this.oh71FJcDz6S2;
                    yxVar.Ns0WNyEWdPsk = b71Var;
                    yxVar.fNwYGHIYeJcR = null;
                    yxVar.e6mdH7fiFuta = 3;
                    liVar.JhCgjQRTAOCT(b71Var, null, yxVar);
                    if (gs1Var != tmVar) {
                        b71Var2 = b71Var;
                        b71Var2.BHfvd2J71qpO();
                        return gs1Var;
                    }
                    return tmVar;
                }
            }
            defpackage.li liVar2 = this.oh71FJcDz6S2;
            yxVar.Ns0WNyEWdPsk = b71Var;
            yxVar.fNwYGHIYeJcR = null;
            yxVar.e6mdH7fiFuta = 3;
            liVar2.JhCgjQRTAOCT(b71Var, null, yxVar);
            if (gs1Var != tmVar) {
            }
            return tmVar;
        } catch (java.lang.Throwable th3) {
            th = th3;
            b71Var2 = b71Var;
            b71Var2.BHfvd2J71qpO();
            throw th;
        }
        yxVar = new defpackage.yx(this, klVar);
        java.lang.Object obj2 = yxVar.P05cfTpS5W5L;
        i = yxVar.e6mdH7fiFuta;
        gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        tmVar = defpackage.tm.WDYagTQQm9ns;
        if (i != 0) {
        }
        defpackage.jm jmVar2 = yxVar.oh71FJcDz6S2;
        jmVar2.getClass();
        b71Var = new defpackage.b71(uxVar, jmVar2);
    }
}
