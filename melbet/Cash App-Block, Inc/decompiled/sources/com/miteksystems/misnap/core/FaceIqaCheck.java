package com.miteksystems.misnap.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FaceIqaCheck {
    public static final /* synthetic */ FaceIqaCheck[] a = {new FaceIqaCheck("FACE_PRESENT", 0), new FaceIqaCheck("SINGLE_FACE", 1), new FaceIqaCheck("GOOD_ANGLE", 2), new FaceIqaCheck("FACE_CLOSE_ENOUGH", 3), new FaceIqaCheck("FACE_WITHIN_BOUNDS", 4), new FaceIqaCheck("EYES_OPEN", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    FaceIqaCheck EF5;

    public static FaceIqaCheck valueOf(String str) {
        return (FaceIqaCheck) Enum.valueOf(FaceIqaCheck.class, str);
    }

    public static FaceIqaCheck[] values() {
        return (FaceIqaCheck[]) a.clone();
    }
}
