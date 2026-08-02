package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ozi {
    public final String a;
    public final boolean b;
    public final nxv c;
    public final p9w d;
    public final pjc e;
    public final Function0 f;

    public ozi(String str, boolean z, nxv nxvVar, p9w p9wVar, dkn dknVar, vw1 vw1Var) {
        this.a = str;
        this.b = z;
        this.c = nxvVar;
        this.d = p9wVar;
        this.e = dknVar;
        this.f = vw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozi)) {
            return false;
        }
        ozi oziVar = (ozi) obj;
        return this.a.equals(oziVar.a) && this.b == oziVar.b && this.c.equals(oziVar.c) && this.d.equals(oziVar.d) && this.e.equals(oziVar.e) && this.f.equals(oziVar.f);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + k5r.e(k5r.e(((this.a.hashCode() * 31) + 1011539331) * 31, 31, this.b), 31, false)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = v3w.h("NetworkConfig(baseUrl=", this.a, ", legacyBaseUrl=https://api.music.yandex.net/, trustAllCert=", ", fixNotModified=false, fixOOMLogger=", this.b);
        h.append(this.c);
        h.append(", httpErrorsQuota=");
        h.append(this.d);
        h.append(", libSslEnabledFlow=");
        h.append(this.e);
        h.append(", newBackendFormatErrorEnabled=");
        h.append(this.f);
        h.append(", albumByIdUsingCache=false)");
        return h.toString();
    }
}
