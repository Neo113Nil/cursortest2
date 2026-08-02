package e8;

import java.util.Arrays;

/* renamed from: e8.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4503s extends K {

    /* renamed from: a, reason: collision with root package name */
    public float[] f37395a;

    /* renamed from: b, reason: collision with root package name */
    public int f37396b;

    @Override // e8.K
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f37395a, this.f37396b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // e8.K
    public final void b(int i) {
        float[] fArr = this.f37395a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37395a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37396b;
    }
}
