package e8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class D extends K {

    /* renamed from: a, reason: collision with root package name */
    public long[] f37320a;

    /* renamed from: b, reason: collision with root package name */
    public int f37321b;

    @Override // e8.K
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f37320a, this.f37321b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // e8.K
    public final void b(int i) {
        long[] jArr = this.f37320a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37320a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37321b;
    }
}
