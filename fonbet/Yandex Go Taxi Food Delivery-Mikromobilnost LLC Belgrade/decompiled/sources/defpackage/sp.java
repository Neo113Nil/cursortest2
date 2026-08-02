package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sp implements br {
    public final String a;
    public final String b;

    public sp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.br
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp)) {
            return false;
        }
        sp spVar = (sp) obj;
        return jl40.l(this.a, spVar.a) && jl40.l(this.b, spVar.b);
    }

    @Override // defpackage.br
    public final String getUrl() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("GoalTrackingLinkAction(url=", this.a, ", icookie=", this.b, Extension.C_BRAKE);
    }
}
