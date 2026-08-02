package com.yandex.passport.api;

import defpackage.vz1;

/* loaded from: classes4.dex */
public final class s2 {
    public final int a;
    public final int b;

    public s2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return this.a == s2Var.a && this.b == s2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Size(width=");
        sb.append(this.a);
        sb.append(", height=");
        return vz1.r(sb, this.b, ')');
    }
}
