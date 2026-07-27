package e8;

import java.util.Arrays;

/* renamed from: e8.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4478j extends K {

    /* renamed from: a, reason: collision with root package name */
    public char[] f37301a;

    /* renamed from: b, reason: collision with root package name */
    public int f37302b;

    @Override // e8.K
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f37301a, this.f37302b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // e8.K
    public final void b(int i) {
        char[] cArr = this.f37301a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37301a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37302b;
    }
}
