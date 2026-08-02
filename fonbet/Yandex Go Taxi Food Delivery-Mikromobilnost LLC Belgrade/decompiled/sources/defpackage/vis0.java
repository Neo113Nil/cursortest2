package defpackage;

import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes10.dex */
public final class vis0 {
    public static final vis0 c = new vis0(-1, -1);
    public final int a;
    public final int b;

    static {
        new vis0(0, 0);
    }

    public vis0(int i, int i2) {
        d6z.l((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof vis0) {
            vis0 vis0Var = (vis0) obj;
            if (this.a == vis0Var.a && this.b == vis0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + RemoteBioParameters.X + this.b;
    }
}
