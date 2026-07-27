package z4;

import y7.InterfaceC5255a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5278a {
    private static final /* synthetic */ InterfaceC5255a $ENTRIES;
    private static final /* synthetic */ EnumC5278a[] $VALUES;
    public static final EnumC5278a IMMEDIATE = new EnumC5278a("IMMEDIATE", 0);
    public static final EnumC5278a APP_STARTUP = new EnumC5278a("APP_STARTUP", 1);

    private static final /* synthetic */ EnumC5278a[] $values() {
        return new EnumC5278a[]{IMMEDIATE, APP_STARTUP};
    }

    static {
        EnumC5278a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = W2.e.d($values);
    }

    private EnumC5278a(String str, int i) {
    }

    public static InterfaceC5255a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5278a valueOf(String str) {
        return (EnumC5278a) Enum.valueOf(EnumC5278a.class, str);
    }

    public static EnumC5278a[] values() {
        return (EnumC5278a[]) $VALUES.clone();
    }
}
