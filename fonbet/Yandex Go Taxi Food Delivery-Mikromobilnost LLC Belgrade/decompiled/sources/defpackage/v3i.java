package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v3i implements uni {
    public final long a;
    public final String b;

    public v3i(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3i)) {
            return false;
        }
        v3i v3iVar = (v3i) obj;
        return this.a == v3iVar.a && jl40.l(this.b, v3iVar.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder k = x4e.k("DeliveryDashboardArgs(dashboardLoadingTimeoutMs=", this.a, ", inputPoint=", this.b);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }

    public v3i() {
        this(10000L, null);
    }
}
