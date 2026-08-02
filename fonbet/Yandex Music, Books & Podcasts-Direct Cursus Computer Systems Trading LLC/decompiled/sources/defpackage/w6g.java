package defpackage;

/* loaded from: classes3.dex */
public final class w6g {
    public final t6k a = new t6k(0.0f);
    public final v6k b = new v6k(1);
    public final x6k c = szf.g0(Boolean.FALSE);
    public final t6k d = new t6k(1.0f);

    public w6g(float f, float f2, long j, boolean z) {
        a(f, f2, j, z);
    }

    public final void a(float f, float f2, long j, boolean z) {
        this.a.h(yhn.c(f, 0.0f, 1.0f));
        this.b.i(j);
        this.c.setValue(Boolean.valueOf(z));
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.d.h(f2);
    }
}
