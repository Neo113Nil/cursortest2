package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xn {
    public final String a;
    public final tn b;
    public final vn c;
    public final un d;

    public xn(String str, tn tnVar, vn vnVar, un unVar) {
        str.getClass();
        this.a = str;
        this.b = tnVar;
        this.c = vnVar;
        this.d = unVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) obj;
        return Intrinsics.d(this.a, xnVar.a) && Intrinsics.d(this.b, xnVar.b) && Intrinsics.d(this.c, xnVar.c) && Intrinsics.d(this.d, xnVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tn tnVar = this.b;
        int hashCode2 = (hashCode + (tnVar == null ? 0 : tnVar.a.hashCode())) * 31;
        vn vnVar = this.c;
        int hashCode3 = (hashCode2 + (vnVar == null ? 0 : vnVar.hashCode())) * 31;
        un unVar = this.d;
        return hashCode3 + (unVar != null ? unVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "StrictPlaqueAction(__typename=" + this.a + ", onDeeplinkCrossAction=" + this.b + ", onServiceSpecificCrossAction=" + this.c + ", onJustInteractCrossAction=" + this.d + ')';
    }
}
