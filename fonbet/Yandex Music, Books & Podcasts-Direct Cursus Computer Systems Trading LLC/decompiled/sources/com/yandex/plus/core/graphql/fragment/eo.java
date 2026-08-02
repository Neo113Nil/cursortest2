package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class eo {
    public final String a;
    public final String b;
    public final fo c;
    public final boolean d;
    public final boolean e;

    public eo(String str, String str2, fo foVar, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = foVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo)) {
            return false;
        }
        eo eoVar = (eo) obj;
        return this.a.equals(eoVar.a) && this.b.equals(eoVar.b) && Intrinsics.d(this.c, eoVar.c) && this.d == eoVar.d && this.e == eoVar.e;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        fo foVar = this.c;
        return Boolean.hashCode(this.e) + k5r.e((c + (foVar == null ? 0 : foVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnStyledTextProperties(id=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", textColor=");
        sb.append(this.c);
        sb.append(", isBold=");
        sb.append(this.d);
        sb.append(", isItalic=");
        return dfi.j(sb, this.e, ')');
    }
}
