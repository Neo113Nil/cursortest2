package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4513b {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4513b f37415n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC4513b f37416u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC4513b f37417v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC4513b f37418w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC4513b[] f37419x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4513b EF0;

    static {
        EnumC4513b enumC4513b = new EnumC4513b("PENALTY_LOG", 0);
        EnumC4513b enumC4513b2 = new EnumC4513b("PENALTY_DEATH", 1);
        EnumC4513b enumC4513b3 = new EnumC4513b("DETECT_FRAGMENT_REUSE", 2);
        f37415n = enumC4513b3;
        EnumC4513b enumC4513b4 = new EnumC4513b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f37416u = enumC4513b4;
        EnumC4513b enumC4513b5 = new EnumC4513b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f37417v = enumC4513b5;
        EnumC4513b enumC4513b6 = new EnumC4513b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC4513b enumC4513b7 = new EnumC4513b("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC4513b enumC4513b8 = new EnumC4513b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC4513b enumC4513b9 = new EnumC4513b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f37418w = enumC4513b9;
        f37419x = new EnumC4513b[]{enumC4513b, enumC4513b2, enumC4513b3, enumC4513b4, enumC4513b5, enumC4513b6, enumC4513b7, enumC4513b8, enumC4513b9};
    }

    public static EnumC4513b valueOf(String str) {
        return (EnumC4513b) Enum.valueOf(EnumC4513b.class, str);
    }

    public static EnumC4513b[] values() {
        return (EnumC4513b[]) f37419x.clone();
    }
}
