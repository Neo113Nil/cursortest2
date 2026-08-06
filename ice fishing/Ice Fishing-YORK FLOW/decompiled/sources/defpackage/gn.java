package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gn extends defpackage.mi1 implements defpackage.c20 {
    public final /* synthetic */ defpackage.h61 GE9mJIPrb8gP;
    public final /* synthetic */ boolean Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;
    public final /* synthetic */ boolean fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.y10 h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(defpackage.kl klVar, defpackage.y10 y10Var, defpackage.h61 h61Var, boolean z, boolean z2) {
        super(2, klVar);
        this.GE9mJIPrb8gP = h61Var;
        this.Ns0WNyEWdPsk = z;
        this.fNwYGHIYeJcR = z2;
        this.h3m55N1URyyK = y10Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.gn) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        return new defpackage.gn(klVar, this.h3m55N1URyyK, this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        if (i != 0) {
            if (i == 1) {
                defpackage.b80.KrtOTfE6jiS2(obj);
                return obj;
            }
            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        defpackage.b80.KrtOTfE6jiS2(obj);
        defpackage.y10 y10Var = this.h3m55N1URyyK;
        defpackage.h61 h61Var = this.GE9mJIPrb8gP;
        boolean z = this.fNwYGHIYeJcR;
        boolean z2 = this.Ns0WNyEWdPsk;
        defpackage.in inVar = new defpackage.in(null, y10Var, h61Var, z, z2);
        this.e6mdH7fiFuta = 1;
        java.lang.Object GE9mJIPrb8gP = h61Var.GE9mJIPrb8gP(z2, inVar, this);
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        return GE9mJIPrb8gP == tmVar ? tmVar : GE9mJIPrb8gP;
    }
}
