package com.google.android.gms.internal.mlkit_genai_prompt;

import android.text.style.LocaleSpan;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import com.squareup.cash.cdf.asset.AssetPoolLeavePoolStart;
import com.squareup.cash.cdf.asset.AssetPoolPoolContributionChooseAmount;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes6.dex */
public abstract class zzahx {
    public static List getDeepLinkSpecs() {
        return ClientRoute.DeactivateTag.deepLinkSpecs;
    }

    public static LocaleSpan localeSpan(LocaleList localeList) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10));
        Iterator it = localeList.localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).platformLocale);
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static void setTextLocales(AndroidTextPaint androidTextPaint, LocaleList localeList) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10));
        Iterator it = localeList.localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).platformLocale);
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        androidTextPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static final void trackContributionChooseAmount(Analytics analytics, String str, String str2, AssetPoolPoolContributionChooseAmount.SelectionType selectionType, long j, String str3) {
        str.getClass();
        str2.getClass();
        analytics.track(new AssetPoolPoolContributionChooseAmount(str2, str, selectionType, Integer.valueOf((int) j), str3), null);
    }

    public static final void trackLeavePoolStart(Analytics analytics, String str, String str2, double d, double d2) {
        str.getClass();
        str2.getClass();
        analytics.track(new AssetPoolLeavePoolStart(Double.valueOf(d), Double.valueOf(d2), str, str2), null);
    }
}
