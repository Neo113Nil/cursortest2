package defpackage;

/* loaded from: classes.dex */
public final class tb extends defpackage.ub {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater SH1y5HwkJhh = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.tb.class, "consumed$volatile");
    public final defpackage.sb EXtogiMhuM;
    private volatile /* synthetic */ int consumed$volatile;
    public final boolean riuEU0zW4;

    public /* synthetic */ tb(defpackage.sb sbVar, boolean z) {
        this(sbVar, z, defpackage.lt.adDC3e2L, -3, defpackage.t9.adDC3e2L);
    }

    @Override // defpackage.ub
    public final defpackage.sb AARZUJiTa(defpackage.uj ujVar) {
        if (!this.riuEU0zW4 || SH1y5HwkJhh.getAndSet(this, 1) == 0) {
            return this.xiZrDbcSW0 == -3 ? this.EXtogiMhuM : super.AARZUJiTa(ujVar);
        }
        defpackage.db.AARZUJiTa("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    @Override // defpackage.ub
    public final java.lang.Object F7NU4MC0GW(defpackage.yx0 yx0Var, defpackage.ej ejVar) {
        java.lang.Object V7bD7b8KA = defpackage.h1.V7bD7b8KA(new defpackage.x71(yx0Var), this.EXtogiMhuM, this.riuEU0zW4, ejVar);
        return V7bD7b8KA == defpackage.vj.adDC3e2L ? V7bD7b8KA : defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.ub, defpackage.hw
    public final java.lang.Object IHQe1A4L2xu(defpackage.iw iwVar, defpackage.ej ejVar) {
        int i = this.xiZrDbcSW0;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i == -3) {
            boolean z = this.riuEU0zW4;
            if (z && SH1y5HwkJhh.getAndSet(this, 1) != 0) {
                defpackage.db.AARZUJiTa("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            java.lang.Object V7bD7b8KA = defpackage.h1.V7bD7b8KA(iwVar, this.EXtogiMhuM, z, ejVar);
            if (V7bD7b8KA == vjVar) {
                return V7bD7b8KA;
            }
        } else {
            java.lang.Object IHQe1A4L2xu = super.IHQe1A4L2xu(iwVar, ejVar);
            if (IHQe1A4L2xu == vjVar) {
                return IHQe1A4L2xu;
            }
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.ub
    public final defpackage.ub adDC3e2L(defpackage.lj ljVar, int i, defpackage.t9 t9Var) {
        return new defpackage.tb(this.EXtogiMhuM, this.riuEU0zW4, ljVar, i, t9Var);
    }

    @Override // defpackage.ub
    public final java.lang.String r1MBDhnF() {
        return "channel=" + this.EXtogiMhuM;
    }

    @Override // defpackage.ub
    public final defpackage.hw xiZrDbcSW0() {
        return new defpackage.tb(this.EXtogiMhuM, this.riuEU0zW4);
    }

    public tb(defpackage.sb sbVar, boolean z, defpackage.lj ljVar, int i, defpackage.t9 t9Var) {
        super(ljVar, i, t9Var);
        this.EXtogiMhuM = sbVar;
        this.riuEU0zW4 = z;
        this.consumed$volatile = 0;
    }
}
