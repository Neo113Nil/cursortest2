package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q2v implements pi5 {
    public final long a;
    public final int b;
    public final x26 c;

    public q2v(long j, int i, x26 x26Var) {
        this.a = j;
        this.b = i;
        this.c = x26Var;
    }

    @Override // defpackage.pi5
    public final v26 a() {
        return this.c;
    }

    @Override // defpackage.pi5
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2v)) {
            return false;
        }
        q2v q2vVar = (q2v) obj;
        return this.a == q2vVar.a && this.b == q2vVar.b && this.c.equals(q2vVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "IBeaconBeaconInfo(lastSeen=" + this.a + ", smoothedRssi=" + this.b + ", beacon=" + this.c + Extension.C_BRAKE;
    }
}
