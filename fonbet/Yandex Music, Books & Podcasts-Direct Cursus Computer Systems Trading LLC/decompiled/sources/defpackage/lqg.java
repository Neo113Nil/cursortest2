package defpackage;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class lqg extends f5 {
    public static final lqg b = new lqg();
    public static final List c;

    static {
        azc azcVar = new azc(mhb.NUMBER);
        mhb mhbVar = mhb.STRING;
        c = u75.h(azcVar, new azc(mhbVar), new azc(mhbVar));
    }

    @Override // defpackage.oyc
    public final List b() {
        return c;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "decimalFormat";
    }

    @Override // defpackage.f5
    public final String j(DecimalFormat decimalFormat, Number number) {
        String format = decimalFormat.format(Float.valueOf((float) number.doubleValue()));
        format.getClass();
        return format;
    }

    @Override // defpackage.f5
    public final Locale k(List list) {
        Locale forLanguageTag = Locale.forLanguageTag((String) ouj.i(list, 2));
        forLanguageTag.getClass();
        return forLanguageTag;
    }

    @Override // defpackage.f5
    public final Number l(Object obj) {
        obj.getClass();
        return (Double) obj;
    }
}
