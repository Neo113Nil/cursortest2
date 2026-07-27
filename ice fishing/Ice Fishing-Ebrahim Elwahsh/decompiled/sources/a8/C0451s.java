package a8;

import java.util.Arrays;

/* renamed from: a8.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0451s extends K {

    /* renamed from: a, reason: collision with root package name */
    public float[] f4504a;

    /* renamed from: b, reason: collision with root package name */
    public int f4505b;

    @Override // a8.K
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f4504a, this.f4505b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // a8.K
    public final void b(int i) {
        float[] fArr = this.f4504a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4504a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4505b;
    }
}
