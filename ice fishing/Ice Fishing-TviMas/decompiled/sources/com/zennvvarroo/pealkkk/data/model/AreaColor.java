package com.zennvvarroo.pealkkk.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageArea.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/zennvvarroo/pealkkk/data/model/AreaColor;", "", "(Ljava/lang/String;I)V", "CYAN", "BLUE", "GREEN", "ORANGE", "YELLOW", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AreaColor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AreaColor[] $VALUES;
    public static final AreaColor CYAN = new AreaColor("CYAN", 0);
    public static final AreaColor BLUE = new AreaColor("BLUE", 1);
    public static final AreaColor GREEN = new AreaColor("GREEN", 2);
    public static final AreaColor ORANGE = new AreaColor("ORANGE", 3);
    public static final AreaColor YELLOW = new AreaColor("YELLOW", 4);

    private static final /* synthetic */ AreaColor[] $values() {
        return new AreaColor[]{CYAN, BLUE, GREEN, ORANGE, YELLOW};
    }

    public static EnumEntries<AreaColor> getEntries() {
        return $ENTRIES;
    }

    public static AreaColor valueOf(String str) {
        return (AreaColor) Enum.valueOf(AreaColor.class, str);
    }

    public static AreaColor[] values() {
        return (AreaColor[]) $VALUES.clone();
    }

    static {
        AreaColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AreaColor(String str, int i) {
    }
}
