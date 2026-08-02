package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yd80 {
    public final int a;
    public final int b;
    public final int c;

    public yd80(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd80)) {
            return false;
        }
        yd80 yd80Var = (yd80) obj;
        return this.a == yd80Var.a && this.b == yd80Var.b && this.c == yd80Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "OrgUnreadChatsInfo(unreadChatsCount=", ", unreadMutedChatsCount=", ", unreadThreadsCount="));
    }

    public yd80() {
        this(0, 0, 0);
    }
}
