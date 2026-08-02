package defpackage;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class mqe extends f5 {
    public static final mqe b = new mqe();
    public static final List c = u75.h(new azc(mhb.INTEGER), new azc(mhb.STRING));

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
        String format = decimalFormat.format(number.longValue());
        format.getClass();
        return format;
    }

    @Override // defpackage.f5
    public final Locale k(List list) {
        list.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        return locale;
    }

    @Override // defpackage.f5
    public final Number l(Object obj) {
        obj.getClass();
        return (Long) obj;
    }
}
