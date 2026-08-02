package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x221 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public x221(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x221)) {
            return false;
        }
        x221 x221Var = (x221) obj;
        return this.a == x221Var.a && this.b == x221Var.b && this.c == x221Var.c && this.d == x221Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", currentOrgThreadsUnread=", Extension.C_BRAKE, b64.s(this.a, this.b, "UnreadInfo(unread=", ", currentOrgUnread=", ", currentChatUnread="));
    }
}
