package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class LocaleListCompat {
    public static final LocaleListCompat sEmptyLocaleList = create(new Locale[0]);
    public final LocaleListPlatformWrapper mImpl;

    public LocaleListCompat(LocaleListPlatformWrapper localeListPlatformWrapper) {
        this.mImpl = localeListPlatformWrapper;
    }

    public static LocaleListCompat create(Locale... localeArr) {
        return wrap(new LocaleList(localeArr));
    }

    public static LocaleListCompat forLanguageTags(String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return create(localeArr);
    }

    public static LocaleListCompat getAdjustedDefault() {
        return wrap(LocaleList.getAdjustedDefault());
    }

    public static LocaleListCompat getDefault() {
        return wrap(LocaleList.getDefault());
    }

    public static LocaleListCompat getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    public static LocaleListCompat wrap(LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocaleListCompat) {
            return this.mImpl.equals(((LocaleListCompat) obj).mImpl);
        }
        return false;
    }

    public Locale get(int i) {
        return this.mImpl.mLocaleList.get(i);
    }

    public int hashCode() {
        return this.mImpl.mLocaleList.hashCode();
    }

    public boolean isEmpty() {
        return this.mImpl.mLocaleList.isEmpty();
    }

    public int size() {
        return this.mImpl.mLocaleList.size();
    }

    public String toLanguageTags() {
        return this.mImpl.mLocaleList.toLanguageTags();
    }

    public String toString() {
        return this.mImpl.mLocaleList.toString();
    }

    public Object unwrap() {
        return this.mImpl.mLocaleList;
    }
}
