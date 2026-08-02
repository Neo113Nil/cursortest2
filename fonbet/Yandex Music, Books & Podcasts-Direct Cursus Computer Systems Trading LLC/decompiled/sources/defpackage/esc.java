package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class esc extends oyc {
    public static final esc a = new esc();
    public static final List b;
    public static final mhb c;
    public static final boolean d;

    static {
        azc azcVar = new azc(mhb.DATETIME);
        mhb mhbVar = mhb.STRING;
        b = u75.h(azcVar, new azc(mhbVar));
        c = mhbVar;
        d = true;
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        vc7 vc7Var = (vc7) ouj.i(list, 0);
        Object obj = list.get(1);
        obj.getClass();
        Date date = new Date(vc7Var.a);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) obj, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String format = simpleDateFormat.format(date);
        format.getClass();
        return format;
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "formatDateAsLocal";
    }

    @Override // defpackage.oyc
    public final mhb d() {
        return c;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        return d;
    }
}
