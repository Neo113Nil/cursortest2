package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class sdb {
    public final int a;
    public final int b;

    public sdb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdb)) {
            return false;
        }
        sdb sdbVar = (sdb) obj;
        return this.a == sdbVar.a && this.b == sdbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ChatUnseenReadInfo(unreadChatsCount=", ", unreadMutedChatsCount=", Extension.C_BRAKE);
    }

    public sdb() {
        this(0, 0);
    }
}
