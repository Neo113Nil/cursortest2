package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface y extends h {
    @Override // v.h
    default j1 a(x4.s sVar) {
        return new d8.s(this);
    }

    float b(long j3, float f10, float f11, float f12);

    float c(long j3, float f10, float f11, float f12);

    long d(float f10, float f11, float f12);

    default float e(float f10, float f11, float f12) {
        return c(d(f10, f11, f12), f10, f11, f12);
    }
}
