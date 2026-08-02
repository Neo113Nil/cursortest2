package com.yandex.passport.internal.common;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class l {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Locale locale) {
        String str;
        String language = locale.getLanguage();
        language.getClass();
        switch (language.hashCode()) {
            case 3139:
                return !language.equals("be") ? "ru" : "by";
            case 3247:
                if (language.equals("et")) {
                    return "ee";
                }
                break;
            case 3267:
                if (language.equals("fi")) {
                    return "fi";
                }
                break;
            case 3345:
                str = "hy";
                language.equals(str);
                return "ru";
            case 3414:
                str = "ka";
                language.equals(str);
                return "ru";
            case 3424:
                if (language.equals("kk")) {
                    return "kz";
                }
                break;
            case 3464:
                if (language.equals("lt")) {
                    return "lt";
                }
                break;
            case 3466:
                if (language.equals("lv")) {
                    return "lv";
                }
                break;
            case 3580:
                if (language.equals("pl")) {
                    return "pl";
                }
                break;
            case 3651:
                language.equals("ru");
                return "ru";
            case 3710:
                if (language.equals("tr")) {
                    return "com.tr";
                }
                break;
            case 3734:
                if (language.equals("uk")) {
                    return "ua";
                }
                break;
        }
    }
}
