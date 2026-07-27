package e8;

import java.util.Arrays;
import u7.C5100r;

/* loaded from: classes2.dex */
public final class a0 extends K {

    /* renamed from: a, reason: collision with root package name */
    public long[] f37278a;

    /* renamed from: b, reason: collision with root package name */
    public int f37279b;

    @Override // e8.K
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f37278a, this.f37279b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return new C5100r(copyOf);
    }

    @Override // e8.K
    public final void b(int i) {
        long[] jArr = this.f37278a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37278a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37279b;
    }
}
