package com.yandex.plus.pay.internal.model.mappers;

import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.data.mb.dto.a0;
import com.yandex.plus.pay.data.mb.dto.b0;
import com.yandex.plus.pay.data.mb.dto.h0;
import com.yandex.plus.pay.data.mb.dto.i1;
import com.yandex.plus.pay.data.mb.dto.l0;
import com.yandex.plus.pay.data.mb.dto.l1;
import com.yandex.plus.pay.data.mb.dto.o0;
import com.yandex.plus.pay.data.mb.dto.q;
import com.yandex.plus.pay.data.mb.dto.s0;
import com.yandex.plus.pay.data.mb.dto.v0;
import com.yandex.plus.pay.data.mb.dto.w0;
import com.yandex.plus.pay.data.mb.dto.x;
import com.yandex.plus.pay.data.mb.dto.z;
import com.yandex.plus.pay.data.mb.dto.z0;
import defpackage.b6e;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public abstract class b {
    public static final PlusPayCompositeOffers.Offer a(l1 l1Var, String str, String str2, String str3) {
        PlusPayCompositeOffers.Offer.StructureType structureType;
        String str4;
        PlusPayCompositeOffers.Offer.Tariff tariff;
        PlusPayLegalInfo.Item link;
        PlusPayCompositeOffers.Offer.Vendor vendor;
        PlusPayCompositeOffers.Offer.Vendor vendor2;
        i1 i1Var;
        l1Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        String str5 = l1Var.a;
        int ordinal = l1Var.b.ordinal();
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
        List list = l1Var.d;
        String str6 = (list == null || (i1Var = (i1) CollectionsKt.firstOrNull(list)) == null) ? null : i1Var.e;
        i1 i1Var2 = l1Var.e;
        if (i1Var2 != null) {
            String str7 = i1Var2.e;
            String str8 = i1Var2.j.a;
            String str9 = i1Var2.i;
            String str10 = i1Var2.d;
            String str11 = i1Var2.h;
            String str12 = i1Var2.a;
            z0 z0Var = i1Var2.c;
            PlusPayPrice plusPayPrice = new PlusPayPrice(z0Var.a, z0Var.b);
            String str13 = i1Var2.b;
            List list2 = i1Var2.k;
            str4 = str5;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(b((w0) it.next()));
            }
            int ordinal2 = i1Var2.f.ordinal();
            if (ordinal2 == 0) {
                vendor2 = PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
            } else if (ordinal2 == 1) {
                vendor2 = PlusPayCompositeOffers.Offer.Vendor.NATIVE;
            } else {
                if (ordinal2 != 2) {
                    b6e.s();
                    return null;
                }
                vendor2 = PlusPayCompositeOffers.Offer.Vendor.UNKNOWN;
            }
            tariff = new PlusPayCompositeOffers.Offer.Tariff(str7, str8, str9, str10, str11, str12, plusPayPrice, str13, arrayList, vendor2, i1Var2.g);
        } else {
            str4 = str5;
            tariff = null;
        }
        List list3 = l1Var.f;
        String str14 = str6;
        ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            h0 h0Var = (h0) it2.next();
            String str15 = h0Var.e;
            String str16 = h0Var.j.a;
            String str17 = h0Var.i;
            String str18 = h0Var.d;
            String str19 = h0Var.h;
            String str20 = h0Var.a;
            z0 z0Var2 = h0Var.c;
            PlusPayPrice plusPayPrice2 = new PlusPayPrice(z0Var2.a, z0Var2.b);
            String str21 = h0Var.b;
            List list4 = h0Var.k;
            Iterator it3 = it2;
            PlusPayCompositeOffers.Offer.StructureType structureType2 = structureType;
            String str22 = str14;
            ArrayList arrayList3 = new ArrayList(v75.o(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList3.add(b((w0) it4.next()));
            }
            int ordinal3 = h0Var.f.ordinal();
            if (ordinal3 == 0) {
                vendor = PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
            } else if (ordinal3 == 1) {
                vendor = PlusPayCompositeOffers.Offer.Vendor.NATIVE;
            } else {
                if (ordinal3 != 2) {
                    b6e.s();
                    return null;
                }
                vendor = PlusPayCompositeOffers.Offer.Vendor.UNKNOWN;
            }
            arrayList2.add(new PlusPayCompositeOffers.Offer.Option(str15, str16, str17, str18, str19, str20, plusPayPrice2, str21, arrayList3, vendor, h0Var.g));
            it2 = it3;
            structureType = structureType2;
            str14 = str22;
        }
        PlusPayCompositeOffers.Offer.StructureType structureType3 = structureType;
        String str23 = str14;
        b0 b0Var = l1Var.g;
        String str24 = b0Var.a;
        List<a0> list5 = b0Var.b;
        ArrayList arrayList4 = new ArrayList(v75.o(list5, 10));
        for (a0 a0Var : list5) {
            z zVar = a0Var.b;
            x xVar = a0Var.c;
            String str25 = a0Var.a;
            int ordinal4 = zVar.ordinal();
            if (ordinal4 == 0) {
                String str26 = xVar.a;
                String str27 = xVar.b;
                if (str27 == null) {
                    throw new PlusPayParseException(new com.yandex.plus.home.common.network.e(new Exception("There must be link field for LINK item of legal info")));
                }
                link = new PlusPayLegalInfo.Item.Link(str25, str26, str27);
            } else {
                if (ordinal4 != 1) {
                    b6e.s();
                    return null;
                }
                link = new PlusPayLegalInfo.Item.Text(str25, xVar.a);
            }
            arrayList4.add(link);
        }
        PlusPayLegalInfo plusPayLegalInfo = new PlusPayLegalInfo(str24, arrayList4);
        List<q> list6 = l1Var.i;
        ArrayList arrayList5 = new ArrayList(v75.o(list6, 10));
        for (q qVar : list6) {
            long j = qVar.b;
            z0 z0Var3 = qVar.a;
            arrayList5.add(new PlusPayCompositeOffers.Offer.Invoice(j, new PlusPayPrice(z0Var3.a, z0Var3.b)));
        }
        com.yandex.plus.pay.data.mb.dto.m mVar = l1Var.c;
        return new PlusPayCompositeOffers.Offer(str4, structureType3, str23, tariff, arrayList2, plusPayLegalInfo, arrayList5, false, new PlusPayCompositeOffers.Offer.Assets(mVar.a, mVar.b, mVar.c), l1Var.h, new PlusPayCompositeOffers.Offer.Meta(str, str2, str3));
    }

    public static final PlusPayCompositeOffers.Offer.Plan b(w0 w0Var) {
        if (w0Var instanceof l0) {
            l0 l0Var = (l0) w0Var;
            String str = l0Var.b;
            z0 z0Var = l0Var.a;
            return new PlusPayCompositeOffers.Offer.Plan.Intro(str, new PlusPayPrice(z0Var.a, z0Var.b), l0Var.c);
        }
        if (w0Var instanceof o0) {
            o0 o0Var = (o0) w0Var;
            z0 z0Var2 = o0Var.a;
            return new PlusPayCompositeOffers.Offer.Plan.IntroUntil(new PlusPayPrice(z0Var2.a, z0Var2.b), o0Var.b);
        }
        if (w0Var instanceof s0) {
            return new PlusPayCompositeOffers.Offer.Plan.Trial(((s0) w0Var).a);
        }
        if (w0Var instanceof v0) {
            return new PlusPayCompositeOffers.Offer.Plan.TrialUntil(((v0) w0Var).a);
        }
        b6e.s();
        return null;
    }
}
