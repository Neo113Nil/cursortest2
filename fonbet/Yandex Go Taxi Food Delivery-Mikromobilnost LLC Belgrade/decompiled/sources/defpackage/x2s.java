package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x2s {
    public final String a;
    public final Object b;

    public x2s(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2s)) {
            return false;
        }
        x2s x2sVar = (x2s) obj;
        return jl40.l(this.a, x2sVar.a) && jl40.l(this.b, x2sVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "FormAnalyticsData(metricaLabel=" + this.a + ", meta=" + this.b + Extension.C_BRAKE;
    }
}
