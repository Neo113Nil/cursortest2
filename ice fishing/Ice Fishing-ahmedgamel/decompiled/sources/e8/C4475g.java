package e8;

import java.util.Arrays;

/* renamed from: e8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4475g extends K {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37294a;

    /* renamed from: b, reason: collision with root package name */
    public int f37295b;

    @Override // e8.K
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f37294a, this.f37295b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // e8.K
    public final void b(int i) {
        byte[] bArr = this.f37294a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37294a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37295b;
    }
}
