package defpackage;

import ru.yandex.music.utils.Assertions;

/* loaded from: classes6.dex */
public final class t0u {
    public static final /* synthetic */ int d = 0;
    public final boolean a;
    public final boolean b;
    public final int c;

    static {
        new t0u(24026391, false);
    }

    public t0u(int i, boolean z) {
        this.c = i;
        this.b = z;
        boolean z2 = false;
        boolean z3 = (i == 24026391 || i == -1) ? false : true;
        this.a = z3;
        if (z && z3) {
            z2 = true;
        }
        Assertions.assertFalse(z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VersionInfo{isVersionChanged=");
        sb.append(this.a);
        sb.append(", isCleanSetup=");
        sb.append(this.b);
        sb.append(", from=");
        return vz1.r(sb, this.c, '}');
    }
}
