package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.f1d;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ w0(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, u0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && this.b == w0Var.b && this.c == w0Var.c && this.d == w0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndentDto(indentLeft=");
        sb.append(this.a);
        sb.append(", indentRight=");
        sb.append(this.b);
        sb.append(", indentTop=");
        sb.append(this.c);
        sb.append(", indentBottom=");
        return vz1.r(sb, this.d, ')');
    }

    public w0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
