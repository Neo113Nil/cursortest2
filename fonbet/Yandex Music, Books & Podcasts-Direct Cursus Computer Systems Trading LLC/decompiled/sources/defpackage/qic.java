package defpackage;

/* loaded from: classes.dex */
public interface qic extends tm0 {
    @Override // defpackage.tm0
    default rzt a(oct octVar) {
        return new bjt(this);
    }

    default float b(float f, float f2, float f3) {
        return d(e(f, f2, f3), f, f2, f3);
    }

    float c(long j, float f, float f2, float f3);

    float d(long j, float f, float f2, float f3);

    long e(float f, float f2, float f3);
}
