package e8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class P extends K {

    /* renamed from: a, reason: collision with root package name */
    public short[] f37337a;

    /* renamed from: b, reason: collision with root package name */
    public int f37338b;

    @Override // e8.K
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f37337a, this.f37338b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // e8.K
    public final void b(int i) {
        short[] sArr = this.f37337a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37337a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37338b;
    }
}
