package kotlin.text;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CatchingFishIntentStateFlow {
    public static final CatchingFishIntentStateFlow CatchingFishSnackbar = new CatchingFishIntentStateFlow(new CatchingFishWidgetHiltKtor(new LocaleList(new Locale[0])));
    public final CatchingFishWidgetHiltKtor CatchingFishParcelableFAB;

    public CatchingFishIntentStateFlow(CatchingFishWidgetHiltKtor catchingFishWidgetHiltKtor) {
        this.CatchingFishParcelableFAB = catchingFishWidgetHiltKtor;
    }

    public static CatchingFishIntentStateFlow CatchingFishParcelableFAB(String str) {
        if (str == null || str.isEmpty()) {
            return CatchingFishSnackbar;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new CatchingFishIntentStateFlow(new CatchingFishWidgetHiltKtor(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishIntentStateFlow) {
            return this.CatchingFishParcelableFAB.equals(((CatchingFishIntentStateFlow) obj).CatchingFishParcelableFAB);
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.CatchingFishParcelableFAB.hashCode();
    }

    public final String toString() {
        return this.CatchingFishParcelableFAB.CatchingFishParcelableFAB.toString();
    }
}
