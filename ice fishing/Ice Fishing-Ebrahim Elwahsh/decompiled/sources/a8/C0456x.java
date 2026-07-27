package a8;

import java.util.Arrays;

/* renamed from: a8.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0456x extends K {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4519a;

    /* renamed from: b, reason: collision with root package name */
    public int f4520b;

    @Override // a8.K
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f4519a, this.f4520b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // a8.K
    public final void b(int i) {
        int[] iArr = this.f4519a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4519a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4520b;
    }
}
