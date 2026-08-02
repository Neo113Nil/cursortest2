package androidx.core.os;

import android.os.LocaleList;

/* loaded from: classes.dex */
public final class LocaleListPlatformWrapper {
    public final LocaleList mLocaleList;

    public LocaleListPlatformWrapper(LocaleList localeList) {
        this.mLocaleList = localeList;
    }

    public final boolean equals(Object obj) {
        return this.mLocaleList.equals(((LocaleListPlatformWrapper) obj).mLocaleList);
    }

    public final int hashCode() {
        return this.mLocaleList.hashCode();
    }

    public final String toString() {
        return this.mLocaleList.toString();
    }
}
