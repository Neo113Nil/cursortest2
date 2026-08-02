package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class rke implements vke {
    public final Pair a;

    public rke(Pair pair) {
        this.a = pair;
    }

    @Override // defpackage.vke
    public final Pair a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rke) && jl40.l(this.a, ((rke) obj).a);
    }

    public final int hashCode() {
        Pair pair = this.a;
        if (pair == null) {
            return 0;
        }
        return pair.hashCode();
    }

    public final String toString() {
        return "Absent(nameWithLogId=" + this.a + Extension.C_BRAKE;
    }
}
