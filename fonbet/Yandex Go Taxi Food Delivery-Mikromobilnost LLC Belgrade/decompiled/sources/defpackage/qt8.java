package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.ui.e;

/* loaded from: classes4.dex */
public final class qt8 implements ut8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final e e;
    public final bu8 f;

    public qt8(String str, String str2, String str3, String str4, e eVar, bu8 bu8Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = eVar;
        this.f = bu8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qt8) {
            qt8 qt8Var = (qt8) obj;
            return jl40.l(this.a, qt8Var.a) && jl40.l(this.b, qt8Var.b) && jl40.l(this.c, qt8Var.c) && jl40.l(this.d, qt8Var.d) && this.e == qt8Var.e && this.f == qt8Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Failure(title=", this.a, ", subtitle=", this.b, ", retryButtonText=");
        g8e.D(v, this.c, ", nextButtonText=", this.d, ", onRetry=");
        v.append(this.e);
        v.append(", onNext=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
