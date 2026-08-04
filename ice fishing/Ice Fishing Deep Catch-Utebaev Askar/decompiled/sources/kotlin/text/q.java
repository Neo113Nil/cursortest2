package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class q extends StringsKt__StringsKt {
    public static String i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("fb", "prefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("fb", "prefix");
        if (!o.d(str, "fb")) {
            return str;
        }
        String strSubstring = str.substring("fb".length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static String k(String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        int length = missingDelimiterValue.length() - 1;
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        int iLastIndexOf = missingDelimiterValue.lastIndexOf(46, length);
        if (iLastIndexOf == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(iLastIndexOf + 1, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static CharSequence l(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            char cCharAt = str.charAt(!z ? i2 : length);
            boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }
}
