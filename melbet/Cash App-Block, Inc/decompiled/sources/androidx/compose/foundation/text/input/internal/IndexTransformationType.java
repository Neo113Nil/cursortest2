package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class IndexTransformationType {
    public static final /* synthetic */ IndexTransformationType[] $VALUES;
    public static final IndexTransformationType Deletion;
    public static final IndexTransformationType Insertion;
    public static final IndexTransformationType Replacement;
    public static final IndexTransformationType Untransformed;

    static {
        IndexTransformationType indexTransformationType = new IndexTransformationType("Untransformed", 0);
        Untransformed = indexTransformationType;
        IndexTransformationType indexTransformationType2 = new IndexTransformationType("Insertion", 1);
        Insertion = indexTransformationType2;
        IndexTransformationType indexTransformationType3 = new IndexTransformationType("Replacement", 2);
        Replacement = indexTransformationType3;
        IndexTransformationType indexTransformationType4 = new IndexTransformationType("Deletion", 3);
        Deletion = indexTransformationType4;
        $VALUES = new IndexTransformationType[]{indexTransformationType, indexTransformationType2, indexTransformationType3, indexTransformationType4};
    }

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) $VALUES.clone();
    }
}
