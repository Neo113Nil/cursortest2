package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4496b {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4496b f37339n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC4496b f37340u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC4496b f37341v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC4496b f37342w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC4496b[] f37343x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4496b EF0;

    static {
        EnumC4496b enumC4496b = new EnumC4496b("PENALTY_LOG", 0);
        EnumC4496b enumC4496b2 = new EnumC4496b("PENALTY_DEATH", 1);
        EnumC4496b enumC4496b3 = new EnumC4496b("DETECT_FRAGMENT_REUSE", 2);
        f37339n = enumC4496b3;
        EnumC4496b enumC4496b4 = new EnumC4496b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f37340u = enumC4496b4;
        EnumC4496b enumC4496b5 = new EnumC4496b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f37341v = enumC4496b5;
        EnumC4496b enumC4496b6 = new EnumC4496b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC4496b enumC4496b7 = new EnumC4496b("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC4496b enumC4496b8 = new EnumC4496b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC4496b enumC4496b9 = new EnumC4496b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f37342w = enumC4496b9;
        f37343x = new EnumC4496b[]{enumC4496b, enumC4496b2, enumC4496b3, enumC4496b4, enumC4496b5, enumC4496b6, enumC4496b7, enumC4496b8, enumC4496b9};
    }

    public static EnumC4496b valueOf(String str) {
        return (EnumC4496b) Enum.valueOf(EnumC4496b.class, str);
    }

    public static EnumC4496b[] values() {
        return (EnumC4496b[]) f37343x.clone();
    }
}
