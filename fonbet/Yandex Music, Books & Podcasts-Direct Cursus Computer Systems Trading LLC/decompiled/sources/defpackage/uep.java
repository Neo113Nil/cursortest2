package defpackage;

/* loaded from: classes.dex */
public abstract class uep {
    public static final zm0 a = new zm0(Float.NaN, Float.NaN);
    public static final oct b;
    public static final long c;
    public static final b9r d;

    static {
        dpo dpoVar = dpo.J;
        dpo dpoVar2 = dpo.K;
        oct octVar = azt.a;
        b = new oct(dpoVar, dpoVar2);
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new b9r(3, new enj(floatToRawIntBits));
    }
}
