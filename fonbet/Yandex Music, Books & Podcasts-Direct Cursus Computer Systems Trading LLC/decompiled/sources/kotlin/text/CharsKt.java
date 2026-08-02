package kotlin.text;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/a"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_1)
/* loaded from: classes5.dex */
public final class CharsKt extends a {
    public static boolean d(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static String e(char c, Locale locale) {
        locale.getClass();
        String valueOf = String.valueOf(c);
        valueOf.getClass();
        String upperCase = valueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            String valueOf2 = String.valueOf(c);
            valueOf2.getClass();
            String upperCase2 = valueOf2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c));
            }
        } else if (c != 329) {
            char charAt = upperCase.charAt(0);
            String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return charAt + lowerCase;
        }
        return upperCase;
    }
}
