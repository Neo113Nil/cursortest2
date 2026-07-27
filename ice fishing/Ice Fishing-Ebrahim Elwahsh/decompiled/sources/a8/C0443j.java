package a8;

import java.util.Arrays;

/* renamed from: a8.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0443j extends K {

    /* renamed from: a, reason: collision with root package name */
    public char[] f4486a;

    /* renamed from: b, reason: collision with root package name */
    public int f4487b;

    @Override // a8.K
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f4486a, this.f4487b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // a8.K
    public final void b(int i) {
        char[] cArr = this.f4486a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4486a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4487b;
    }
}
