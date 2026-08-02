package com.squareup.cash.core.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BottomNavigationElementKeys {
    public static final /* synthetic */ BottomNavigationElementKeys[] $VALUES;
    public static final BottomNavigationElementKeys Background;
    public static final BottomNavigationElementKeys Bounds;

    static {
        BottomNavigationElementKeys bottomNavigationElementKeys = new BottomNavigationElementKeys("Bounds", 0);
        Bounds = bottomNavigationElementKeys;
        BottomNavigationElementKeys bottomNavigationElementKeys2 = new BottomNavigationElementKeys("Background", 1);
        Background = bottomNavigationElementKeys2;
        $VALUES = new BottomNavigationElementKeys[]{bottomNavigationElementKeys, bottomNavigationElementKeys2};
    }

    public static BottomNavigationElementKeys valueOf(String str) {
        return (BottomNavigationElementKeys) Enum.valueOf(BottomNavigationElementKeys.class, str);
    }

    public static BottomNavigationElementKeys[] values() {
        return (BottomNavigationElementKeys[]) $VALUES.clone();
    }
}
