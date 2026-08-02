package com.yandex.plus.pay.internal.model.mappers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.repository.api.model.offers.a0;
import com.yandex.plus.pay.repository.api.model.offers.b0;
import com.yandex.plus.pay.repository.api.model.offers.c0;
import com.yandex.plus.pay.repository.api.model.offers.d0;
import com.yandex.plus.pay.repository.api.model.offers.e0;
import com.yandex.plus.pay.repository.api.model.offers.f0;
import com.yandex.plus.pay.repository.api.model.offers.g0;
import com.yandex.plus.pay.repository.api.model.offers.h0;
import com.yandex.plus.pay.repository.api.model.offers.j0;
import com.yandex.plus.pay.repository.api.model.offers.k0;
import com.yandex.plus.pay.repository.api.model.offers.l0;
import com.yandex.plus.pay.repository.api.model.offers.n0;
import com.yandex.plus.pay.repository.api.model.offers.z;
import defpackage.b6e;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c {
    public final i a;
    public final g b;

    public c(i iVar, g gVar) {
        iVar.getClass();
        gVar.getClass();
        this.a = iVar;
        this.b = gVar;
    }

    public static PlusPayCompositeOffers.Offer.Vendor b(k0 k0Var) {
        int ordinal = k0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return PlusPayCompositeOffers.Offer.Vendor.NATIVE;
                }
                if (ordinal != 4) {
                    b6e.s();
                    return null;
                }
            }
        }
        return PlusPayCompositeOffers.Offer.Vendor.UNKNOWN;
    }

    public final PlusPayCompositeOffers.Offer.Plan a(h0 h0Var) {
        boolean z = h0Var instanceof d0;
        i iVar = this.a;
        if (z) {
            d0 d0Var = (d0) h0Var;
            String str = d0Var.a;
            n0 n0Var = d0Var.b;
            iVar.getClass();
            return new PlusPayCompositeOffers.Offer.Plan.Intro(str, i.a(n0Var), d0Var.c);
        }
        if (h0Var instanceof e0) {
            e0 e0Var = (e0) h0Var;
            n0 n0Var2 = e0Var.a;
            iVar.getClass();
            return new PlusPayCompositeOffers.Offer.Plan.IntroUntil(i.a(n0Var2), e0Var.b);
        }
        if (h0Var instanceof f0) {
            return new PlusPayCompositeOffers.Offer.Plan.Trial(((f0) h0Var).a);
        }
        if (h0Var instanceof g0) {
            return new PlusPayCompositeOffers.Offer.Plan.TrialUntil(((g0) h0Var).a);
        }
        b6e.s();
        return null;
    }

    public final PlusPayCompositeOffers.Offer c(l0 l0Var, String str, String str2, String str3, boolean z) {
        PlusPayCompositeOffers.Offer.StructureType structureType;
        String str4;
        PlusPayCompositeOffers.Offer.StructureType structureType2;
        String str5;
        PlusPayCompositeOffers.Offer.Tariff tariff;
        String str6 = l0Var.a;
        int ordinal = l0Var.b.ordinal();
        if (ordinal == 0) {
            structureType = PlusPayCompositeOffers.Offer.StructureType.TARIFF;
        } else if (ordinal == 1) {
            structureType = PlusPayCompositeOffers.Offer.StructureType.OPTION;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            structureType = PlusPayCompositeOffers.Offer.StructureType.COMPOSITE;
        }
        String str7 = l0Var.c;
        j0 j0Var = l0Var.d;
        i iVar = this.a;
        if (j0Var != null) {
            String str8 = j0Var.a;
            String str9 = j0Var.b;
            String str10 = j0Var.c;
            String str11 = j0Var.d;
            String str12 = j0Var.e;
            String str13 = j0Var.f;
            n0 n0Var = j0Var.g;
            iVar.getClass();
            PlusPayPrice a = i.a(n0Var);
            String str14 = j0Var.h;
            str4 = str6;
            ArrayList arrayList = j0Var.i;
            structureType2 = structureType;
            str5 = str7;
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(a((h0) it.next()));
            }
            tariff = new PlusPayCompositeOffers.Offer.Tariff(str8, str9, str10, str11, str12, str13, a, str14, arrayList2, b(j0Var.j), j0Var.k);
        } else {
            str4 = str6;
            structureType2 = structureType;
            str5 = str7;
            tariff = null;
        }
        PlusPayCompositeOffers.Offer.Tariff tariff2 = tariff;
        ArrayList arrayList3 = l0Var.e;
        i iVar2 = iVar;
        ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            c0 c0Var = (c0) it2.next();
            String str15 = c0Var.a;
            String str16 = c0Var.b;
            String str17 = c0Var.c;
            String str18 = c0Var.d;
            String str19 = c0Var.e;
            String str20 = c0Var.f;
            n0 n0Var2 = c0Var.g;
            iVar2.getClass();
            PlusPayPrice a2 = i.a(n0Var2);
            String str21 = c0Var.h;
            Iterator it3 = it2;
            ArrayList arrayList5 = c0Var.i;
            i iVar3 = iVar2;
            PlusPayCompositeOffers.Offer.Tariff tariff3 = tariff2;
            ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(a((h0) it4.next()));
            }
            arrayList4.add(new PlusPayCompositeOffers.Offer.Option(str15, str16, str17, str18, str19, str20, a2, str21, arrayList6, b(c0Var.j), c0Var.k));
            it2 = it3;
            iVar2 = iVar3;
            tariff2 = tariff3;
        }
        i iVar4 = iVar2;
        PlusPayCompositeOffers.Offer.Tariff tariff4 = tariff2;
        z zVar = l0Var.f;
        this.b.getClass();
        PlusPayLegalInfo a3 = g.a(zVar);
        ArrayList<b0> arrayList7 = l0Var.g;
        ArrayList arrayList8 = new ArrayList(v75.o(arrayList7, 10));
        for (b0 b0Var : arrayList7) {
            long j = b0Var.a;
            n0 n0Var3 = b0Var.b;
            iVar4.getClass();
            arrayList8.add(new PlusPayCompositeOffers.Offer.Invoice(j, i.a(n0Var3)));
        }
        a0 a0Var = l0Var.h;
        return new PlusPayCompositeOffers.Offer(str4, structureType2, str5, tariff4, arrayList4, a3, arrayList8, z, new PlusPayCompositeOffers.Offer.Assets(a0Var.a, a0Var.b, a0Var.c), l0Var.i, new PlusPayCompositeOffers.Offer.Meta(str, str2, str3));
    }

    public final PlusPayCompositeOffers d(String str, com.yandex.plus.pay.repository.api.model.offers.p pVar) {
        str.getClass();
        pVar.getClass();
        String str2 = pVar.a;
        String str3 = pVar.b;
        ArrayList arrayList = pVar.c;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str4 = str;
            arrayList2.add(c((l0) it.next(), str2, str4, str3, false));
            str = str4;
        }
        return new PlusPayCompositeOffers(str2, str3, arrayList2, str);
    }
}
