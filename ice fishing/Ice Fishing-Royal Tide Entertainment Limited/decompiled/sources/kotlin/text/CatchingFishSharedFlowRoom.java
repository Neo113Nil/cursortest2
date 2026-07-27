package kotlin.text;

import android.os.LocaleList;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class CatchingFishSharedFlowRoom {
    public static LocaleList CatchingFishParcelableFAB(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void CatchingFishSnackbar(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
