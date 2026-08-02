package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.api.w1;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public enum t {
    GMAIL("gmail", w1.i),
    MAILRU("mailru", w1.k),
    YAHOO("yahoo", w1.l),
    RAMBLER("rambler", w1.m),
    OUTLOOK("outlook", w1.j),
    OTHER("custom", w1.n),
    YANDEX("yandex", null);

    public static final com.yandex.passport.data.network.token.i c = new com.yandex.passport.data.network.token.i(23);
    public static final Pattern d = Pattern.compile("(?:mail\\.)?(yandex-team|ya|yandex)\\.(?:ru|tr|ua|kz|by|com|com\\.tr|com\\.ua|com\\.kz|com\\.by)$", 2);
    public final String a;
    public final w1 b;

    t(String str, w1 w1Var) {
        this.a = str;
        this.b = w1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r2.equals("bk.ru") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r2.equals("inbox.ru") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.equals("outlook.com") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        return com.yandex.passport.internal.ui.social.gimap.t.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r2.equals("hotmail.com") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2.equals("mail.ru") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        return com.yandex.passport.internal.ui.social.gimap.t.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r2.equals("list.ru") == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final t a(String str) {
        c.getClass();
        switch (str.hashCode()) {
            case -1760250857:
                break;
            case -1495636431:
                if (str.equals("gmail.com")) {
                    return GMAIL;
                }
                if (Arrays.asList(Arrays.copyOf(com.yandex.passport.internal.ui.social.mail.b.p, 6)).contains(str)) {
                    return RAMBLER;
                }
                if (d.matcher(str).find()) {
                    return YANDEX;
                }
                return null;
            case -1311829293:
                if (str.equals("yahoo.com")) {
                    return YAHOO;
                }
                if (Arrays.asList(Arrays.copyOf(com.yandex.passport.internal.ui.social.mail.b.p, 6)).contains(str)) {
                }
                break;
            case -369931520:
                break;
            case 64438955:
                break;
            case 93740552:
                break;
            case 181919123:
                break;
            case 830916058:
                break;
            default:
                if (Arrays.asList(Arrays.copyOf(com.yandex.passport.internal.ui.social.mail.b.p, 6)).contains(str)) {
                }
                break;
        }
    }
}
