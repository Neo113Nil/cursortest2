package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class dq {
    public static final dq NCTxEWno = new dq(new eq(new LocaleList(new Locale[0])));
    public final eq qoPGr6Ce;

    public dq(eq eqVar) {
        this.qoPGr6Ce = eqVar;
    }

    public static dq qoPGr6Ce(String str) {
        if (str == null || str.isEmpty()) {
            return NCTxEWno;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new dq(new eq(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dq) {
            return this.qoPGr6Ce.equals(((dq) obj).qoPGr6Ce);
        }
        return false;
    }

    public final int hashCode() {
        return this.qoPGr6Ce.qoPGr6Ce.hashCode();
    }

    public final String toString() {
        return this.qoPGr6Ce.qoPGr6Ce.toString();
    }
}
