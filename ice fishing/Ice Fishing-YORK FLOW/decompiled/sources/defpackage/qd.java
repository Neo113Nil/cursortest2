package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qd extends defpackage.rd {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater GE9mJIPrb8gP = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.qd.class, "consumed$volatile");
    public final defpackage.pd P05cfTpS5W5L;
    private volatile /* synthetic */ int consumed$volatile;
    public final boolean e6mdH7fiFuta;

    public /* synthetic */ qd(defpackage.pd pdVar, boolean z) {
        this(pdVar, z, defpackage.xu.WDYagTQQm9ns, -3, defpackage.zb.WDYagTQQm9ns);
    }

    @Override // defpackage.rd
    public final java.lang.Object JhCgjQRTAOCT(defpackage.k21 k21Var, defpackage.kl klVar) {
        java.lang.Object XntWc4eZSQ8j = defpackage.la0.XntWc4eZSQ8j(new defpackage.cc1(k21Var), this.P05cfTpS5W5L, this.e6mdH7fiFuta, klVar);
        return XntWc4eZSQ8j == defpackage.tm.WDYagTQQm9ns ? XntWc4eZSQ8j : defpackage.gs1.ZpBGe2uQfcn8;
    }

    @Override // defpackage.rd
    public final defpackage.pd QiMR8OkAhezm(defpackage.sm smVar) {
        if (!this.e6mdH7fiFuta || GE9mJIPrb8gP.getAndSet(this, 1) == 0) {
            return this.oh71FJcDz6S2 == -3 ? this.P05cfTpS5W5L : super.QiMR8OkAhezm(smVar);
        }
        defpackage.h7.P05cfTpS5W5L("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    @Override // defpackage.rd
    public final defpackage.rd WDYagTQQm9ns(defpackage.jm jmVar, int i, defpackage.zb zbVar) {
        return new defpackage.qd(this.P05cfTpS5W5L, this.e6mdH7fiFuta, jmVar, i, zbVar);
    }

    @Override // defpackage.rd, defpackage.tx
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.ux uxVar, defpackage.kl klVar) {
        int i = this.oh71FJcDz6S2;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (i == -3) {
            boolean z = this.e6mdH7fiFuta;
            if (z && GE9mJIPrb8gP.getAndSet(this, 1) != 0) {
                defpackage.h7.P05cfTpS5W5L("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            java.lang.Object XntWc4eZSQ8j = defpackage.la0.XntWc4eZSQ8j(uxVar, this.P05cfTpS5W5L, z, klVar);
            if (XntWc4eZSQ8j == tmVar) {
                return XntWc4eZSQ8j;
            }
        } else {
            java.lang.Object ZpBGe2uQfcn8 = super.ZpBGe2uQfcn8(uxVar, klVar);
            if (ZpBGe2uQfcn8 == tmVar) {
                return ZpBGe2uQfcn8;
            }
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }

    @Override // defpackage.rd
    public final java.lang.String fWTAfUmVKrZq() {
        return "channel=" + this.P05cfTpS5W5L;
    }

    @Override // defpackage.rd
    public final defpackage.tx oh71FJcDz6S2() {
        return new defpackage.qd(this.P05cfTpS5W5L, this.e6mdH7fiFuta);
    }

    public qd(defpackage.pd pdVar, boolean z, defpackage.jm jmVar, int i, defpackage.zb zbVar) {
        super(jmVar, i, zbVar);
        this.P05cfTpS5W5L = pdVar;
        this.e6mdH7fiFuta = z;
        this.consumed$volatile = 0;
    }
}
