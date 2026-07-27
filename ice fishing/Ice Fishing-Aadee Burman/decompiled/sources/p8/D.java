package p8;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f39810a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f39811b = new int[10];

    public final int a() {
        if ((this.f39810a & 16) != 0) {
            return this.f39811b[4];
        }
        return 65535;
    }

    public final void b(D other) {
        kotlin.jvm.internal.h.e(other, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & other.f39810a) != 0) {
                c(i, other.f39811b[i]);
            }
        }
    }

    public final void c(int i, int i6) {
        if (i >= 0) {
            int[] iArr = this.f39811b;
            if (i >= iArr.length) {
                return;
            }
            this.f39810a = (1 << i) | this.f39810a;
            iArr[i] = i6;
        }
    }
}
