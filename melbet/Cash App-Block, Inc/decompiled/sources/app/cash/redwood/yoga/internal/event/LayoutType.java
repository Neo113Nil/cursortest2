package app.cash.redwood.yoga.internal.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LayoutType {
    public static final /* synthetic */ LayoutType[] $VALUES = {new LayoutType("kLayout", 0), new LayoutType("kMeasure", 1), new LayoutType("kCachedLayout", 2), new LayoutType("kCachedMeasure", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    LayoutType EF6;

    public static LayoutType valueOf(String str) {
        return (LayoutType) Enum.valueOf(LayoutType.class, str);
    }

    public static LayoutType[] values() {
        return (LayoutType[]) $VALUES.clone();
    }
}
