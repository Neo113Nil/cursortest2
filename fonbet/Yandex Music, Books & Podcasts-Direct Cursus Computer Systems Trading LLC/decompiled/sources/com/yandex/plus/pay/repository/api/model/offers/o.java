package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o {
    public final n a;
    public final List b;
    public final z c;
    public final i1 d;
    public final l e;
    public final m f;
    public final ArrayList g;
    public final Boolean h;
    public final ArrayList i;
    public final String j;
    public final String k;
    public final String l;
    public final ArrayList m;
    public final b n;

    public o(n nVar, List list, z zVar, i1 i1Var, l lVar, m mVar, ArrayList arrayList, Boolean bool, ArrayList arrayList2, String str, String str2, String str3, ArrayList arrayList3, b bVar) {
        list.getClass();
        this.a = nVar;
        this.b = list;
        this.c = zVar;
        this.d = i1Var;
        this.e = lVar;
        this.f = mVar;
        this.g = arrayList;
        this.h = bool;
        this.i = arrayList2;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = arrayList3;
        this.n = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.a, oVar.a) && Intrinsics.d(this.b, oVar.b) && Intrinsics.d(this.c, oVar.c) && Intrinsics.d(this.d, oVar.d) && this.e.equals(oVar.e) && this.f.equals(oVar.f) && this.g.equals(oVar.g) && Intrinsics.d(this.h, oVar.h) && this.i.equals(oVar.i) && Intrinsics.d(this.j, oVar.j) && Intrinsics.d(this.k, oVar.k) && Intrinsics.d(this.l, oVar.l) && this.m.equals(oVar.m) && this.n.equals(oVar.n);
    }

    public final int hashCode() {
        n nVar = this.a;
        int d = k5r.d((nVar == null ? 0 : nVar.hashCode()) * 31, 31, this.b);
        z zVar = this.c;
        int hashCode = (d + (zVar == null ? 0 : zVar.hashCode())) * 31;
        i1 i1Var = this.d;
        int b = dfi.b(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (i1Var == null ? 0 : i1Var.hashCode())) * 31)) * 31)) * 31, 31);
        Boolean bool = this.h;
        int b2 = dfi.b(this.i, (b + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str = this.j;
        int hashCode2 = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        return this.n.hashCode() + dfi.b(this.m, (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "CompositeOfferDetails(tariff=" + this.a + ", option=" + this.b + ", legalInfo=" + this.c + ", promoLegalInfo=" + this.d + ", paymentText=" + this.e + ", successScreen=" + this.f + ", invoices=" + this.g + ", isSilentInvoiceAvailable=" + this.h + ", paymentMethods=" + this.i + ", mainPaymentMethod=" + this.j + ", posId=" + this.k + ", serviceToken=" + this.l + ", paymentMethodsGroups=" + this.m + ", additionalOffers=" + this.n + ')';
    }
}
