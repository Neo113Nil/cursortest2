package com.fillr.browsersdk.utilities;

import android.text.TextUtils;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class FillrCookieManager$CookieCompare implements Comparator {
    public static final String[] SESSION_KEYWORDS = {"sess", "visitor", "cart", "kart", "client", "cookie", "group", "auth", "pointer", "activity", "persistent"};

    public static boolean isEmpty(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("=");
            if (split.length >= 2 && !TextUtils.isEmpty(split[1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHex(String str) {
        if (isEmpty(str)) {
            return false;
        }
        return str.split("=")[1].toLowerCase().matches("[0-9a-f\\-]+");
    }

    public static boolean isNumeric(String str) {
        if (isEmpty(str)) {
            return false;
        }
        return str.split("=")[1].matches("[0-9]+");
    }

    public static boolean isSessionCookie(String str) {
        if (!isEmpty(str)) {
            String[] split = str.split("=");
            if (split.length > 1) {
                String lowerCase = split[0].toLowerCase();
                for (int i = 0; i < 11; i++) {
                    if (lowerCase.contains(SESSION_KEYWORDS[i])) {
                        return true;
                    }
                }
                return lowerCase.endsWith("id");
            }
        }
        return false;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (isSessionCookie(str)) {
            return isSessionCookie(str2) ? 0 : -1;
        }
        if (!isSessionCookie(str2)) {
            if (isHex(str)) {
                return isHex(str2) ? 0 : -1;
            }
            if (!isHex(str2)) {
                if (isNumeric(str)) {
                    return isNumeric(str2) ? 0 : -1;
                }
                if (!isNumeric(str2)) {
                    if (isEmpty(str)) {
                        return !isEmpty(str2) ? 1 : 0;
                    }
                    if (isEmpty(str2)) {
                        return -1;
                    }
                    return str.compareToIgnoreCase(str2);
                }
            }
        }
        return 1;
    }
}
