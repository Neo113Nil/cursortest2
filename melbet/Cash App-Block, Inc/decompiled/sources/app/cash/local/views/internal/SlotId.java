package app.cash.local.views.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SlotId {
    public static final /* synthetic */ SlotId[] $VALUES;
    public static final SlotId Content;
    public static final SlotId Separators;

    static {
        SlotId slotId = new SlotId("Content", 0);
        Content = slotId;
        SlotId slotId2 = new SlotId("Separators", 1);
        Separators = slotId2;
        $VALUES = new SlotId[]{slotId, slotId2};
    }

    public static SlotId valueOf(String str) {
        return (SlotId) Enum.valueOf(SlotId.class, str);
    }

    public static SlotId[] values() {
        return (SlotId[]) $VALUES.clone();
    }
}
