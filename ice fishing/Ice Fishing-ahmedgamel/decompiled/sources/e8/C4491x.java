package e8;

import java.util.Arrays;

/* renamed from: e8.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4491x extends K {

    /* renamed from: a, reason: collision with root package name */
    public int[] f37334a;

    /* renamed from: b, reason: collision with root package name */
    public int f37335b;

    @Override // e8.K
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f37334a, this.f37335b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // e8.K
    public final void b(int i) {
        int[] iArr = this.f37334a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37334a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37335b;
    }
}
