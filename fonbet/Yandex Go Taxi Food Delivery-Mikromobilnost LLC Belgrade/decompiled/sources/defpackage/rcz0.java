package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class rcz0 {
    public final String a;
    public final long b;

    public rcz0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcz0)) {
            return false;
        }
        rcz0 rcz0Var = (rcz0) obj;
        return this.a.equals(rcz0Var.a) && this.b == rcz0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("IntentToOpenTimeline(requestId=", this.a, ", userActionTime=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
