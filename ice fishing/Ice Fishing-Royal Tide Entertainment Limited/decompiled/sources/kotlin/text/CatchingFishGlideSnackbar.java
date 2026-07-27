package kotlin.text;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class CatchingFishGlideSnackbar {
    public static void CatchingFishCoroutine(CatchingFishIntentStateFlow catchingFishIntentStateFlow) {
        LocaleList.setDefault(LocaleList.forLanguageTags(catchingFishIntentStateFlow.CatchingFishParcelableFAB.CatchingFishParcelableFAB.toLanguageTags()));
    }

    public static void CatchingFishParcelableFAB(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static void CatchingFishReduxKtor(Configuration configuration, CatchingFishIntentStateFlow catchingFishIntentStateFlow) {
        configuration.setLocales(LocaleList.forLanguageTags(catchingFishIntentStateFlow.CatchingFishParcelableFAB.CatchingFishParcelableFAB.toLanguageTags()));
    }

    public static CatchingFishIntentStateFlow CatchingFishSnackbar(Configuration configuration) {
        return CatchingFishIntentStateFlow.CatchingFishParcelableFAB(configuration.getLocales().toLanguageTags());
    }
}
