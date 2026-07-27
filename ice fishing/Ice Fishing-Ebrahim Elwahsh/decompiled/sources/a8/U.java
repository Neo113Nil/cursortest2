package a8;

import java.util.Arrays;
import q7.C4945n;

/* loaded from: classes2.dex */
public final class U extends K {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4453a;

    /* renamed from: b, reason: collision with root package name */
    public int f4454b;

    @Override // a8.K
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f4453a, this.f4454b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return new C4945n(copyOf);
    }

    @Override // a8.K
    public final void b(int i) {
        byte[] bArr = this.f4453a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4453a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4454b;
    }
}
