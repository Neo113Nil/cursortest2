package kotlin.text;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class CatchingFishStateFlowLayout {
    public static LocaleList CatchingFishParcelableFAB(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void CatchingFishSnackbar(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
