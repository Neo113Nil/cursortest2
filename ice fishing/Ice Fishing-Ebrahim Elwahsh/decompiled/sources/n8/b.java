package n8;

import L2.i;
import u8.h;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final h f39658a;

    static {
        h hVar = h.f41278w;
        f39658a = i.n("xn--");
    }

    public static int a(int i, int i4, boolean z8) {
        int i9 = z8 ? i / com.anythink.core.common.m.a.f14558n : i / 2;
        int i10 = (i9 / i4) + i9;
        int i11 = 0;
        while (i10 > 455) {
            i10 /= 35;
            i11 += 36;
        }
        return ((i10 * 36) / (i10 + 38)) + i11;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i).toString());
    }
}
