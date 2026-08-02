package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityTariffSelectorItemPriceInfo$PriceOrigin;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public final class qkw {
    public static pkw a(pkw pkwVar, skb1 skb1Var) {
        if (skb1Var instanceof knx0) {
            okw okwVar = pkwVar.e;
            l76 l76Var = l76.F;
            return pkw.a(pkwVar, false, false, okw.a(okwVar, l76Var), okw.a(pkwVar.f, l76Var), okw.a(pkwVar.g, l76Var), 15);
        }
        if (!(skb1Var instanceof mnx0)) {
            if (skb1Var instanceof lnx0) {
                return (jl40.l(pkwVar.a, ((lnx0) skb1Var).b) && pkwVar.d) ? pkw.a(pkwVar, true, false, null, null, null, HProv.PP_PASSWD_TERM) : pkwVar.c ? pkw.a(pkwVar, false, false, null, null, null, HProv.PP_PASSWD_TERM) : pkwVar;
            }
            w511.b();
            return null;
        }
        mnx0 mnx0Var = (mnx0) skb1Var;
        jpw jpwVar = mnx0Var.b;
        IntercityTariffSelectorItemPriceInfo$PriceOrigin intercityTariffSelectorItemPriceInfo$PriceOrigin = jpwVar.e;
        String str = jpwVar.b;
        CharSequence charSequence = jpwVar.a;
        boolean z = pkwVar.c;
        boolean z2 = (intercityTariffSelectorItemPriceInfo$PriceOrigin == IntercityTariffSelectorItemPriceInfo$PriceOrigin.FALLBACK && z) ? false : (!z && jl40.l(mnx0Var.c, pkwVar.a) && intercityTariffSelectorItemPriceInfo$PriceOrigin == IntercityTariffSelectorItemPriceInfo$PriceOrigin.ROUTE_STATS) ? true : z;
        boolean z3 = jpwVar.e == IntercityTariffSelectorItemPriceInfo$PriceOrigin.ROUTE_STATS;
        okw okwVar2 = pkwVar.e;
        int length = charSequence.length();
        nkw nkwVar = lkw.a;
        okw a = okw.a(okwVar2, length > 0 ? new mkw(charSequence, str) : nkwVar);
        okw okwVar3 = pkwVar.f;
        CharSequence charSequence2 = jpwVar.c;
        okw a2 = okw.a(okwVar3, charSequence2.length() > 0 ? new mkw(charSequence2, jpwVar.d) : nkwVar);
        okw okwVar4 = pkwVar.g;
        if (charSequence.length() > 0) {
            nkwVar = new mkw(charSequence, str);
        }
        return pkw.a(pkwVar, z2, z3, a, a2, okw.a(okwVar4, nkwVar), 3);
    }
}
