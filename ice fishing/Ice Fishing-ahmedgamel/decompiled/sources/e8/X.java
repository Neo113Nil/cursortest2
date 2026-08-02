package e8;

import java.util.Arrays;
import u7.C5090p;

/* loaded from: classes2.dex */
public final class X extends K {

    /* renamed from: a, reason: collision with root package name */
    public int[] f37349a;

    /* renamed from: b, reason: collision with root package name */
    public int f37350b;

    @Override // e8.K
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f37349a, this.f37350b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return new C5090p(copyOf);
    }

    @Override // e8.K
    public final void b(int i) {
        int[] iArr = this.f37349a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37349a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37350b;
    }
}
