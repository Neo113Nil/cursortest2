package com.yandex.passport.data.network;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class k2 {
    public final com.yandex.passport.data.models.g a;
    public final String b;

    public k2(com.yandex.passport.data.models.g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.a.equals(k2Var.a) && this.b.equals(k2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", deviceId=");
        return dfi.i(sb, this.b, ')');
    }
}
