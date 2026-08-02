package defpackage;

import android.location.Location;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.analytics.SimpleOrderAddressAnalyticsData;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart;
import com.yandex.go.preorder.source.altpins.b;
import com.yandex.go.zone.dto.objects.DeliveryExtra;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.response.Selector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public final class yax0 {
    public final eqe a;
    public final qex0 b;
    public final jgv c;
    public final sze0 d;

    public yax0(eqe eqeVar, qex0 qex0Var, jgv jgvVar, sze0 sze0Var) {
        this.a = eqeVar;
        this.b = qex0Var;
        this.c = jgvVar;
        this.d = sze0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nu1 a(gx1 gx1Var, Alternatives.RequirementOptionDto requirementOptionDto, ServiceLevel serviceLevel, String str) {
        String str2;
        Alternatives.ListItem listItem;
        nu1 nu1Var;
        qu1 qu1Var;
        String str3;
        String str4;
        n7v i;
        n7v i2;
        String str5;
        String str6;
        Alternatives.Redirect redirect;
        Alternatives.DeliveryIntervalListItem deliveryIntervalListItem;
        ru1 ru1Var;
        String str7;
        ou1 ou1Var;
        ay1 c = c(requirementOptionDto, serviceLevel);
        DeliveryExtra deliveryExtra = serviceLevel.N;
        if (deliveryExtra == null || (str2 = deliveryExtra.getA()) == null) {
            str2 = str;
        }
        Alternatives.ListItem listItem2 = requirementOptionDto.c;
        Alternatives.DeliveryIntervalListItem deliveryIntervalListItem2 = requirementOptionDto.j;
        if (listItem2 == null && deliveryIntervalListItem2 != null) {
            listItem2 = new Alternatives.ListItem(0);
        } else if (listItem2 == null) {
            return null;
        }
        int a = listItem2.getA();
        String b = listItem2.getB();
        String c2 = listItem2.getC();
        String d = listItem2.getD();
        FormattedText f = listItem2.getF();
        String e = listItem2.getE();
        Alternatives.Badge g = listItem2.getG();
        if (g != null) {
            nu1Var = null;
            listItem = listItem2;
            qu1Var = new qu1(g.getA(), g.getB(), g.getC());
        } else {
            listItem = listItem2;
            nu1Var = null;
            qu1Var = null;
        }
        n7v h = listItem.getH();
        jgv jgvVar = this.c;
        String a2 = jgvVar.a(h);
        n7v h2 = listItem.getH();
        if (h2 == null || (str4 = h2.b) == null) {
            n7v h3 = listItem.getH();
            if (h3 != null) {
                str4 = h3.c;
            } else {
                str3 = nu1Var;
                String a3 = jgvVar.a(listItem.getI());
                i = listItem.getI();
                if (i != null || (str6 = i.b) == null) {
                    i2 = listItem.getI();
                    if (i2 != null) {
                        str5 = nu1Var;
                        redirect = requirementOptionDto.d;
                        if (redirect == null) {
                            deliveryIntervalListItem = deliveryIntervalListItem2;
                            ru1Var = new ru1(redirect.getA(), redirect.getB());
                        } else {
                            deliveryIntervalListItem = deliveryIntervalListItem2;
                            ru1Var = nu1Var;
                        }
                        su1 su1Var = new su1(a, b, c2, d, e, f, qu1Var, a2, str3, a3, str5, ru1Var, requirementOptionDto.e);
                        ppi ppiVar = deliveryIntervalListItem == null ? new ppi(deliveryIntervalListItem.getA(), deliveryIntervalListItem.getB(), deliveryIntervalListItem.getC(), deliveryIntervalListItem.getD(), deliveryIntervalListItem.getE(), deliveryIntervalListItem.getF(), deliveryIntervalListItem.getG()) : nu1Var;
                        str7 = requirementOptionDto.f;
                        if (str7 != null) {
                            return nu1Var;
                        }
                        pex0 e2 = e(gx1Var, serviceLevel, str2, c);
                        Boolean bool = requirementOptionDto.g;
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        Boolean bool2 = requirementOptionDto.h;
                        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
                        Alternatives.TariffBubbleOption tariffBubbleOption = requirementOptionDto.i;
                        if (tariffBubbleOption != null) {
                            n7v a4 = tariffBubbleOption.getA();
                            ou1Var = new ou1(a4 != null ? jgvVar.a(a4) : nu1Var, tariffBubbleOption.getB(), g8e.p(serviceLevel.f, "/", str7));
                        } else {
                            ou1Var = nu1Var;
                        }
                        return new nu1(e2, str7, booleanValue, booleanValue2, su1Var, ppiVar, ou1Var);
                    }
                    str6 = i2.c;
                }
                str5 = str6;
                redirect = requirementOptionDto.d;
                if (redirect == null) {
                }
                su1 su1Var2 = new su1(a, b, c2, d, e, f, qu1Var, a2, str3, a3, str5, ru1Var, requirementOptionDto.e);
                if (deliveryIntervalListItem == null) {
                }
                str7 = requirementOptionDto.f;
                if (str7 != null) {
                }
            }
        }
        str3 = str4;
        String a32 = jgvVar.a(listItem.getI());
        i = listItem.getI();
        if (i != null) {
        }
        i2 = listItem.getI();
        if (i2 != null) {
        }
    }

    public final av1 b(gx1 gx1Var, Alternatives.AltpinBOptionDto altpinBOptionDto, ServiceLevel serviceLevel, String str) {
        Address d;
        Object obj;
        List list;
        String i;
        String str2;
        Address address = gx1Var.d;
        yal0 yal0Var = gx1Var.b;
        if (address != null) {
            Alternatives.ConfirmationScreen confirmationScreen = altpinBOptionDto.c;
            Alternatives.Walk walk = altpinBOptionDto.f;
            if (confirmationScreen != null && (d = d(address, altpinBOptionDto.d)) != null) {
                pex0 e = e(gx1Var, serviceLevel, str, c(altpinBOptionDto, serviceLevel));
                fef g = yal0Var.g();
                Iterator it = yal0Var.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ServiceLevel) obj).l == gx1Var.g) {
                        break;
                    }
                }
                ServiceLevel serviceLevel2 = (ServiceLevel) obj;
                Address address2 = gx1Var.d;
                Address address3 = gx1Var.c;
                if (walk == null || (list = walk.getA()) == null) {
                    list = EmptyList.a;
                }
                List list2 = list;
                String b = walk != null ? walk.getB() : null;
                String str3 = b == null ? "" : b;
                ybo yboVar = e.h;
                int i2 = yboVar.a;
                boolean z = yboVar.c;
                qze0 qze0Var = e.m;
                return new av1(e, d, new f4e(confirmationScreen, d, address2, address3, g, list2, str3, i2, z, (qze0Var == null || (str2 = qze0Var.a) == null) ? "" : str2, (serviceLevel2 == null || (i = this.d.i(serviceLevel2, g)) == null) ? "" : i));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ay1 c(b bVar, ServiceLevel serviceLevel) {
        wu1 wu1Var;
        wu1 zo40Var;
        boolean z;
        boolean z2;
        EmptyList emptyList = null;
        if (bVar instanceof Alternatives.MulticlassOptionDto) {
            return null;
        }
        if (bVar instanceof Alternatives.AltpinAOptionDto) {
            Alternatives.AltpinAOptionDto altpinAOptionDto = (Alternatives.AltpinAOptionDto) bVar;
            return new ay1(new py1(altpinAOptionDto.a), null, true, true, null, null, serviceLevel.e, null, altpinAOptionDto.d, altpinAOptionDto.e);
        }
        boolean z3 = bVar instanceof Alternatives.AltpinBOptionDto;
        jgv jgvVar = this.c;
        if (z3) {
            Alternatives.AltpinBOptionDto altpinBOptionDto = (Alternatives.AltpinBOptionDto) bVar;
            uy1 uy1Var = new uy1(altpinBOptionDto.a);
            Selector selector = altpinBOptionDto.e;
            return new ay1(uy1Var, null, true, true, selector != null ? selector.c : null, jgvVar.a(selector != null ? selector.e : null), serviceLevel.e, null, altpinBOptionDto.g, altpinBOptionDto.h);
        }
        if (bVar instanceof Alternatives.PlusPromoOptionDto) {
            Alternatives.PlusPromoOptionDto plusPromoOptionDto = (Alternatives.PlusPromoOptionDto) bVar;
            return new ay1(new gid0(plusPromoOptionDto.a), null, false, false, null, null, serviceLevel.e, plusPromoOptionDto.c, plusPromoOptionDto.d, plusPromoOptionDto.e);
        }
        if (bVar instanceof Alternatives.CreateYandexCardOptionDto) {
            Alternatives.CreateYandexCardOptionDto createYandexCardOptionDto = (Alternatives.CreateYandexCardOptionDto) bVar;
            return new ay1(new p8f(createYandexCardOptionDto.a), "", true, true, null, null, serviceLevel.e, null, createYandexCardOptionDto.c, createYandexCardOptionDto.d);
        }
        if (bVar instanceof Alternatives.DeeplinkOptionDto) {
            Alternatives.DeeplinkOptionDto deeplinkOptionDto = (Alternatives.DeeplinkOptionDto) bVar;
            String str = deeplinkOptionDto.a;
            String str2 = deeplinkOptionDto.c;
            if (str2 == null) {
                str2 = "";
            }
            return new ay1(new u0h(str, str2), "", true, null, null, serviceLevel.e, 768);
        }
        if (bVar instanceof Alternatives.AltPaymentMethodOptionDto) {
            Alternatives.AltPaymentMethodOptionDto altPaymentMethodOptionDto = (Alternatives.AltPaymentMethodOptionDto) bVar;
            return new ay1(new yu1(altPaymentMethodOptionDto.a, altPaymentMethodOptionDto.c), altPaymentMethodOptionDto.d, true, true, null, null, serviceLevel.e, null, altPaymentMethodOptionDto.e, altPaymentMethodOptionDto.f);
        }
        if (bVar instanceof Alternatives.RequirementOptionDto) {
            Alternatives.RequirementOptionDto requirementOptionDto = (Alternatives.RequirementOptionDto) bVar;
            return new ay1(new jjj0(requirementOptionDto.a), null, false, true, null, null, serviceLevel.e, null, requirementOptionDto.k, requirementOptionDto.l);
        }
        if (bVar instanceof Alternatives.TariffSelectorOptionDto) {
            Alternatives.TariffSelectorOptionDto tariffSelectorOptionDto = (Alternatives.TariffSelectorOptionDto) bVar;
            String str3 = tariffSelectorOptionDto.a;
            return new ay1(jl40.l(str3, "explicit_antisurge") ? new pl2(str3) : new qnx0(str3), null, true, true, null, null, serviceLevel.e, null, tariffSelectorOptionDto.d, tariffSelectorOptionDto.e);
        }
        if (bVar instanceof Alternatives.ComboOptionDto) {
            Alternatives.ComboOptionDto comboOptionDto = (Alternatives.ComboOptionDto) bVar;
            return new ay1(new ojc(comboOptionDto.a), null, true, true, null, null, serviceLevel.e, null, comboOptionDto.d, comboOptionDto.e);
        }
        if (!(bVar instanceof Alternatives.CommonOptionLegacyDto)) {
            if (bVar instanceof Alternatives.MarketplaceOptionDto) {
                Alternatives.MarketplaceOptionDto marketplaceOptionDto = (Alternatives.MarketplaceOptionDto) bVar;
                yx00 yx00Var = new yx00(marketplaceOptionDto.a);
                Selector selector2 = marketplaceOptionDto.b;
                return new ay1(yx00Var, null, true, selector2 != null ? selector2.c : null, jgvVar.a(selector2 != null ? selector2.e : null), serviceLevel.e, 768);
            }
            if (!(bVar instanceof Alternatives.MultimodalOptionDto)) {
                if (bVar instanceof Alternatives.PlusSubscriptionOptionDto) {
                    return new ay1(new vmd0(((Alternatives.PlusSubscriptionOptionDto) bVar).a), null, false, null, null, serviceLevel.e, 896);
                }
                if (bVar instanceof Alternatives.PlusDummySubscriptionOptionDto) {
                    return new ay1(new j2d0(((Alternatives.PlusDummySubscriptionOptionDto) bVar).a), null, false, null, null, serviceLevel.e, 896);
                }
                w511.b();
                return null;
            }
            Alternatives.MultimodalOptionDto multimodalOptionDto = (Alternatives.MultimodalOptionDto) bVar;
            String str4 = multimodalOptionDto.a;
            List list = multimodalOptionDto.d;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart) it.next()).getA());
                }
                emptyList = arrayList2;
            }
            if (emptyList == null) {
                emptyList = EmptyList.a;
            }
            return new ay1(new ur40(str4, emptyList), null, true, true, serviceLevel.G.c, null, serviceLevel.e, null, multimodalOptionDto.e, multimodalOptionDto.f);
        }
        Alternatives.CommonOptionLegacyDto commonOptionLegacyDto = (Alternatives.CommonOptionLegacyDto) bVar;
        Alternatives.OptionTypeLegacy optionTypeLegacy = commonOptionLegacyDto.a;
        int[] iArr = xax0.a;
        switch (iArr[optionTypeLegacy.ordinal()]) {
            case 1:
                wu1Var = null;
                switch (iArr[optionTypeLegacy.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        z = false;
                        break;
                    case 4:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        z = true;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                switch (iArr[optionTypeLegacy.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        z2 = true;
                        break;
                    case 5:
                        z2 = false;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                Selector selector3 = commonOptionLegacyDto.m;
                return new ay1(wu1Var, null, z, z2, selector3 != null ? selector3.c : null, jgvVar.a(selector3 != null ? selector3.e : null), serviceLevel.e, commonOptionLegacyDto.s, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
            case 2:
                zo40Var = new zo40(optionTypeLegacy.getValue());
                wu1Var = zo40Var;
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                Selector selector32 = commonOptionLegacyDto.m;
                return new ay1(wu1Var, null, z, z2, selector32 != null ? selector32.c : null, jgvVar.a(selector32 != null ? selector32.e : null), serviceLevel.e, commonOptionLegacyDto.s, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
            case 3:
                zo40Var = new ur40(optionTypeLegacy.getValue());
                wu1Var = zo40Var;
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                Selector selector322 = commonOptionLegacyDto.m;
                return new ay1(wu1Var, null, z, z2, selector322 != null ? selector322.c : null, jgvVar.a(selector322 != null ? selector322.e : null), serviceLevel.e, commonOptionLegacyDto.s, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
            case 4:
                zo40Var = new uy1(optionTypeLegacy.getValue());
                wu1Var = zo40Var;
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                Selector selector3222 = commonOptionLegacyDto.m;
                return new ay1(wu1Var, null, z, z2, selector3222 != null ? selector3222.c : null, jgvVar.a(selector3222 != null ? selector3222.e : null), serviceLevel.e, commonOptionLegacyDto.s, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
            case 5:
                zo40Var = new gid0(optionTypeLegacy.getValue());
                wu1Var = zo40Var;
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                Selector selector32222 = commonOptionLegacyDto.m;
                return new ay1(wu1Var, null, z, z2, selector32222 != null ? selector32222.c : null, jgvVar.a(selector32222 != null ? selector32222.e : null), serviceLevel.e, commonOptionLegacyDto.s, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
            case 6:
                zo40Var = new jjj0(optionTypeLegacy.getValue());
                wu1Var = zo40Var;
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                Selector selector322222 = commonOptionLegacyDto.m;
                return new ay1(wu1Var, null, z, z2, selector322222 != null ? selector322222.c : null, jgvVar.a(selector322222 != null ? selector322222.e : null), serviceLevel.e, commonOptionLegacyDto.s, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
            case 7:
                zo40Var = new pl2(optionTypeLegacy.getValue());
                wu1Var = zo40Var;
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                Selector selector3222222 = commonOptionLegacyDto.m;
                return new ay1(wu1Var, null, z, z2, selector3222222 != null ? selector3222222.c : null, jgvVar.a(selector3222222 != null ? selector3222222.e : null), serviceLevel.e, commonOptionLegacyDto.s, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
            case 8:
                zo40Var = new qnx0(optionTypeLegacy.getValue());
                wu1Var = zo40Var;
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                Selector selector32222222 = commonOptionLegacyDto.m;
                return new ay1(wu1Var, null, z, z2, selector32222222 != null ? selector32222222.c : null, jgvVar.a(selector32222222 != null ? selector32222222.e : null), serviceLevel.e, commonOptionLegacyDto.s, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
            case 9:
            case 10:
                zo40Var = new ojc(optionTypeLegacy.getValue());
                wu1Var = zo40Var;
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                switch (iArr[optionTypeLegacy.ordinal()]) {
                }
                Selector selector322222222 = commonOptionLegacyDto.m;
                return new ay1(wu1Var, null, z, z2, selector322222222 != null ? selector322222222.c : null, jgvVar.a(selector322222222 != null ? selector322222222.e : null), serviceLevel.e, commonOptionLegacyDto.s, commonOptionLegacyDto.t, commonOptionLegacyDto.u);
            default:
                w511.b();
                return null;
        }
    }

    public final Address d(Address address, Address address2) {
        zzs zzsVar = null;
        if (address2 == null) {
            return null;
        }
        address2.P("routestats");
        if (address != null) {
            AddressDTO address3 = address.getAddress();
            ((PlainAddress) address2).getAddress().y = address3.y;
        }
        eqe eqeVar = this.a;
        Location i = eqeVar.b.i();
        String m = eqeVar.a.m();
        String G = eqeVar.c.G(m);
        PlainAddress plainAddress = (PlainAddress) address2;
        zzs B = plainAddress.B();
        if (i != null) {
            zzs.Companion.getClass();
            zzsVar = uzs.b(i);
        }
        plainAddress.O1(new SimpleOrderAddressAnalyticsData(B, zzsVar, "routestats", plainAddress.q2(), m, G));
        return address2;
    }

    public final pex0 e(gx1 gx1Var, ServiceLevel serviceLevel, String str, ay1 ay1Var) {
        return qex0.a(this.b, gx1Var.a, gx1Var.b, serviceLevel, gx1Var.e, (is60) gx1Var.f.invoke(str), ay1Var, null, null, 192);
    }
}
