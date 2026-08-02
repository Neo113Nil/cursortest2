package app.cash.local.views.brand.profile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CheckedInSheetAnimationStage {
    public static final /* synthetic */ CheckedInSheetAnimationStage[] $VALUES;
    public static final CheckedInSheetAnimationStage AvatarSlid;
    public static final CheckedInSheetAnimationStage AvatarVisible;
    public static final CheckedInSheetAnimationStage ButtonVisible;
    public static final CheckedInSheetAnimationStage Loading;
    public static final CheckedInSheetAnimationStage Ready;
    public static final CheckedInSheetAnimationStage SubtitleVisible;
    public static final CheckedInSheetAnimationStage TitleVisible;

    static {
        CheckedInSheetAnimationStage checkedInSheetAnimationStage = new CheckedInSheetAnimationStage("Loading", 0);
        Loading = checkedInSheetAnimationStage;
        CheckedInSheetAnimationStage checkedInSheetAnimationStage2 = new CheckedInSheetAnimationStage("AvatarVisible", 1);
        AvatarVisible = checkedInSheetAnimationStage2;
        CheckedInSheetAnimationStage checkedInSheetAnimationStage3 = new CheckedInSheetAnimationStage("AvatarSlid", 2);
        AvatarSlid = checkedInSheetAnimationStage3;
        CheckedInSheetAnimationStage checkedInSheetAnimationStage4 = new CheckedInSheetAnimationStage("TitleVisible", 3);
        TitleVisible = checkedInSheetAnimationStage4;
        CheckedInSheetAnimationStage checkedInSheetAnimationStage5 = new CheckedInSheetAnimationStage("SubtitleVisible", 4);
        SubtitleVisible = checkedInSheetAnimationStage5;
        CheckedInSheetAnimationStage checkedInSheetAnimationStage6 = new CheckedInSheetAnimationStage("ButtonVisible", 5);
        ButtonVisible = checkedInSheetAnimationStage6;
        CheckedInSheetAnimationStage checkedInSheetAnimationStage7 = new CheckedInSheetAnimationStage("Ready", 6);
        Ready = checkedInSheetAnimationStage7;
        $VALUES = new CheckedInSheetAnimationStage[]{checkedInSheetAnimationStage, checkedInSheetAnimationStage2, checkedInSheetAnimationStage3, checkedInSheetAnimationStage4, checkedInSheetAnimationStage5, checkedInSheetAnimationStage6, checkedInSheetAnimationStage7};
    }

    public static CheckedInSheetAnimationStage valueOf(String str) {
        return (CheckedInSheetAnimationStage) Enum.valueOf(CheckedInSheetAnimationStage.class, str);
    }

    public static CheckedInSheetAnimationStage[] values() {
        return (CheckedInSheetAnimationStage[]) $VALUES.clone();
    }
}
