package defpackage;

/* loaded from: classes.dex */
public final class e80 implements defpackage.ki0, defpackage.t70 {
    public final /* synthetic */ defpackage.t70 adDC3e2L;
    public final defpackage.w90 xiZrDbcSW0;

    public e80(defpackage.t70 t70Var, defpackage.w90 w90Var) {
        this.adDC3e2L = t70Var;
        this.xiZrDbcSW0 = w90Var;
    }

    @Override // defpackage.qn
    public final long AQHddgaEX(float f) {
        return this.adDC3e2L.AQHddgaEX(f);
    }

    @Override // defpackage.qn
    public final float EXtogiMhuM() {
        return this.adDC3e2L.EXtogiMhuM();
    }

    @Override // defpackage.qn
    public final float EgCjBq0SZwJ(float f) {
        return this.adDC3e2L.EgCjBq0SZwJ(f);
    }

    @Override // defpackage.qn
    public final long G3OKOH3wZRC(float f) {
        return this.adDC3e2L.G3OKOH3wZRC(f);
    }

    @Override // defpackage.qn
    public final float QPwENk36pDC(long j) {
        return this.adDC3e2L.QPwENk36pDC(j);
    }

    @Override // defpackage.qn
    public final float UsuH8pd5P(long j) {
        return this.adDC3e2L.UsuH8pd5P(j);
    }

    @Override // defpackage.t70
    public final boolean cnag84Bm() {
        return this.adDC3e2L.cnag84Bm();
    }

    @Override // defpackage.qn
    public final float d6FAb9xVJ8GU(int i) {
        return this.adDC3e2L.d6FAb9xVJ8GU(i);
    }

    @Override // defpackage.t70
    public final defpackage.w90 getLayoutDirection() {
        return this.xiZrDbcSW0;
    }

    @Override // defpackage.qn
    public final long hkbnNdmy(long j) {
        return this.adDC3e2L.hkbnNdmy(j);
    }

    @Override // defpackage.qn
    public final long kd6TUFXn(long j) {
        return this.adDC3e2L.kd6TUFXn(j);
    }

    @Override // defpackage.qn
    public final float oh6vYeIP() {
        return this.adDC3e2L.oh6vYeIP();
    }

    @Override // defpackage.ki0
    public final defpackage.ji0 p4kuH6PDtgom(int i, int i2, java.util.Map map, defpackage.g00 g00Var, defpackage.g00 g00Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.x50.oh6vYeIP("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new defpackage.d80(i, i2, map, g00Var);
    }

    @Override // defpackage.qn
    public final float qvFH3dnF(float f) {
        return this.adDC3e2L.qvFH3dnF(f);
    }

    @Override // defpackage.qn
    public final int yIx6ChFVk(float f) {
        return this.adDC3e2L.yIx6ChFVk(f);
    }
}
