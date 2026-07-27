package a8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class D extends K {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4429a;

    /* renamed from: b, reason: collision with root package name */
    public int f4430b;

    @Override // a8.K
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f4429a, this.f4430b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // a8.K
    public final void b(int i) {
        long[] jArr = this.f4429a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4429a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4430b;
    }
}
