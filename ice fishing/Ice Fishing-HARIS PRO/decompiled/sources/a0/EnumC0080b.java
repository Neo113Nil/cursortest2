package a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0080b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0080b f1662a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0080b f1663b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0080b f1664c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0080b f1665d;
    public static final /* synthetic */ EnumC0080b[] e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0080b EF0;

    static {
        EnumC0080b enumC0080b = new EnumC0080b("PENALTY_LOG", 0);
        EnumC0080b enumC0080b2 = new EnumC0080b("PENALTY_DEATH", 1);
        EnumC0080b enumC0080b3 = new EnumC0080b("DETECT_FRAGMENT_REUSE", 2);
        f1662a = enumC0080b3;
        EnumC0080b enumC0080b4 = new EnumC0080b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f1663b = enumC0080b4;
        EnumC0080b enumC0080b5 = new EnumC0080b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f1664c = enumC0080b5;
        EnumC0080b enumC0080b6 = new EnumC0080b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC0080b enumC0080b7 = new EnumC0080b("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC0080b enumC0080b8 = new EnumC0080b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC0080b enumC0080b9 = new EnumC0080b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f1665d = enumC0080b9;
        e = new EnumC0080b[]{enumC0080b, enumC0080b2, enumC0080b3, enumC0080b4, enumC0080b5, enumC0080b6, enumC0080b7, enumC0080b8, enumC0080b9};
    }

    public static EnumC0080b valueOf(String str) {
        return (EnumC0080b) Enum.valueOf(EnumC0080b.class, str);
    }

    public static EnumC0080b[] values() {
        return (EnumC0080b[]) e.clone();
    }
}
