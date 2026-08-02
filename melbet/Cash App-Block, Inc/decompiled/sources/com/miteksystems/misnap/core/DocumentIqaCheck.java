package com.miteksystems.misnap.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DocumentIqaCheck {
    public static final DocumentIqaCheck CLOSE_ENOUGH;
    public static final DocumentIqaCheck CORRECT_DOCUMENT;
    public static final DocumentIqaCheck EXTRACTION_CONFIDENCE;
    public static final DocumentIqaCheck FOUR_CORNER_CONFIDENCE;
    public static final DocumentIqaCheck GOOD_ANGLE;
    public static final DocumentIqaCheck GOOD_CONTRAST;
    public static final DocumentIqaCheck NOT_TOO_BRIGHT;
    public static final DocumentIqaCheck NOT_TOO_DARK;
    public static final DocumentIqaCheck NO_GLARE;
    public static final DocumentIqaCheck PLAIN_BACKGROUND;
    public static final DocumentIqaCheck SHARP_ENOUGH;
    public static final DocumentIqaCheck WITHIN_BOUNDS;
    public static final /* synthetic */ DocumentIqaCheck[] a;

    static {
        DocumentIqaCheck documentIqaCheck = new DocumentIqaCheck("FOUR_CORNER_CONFIDENCE", 0);
        FOUR_CORNER_CONFIDENCE = documentIqaCheck;
        DocumentIqaCheck documentIqaCheck2 = new DocumentIqaCheck("CLOSE_ENOUGH", 1);
        CLOSE_ENOUGH = documentIqaCheck2;
        DocumentIqaCheck documentIqaCheck3 = new DocumentIqaCheck("NOT_TOO_BRIGHT", 2);
        NOT_TOO_BRIGHT = documentIqaCheck3;
        DocumentIqaCheck documentIqaCheck4 = new DocumentIqaCheck("NOT_TOO_DARK", 3);
        NOT_TOO_DARK = documentIqaCheck4;
        DocumentIqaCheck documentIqaCheck5 = new DocumentIqaCheck("GOOD_ANGLE", 4);
        GOOD_ANGLE = documentIqaCheck5;
        DocumentIqaCheck documentIqaCheck6 = new DocumentIqaCheck("SHARP_ENOUGH", 5);
        SHARP_ENOUGH = documentIqaCheck6;
        DocumentIqaCheck documentIqaCheck7 = new DocumentIqaCheck("WITHIN_BOUNDS", 6);
        WITHIN_BOUNDS = documentIqaCheck7;
        DocumentIqaCheck documentIqaCheck8 = new DocumentIqaCheck("GOOD_CONTRAST", 7);
        GOOD_CONTRAST = documentIqaCheck8;
        DocumentIqaCheck documentIqaCheck9 = new DocumentIqaCheck("PLAIN_BACKGROUND", 8);
        PLAIN_BACKGROUND = documentIqaCheck9;
        DocumentIqaCheck documentIqaCheck10 = new DocumentIqaCheck("NO_GLARE", 9);
        NO_GLARE = documentIqaCheck10;
        DocumentIqaCheck documentIqaCheck11 = new DocumentIqaCheck("CORRECT_DOCUMENT", 10);
        CORRECT_DOCUMENT = documentIqaCheck11;
        DocumentIqaCheck documentIqaCheck12 = new DocumentIqaCheck("EXTRACTION_CONFIDENCE", 11);
        EXTRACTION_CONFIDENCE = documentIqaCheck12;
        a = new DocumentIqaCheck[]{documentIqaCheck, documentIqaCheck2, documentIqaCheck3, documentIqaCheck4, documentIqaCheck5, documentIqaCheck6, documentIqaCheck7, documentIqaCheck8, documentIqaCheck9, documentIqaCheck10, documentIqaCheck11, documentIqaCheck12};
    }

    public static DocumentIqaCheck valueOf(String str) {
        return (DocumentIqaCheck) Enum.valueOf(DocumentIqaCheck.class, str);
    }

    public static DocumentIqaCheck[] values() {
        return (DocumentIqaCheck[]) a.clone();
    }
}
