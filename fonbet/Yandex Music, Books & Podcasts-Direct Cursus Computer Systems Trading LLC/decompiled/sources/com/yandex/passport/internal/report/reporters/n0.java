package com.yandex.passport.internal.report.reporters;

import defpackage.dfi;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class n0 {
    public final String a;
    public final String b;
    public final p0 c;
    public final String d;

    public n0(String str, String str2, p0 p0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = p0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.a.equals(n0Var.a) && this.b.equals(n0Var.b) && this.c.equals(n0Var.c) && this.d.equals(n0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application(appId=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", amManifestVersion=");
        sb.append(this.c);
        sb.append(", signatureInfo=");
        return dfi.i(sb, this.d, ')');
    }
}
