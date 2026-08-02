package defpackage;

/* loaded from: classes.dex */
public final class dit implements cjc {
    public final aqi a;

    public dit(aqi aqiVar) {
        this.a = aqiVar;
    }

    @Override // defpackage.cjc
    public final float e() {
        return ((Number) this.a.getValue()).floatValue();
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return (Float) this.a.getValue();
    }

    public final String toString() {
        return "UnboxedFloatState(baseState=" + this.a + ")@" + hashCode();
    }
}
