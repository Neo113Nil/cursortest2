package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FlowLayoutOverflow$OverflowType {
    public static final /* synthetic */ FlowLayoutOverflow$OverflowType[] $VALUES;
    public static final FlowLayoutOverflow$OverflowType Clip;

    /* JADX INFO: Fake field, exist only in values array */
    FlowLayoutOverflow$OverflowType EF0;

    static {
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = new FlowLayoutOverflow$OverflowType("Visible", 0);
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = new FlowLayoutOverflow$OverflowType("Clip", 1);
        Clip = flowLayoutOverflow$OverflowType2;
        $VALUES = new FlowLayoutOverflow$OverflowType[]{flowLayoutOverflow$OverflowType, flowLayoutOverflow$OverflowType2, new FlowLayoutOverflow$OverflowType("ExpandIndicator", 2), new FlowLayoutOverflow$OverflowType("ExpandOrCollapseIndicator", 3)};
    }

    public static FlowLayoutOverflow$OverflowType valueOf(String str) {
        return (FlowLayoutOverflow$OverflowType) Enum.valueOf(FlowLayoutOverflow$OverflowType.class, str);
    }

    public static FlowLayoutOverflow$OverflowType[] values() {
        return (FlowLayoutOverflow$OverflowType[]) $VALUES.clone();
    }
}
