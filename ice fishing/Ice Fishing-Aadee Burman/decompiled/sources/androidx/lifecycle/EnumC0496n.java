package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0496n {
    private static final /* synthetic */ EnumC0496n[] $VALUES;
    public static final C0494l Companion;
    public static final EnumC0496n ON_ANY;
    public static final EnumC0496n ON_CREATE;
    public static final EnumC0496n ON_DESTROY;
    public static final EnumC0496n ON_PAUSE;
    public static final EnumC0496n ON_RESUME;
    public static final EnumC0496n ON_START;
    public static final EnumC0496n ON_STOP;

    static {
        EnumC0496n enumC0496n = new EnumC0496n("ON_CREATE", 0);
        ON_CREATE = enumC0496n;
        EnumC0496n enumC0496n2 = new EnumC0496n("ON_START", 1);
        ON_START = enumC0496n2;
        EnumC0496n enumC0496n3 = new EnumC0496n("ON_RESUME", 2);
        ON_RESUME = enumC0496n3;
        EnumC0496n enumC0496n4 = new EnumC0496n("ON_PAUSE", 3);
        ON_PAUSE = enumC0496n4;
        EnumC0496n enumC0496n5 = new EnumC0496n("ON_STOP", 4);
        ON_STOP = enumC0496n5;
        EnumC0496n enumC0496n6 = new EnumC0496n("ON_DESTROY", 5);
        ON_DESTROY = enumC0496n6;
        EnumC0496n enumC0496n7 = new EnumC0496n("ON_ANY", 6);
        ON_ANY = enumC0496n7;
        $VALUES = new EnumC0496n[]{enumC0496n, enumC0496n2, enumC0496n3, enumC0496n4, enumC0496n5, enumC0496n6, enumC0496n7};
        Companion = new C0494l();
    }

    public static EnumC0496n valueOf(String str) {
        return (EnumC0496n) Enum.valueOf(EnumC0496n.class, str);
    }

    public static EnumC0496n[] values() {
        return (EnumC0496n[]) $VALUES.clone();
    }

    public final EnumC0497o a() {
        switch (AbstractC0495m.f5163a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0497o.f5166v;
            case 3:
            case 4:
                return EnumC0497o.f5167w;
            case 5:
                return EnumC0497o.f5168x;
            case 6:
                return EnumC0497o.f5164n;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
