package com.yandex.passport.data.network;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class h1 {
    public final com.yandex.passport.data.models.g a;
    public final String b;

    public h1(com.yandex.passport.data.models.g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.a.equals(h1Var.a) && this.b.equals(h1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        return dfi.i(sb, this.b, ')');
    }
}
