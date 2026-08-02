package app.cash.local.viewmodels.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AddRemoveIcon {
    public static final /* synthetic */ AddRemoveIcon[] $VALUES;
    public static final AddRemoveIcon CHECK;
    public static final AddRemoveIcon LOADING;
    public static final AddRemoveIcon PLUS;

    static {
        AddRemoveIcon addRemoveIcon = new AddRemoveIcon("PLUS", 0);
        PLUS = addRemoveIcon;
        AddRemoveIcon addRemoveIcon2 = new AddRemoveIcon("CHECK", 1);
        CHECK = addRemoveIcon2;
        AddRemoveIcon addRemoveIcon3 = new AddRemoveIcon("LOADING", 2);
        LOADING = addRemoveIcon3;
        $VALUES = new AddRemoveIcon[]{addRemoveIcon, addRemoveIcon2, addRemoveIcon3};
    }

    public static AddRemoveIcon valueOf(String str) {
        return (AddRemoveIcon) Enum.valueOf(AddRemoveIcon.class, str);
    }

    public static AddRemoveIcon[] values() {
        return (AddRemoveIcon[]) $VALUES.clone();
    }
}
