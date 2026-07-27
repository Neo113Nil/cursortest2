package e8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class d0 extends K {

    /* renamed from: a, reason: collision with root package name */
    public short[] f37286a;

    /* renamed from: b, reason: collision with root package name */
    public int f37287b;

    @Override // e8.K
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f37286a, this.f37287b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return new u7.u(copyOf);
    }

    @Override // e8.K
    public final void b(int i) {
        short[] sArr = this.f37286a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37286a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37287b;
    }
}
