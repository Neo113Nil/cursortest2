package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qol0 extends mr {
    public final String a;
    public final long b;
    public final n8a c;
    public final nyc d;
    public final nyc e;
    public final oyc f;
    public final oyc g;

    public qol0(String str, long j, n8a n8aVar, nyc nycVar, nyc nycVar2, oyc oycVar, oyc oycVar2) {
        this.a = str;
        this.b = j;
        this.c = n8aVar;
        this.d = nycVar;
        this.e = nycVar2;
        this.f = oycVar;
        this.g = oycVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qol0) {
            qol0 qol0Var = (qol0) obj;
            return jl40.l(this.a, qol0Var.a) && this.b == qol0Var.b && this.c == qol0Var.c && this.d == qol0Var.d && this.e == qol0Var.e && this.f == qol0Var.f && this.g == qol0Var.g;
        }
        return false;
    }

    public final int hashCode() {
        return hashCode() + ((hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + qv10.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("SafeFlow(url=", this.a, ", canCreateOrderUntilMs=", this.b);
        l.append(", onPassed=");
        l.append(this.c);
        l.append(", onNotPassed=");
        l.append(this.d);
        l.append(", onWebViewClosed=");
        l.append(this.e);
        l.append(", beforeOpenAction=");
        l.append(this.f);
        l.append(", afterOpenAction=");
        l.append(this.g);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
