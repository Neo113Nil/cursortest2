package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class bl5 extends dl5 {
    public static dl5 f(int i) {
        return i < 0 ? dl5.b : i > 0 ? dl5.c : dl5.a;
    }

    @Override // defpackage.dl5
    public final dl5 a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.dl5
    public final dl5 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.dl5
    public final dl5 c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.dl5
    public final dl5 d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.dl5
    public final int e() {
        return 0;
    }
}
