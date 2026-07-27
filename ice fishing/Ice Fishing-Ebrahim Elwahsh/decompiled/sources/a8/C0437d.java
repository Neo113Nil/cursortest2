package a8;

import java.util.Arrays;

/* renamed from: a8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0437d extends K {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f4469a;

    /* renamed from: b, reason: collision with root package name */
    public int f4470b;

    @Override // a8.K
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f4469a, this.f4470b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // a8.K
    public final void b(int i) {
        boolean[] zArr = this.f4469a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4469a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4470b;
    }
}
