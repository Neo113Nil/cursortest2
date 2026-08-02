package e8;

import java.util.Arrays;
import u7.C5088n;

/* loaded from: classes2.dex */
public final class U extends K {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f37344a;

    /* renamed from: b, reason: collision with root package name */
    public int f37345b;

    @Override // e8.K
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f37344a, this.f37345b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return new C5088n(copyOf);
    }

    @Override // e8.K
    public final void b(int i) {
        byte[] bArr = this.f37344a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f37344a = copyOf;
        }
    }

    @Override // e8.K
    public final int d() {
        return this.f37345b;
    }
}
