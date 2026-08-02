package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class v19 {
    public final DecimalFormat a;

    public v19(Locale locale) {
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        DecimalFormat decimalFormat = new DecimalFormat("0", decimalFormatSymbols);
        this.a = decimalFormat;
        decimalFormatSymbols.getDecimalSeparator();
        decimalFormat.setMaximumFractionDigits(2);
    }
}
