package defpackage;

import android.content.Context;
import java.util.Currency;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class w530 {
    public final Context a;
    public final ConcurrentHashMap b = new ConcurrentHashMap(b.i(new Pair("ybsdk_common_currency_currency.eur.symbol", Integer.valueOf(dzh0.ybsdk_common_currency_currency_eur_symbol)), new Pair("ybsdk_common_currency_currency.rub.symbol", Integer.valueOf(dzh0.ybsdk_common_currency_currency_rub_symbol)), new Pair("ybsdk_common_currency_currency.usd.symbol", Integer.valueOf(dzh0.ybsdk_common_currency_currency_usd_symbol)), new Pair("ybsdk_common_currency_currency.uzs.symbol", Integer.valueOf(dzh0.ybsdk_common_currency_currency_uzs_symbol))));

    public w530(Context context) {
        this.a = context;
    }

    public static String a(w530 w530Var, Number number, String str, boolean z, Locale locale, boolean z2, int i) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            locale = Locale.getDefault();
        }
        boolean z3 = (i & 16) == 0;
        if ((i & 32) != 0) {
            z2 = true;
        }
        w530Var.getClass();
        Locale locale2 = tm60.a;
        return tm60.c(number, str, z, locale, z3, z2, z2 ? w530Var.b(str) : "");
    }

    public final String b(String str) {
        Integer num = (Integer) this.b.get(oyr.p("ybsdk_common_currency_currency.", str.toLowerCase(Locale.ROOT), ".symbol"));
        if (num != null && num.intValue() == 0) {
            num = null;
        }
        if (num != null) {
            return this.a.getResources().getString(num.intValue());
        }
        try {
            return Currency.getInstance(str).getSymbol();
        } catch (Exception unused) {
            return str;
        }
    }
}
