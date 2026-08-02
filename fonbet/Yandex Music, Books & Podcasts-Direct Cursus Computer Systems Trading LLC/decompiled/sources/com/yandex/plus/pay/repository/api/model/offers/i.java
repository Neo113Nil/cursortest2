package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {
    public final String a;
    public final h b;
    public final String c;
    public final String d;
    public final com.yandex.plus.core.data.common.y e;
    public final com.yandex.plus.core.data.common.v f;
    public final com.yandex.plus.core.data.common.v g;
    public final g h;
    public final com.yandex.plus.core.data.common.b0 i;
    public final com.yandex.plus.pay.repository.api.model.widget.c j;

    public i(String str, h hVar, String str2, String str3, com.yandex.plus.core.data.common.y yVar, com.yandex.plus.core.data.common.v vVar, com.yandex.plus.core.data.common.v vVar2, g gVar, com.yandex.plus.core.data.common.b0 b0Var, com.yandex.plus.pay.repository.api.model.widget.c cVar) {
        this.a = str;
        this.b = hVar;
        this.c = str2;
        this.d = str3;
        this.e = yVar;
        this.f = vVar;
        this.g = vVar2;
        this.h = gVar;
        this.i = b0Var;
        this.j = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b == iVar.b && Intrinsics.d(this.c, iVar.c) && this.d.equals(iVar.d) && this.e.equals(iVar.e) && this.f.equals(iVar.f) && this.g.equals(iVar.g) && Intrinsics.d(this.h, iVar.h) && Intrinsics.d(this.i, iVar.i) && Intrinsics.d(this.j, iVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int f = com.appsflyer.internal.k.f(this.g, com.appsflyer.internal.k.f(this.f, (this.e.hashCode() + k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31), 31);
        g gVar = this.h;
        int hashCode2 = (f + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.yandex.plus.core.data.common.b0 b0Var = this.i;
        int hashCode3 = (hashCode2 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        com.yandex.plus.pay.repository.api.model.widget.c cVar = this.j;
        return hashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethod(id=" + this.a + ", type=" + this.b + ", bankName=" + this.c + ", title=" + this.d + ", iconUrl=" + this.e + ", textColor=" + this.f + ", backgroundColor=" + this.g + ", buttonAsset=" + this.h + ", widgetUrls=" + this.i + ", timeoutParams=" + this.j + ')';
    }
}
