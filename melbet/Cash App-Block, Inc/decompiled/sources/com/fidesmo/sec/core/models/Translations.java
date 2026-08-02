package com.fidesmo.sec.core.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\b\u0016\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u0015\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/fidesmo/sec/core/models/Translations;", "", "translationMap", "", "", "(Ljava/util/Map;)V", "translationsList", "", "Lcom/fidesmo/sec/core/models/Translation;", "(Ljava/util/List;)V", "translations", "getTranslations", "()Ljava/util/Map;", "equals", "", "other", "toString", "locale", "Ljava/util/Locale;", "validateDefaultLanguage", "", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Translations {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Locale DEFAULT_LOCALE = new Locale("en");
    private final Map<String, String> translations;

    public Translations(List<Translation> list) {
        list.getClass();
        this.translations = new TreeMap();
        for (Translation translation : list) {
            this.translations.put(translation.getLang(), translation.getValue());
        }
        validateDefaultLanguage();
    }

    private final void validateDefaultLanguage() {
        if (toString(DEFAULT_LOCALE) != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("No default language string!");
    }

    public boolean equals(Object other) {
        if (other instanceof Translations) {
            return Intrinsics.areEqual(this.translations, ((Translations) other).translations);
        }
        return false;
    }

    public final Map<String, String> getTranslations() {
        return this.translations;
    }

    public String toString() {
        Locale locale = Locale.getDefault();
        locale.getClass();
        String translations = toString(locale);
        if (translations != null) {
            return translations;
        }
        String translations2 = toString(DEFAULT_LOCALE);
        return translations2 == null ? "" : translations2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/fidesmo/sec/core/models/Translations$Companion;", "", "()V", "DEFAULT_LOCALE", "Ljava/util/Locale;", "getDEFAULT_LOCALE", "()Ljava/util/Locale;", "setDEFAULT_LOCALE", "(Ljava/util/Locale;)V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Locale getDEFAULT_LOCALE() {
            return Translations.DEFAULT_LOCALE;
        }

        public final void setDEFAULT_LOCALE(Locale locale) {
            locale.getClass();
            Translations.DEFAULT_LOCALE = locale;
        }

        private Companion() {
        }
    }

    public final String toString(Locale locale) {
        locale.getClass();
        return this.translations.get(locale.getLanguage());
    }

    public Translations(Map<String, String> map) {
        map.getClass();
        this.translations = new TreeMap(map);
        validateDefaultLanguage();
    }
}
