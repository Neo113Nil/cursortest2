package com.squareup.cash.localization.views;

import java.util.Locale;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'English' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class Language {
    public static final /* synthetic */ Language[] $VALUES;
    public static final Language English;
    public static final Language Spanish;
    public final Locale locale;

    static {
        Locale locale = Locale.US;
        locale.getClass();
        Language language = new Language("English", 0, locale);
        English = language;
        Locale forLanguageTag = Locale.forLanguageTag("es-US");
        forLanguageTag.getClass();
        Language language2 = new Language("Spanish", 1, forLanguageTag);
        Spanish = language2;
        $VALUES = new Language[]{language, language2};
    }

    public Language(String str, int i, Locale locale) {
        this.locale = locale;
    }

    public static Language valueOf(String str) {
        return (Language) Enum.valueOf(Language.class, str);
    }

    public static Language[] values() {
        return (Language[]) $VALUES.clone();
    }
}
