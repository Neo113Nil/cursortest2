package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishRoomMVVMWidget extends CatchingFishAdMobFluxMVP {
    public static String CatchingFishCameraXIntent(String str, String str2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str2, "delimiter");
        int CatchingFishPayPalService = CatchingFishPayPalService(str, str2, 0, false);
        if (CatchingFishPayPalService == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + CatchingFishPayPalService, str.length());
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(substring, "substring(...)");
        return substring;
    }

    public static boolean CatchingFishDagger(String str, String str2) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(str2, "prefix");
        return str.startsWith(str2);
    }

    public static String CatchingFishEspressoMockk(String str, String str2, String str3) {
        int CatchingFishPayPalService = CatchingFishPayPalService(str, str2, 0, false);
        if (CatchingFishPayPalService < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, CatchingFishPayPalService);
            sb.append(str3);
            i2 = CatchingFishPayPalService + length;
            if (CatchingFishPayPalService >= str.length()) {
                break;
            }
            CatchingFishPayPalService = CatchingFishPayPalService(str, str2, CatchingFishPayPalService + i, false);
        } while (CatchingFishPayPalService > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(sb2, "toString(...)");
        return sb2;
    }

    public static String CatchingFishHandler(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(46, CatchingFishJobScheduler(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(substring, "substring(...)");
        return substring;
    }

    public static final int CatchingFishJobScheduler(CharSequence charSequence) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static boolean CatchingFishMutableLiveData(String str, String str2) {
        return CatchingFishPayPalService(str, str2, 0, false) >= 0;
    }

    public static final int CatchingFishPayPalService(String str, String str2, int i, boolean z) {
        String str3;
        String str4;
        boolean z2;
        boolean regionMatches;
        CatchingFishFirebaseDagger.CatchingFishNavigation(str2, "string");
        if (!z) {
            return str.indexOf(str2, i);
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        int i2 = new CatchingFishLifecycleMoshi(i, length, 1).CatchingFishDaggerWebsocket;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (true) {
            int length3 = str2.length();
            if (z) {
                str3 = str;
                str4 = str2;
                z2 = z;
                regionMatches = str4.regionMatches(z2, 0, str3, i3, length3);
            } else {
                regionMatches = str2.regionMatches(0, str, i3, length3);
                str3 = str;
                str4 = str2;
                z2 = z;
            }
            if (regionMatches) {
                return i3;
            }
            if (i3 == i2) {
                return -1;
            }
            i3++;
            str2 = str4;
            z = z2;
            str = str3;
        }
    }

    public static boolean CatchingFishSensorManager(CharSequence charSequence) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CatchingFishRobolectricHilt.CatchingFishPayPalService(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
