package defpackage;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.b;
import com.yandex.go.shortcuts.dto.response.PromoMode;
import defpackage.t1p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import ru.yandex.taxi.eats_commons.EatsService;
import ru.yandex.taxi.eatskit.dto.ServiceHeaderMode;
import ru.yandex.taxi.eatskit.dto.ServicePromo;
import ru.yandex.taxi.eatskit.widget.splash.EatsKitSplash$ShimmeringSplash;
import ru.yandex.taxi.eatskit.widget.splash.EatsKitSplash$StickersSplash;

/* loaded from: classes9.dex */
public final class w6w0 {
    public final gu11 a;
    public final k7x0 b;
    public final wwq0 c;
    public final z1p d;
    public final b e;

    public w6w0(gu11 gu11Var, k7x0 k7x0Var, wwq0 wwq0Var, z1p z1pVar, b bVar) {
        this.a = gu11Var;
        this.b = k7x0Var;
        this.c = wwq0Var;
        this.d = z1pVar;
        this.e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r41v3 */
    public final LinkedHashMap a(szv0 szv0Var, t1p t1pVar, PromoMode promoMode, sdn sdnVar) {
        h1p h1pVar;
        ?? r41;
        Iterator it;
        fen a;
        Address h;
        w6w0 w6w0Var = this;
        szv0 szv0Var2 = szv0Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List b = szv0Var2.b();
        szv0.Companion.getClass();
        if (szv0Var2 == szv0.m) {
            return linkedHashMap;
        }
        Set N0 = sdnVar.b ? a.N0(sdnVar.c) : EmptySet.a;
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            uwq0 uwq0Var = (uwq0) it2.next();
            z1p z1pVar = w6w0Var.d;
            z1pVar.getClass();
            String str = uwq0Var.h;
            x6w0 x6w0Var = null;
            if (str != null) {
                z1pVar.a.getClass();
                h1pVar = cwq0.a(str);
            } else {
                h1pVar = null;
            }
            if (h1pVar == null) {
                jst.e.g("SUPERAPP:MODEL", null, g8e.o("Try to create service model without service ", uwq0Var.h), null);
                it = it2;
            } else {
                String str2 = uwq0Var.c;
                String Y = (str2 == null || str2.length() == 0) ? "" : d6z.Y(szv0Var2, str2);
                t1p.a aVar = (t1p.a) t1pVar.b.get(h1pVar.getValue());
                if (aVar == null) {
                    t1p.a.Companion.getClass();
                    aVar = t1p.a.d;
                }
                boolean z = aVar.a;
                boolean z2 = aVar.b;
                boolean z3 = aVar.c;
                String str3 = uwq0Var.e;
                if (!z || (!(z2 || z3) || (h = w6w0Var.e.c().h()) == null)) {
                    r41 = 0;
                } else {
                    String valueOf = String.valueOf(h.B().a);
                    String valueOf2 = String.valueOf(h.B().b);
                    Uri parse = Uri.parse(str3);
                    Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                    for (String str4 : parse.getQueryParameterNames()) {
                        clearQuery.appendQueryParameter(str4, parse.getQueryParameter(str4));
                        x6w0Var = x6w0Var;
                    }
                    r41 = x6w0Var;
                    clearQuery.appendQueryParameter("lat", valueOf).appendQueryParameter("lon", valueOf2);
                    str3 = clearQuery.build().toString();
                }
                if (promoMode.getEnabled()) {
                    str3 = otr0.b(str3, "promo_mode", promoMode.getValue());
                }
                String str5 = str3;
                boolean z4 = uwq0Var.i;
                String Y2 = d6z.Y(szv0Var2, uwq0Var.a);
                String Y3 = d6z.Y(szv0Var2, uwq0Var.b);
                String str6 = uwq0Var.k;
                String str7 = uwq0Var.j;
                String Y4 = d6z.Y(szv0Var2, uwq0Var.m);
                String Y5 = d6z.Y(szv0Var2, uwq0Var.n);
                String Y6 = d6z.Y(szv0Var2, uwq0Var.p);
                String Y7 = d6z.Y(szv0Var2, uwq0Var.o);
                ServicePromo servicePromo = uwq0Var.q;
                w6w0Var.c.getClass();
                drt0 drt0Var = uwq0Var.f;
                it = it2;
                if (drt0Var instanceof uqt0) {
                    a = vvb1.B;
                } else if (drt0Var instanceof yqt0) {
                    a = een.a;
                } else if (drt0Var instanceof xqt0) {
                    int i = vwq0.a[((xqt0) drt0Var).getA().getA().ordinal()];
                    if (i == 1) {
                        a = EatsKitSplash$ShimmeringSplash.EatsStyle;
                    } else if (i == 2) {
                        a = EatsKitSplash$ShimmeringSplash.MarketStyle;
                    } else if (i == 3) {
                        a = EatsKitSplash$ShimmeringSplash.GroceryStyle;
                    } else if (i == 4) {
                        a = EatsKitSplash$ShimmeringSplash.WebStyle;
                    } else {
                        if (i != 5) {
                            w511.b();
                            return r41;
                        }
                        fen.Z1.getClass();
                        a = den.a();
                    }
                } else if (drt0Var instanceof brt0) {
                    int i2 = vwq0.b[((brt0) drt0Var).getA().getA().ordinal()];
                    if (i2 == 1) {
                        a = EatsKitSplash$StickersSplash.EatsStyle;
                    } else if (i2 == 2) {
                        a = EatsKitSplash$StickersSplash.GroceryStyle;
                    } else {
                        if (i2 != 3) {
                            w511.b();
                            return r41;
                        }
                        fen.Z1.getClass();
                        a = den.a();
                    }
                } else {
                    fen.Z1.getClass();
                    a = den.a();
                }
                fen fenVar = a;
                if (h1pVar == EatsService.GROCERY) {
                    w6w0Var.a.getClass();
                }
                ServiceHeaderMode serviceHeaderMode = ServiceHeaderMode.HEADER_WITH_LOGO;
                String str8 = uwq0Var.r;
                x6w0Var = new x6w0(h1pVar, z4, Y2, Y3, Y, str5, str6, promoMode, str7, Y4, Y5, Y6, Y7, servicePromo, fenVar, serviceHeaderMode, (str8 == null || str8.length() == 0) ? r41 : ((m7x0) w6w0Var.b).a(str8), uwq0Var.v, uwq0Var.w, uwq0Var.x, uwq0Var.C, uwq0Var.y, uwq0Var.A, uwq0Var.z, uwq0Var.B, uwq0Var.F, z, uwq0Var.G, uwq0Var.H, N0);
            }
            if (x6w0Var != null) {
                linkedHashMap.put(x6w0Var.b(), x6w0Var);
            }
            w6w0Var = this;
            szv0Var2 = szv0Var;
            it2 = it;
        }
        return linkedHashMap;
    }
}
