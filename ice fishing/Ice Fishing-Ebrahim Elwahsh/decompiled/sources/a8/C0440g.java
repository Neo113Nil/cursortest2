package a8;

import java.util.Arrays;

/* renamed from: a8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0440g extends K {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4479a;

    /* renamed from: b, reason: collision with root package name */
    public int f4480b;

    @Override // a8.K
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f4479a, this.f4480b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // a8.K
    public final void b(int i) {
        byte[] bArr = this.f4479a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4479a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4480b;
    }
}
