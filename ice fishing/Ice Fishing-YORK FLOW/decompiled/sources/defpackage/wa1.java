package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wa1 extends defpackage.f51 implements defpackage.c20 {
    public /* synthetic */ java.lang.Object GE9mJIPrb8gP;
    public final /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public long P05cfTpS5W5L;
    public final /* synthetic */ int QiMR8OkAhezm = 0;
    public int e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(long j, defpackage.y31 y31Var, defpackage.kl klVar) {
        super(klVar);
        this.P05cfTpS5W5L = j;
        this.Ns0WNyEWdPsk = y31Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.QiMR8OkAhezm;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.ri1 ri1Var = (defpackage.ri1) obj;
        defpackage.kl klVar = (defpackage.kl) obj2;
        switch (i) {
        }
        return ((defpackage.wa1) XntWc4eZSQ8j(klVar, ri1Var)).s0TASMVLSWD5(gs1Var);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        int i = this.QiMR8OkAhezm;
        java.lang.Object obj2 = this.Ns0WNyEWdPsk;
        switch (i) {
            case 0:
                defpackage.wa1 wa1Var = new defpackage.wa1(this.P05cfTpS5W5L, (defpackage.y31) obj2, klVar);
                wa1Var.GE9mJIPrb8gP = obj;
                return wa1Var;
            default:
                defpackage.wa1 wa1Var2 = new defpackage.wa1((defpackage.c01) obj2, klVar);
                wa1Var2.GE9mJIPrb8gP = obj;
                return wa1Var2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:7:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.QiMR8OkAhezm
            java.lang.Object r1 = r9.Ns0WNyEWdPsk
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            tm r4 = defpackage.tm.WDYagTQQm9ns
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.e6mdH7fiFuta
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.P05cfTpS5W5L
            java.lang.Object r2 = r9.GE9mJIPrb8gP
            ri1 r2 = (defpackage.ri1) r2
            defpackage.b80.KrtOTfE6jiS2(r10)
            goto L47
        L1d:
            defpackage.h7.P05cfTpS5W5L(r3)
            goto L50
        L21:
            defpackage.b80.KrtOTfE6jiS2(r10)
            java.lang.Object r10 = r9.GE9mJIPrb8gP
            ri1 r10 = (defpackage.ri1) r10
            c01 r1 = (defpackage.c01) r1
            long r0 = r1.giKS3J6vZuNy
            cu1 r2 = r10.WDYagTQQm9ns()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.GE9mJIPrb8gP = r2
            r9.P05cfTpS5W5L = r0
            r9.e6mdH7fiFuta = r5
            r10 = 3
            java.lang.Object r10 = defpackage.oj1.giKS3J6vZuNy(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            c01 r10 = (defpackage.c01) r10
            long r6 = r10.giKS3J6vZuNy
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            y31 r1 = (defpackage.y31) r1
            int r0 = r9.e6mdH7fiFuta
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.GE9mJIPrb8gP
            ri1 r9 = (defpackage.ri1) r9
            defpackage.b80.KrtOTfE6jiS2(r10)
            goto L84
        L61:
            defpackage.h7.P05cfTpS5W5L(r3)
            goto Lb6
        L65:
            defpackage.b80.KrtOTfE6jiS2(r10)
            java.lang.Object r10 = r9.GE9mJIPrb8gP
            ri1 r10 = (defpackage.ri1) r10
            long r2 = r9.P05cfTpS5W5L
            l2 r0 = new l2
            r6 = 17
            r0.<init>(r6, r1)
            r9.GE9mJIPrb8gP = r10
            r9.e6mdH7fiFuta = r5
            java.lang.Object r9 = defpackage.ns.fWTAfUmVKrZq(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            c01 r10 = (defpackage.c01) r10
            if (r10 == 0) goto L9c
            long r0 = r1.WDYagTQQm9ns
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            mr r2 = defpackage.mr.oh71FJcDz6S2
            goto Lb6
        L9c:
            si1 r9 = r9.GE9mJIPrb8gP
            vz0 r9 = r9.IJ0hOnjhPOri
            java.util.List r9 = r9.ZpBGe2uQfcn8
            java.lang.Object r9 = defpackage.hf.fhbmYuu9J3cT(r9)
            c01 r9 = (defpackage.c01) r9
            boolean r10 = defpackage.j80.fNwYGHIYeJcR(r9)
            if (r10 == 0) goto Lb4
            r9.ZpBGe2uQfcn8()
            mr r2 = defpackage.mr.WDYagTQQm9ns
            goto Lb6
        Lb4:
            mr r2 = defpackage.mr.P05cfTpS5W5L
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa1.s0TASMVLSWD5(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa1(defpackage.c01 c01Var, defpackage.kl klVar) {
        super(klVar);
        this.Ns0WNyEWdPsk = c01Var;
    }
}
