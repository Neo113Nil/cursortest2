package r4;

import com.bumptech.glide.e;
import s4.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4958a implements b {
    private static final /* synthetic */ C7.a $ENTRIES;
    private static final /* synthetic */ EnumC4958a[] $VALUES;
    public static final EnumC4958a USER = new EnumC4958a("USER", 0);
    public static final EnumC4958a SUBSCRIPTION = new EnumC4958a("SUBSCRIPTION", 1);

    private static final /* synthetic */ EnumC4958a[] $values() {
        return new EnumC4958a[]{USER, SUBSCRIPTION};
    }

    static {
        EnumC4958a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = e.b($values);
    }

    private EnumC4958a(String str, int i) {
    }

    public static C7.a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4958a valueOf(String str) {
        return (EnumC4958a) Enum.valueOf(EnumC4958a.class, str);
    }

    public static EnumC4958a[] values() {
        return (EnumC4958a[]) $VALUES.clone();
    }
}
