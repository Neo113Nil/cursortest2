package defpackage;

/* loaded from: classes.dex */
public interface ynr extends jj2 {
    @Override // defpackage.jj2
    default f531 a(gl11 gl11Var) {
        return new ofa0(this);
    }

    float b(long j, float f, float f2, float f3);

    long c(float f, float f2, float f3);

    default float d(float f, float f2, float f3) {
        return b(c(f, f2, f3), f, f2, f3);
    }

    float e(long j, float f, float f2, float f3);
}
