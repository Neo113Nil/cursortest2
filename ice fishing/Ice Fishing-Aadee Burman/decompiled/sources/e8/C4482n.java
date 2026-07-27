package e8;

import java.util.Arrays;

/* renamed from: e8.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4482n extends K {

    /* renamed from: a, reason: collision with root package name */
    public double[] f37307a;

    /* renamed from: b, reason: collision with root package name */
    public int f37308b;

    @Override // e8.K
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f37307a, this.f37308b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // e8.K
    public final void b(int i) {
        double[] dArr = this.f37307a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37307a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37308b;
    }
}
