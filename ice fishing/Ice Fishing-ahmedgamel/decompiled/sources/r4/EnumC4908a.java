package r4;

import s4.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4908a implements b {
    private static final /* synthetic */ C7.a $ENTRIES;
    private static final /* synthetic */ EnumC4908a[] $VALUES;
    public static final EnumC4908a USER = new EnumC4908a("USER", 0);
    public static final EnumC4908a SUBSCRIPTION = new EnumC4908a("SUBSCRIPTION", 1);

    private static final /* synthetic */ EnumC4908a[] $values() {
        return new EnumC4908a[]{USER, SUBSCRIPTION};
    }

    static {
        EnumC4908a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = X2.a.h($values);
    }

    private EnumC4908a(String str, int i) {
    }

    public static C7.a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4908a valueOf(String str) {
        return (EnumC4908a) Enum.valueOf(EnumC4908a.class, str);
    }

    public static EnumC4908a[] values() {
        return (EnumC4908a[]) $VALUES.clone();
    }
}
