package defpackage;

import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$LegalInfo$Item$Type;
import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$Vendor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public abstract class wad0 {
    public static final PlusPayCompositeOffers.Offer a(spd spdVar, String str, String str2, String str3) {
        PlusPayCompositeOffers.Offer.StructureType structureType;
        String str4;
        PlusPayCompositeOffers.Offer offer;
        PlusPayCompositeOffers.Offer.Tariff tariff;
        PlusPayLegalInfo.Item link;
        qpd qpdVar;
        String str5 = spdVar.a;
        int i = vad0.c[spdVar.b.ordinal()];
        if (i == 1) {
            structureType = PlusPayCompositeOffers.Offer.StructureType.TARIFF;
        } else if (i == 2) {
            structureType = PlusPayCompositeOffers.Offer.StructureType.OPTION;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            structureType = PlusPayCompositeOffers.Offer.StructureType.COMPOSITE;
        }
        List list = spdVar.d;
        String str6 = (list == null || (qpdVar = (qpd) a.R(list)) == null) ? null : qpdVar.e;
        qpd qpdVar2 = spdVar.e;
        if (qpdVar2 != null) {
            String str7 = qpdVar2.e;
            String str8 = qpdVar2.j.a;
            String str9 = qpdVar2.i;
            String str10 = qpdVar2.d;
            String str11 = qpdVar2.h;
            String str12 = qpdVar2.a;
            ipd ipdVar = qpdVar2.c;
            offer = null;
            PlusPayPrice plusPayPrice = new PlusPayPrice(ipdVar.a, ipdVar.b);
            String str13 = qpdVar2.b;
            List list2 = qpdVar2.k;
            str4 = str5;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(b((fpd) it.next()));
            }
            tariff = new PlusPayCompositeOffers.Offer.Tariff(str7, str8, str9, str10, str11, str12, plusPayPrice, str13, arrayList, c(qpdVar2.f), qpdVar2.g);
        } else {
            str4 = str5;
            offer = null;
            tariff = null;
        }
        List list3 = spdVar.f;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            qod qodVar = (qod) it2.next();
            String str14 = qodVar.e;
            String str15 = qodVar.j.a;
            String str16 = qodVar.i;
            String str17 = qodVar.d;
            String str18 = qodVar.h;
            String str19 = qodVar.a;
            ipd ipdVar2 = qodVar.c;
            PlusPayPrice plusPayPrice2 = new PlusPayPrice(ipdVar2.a, ipdVar2.b);
            String str20 = qodVar.b;
            List list4 = qodVar.k;
            Iterator it3 = it2;
            PlusPayCompositeOffers.Offer.StructureType structureType2 = structureType;
            PlusPayCompositeOffers.Offer.Tariff tariff2 = tariff;
            ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList3.add(b((fpd) it4.next()));
            }
            arrayList2.add(new PlusPayCompositeOffers.Offer.Option(str14, str15, str16, str17, str18, str19, plusPayPrice2, str20, arrayList3, c(qodVar.f), qodVar.g));
            it2 = it3;
            structureType = structureType2;
            tariff = tariff2;
        }
        PlusPayCompositeOffers.Offer.StructureType structureType3 = structureType;
        PlusPayCompositeOffers.Offer.Tariff tariff3 = tariff;
        kod kodVar = spdVar.g;
        String str21 = kodVar.a;
        List<jod> list5 = kodVar.b;
        ArrayList arrayList4 = new ArrayList(tcc.n(list5, 10));
        for (jod jodVar : list5) {
            CompositeOfferDto$LegalInfo$Item$Type compositeOfferDto$LegalInfo$Item$Type = jodVar.b;
            hod hodVar = jodVar.c;
            String str22 = jodVar.a;
            int i2 = vad0.b[compositeOfferDto$LegalInfo$Item$Type.ordinal()];
            if (i2 == 1) {
                String str23 = hodVar.a;
                String str24 = hodVar.b;
                if (str24 == null) {
                    throw new PlusPayParseException(new gzj0(new Exception("There must be link field for LINK item of legal info")));
                }
                link = new PlusPayLegalInfo.Item.Link(str22, str23, str24);
            } else {
                if (i2 != 2) {
                    w511.b();
                    return offer;
                }
                link = new PlusPayLegalInfo.Item.Text(str22, hodVar.a);
            }
            arrayList4.add(link);
        }
        String str25 = str6;
        PlusPayLegalInfo plusPayLegalInfo = new PlusPayLegalInfo(str21, arrayList4);
        List<aod> list6 = spdVar.i;
        ArrayList arrayList5 = new ArrayList(tcc.n(list6, 10));
        for (aod aodVar : list6) {
            long j = aodVar.b;
            ipd ipdVar3 = aodVar.a;
            arrayList5.add(new PlusPayCompositeOffers.Offer.Invoice(j, new PlusPayPrice(ipdVar3.a, ipdVar3.b)));
        }
        wnd wndVar = spdVar.c;
        return new PlusPayCompositeOffers.Offer(str4, structureType3, str25, tariff3, arrayList2, plusPayLegalInfo, arrayList5, false, new PlusPayCompositeOffers.Offer.Assets(wndVar.a, wndVar.b, wndVar.c), spdVar.h, new PlusPayCompositeOffers.Offer.Meta(str, str2, str3));
    }

    public static final PlusPayCompositeOffers.Offer.Plan b(fpd fpdVar) {
        if (fpdVar instanceof uod) {
            uod uodVar = (uod) fpdVar;
            String str = uodVar.b;
            ipd ipdVar = uodVar.a;
            return new PlusPayCompositeOffers.Offer.Plan.Intro(str, new PlusPayPrice(ipdVar.a, ipdVar.b), uodVar.c);
        }
        if (fpdVar instanceof xod) {
            xod xodVar = (xod) fpdVar;
            ipd ipdVar2 = xodVar.a;
            return new PlusPayCompositeOffers.Offer.Plan.IntroUntil(new PlusPayPrice(ipdVar2.a, ipdVar2.b), xodVar.b);
        }
        if (fpdVar instanceof bpd) {
            return new PlusPayCompositeOffers.Offer.Plan.Trial(((bpd) fpdVar).a);
        }
        if (fpdVar instanceof epd) {
            return new PlusPayCompositeOffers.Offer.Plan.TrialUntil(((epd) fpdVar).a);
        }
        w511.b();
        return null;
    }

    public static final PlusPayCompositeOffers.Offer.Vendor c(CompositeOfferDto$Vendor compositeOfferDto$Vendor) {
        int i = vad0.a[compositeOfferDto$Vendor.ordinal()];
        if (i == 1) {
            return PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
        }
        if (i == 2) {
            return PlusPayCompositeOffers.Offer.Vendor.NATIVE;
        }
        if (i == 3) {
            return PlusPayCompositeOffers.Offer.Vendor.UNKNOWN;
        }
        w511.b();
        return null;
    }
}
