package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4487b {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4487b f37543n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC4487b f37544u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC4487b f37545v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC4487b f37546w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC4487b[] f37547x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4487b EF0;

    static {
        EnumC4487b enumC4487b = new EnumC4487b("PENALTY_LOG", 0);
        EnumC4487b enumC4487b2 = new EnumC4487b("PENALTY_DEATH", 1);
        EnumC4487b enumC4487b3 = new EnumC4487b("DETECT_FRAGMENT_REUSE", 2);
        f37543n = enumC4487b3;
        EnumC4487b enumC4487b4 = new EnumC4487b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f37544u = enumC4487b4;
        EnumC4487b enumC4487b5 = new EnumC4487b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f37545v = enumC4487b5;
        EnumC4487b enumC4487b6 = new EnumC4487b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC4487b enumC4487b7 = new EnumC4487b("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC4487b enumC4487b8 = new EnumC4487b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC4487b enumC4487b9 = new EnumC4487b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f37546w = enumC4487b9;
        f37547x = new EnumC4487b[]{enumC4487b, enumC4487b2, enumC4487b3, enumC4487b4, enumC4487b5, enumC4487b6, enumC4487b7, enumC4487b8, enumC4487b9};
    }

    public static EnumC4487b valueOf(String str) {
        return (EnumC4487b) Enum.valueOf(EnumC4487b.class, str);
    }

    public static EnumC4487b[] values() {
        return (EnumC4487b[]) f37547x.clone();
    }
}
