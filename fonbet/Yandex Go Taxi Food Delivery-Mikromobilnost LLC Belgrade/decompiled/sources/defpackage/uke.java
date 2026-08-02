package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class uke implements vke {
    public final String a;
    public final Pair b;

    public uke(String str, Pair pair) {
        this.a = str;
        this.b = pair;
    }

    @Override // defpackage.vke
    public final Pair a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uke)) {
            return false;
        }
        uke ukeVar = (uke) obj;
        return jl40.l(this.a, ukeVar.a) && jl40.l(this.b, ukeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingPageToken(nextPageToken=" + this.a + ", nameWithLogId=" + this.b + Extension.C_BRAKE;
    }
}
