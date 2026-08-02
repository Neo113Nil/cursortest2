package com.yandex.plus.core.graphql.fragment;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vb {
    public final String a;
    public final String b;
    public final ub c;
    public final tb d;
    public final sb e;

    public vb(String str, String str2, ub ubVar, tb tbVar, sb sbVar) {
        this.a = str;
        this.b = str2;
        this.c = ubVar;
        this.d = tbVar;
        this.e = sbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb)) {
            return false;
        }
        vb vbVar = (vb) obj;
        return this.a.equals(vbVar.a) && this.b.equals(vbVar.b) && this.c.equals(vbVar.c) && this.d.equals(vbVar.d) && Intrinsics.d(this.e, vbVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        sb sbVar = this.e;
        return hashCode + (sbVar == null ? 0 : sbVar.hashCode());
    }

    public final String toString() {
        return "PaymentMethod(id=" + this.a + ", title=" + this.b + ", lightTheme=" + this.c + ", darkTheme=" + this.d + ", asset=" + this.e + ')';
    }
}
