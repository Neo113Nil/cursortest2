package ru.rt.ebs.cryptosdk.presentation.customView;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/TextType;", "", "PROCESSING", "PROCESSING_WIDGET", "BIOMETRY_INFO", "FAILED_VERIFICATION_PRIMARY", "FAILED_VERIFICATION_SECONDARY", "ACCESS_DENIED_PRIMARY", "ACCESS_DENIED_SECONDARY", "VERIFICATION_ERROR_PRIMARY", "VERIFICATION_ERROR_SECONDARY", "VERIFICATION_ATTEMPTS_EXCEEDED_PRIMARY", "VERIFICATION_ATTEMPTS_EXCEEDED_SECONDARY", "NO_INTERNET_CONNECTION_PRIMARY", "NO_INTERNET_CONNECTION_SECONDARY", "SUCCESSFUL_VERIFICATION_WIDGET", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class TextType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextType[] $VALUES;
    public static final TextType ACCESS_DENIED_PRIMARY;
    public static final TextType ACCESS_DENIED_SECONDARY;
    public static final TextType BIOMETRY_INFO;
    public static final TextType FAILED_VERIFICATION_PRIMARY;
    public static final TextType FAILED_VERIFICATION_SECONDARY;
    public static final TextType NO_INTERNET_CONNECTION_PRIMARY;
    public static final TextType NO_INTERNET_CONNECTION_SECONDARY;
    public static final TextType PROCESSING;
    public static final TextType PROCESSING_WIDGET;
    public static final TextType SUCCESSFUL_VERIFICATION_WIDGET;
    public static final TextType VERIFICATION_ATTEMPTS_EXCEEDED_PRIMARY;
    public static final TextType VERIFICATION_ATTEMPTS_EXCEEDED_SECONDARY;
    public static final TextType VERIFICATION_ERROR_PRIMARY;
    public static final TextType VERIFICATION_ERROR_SECONDARY;

    static {
        TextType textType = new TextType("PROCESSING", 0);
        PROCESSING = textType;
        TextType textType2 = new TextType("PROCESSING_WIDGET", 1);
        PROCESSING_WIDGET = textType2;
        TextType textType3 = new TextType("BIOMETRY_INFO", 2);
        BIOMETRY_INFO = textType3;
        TextType textType4 = new TextType("FAILED_VERIFICATION_PRIMARY", 3);
        FAILED_VERIFICATION_PRIMARY = textType4;
        TextType textType5 = new TextType("FAILED_VERIFICATION_SECONDARY", 4);
        FAILED_VERIFICATION_SECONDARY = textType5;
        TextType textType6 = new TextType("ACCESS_DENIED_PRIMARY", 5);
        ACCESS_DENIED_PRIMARY = textType6;
        TextType textType7 = new TextType("ACCESS_DENIED_SECONDARY", 6);
        ACCESS_DENIED_SECONDARY = textType7;
        TextType textType8 = new TextType("VERIFICATION_ERROR_PRIMARY", 7);
        VERIFICATION_ERROR_PRIMARY = textType8;
        TextType textType9 = new TextType("VERIFICATION_ERROR_SECONDARY", 8);
        VERIFICATION_ERROR_SECONDARY = textType9;
        TextType textType10 = new TextType("VERIFICATION_ATTEMPTS_EXCEEDED_PRIMARY", 9);
        VERIFICATION_ATTEMPTS_EXCEEDED_PRIMARY = textType10;
        TextType textType11 = new TextType("VERIFICATION_ATTEMPTS_EXCEEDED_SECONDARY", 10);
        VERIFICATION_ATTEMPTS_EXCEEDED_SECONDARY = textType11;
        TextType textType12 = new TextType("NO_INTERNET_CONNECTION_PRIMARY", 11);
        NO_INTERNET_CONNECTION_PRIMARY = textType12;
        TextType textType13 = new TextType("NO_INTERNET_CONNECTION_SECONDARY", 12);
        NO_INTERNET_CONNECTION_SECONDARY = textType13;
        TextType textType14 = new TextType("SUCCESSFUL_VERIFICATION_WIDGET", 13);
        SUCCESSFUL_VERIFICATION_WIDGET = textType14;
        TextType[] textTypeArr = {textType, textType2, textType3, textType4, textType5, textType6, textType7, textType8, textType9, textType10, textType11, textType12, textType13, textType14};
        $VALUES = textTypeArr;
        $ENTRIES = kotlin.enums.a.a(textTypeArr);
    }

    public static TextType valueOf(String str) {
        return (TextType) Enum.valueOf(TextType.class, str);
    }

    public static TextType[] values() {
        return (TextType[]) $VALUES.clone();
    }
}
