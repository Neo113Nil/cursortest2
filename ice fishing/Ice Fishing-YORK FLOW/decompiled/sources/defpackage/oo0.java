package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class oo0 extends defpackage.mi1 implements defpackage.c20 {
    public java.lang.Object GE9mJIPrb8gP;
    public defpackage.ko Ns0WNyEWdPsk;
    public final /* synthetic */ defpackage.jo0 T1fB7bDYiVJQ;
    public final /* synthetic */ defpackage.oh71FJcDz6S2 WmetiUbpKU9I;
    public final /* synthetic */ defpackage.po0 XntWc4eZSQ8j;
    public defpackage.ro0 e6mdH7fiFuta;
    public defpackage.po0 fNwYGHIYeJcR;
    public /* synthetic */ java.lang.Object gUjdnLbkVAaA;
    public int h3m55N1URyyK;
    public final /* synthetic */ defpackage.ko s0TASMVLSWD5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0(defpackage.jo0 jo0Var, defpackage.po0 po0Var, defpackage.oh71FJcDz6S2 oh71fjcdz6s2, defpackage.ko koVar, defpackage.kl klVar) {
        super(2, klVar);
        this.T1fB7bDYiVJQ = jo0Var;
        this.XntWc4eZSQ8j = po0Var;
        this.WmetiUbpKU9I = oh71fjcdz6s2;
        this.s0TASMVLSWD5 = koVar;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.oo0) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.oo0 oo0Var = new defpackage.oo0(this.T1fB7bDYiVJQ, this.XntWc4eZSQ8j, this.WmetiUbpKU9I, this.s0TASMVLSWD5, klVar);
        oo0Var.gUjdnLbkVAaA = obj;
        return oo0Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.h3m55N1URyyK
            r1 = 2
            r2 = 1
            r3 = 0
            tm r4 = defpackage.tm.WDYagTQQm9ns
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.GE9mJIPrb8gP
            po0 r0 = (defpackage.po0) r0
            ro0 r1 = r8.e6mdH7fiFuta
            java.lang.Object r8 = r8.gUjdnLbkVAaA
            mo0 r8 = (defpackage.mo0) r8
            defpackage.b80.KrtOTfE6jiS2(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.h7.P05cfTpS5W5L(r8)
            return r3
        L25:
            po0 r0 = r8.fNwYGHIYeJcR
            ko r2 = r8.Ns0WNyEWdPsk
            java.lang.Object r5 = r8.GE9mJIPrb8gP
            c20 r5 = (defpackage.c20) r5
            ro0 r6 = r8.e6mdH7fiFuta
            java.lang.Object r7 = r8.gUjdnLbkVAaA
            mo0 r7 = (defpackage.mo0) r7
            defpackage.b80.KrtOTfE6jiS2(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.b80.KrtOTfE6jiS2(r9)
            java.lang.Object r9 = r8.gUjdnLbkVAaA
            sm r9 = (defpackage.sm) r9
            mo0 r0 = new mo0
            jm r9 = r9.QiMR8OkAhezm()
            jVUAPb5NnIYW r5 = defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8
            hm r9 = r9.XntWc4eZSQ8j(r5)
            r9.getClass()
            cb0 r9 = (defpackage.cb0) r9
            jo0 r5 = r8.T1fB7bDYiVJQ
            r0.<init>(r5, r9)
            po0 r9 = r8.XntWc4eZSQ8j
            defpackage.po0.ZpBGe2uQfcn8(r9, r0)
            to0 r5 = r9.giKS3J6vZuNy
            r8.gUjdnLbkVAaA = r0
            r8.e6mdH7fiFuta = r5
            oh71FJcDz6S2 r6 = r8.WmetiUbpKU9I
            r8.GE9mJIPrb8gP = r6
            ko r7 = r8.s0TASMVLSWD5
            r8.Ns0WNyEWdPsk = r7
            r8.fNwYGHIYeJcR = r9
            r8.h3m55N1URyyK = r2
            java.lang.Object r2 = r5.JhCgjQRTAOCT(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.gUjdnLbkVAaA = r0     // Catch: java.lang.Throwable -> La5
            r8.e6mdH7fiFuta = r5     // Catch: java.lang.Throwable -> La5
            r8.GE9mJIPrb8gP = r9     // Catch: java.lang.Throwable -> La5
            r8.Ns0WNyEWdPsk = r3     // Catch: java.lang.Throwable -> La5
            r8.fNwYGHIYeJcR = r3     // Catch: java.lang.Throwable -> La5
            r8.h3m55N1URyyK = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.QiMR8OkAhezm(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.ZpBGe2uQfcn8     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.giKS3J6vZuNy(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.ZpBGe2uQfcn8     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.giKS3J6vZuNy(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo0.s0TASMVLSWD5(java.lang.Object):java.lang.Object");
    }
}
