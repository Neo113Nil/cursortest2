package r8;

import x.C5175n;
import y8.h;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final h f40233a;

    static {
        h hVar = h.f41925w;
        f40233a = C5175n.d("xn--");
    }

    public static int a(int i, int i4, boolean z6) {
        int i6 = z6 ? i / com.anythink.core.common.m.a.f15187n : i / 2;
        int i9 = (i6 / i4) + i6;
        int i10 = 0;
        while (i9 > 455) {
            i9 /= 35;
            i10 += 36;
        }
        return ((i9 * 36) / (i9 + 38)) + i10;
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
