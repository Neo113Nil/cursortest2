package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kg extends defpackage.mi1 implements defpackage.c20 {
    public final /* synthetic */ defpackage.tx[] GE9mJIPrb8gP;
    public final /* synthetic */ int Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.dc h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(defpackage.tx[] txVarArr, int i, java.util.concurrent.atomic.AtomicInteger atomicInteger, defpackage.dc dcVar, defpackage.kl klVar) {
        super(2, klVar);
        this.GE9mJIPrb8gP = txVarArr;
        this.Ns0WNyEWdPsk = i;
        this.fNwYGHIYeJcR = atomicInteger;
        this.h3m55N1URyyK = dcVar;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.kg) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        return new defpackage.kg(this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, klVar);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.fNwYGHIYeJcR;
        defpackage.dc dcVar = this.h3m55N1URyyK;
        try {
            if (i == 0) {
                defpackage.b80.KrtOTfE6jiS2(obj);
                defpackage.tx[] txVarArr = this.GE9mJIPrb8gP;
                int i2 = this.Ns0WNyEWdPsk;
                defpackage.tx txVar = txVarArr[i2];
                defpackage.jg jgVar = new defpackage.jg(dcVar, i2);
                this.e6mdH7fiFuta = 1;
                java.lang.Object ZpBGe2uQfcn8 = txVar.ZpBGe2uQfcn8(jgVar, this);
                defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                if (ZpBGe2uQfcn8 == tmVar) {
                    return tmVar;
                }
            } else {
                if (i != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.b80.KrtOTfE6jiS2(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                defpackage.q70.fNwYGHIYeJcR(dcVar);
            }
            return defpackage.gs1.ZpBGe2uQfcn8;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                defpackage.q70.fNwYGHIYeJcR(dcVar);
            }
        }
    }
}
