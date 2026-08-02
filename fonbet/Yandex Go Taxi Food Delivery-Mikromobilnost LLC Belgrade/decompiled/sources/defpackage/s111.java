package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.masstransit.TransportCardSourceScreen;
import ru.yandex.taxi.masstransit.analytic.TransportAnalytics$TransportCardAction;
import ru.yandex.taxi.masstransit.analytic.TransportAnalytics$TransportCardPaymentFlowSourceV2;

/* loaded from: classes9.dex */
public final class s111 {
    public final h3y a;
    public final Context b;
    public final g c;
    public final pw2 d;
    public final jj3 e;
    public final b011 f;

    public s111(h3y h3yVar, Context context, g gVar, pw2 pw2Var, jj3 jj3Var, b011 b011Var) {
        this.a = h3yVar;
        this.b = context;
        this.c = gVar;
        this.d = pw2Var;
        this.e = jj3Var;
        this.f = b011Var;
    }

    public final Uri a(String str) {
        Uri.Builder builder = new Uri.Builder();
        ((pux0) this.d).getClass();
        return builder.scheme(pux0.c).authority("masstransit-transport-cards").appendQueryParameter("scenario", str).appendQueryParameter("card_type", "troyka").build();
    }

    public final boolean b(Uri uri, TransportCardSourceScreen transportCardSourceScreen) {
        g gVar = this.c;
        if (gVar.f() && gVar.g()) {
            return c(uri, transportCardSourceScreen);
        }
        boolean z = false;
        this.e.c(new um3(Events$Zalogin$LoginContext.MASSTRANSIT, new qzj0(new wp01(2, this, uri, transportCardSourceScreen), new zp01(16)), z, false, 28));
        return true;
    }

    public final boolean c(Uri uri, TransportCardSourceScreen transportCardSourceScreen) {
        String str;
        String queryParameter = uri.getQueryParameter("scenario");
        String decode = queryParameter != null ? Uri.decode(queryParameter) : null;
        if (decode == null) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("card_type");
        if (queryParameter2 == null || (str = Uri.decode(queryParameter2)) == null) {
            str = "troyka";
        }
        String queryParameter3 = uri.getQueryParameter("card_id");
        String decode2 = queryParameter3 != null ? Uri.decode(queryParameter3) : null;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            String str2 = (String) obj;
            if (!jl40.l(str2, "scenario") && !jl40.l(str2, "card_type") && !jl40.l(str2, "card_id")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            String queryParameter4 = uri.getQueryParameter(str3);
            Pair pair = queryParameter4 != null ? new Pair(Uri.decode(str3), Uri.decode(queryParameter4)) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        Map s = b.s(arrayList2);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("paymentsdk").authority("transportCards").appendQueryParameter("scenario", decode).appendQueryParameter("cardType", str);
        if (decode2 != null) {
            appendQueryParameter.appendQueryParameter("cardId", decode2);
        }
        try {
            this.b.startActivity(((ksi0) this.a.get()).g(appendQueryParameter.build().toString(), s));
            if (transportCardSourceScreen == null) {
                return true;
            }
            d(transportCardSourceScreen, decode, str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void d(TransportCardSourceScreen transportCardSourceScreen, String str, String str2) {
        TransportAnalytics$TransportCardAction transportAnalytics$TransportCardAction;
        TransportAnalytics$TransportCardPaymentFlowSourceV2 transportAnalytics$TransportCardPaymentFlowSourceV2;
        int hashCode = str.hashCode();
        if (hashCode == -1149096111) {
            if (str.equals("addCard")) {
                transportAnalytics$TransportCardAction = TransportAnalytics$TransportCardAction.AddCard;
            }
            transportAnalytics$TransportCardAction = null;
        } else if (hashCode != -172699136) {
            if (hashCode == 640249383 && str.equals("transportCardInfo")) {
                transportAnalytics$TransportCardAction = TransportAnalytics$TransportCardAction.Manage;
            }
            transportAnalytics$TransportCardAction = null;
        } else {
            if (str.equals("topUpCard")) {
                transportAnalytics$TransportCardAction = TransportAnalytics$TransportCardAction.TopUp;
            }
            transportAnalytics$TransportCardAction = null;
        }
        if (transportAnalytics$TransportCardAction == null) {
            return;
        }
        int i = r111.a[transportCardSourceScreen.ordinal()];
        if (i == 1) {
            transportAnalytics$TransportCardPaymentFlowSourceV2 = TransportAnalytics$TransportCardPaymentFlowSourceV2.Main;
        } else if (i == 2) {
            transportAnalytics$TransportCardPaymentFlowSourceV2 = TransportAnalytics$TransportCardPaymentFlowSourceV2.Vertical;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            transportAnalytics$TransportCardPaymentFlowSourceV2 = TransportAnalytics$TransportCardPaymentFlowSourceV2.Hub;
        }
        b011 b011Var = this.f;
        b011Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", transportAnalytics$TransportCardPaymentFlowSourceV2.getEventValue());
        hashMap.put("card_action", transportAnalytics$TransportCardAction.getEventValue());
        b011Var.a.a("Transport.TransportCardFlow.Shown", hashMap, 2, tse0.r("card_type", hashMap, str2));
    }
}
