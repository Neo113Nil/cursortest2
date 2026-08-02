package defpackage;

import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public final class tm60 {
    public static final Locale a = new Locale(ClearCryptoProPrefs.COUNTRY, "RU");
    public static final LinkedHashMap b;

    static {
        k4o<NumberFormatUtils$Currencies> entries = NumberFormatUtils$Currencies.getEntries();
        int d = gw00.d(tcc.n(entries, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (NumberFormatUtils$Currencies numberFormatUtils$Currencies : entries) {
            Pair pair = new Pair(numberFormatUtils$Currencies.getIso(), numberFormatUtils$Currencies.getSymbol());
            linkedHashMap.put(pair.c(), pair.f());
        }
        b = linkedHashMap;
    }

    public static String a(BigDecimal bigDecimal) {
        return String.format(oyr.j(6, "%.", "f"), Arrays.copyOf(new Object[]{bigDecimal}, 1)).replace(HexString.CHAR_COMMA, '.');
    }

    public static String b(Number number) {
        Locale locale = Locale.getDefault();
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(locale);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        decimalFormatSymbols.setCurrencySymbol("");
        decimalFormat.setPositivePrefix("");
        decimalFormat.setNegativePrefix("");
        decimalFormat.setParseBigDecimal(true);
        decimalFormat.setGroupingUsed(false);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(number);
    }

    public static String c(Number number, String str, boolean z, Locale locale, boolean z2, boolean z3, String str2) {
        if (str.equals("RUB")) {
            locale = a;
        }
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(locale);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        if (!z3) {
            str2 = "";
        } else if (str2 == null) {
            str2 = f(str);
        }
        decimalFormatSymbols.setCurrencySymbol(str2);
        decimalFormat.setPositivePrefix(z ? "+" : "");
        decimalFormat.setNegativePrefix("–");
        decimalFormatSymbols.setGroupingSeparator((char) 160);
        decimalFormat.setParseBigDecimal(true);
        decimalFormat.setGroupingUsed(Math.abs(number.longValue()) >= 10000);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(0);
        decimalFormat.setMaximumFractionDigits(z2 ? 0 : 2);
        return evu0.k0(cvu0.v(decimalFormat.format(number), " ", " ", false)).toString();
    }

    public static NumberFormatUtils$Currencies e(String str) {
        Object obj;
        NumberFormatUtils$Currencies numberFormatUtils$Currencies = NumberFormatUtils$Currencies.RUB;
        NumberFormatUtils$Currencies numberFormatUtils$Currencies2 = null;
        try {
            if (str.length() > 0) {
                String valueOf = String.valueOf(gvu0.x0(str));
                Iterator it = b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((Map.Entry) obj).getValue(), valueOf)) {
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry != null) {
                    numberFormatUtils$Currencies2 = NumberFormatUtils$Currencies.valueOf((String) entry.getValue());
                }
            }
        } catch (Exception unused) {
        }
        return numberFormatUtils$Currencies2 == null ? numberFormatUtils$Currencies : numberFormatUtils$Currencies2;
    }

    public static String f(String str) {
        try {
            Object symbol = Currency.getInstance(str).getSymbol();
            Object obj = b.get(str);
            if (obj != null) {
                symbol = obj;
            }
            return (String) symbol;
        } catch (Exception unused) {
            return "";
        }
    }

    public static BigDecimal g(String str) {
        try {
            return new BigDecimal(str.replace(HexString.CHAR_COMMA, '.'));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float h(String str) {
        try {
            Iterator<E> it = NumberFormatUtils$Currencies.getEntries().iterator();
            while (it.hasNext()) {
                str = cvu0.v(str, ((NumberFormatUtils$Currencies) it.next()).getSymbol(), "", false);
            }
            return Float.valueOf(Float.parseFloat(cvu0.v(cvu0.v(str, " ", "", false), " ", "", false).replace(HexString.CHAR_COMMA, '.')));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i(String str) {
        return cvu0.v(cvu0.v(cvu0.v(str, " ", "", false), " ", "", false).replace('.', HexString.CHAR_COMMA), "\\s", "", false);
    }
}
