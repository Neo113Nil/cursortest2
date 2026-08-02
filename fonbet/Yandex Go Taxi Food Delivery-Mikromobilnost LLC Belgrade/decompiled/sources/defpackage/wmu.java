package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class wmu {
    public final int a;
    public final int b;
    public final long c;

    public wmu(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmu)) {
            return false;
        }
        wmu wmuVar = (wmu) obj;
        return this.a == wmuVar.a && this.b == wmuVar.b && this.c == wmuVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.n(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "HandleResponseResult(historyMissedChatsCount=", ", historyChangedChatsCount=", ", newMaxChatInfoVersion="));
    }
}
