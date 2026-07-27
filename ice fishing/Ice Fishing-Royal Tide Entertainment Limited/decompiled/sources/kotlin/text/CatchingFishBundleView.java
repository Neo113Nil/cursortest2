package kotlin.text;

import com.adjust.sdk.Constants;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishBundleView {
    public static final char[] CatchingFishLayout = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;
    public final String CatchingFishViewModelFAB;
    public final String CatchingFishViewModelScope;
    public final List CatchingFishWorkManager;

    public CatchingFishBundleView(CatchingFishViewHilt catchingFishViewHilt) {
        this.CatchingFishParcelableFAB = (String) catchingFishViewHilt.CatchingFishCoroutine;
        String str = (String) catchingFishViewHilt.CatchingFishReduxKtor;
        this.CatchingFishSnackbar = CatchingFishViewModelScope(str, 0, str.length(), false);
        String str2 = (String) catchingFishViewHilt.CatchingFishDaggerWebsocket;
        this.CatchingFishCoroutine = CatchingFishViewModelScope(str2, 0, str2.length(), false);
        this.CatchingFishReduxKtor = (String) catchingFishViewHilt.CatchingFishWorkManager;
        int i = catchingFishViewHilt.CatchingFishSnackbar;
        this.CatchingFishDaggerWebsocket = i == -1 ? CatchingFishSnackbar((String) catchingFishViewHilt.CatchingFishCoroutine) : i;
        CatchingFishViewModelFAB((ArrayList) catchingFishViewHilt.CatchingFishViewModelFAB, false);
        ArrayList arrayList = (ArrayList) catchingFishViewHilt.CatchingFishLayout;
        this.CatchingFishWorkManager = arrayList != null ? CatchingFishViewModelFAB(arrayList, true) : null;
        String str3 = (String) catchingFishViewHilt.CatchingFishViewModelScope;
        this.CatchingFishViewModelScope = str3 != null ? CatchingFishViewModelScope(str3, 0, str3.length(), false) : null;
        this.CatchingFishViewModelFAB = catchingFishViewHilt.toString();
    }

    public static ArrayList CatchingFishFragmentHandler(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public static boolean CatchingFishLayout(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && CatchingFishEspressoDagger.CatchingFishReduxKtor(str.charAt(i + 1)) != -1 && CatchingFishEspressoDagger.CatchingFishReduxKtor(str.charAt(i3)) != -1;
    }

    public static String CatchingFishParcelableFAB(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !CatchingFishLayout(str, i3, i2)))) || (codePointAt == 43 && z3)))) {
                CatchingFishWidgetGradle catchingFishWidgetGradle = new CatchingFishWidgetGradle();
                catchingFishWidgetGradle.CatchingFishJobScheduler(str, i, i3);
                CatchingFishWidgetGradle catchingFishWidgetGradle2 = null;
                while (i3 < i2) {
                    int codePointAt2 = str.codePointAt(i3);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            catchingFishWidgetGradle.CatchingFishMutableLiveData(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !CatchingFishLayout(str, i3, i2)))))) {
                            if (catchingFishWidgetGradle2 == null) {
                                catchingFishWidgetGradle2 = new CatchingFishWidgetGradle();
                            }
                            catchingFishWidgetGradle2.CatchingFishPayPalService(codePointAt2);
                            while (!catchingFishWidgetGradle2.CatchingFishReduxKtor()) {
                                byte readByte = catchingFishWidgetGradle2.readByte();
                                catchingFishWidgetGradle.CatchingFishCardViewView(37);
                                char[] cArr = CatchingFishLayout;
                                catchingFishWidgetGradle.CatchingFishCardViewView(cArr[((readByte & 255) >> 4) & 15]);
                                catchingFishWidgetGradle.CatchingFishCardViewView(cArr[readByte & 15]);
                            }
                        } else {
                            catchingFishWidgetGradle.CatchingFishPayPalService(codePointAt2);
                        }
                    }
                    i3 += Character.charCount(codePointAt2);
                }
                return catchingFishWidgetGradle.CatchingFishStateLiveData();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }

    public static int CatchingFishSnackbar(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(Constants.SCHEME) ? 443 : -1;
    }

    public static List CatchingFishViewModelFAB(ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList2.add(str != null ? CatchingFishViewModelScope(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static String CatchingFishViewModelScope(String str, int i, int i2, boolean z) {
        int i3;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                CatchingFishWidgetGradle catchingFishWidgetGradle = new CatchingFishWidgetGradle();
                catchingFishWidgetGradle.CatchingFishJobScheduler(str, i, i4);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt != 37 || (i3 = i4 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            catchingFishWidgetGradle.CatchingFishCardViewView(32);
                        }
                        catchingFishWidgetGradle.CatchingFishPayPalService(codePointAt);
                    } else {
                        int CatchingFishReduxKtor = CatchingFishEspressoDagger.CatchingFishReduxKtor(str.charAt(i4 + 1));
                        int CatchingFishReduxKtor2 = CatchingFishEspressoDagger.CatchingFishReduxKtor(str.charAt(i3));
                        if (CatchingFishReduxKtor != -1 && CatchingFishReduxKtor2 != -1) {
                            catchingFishWidgetGradle.CatchingFishCardViewView((CatchingFishReduxKtor << 4) + CatchingFishReduxKtor2);
                            i4 = i3;
                        }
                        catchingFishWidgetGradle.CatchingFishPayPalService(codePointAt);
                    }
                    i4 += Character.charCount(codePointAt);
                }
                return catchingFishWidgetGradle.CatchingFishStateLiveData();
            }
            i4++;
        }
        return str.substring(i, i2);
    }

    public final String CatchingFishCloudMessaging() {
        CatchingFishViewHilt catchingFishViewHilt;
        try {
            catchingFishViewHilt = new CatchingFishViewHilt(0);
            catchingFishViewHilt.CatchingFishReduxKtor(this, "/...");
        } catch (IllegalArgumentException unused) {
            catchingFishViewHilt = null;
        }
        catchingFishViewHilt.getClass();
        catchingFishViewHilt.CatchingFishReduxKtor = CatchingFishParcelableFAB("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        catchingFishViewHilt.CatchingFishDaggerWebsocket = CatchingFishParcelableFAB("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return catchingFishViewHilt.CatchingFishSnackbar().CatchingFishViewModelFAB;
    }

    public final String CatchingFishCoroutine() {
        if (this.CatchingFishCoroutine.isEmpty()) {
            return "";
        }
        int length = this.CatchingFishParcelableFAB.length() + 3;
        String str = this.CatchingFishViewModelFAB;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public final String CatchingFishDaggerWebsocket() {
        if (this.CatchingFishWorkManager == null) {
            return null;
        }
        String str = this.CatchingFishViewModelFAB;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, CatchingFishEspressoDagger.CatchingFishViewModelScope(str, indexOf, str.length(), '#'));
    }

    public final URI CatchingFishEspressoTesting() {
        CatchingFishViewHilt catchingFishViewHilt = new CatchingFishViewHilt(0);
        ArrayList arrayList = (ArrayList) catchingFishViewHilt.CatchingFishViewModelFAB;
        String str = this.CatchingFishParcelableFAB;
        catchingFishViewHilt.CatchingFishCoroutine = str;
        catchingFishViewHilt.CatchingFishReduxKtor = CatchingFishWorkManager();
        catchingFishViewHilt.CatchingFishDaggerWebsocket = CatchingFishCoroutine();
        catchingFishViewHilt.CatchingFishWorkManager = this.CatchingFishReduxKtor;
        int CatchingFishSnackbar = CatchingFishSnackbar(str);
        int i = this.CatchingFishDaggerWebsocket;
        if (i == CatchingFishSnackbar) {
            i = -1;
        }
        catchingFishViewHilt.CatchingFishSnackbar = i;
        arrayList.clear();
        arrayList.addAll(CatchingFishReduxKtor());
        String CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket();
        String str2 = null;
        catchingFishViewHilt.CatchingFishLayout = CatchingFishDaggerWebsocket != null ? CatchingFishFragmentHandler(CatchingFishParcelableFAB(CatchingFishDaggerWebsocket, 0, CatchingFishDaggerWebsocket.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.CatchingFishViewModelScope != null) {
            String str3 = this.CatchingFishViewModelFAB;
            str2 = str3.substring(str3.indexOf(35) + 1);
        }
        catchingFishViewHilt.CatchingFishViewModelScope = str2;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str4 = (String) arrayList.get(i2);
            arrayList.set(i2, CatchingFishParcelableFAB(str4, 0, str4.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = (ArrayList) catchingFishViewHilt.CatchingFishLayout;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str5 = (String) ((ArrayList) catchingFishViewHilt.CatchingFishLayout).get(i3);
                if (str5 != null) {
                    ((ArrayList) catchingFishViewHilt.CatchingFishLayout).set(i3, CatchingFishParcelableFAB(str5, 0, str5.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str6 = (String) catchingFishViewHilt.CatchingFishViewModelScope;
        if (str6 != null) {
            catchingFishViewHilt.CatchingFishViewModelScope = CatchingFishParcelableFAB(str6, 0, str6.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String catchingFishViewHilt2 = catchingFishViewHilt.toString();
        try {
            return new URI(catchingFishViewHilt2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(catchingFishViewHilt2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final ArrayList CatchingFishReduxKtor() {
        int length = this.CatchingFishParcelableFAB.length() + 3;
        String str = this.CatchingFishViewModelFAB;
        int indexOf = str.indexOf(47, length);
        int CatchingFishWorkManager = CatchingFishEspressoDagger.CatchingFishWorkManager(indexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < CatchingFishWorkManager) {
            int i = indexOf + 1;
            int CatchingFishViewModelScope = CatchingFishEspressoDagger.CatchingFishViewModelScope(str, i, CatchingFishWorkManager, '/');
            arrayList.add(str.substring(i, CatchingFishViewModelScope));
            indexOf = CatchingFishViewModelScope;
        }
        return arrayList;
    }

    public final String CatchingFishWorkManager() {
        if (this.CatchingFishSnackbar.isEmpty()) {
            return "";
        }
        int length = this.CatchingFishParcelableFAB.length() + 3;
        String str = this.CatchingFishViewModelFAB;
        return str.substring(length, CatchingFishEspressoDagger.CatchingFishWorkManager(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof CatchingFishBundleView) && ((CatchingFishBundleView) obj).CatchingFishViewModelFAB.equals(this.CatchingFishViewModelFAB);
    }

    public final int hashCode() {
        return this.CatchingFishViewModelFAB.hashCode();
    }

    public final String toString() {
        return this.CatchingFishViewModelFAB;
    }
}
