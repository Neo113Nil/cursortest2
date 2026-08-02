package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class tke implements vke {
    public final kr a;
    public final Pair b;

    public tke(kr krVar, Pair pair) {
        this.a = krVar;
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
        if (!(obj instanceof tke)) {
            return false;
        }
        tke tkeVar = (tke) obj;
        return jl40.l(this.a, tkeVar.a) && jl40.l(this.b, tkeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingOnLoadMore(onLoadMore=" + this.a + ", nameWithLogId=" + this.b + Extension.C_BRAKE;
    }
}
