package androidx.compose.material;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ModalBottomSheetValue {
    public static final /* synthetic */ ModalBottomSheetValue[] $VALUES;
    public static final ModalBottomSheetValue Expanded;
    public static final ModalBottomSheetValue HalfExpanded;
    public static final ModalBottomSheetValue Hidden;

    static {
        ModalBottomSheetValue modalBottomSheetValue = new ModalBottomSheetValue("Hidden", 0);
        Hidden = modalBottomSheetValue;
        ModalBottomSheetValue modalBottomSheetValue2 = new ModalBottomSheetValue("Expanded", 1);
        Expanded = modalBottomSheetValue2;
        ModalBottomSheetValue modalBottomSheetValue3 = new ModalBottomSheetValue("HalfExpanded", 2);
        HalfExpanded = modalBottomSheetValue3;
        $VALUES = new ModalBottomSheetValue[]{modalBottomSheetValue, modalBottomSheetValue2, modalBottomSheetValue3};
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) $VALUES.clone();
    }
}
