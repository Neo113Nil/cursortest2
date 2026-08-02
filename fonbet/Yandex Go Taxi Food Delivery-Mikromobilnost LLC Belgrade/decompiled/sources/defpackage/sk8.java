package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public abstract class sk8 {
    public static final String a;
    public static final DecimalFormat b;

    static {
        String u = cvu0.u(16, "0");
        Regex regex = gtu0.a;
        if (4 < u.length()) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int v = jx81.v(0, evu0.C(u), 4);
            if (v >= 0) {
                while (true) {
                    int i2 = i + 4;
                    oyr.C(i, i2, u, " ", sb);
                    if (i == v) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            u = sb.toString();
        }
        a = u;
        DecimalFormat decimalFormat = new DecimalFormat(g8e.p(cvu0.u(4, ShimmerDivHandler.NUMBER_SING), ",", cvu0.u(4, ShimmerDivHandler.NUMBER_SING)));
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
        decimalFormatSymbols.setGroupingSeparator(HexString.CHAR_SPACE);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        b = decimalFormat;
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        Long m = bvu0.m(10, sb.toString());
        String format = m != null ? b.format(m.longValue()) : null;
        return format == null ? "" : format;
    }

    public static String b() {
        return a;
    }
}
