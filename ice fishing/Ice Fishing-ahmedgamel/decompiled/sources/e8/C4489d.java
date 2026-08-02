package e8;

import java.util.Arrays;

/* renamed from: e8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4489d extends K {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f37360a;

    /* renamed from: b, reason: collision with root package name */
    public int f37361b;

    @Override // e8.K
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f37360a, this.f37361b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // e8.K
    public final void b(int i) {
        boolean[] zArr = this.f37360a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37360a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37361b;
    }
}
