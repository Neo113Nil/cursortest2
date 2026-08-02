package defpackage;

import java.util.Comparator;

/* loaded from: classes7.dex */
public final class u681 extends wd81 {
    public static wd81 g(int i) {
        return i < 0 ? wd81.b : i > 0 ? wd81.c : wd81.a;
    }

    @Override // defpackage.wd81
    public final int a() {
        return 0;
    }

    @Override // defpackage.wd81
    public final wd81 b(int i, int i2) {
        return g(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // defpackage.wd81
    public final wd81 c(long j, long j2) {
        return g(j < j2 ? -1 : j > j2 ? 1 : 0);
    }

    @Override // defpackage.wd81
    public final wd81 d(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.wd81
    public final wd81 e(boolean z, boolean z2) {
        return g(ena1.a(z, z2));
    }

    @Override // defpackage.wd81
    public final wd81 f(boolean z, boolean z2) {
        return g(ena1.a(z2, z));
    }
}
