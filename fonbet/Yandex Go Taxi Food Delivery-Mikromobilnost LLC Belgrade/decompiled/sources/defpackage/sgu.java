package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class sgu {

    @xuf0(tag = 2)
    public final long hideTimestamp;

    @xuf0(tag = 1)
    public final String userId;

    public sgu(String str, long j) {
        this.userId = str;
        this.hideTimestamp = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgu)) {
            return false;
        }
        sgu sguVar = (sgu) obj;
        return jl40.l(this.userId, sguVar.userId) && this.hideTimestamp == sguVar.hideTimestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.hideTimestamp) + (this.userId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("HideChat(userId=", this.userId, ", hideTimestamp=", this.hideTimestamp);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
