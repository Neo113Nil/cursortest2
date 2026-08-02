package e8;

import java.util.Arrays;

/* renamed from: e8.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4495j extends K {

    /* renamed from: a, reason: collision with root package name */
    public char[] f37377a;

    /* renamed from: b, reason: collision with root package name */
    public int f37378b;

    @Override // e8.K
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f37377a, this.f37378b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // e8.K
    public final void b(int i) {
        char[] cArr = this.f37377a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37377a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37378b;
    }
}
