package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q891 extends mha1 {
    public long w;
    public String x;

    @Override // defpackage.mha1
    public final boolean Hg() {
        Calendar calendar = Calendar.getInstance();
        this.w = (calendar.get(16) + calendar.get(15)) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.x = unr0.r(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long Kg() {
        Ig();
        return this.w;
    }

    public final String Lg() {
        Ig();
        return this.x;
    }
}
