package com.squareup.cash.resource;

import android.icu.text.DateTimePatternGenerator;
import androidx.collection.LruCache;
import com.squareup.cash.localization.PsuedoLocalesKt;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.util.clock.AndroidClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class AndroidDateFormatManager {
    public static final List DISALLOWED_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"M{3}", "j", "a"});
    public final LruCache cache;
    public final AndroidClock clock;
    public final RealLocaleManager localeManager;

    public AndroidDateFormatManager(RealLocaleManager realLocaleManager, AndroidClock androidClock) {
        realLocaleManager.getClass();
        this.localeManager = realLocaleManager;
        this.clock = androidClock;
        this.cache = new LruCache(10);
    }

    public final DateFormat getDateFormat(String str, TimeZone timeZone) {
        Locale locale;
        timeZone.getClass();
        RealLocaleManager realLocaleManager = this.localeManager;
        realLocaleManager.getClass();
        Locale systemLocale = RealLocaleManager.getSystemLocale();
        Locale systemLocale2 = (Intrinsics.areEqual(systemLocale, PsuedoLocalesKt.PSEUDO_LOCALE_EN) || Intrinsics.areEqual(systemLocale, PsuedoLocalesKt.PSEUDO_LOCALE_AR)) ? RealLocaleManager.getSystemLocale() : new Locale(((Locale) realLocaleManager.resolvedLocale.$$delegate_0.getValue()).getLanguage(), RealLocaleManager.getSystemLocale().getCountry(), RealLocaleManager.getSystemLocale().getVariant());
        Pair pair = new Pair(str, systemLocale2);
        LruCache lruCache = this.cache;
        DateFormat dateFormat = (DateFormat) lruCache.get(pair);
        if (dateFormat != null) {
            return dateFormat;
        }
        List list = DISALLOWED_LIST;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (new Regex((String) it.next()).containsMatchIn(str)) {
                    locale = systemLocale2;
                    break;
                }
            }
        }
        locale = RealLocaleManager.getSystemLocale();
        String bestPattern = DateTimePatternGenerator.getInstance(locale).getBestPattern(str);
        bestPattern.getClass();
        DateFormat dateFormat2 = new DateFormat(bestPattern, systemLocale2, timeZone);
        lruCache.put(new Pair(str, systemLocale2), dateFormat2);
        return dateFormat2;
    }
}
